package com.vungle.warren;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.AdConfig;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.log.LogManager;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.Callback;
import com.vungle.warren.network.Response;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.AdMarkupDecoder;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class Vungle {
    private static final int DEFAULT_SESSION_TIMEOUT = 900;
    private static volatile boolean isInitialized;
    volatile String appID;
    private volatile String consentVersion;
    private Context context;
    static final Vungle _instance = new Vungle();
    private static final String TAG = Vungle.class.getCanonicalName();
    private static AtomicBoolean isInitializing = new AtomicBoolean(false);
    private static AtomicBoolean isDepInit = new AtomicBoolean(false);
    private static Gson gson = new GsonBuilder().create();
    private static CacheManager.Listener cacheListener = new CacheManager.Listener() { // from class: com.vungle.warren.Vungle.19
        @Override // com.vungle.warren.persistence.CacheManager.Listener
        public void onCacheChanged() {
            if (Vungle._instance.context == null) {
                return;
            }
            Vungle.stopPlaying();
            ServiceLocator serviceLocator = ServiceLocator.getInstance(Vungle._instance.context);
            CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
            Downloader downloader = (Downloader) serviceLocator.getService(Downloader.class);
            if (cacheManager.getCache() != null) {
                List<DownloadRequest> allRequests = downloader.getAllRequests();
                String path = cacheManager.getCache().getPath();
                for (DownloadRequest downloadRequest : allRequests) {
                    if (!downloadRequest.path.startsWith(path)) {
                        downloader.cancel(downloadRequest);
                    }
                }
            }
            downloader.init();
        }
    };
    private final AtomicReference<Consent> consent = new AtomicReference<>();
    private final AtomicReference<Consent> ccpaStatus = new AtomicReference<>();
    private Map<String, Boolean> playOperations = new ConcurrentHashMap();
    private AtomicInteger hbpOrdinalViewCount = new AtomicInteger(0);

    public enum Consent {
        OPTED_IN,
        OPTED_OUT
    }

    private Vungle() {
    }

    static Context getAppContext() {
        return _instance.context;
    }

    @Deprecated
    public static void init(Collection<String> collection, String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static void init(String str, Context context, InitCallback initCallback) throws IllegalArgumentException {
        init(str, context, initCallback, new VungleSettings.Builder().build());
    }

    public static void init(final String str, final Context context, final InitCallback initCallback, VungleSettings vungleSettings) throws IllegalArgumentException {
        VungleLogger.debug("Vungle#init", "init request");
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT).build());
        if (initCallback == null) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            throw new IllegalArgumentException("A valid InitCallback required to ensure API calls are being made after initialize is successful");
        }
        if (context == null) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            initCallback.onError(new VungleException(6));
            return;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        final Platform platform = (Platform) serviceLocator.getService(Platform.class);
        if (!platform.isAtLeastMinimumSDK()) {
            Log.e(TAG, "SDK is supported only for API versions 21 and above");
            initCallback.onError(new VungleException(35));
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            return;
        }
        final RuntimeValues runtimeValues = (RuntimeValues) ServiceLocator.getInstance(context).getService(RuntimeValues.class);
        runtimeValues.settings.set(vungleSettings);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        InitCallback initCallbackWrapper = initCallback instanceof InitCallbackWrapper ? initCallback : new InitCallbackWrapper(executors.getUIExecutor(), initCallback);
        if (str == null || str.isEmpty()) {
            initCallbackWrapper.onError(new VungleException(6));
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            return;
        }
        if (!(context instanceof Application)) {
            initCallbackWrapper.onError(new VungleException(7));
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            return;
        }
        if (isInitialized()) {
            Log.d(TAG, "init already complete");
            initCallbackWrapper.onSuccess();
            VungleLogger.debug("Vungle#init", "init already complete");
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
            return;
        }
        if (isInitializing.getAndSet(true)) {
            Log.d(TAG, "init ongoing");
            onInitError(initCallbackWrapper, new VungleException(8));
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
        } else {
            if (PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || PermissionChecker.checkCallingOrSelfPermission(context, "android.permission.INTERNET") != 0) {
                Log.e(TAG, "Network permissions not granted");
                onInitError(initCallbackWrapper, new VungleException(34));
                isInitializing.set(false);
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.INIT_END).addData(SessionAttribute.SUCCESS, false).build());
                return;
            }
            SessionTracker.getInstance().setInitTimestamp(System.currentTimeMillis());
            runtimeValues.initCallback.set(initCallbackWrapper);
            executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.1
                @Override // java.lang.Runnable
                public void run() {
                    Vungle._instance.appID = str;
                    InitCallback initCallback2 = runtimeValues.initCallback.get();
                    if (!Vungle.isDepInit.getAndSet(true)) {
                        VungleLogger.setupLoggerWithLogLevel((LogManager) serviceLocator.getService(LogManager.class), VungleLogger.LoggerLevel.DEBUG, 100);
                        CacheManager cacheManager = (CacheManager) serviceLocator.getService(CacheManager.class);
                        VungleSettings vungleSettings2 = runtimeValues.settings.get();
                        if (vungleSettings2 == null || cacheManager.getBytesAvailable() >= vungleSettings2.getMinimumSpaceForInit()) {
                            cacheManager.addListener(Vungle.cacheListener);
                            Vungle._instance.context = context;
                            Repository repository = (Repository) serviceLocator.getService(Repository.class);
                            try {
                                repository.init();
                                PrivacyManager.getInstance().init(((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor(), repository);
                                ((VungleApiClient) serviceLocator.getService(VungleApiClient.class)).init();
                                if (vungleSettings2 != null) {
                                    platform.setAndroidIdFallbackDisabled(vungleSettings2.getAndroidIdOptOut());
                                }
                                ((AdLoader) serviceLocator.getService(AdLoader.class)).init((JobRunner) serviceLocator.getService(JobRunner.class));
                                if (Vungle._instance.consent.get() != null) {
                                    Vungle.saveGDPRConsent(repository, (Consent) Vungle._instance.consent.get(), Vungle._instance.consentVersion);
                                } else {
                                    Cookie cookie = (Cookie) repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get();
                                    if (cookie == null) {
                                        Vungle._instance.consent.set(null);
                                        Vungle._instance.consentVersion = null;
                                    } else {
                                        Vungle._instance.consent.set(Vungle.getConsent(cookie));
                                        Vungle._instance.consentVersion = Vungle.getConsentMessageVersion(cookie);
                                    }
                                }
                                if (Vungle._instance.ccpaStatus.get() != null) {
                                    Vungle.updateCCPAStatus(repository, (Consent) Vungle._instance.ccpaStatus.get());
                                } else {
                                    Vungle._instance.ccpaStatus.set(Vungle.getCCPAStatus((Cookie) repository.load(Cookie.CCPA_COOKIE, Cookie.class).get()));
                                }
                            } catch (DatabaseHelper.DBException unused) {
                                Vungle.onInitError(initCallback2, new VungleException(26));
                                Vungle.deInit();
                                return;
                            }
                        } else {
                            Vungle.onInitError(initCallback2, new VungleException(16));
                            Vungle.deInit();
                            return;
                        }
                    }
                    Repository repository2 = (Repository) serviceLocator.getService(Repository.class);
                    Cookie cookie2 = (Cookie) repository2.load("appId", Cookie.class).get();
                    if (cookie2 == null) {
                        cookie2 = new Cookie("appId");
                    }
                    cookie2.putValue("appId", str);
                    try {
                        repository2.save(cookie2);
                        Vungle._instance.configure(initCallback2, false);
                        ((JobRunner) serviceLocator.getService(JobRunner.class)).execute(AnalyticsJob.makeJob(2, null, null, 1));
                    } catch (DatabaseHelper.DBException unused2) {
                        if (initCallback2 != null) {
                            Vungle.onInitError(initCallback2, new VungleException(26));
                        }
                        Vungle.isInitializing.set(false);
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.Vungle.2
                @Override // java.lang.Runnable
                public void run() {
                    Vungle.onInitError(initCallback, new VungleException(39));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onInitError(InitCallback initCallback, VungleException vungleException) {
        if (initCallback != null) {
            initCallback.onError(vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#init", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
    }

    static void reConfigure() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        final RuntimeValues runtimeValues = (RuntimeValues) serviceLocator.getService(RuntimeValues.class);
        if (isInitialized()) {
            executors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.3
                @Override // java.lang.Runnable
                public void run() {
                    Vungle._instance.configure(runtimeValues.initCallback.get(), true);
                }
            }, new Runnable() { // from class: com.vungle.warren.Vungle.4
                @Override // java.lang.Runnable
                public void run() {
                    Vungle.onInitError(runtimeValues.initCallback.get(), new VungleException(39));
                }
            });
        } else {
            init(vungle.appID, vungle.context, runtimeValues.initCallback.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configure(com.vungle.warren.InitCallback r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.Vungle.configure(com.vungle.warren.InitCallback, boolean):void");
    }

    public static boolean isInitialized() {
        return isInitialized && _instance.context != null;
    }

    public static void setIncentivizedFields(final String str, final String str2, final String str3, final String str4, final String str5) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, context is null");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.9
                @Override // java.lang.Runnable
                public void run() {
                    if (!Vungle.isInitialized()) {
                        Log.e(Vungle.TAG, "Vungle is not initialized");
                        return;
                    }
                    Repository repository = (Repository) serviceLocator.getService(Repository.class);
                    Cookie cookie = (Cookie) repository.load(Cookie.INCENTIVIZED_TEXT_COOKIE, Cookie.class).get();
                    if (cookie == null) {
                        cookie = new Cookie(Cookie.INCENTIVIZED_TEXT_COOKIE);
                    }
                    String str6 = TextUtils.isEmpty(str2) ? "" : str2;
                    String str7 = TextUtils.isEmpty(str3) ? "" : str3;
                    String str8 = TextUtils.isEmpty(str4) ? "" : str4;
                    String str9 = TextUtils.isEmpty(str5) ? "" : str5;
                    String str10 = TextUtils.isEmpty(str) ? "" : str;
                    cookie.putValue(TJAdUnitConstants.String.TITLE, str6);
                    cookie.putValue("body", str7);
                    cookie.putValue("continue", str8);
                    cookie.putValue("close", str9);
                    cookie.putValue("userID", str10);
                    try {
                        repository.save(cookie);
                    } catch (DatabaseHelper.DBException e) {
                        Log.e(Vungle.TAG, "Cannot save incentivized cookie", e);
                    }
                }
            });
        }
    }

    public static boolean canPlayAd(String str) {
        return canPlayAd(str, null);
    }

    public static boolean canPlayAd(final String str, final String str2) {
        final Context context = _instance.context;
        if (context == null) {
            Log.e(TAG, "Context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "AdMarkup/PlacementId is null");
            return false;
        }
        AdMarkup adMarkupDecode = AdMarkupDecoder.decode(str2);
        if (str2 != null && adMarkupDecode == null) {
            Log.e(TAG, "Invalid AdMarkup");
            return false;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        return Boolean.TRUE.equals(new FutureResult(executors.getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.Vungle.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                Advertisement advertisement;
                if (!Vungle.isInitialized()) {
                    Log.e(Vungle.TAG, "Vungle is not initialized");
                    return false;
                }
                Repository repository = (Repository) ServiceLocator.getInstance(context).getService(Repository.class);
                AdMarkup adMarkupDecode2 = AdMarkupDecoder.decode(str2);
                String eventId = adMarkupDecode2 != null ? adMarkupDecode2.getEventId() : null;
                Placement placement = (Placement) repository.load(str, Placement.class).get();
                if (placement == null || !placement.isValid() || ((placement.isMultipleHBPEnabled() && eventId == null) || (advertisement = repository.findValidAdvertisementForPlacement(str, eventId).get()) == null || placement.getPlacementAdType() == 1 || (!AdConfig.AdSize.isDefaultAdSize(placement.getAdSize()) && !placement.getAdSize().equals(advertisement.getAdConfig().getAdSize())))) {
                    return false;
                }
                return Boolean.valueOf(Vungle.canPlayAd(advertisement));
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS));
    }

    static boolean canPlayAd(Advertisement advertisement) {
        Context context = _instance.context;
        if (context == null) {
            return false;
        }
        return ((AdLoader) ServiceLocator.getInstance(context).getService(AdLoader.class)).canPlayAd(advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlayError(String str, PlayAdCallback playAdCallback, VungleException vungleException) {
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#playAd", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.PLAY_AD).addData(SessionAttribute.SUCCESS, false).build());
    }

    public static void playAd(String str, AdConfig adConfig, PlayAdCallback playAdCallback) {
        playAd(str, null, adConfig, playAdCallback);
    }

    public static void playAd(final String str, String str2, AdConfig adConfig, PlayAdCallback playAdCallback) {
        VungleLogger.debug("Vungle#playAd", "playAd call invoked");
        SessionTracker.getInstance().trackAdConfig(adConfig);
        if (!isInitialized()) {
            Log.e(TAG, "Locator is not initialized");
            if (playAdCallback != null) {
                onPlayError(str, playAdCallback, new VungleException(9));
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
            return;
        }
        AdMarkup adMarkupDecode = AdMarkupDecoder.decode(str2);
        if (str2 != null && adMarkupDecode == null) {
            onPlayError(str, playAdCallback, new VungleException(36));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        Repository repository = (Repository) serviceLocator.getService(Repository.class);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        VungleApiClient vungleApiClient = (VungleApiClient) serviceLocator.getService(VungleApiClient.class);
        final PlayAdCallbackWrapper playAdCallbackWrapper = new PlayAdCallbackWrapper(executors.getUIExecutor(), playAdCallback);
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.Vungle.11
            @Override // java.lang.Runnable
            public void run() {
                Vungle.onPlayError(str, playAdCallbackWrapper, new VungleException(39));
            }
        };
        executors.getBackgroundExecutor().execute(new AnonymousClass12(str2, str, adLoader, playAdCallbackWrapper, repository, adConfig, vungleApiClient, executors, runnable), runnable);
    }

    /* JADX INFO: renamed from: com.vungle.warren.Vungle$12, reason: invalid class name */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ Runnable val$OOMRunnable;
        final /* synthetic */ AdLoader val$adLoader;
        final /* synthetic */ PlayAdCallback val$listener;
        final /* synthetic */ String val$markup;
        final /* synthetic */ String val$placementId;
        final /* synthetic */ Repository val$repository;
        final /* synthetic */ Executors val$sdkExecutors;
        final /* synthetic */ AdConfig val$settings;
        final /* synthetic */ VungleApiClient val$vungleApiClient;

        AnonymousClass12(String str, String str2, AdLoader adLoader, PlayAdCallback playAdCallback, Repository repository, AdConfig adConfig, VungleApiClient vungleApiClient, Executors executors, Runnable runnable) {
            this.val$markup = str;
            this.val$placementId = str2;
            this.val$adLoader = adLoader;
            this.val$listener = playAdCallback;
            this.val$repository = repository;
            this.val$settings = adConfig;
            this.val$vungleApiClient = vungleApiClient;
            this.val$sdkExecutors = executors;
            this.val$OOMRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            final boolean z;
            final AdRequest adRequest = new AdRequest(this.val$placementId, AdMarkupDecoder.decode(this.val$markup), false);
            if (Boolean.TRUE.equals(Vungle._instance.playOperations.get(this.val$placementId)) || this.val$adLoader.isLoading(adRequest)) {
                Vungle.onPlayError(this.val$placementId, this.val$listener, new VungleException(8));
                return;
            }
            final Placement placement = (Placement) this.val$repository.load(this.val$placementId, Placement.class).get();
            if (placement == null) {
                Vungle.onPlayError(this.val$placementId, this.val$listener, new VungleException(13));
                return;
            }
            if (AdConfig.AdSize.isBannerAdSize(placement.getAdSize())) {
                Log.e(Vungle.TAG, "Incorrect API for Banners and MREC");
                Vungle.onPlayError(this.val$placementId, this.val$listener, new VungleException(28));
                return;
            }
            final Advertisement advertisement = this.val$repository.findPotentiallyExpiredAd(this.val$placementId, adRequest.getEventId()).get();
            try {
                boolean z2 = advertisement != null && advertisement.getExpireTime() < System.currentTimeMillis() / 1000;
                if (!Vungle.canPlayAd(advertisement) || z2) {
                    if (advertisement != null && (advertisement.getState() == 1 || z2)) {
                        this.val$repository.saveAndApplyState(advertisement, this.val$placementId, 4);
                        this.val$adLoader.loadEndlessIfNeeded(placement, placement.getAdSize(), 0L, false);
                    }
                    if (z2) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.AD_EXPIRED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).build());
                        Vungle.onPlayError(adRequest.getPlacementId(), this.val$listener, new VungleException(37));
                        return;
                    }
                    z = true;
                } else {
                    advertisement.configure(this.val$settings);
                    this.val$repository.save(advertisement);
                    z = false;
                }
                if (Vungle._instance.context != null) {
                    if (this.val$vungleApiClient.canCallWillPlayAd()) {
                        this.val$vungleApiClient.willPlayAd(placement.getId(), placement.isAutoCached(), z ? "" : advertisement.getAdToken()).enqueue(new Callback<JsonObject>() { // from class: com.vungle.warren.Vungle.12.1
                            @Override // com.vungle.warren.network.Callback
                            public void onResponse(Call<JsonObject> call, final Response<JsonObject> response) {
                                AnonymousClass12.this.val$sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.12.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        JsonObject jsonObject;
                                        Advertisement advertisement2 = null;
                                        if (response.isSuccessful() && (jsonObject = (JsonObject) response.body()) != null && jsonObject.has("ad")) {
                                            try {
                                                Advertisement advertisement3 = new Advertisement(jsonObject.getAsJsonObject("ad"));
                                                try {
                                                    advertisement3.configure(AnonymousClass12.this.val$settings);
                                                    AnonymousClass12.this.val$repository.saveAndApplyState(advertisement3, AnonymousClass12.this.val$placementId, 0);
                                                    advertisement2 = advertisement3;
                                                } catch (IllegalArgumentException unused) {
                                                    advertisement2 = advertisement3;
                                                    VungleLogger.debug("Vungle#playAd", "streaming ads IllegalArgumentException");
                                                    Log.v(Vungle.TAG, "Will Play Ad did not respond with a replacement. Move on.");
                                                } catch (Exception e) {
                                                    e = e;
                                                    advertisement2 = advertisement3;
                                                    VungleLogger.error("Vungle#playAd", "streaming ads Exception :" + e.getLocalizedMessage());
                                                    Log.e(Vungle.TAG, "Error using will_play_ad!", e);
                                                }
                                            } catch (IllegalArgumentException unused2) {
                                            } catch (Exception e2) {
                                                e = e2;
                                            }
                                        }
                                        if (!z) {
                                            Vungle.renderAd(adRequest, AnonymousClass12.this.val$listener, placement, advertisement);
                                        } else if (advertisement2 == null) {
                                            Vungle.onPlayError(AnonymousClass12.this.val$placementId, AnonymousClass12.this.val$listener, new VungleException(1));
                                        } else {
                                            Vungle.renderAd(adRequest, AnonymousClass12.this.val$listener, placement, advertisement2);
                                        }
                                    }
                                }, AnonymousClass12.this.val$OOMRunnable);
                            }

                            @Override // com.vungle.warren.network.Callback
                            public void onFailure(Call<JsonObject> call, Throwable th) {
                                AnonymousClass12.this.val$sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.12.1.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        if (z) {
                                            Vungle.onPlayError(AnonymousClass12.this.val$placementId, AnonymousClass12.this.val$listener, new VungleException(1));
                                        } else {
                                            Vungle.renderAd(adRequest, AnonymousClass12.this.val$listener, placement, advertisement);
                                        }
                                    }
                                }, AnonymousClass12.this.val$OOMRunnable);
                            }
                        });
                    } else if (z) {
                        Vungle.onPlayError(this.val$placementId, this.val$listener, new VungleException(1));
                    } else {
                        Vungle.renderAd(adRequest, this.val$listener, placement, advertisement);
                    }
                }
            } catch (DatabaseHelper.DBException unused) {
                Vungle.onPlayError(this.val$placementId, this.val$listener, new VungleException(26));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void renderAd(AdRequest adRequest, PlayAdCallback playAdCallback, Placement placement, Advertisement advertisement) {
        if (!isInitialized()) {
            Log.e(TAG, "Sdk is not initialized");
            return;
        }
        Vungle vungle = _instance;
        ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
        VungleActivity.setEventListener(new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), (AdLoader) serviceLocator.getService(AdLoader.class), (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), placement, advertisement) { // from class: com.vungle.warren.Vungle.13
            @Override // com.vungle.warren.AdEventListener
            protected void onFinished() {
                super.onFinished();
                VungleActivity.setEventListener(null);
            }
        });
        ActivityManager.startWhenForeground(vungle.context, null, AdActivity.createIntent(vungle.context, adRequest), null);
    }

    static AdEventListener getEventListener(AdRequest adRequest, PlayAdCallback playAdCallback) {
        Vungle vungle = _instance;
        ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
        return new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), (AdLoader) serviceLocator.getService(AdLoader.class), (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), null, null);
    }

    private static void onLoadError(String str, LoadAdCallback loadAdCallback, VungleException vungleException) {
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
        if (vungleException != null) {
            VungleLogger.error("Vungle#loadAd", (vungleException.getLocalizedMessage() == null || !vungleException.getLocalizedMessage().isEmpty()) ? Integer.toString(vungleException.getExceptionCode()) : vungleException.getLocalizedMessage());
        }
    }

    public static void loadAd(String str, LoadAdCallback loadAdCallback) {
        loadAd(str, new AdConfig(), loadAdCallback);
    }

    public static void loadAd(String str, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        loadAd(str, null, adConfig, loadAdCallback);
    }

    public static void loadAd(String str, String str2, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        VungleLogger.debug("Vungle#loadAd", "loadAd API call invoked");
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
            return;
        }
        if (adConfig != null && !AdConfig.AdSize.isDefaultAdSize(adConfig.getAdSize())) {
            onLoadError(str, loadAdCallback, new VungleException(29));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Placement placement = (Placement) ((Repository) serviceLocator.getService(Repository.class)).load(str, Placement.class).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        if (placement != null && placement.getPlacementAdType() == 4) {
            onLoadError(str, loadAdCallback, new VungleException(41));
        } else {
            loadAdInternal(str, str2, adConfig, loadAdCallback);
        }
    }

    static void loadAdInternal(String str, String str2, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        LoadAdCallback loadAdCallbackWrapper;
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
            onLoadError(str, loadAdCallback, new VungleException(9));
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        if (loadAdCallback instanceof LoadNativeAdCallback) {
            loadAdCallbackWrapper = new LoadNativeAdCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), (LoadNativeAdCallback) loadAdCallback);
        } else {
            loadAdCallbackWrapper = new LoadAdCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), loadAdCallback);
        }
        AdMarkup adMarkupDecode = AdMarkupDecoder.decode(str2);
        if (!TextUtils.isEmpty(str2) && adMarkupDecode == null) {
            onLoadError(str, loadAdCallback, new VungleException(36));
            return;
        }
        AdMarkup adMarkupDecode2 = AdMarkupDecoder.decode(str2);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        if (adConfig == null) {
            adConfig = new AdConfig();
        }
        adLoader.load(new AdRequest(str, adMarkupDecode2, true), adConfig, loadAdCallbackWrapper);
    }

    private static void clearCache() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.14
                @Override // java.lang.Runnable
                public void run() {
                    ((Downloader) serviceLocator.getService(Downloader.class)).cancelAll();
                    ((AdLoader) serviceLocator.getService(AdLoader.class)).clear();
                    ((Repository) serviceLocator.getService(Repository.class)).clearAllData();
                    Vungle._instance.playOperations.clear();
                    Vungle._instance.ccpaStatus.set(null);
                    Vungle._instance.configure(((RuntimeValues) serviceLocator.getService(RuntimeValues.class)).initCallback.get(), true);
                }
            });
        }
    }

    private static void clearAdvertisements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            final ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
            ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.15
                @Override // java.lang.Runnable
                public void run() {
                    ((Downloader) serviceLocator.getService(Downloader.class)).cancelAll();
                    ((AdLoader) serviceLocator.getService(AdLoader.class)).clear();
                    final Repository repository = (Repository) serviceLocator.getService(Repository.class);
                    ((Executors) serviceLocator.getService(Executors.class)).getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.Vungle.15.1
                        @Override // java.lang.Runnable
                        public void run() {
                            List list = (List) repository.loadAll(Advertisement.class).get();
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        repository.deleteAdvertisement(((Advertisement) it.next()).getId());
                                    } catch (DatabaseHelper.DBException unused) {
                                    }
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    static VungleBannerView getBannerViewInternal(String str, AdMarkup adMarkup, AdConfig adConfig, PlayAdCallback playAdCallback) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized, returned VungleBannerView = null");
            onPlayError(str, playAdCallback, new VungleException(9));
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            onPlayError(str, playAdCallback, new VungleException(13));
            return null;
        }
        Vungle vungle = _instance;
        ServiceLocator serviceLocator = ServiceLocator.getInstance(vungle.context);
        AdLoader adLoader = (AdLoader) serviceLocator.getService(AdLoader.class);
        AdRequest adRequest = new AdRequest(str, adMarkup, true);
        boolean zIsLoading = adLoader.isLoading(adRequest);
        if (Boolean.TRUE.equals(vungle.playOperations.get(str)) || zIsLoading) {
            Log.e(TAG, "Playing or Loading operation ongoing. Playing " + vungle.playOperations.get(adRequest.getPlacementId()) + " Loading: " + zIsLoading);
            onPlayError(str, playAdCallback, new VungleException(8));
            return null;
        }
        try {
            return new VungleBannerView(vungle.context.getApplicationContext(), adRequest, adConfig, (PresentationFactory) serviceLocator.getService(PresentationFactory.class), new AdEventListener(adRequest, vungle.playOperations, playAdCallback, (Repository) serviceLocator.getService(Repository.class), adLoader, (JobRunner) serviceLocator.getService(JobRunner.class), (VisionController) serviceLocator.getService(VisionController.class), null, null));
        } catch (Exception e) {
            VungleLogger.error("Vungle#playAd", "Vungle banner ad fail: " + e.getLocalizedMessage());
            if (playAdCallback != null) {
                playAdCallback.onError(str, new VungleException(10));
            }
            return null;
        }
    }

    public static Collection<String> getValidPlacements() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<String> collection = ((Repository) serviceLocator.getService(Repository.class)).getValidPlacementIds().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return collection == null ? Collections.emptyList() : collection;
    }

    static Collection<Placement> getValidPlacementModels() {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        Collection<Placement> collection = ((Repository) serviceLocator.getService(Repository.class)).loadValidPlacements().get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return collection == null ? Collections.emptyList() : collection;
    }

    static Collection<Advertisement> getValidAdvertisementModels(String str) {
        if (!isInitialized()) {
            Log.e(TAG, "Vungle is not initialized return empty placements list");
            return Collections.emptyList();
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        List<Advertisement> list = ((Repository) serviceLocator.getService(Repository.class)).findValidAdvertisementsForPlacement(str, null).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
        return list == null ? Collections.emptyList() : list;
    }

    public static void updateConsentStatus(Consent consent, String str) {
        if (consent == null) {
            Log.e(TAG, "Cannot set consent with a null consent, please check your code");
            return;
        }
        Vungle vungle = _instance;
        vungle.consent.set(consent);
        vungle.consentVersion = str;
        if (isInitialized() && isDepInit.get()) {
            saveGDPRConsent((Repository) ServiceLocator.getInstance(vungle.context).getService(Repository.class), vungle.consent.get(), vungle.consentVersion);
        } else {
            Log.e(TAG, "Vungle is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveGDPRConsent(final Repository repository, final Consent consent, final String str) {
        repository.load(Cookie.CONSENT_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.16
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CONSENT_COOKIE);
                }
                cookie.putValue("consent_status", consent == Consent.OPTED_IN ? "opted_in" : "opted_out");
                cookie.putValue("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
                cookie.putValue("consent_source", "publisher");
                String str2 = str;
                if (str2 == null) {
                    str2 = "";
                }
                cookie.putValue("consent_message_version", str2);
                repository.save(cookie, null, false);
            }
        });
    }

    public static Consent getConsentStatus() {
        if (isInitialized() && isDepInit.get()) {
            return getConsentStatus(getGDPRConsent());
        }
        return _instance.consent.get();
    }

    private static Consent getConsentStatus(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        String string = cookie.getString("consent_status");
        string.hashCode();
        switch (string) {
            case "opted_in":
                _instance.consent.set(Consent.OPTED_IN);
                break;
            case "opted_out_by_timeout":
            case "opted_out":
                _instance.consent.set(Consent.OPTED_OUT);
                break;
        }
        return null;
    }

    private static Cookie getGDPRConsent() {
        ServiceLocator serviceLocator = ServiceLocator.getInstance(_instance.context);
        return (Cookie) ((Repository) serviceLocator.getService(Repository.class)).load(Cookie.CONSENT_COOKIE, Cookie.class).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS);
    }

    public static String getConsentMessageVersion() {
        return _instance.consentVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getConsent(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return "opted_in".equals(cookie.getString("consent_status")) ? Consent.OPTED_IN : Consent.OPTED_OUT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getConsentMessageVersion(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return cookie.getString("consent_message_version");
    }

    private static String getConsentSource(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return cookie.getString("consent_source");
    }

    public static void updateCCPAStatus(Consent consent) {
        if (consent == null) {
            Log.e(TAG, "Unable to update CCPA status, Invalid input parameter.");
            return;
        }
        Vungle vungle = _instance;
        vungle.ccpaStatus.set(consent);
        if (!isInitialized() || !isDepInit.get()) {
            Log.e(TAG, "Vungle is not initialized");
        } else {
            updateCCPAStatus((Repository) ServiceLocator.getInstance(vungle.context).getService(Repository.class), consent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateCCPAStatus(final Repository repository, final Consent consent) {
        repository.load(Cookie.CCPA_COOKIE, Cookie.class, new Repository.LoadCallback<Cookie>() { // from class: com.vungle.warren.Vungle.17
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Cookie cookie) {
                if (cookie == null) {
                    cookie = new Cookie(Cookie.CCPA_COOKIE);
                }
                cookie.putValue(Cookie.CCPA_CONSENT_STATUS, consent == Consent.OPTED_OUT ? "opted_out" : "opted_in");
                repository.save(cookie, null, false);
            }
        });
    }

    public static Consent getCCPAStatus() {
        return _instance.ccpaStatus.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Consent getCCPAStatus(Cookie cookie) {
        if (cookie == null) {
            return null;
        }
        return "opted_out".equals(cookie.getString(Cookie.CCPA_CONSENT_STATUS)) ? Consent.OPTED_OUT : Consent.OPTED_IN;
    }

    public static void setHeaderBiddingCallback(HeaderBiddingCallback headerBiddingCallback) {
        Context context = _instance.context;
        if (context == null) {
            return;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        ((RuntimeValues) serviceLocator.getService(RuntimeValues.class)).headerBiddingCallback.set(new HeaderBiddingCallbackWrapper(((Executors) serviceLocator.getService(Executors.class)).getUIExecutor(), headerBiddingCallback));
    }

    public static String getAvailableBidTokens(Context context) {
        return getAvailableBidTokens(context, null, 0);
    }

    public static void updateUserCoppaStatus(boolean z) {
        PrivacyManager.getInstance().updateCoppaStatus(Boolean.valueOf(z));
        if (isInitialized()) {
            Log.e(TAG, "COPPA status changes should be passed before SDK initialization, they will ONLY take into effect during future SDK initializations and sessions");
        }
    }

    @Deprecated
    public static String getAvailableBidTokensBySize(Context context, int i) {
        return getAvailableBidTokens(context, null, i);
    }

    public static String getAvailableBidTokens(Context context, final String str, final int i) {
        if (context == null) {
            Log.e(TAG, "Context is null");
            return null;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        final BidTokenEncoder bidTokenEncoder = (BidTokenEncoder) serviceLocator.getService(BidTokenEncoder.class);
        return (String) new FutureResult(executors.getApiExecutor().submit(new Callable<String>() { // from class: com.vungle.warren.Vungle.18
            @Override // java.util.concurrent.Callable
            public String call() {
                String strEncode = bidTokenEncoder.encode(str, i, Vungle._instance.hbpOrdinalViewCount.incrementAndGet());
                Log.d(Vungle.TAG, "Supertoken is " + strEncode);
                return strEncode;
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
    }

    private void saveConfigExtension(Repository repository, JsonObject jsonObject) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.CONFIG_EXTENSION);
        cookie.putValue(Cookie.CONFIG_EXTENSION, jsonObject.has(Cookie.CONFIG_EXTENSION) ? JsonUtil.getAsString(jsonObject, Cookie.CONFIG_EXTENSION, "") : "");
        repository.save(cookie);
    }

    protected static void deInit() {
        Vungle vungle = _instance;
        Context context = vungle.context;
        if (context != null) {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(context);
            if (serviceLocator.isCreated(CacheManager.class)) {
                ((CacheManager) serviceLocator.getService(CacheManager.class)).removeListener(cacheListener);
            }
            if (serviceLocator.isCreated(Downloader.class)) {
                ((Downloader) serviceLocator.getService(Downloader.class)).cancelAll();
            }
            if (serviceLocator.isCreated(AdLoader.class)) {
                ((AdLoader) serviceLocator.getService(AdLoader.class)).clear();
            }
            vungle.playOperations.clear();
        }
        ServiceLocator.deInit();
        isInitialized = false;
        isDepInit.set(false);
        isInitializing.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stopPlaying() {
        Vungle vungle = _instance;
        if (vungle.context == null) {
            return;
        }
        Intent intent = new Intent(AdContract.AdvertisementBus.ACTION);
        intent.putExtra("command", AdContract.AdvertisementBus.STOP_ALL);
        LocalBroadcastManager.getInstance(vungle.context).sendBroadcast(intent);
    }

    static Context appContext() {
        Vungle vungle = _instance;
        if (vungle != null) {
            return vungle.context;
        }
        return null;
    }
}
