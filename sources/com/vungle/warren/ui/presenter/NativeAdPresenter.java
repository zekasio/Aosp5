package com.vungle.warren.ui.presenter;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.analytics.AdAnalytics;
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
import com.vungle.warren.ui.contract.NativeAdContract;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.utility.Scheduler;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAdPresenter implements NativeAdContract.NativePresenter {
    private static final String EXTRA_INCENTIVIZED_SENT = "incentivized_sent";
    private static final String EXTRA_REPORT = "saved_report";
    private static final String NO_VALUE = "";
    private static final String OPEN_ACTION = "mraidOpen";
    private static final String OPEN_DEEPLINK_SUCCESS = "deeplinkSuccess";
    private static final String TAG = "NativeAdPresenter";
    private NativeAdContract.NativeView adView;
    private boolean adViewed;
    private final Advertisement advertisement;
    private final AdAnalytics analytics;
    private AdContract.AdvertisementPresenter.EventListener bus;
    private final LinkedList<Advertisement.Checkpoint> checkpointList;
    private DurationRecorder durationRecorder;
    private final String[] impressionUrls;
    private final Placement placement;
    private final Repository.SaveCallback repoCallback;
    private Report report;
    private final Repository repository;
    private final Scheduler scheduler;
    private final Map<String, Cookie> cookies = new HashMap();
    private final AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);
    private final AtomicBoolean isDestroying = new AtomicBoolean(false);

    @Override // com.vungle.warren.ui.JavascriptBridge.MraidHandler
    public void onMraidAction(String str) {
    }

    public NativeAdPresenter(Advertisement advertisement, Placement placement, Repository repository, Scheduler scheduler, AdAnalytics adAnalytics, OptionsState optionsState, String[] strArr) {
        LinkedList<Advertisement.Checkpoint> linkedList = new LinkedList<>();
        this.checkpointList = linkedList;
        this.repoCallback = new Repository.SaveCallback() { // from class: com.vungle.warren.ui.presenter.NativeAdPresenter.1
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
                NativeAdPresenter.this.makeBusError(26);
                VungleLogger.error("LocalAdPresenter#onError", new VungleException(26).getLocalizedMessage());
                NativeAdPresenter.this.closeView();
            }
        };
        this.advertisement = advertisement;
        this.placement = placement;
        this.repository = repository;
        this.scheduler = scheduler;
        this.analytics = adAnalytics;
        this.impressionUrls = strArr;
        if (advertisement.getCheckpoints() != null) {
            linkedList.addAll(advertisement.getCheckpoints());
        }
        loadData(optionsState);
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void onDownload() {
        reportAction(OPEN_ACTION, "");
        try {
            this.analytics.ping(this.advertisement.getTpatUrls("clickUrl"));
            this.analytics.ping(new String[]{this.advertisement.getCTAURL(true)});
            reportAction(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION, null);
            String ctaurl = this.advertisement.getCTAURL(false);
            String deeplinkUrl = this.advertisement.getDeeplinkUrl();
            if ((deeplinkUrl == null || deeplinkUrl.isEmpty()) && (ctaurl == null || ctaurl.isEmpty())) {
                Log.e(TAG, "CTA destination URL is not configured properly");
            } else {
                this.adView.open(deeplinkUrl, ctaurl, new PresenterAppLeftCallback(this.bus, this.placement), new PresenterAdOpenCallback() { // from class: com.vungle.warren.ui.presenter.NativeAdPresenter.2
                    @Override // com.vungle.warren.ui.PresenterAdOpenCallback
                    public void onAdOpenType(PresenterAdOpenCallback.AdOpenType adOpenType) {
                        if (adOpenType == PresenterAdOpenCallback.AdOpenType.DEEP_LINK) {
                            NativeAdPresenter.this.reportAction(NativeAdPresenter.OPEN_DEEPLINK_SUCCESS, null);
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

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void onPrivacy() {
        this.adView.open(null, this.advertisement.getPrivacyUrl(), new PresenterAppLeftCallback(this.bus, this.placement), null);
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void setAdVisibility(boolean z) {
        Log.d(TAG, "isViewable=" + z + " " + this.placement + " " + hashCode());
        if (z) {
            this.durationRecorder.start();
        } else {
            this.durationRecorder.stop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attach(com.vungle.warren.ui.contract.NativeAdContract.NativeView r7, com.vungle.warren.ui.state.OptionsState r8) {
        /*
            r6 = this;
            java.lang.String r0 = com.vungle.warren.ui.presenter.NativeAdPresenter.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "attach() "
            r1.<init>(r2)
            com.vungle.warren.model.Placement r2 = r6.placement
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            int r2 = r6.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.isDestroying
            r2 = 0
            r1.set(r2)
            r6.adView = r7
            r7.setPresenter(r6)
            com.vungle.warren.ui.contract.AdContract$AdvertisementPresenter$EventListener r1 = r6.bus
            if (r1 == 0) goto L41
            com.vungle.warren.model.Advertisement r2 = r6.advertisement
            java.lang.String r2 = r2.getCreativeId()
            com.vungle.warren.model.Placement r3 = r6.placement
            java.lang.String r3 = r3.getId()
            java.lang.String r4 = "attach"
            r1.onNext(r4, r2, r3)
        L41:
            com.vungle.warren.model.Advertisement r1 = r6.advertisement
            com.vungle.warren.AdConfig r1 = r1.getAdConfig()
            int r1 = r1.getAdOrientation()
            r2 = 3
            r3 = 6
            r4 = 7
            r5 = 1
            if (r1 != r2) goto L5d
            com.vungle.warren.model.Advertisement r1 = r6.advertisement
            int r1 = r1.getOrientation()
            if (r1 == 0) goto L5f
            if (r1 == r5) goto L65
            r3 = -1
            goto L65
        L5d:
            if (r1 != 0) goto L61
        L5f:
            r3 = 7
            goto L65
        L61:
            if (r1 != r5) goto L64
            goto L65
        L64:
            r3 = 4
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested Orientation "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            r7.setOrientation(r3)
            r6.prepare(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.ui.presenter.NativeAdPresenter.attach(com.vungle.warren.ui.contract.NativeAdContract$NativeView, com.vungle.warren.ui.state.OptionsState):void");
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
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext(TJAdUnitConstants.String.VIDEO_START, null, this.placement.getId());
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void detach(int i) {
        Log.d(TAG, "detach() " + this.placement + " " + hashCode());
        stop(i);
        this.adView.destroyAdView(0L);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public boolean handleExit() {
        closeView();
        return true;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void start() {
        Log.d(TAG, "start() " + this.placement + " " + hashCode());
        this.durationRecorder.start();
        Cookie cookie = this.cookies.get(Cookie.CONSENT_COOKIE);
        if (needShowGDPR(cookie)) {
            showGDPR(cookie);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void stop(int i) {
        Log.d(TAG, "stop() " + this.placement + " " + hashCode());
        this.durationRecorder.stop();
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (z || !z2 || this.isDestroying.getAndSet(true)) {
            return;
        }
        if (z3) {
            reportAction("mraidCloseByApi", null);
        }
        this.repository.save(this.report, this.repoCallback);
        closeView();
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onNext("end", this.report.isCTAClicked() ? "isCTAClicked" : null, this.placement.getId());
        }
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
    public void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        this.bus = eventListener;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdvertisementPresenter
    public void onViewConfigurationChanged() {
        this.adView.refreshDialogIfVisible();
    }

    @Override // com.vungle.warren.ui.contract.NativeAdContract.NativePresenter
    public void onProgressUpdate(int i, float f) {
        Log.d(TAG, "onProgressUpdate() " + this.placement + " " + hashCode());
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null && i > 0 && !this.adViewed) {
            this.adViewed = true;
            eventListener.onNext("adViewed", null, this.placement.getId());
            String[] strArr = this.impressionUrls;
            if (strArr != null) {
                this.analytics.ping(strArr);
            }
        }
        AdContract.AdvertisementPresenter.EventListener eventListener2 = this.bus;
        if (eventListener2 != null) {
            eventListener2.onNext("percentViewed:100", null, this.placement.getId());
        }
        reportVideoLength(5000L);
        reportAction("videoLength", String.format(Locale.ENGLISH, "%d", 5000));
        reportAction(ReportDBAdapter.ReportColumns.COLUMN_VIDEO_VIEWED, String.format(Locale.ENGLISH, "%d", 100));
        Advertisement.Checkpoint checkpointPollFirst = this.checkpointList.pollFirst();
        if (checkpointPollFirst != null) {
            this.analytics.ping(checkpointPollFirst.getUrls());
        }
        this.durationRecorder.update();
    }

    private void reportVideoLength(long j) {
        this.report.setVideoLength(j);
        this.repository.save(this.report, this.repoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportAction(String str, String str2) {
        this.report.recordAction(str, str2, System.currentTimeMillis());
        this.repository.save(this.report, this.repoCallback);
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

    private boolean needShowGDPR(Cookie cookie) {
        return cookie != null && cookie.getBoolean("is_country_data_protected").booleanValue() && "unknown".equals(cookie.getString("consent_status"));
    }

    private void showGDPR(final Cookie cookie) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.warren.ui.presenter.NativeAdPresenter.3
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
                NativeAdPresenter.this.repository.save(cookie, null);
                NativeAdPresenter.this.start();
            }
        };
        cookie.putValue("consent_status", Gdpr.OPTED_OUT_BY_TIMEOUT);
        cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        cookie.putValue("consent_source", "vungle_modal");
        this.repository.save(cookie, this.repoCallback);
        showDialog(cookie.getString("consent_title"), cookie.getString("consent_message"), cookie.getString("button_accept"), cookie.getString("button_deny"), onClickListener);
    }

    private void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.adView.showDialog(str, str2, str3, str4, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeBusError(int i) {
        AdContract.AdvertisementPresenter.EventListener eventListener = this.bus;
        if (eventListener != null) {
            eventListener.onError(new VungleException(i), this.placement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeView() {
        this.adView.close();
        this.scheduler.cancelAll();
    }
}
