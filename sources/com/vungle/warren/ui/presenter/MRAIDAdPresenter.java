package com.vungle.warren.ui.presenter;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.ClickCoordinateTracker;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.omsdk.OMTracker;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.DurationRecorder;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.PresenterAppLeftCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.WebViewAPI;
import com.vungle.warren.utility.AsyncFileUtils;
import com.vungle.warren.utility.Scheduler;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class MRAIDAdPresenter implements WebAdContract.WebAdPresenter, WebViewAPI.MRAIDDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    private static final String ACTION_WITH_VALUE = "actionWithValue";
    private static final String CLOSE = "close";
    private static final String CONSENT_ACTION = "consentAction";
    private static final String ERROR = "error";
    private static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    private static final String EXTRA_REPORT = "saved_report";
    private static final String OPEN = "open";
    private static final String OPEN_DEEPLINK_SUCCESS = "deeplinkSuccess";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    private static final String OPEN_PRIVACY = "openPrivacy";
    private static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "com.vungle.warren.ui.presenter.MRAIDAdPresenter";
    private static final String TPAT = "tpat";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    private static final String VIDEO_VIEWED = "videoViewed";
    private WebAdContract.WebAdView adView;
    private boolean adViewed;
    private Advertisement advertisement;
    private final AdAnalytics analytics;
    private File assetDir;
    private boolean backEnabled;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private ClickCoordinateTracker clickCoordinateTracker;
    private long duration;
    private DurationRecorder durationRecorder;
    private AsyncFileUtils.ExistenceOperation fileExistenceOperation;
    private final String[] impressionUrls;
    private final OMTracker omTracker;
    private final Placement placement;
    private Report report;
    private Repository repository;
    private final Scheduler scheduler;
    private WebViewAPI webClient;
    private Map<String, Cookie> cookieMap = new HashMap();
    private AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private AtomicBoolean isDestroying = new AtomicBoolean(false);
    private Repository.SaveCallback repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.1
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
            VungleException vungleException = new VungleException(26);
            MRAIDAdPresenter.this.makeBusError(vungleException);
            VungleLogger.error("MRAIDAdPresenter", vungleException.getLocalizedMessage());
            MRAIDAdPresenter.this.closeView();
        }
    };

    public MRAIDAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, WebViewAPI webViewAPI, OptionsState optionsState, File file, OMTracker oMTracker, String[] strArr) {
        this.advertisement = advertisement;
        this.repository = repository;
        this.placement = placement;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.webClient = webViewAPI;
        this.assetDir = file;
        this.omTracker = oMTracker;
        this.impressionUrls = strArr;
        loadData(optionsState);
        if (advertisement.isClickCoordinatesTrackingEnabled()) {
            this.clickCoordinateTracker = new ClickCoordinateTracker(advertisement, adAnalytics);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    public void reportAction(String str, String str2) {
        if (str.equals("videoLength")) {
            long j = Long.parseLong(str2);
            this.duration = j;
            this.report.setVideoLength(j);
            this.repository.save(this.report, this.repoCallback);
            return;
        }
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.adView.updateWindow();
        this.webClient.notifyPropertiesChange(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attach(com.vungle.warren.ui.contract.WebAdContract.WebAdView r6, com.vungle.warren.ui.state.OptionsState r7) {
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
            com.vungle.warren.omsdk.OMTracker r0 = r5.omTracker
            r0.start()
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            com.vungle.warren.AdConfig r0 = r0.getAdConfig()
            int r0 = r0.getSettings()
            r2 = 1
            if (r0 <= 0) goto L39
            r3 = 2
            r0 = r0 & r3
            if (r0 != r3) goto L37
            r1 = 1
        L37:
            r5.backEnabled = r1
        L39:
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            com.vungle.warren.AdConfig r0 = r0.getAdConfig()
            int r0 = r0.getAdOrientation()
            r1 = 3
            r3 = 6
            r4 = 7
            if (r0 != r1) goto L54
            com.vungle.warren.model.Advertisement r0 = r5.advertisement
            int r0 = r0.getOrientation()
            if (r0 == 0) goto L56
            if (r0 == r2) goto L5c
            r3 = -1
            goto L5c
        L54:
            if (r0 != 0) goto L58
        L56:
            r3 = 7
            goto L5c
        L58:
            if (r0 != r2) goto L5b
            goto L5c
        L5b:
            r3 = 4
        L5c:
            java.lang.String r0 = com.vungle.warren.ui.presenter.MRAIDAdPresenter.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Requested Orientation "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.MRAIDAdPresenter.attach(com.vungle.warren.ui.contract.WebAdContract$WebAdView, com.vungle.warren.ui.state.OptionsState):void");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(int i) {
        AsyncFileUtils.ExistenceOperation existenceOperation = this.fileExistenceOperation;
        if (existenceOperation != null) {
            existenceOperation.cancel();
        }
        stop(i);
        this.webClient.setWebViewObserver(null);
        this.adView.destroyAdView(this.omTracker.stop());
    }

    private void prepare(OptionsState optionsState) {
        this.webClient.setMRAIDDelegate(this);
        this.webClient.setErrorHandler(this);
        loadMraid(new File(this.assetDir.getPath() + File.separator + Advertisement.KEY_TEMPLATE));
        Cookie cookie = this.cookieMap.get(Cookie.INCENTIVIZED_TEXT_COOKIE);
        if (cookie != null) {
            this.advertisement.setIncentivizedText(cookie.getString(TJAdUnitConstants.String.TITLE), cookie.getString("body"), cookie.getString("continue"), cookie.getString("close"));
        }
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
        Cookie cookie2 = this.cookieMap.get(Cookie.CONSENT_COOKIE);
        if (cookie2 != null) {
            boolean z = cookie2.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie2.getString("consent_status"));
            this.webClient.setConsentStatus(z, cookie2.getString("consent_title"), cookie2.getString("consent_message"), cookie2.getString("button_accept"), cookie2.getString("button_deny"));
            if (z) {
                cookie2.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
                cookie2.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie2.putValue("consent_source", "vungle_modal");
                this.repository.save(cookie2, this.repoCallback);
            }
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(this.placement.isIncentivized());
        if (showCloseDelay > 0) {
            this.scheduler.schedule(new Runnable() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.2
                @Override // java.lang.Runnable
                public void run() {
                    MRAIDAdPresenter.this.backEnabled = true;
                }
            }, showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        this.adView.updateWindow();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(TJAdUnitConstants.String.VIDEO_START, null, this.placement.getId());
        }
    }

    private void loadMraid(File file) {
        final File file2 = new File(new File(file.getParent()).getPath() + File.separator + "index.html");
        this.fileExistenceOperation = AsyncFileUtils.isFileExistAsync(file2, new AsyncFileUtils.FileExistCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.3
            @Override // com.vungle.warren.utility.AsyncFileUtils.FileExistCallback
            public void status(boolean z) {
                if (!z) {
                    MRAIDAdPresenter.this.makeBusError(new VungleException(27));
                    MRAIDAdPresenter.this.makeBusError(new VungleException(10));
                    MRAIDAdPresenter.this.adView.close();
                } else {
                    MRAIDAdPresenter.this.adView.showWebsite(Advertisement.FILE_SCHEME + file2.getPath());
                    MRAIDAdPresenter.this.recordPlayRemoteUrl();
                }
            }
        });
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        if (!this.adView.hasWebView()) {
            reportErrorAndCloseAd(new VungleException(31));
            return;
        }
        this.adView.setImmersiveMode();
        this.adView.resumeWeb();
        setAdVisibility(true);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        this.adView.pauseWeb();
        setAdVisibility(false);
        if (z || !z2 || this.isDestroying.getAndSet(true)) {
            return;
        }
        WebViewAPI webViewAPI = this.webClient;
        if (webViewAPI != null) {
            webViewAPI.setMRAIDDelegate(null);
        }
        if (z3) {
            reportAction("mraidCloseByApi", null);
        }
        this.repository.save(this.report, this.repoCallback);
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("end", this.report.isCTAClicked() ? "isCTAClicked" : null, this.placement.getId());
        }
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdPresenter
    public void setAdVisibility(boolean z) {
        this.webClient.setAdVisibility(z);
        if (z) {
            this.durationRecorder.start();
        } else {
            this.durationRecorder.stop();
        }
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdPresenter
    public void onViewTouched(MotionEvent motionEvent) {
        ClickCoordinateTracker clickCoordinateTracker = this.clickCoordinateTracker;
        if (clickCoordinateTracker != null) {
            clickCoordinateTracker.trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void generateSaveState(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        this.repository.save(this.report, this.repoCallback);
        optionsState.put(EXTRA_REPORT, this.report.getId());
        optionsState.put(EXTRA_INCENTIVIZED_SENT, this.sendReportIncentivized.get());
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void restoreFromSave(OptionsState optionsState) {
        if (optionsState == null) {
            return;
        }
        boolean z = optionsState.getBoolean(EXTRA_INCENTIVIZED_SENT, false);
        if (z) {
            this.sendReportIncentivized.set(z);
        }
        if (this.report == null) {
            this.adView.close();
            VungleLogger.error("MRAIDAdPresenter#restoreFromSave", "The advertisement was not started and cannot be restored.");
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        if (!this.backEnabled) {
            return false;
        }
        this.adView.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    @Override // com.vungle.warren.ui.view.WebViewAPI.MRAIDDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r17, com.google.gson.JsonObject r18) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.MRAIDAdPresenter.processCommand(java.lang.String, com.google.gson.JsonObject):boolean");
    }

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
        str.hashCode();
        switch (str) {
            case "privacy":
                return;
            case "close":
                closeView();
                return;
            case "download":
                download();
                return;
            default:
                throw new IllegalArgumentException("Unknown action " + str);
        }
    }

    private void download() {
        reportAction("cta", "");
        try {
            this.analytics.ping(new String[]{this.advertisement.getCTAURL(true)});
            this.adView.open(this.advertisement.getDeeplinkUrl(), this.advertisement.getCTAURL(false), new PresenterAppLeftCallback(this.bus, this.placement), new PresenterAdOpenCallback() { // from class: com.vungle.warren.ui.presenter.MRAIDAdPresenter.8
                @Override // com.vungle.warren.ui.PresenterAdOpenCallback
                public void onAdOpenType(PresenterAdOpenCallback.AdOpenType adOpenType) {
                    if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                        MRAIDAdPresenter.this.reportAction(MRAIDAdPresenter.OPEN_DEEPLINK_SUCCESS, null);
                    }
                }
            });
        } catch (ActivityNotFoundException unused) {
            VungleLogger.error("MRAIDAdPresenter#download", "Download - Activity Not Found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeView() {
        this.adView.close();
        this.scheduler.cancelAll();
    }

    private void loadData(OptionsState optionsState) {
        this.cookieMap.put(Cookie.INCENTIVIZED_TEXT_COOKIE, (Cookie) this.repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONSENT_COOKIE, (Cookie) this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get());
        this.cookieMap.put(Cookie.CONFIG_COOKIE, (Cookie) this.repository.load(Cookie.CONFIG_COOKIE, Cookie.class).get());
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
        recordMraidError(str);
        VungleLogger.error("MRAIDAdPresenter#onReceivedError", str);
        if (z) {
            reportErrorAndCloseAd(new VungleException(38));
        }
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, boolean z) {
        handleWebViewException(new VungleException(31));
        VungleLogger.error("MRAIDAdPresenteronWebRenderingProcessGone", new VungleException(31).getLocalizedMessage());
        return true;
    }

    @Override // com.vungle.warren.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        VungleException vungleException = new VungleException(32);
        handleWebViewException(vungleException);
        VungleLogger.error("MRAIDAdPresenter#onRenderProcessUnresponsive", vungleException.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWebViewException(VungleException vungleException) {
        WebAdContract.WebAdView webAdView = this.adView;
        if (webAdView != null) {
            webAdView.removeWebView();
        }
        VungleLogger.error("MRAIDAdPresenter#handleWebViewException", "WebViewException: " + vungleException.getLocalizedMessage());
        reportErrorAndCloseAd(vungleException);
    }

    private void reportErrorAndCloseAd(VungleException vungleException) {
        makeBusError(vungleException);
        closeView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(VungleException vungleException) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(vungleException, this.placement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPlayRemoteUrl() {
        Report report;
        Advertisement advertisement = (Advertisement) this.repository.load(this.advertisement.getId(), Advertisement.class).get();
        if (advertisement == null || (report = this.report) == null) {
            return;
        }
        report.setAllAssetDownloaded(advertisement.assetsFullyDownloaded);
        this.repository.save(this.report, this.repoCallback);
    }

    private void recordMraidError(String str) {
        if (this.report == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.report.recordError(str);
        this.repository.save(this.report, this.repoCallback);
    }
}
