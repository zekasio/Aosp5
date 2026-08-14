package com.vungle.warren;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.vungle.warren.AdConfig;
import com.vungle.warren.OperationSequence;
import com.vungle.warren.analytics.JobDelegateAnalytics;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.AssetPriority;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.admarkup.AdMarkupV2;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.Callback;
import com.vungle.warren.network.Response;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionConstants;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.tasks.DownloadJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.ui.HackMraid;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.UnzipUtility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class AdLoader {
    public static final boolean DEFAULT_LOAD_OPTIMIZATION_ENABLED = false;
    private static final String DOWNLOAD_AD_ASSETS_CONTEXT = "AdLoader#downloadAdAssets; loadAd sequence";
    private static final String DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT = "AdLoader#DownloadAdCallback#onDownloadCompleted; loadAd sequence";
    public static final long EXPONENTIAL_RATE = 2;
    private static final String FETCH_AD_METADATA_CONTEXT = "AdLoader#fetchAdMetadata; loadAd sequence";
    private static final String GET_ASSET_DOWNLOAD_LISTENER_CONTEXT = "AdLoader#getAssetDownloadListener; loadAd sequence";
    private static final String LOAD_AD_EXECUTE_CONTEXT = "AdLoader#loadAd#execute; loadAd sequence";
    private static final String NOT_A_DIR = "not a dir";
    private static final String ON_ASSET_DOWNLOAD_FINISHED_CONTEXT = "AdLoader#onAssetDownloadFinished; loadAd sequence";
    private static final String OP_ID_AND_ADVERTISEMENT_FORMAT = "request = %1$s; advertisement = %2$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_2_3 = "request = %2$s; advertisement = %3$s";
    private static final String PLACEMENT_ID_AND_ADVERTISEMENT_FORMAT_3_4 = "request = %3$s; advertisement = %4$s";
    public static final int RETRY_COUNT = 5;
    public static final long RETRY_DELAY = 2000;
    private static final String STRING_AND_OP_ID_FORMAT = "%1$s; request = %2$s";
    private static final String TAG = "com.vungle.warren.AdLoader";
    public static final String TT_DOWNLOAD_CONTEXT = "ttDownloadContext";
    private final CacheManager cacheManager;
    private final Downloader downloader;
    private final OMInjector omInjector;
    private final Repository repository;
    private final RuntimeValues runtimeValues;
    private final Executors sdkExecutors;
    private final OperationSequence sequence;
    private final VisionController visionController;
    private final VungleStaticApi vungleApi;
    private final VungleApiClient vungleApiClient;
    private final Map<AdRequest, Operation> loadOperations = new ConcurrentHashMap();
    private final Map<AdRequest, Operation> pendingOperations = new ConcurrentHashMap();
    private final List<Operation> startingOperations = new CopyOnWriteArrayList();
    private AdRequest sequenceLoadingRequest = null;
    private final AtomicReference<JobRunner> jobRunnerRef = new AtomicReference<>();
    private boolean adLoadOptimizationEnabled = false;

    public @interface Priority {
        public static final int HIGH = 1;
        public static final int HIGHEST = 0;
        public static final int LOWEST = Integer.MAX_VALUE;
    }

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 0;
        public static final int EXPONENTIAL_ENDLESS_AD = 1;
    }

    private boolean recoverableServerCode(int i) {
        return i == 408 || (500 <= i && i < 600);
    }

    public static class Operation {
        long delay;
        final Set<LoadAdCallback> loadAdCallbacks;
        final AtomicBoolean loading;
        boolean logError;
        int policy;
        int priority;
        final AdRequest request;
        List<DownloadRequest> requests;
        int retry;
        long retryDelay;
        int retryLimit;
        final AdConfig.AdSize size;

        public Operation(AdRequest adRequest, AdConfig.AdSize adSize, long j, long j2, int i, int i2, int i3, boolean z, int i4, LoadAdCallback... loadAdCallbackArr) {
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.loadAdCallbacks = copyOnWriteArraySet;
            this.requests = new CopyOnWriteArrayList();
            this.request = adRequest;
            this.delay = j;
            this.retryDelay = j2;
            this.retryLimit = i;
            this.policy = i2;
            this.retry = i3;
            this.loading = new AtomicBoolean();
            this.size = adSize;
            this.logError = z;
            this.priority = i4;
            if (loadAdCallbackArr != null) {
                copyOnWriteArraySet.addAll(Arrays.asList(loadAdCallbackArr));
            }
        }

        Operation delay(long j) {
            return new Operation(this.request, this.size, j, this.retryDelay, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        Operation retryDelay(long j) {
            return new Operation(this.request, this.size, this.delay, j, this.retryLimit, this.policy, this.retry, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        Operation retry(int i) {
            return new Operation(this.request, this.size, this.delay, this.retryDelay, this.retryLimit, this.policy, i, this.logError, this.priority, (LoadAdCallback[]) this.loadAdCallbacks.toArray(new LoadAdCallback[0]));
        }

        void merge(Operation operation) {
            this.delay = Math.min(this.delay, operation.delay);
            this.retryDelay = Math.min(this.retryDelay, operation.retryDelay);
            this.retryLimit = Math.min(this.retryLimit, operation.retryLimit);
            int i = operation.policy;
            if (i != 0) {
                i = this.policy;
            }
            this.policy = i;
            this.retry = Math.min(this.retry, operation.retry);
            this.logError |= operation.logError;
            this.priority = Math.min(this.priority, operation.priority);
            this.loadAdCallbacks.addAll(operation.loadAdCallbacks);
        }

        public String toString() {
            return "request=" + this.request.toString() + " size=" + this.size.toString() + " priority=" + this.priority + " policy=" + this.policy + " retry=" + this.retry + "/" + this.retryLimit + " delay=" + this.delay + "->" + this.retryDelay + " log=" + this.logError;
        }

        public AdRequest getRequest() {
            return this.request;
        }

        public AdConfig.AdSize getSize() {
            return this.size;
        }

        public boolean getLogError() {
            return this.logError;
        }

        public int getPriority() {
            return this.priority;
        }
    }

    public AdLoader(Executors executors, Repository repository, VungleApiClient vungleApiClient, CacheManager cacheManager, Downloader downloader, RuntimeValues runtimeValues, VungleStaticApi vungleStaticApi, VisionController visionController, OperationSequence operationSequence, OMInjector oMInjector) {
        this.sdkExecutors = executors;
        this.repository = repository;
        this.vungleApiClient = vungleApiClient;
        this.cacheManager = cacheManager;
        this.downloader = downloader;
        this.runtimeValues = runtimeValues;
        this.vungleApi = vungleStaticApi;
        this.visionController = visionController;
        this.sequence = operationSequence;
        this.omInjector = oMInjector;
    }

    public void init(JobRunner jobRunner) {
        this.jobRunnerRef.set(jobRunner);
        this.downloader.init();
    }

    private boolean canReDownload(Advertisement advertisement) {
        List<AdAsset> list;
        if (advertisement == null || (!(advertisement.getState() == 0 || advertisement.getState() == 1) || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0)) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 1) {
                if (!fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(adAsset.serverPath)) {
                return false;
            }
        }
        return true;
    }

    public boolean canPlayAd(Advertisement advertisement) {
        if (advertisement == null || advertisement.getState() != 1) {
            return false;
        }
        return hasAssetsFor(advertisement);
    }

    public boolean canRenderAd(Advertisement advertisement) {
        if (advertisement == null) {
            return false;
        }
        if (advertisement.getState() == 1 || advertisement.getState() == 2) {
            return hasAssetsFor(advertisement);
        }
        return false;
    }

    public void clear() {
        HashSet<AdRequest> hashSet = new HashSet();
        hashSet.addAll(this.loadOperations.keySet());
        hashSet.addAll(this.pendingOperations.keySet());
        for (AdRequest adRequest : hashSet) {
            Operation operationRemove = this.loadOperations.remove(adRequest);
            this.startingOperations.remove(operationRemove);
            onError(operationRemove, 25);
            onError(this.pendingOperations.remove(adRequest), 25);
        }
        for (Operation operation : this.startingOperations) {
            this.startingOperations.remove(operation);
            onError(operation, 25);
        }
        this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.1
            @Override // java.lang.Runnable
            public void run() {
                AdLoader.this.sequenceLoadingRequest = null;
                Iterator<OperationSequence.Entry> it = AdLoader.this.sequence.removeAll().iterator();
                while (it.hasNext()) {
                    AdLoader.this.onError(it.next().operation, 25);
                }
            }
        });
    }

    public boolean isLoading(AdRequest adRequest) {
        Operation operation = this.loadOperations.get(adRequest);
        return operation != null && operation.loading.get();
    }

    private void setLoading(AdRequest adRequest, boolean z) {
        Operation operation = this.loadOperations.get(adRequest);
        if (operation != null) {
            operation.loading.set(z);
        }
    }

    public void loadPendingInternal(AdRequest adRequest) {
        Operation operationRemove = this.pendingOperations.remove(adRequest);
        if (operationRemove == null) {
            return;
        }
        load(operationRemove.delay(0L));
    }

    public void load(final Operation operation) {
        JobRunner jobRunner = this.jobRunnerRef.get();
        if (jobRunner == null) {
            VungleLogger.error("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", operation));
            onError(operation, 9);
            return;
        }
        if (operation.request.getIsExplicit()) {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.LOAD_AD).addData(SessionAttribute.PLACEMENT_ID, operation.request.getPlacementId()).build());
        }
        checkAndUpdateHBPPlacementBannerSize(operation.request.getPlacementId(), operation.size);
        Operation operationRemove = this.pendingOperations.remove(operation.request);
        if (operationRemove != null) {
            operation.merge(operationRemove);
        }
        if (operation.delay <= 0) {
            operation.request.timeStamp.set(System.currentTimeMillis());
            this.startingOperations.add(operation);
            this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AdLoader.this.startingOperations.contains(operation)) {
                        Operation operation2 = operation;
                        Operation operation3 = (Operation) AdLoader.this.loadOperations.get(operation2.request);
                        if (operation3 == null) {
                            OperationSequence.Entry entryRemove = AdLoader.this.sequence.remove(operation2.request);
                            if (entryRemove != null) {
                                entryRemove.operation.merge(operation2);
                                operation2 = entryRemove.operation;
                            }
                            if (operation2.priority <= 0) {
                                AdLoader.this.startLoading(operation2);
                            } else {
                                OperationSequence operationSequence = AdLoader.this.sequence;
                                if (entryRemove == null) {
                                    entryRemove = new OperationSequence.Entry(operation2);
                                }
                                operationSequence.offer(entryRemove);
                                AdLoader.this.tryLoadNextInQueue(null);
                            }
                        } else {
                            int i = operation3.priority;
                            operation3.merge(operation2);
                            if (operation3.priority < i) {
                                AdLoader.this.onChangePriority(operation3);
                            }
                        }
                        AdLoader.this.startingOperations.remove(operation2);
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    AdLoader.this.onError(operation, 39);
                }
            });
        } else {
            this.pendingOperations.put(operation.request, operation);
            jobRunner.execute(DownloadJob.makeJobInfo(operation.request).setDelay(operation.delay).setUpdateCurrent(true));
        }
    }

    private void checkAndUpdateHBPPlacementBannerSize(String str, final AdConfig.AdSize adSize) {
        this.repository.load(str, Placement.class, new Repository.LoadCallback<Placement>() { // from class: com.vungle.warren.AdLoader.4
            @Override // com.vungle.warren.persistence.Repository.LoadCallback
            public void onLoaded(Placement placement) {
                if (placement != null && placement.isMultipleHBPEnabled() && placement.getPlacementAdType() == 1) {
                    AdConfig.AdSize adSize2 = placement.getAdSize();
                    AdConfig.AdSize adSize3 = adSize;
                    if (adSize2 != adSize3) {
                        placement.setAdSize(adSize3);
                        AdLoader.this.repository.save(placement, null, false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoading(Operation operation) {
        this.loadOperations.put(operation.request, operation);
        loadAd(operation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryLoadNextInQueue(AdRequest adRequest) {
        AdRequest adRequest2 = this.sequenceLoadingRequest;
        if (adRequest2 == null || adRequest2.equals(adRequest)) {
            this.sequenceLoadingRequest = null;
            OperationSequence.Entry entryPoll = this.sequence.poll();
            if (entryPoll != null) {
                this.sequenceLoadingRequest = entryPoll.operation.request;
                startLoading(entryPoll.operation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChangePriority(Operation operation) {
        for (DownloadRequest downloadRequest : operation.requests) {
            downloadRequest.setPriority(getAssetPriority(operation.priority, downloadRequest.path));
            this.downloader.updatePriority(downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(Operation operation, int i) {
        VungleLogger.error("AdLoader#onError; loadAd sequence", String.format("Error %1$s occured; operation is %2$s", new VungleException(i), operation != null ? operation : "null"));
        if (operation != null) {
            Iterator<LoadAdCallback> it = operation.loadAdCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onError(operation.request.getPlacementId(), new VungleException(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException reposeCodeToVungleException(int i) {
        if (recoverableServerCode(i)) {
            return new VungleException(22);
        }
        return new VungleException(21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VungleException retrofitToVungleException(Throwable th) {
        if (th instanceof UnknownHostException) {
            return new VungleException(11);
        }
        if (th instanceof IOException) {
            return new VungleException(20);
        }
        return new VungleException(11);
    }

    private void loadAd(Operation operation) {
        Advertisement advertisement;
        List<Advertisement> list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.vungleApi.isInitialized()) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "Vungle is not initialized");
            onDownloadFailed(new VungleException(9), operation.request, null);
            return;
        }
        Placement placement = (Placement) this.repository.load(operation.request.getPlacementId(), Placement.class).get();
        if (placement == null) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "placement not found for " + operation.request);
            onDownloadFailed(new VungleException(13), operation.request, null);
            return;
        }
        if (!placement.isValid()) {
            onDownloadFailed(new VungleException(5), operation.request, null);
            return;
        }
        if (isSizeInvalid(placement, operation.size)) {
            VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "size is invalid, size = " + operation.size);
            onDownloadFailed(new VungleException(28), operation.request, null);
            return;
        }
        if (placement.getPlacementAdType() == 1 && !placement.isMultipleHBPEnabled() && (list = this.repository.findValidAdvertisementsForPlacement(placement.getId(), operation.request.getEventId()).get()) != null) {
            boolean z = false;
            for (Advertisement advertisement2 : list) {
                if (advertisement2.getAdConfig().getAdSize() != operation.size) {
                    try {
                        this.repository.deleteAdvertisement(advertisement2.getId());
                        z = true;
                    } catch (DatabaseHelper.DBException unused) {
                        VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "cannot delete advertisement, request = " + operation.request);
                        onDownloadFailed(new VungleException(26), operation.request, null);
                        return;
                    }
                }
            }
            if (z) {
                loadEndlessIfNeeded(placement, operation.size, 0L, operation.request.getIsExplicit());
            }
        }
        int type = operation.request.getType();
        if (type == 0 || type == 2) {
            advertisement = this.repository.findValidAdvertisementForPlacement(placement.getId(), operation.request.getEventId()).get();
            if (operation.request.getAdMarkup() != null && advertisement == null && operation.request.getAdMarkup().getVersion() == 2) {
                advertisement = ((AdMarkupV2) operation.request.getAdMarkup()).getAdvertisement();
                try {
                    this.repository.save(advertisement);
                } catch (DatabaseHelper.DBException unused2) {
                    Log.e(TAG, "Failed to persist ad from Real Time Ad");
                }
            }
            if (placement.isMultipleHBPEnabled() && operation.request.getType() == 0) {
                if (operation.request.getEventId() == null) {
                    onDownloadFailed(new VungleException(36), operation.request, null);
                    return;
                } else if (advertisement == null) {
                    onDownloadFailed(new VungleException(10), operation.request, null);
                    return;
                }
            }
            if (advertisement != null && canPlayAd(advertisement)) {
                tryLoadNextInQueue(operation.request);
                onReady(operation.request, placement, advertisement);
                return;
            }
            if (canReDownload(advertisement)) {
                Log.d(TAG, "Found valid adv but not ready - downloading content");
                VungleSettings vungleSettings = this.runtimeValues.settings.get();
                if (vungleSettings == null || this.cacheManager.getBytesAvailable() < vungleSettings.getMinimumSpaceForAd()) {
                    if (advertisement.getState() != 4) {
                        try {
                            this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
                        } catch (DatabaseHelper.DBException unused3) {
                            VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply ERROR state, request = " + operation.request);
                            onDownloadFailed(new VungleException(26), operation.request, null);
                            return;
                        }
                    }
                    VungleLogger.error(LOAD_AD_EXECUTE_CONTEXT, "failed to download assets, no space; request = " + operation.request);
                    onDownloadFailed(new VungleException(19), operation.request, null);
                    return;
                }
                setLoading(operation.request, true);
                if (advertisement.getState() != 0) {
                    try {
                        this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                    } catch (DatabaseHelper.DBException unused4) {
                        VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; canReDownload branch", "cannot save/apply NEW state, request = " + operation.request);
                        onDownloadFailed(new VungleException(26), operation.request, null);
                        return;
                    }
                }
                advertisement.setAdRequestStartTime(jCurrentTimeMillis);
                advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                tryLoadNextInQueue(operation.request);
                downloadAdAssets(operation, advertisement);
                return;
            }
        } else {
            if (operation.request.getType() == 1 && isReadyForHBP(operation, this.repository)) {
                tryLoadNextInQueue(operation.request);
                onReady(operation.request, placement, null);
                return;
            }
            advertisement = null;
        }
        if (placement.getWakeupTime() > System.currentTimeMillis()) {
            onDownloadFailed(new VungleException(1), operation.request, null);
            VungleLogger.warn("AdLoader#loadAd#execute; loadAd sequence; snoozed branch", String.format("Placement with id %s is snoozed ", placement.getId()));
            String str = TAG;
            Log.w(str, "Placement " + placement.getId() + " is  snoozed");
            Log.d(str, "Placement " + placement.getId() + " is sleeping rescheduling it ");
            loadEndlessIfNeeded(placement, operation.size, placement.getWakeupTime() - System.currentTimeMillis(), false);
            return;
        }
        String str2 = operation.request.getType() == 1 ? "advs" : "adv";
        String str3 = TAG;
        Log.i(str3, "didn't find cached " + str2 + " for " + operation.request + " downloading");
        if (advertisement != null) {
            try {
                this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 4);
            } catch (DatabaseHelper.DBException unused5) {
                VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", "cannot save/apply ERROR state, request = " + operation.request);
                onDownloadFailed(new VungleException(26), operation.request, null);
                return;
            }
        }
        VungleSettings vungleSettings2 = this.runtimeValues.settings.get();
        if (vungleSettings2 != null && this.cacheManager.getBytesAvailable() < vungleSettings2.getMinimumSpaceForAd()) {
            VungleLogger.error("AdLoader#loadAd#execute; loadAd sequence; last else branch", String.format("no space to load, isAutoCached = %1$s, request = %2$s", Boolean.valueOf(placement.isAutoCached()), operation.request));
            onDownloadFailed(new VungleException(placement.isAutoCached() ? 18 : 17), operation.request, null);
            return;
        }
        Log.d(str3, "No " + str2 + " for placement " + placement.getId() + " getting new data ");
        setLoading(operation.request, true);
        fetchAdMetadata(operation, placement);
    }

    private boolean isReadyForHBP(Operation operation, Repository repository) {
        List<Advertisement> list = repository.findValidAdvertisementsForPlacement(operation.request.getPlacementId(), null).get();
        return list != null && ((long) list.size()) >= operation.request.getAdCount();
    }

    private boolean isSizeInvalid(Placement placement, AdConfig.AdSize adSize) {
        if (placement.getPlacementAdType() != 1 || AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) {
            return placement.getPlacementAdType() == 0 && !AdConfig.AdSize.isDefaultAdSize(adSize);
        }
        return true;
    }

    private void fetchAdMetadata(final Operation operation, Placement placement) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (operation.request.getAdMarkup() instanceof AdMarkupV2) {
            handleAdMetaData(operation, jCurrentTimeMillis, ((AdMarkupV2) operation.request.getAdMarkup()).getAdvertisement(), placement, new JsonObject());
        } else {
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to request ad, request = %1$s, at: %2$d", operation.request, Long.valueOf(jCurrentTimeMillis)));
            this.vungleApiClient.requestAd(operation.request.getPlacementId(), AdConfig.AdSize.isNonMrecBannerAdSize(operation.size) ? operation.size.getName() : "", placement.isHeaderBidding(), this.visionController.isEnabled() ? this.visionController.getPayload() : null).enqueue(new Callback<JsonObject>() { // from class: com.vungle.warren.AdLoader.5
                @Override // com.vungle.warren.network.Callback
                public void onFailure(Call<JsonObject> call, final Throwable th) {
                    VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad failed, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("failed to request ad, request = %1$s, throwable = %2$s", operation.request, th));
                    AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AdLoader.this.onDownloadFailed(AdLoader.this.retrofitToVungleException(th), operation.request, null);
                        }
                    }, new Runnable() { // from class: com.vungle.warren.AdLoader.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AdLoader.this.onCriticalFail(39, operation.request);
                        }
                    });
                }

                @Override // com.vungle.warren.network.Callback
                public void onResponse(Call<JsonObject> call, final Response<JsonObject> response) {
                    VungleLogger.verbose(true, AdLoader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Request ad got response, request = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
                    AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.5.3
                        @Override // java.lang.Runnable
                        public void run() {
                            Placement placement2 = (Placement) AdLoader.this.repository.load(operation.request.getPlacementId(), Placement.class).get();
                            if (placement2 == null) {
                                Log.e(AdLoader.TAG, "Placement metadata not found for requested advertisement.");
                                VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Placement metadata not found for requested advertisement. request = " + operation.request);
                                AdLoader.this.onDownloadFailed(new VungleException(2), operation.request, null);
                                return;
                            }
                            if (!response.isSuccessful()) {
                                long retryAfterHeaderValue = AdLoader.this.vungleApiClient.getRetryAfterHeaderValue(response);
                                if (retryAfterHeaderValue <= 0 || (!placement2.isAutoCached() && !placement2.isMultipleHBPEnabled())) {
                                    Log.e(AdLoader.TAG, "Failed to retrieve advertisement information");
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response was not successful, not retrying;request = %1$s; responseCode = %2$s", operation.request, Integer.valueOf(response.code())));
                                    AdLoader.this.onDownloadFailed(AdLoader.this.reposeCodeToVungleException(response.code()), operation.request, null);
                                    return;
                                } else {
                                    AdLoader.this.loadEndlessIfNeeded(placement2, operation.size, retryAfterHeaderValue, false);
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was not successful, retrying; request = " + operation.request);
                                    AdLoader.this.onDownloadFailed(new VungleException(14), operation.request, null);
                                    return;
                                }
                            }
                            JsonObject jsonObject = (JsonObject) response.body();
                            Log.d(AdLoader.TAG, "Ads Response: " + jsonObject);
                            if (jsonObject != null && jsonObject.has("ads") && !jsonObject.get("ads").isJsonNull()) {
                                JsonArray asJsonArray = jsonObject.getAsJsonArray("ads");
                                if (asJsonArray == null || asJsonArray.size() == 0) {
                                    VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, "Response was successful, but no ads; request = " + operation.request);
                                    AdLoader.this.onDownloadFailed(new VungleException(1), operation.request, null);
                                    return;
                                }
                                JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                                AdLoader.this.handleAdMetaData(operation, jCurrentTimeMillis, asJsonObject, placement2, asJsonObject.get("ad_markup").getAsJsonObject());
                                return;
                            }
                            VungleLogger.error(AdLoader.FETCH_AD_METADATA_CONTEXT, String.format("Response has no ads; placement = %1$s;op.request = %2$s; response = %3$s", placement2, operation.request, jsonObject));
                            AdLoader.this.onDownloadFailed(new VungleException(1), operation.request, null);
                        }
                    }, new Runnable() { // from class: com.vungle.warren.AdLoader.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            AdLoader.this.onCriticalFail(39, operation.request);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdMetaData(Operation operation, long j, JsonObject jsonObject, Placement placement, JsonObject jsonObject2) {
        try {
            handleAdMetaData(operation, j, new Advertisement(jsonObject), placement, jsonObject2);
        } catch (IllegalArgumentException unused) {
            if (jsonObject2.has("sleep")) {
                long asInt = jsonObject2.get("sleep").getAsInt();
                placement.snooze(asInt);
                try {
                    VungleLogger.warn(FETCH_AD_METADATA_CONTEXT, String.format("badAd - snoozed placement %1$s; request = %2$s", placement, operation.request));
                    this.repository.save(placement);
                    loadEndlessIfNeeded(placement, operation.size, 1000 * asInt, false);
                } catch (DatabaseHelper.DBException unused2) {
                    VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("badAd - can't save snoozed placement %1$s; request = %2$s", placement, operation.request));
                    onDownloadFailed(new VungleException(26), operation.request, null);
                    return;
                }
            }
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("badAd; can't proceed %1$s; request = %2$s", placement, operation.request));
            onDownloadFailed(new VungleException(1), operation.request, null);
        }
    }

    private void handleAdMetaData(Operation operation, long j, Advertisement advertisement, Placement placement, JsonObject jsonObject) throws IllegalArgumentException {
        String str;
        int state;
        HeaderBiddingCallback headerBiddingCallback = this.runtimeValues.headerBiddingCallback.get();
        try {
            if (this.visionController.isEnabled()) {
                if (JsonUtil.hasNonNull(jsonObject, "data_science_cache")) {
                    this.visionController.setDataScienceCache(jsonObject.get("data_science_cache").getAsString());
                } else {
                    this.visionController.setDataScienceCache(null);
                }
            }
            Advertisement advertisement2 = (Advertisement) this.repository.load(advertisement.getId(), Advertisement.class).get();
            if (advertisement2 != null && ((state = advertisement2.getState()) == 0 || state == 1 || state == 2)) {
                Log.d(TAG, "Operation Cancelled");
                onDownloadFailed(new VungleException(25), operation.request, null);
                return;
            }
            if (placement.isHeaderBidding() && headerBiddingCallback != null) {
                headerBiddingCallback.onBidTokenAvailable(operation.request.getPlacementId(), advertisement.getBidToken());
            }
            this.repository.deleteAdvertisement(advertisement.getId());
            Set<Map.Entry<String, String>> setEntrySet = advertisement.getDownloadableUrls().entrySet();
            File destinationDir = getDestinationDir(advertisement);
            if (destinationDir != null && destinationDir.isDirectory()) {
                for (Map.Entry<String, String> entry : setEntrySet) {
                    if (isUrlValid(entry.getValue())) {
                        saveAsset(advertisement, destinationDir, entry.getKey(), entry.getValue());
                    } else {
                        VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but one of downloadable urls is neither http nor https : url = %1$s; op.request = %2$s, ad.getId() = %3$s", entry.getValue(), operation.request, advertisement.getId()));
                        onDownloadFailed(new VungleException(11), operation.request, advertisement.getId());
                        return;
                    }
                }
                if (placement.getPlacementAdType() == 1 && (advertisement.getAdType() != 1 || !"banner".equals(advertisement.getTemplateType()))) {
                    if (advertisement.getAdType() != 1) {
                        str = "ad type is not MRAID";
                    } else {
                        str = "advertisement template type is not banner";
                    }
                    VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but placement is banner while %1$s; op.request = %2$s, ad.getId() = %3$s", str, operation.request, advertisement.getId()));
                    onDownloadFailed(new VungleException(1), operation.request, advertisement.getId());
                    return;
                }
                advertisement.getAdConfig().setAdSize(operation.size);
                advertisement.setAdRequestStartTime(j);
                advertisement.setAssetDownloadStartTime(System.currentTimeMillis());
                advertisement.setHeaderBidding(placement.isHeaderBidding());
                this.repository.saveAndApplyState(advertisement, operation.request.getPlacementId(), 0);
                int type = operation.request.getType();
                if (type != 0 && type != 2) {
                    if (operation.request.getType() == 1) {
                        if (isReadyForHBP(operation, this.repository)) {
                            tryLoadNextInQueue(operation.request);
                            onReady(operation.request, placement, null);
                            return;
                        } else {
                            fetchAdMetadata(operation, placement);
                            return;
                        }
                    }
                    return;
                }
                tryLoadNextInQueue(operation.request);
                downloadAdAssets(operation, advertisement);
                return;
            }
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("Response was successful, but adv directory is %1$s; op.request = %2$s, ad.getId() = %3$s", destinationDir == null ? "null" : NOT_A_DIR, operation.request, advertisement.getId()));
            onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.error(FETCH_AD_METADATA_CONTEXT, String.format("BadAd - DBException; can't proceed; placement = %1$s; op.request = %2$s; exception = %3$s", placement, operation.request, e));
            onDownloadFailed(new VungleException(26), operation.request, null);
        }
    }

    File getDestinationDir(Advertisement advertisement) {
        return this.repository.getAdvertisementAssetDirectory(advertisement.getId()).get();
    }

    void saveAsset(Advertisement advertisement, File file, String str, String str2) throws DatabaseHelper.DBException {
        String str3 = file.getPath() + File.separator + str;
        int i = (str3.endsWith(Advertisement.KEY_POSTROLL) || str3.endsWith(Advertisement.KEY_TEMPLATE)) ? 0 : 2;
        AdAsset adAsset = new AdAsset(advertisement.getId(), str2, str3);
        adAsset.status = 0;
        adAsset.fileType = i;
        try {
            this.repository.save(adAsset);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.error("AdLoader#saveAsset; loadAd sequence", String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e));
            throw e;
        }
    }

    private void downloadAdAssets(Operation operation, Advertisement advertisement) {
        operation.requests.clear();
        for (Map.Entry<String, String> entry : advertisement.getDownloadableUrls().entrySet()) {
            if (TextUtils.isEmpty(entry.getKey()) || TextUtils.isEmpty(entry.getValue()) || !URLUtil.isValidUrl(entry.getValue())) {
                VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("One or more ad asset URLs is empty or not valid;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                onDownloadFailed(new VungleException(11), operation.request, null);
                Log.e(TAG, "Aborting, Failed to download Ad assets for: " + advertisement.getId());
                return;
            }
        }
        try {
            this.repository.save(advertisement);
            List<AdAsset> list = this.repository.loadAllAdAssets(advertisement.getId()).get();
            if (list == null) {
                VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot load all ad assets; op.request = %1$s; advertisement = %2$s", operation.request, advertisement));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return;
            }
            boolean z = false;
            for (AdAsset adAsset : list) {
                if (adAsset.status == 3) {
                    if (fileIsValid(new File(adAsset.localPath), adAsset)) {
                        if (FileUtility.isVideoFile(adAsset.serverPath)) {
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).build());
                            z = true;
                        }
                    } else if (adAsset.fileType == 1) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot download ad assets - asset filetype is zip_asset;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                        onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                        return;
                    }
                }
                if (adAsset.status != 4 || adAsset.fileType != 0) {
                    if (TextUtils.isEmpty(adAsset.serverPath)) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot download ad assets - empty ;request = %1$s; advertisement = %2$s", operation.request, advertisement));
                        onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                        return;
                    }
                    DownloadRequest downloadRequest = getDownloadRequest(operation.priority, adAsset, advertisement.getId());
                    if (adAsset.status == 1) {
                        this.downloader.cancelAndAwait(downloadRequest, 1000L);
                        downloadRequest = getDownloadRequest(operation.priority, adAsset, advertisement.getId());
                    }
                    Log.d(TAG, "Starting download for " + adAsset);
                    adAsset.status = 1;
                    try {
                        this.repository.save(adAsset);
                        operation.requests.add(downloadRequest);
                        if (FileUtility.isVideoFile(adAsset.serverPath)) {
                            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).addData(SessionAttribute.URL, adAsset.serverPath).build());
                            z = true;
                        }
                    } catch (DatabaseHelper.DBException e) {
                        VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Can't save asset %1$s; exception = %2$s", adAsset, e));
                        onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                }
            }
            if (!z) {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.ADS_CACHED).addData(SessionAttribute.EVENT_ID, advertisement.getId()).addData(SessionAttribute.VIDEO_CACHED, SessionConstants.NONE).build());
            }
            if (operation.requests.size() == 0) {
                onAssetDownloadFinished(operation, advertisement.getId(), Collections.emptyList(), true);
                return;
            }
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Start to download assets,  request = %1$s at: %2$d", operation.request, Long.valueOf(System.currentTimeMillis())));
            AssetDownloadListener assetDownloadListener = getAssetDownloadListener(advertisement, operation);
            Iterator<DownloadRequest> it = operation.requests.iterator();
            while (it.hasNext()) {
                this.downloader.download(it.next(), assetDownloadListener);
            }
        } catch (DatabaseHelper.DBException unused) {
            VungleLogger.error(DOWNLOAD_AD_ASSETS_CONTEXT, String.format("Cannot save advertisement op.request = %1$s; advertisement = %2$s", operation.request, advertisement));
            onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
        }
    }

    private DownloadRequest getDownloadRequest(int i, AdAsset adAsset, String str) {
        return new DownloadRequest(3, getAssetPriority(i, adAsset.localPath), adAsset.serverPath, adAsset.localPath, false, adAsset.identifier, str);
    }

    private AssetPriority getAssetPriority(int i, String str) {
        return new AssetPriority(Math.max(-2147483646, i), getAssetPriority(str, this.adLoadOptimizationEnabled));
    }

    public static int getAssetPriority(String str, boolean z) {
        if (z) {
            return !str.endsWith(Advertisement.KEY_TEMPLATE) ? 1 : 0;
        }
        return 0;
    }

    /* JADX INFO: renamed from: com.vungle.warren.AdLoader$6, reason: invalid class name */
    class AnonymousClass6 implements AssetDownloadListener {
        AtomicLong downloadCount;
        List<AssetDownloadListener.DownloadError> errors = Collections.synchronizedList(new ArrayList());
        final /* synthetic */ Advertisement val$advertisement;
        final /* synthetic */ Operation val$op;

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        }

        AnonymousClass6(Operation operation, Advertisement advertisement) {
            this.val$op = operation;
            this.val$advertisement = advertisement;
            this.downloadCount = new AtomicLong(operation.requests.size());
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onError(final AssetDownloadListener.DownloadError downloadError, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.1
                @Override // java.lang.Runnable
                public void run() {
                    Log.e(AdLoader.TAG, "Download Failed");
                    DownloadRequest downloadRequest2 = downloadRequest;
                    if (downloadRequest2 != null) {
                        String str = downloadRequest2.cookieString;
                        AdAsset adAsset = TextUtils.isEmpty(str) ? null : (AdAsset) AdLoader.this.repository.load(str, AdAsset.class).get();
                        if (adAsset != null) {
                            AnonymousClass6.this.errors.add(downloadError);
                            adAsset.status = 2;
                            try {
                                AdLoader.this.repository.save(adAsset);
                            } catch (DatabaseHelper.DBException unused) {
                                AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new VungleException(26), 4));
                            }
                        } else {
                            AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 1));
                        }
                    } else {
                        AnonymousClass6.this.errors.add(new AssetDownloadListener.DownloadError(-1, new RuntimeException("error in request"), 4));
                    }
                    if (AnonymousClass6.this.downloadCount.decrementAndGet() <= 0) {
                        AdLoader.this.onAssetDownloadFinished(AnonymousClass6.this.val$op, AnonymousClass6.this.val$advertisement.getId(), AnonymousClass6.this.errors, true);
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.6.2
                @Override // java.lang.Runnable
                public void run() {
                    AdLoader.this.onCriticalFail(39, AnonymousClass6.this.val$op.request);
                }
            });
        }

        @Override // com.vungle.warren.downloader.AssetDownloadListener
        public void onSuccess(final File file, final DownloadRequest downloadRequest) {
            AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.6.3
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    if (!file.exists()) {
                        VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("Downloaded file %1$s doesn't exist", file.getPath()));
                        AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 3), downloadRequest);
                        return;
                    }
                    String str = downloadRequest.cookieString;
                    AdAsset adAsset = str == null ? null : (AdAsset) AdLoader.this.repository.load(str, AdAsset.class).get();
                    if (adAsset != null) {
                        adAsset.fileType = AdLoader.this.isZip(file) ? 0 : 2;
                        adAsset.fileSize = file.length();
                        adAsset.status = 3;
                        try {
                            AdLoader.this.repository.save(adAsset);
                            if (AdLoader.this.isZip(file)) {
                                AdLoader.this.injectOMIfNeeded(AnonymousClass6.this.val$op, AnonymousClass6.this.val$advertisement);
                                AdLoader.this.processTemplate(AnonymousClass6.this.val$op, adAsset, AnonymousClass6.this.val$advertisement);
                            }
                            if (AnonymousClass6.this.downloadCount.decrementAndGet() <= 0) {
                                AdLoader.this.onAssetDownloadFinished(AnonymousClass6.this.val$op, AnonymousClass6.this.val$advertisement.getId(), AnonymousClass6.this.errors, AnonymousClass6.this.val$advertisement.isNativeTemplateType() || !AdLoader.this.isAdLoadOptimizationEnabled(AnonymousClass6.this.val$advertisement));
                                return;
                            }
                            return;
                        } catch (DatabaseHelper.DBException e) {
                            VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("Can't save adAsset %1$s; exception = %2$s", adAsset, e));
                            AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new VungleException(26), 4), downloadRequest);
                            return;
                        }
                    }
                    VungleLogger.error(AdLoader.GET_ASSET_DOWNLOAD_LISTENER_CONTEXT, String.format("adAsset is null because %1$s, downloadRequest = %2$s", str == null ? "id is null" : "repository returned null", downloadRequest));
                    AnonymousClass6.this.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), 1), downloadRequest);
                }
            }, new Runnable() { // from class: com.vungle.warren.AdLoader.6.4
                @Override // java.lang.Runnable
                public void run() {
                    AdLoader.this.onCriticalFail(39, AnonymousClass6.this.val$op.request);
                }
            });
        }
    }

    private AssetDownloadListener getAssetDownloadListener(Advertisement advertisement, Operation operation) {
        return new AnonymousClass6(operation, advertisement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isZip(File file) {
        return file.getName().equals(Advertisement.KEY_POSTROLL) || file.getName().equals(Advertisement.KEY_TEMPLATE);
    }

    private boolean isUrlValid(String str) {
        return !TextUtils.isEmpty(str) && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTemplate(Operation operation, AdAsset adAsset, Advertisement advertisement) throws Throwable {
        if (adAsset.status != 3) {
            onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        File file = new File(adAsset.localPath);
        if (!fileIsValid(file, adAsset)) {
            VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
            onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
            return;
        }
        if (adAsset.fileType == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = TAG;
            VungleLogger.verbose(true, str, TT_DOWNLOAD_CONTEXT, String.format("Start to unzip assets, request  = %1$s, at: %2$d", operation.request, Long.valueOf(jCurrentTimeMillis)));
            try {
                unzipFile(advertisement, adAsset, file, this.repository.loadAllAdAssets(advertisement.getId()).get());
                VungleLogger.verbose(true, str, TT_DOWNLOAD_CONTEXT, String.format("Unzip assets completed, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            } catch (DatabaseHelper.DBException e) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: exception = %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", e, adAsset.toString(), operation.request, advertisement));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return;
            } catch (IOException unused) {
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Unzip failed %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                this.downloader.dropCache(adAsset.serverPath);
                onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return;
            }
        }
        if (isAdLoadOptimizationEnabled(advertisement)) {
            VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Ad ready to play, request  = %1$s, elapsed time = %2$dms", operation.request, Long.valueOf(System.currentTimeMillis() - advertisement.adRequestStartTime)));
            onDownloadCompleted(operation.request, advertisement.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean injectOMIfNeeded(Operation operation, Advertisement advertisement) {
        if (advertisement.getOmEnabled()) {
            try {
                File destinationDir = getDestinationDir(advertisement);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    for (File file : this.omInjector.injectJsFiles(destinationDir)) {
                        AdAsset adAsset = new AdAsset(advertisement.getId(), null, file.getPath());
                        adAsset.fileSize = file.length();
                        adAsset.fileType = 2;
                        adAsset.status = 3;
                        this.repository.save(adAsset);
                    }
                }
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", destinationDir == null ? "null" : NOT_A_DIR, operation.request, advertisement));
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (DatabaseHelper.DBException unused) {
                onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                return false;
            } catch (IOException unused2) {
                onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAssetDownloadFinished(Operation operation, String str, List<AssetDownloadListener.DownloadError> list, boolean z) {
        VungleLogger.verbose(true, TAG, TT_DOWNLOAD_CONTEXT, String.format("Assets download completed, request  = %1$s, at: %2$d", operation.request, Long.valueOf(System.currentTimeMillis())));
        if (list.isEmpty()) {
            Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
            if (advertisement == null) {
                VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", operation.request, str));
                onDownloadFailed(new VungleException(11), operation.request, str);
                return;
            }
            List<AdAsset> list2 = this.repository.loadAllAdAssets(str).get();
            String str2 = "null";
            if (list2 == null || list2.size() == 0) {
                if (list2 != null) {
                    str2 = "empty";
                }
                VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets are %1$s; request = %2$s; advertisement = %3$s", str2, operation.request, str));
                if (z) {
                    onDownloadFailed(new VungleException(24), operation.request, str);
                    return;
                }
                return;
            }
            for (AdAsset adAsset : list2) {
                if (adAsset.status == 3) {
                    File file = new File(adAsset.localPath);
                    if (!fileIsValid(file, adAsset)) {
                        VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Assets file not valid %1$s; asset = %2$s,request = %3$s; advertisement = %4$s", file.getPath(), adAsset.toString(), operation.request, advertisement));
                        if (z) {
                            onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                            return;
                        }
                        return;
                    }
                } else if (adAsset.fileType == 0 && adAsset.status != 4) {
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Zip asset left unprocessed asset = %1$s,request = %2$s; advertisement = %3$s", adAsset.toString(), operation.request, advertisement));
                    onDownloadFailed(new VungleException(24), operation.request, advertisement.getId());
                    return;
                }
            }
            if (advertisement.getAdType() == 1) {
                File destinationDir = getDestinationDir(advertisement);
                if (destinationDir == null || !destinationDir.isDirectory()) {
                    if (destinationDir != null) {
                        str2 = NOT_A_DIR;
                    }
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Mraid ad; bad destinationDir - %1$srequest = %2$s; advertisement = %3$s", str2, operation.request, advertisement));
                    if (z) {
                        onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                    return;
                }
                Log.d(TAG, "saving MRAID for " + advertisement.getId());
                advertisement.setMraidAssetDir(destinationDir);
                try {
                    this.repository.save(advertisement);
                } catch (DatabaseHelper.DBException e) {
                    VungleLogger.error(ON_ASSET_DOWNLOAD_FINISHED_CONTEXT, String.format("Issue(s) with database: can't save advertisement;exception = %1$s; request = %2$s; advertisement = %3$s", e, operation.request, advertisement));
                    if (z) {
                        onDownloadFailed(new VungleException(26), operation.request, advertisement.getId());
                        return;
                    }
                    return;
                }
            }
            if (z) {
                onDownloadCompleted(operation.request, advertisement.getId());
                return;
            }
            return;
        }
        Iterator<AssetDownloadListener.DownloadError> it = list.iterator();
        VungleException vungleException = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AssetDownloadListener.DownloadError next = it.next();
            if (VungleException.getExceptionCode(next.cause) == 26) {
                vungleException = new VungleException(26);
                break;
            }
            if ((recoverableServerCode(next.serverCode) && next.reason == 1) || next.reason == 0) {
                vungleException = new VungleException(23);
            } else {
                vungleException = new VungleException(24);
            }
            if (vungleException.getExceptionCode() == 24) {
                break;
            }
        }
        if (z) {
            onDownloadFailed(vungleException, operation.request, str);
        }
    }

    public void onDownloadCompleted(AdRequest adRequest, String str) {
        Log.d(TAG, "download completed " + adRequest);
        Placement placement = (Placement) this.repository.load(adRequest.getPlacementId(), Placement.class).get();
        if (placement == null) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("loaded placement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
            onDownloadFailed(new VungleException(13), adRequest, str);
            return;
        }
        Advertisement advertisement = TextUtils.isEmpty(str) ? null : (Advertisement) this.repository.load(str, Advertisement.class).get();
        if (advertisement == null) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("advertisement is null: request = %1$s; advertisementId = %2$s", adRequest, str));
            onDownloadFailed(new VungleException(11), adRequest, str);
            return;
        }
        advertisement.setFinishedDownloadingTime(System.currentTimeMillis());
        try {
            this.repository.saveAndApplyState(advertisement, adRequest.getPlacementId(), 1);
            onReady(adRequest, placement, advertisement);
        } catch (DatabaseHelper.DBException e) {
            VungleLogger.error(DOWNLOAD_AD_CALLBACK_ON_DOWNLOAD_COMPLETED_CONTEXT, String.format("Can't save/apply state READY: exception = %1$s;request = %2$s; advertisement = %3$s", e, adRequest, advertisement));
            onDownloadFailed(new VungleException(26), adRequest, str);
        }
    }

    public void onReady(AdRequest adRequest, Placement placement, Advertisement advertisement) {
        setLoading(adRequest, false);
        HeaderBiddingCallback headerBiddingCallback = this.runtimeValues.headerBiddingCallback.get();
        if (advertisement != null && placement.isHeaderBidding() && headerBiddingCallback != null) {
            headerBiddingCallback.adAvailableForBidToken(adRequest.getPlacementId(), advertisement.getBidToken());
        }
        String str = TAG;
        Log.i(str, "found already cached valid adv, calling onAdLoad callback for request " + adRequest);
        InitCallback initCallback = this.runtimeValues.initCallback.get();
        int type = adRequest.getType();
        if (placement.isAutoCached() && initCallback != null && (type == 2 || type == 0)) {
            initCallback.onAutoCacheAdAvailable(adRequest.getPlacementId());
        }
        Operation operationRemove = this.loadOperations.remove(adRequest);
        String id = advertisement != null ? advertisement.getId() : null;
        if (operationRemove != null) {
            placement.setAdSize(operationRemove.size);
            try {
                this.repository.save(placement);
                Log.i(str, "loading took " + (System.currentTimeMillis() - adRequest.timeStamp.get()) + "ms for:" + adRequest);
                if (adRequest.getIsExplicit()) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.LOAD_AD_END).addData(SessionAttribute.SUCCESS, true).addData(SessionAttribute.PLACEMENT_ID, placement.getId()).build());
                }
                for (LoadAdCallback loadAdCallback : operationRemove.loadAdCallbacks) {
                    if (loadAdCallback instanceof LoadNativeAdCallbackWrapper) {
                        ((LoadNativeAdCallbackWrapper) loadAdCallback).onAdLoad(advertisement);
                    } else {
                        loadAdCallback.onAdLoad(adRequest.getPlacementId());
                    }
                }
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.AD_AVAILABLE).addData(SessionAttribute.EVENT_ID, advertisement != null ? advertisement.getId() : null).addData(SessionAttribute.PLACEMENT_ID, adRequest.getPlacementId()).build());
                if (adRequest.getIsExplicit()) {
                    sendWinNotification(operationRemove, advertisement != null ? advertisement.getWinNotifications() : new ArrayList<>());
                }
            } catch (DatabaseHelper.DBException e) {
                VungleLogger.error("AdLoader#DownloadAdCallback#onReady; loadAd sequence", String.format("Can't save placement: exception = %1$s;placement = %2$s; advertisement = %3$s", e, placement, advertisement));
                onDownloadFailed(new VungleException(26), adRequest, id);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDownloadFailed(com.vungle.warren.error.VungleException r12, com.vungle.warren.AdRequest r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.onDownloadFailed(com.vungle.warren.error.VungleException, com.vungle.warren.AdRequest, java.lang.String):void");
    }

    public void onCriticalFail(int i, AdRequest adRequest) {
        onError(this.loadOperations.remove(adRequest), i);
    }

    public void load(AdRequest adRequest, AdConfig adConfig, LoadAdCallback loadAdCallback) {
        load(new Operation(adRequest, adConfig.getAdSize(), 0L, RETRY_DELAY, 5, 0, 0, true, 0, loadAdCallback));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadEndlessIfNeeded(com.vungle.warren.model.Placement r16, com.vungle.warren.AdConfig.AdSize r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r16.isMultipleHBPEnabled()
            if (r1 == 0) goto L1c
            int r1 = r16.getPlacementAdType()
            r2 = 1
            if (r1 != r2) goto L1c
            boolean r1 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r17)
            if (r1 != 0) goto L1c
            com.vungle.warren.AdConfig$AdSize r1 = r16.getRecommendedAdSize()
            r4 = r1
            r1 = r16
            goto L20
        L1c:
            r1 = r16
            r4 = r17
        L20:
            boolean r2 = r15.isSizeInvalid(r1, r4)
            if (r2 == 0) goto L27
            return
        L27:
            int r2 = r16.getAutoCachePriority()
            com.vungle.warren.RuntimeValues r3 = r0.runtimeValues
            java.util.concurrent.atomic.AtomicReference<com.vungle.warren.VungleSettings> r3 = r3.settings
            java.lang.Object r3 = r3.get()
            com.vungle.warren.VungleSettings r3 = (com.vungle.warren.VungleSettings) r3
            r5 = 0
            if (r3 == 0) goto L48
            java.lang.String r6 = r16.getId()
            java.lang.String r3 = r3.getPriorityPlacement()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L48
            r13 = 0
            goto L49
        L48:
            r13 = r2
        L49:
            boolean r2 = r16.isMultipleHBPEnabled()
            if (r2 == 0) goto L68
            boolean r2 = r16.isSingleHBPEnabled()
            if (r2 != 0) goto L68
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            int r1 = r16.getMaxHbCache()
            long r9 = (long) r1
            r8 = 1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
            goto L7d
        L68:
            boolean r2 = r16.isSingleHBPEnabled()
            if (r2 == 0) goto L7f
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            r8 = 2
            r9 = 1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
        L7d:
            r3 = r2
            goto L97
        L7f:
            boolean r2 = r16.isAutoCached()
            if (r2 == 0) goto L95
            com.vungle.warren.AdRequest r2 = new com.vungle.warren.AdRequest
            java.lang.String r7 = r16.getId()
            r8 = 0
            r9 = 1
            r6 = r2
            r11 = r20
            r6.<init>(r7, r8, r9, r11)
            goto L7d
        L95:
            r1 = 0
            r3 = r1
        L97:
            if (r3 == 0) goto Lac
            com.vungle.warren.AdLoader$Operation r1 = new com.vungle.warren.AdLoader$Operation
            r12 = 0
            com.vungle.warren.LoadAdCallback[] r14 = new com.vungle.warren.LoadAdCallback[r5]
            r7 = 2000(0x7d0, double:9.88E-321)
            r9 = 5
            r10 = 1
            r11 = 0
            r2 = r1
            r5 = r18
            r2.<init>(r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r15.load(r1)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.AdLoader.loadEndlessIfNeeded(com.vungle.warren.model.Placement, com.vungle.warren.AdConfig$AdSize, long, boolean):void");
    }

    private void unzipFile(Advertisement advertisement, AdAsset adAsset, final File file, List<AdAsset> list) throws Throwable {
        final ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset2 : list) {
            if (adAsset2.fileType == 2) {
                arrayList.add(adAsset2.localPath);
            }
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            VungleLogger.error("AdLoader#unzipFile; loadAd sequence", String.format("Can't unzip file: destination dir is %1$s; advertisement = %2$s", destinationDir == null ? "null" : NOT_A_DIR, advertisement));
            throw new IOException("Unable to access Destination Directory");
        }
        List<File> listUnzip = UnzipUtility.unzip(file.getPath(), destinationDir.getPath(), new UnzipUtility.Filter() { // from class: com.vungle.warren.AdLoader.7
            @Override // com.vungle.warren.utility.UnzipUtility.Filter
            public boolean matches(String str) {
                File file2 = new File(str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file3 = new File((String) it.next());
                    if (file3.equals(file2)) {
                        return false;
                    }
                    if (file2.getPath().startsWith(file3.getPath() + File.separator)) {
                        return false;
                    }
                }
                return true;
            }
        });
        if (file.getName().equals(Advertisement.KEY_TEMPLATE)) {
            File file2 = new File(destinationDir.getPath() + File.separator + "mraid.js");
            if (file2.exists()) {
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                HackMraid.apply(printWriter);
                printWriter.close();
            }
        }
        for (File file3 : listUnzip) {
            AdAsset adAsset3 = new AdAsset(advertisement.getId(), null, file3.getPath());
            adAsset3.fileSize = file3.length();
            adAsset3.fileType = 1;
            adAsset3.parentId = adAsset.identifier;
            adAsset3.status = 3;
            this.repository.save(adAsset3);
        }
        Log.d(TAG, "Uzipped " + destinationDir);
        FileUtility.printDirectoryTree(destinationDir);
        adAsset.status = 4;
        this.repository.save(adAsset, new Repository.SaveCallback() { // from class: com.vungle.warren.AdLoader.8
            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onError(Exception exc) {
            }

            @Override // com.vungle.warren.persistence.Repository.SaveCallback
            public void onSaved() {
                AdLoader.this.sdkExecutors.getBackgroundExecutor().execute(new Runnable() { // from class: com.vungle.warren.AdLoader.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            FileUtility.delete(file);
                        } catch (IOException e) {
                            Log.e(AdLoader.TAG, "Error on deleting zip assets archive", e);
                        }
                    }
                });
            }
        });
    }

    boolean hasAssetsFor(Advertisement advertisement) throws IllegalStateException {
        List<AdAsset> list;
        if (advertisement == null || (list = this.repository.loadAllAdAssets(advertisement.getId()).get()) == null || list.size() == 0) {
            return false;
        }
        for (AdAsset adAsset : list) {
            if (adAsset.fileType == 0) {
                if (adAsset.status != 4) {
                    return false;
                }
            } else if (!isUrlValid(adAsset.serverPath) || !isAdLoadOptimizationEnabled(advertisement)) {
                if (adAsset.status != 3 || !fileIsValid(new File(adAsset.localPath), adAsset)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAdLoadOptimizationEnabled(Advertisement advertisement) {
        return this.adLoadOptimizationEnabled && advertisement != null && advertisement.getAdType() == 1;
    }

    void sendWinNotification(Operation operation, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        JobRunner jobRunner = this.jobRunnerRef.get();
        if (jobRunner == null) {
            VungleLogger.error("AdLoader#load; loadAd sequence", String.format("Cannot load operation %s; job runner is null", operation));
            onError(operation, 9);
        } else {
            new JobDelegateAnalytics(jobRunner).ping((String[]) list.toArray(new String[0]));
        }
    }

    private boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.fileSize;
    }

    Collection<Operation> getPendingOperations() {
        return this.pendingOperations.values();
    }

    Collection<Operation> getRunningOperations() {
        return this.loadOperations.values();
    }

    void setAdLoadOptimizationEnabled(boolean z) {
        this.adLoadOptimizationEnabled = z;
    }

    public void dropCache(String str) {
        List<AdAsset> list = this.repository.loadAllAdAssets(str).get();
        if (list == null) {
            Log.w(TAG, "No assets found in ad cache to cleanup");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<AdAsset> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().serverPath);
        }
        Advertisement advertisement = (Advertisement) this.repository.load(str, Advertisement.class).get();
        if (advertisement != null) {
            hashSet.addAll(advertisement.getDownloadableUrls().values());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.downloader.dropCache((String) it2.next());
        }
    }
}
