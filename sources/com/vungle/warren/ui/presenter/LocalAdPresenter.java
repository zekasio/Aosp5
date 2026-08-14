package com.vungle.warren.ui.presenter;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Scheduler;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class LocalAdPresenter implements LocalAdContract.LocalPresenter, WebViewAPI.WebClientErrorHandler {
    static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    static final String EXTRA_IN_POST = "in_post_roll";
    static final String EXTRA_IS_MUTED = "is_muted_mode";
    static final String EXTRA_REPORT = "saved_report";
    static final String EXTRA_VIDEO_POSITION = "videoPosition";
    static final String HTTPS_VUNGLE_COM_PRIVACY = "https://vungle.com/privacy/";
    public static final int INCENTIVIZED_TRESHOLD = 75;
    static final String TAG = "LocalAdPresenter";
    private LocalAdContract.LocalView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private int duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private boolean inPost;
    private boolean muted;
    private Placement placement;
    private int progress;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private boolean userExitEnabled;
    private int videoPosition;
    private final WebViewAPI webViewAPI;
    private final Map<String, Cookie> cookies = new HashMap();
    private String dialogTitle = "Are you sure?";
    private String dialogBody = "If you exit now, you will not get your reward";
    private String dialogContinue = "Continue";
    private String dialogClose = HTTP.CONN_CLOSE;
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private LinkedList<Advertisement.Checkpoint> checkpointList = new LinkedList<>();
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.1
        boolean errorHappened = false;

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onSaved() {
        }

        @Override // com.vungle.warren.persistence.Repository.SaveCallback
        public void onError(Exception exc) {
            if (this.errorHappened) {
                return;
            }
            this.errorHappened = true;
            LocalAdPresenter.this.makeBusError(26);
            VungleLogger.error("LocalAdPresenter#onError", new VungleException(26).getLocalizedMessage());
            LocalAdPresenter.this.closeAndReport();
        }
    };
    private AtomicBoolean busy = new AtomicBoolean(false);

    public LocalAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, String[] strArr) {
        this.advertisement = advertisement;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webViewAPI = webViewAPI;
        this.repository = repository;
        this.assetDir = file;
        this.impressionUrls = strArr;
        if (advertisement.getCheckpoints() != null) {
            this.checkpointList.addAll(advertisement.getCheckpoints());
            Collections.sort(this.checkpointList);
        }
        loadData(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    private void reportError(String str) {
        this.report.recordError(str);
        this.repository.save(this.report, this.repoCallback);
        makeBusError(27);
        if (!this.inPost && this.advertisement.hasPostroll()) {
            playPost();
        } else {
            makeBusError(10);
            this.adView.close();
        }
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            int i = Integer.parseInt(str2);
            this.duration = i;
            this.report.setVideoLength(i);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        str.hashCode();
        switch (str) {
            case "unmute":
            case "mute":
            case "video_close":
                this.analytics.ping(this.advertisement.getTpatUrls(str));
                break;
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.webViewAPI.notifyPropertiesChange(true);
        this.adView.refreshDialogIfVisible();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attach(com.vungle.warren.ui.contract.LocalAdContract.LocalView r6, com.vungle.warren.ui.state.OptionsState r7) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isDestroying
            r1 = 0
            r0.set(r1)
            r5.adView = r6
            r6.setPresenter(r5)
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r0 = r5.bus
            if (r0 == 0) goto L20
            com.vungle.warren.model.Advertisement r2 = r5.advertisement
            java.lang.String r2 = r2.getCreativeId()
            com.vungle.warren.model.Placement r3 = r5.placement
            java.lang.String r3 = r3.getId()
            java.lang.String r4 = "attach"
            r0.onNext(r4, r2, r3)
        L20:
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            com.vungle.warren.AdConfig r0 = r0.getAdConfig()
            int r0 = r0.getSettings()
            r2 = 1
            if (r0 <= 0) goto L3d
            r3 = r0 & 1
            if (r3 != r2) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = 0
        L34:
            r5.muted = r3
            r3 = 2
            r0 = r0 & r3
            if (r0 != r3) goto L3b
            r1 = 1
        L3b:
            r5.userExitEnabled = r1
        L3d:
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            com.vungle.warren.AdConfig r0 = r0.getAdConfig()
            int r0 = r0.getAdOrientation()
            r1 = 3
            r3 = 6
            r4 = 7
            if (r0 != r1) goto L58
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            int r0 = r0.getOrientation()
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L60
            r3 = -1
            goto L60
        L58:
            if (r0 != 0) goto L5c
        L5a:
            r3 = 7
            goto L60
        L5c:
            if (r0 != r2) goto L5f
            goto L60
        L5f:
            r3 = 4
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Requested Orientation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LocalAdPresenter"
            android.util.Log.d(r1, r0)
            r6.setOrientation(r3)
            r5.prepare(r7)
            com.vungle.warren.SessionTracker r6 = com.vungle.warren.SessionTracker.getInstance()
            com.vungle.warren.model.SessionData$Builder r7 = new com.vungle.warren.model.SessionData$Builder
            r7.<init>()
            com.vungle.warren.session.SessionEvent r0 = com.vungle.warren.session.SessionEvent.PLAY_AD
            com.vungle.warren.model.SessionData$Builder r7 = r7.setEvent(r0)
            com.vungle.warren.session.SessionAttribute r0 = com.vungle.warren.session.SessionAttribute.SUCCESS
            com.vungle.warren.model.SessionData$Builder r7 = r7.addData(r0, r2)
            com.vungle.warren.session.SessionAttribute r0 = com.vungle.warren.session.SessionAttribute.EVENT_ID
            com.vungle.warren.model.Advertisement r1 = r5.advertisement
            java.lang.String r1 = r1.getId()
            com.vungle.warren.model.SessionData$Builder r7 = r7.addData(r0, r1)
            com.vungle.warren.model.SessionData r7 = r7.build()
            r6.trackEvent(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.LocalAdPresenter.attach(com.vungle.warren.ui.contract.LocalAdContract$LocalView, com.vungle.warren.ui.state.OptionsState):void");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(int i) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i);
        this.adView.destroyAdView(0L);
    }

    private void playPost() {
        final File file = new File(new File(this.assetDir.getPath()).getPath() + File.separator + "index.html");
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.2
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z) {
                if (z) {
                    LocalAdPresenter.this.adView.showWebsite(Advertisement.FILE_SCHEME + file.getPath());
                    LocalAdPresenter.this.analytics.ping(LocalAdPresenter.this.advertisement.getTpatUrls(AnalyticsEvent.Ad.postrollView));
                    LocalAdPresenter.this.inPost = true;
                    return;
                }
                LocalAdPresenter.this.makeBusError(27);
                LocalAdPresenter.this.makeBusError(10);
                VungleLogger.error("LocalAdPresenter#playPost", "Error Rendering Postroll");
                LocalAdPresenter.this.closeAndReport();
            }
        });
    }

    private void prepare(OptionsState optionsState) {
        restoreFromSave(optionsState);
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        String string = cookie == null ? null : cookie.getString("userID");
        if (this.report == null) {
            Report report = new Report(this.advertisement, this.placement, System.currentTimeMillis(), string);
            this.report = report;
            report.setTtDownload(this.advertisement.getTtDownload());
            this.repository.save(this.report, this.repoCallback);
        }
        if (this.durationRecorder == null) {
            this.durationRecorder = new DurationRecorder(this.report, this.repository, this.repoCallback);
        }
        this.webViewAPI.setErrorHandler(this);
        this.adView.showCTAOverlay(this.advertisement.isCtaOverlayEnabled(), this.advertisement.getCtaClickArea());
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(TJAdUnitConstants.String.VIDEO_START, null, this.placement.getId());
        }
    }

    private boolean needShowGDPR(Cookie cookie) {
        return cookie != null && cookie.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie.getString("consent_status"));
    }

    private void showGDPR(final Cookie cookie) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String str;
                if (i == -2) {
                    str = "opted_out";
                } else if (i != -1) {
                    str = Gdpr.OPTED_OUT_BY_TIMEOUT;
                } else {
                    str = "opted_in";
                }
                cookie.putValue("consent_status", str);
                cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "vungle_modal");
                LocalAdPresenter.this.repository.save(cookie, null);
                LocalAdPresenter.this.start();
            }
        };
        cookie.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
        cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        cookie.putValue("consent_source", "vungle_modal");
        this.repository.save(cookie, this.repoCallback);
        showDialog(cookie.getString("consent_title"), cookie.getString("consent_message"), cookie.getString("button_accept"), cookie.getString("button_deny"), onClickListener);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (this.inPost) {
            closeAndReport();
            return true;
        }
        if (!this.userExitEnabled) {
            return false;
        }
        if (this.placement.isIncentivized() && this.progress <= 75) {
            showIncetivizedDialog();
            return false;
        }
        reportAction(AnalyticsEvent.Ad.videoClose, null);
        if (this.advertisement.hasPostroll()) {
            playPost();
            return false;
        }
        closeAndReport();
        return true;
    }

    private void showIncetivizedDialog() {
        String string = this.dialogTitle;
        String string2 = this.dialogBody;
        String string3 = this.dialogContinue;
        String string4 = this.dialogClose;
        Cookie cookie = this.cookies.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            string = cookie.getString(TJAdUnitConstants.String.TITLE);
            if (TextUtils.isEmpty(string)) {
                string = this.dialogTitle;
            }
            string2 = cookie.getString("body");
            if (TextUtils.isEmpty(string2)) {
                string2 = this.dialogBody;
            }
            string3 = cookie.getString("continue");
            if (TextUtils.isEmpty(string3)) {
                string3 = this.dialogContinue;
            }
            string4 = cookie.getString("close");
            if (TextUtils.isEmpty(string4)) {
                string4 = this.dialogClose;
            }
        }
        showDialog(string, string2, string3, string4, new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2) {
                    LocalAdPresenter.this.reportAction(AnalyticsEvent.Ad.videoClose, null);
                    LocalAdPresenter.this.continueWithPostroll();
                }
            }
        });
    }

    private void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.adView.pauseVideo();
        this.adView.showDialog(str, str2, str3, str4, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueWithPostroll() {
        if (this.advertisement.hasPostroll()) {
            playPost();
        } else {
            closeAndReport();
        }
    }

    private boolean isWebPageBlank() {
        String websiteUrl = this.adView.getWebsiteUrl();
        return TextUtils.isEmpty(websiteUrl) || "about:blank".equalsIgnoreCase(websiteUrl);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        this.durationRecorder.start();
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(31);
            VungleLogger.error("LocalAdPresenter#start", new VungleException(31).getLocalizedMessage());
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        Cookie cookie = this.cookies.get(Cookie.CONSENT_COOKIE);
        if (needShowGDPR(cookie)) {
            showGDPR(cookie);
            return;
        }
        if (this.inPost) {
            if (isWebPageBlank()) {
                playPost();
                return;
            }
            return;
        }
        if (this.adView.isVideoPlaying() || this.adView.isDialogVisible()) {
            return;
        }
        this.adView.playVideo(new File(this.assetDir.getPath() + File.separator + Advertisement.KEY_VIDEO), this.muted, this.videoPosition);
        int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
        if (showCloseDelay > 0) {
            this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.5
                @Override // java.lang.Runnable
                public void run() {
                    LocalAdPresenter.this.userExitEnabled = true;
                    if (LocalAdPresenter.this.inPost) {
                        return;
                    }
                    LocalAdPresenter.this.adView.showCloseButton();
                }
            }, showCloseDelay);
        } else {
            this.userExitEnabled = true;
            this.adView.showCloseButton();
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(int i) {
        this.durationRecorder.stop();
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.adView.pauseWeb();
        if (this.adView.isVideoPlaying()) {
            this.videoPosition = this.adView.getVideoPosition();
            this.adView.pauseVideo();
        }
        if (!z && z2) {
            if (this.isDestroying.getAndSet(true)) {
                return;
            }
            reportAction("close", null);
            this.scheduler.cancelAll();
            AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
            if (eventListener != null) {
                eventListener.onNext("end", this.report.isCTAClicked() ? "isCTAClicked" : null, this.placement.getId());
                return;
            }
            return;
        }
        if (this.inPost || z2) {
            this.adView.showWebsite("about:blank");
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onProgressUpdate(int i, float f) {
        this.progress = (int) ((i / f) * 100.0f);
        this.videoPosition = i;
        this.durationRecorder.update();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("percentViewed:" + this.progress, null, this.placement.getId());
        }
        AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
        if (eventListener2 != null && i > 0 && !this.adViewed) {
            this.adViewed = true;
            eventListener2.onNext("adViewed", null, this.placement.getId());
            String[] strArr = this.impressionUrls;
            if (strArr != null) {
                this.analytics.ping(strArr);
            }
        }
        reportAction("video_viewed", String.format(Locale.ENGLISH, "%d", Integer.valueOf(i)));
        if (this.progress == 100) {
            if (this.checkpointList.peekLast() != null && this.checkpointList.peekLast().getPercentage() == 100) {
                this.analytics.ping(this.checkpointList.pollLast().getUrls());
            }
            continueWithPostroll();
        }
        this.report.recordProgress(this.videoPosition);
        this.repository.save(this.report, this.repoCallback);
        while (this.checkpointList.peek() != null && this.progress > this.checkpointList.peek().getPercentage()) {
            this.analytics.ping(this.checkpointList.poll().getUrls());
        }
        Cookie cookie = this.cookies.get(Cookie.CONFIG_COOKIE);
        if (!this.placement.isIncentivized() || this.progress <= 75 || cookie == null || !cookie.getBoolean("isReportIncentivizedEnabled").booleanValue() || this.sendReportIncentivized.getAndSet(true)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("placement_reference_id", new JsonPrimitive(this.placement.getId()));
        jsonObject.add("app_id", new JsonPrimitive(this.advertisement.getAppID()));
        jsonObject.add(ReportDBAdapter.ReportColumns.COLUMN_AD_START_TIME, new JsonPrimitive(Long.valueOf(this.report.getAdStartTime())));
        jsonObject.add("user", new JsonPrimitive(this.report.getUserID()));
        this.analytics.ri(jsonObject);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onVideoStart(int i, float f) {
        reportAction("videoLength", String.format(Locale.ENGLISH, "%d", Integer.valueOf((int) f)));
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onMute(boolean z) {
        this.muted = z;
        if (z) {
            reportAction(AnalyticsEvent.Ad.mute, "true");
        } else {
            reportAction(AnalyticsEvent.Ad.unmute, TJAdUnitConstants.String.FALSE);
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onDownload() {
        download();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public boolean onMediaError(String str) {
        reportError(str);
        VungleLogger.error("LocalAdPresenter#onMediaError", "Media Error: " + str);
        return false;
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalPresenter
    public void onPrivacy() {
        this.adView.open(null, HTTPS_VUNGLE_COM_PRIVACY, new PresenterAppLeftCallback(this.bus, this.placement), null);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        Report report = this.report;
        optionsState.put(EXTRA_REPORT, report == null ? null : report.getId());
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
        optionsState.put(EXTRA_IN_POST, this.inPost);
        optionsState.put(EXTRA_IS_MUTED, this.muted);
        LocalAdContract.LocalView localView = this.adView;
        optionsState.put(EXTRA_VIDEO_POSITION, (localView == null || !localView.isVideoPlaying()) ? this.videoPosition : this.adView.getVideoPosition());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        if (optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false)) {
            this.sendReportIncentivized.set(true);
        }
        this.inPost = optionsState.getBoolean(EXTRA_IN_POST, this.inPost);
        this.muted = optionsState.getBoolean(EXTRA_IS_MUTED, this.muted);
        this.videoPosition = optionsState.getInt(EXTRA_VIDEO_POSITION, this.videoPosition).intValue();
    }

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
        str.hashCode();
        switch (str) {
            case "privacy":
                return;
            case "close":
                closeAndReport();
                return;
            case "download":
                download();
                closeAndReport();
                return;
            default:
                VungleLogger.error("LocalAdPresenter#onMraidAction", "Unknown MRAID Command");
                throw new IllegalArgumentException("Unknown action " + str);
        }
    }

    private void download() {
        reportAction("cta", "");
        try {
            this.analytics.ping(this.advertisement.getTpatUrls(AnalyticsEvent.Ad.postrollClick));
            this.analytics.ping(this.advertisement.getTpatUrls(AnalyticsEvent.Ad.clickUrl));
            this.analytics.ping(this.advertisement.getTpatUrls(AnalyticsEvent.Ad.videoClick));
            this.analytics.ping(new String[]{this.advertisement.getCTAURL(true)});
            reportAction(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION, null);
            String ctaurl = this.advertisement.getCTAURL(false);
            if (ctaurl == null || ctaurl.isEmpty()) {
                Log.e(TAG, "CTA destination URL is not configured properly");
            } else {
                this.adView.open(this.advertisement.getDeeplinkUrl(), ctaurl, new PresenterAppLeftCallback(this.bus, this.placement), new PresenterAdOpenCallback() { // from class: com.vungle.warren.ui.presenter.LocalAdPresenter.6
                    @Override // com.vungle.warren.ui.PresenterAdOpenCallback
                    public void onAdOpenType(PresenterAdOpenCallback.AdOpenType adOpenType) {
                        if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                            LocalAdPresenter.this.reportAction("deeplinkSuccess", null);
                        }
                    }
                });
            }
            AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
            if (eventListener != null) {
                eventListener.onNext("open", "adClick", this.placement.getId());
            }
        } catch (ActivityNotFoundException unused) {
            Log.e(TAG, "Unable to find destination activity");
            VungleLogger.error("LocalAdPresenter#download", "Download - Activity Not Found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAndReport() {
        if (this.busy.get()) {
            Log.w(TAG, "Busy with closing");
            return;
        }
        this.busy.set(true);
        reportAction("close", null);
        this.scheduler.cancelAll();
        this.adView.close();
    }

    private void loadData(OptionsState optionsState) {
        this.cookies.put(Cookie.INCENTIVIZED_TEXT_COOKIE, (Cookie) this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONSENT_COOKIE, (Cookie) this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookies.put(Cookie.CONFIG_COOKIE, (Cookie) this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
        if (optionsState != null) {
            String string = optionsState.getString(EXTRA_REPORT);
            Report report = TextUtils.isEmpty(string) ? null : (Report) this.repository.load(string, Report.class).get();
            if (report != null) {
                this.report = report;
            }
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z) {
        Report report = this.report;
        if (report != null) {
            report.recordError(str);
            this.repository.save(this.report, this.repoCallback);
            VungleLogger.error("LocalAdPresenteronReceivedError", str);
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z) {
        handleWebViewException(31);
        VungleLogger.error("LocalAdPresenter#onWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException(32);
        VungleLogger.error("LocalAdPresenter#onRenderProcessUnresponsive", new VungleException(32).getLocalizedMessage());
    }

    private void handleWebViewException(int i) {
        LocalAdContract.LocalView localView = this.adView;
        if (localView != null) {
            localView.removeWebView();
        }
        reportErrorAndCloseAd(i);
    }

    private void reportErrorAndCloseAd(int i) {
        makeBusError(i);
        VungleLogger.error(TAG, "WebViewException: " + new VungleException(i).getLocalizedMessage());
        closeAndReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(int i) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(new VungleException(i), this.placement.getId());
        }
    }
}
