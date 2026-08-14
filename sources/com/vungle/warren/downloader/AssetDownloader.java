package com.vungle.warren.downloader;

import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.Pair;
import com.vungle.warren.AdLoader;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.downloader.AssetDownloadListener;
import com.vungle.warren.downloader.DownloadRequest;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.utility.NetworkProvider;
import com.vungle.warren.utility.VungleThreadPoolExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public class AssetDownloader implements Downloader {
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String ACCEPT_RANGES = "Accept-Ranges";
    private static final String BYTES = "bytes";
    private static final int CONNECTION_RETRY_TIMEOUT = 300;
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_RANGE = "Content-Range";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    static final String DOWNLOAD_COMPLETE = "DOWNLOAD_COMPLETE";
    static final String DOWNLOAD_URL = "Download_URL";
    static final String ETAG = "ETag";
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final String IF_MODIFIED_SINCE = "If-Modified-Since";
    private static final String IF_NONE_MATCH = "If-None-Match";
    private static final String IF_RANGE = "If-Range";
    private static final String KEY_TEMPLATE = "template";
    static final String LAST_CACHE_VERIFICATION = "Last-Cache-Verification";
    static final String LAST_DOWNLOAD = "Last-Download";
    static final String LAST_MODIFIED = "Last-Modified";
    private static final String LOAD_CONTEXT = "AssetDownloader#load; loadAd sequence";
    private static final long MAX_PERCENT = 100;
    private static final int MAX_RECONNECT_ATTEMPTS = 10;
    private static final String META_POSTFIX_EXT = ".vng_meta";
    private static final int PROGRESS_STEP = 5;
    private static final String RANGE = "Range";
    private static final int RANGE_NOT_SATISFIABLE = 416;
    private static final int RETRY_COUNT_ON_CONNECTION_LOST = 5;
    private static final int TIMEOUT = 30;
    private final Object addLock;
    private final DownloaderCache cache;
    private final VungleThreadPoolExecutor downloadExecutor;
    private boolean isCacheEnabled;
    int maxReconnectAttempts;
    private Map<String, DownloadRequestMediator> mediators;
    private final NetworkProvider.NetworkListener networkListener;
    private final NetworkProvider networkProvider;
    private final OkHttpClient okHttpClient;
    private volatile int progressStep;
    int reconnectTimeout;
    int retryCountOnConnectionLost;
    private final long timeWindow;
    private List<DownloadRequest> transitioning;
    private final ExecutorService uiExecutor;
    public static final long VERIFICATION_WINDOW = TimeUnit.HOURS.toMillis(24);
    private static final String TAG = "AssetDownloader";

    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    public AssetDownloader(NetworkProvider networkProvider, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this(null, 0L, networkProvider, vungleThreadPoolExecutor, executorService);
    }

    public AssetDownloader(DownloaderCache downloaderCache, long j, NetworkProvider networkProvider, VungleThreadPoolExecutor vungleThreadPoolExecutor, ExecutorService executorService) {
        this.retryCountOnConnectionLost = 5;
        this.maxReconnectAttempts = 10;
        this.reconnectTimeout = 300;
        this.mediators = new ConcurrentHashMap();
        this.transitioning = new ArrayList();
        this.addLock = new Object();
        this.progressStep = 5;
        this.isCacheEnabled = true;
        this.networkListener = new NetworkProvider.NetworkListener() { // from class: com.vungle.warren.downloader.AssetDownloader.5
            @Override // com.vungle.warren.utility.NetworkProvider.NetworkListener
            public void onChanged(int i) {
                Log.d(AssetDownloader.TAG, "Network changed: " + i);
                AssetDownloader.this.onNetworkChanged(i);
            }
        };
        this.cache = downloaderCache;
        this.timeWindow = j;
        this.downloadExecutor = vungleThreadPoolExecutor;
        this.networkProvider = networkProvider;
        this.uiExecutor = executorService;
        this.okHttpClient = new OkHttpClient.Builder().readTimeout(30L, TimeUnit.SECONDS).connectTimeout(30L, TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true).build();
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            VungleLogger.error("AssetDownloader#download; loadAd sequence", "downloadRequest is null");
            if (assetDownloadListener != null) {
                deliverError(null, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is null"), 1));
            }
        } else {
            VungleLogger.verbose(true, TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Waiting for download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
            this.transitioning.add(downloadRequest);
            this.downloadExecutor.execute(new DownloadPriorityRunnable(new AssetPriority(DownloadRequest.Priority.CRITICAL, 0)) { // from class: com.vungle.warren.downloader.AssetDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    VungleLogger.verbose(true, AssetDownloader.TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Start to download asset %1$s, at: %2$d", downloadRequest, Long.valueOf(System.currentTimeMillis())));
                    try {
                        AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
                    } catch (IOException e) {
                        VungleLogger.error("AssetDownloader#download; loadAd sequence", "cannot launch request due to " + e);
                        Log.e(AssetDownloader.TAG, "Error on launching request", e);
                        AssetDownloader.this.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, e, 1));
                    }
                }
            }, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.2
                @Override // java.lang.Runnable
                public void run() {
                    AssetDownloader.this.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchRequest(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        synchronized (this.addLock) {
            synchronized (this) {
                if (downloadRequest.isCancelled()) {
                    this.transitioning.remove(downloadRequest);
                    Log.d(TAG, "Request " + downloadRequest.url + " is cancelled before starting");
                    new AssetDownloadListener.Progress().status = 3;
                    deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IOException("Cancelled"), 1));
                    return;
                }
                DownloadRequestMediator downloadRequestMediator = this.mediators.get(mediatorKeyFromRequest(downloadRequest));
                if (downloadRequestMediator == null) {
                    this.transitioning.remove(downloadRequest);
                    DownloadRequestMediator downloadRequestMediatorMakeNewMediator = makeNewMediator(downloadRequest, assetDownloadListener);
                    this.mediators.put(downloadRequestMediatorMakeNewMediator.key, downloadRequestMediatorMakeNewMediator);
                    load(downloadRequestMediatorMakeNewMediator);
                    return;
                }
                try {
                    downloadRequestMediator.lock();
                    synchronized (this) {
                        this.transitioning.remove(downloadRequest);
                        if (downloadRequestMediator.is(6) || (downloadRequestMediator.is(3) && !downloadRequest.isCancelled())) {
                            DownloadRequestMediator downloadRequestMediatorMakeNewMediator2 = makeNewMediator(downloadRequest, assetDownloadListener);
                            this.mediators.put(downloadRequestMediator.key, downloadRequestMediatorMakeNewMediator2);
                            load(downloadRequestMediatorMakeNewMediator2);
                        } else if (downloadRequestMediator.isCacheable) {
                            downloadRequestMediator.add(downloadRequest, assetDownloadListener);
                            if (downloadRequestMediator.is(2)) {
                                load(downloadRequestMediator);
                            }
                        } else {
                            VungleLogger.warn("AssetDownloader#launchRequest; loadAd sequence", "request " + downloadRequest + " is already running");
                            deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new IllegalArgumentException("DownloadRequest is already running"), 1));
                        }
                    }
                } finally {
                    downloadRequestMediator.unlock();
                }
            }
        }
    }

    private DownloadRequestMediator makeNewMediator(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) throws IOException {
        File file;
        File metaFile;
        String str;
        boolean z;
        if (!isCacheEnabled()) {
            file = new File(downloadRequest.path);
            metaFile = new File(file.getPath() + META_POSTFIX_EXT);
            str = downloadRequest.url + " " + downloadRequest.path;
            z = false;
        } else {
            file = this.cache.getFile(downloadRequest.url);
            metaFile = this.cache.getMetaFile(file);
            str = downloadRequest.url;
            z = true;
        }
        Log.d(TAG, "Destination file " + file.getPath());
        return new DownloadRequestMediator(downloadRequest, assetDownloadListener, file.getPath(), metaFile.getPath(), z, str);
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized List<DownloadRequest> getAllRequests() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = new ArrayList(this.mediators.values()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((DownloadRequestMediator) it.next()).requests());
        }
        arrayList.addAll(this.transitioning);
        return arrayList;
    }

    private synchronized void load(final DownloadRequestMediator downloadRequestMediator) {
        addNetworkListener();
        downloadRequestMediator.set(1);
        this.downloadExecutor.execute(new DownloadPriorityRunnable(downloadRequestMediator) { // from class: com.vungle.warren.downloader.AssetDownloader.3
            /* JADX WARN: Code restructure failed: missing block: B:205:0x05d1, code lost:
            
                r2.flush();
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x05db, code lost:
            
                if (r3.is(1) == false) goto L212;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x05dd, code lost:
            
                r3 = java.lang.System.currentTimeMillis();
                r0.put(com.vungle.warren.downloader.AssetDownloader.DOWNLOAD_COMPLETE, java.lang.Boolean.TRUE.toString());
                r0.put(com.vungle.warren.downloader.AssetDownloader.LAST_CACHE_VERIFICATION, java.lang.String.valueOf(r3));
                r0.put(com.vungle.warren.downloader.AssetDownloader.LAST_DOWNLOAD, java.lang.String.valueOf(r3));
                r31.this$0.saveMeta(r13, r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x060b, code lost:
            
                if (com.vungle.warren.utility.FileUtility.isVideoFile(r3.key) == false) goto L210;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x060d, code lost:
            
                com.vungle.warren.SessionTracker.getInstance().trackEvent(new com.vungle.warren.model.SessionData.Builder().setEvent(com.vungle.warren.session.SessionEvent.ADS_CACHED).addData(com.vungle.warren.session.SessionAttribute.URL, r3.key).addData(com.vungle.warren.session.SessionAttribute.VIDEO_CACHED, "cdn").build());
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x0635, code lost:
            
                r3.set(4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x063d, code lost:
            
                r11.status = 6;
                r31.this$0.onProgressMediator(r3, r11);
                android.util.Log.d(com.vungle.warren.downloader.AssetDownloader.TAG, "State has changed, cancelling download " + r31.this$0.debugString(r3));
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0666, code lost:
            
                if (r6 == null) goto L218;
             */
            /* JADX WARN: Code restructure failed: missing block: B:216:0x066c, code lost:
            
                if (r6.body() == null) goto L218;
             */
            /* JADX WARN: Code restructure failed: missing block: B:217:0x066e, code lost:
            
                r6.body().close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:218:0x0675, code lost:
            
                if (r26 == null) goto L220;
             */
            /* JADX WARN: Code restructure failed: missing block: B:219:0x0677, code lost:
            
                r26.cancel();
             */
            /* JADX WARN: Code restructure failed: missing block: B:220:0x067a, code lost:
            
                android.util.Log.d(com.vungle.warren.downloader.AssetDownloader.TAG, "request is done " + r31.this$0.debugString(r3));
                r0 = r3.getStatus();
             */
            /* JADX WARN: Code restructure failed: missing block: B:221:0x069e, code lost:
            
                if (r0 == 2) goto L233;
             */
            /* JADX WARN: Code restructure failed: missing block: B:223:0x06a1, code lost:
            
                if (r0 == 3) goto L232;
             */
            /* JADX WARN: Code restructure failed: missing block: B:225:0x06a4, code lost:
            
                if (r0 == 4) goto L231;
             */
            /* JADX WARN: Code restructure failed: missing block: B:227:0x06a7, code lost:
            
                if (r0 == 5) goto L230;
             */
            /* JADX WARN: Code restructure failed: missing block: B:228:0x06a9, code lost:
            
                if (r22 != false) goto L233;
             */
            /* JADX WARN: Code restructure failed: missing block: B:229:0x06ab, code lost:
            
                r31.this$0.removeMediator(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:230:0x06b3, code lost:
            
                r7 = r23;
                r31.this$0.onErrorMediator(r7, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:231:0x06bd, code lost:
            
                r7 = r23;
                r31.this$0.onSuccessMediator(r12, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:232:0x06c7, code lost:
            
                r7 = r23;
                r31.this$0.onCancelledMediator(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:233:0x06d1, code lost:
            
                r7 = r23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:234:0x06d3, code lost:
            
                android.util.Log.d(com.vungle.warren.downloader.AssetDownloader.TAG, "Done with request in state " + r3.getStatus() + " " + r31.this$0.debugString(r3));
                r8 = r31.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:235:0x0700, code lost:
            
                monitor-enter(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:236:0x0701, code lost:
            
                r31.this$0.removeNetworkListener();
             */
            /* JADX WARN: Code restructure failed: missing block: B:237:0x0706, code lost:
            
                monitor-exit(r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:238:0x0707, code lost:
            
                com.vungle.warren.utility.FileUtility.closeQuietly(r2);
                com.vungle.warren.utility.FileUtility.closeQuietly(r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:239:0x0713, code lost:
            
                if (r31.this$0.cache == null) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:241:0x0719, code lost:
            
                if (r3.isCacheable == false) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:242:0x071b, code lost:
            
                r31.this$0.cache.stopTracking(r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:243:0x072a, code lost:
            
                if (r31.this$0.isCacheEnabled() != false) goto L245;
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x072c, code lost:
            
                r31.this$0.cache.clear();
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x0736, code lost:
            
                r31.this$0.cache.purge();
             */
            /* JADX WARN: Code restructure failed: missing block: B:246:0x073f, code lost:
            
                r14 = r7;
                r6 = r21;
                r15 = r22;
                r0 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:250:0x074b, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:254:0x074f, code lost:
            
                r7 = r23;
                r3 = 2;
                r4 = 3;
                r18 = r2;
                r2 = r6;
                r6 = r21;
                r10 = r25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:461:0x0c12, code lost:
            
                r5 = r16;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:372:0x0a3d A[Catch: all -> 0x0a33, TRY_ENTER, TryCatch #3 {all -> 0x0a33, blocks: (B:366:0x0a2c, B:372:0x0a3d, B:375:0x0a49, B:377:0x0a58, B:379:0x0a60, B:414:0x0b39, B:472:0x0c29), top: B:571:0x0a2c }] */
            /* JADX WARN: Removed duplicated region for block: B:439:0x0bc0  */
            /* JADX WARN: Removed duplicated region for block: B:459:0x0c0f  */
            /* JADX WARN: Removed duplicated region for block: B:469:0x0c24  */
            /* JADX WARN: Removed duplicated region for block: B:525:0x0d4b  */
            /* JADX WARN: Removed duplicated region for block: B:529:0x0d5a  */
            /* JADX WARN: Removed duplicated region for block: B:532:0x0d7c  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0189 A[Catch: all -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0145, blocks: (B:12:0x0068, B:47:0x0170, B:49:0x017a, B:53:0x0189, B:60:0x01db), top: B:602:0x0170 }] */
            /* JADX WARN: Removed duplicated region for block: B:545:0x0dda  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
            /* JADX WARN: Removed duplicated region for block: B:571:0x0a2c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:583:0x0dfa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:611:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02dd  */
            /* JADX WARN: Type inference failed for: r14v16 */
            /* JADX WARN: Type inference failed for: r14v21 */
            /* JADX WARN: Type inference failed for: r14v22 */
            /* JADX WARN: Type inference failed for: r14v23 */
            /* JADX WARN: Type inference failed for: r14v24 */
            /* JADX WARN: Type inference failed for: r14v25 */
            /* JADX WARN: Type inference failed for: r14v5, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r18v13 */
            /* JADX WARN: Type inference failed for: r18v14 */
            /* JADX WARN: Type inference failed for: r18v15 */
            /* JADX WARN: Type inference failed for: r18v2, types: [java.io.Closeable] */
            /* JADX WARN: Type inference failed for: r18v6 */
            /* JADX WARN: Type inference failed for: r18v7 */
            /* JADX WARN: Type inference failed for: r18v8 */
            /* JADX WARN: Type inference failed for: r26v19 */
            /* JADX WARN: Type inference failed for: r26v2, types: [okhttp3.Call] */
            /* JADX WARN: Type inference failed for: r26v39 */
            /* JADX WARN: Type inference failed for: r26v40 */
            /* JADX WARN: Type inference failed for: r26v41 */
            /* JADX WARN: Type inference failed for: r26v42 */
            /* JADX WARN: Type inference failed for: r26v43 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:656:? -> B:462:0x0c15). Please report as a decompilation issue!!! */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 3647
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.AnonymousClass3.run():void");
            }
        }, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.4
            @Override // java.lang.Runnable
            public void run() {
                AssetDownloader.this.onErrorMediator(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), downloadRequestMediator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheOnFail(DownloadRequestMediator downloadRequestMediator, File file, Map<String, String> map, int i) {
        return this.cache != null && downloadRequestMediator.isCacheable && i != 200 && i != 416 && i != 206 && Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE)) && file.exists() && file.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeMediator(DownloadRequestMediator downloadRequestMediator) {
        this.mediators.remove(downloadRequestMediator.key);
    }

    private void addNetworkListener() {
        Log.d(TAG, "Adding network listner");
        this.networkProvider.addListener(this.networkListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pause(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress, AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequestMediator.is(3) || isAnyConnected(downloadRequestMediator)) {
            return false;
        }
        progress.status = 2;
        AssetDownloadListener.Progress progressCopy = AssetDownloadListener.Progress.copy(progress);
        boolean z = false;
        for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
            DownloadRequest downloadRequest = pair.first;
            if (downloadRequest != null) {
                if (!downloadRequest.pauseOnConnectionLost) {
                    downloadRequestMediator.remove(downloadRequest);
                    deliverError(downloadRequest, pair.second, downloadError);
                } else {
                    downloadRequestMediator.set(2);
                    Log.d(TAG, "Pausing download " + debugString(downloadRequest));
                    deliverProgress(progressCopy, pair.first, pair.second);
                    z = true;
                }
            }
        }
        if (!z) {
            downloadRequestMediator.set(5);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder("Attempted to pause - ");
        sb.append(downloadRequestMediator.getStatus() == 2);
        Log.d(str, sb.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sleep(long j) {
        try {
            Thread.sleep(Math.max(0L, j));
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> makeMeta(File file, Headers headers, String str) throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        map.put(DOWNLOAD_URL, str);
        map.put("ETag", headers.get("ETag"));
        map.put("Last-Modified", headers.get("Last-Modified"));
        map.put("Accept-Ranges", headers.get("Accept-Ranges"));
        map.put("Content-Encoding", headers.get("Content-Encoding"));
        saveMeta(file, map);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkEncoding(File file, File file2, Headers headers) throws IOException {
        String str = headers.get("Content-Encoding");
        if (str == null || "gzip".equalsIgnoreCase(str) || "identity".equalsIgnoreCase(str)) {
            return;
        }
        deleteFileAndMeta(file, file2, false);
        VungleLogger.error("AssetDownloader#checkEncoding; loadAd sequence", String.format("unknown %1$s %2$s ", "Content-Encoding", str));
        throw new IOException("Unknown Content-Encoding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean useCacheWithoutVerification(DownloadRequestMediator downloadRequestMediator, File file, Map<String, String> map) {
        String str;
        if (map == null || this.cache == null || !downloadRequestMediator.isCacheable || (str = map.get(LAST_CACHE_VERIFICATION)) == null || !file.exists() || !Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE))) {
            return false;
        }
        try {
            long j = Long.parseLong(str);
            long j2 = this.timeWindow;
            return j2 >= Long.MAX_VALUE - j || j + j2 >= System.currentTimeMillis();
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean partialMalformed(long j, int i, Response response, DownloadRequestMediator downloadRequestMediator) {
        return (i == 206 && !satisfiesPartialDownload(response, j, downloadRequestMediator)) || i == 416;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendHeaders(long j, File file, HashMap<String, String> map, Request.Builder builder) {
        builder.addHeader("Accept-Encoding", "identity");
        if (!file.exists() || map.isEmpty()) {
            return;
        }
        String str = map.get("ETag");
        String str2 = map.get("Last-Modified");
        if (Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE))) {
            if (!TextUtils.isEmpty(str)) {
                builder.addHeader("If-None-Match", str);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            builder.addHeader("If-Modified-Since", str2);
            return;
        }
        if (BYTES.equalsIgnoreCase(map.get("Accept-Ranges"))) {
            if (map.get("Content-Encoding") == null || "identity".equalsIgnoreCase(map.get("Content-Encoding"))) {
                builder.addHeader("Range", "bytes=" + j + "-");
                if (!TextUtils.isEmpty(str)) {
                    builder.addHeader("If-Range", str);
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    builder.addHeader("If-Range", str2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResponseBody decodeGzipIfNeeded(Response response) {
        if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && HttpHeaders.hasBody(response) && response.body() != null) {
            return new RealResponseBody(response.header("Content-Type"), -1L, Okio.buffer(new GzipSource(response.body().source())));
        }
        return response.body();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCancelledMediator(DownloadRequestMediator downloadRequestMediator) {
        Iterator<DownloadRequest> it = downloadRequestMediator.requests().iterator();
        while (it.hasNext()) {
            onCancelled(it.next());
        }
    }

    private void onCancelled(DownloadRequest downloadRequest) {
        if (downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
        DownloadRequestMediator downloadRequestMediatorFindMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (downloadRequestMediatorFindMediatorForCancellation != null && downloadRequestMediatorFindMediatorForCancellation.getStatus() != 3) {
            Pair<DownloadRequest, AssetDownloadListener> pairRemove = downloadRequestMediatorFindMediatorForCancellation.remove(downloadRequest);
            DownloadRequest downloadRequest2 = pairRemove == null ? null : pairRemove.first;
            AssetDownloadListener assetDownloadListener = pairRemove != null ? pairRemove.second : null;
            if (downloadRequestMediatorFindMediatorForCancellation.values().isEmpty()) {
                downloadRequestMediatorFindMediatorForCancellation.set(3);
            }
            if (downloadRequest2 == null) {
                return;
            }
            AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
            progress.status = 3;
            deliverProgress(progress, downloadRequest2, assetDownloadListener);
        }
        removeNetworkListener();
    }

    private synchronized DownloadRequestMediator findMediatorForCancellation(DownloadRequest downloadRequest) {
        ArrayList<DownloadRequestMediator> arrayList = new ArrayList(2);
        arrayList.add(this.mediators.get(getCacheableKey(downloadRequest)));
        arrayList.add(this.mediators.get(getNonCacheableKey(downloadRequest)));
        for (DownloadRequestMediator downloadRequestMediator : arrayList) {
            if (downloadRequestMediator != null) {
                Iterator<DownloadRequest> it = downloadRequestMediator.requests().iterator();
                while (it.hasNext()) {
                    if (it.next().equals(downloadRequest)) {
                        return downloadRequestMediator;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNetworkListener() {
        if (this.mediators.isEmpty()) {
            Log.d(TAG, "Removing listener");
            this.networkProvider.removeListener(this.networkListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int mapExceptionToReason(Throwable th, boolean z) {
        if (th instanceof RuntimeException) {
            return 4;
        }
        if (!z || (th instanceof SocketException) || (th instanceof SocketTimeoutException)) {
            return 0;
        }
        return ((th instanceof UnknownHostException) || (th instanceof SSLException)) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getContentLength(Response response) {
        if (response == null) {
            return -1L;
        }
        String str = response.headers().get("Content-Length");
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notModified(File file, Response response, DownloadRequestMediator downloadRequestMediator, HashMap<String, String> map) {
        if (response != null && file.exists() && file.length() > 0 && downloadRequestMediator.isCacheable) {
            int iCode = response.code();
            if (Boolean.parseBoolean(map.get(DOWNLOAD_COMPLETE)) && iCode == 304) {
                Log.d(TAG, "304 code, data size matches file size " + debugString(downloadRequestMediator));
                return true;
            }
        }
        return false;
    }

    private boolean satisfiesPartialDownload(Response response, long j, DownloadRequestMediator downloadRequestMediator) {
        RangeResponse rangeResponse = new RangeResponse(response.headers().get("Content-Range"));
        boolean z = response.code() == 206 && BYTES.equalsIgnoreCase(rangeResponse.dimension) && rangeResponse.rangeStart >= 0 && j == rangeResponse.rangeStart;
        Log.d(TAG, "satisfies partial download: " + z + " " + debugString(downloadRequestMediator));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String debugString(DownloadRequestMediator downloadRequestMediator) {
        return ", mediator url - " + downloadRequestMediator.url + ", path - " + downloadRequestMediator.filePath + ", th - " + Thread.currentThread().getName() + "id " + downloadRequestMediator;
    }

    private String debugString(DownloadRequest downloadRequest) {
        return ", single request url - " + downloadRequest.url + ", path - " + downloadRequest.path + ", th - " + Thread.currentThread().getName() + "id " + downloadRequest.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnyConnected(DownloadRequestMediator downloadRequestMediator) {
        for (DownloadRequest downloadRequest : downloadRequestMediator.requests()) {
            if (downloadRequest == null) {
                Log.d(TAG, "Request is null");
            } else if (isConnected(downloadRequest)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isConnected(com.vungle.warren.downloader.DownloadRequest r6) {
        /*
            r5 = this;
            com.vungle.warren.utility.NetworkProvider r0 = r5.networkProvider
            int r0 = r0.getCurrentNetworkType()
            r1 = 1
            if (r0 < 0) goto Lf
            int r2 = r6.networkType
            r3 = 3
            if (r2 != r3) goto Lf
            return r1
        Lf:
            if (r0 == 0) goto L28
            if (r0 == r1) goto L26
            r2 = 4
            if (r0 == r2) goto L28
            r2 = 9
            if (r0 == r2) goto L26
            r2 = 17
            if (r0 == r2) goto L28
            r2 = 6
            if (r0 == r2) goto L26
            r2 = 7
            if (r0 == r2) goto L28
            r2 = -1
            goto L29
        L26:
            r2 = 2
            goto L29
        L28:
            r2 = 1
        L29:
            if (r2 <= 0) goto L31
            int r3 = r6.networkType
            r3 = r3 & r2
            if (r3 != r2) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = com.vungle.warren.downloader.AssetDownloader.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checking pause for type: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " connected "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r6 = r5.debugString(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.d(r2, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.isConnected(com.vungle.warren.downloader.DownloadRequest):boolean");
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean cancelAndAwait(DownloadRequest downloadRequest, long j) {
        if (downloadRequest == null) {
            return false;
        }
        cancel(downloadRequest);
        long jCurrentTimeMillis = System.currentTimeMillis() + Math.max(0L, j);
        while (System.currentTimeMillis() < jCurrentTimeMillis) {
            DownloadRequestMediator downloadRequestMediatorFindMediatorForCancellation = findMediatorForCancellation(downloadRequest);
            synchronized (this) {
                if (!this.transitioning.contains(downloadRequest) && (downloadRequestMediatorFindMediatorForCancellation == null || !downloadRequestMediatorFindMediatorForCancellation.requests().contains(downloadRequest))) {
                    return true;
                }
            }
            sleep(10L);
        }
        return false;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest == null) {
            return;
        }
        onCancelled(downloadRequest);
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void cancelAll() {
        Log.d(TAG, "Cancelling all");
        for (DownloadRequest downloadRequest : this.transitioning) {
            Log.d(TAG, "Cancel in transtiotion " + downloadRequest.url);
            cancel(downloadRequest);
        }
        Log.d(TAG, "Cancel in mediator " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            Log.d(TAG, "Cancel in mediator " + downloadRequestMediator.key);
            onCancelledMediator(downloadRequestMediator);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void setProgressStep(int i) {
        if (i != 0) {
            this.progressStep = i;
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void init() {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            downloaderCache.init();
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void clearCache() {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            downloaderCache.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkChanged(int i) {
        Log.d(TAG, "Num of connections: " + this.mediators.values().size());
        for (DownloadRequestMediator downloadRequestMediator : this.mediators.values()) {
            if (downloadRequestMediator.is(3)) {
                Log.d(TAG, "Result cancelled");
            } else {
                boolean zIsAnyConnected = isAnyConnected(downloadRequestMediator);
                String str = TAG;
                Log.d(str, "Connected = " + zIsAnyConnected + " for " + i);
                downloadRequestMediator.setConnected(zIsAnyConnected);
                if (downloadRequestMediator.isPausable() && zIsAnyConnected && downloadRequestMediator.is(2)) {
                    load(downloadRequestMediator);
                    Log.d(str, "resumed " + downloadRequestMediator.key + " " + downloadRequestMediator);
                }
            }
        }
    }

    private boolean responseVersionMatches(Response response, HashMap<String, String> map) {
        Headers headers = response.headers();
        String str = headers.get("ETag");
        String str2 = headers.get("Last-Modified");
        String str3 = TAG;
        Log.d(str3, "server etag: " + str);
        Log.d(str3, "server lastModified: " + str2);
        if (str != null && !str.equals(map.get("ETag"))) {
            Log.d(str3, "etags miss match current: " + map.get("ETag"));
            return false;
        }
        if (str2 == null || str2.equals(map.get("Last-Modified"))) {
            return true;
        }
        Log.d(str3, "lastModified miss match current: " + map.get("Last-Modified"));
        return false;
    }

    synchronized void shutdown() {
        cancel(null);
        this.transitioning.clear();
        this.mediators.clear();
        this.uiExecutor.shutdownNow();
        this.downloadExecutor.shutdownNow();
        try {
            this.downloadExecutor.awaitTermination(2L, TimeUnit.SECONDS);
            this.uiExecutor.awaitTermination(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        }
    }

    public static abstract class DownloadPriorityRunnable implements Comparable, Runnable {
        private static final AtomicInteger seq = new AtomicInteger();
        private final DownloadRequestMediator mediator;
        private final int order;
        private final AssetPriority priority;

        DownloadPriorityRunnable(DownloadRequestMediator downloadRequestMediator) {
            this.order = seq.incrementAndGet();
            this.mediator = downloadRequestMediator;
            this.priority = downloadRequestMediator.priority;
            downloadRequestMediator.setRunnable(this);
        }

        DownloadPriorityRunnable(AssetPriority assetPriority) {
            this.order = seq.incrementAndGet();
            this.priority = assetPriority;
            this.mediator = null;
        }

        AssetPriority getPriority() {
            DownloadRequestMediator downloadRequestMediator = this.mediator;
            return downloadRequestMediator != null ? downloadRequestMediator.getPriority() : this.priority;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (!(obj instanceof DownloadPriorityRunnable)) {
                return -1;
            }
            DownloadPriorityRunnable downloadPriorityRunnable = (DownloadPriorityRunnable) obj;
            int iCompareTo = getPriority().compareTo(downloadPriorityRunnable.getPriority());
            return iCompareTo == 0 ? Integer.valueOf(this.order).compareTo(Integer.valueOf(downloadPriorityRunnable.order)) : iCompareTo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> extractMeta(File file) {
        return FileUtility.readMap(file.getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMeta(File file, HashMap<String, String> map) throws Throwable {
        FileUtility.writeMap(file.getPath(), map);
    }

    synchronized void setDownloadedForTests(boolean z, String str, String str2) {
        ArrayList<File> arrayList = new ArrayList(2);
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null) {
            try {
                arrayList.add(downloaderCache.getMetaFile(downloaderCache.getFile(str)));
            } catch (IOException e) {
                Log.e(TAG, "Cannot add or get meta file", e);
                throw new RuntimeException("Failed to get file for request");
            }
        }
        arrayList.add(new File(str2 + META_POSTFIX_EXT));
        for (File file : arrayList) {
            HashMap<String, String> mapExtractMeta = extractMeta(file);
            mapExtractMeta.put(DOWNLOAD_COMPLETE, Boolean.valueOf(z).toString());
            FileUtility.writeSerializable(file, mapExtractMeta);
        }
    }

    private void copyToDestination(File file, File file2, Pair<DownloadRequest, AssetDownloadListener> pair) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file2.exists()) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            FileChannel channel = fileInputStream.getChannel();
            channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
            Log.d(TAG, "Copying: finished " + pair.first.url + " copying to " + file2.getPath());
            FileUtility.closeQuietly(fileInputStream);
        } catch (IOException e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            try {
                VungleLogger.error("AssetDownloader#copyToDestination; loadAd sequence", String.format("cannot copy from %1$s(%2$s) to %3$s due to %4$s", file.getPath(), pair.first.url, file2.getPath(), e));
                deliverError(pair.first, pair.second, new AssetDownloadListener.DownloadError(-1, e, 2));
                Log.d(TAG, "Copying: error" + pair.first.url + " copying to " + file2.getPath());
                FileUtility.closeQuietly(fileInputStream2);
            } catch (Throwable th3) {
                th = th3;
                FileUtility.closeQuietly(fileInputStream2);
                FileUtility.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            FileUtility.closeQuietly(fileInputStream2);
            FileUtility.closeQuietly(fileOutputStream);
            throw th;
        }
        FileUtility.closeQuietly(fileOutputStream);
    }

    private void deliverSuccess(Pair<DownloadRequest, AssetDownloadListener> pair, File file) {
        if (pair.second != null) {
            pair.second.onSuccess(file, pair.first);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessMediator(File file, DownloadRequestMediator downloadRequestMediator) {
        Log.d(TAG, "OnComplete - Removing connections and listener " + downloadRequestMediator);
        try {
            downloadRequestMediator.lock();
            List<Pair<DownloadRequest, AssetDownloadListener>> listValues = downloadRequestMediator.values();
            if (!file.exists()) {
                VungleLogger.error("AssetDownloader#onSuccessMediator; loadAd sequence", String.format("File %1$s does not exist; mediator %2$s ", file.getPath(), debugString(downloadRequestMediator)));
                onErrorMediator(new AssetDownloadListener.DownloadError(-1, new IOException("File is deleted"), 2), downloadRequestMediator);
                return;
            }
            if (this.cache != null && downloadRequestMediator.isCacheable) {
                this.cache.onCacheHit(file, listValues.size());
                this.cache.setCacheLastUpdateTimestamp(file, System.currentTimeMillis());
            }
            for (Pair<DownloadRequest, AssetDownloadListener> pair : listValues) {
                File file2 = new File(pair.first.path);
                if (file2.equals(file)) {
                    file2 = file;
                } else {
                    copyToDestination(file, file2, pair);
                }
                Log.d(TAG, "Deliver success:" + pair.first.url + " dest file: " + file2.getPath());
                deliverSuccess(pair, file2);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
            Log.d(TAG, "Finished " + debugString(downloadRequestMediator));
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    private String mediatorKeyFromRequest(DownloadRequest downloadRequest) {
        if (isCacheEnabled()) {
            return getCacheableKey(downloadRequest);
        }
        return getNonCacheableKey(downloadRequest);
    }

    private String getNonCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url + " " + downloadRequest.path;
    }

    private String getCacheableKey(DownloadRequest downloadRequest) {
        return downloadRequest.url;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onErrorMediator(AssetDownloadListener.DownloadError downloadError, DownloadRequestMediator downloadRequestMediator) {
        VungleLogger.error("AssetDownloader#onErrorMediator; loadAd sequence", String.format("Error %1$s occured; mediator %2$s", downloadError, debugString(downloadRequestMediator)));
        if (downloadError == null) {
            downloadError = new AssetDownloadListener.DownloadError(-1, new RuntimeException(), 4);
        }
        try {
            downloadRequestMediator.lock();
            for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
                deliverError(pair.first, pair.second, downloadError);
            }
            removeMediator(downloadRequestMediator);
            downloadRequestMediator.set(6);
        } finally {
            downloadRequestMediator.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverError(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener, final AssetDownloadListener.DownloadError downloadError) {
        VungleLogger.error("AssetDownloader#deliverError; loadAd sequence", String.format("Delivering error %1$s; request %2$s", downloadError, downloadRequest != null ? debugString(downloadRequest) : "null"));
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.6
                @Override // java.lang.Runnable
                public void run() {
                    assetDownloadListener.onError(downloadError, downloadRequest);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgressMediator(DownloadRequestMediator downloadRequestMediator, AssetDownloadListener.Progress progress) {
        if (downloadRequestMediator == null) {
            return;
        }
        AssetDownloadListener.Progress progressCopy = AssetDownloadListener.Progress.copy(progress);
        Log.d(TAG, "Progress " + progress.progressPercent + " status " + progress.status + " " + downloadRequestMediator + " " + downloadRequestMediator.filePath);
        for (Pair<DownloadRequest, AssetDownloadListener> pair : downloadRequestMediator.values()) {
            deliverProgress(progressCopy, pair.first, pair.second);
        }
    }

    private void deliverProgress(final AssetDownloadListener.Progress progress, final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.7
                @Override // java.lang.Runnable
                public void run() {
                    Log.d(AssetDownloader.TAG, "On progress " + downloadRequest);
                    assetDownloadListener.onProgress(progress, downloadRequest);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteFileAndMeta(File file, File file2, boolean z) {
        if (file == null) {
            return;
        }
        FileUtility.deleteAndLogIfFailed(file);
        if (file2 != null) {
            FileUtility.deleteAndLogIfFailed(file2);
        }
        if (this.cache == null || !isCacheEnabled()) {
            return;
        }
        if (z) {
            this.cache.deleteAndRemove(file);
        } else {
            this.cache.deleteContents(file);
        }
    }

    @Override // com.vungle.warren.downloader.Downloader
    public boolean dropCache(String str) {
        DownloaderCache downloaderCache = this.cache;
        if (downloaderCache != null && str != null) {
            try {
                File file = downloaderCache.getFile(str);
                Log.d(TAG, "Deleting " + file.getPath());
                return this.cache.deleteAndRemove(file);
            } catch (IOException e) {
                VungleLogger.error("AssetDownloader#dropCache; loadAd sequence", String.format("Error %1$s occured", e));
                Log.e(TAG, "There was an error to get file", e);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000b  */
    @Override // com.vungle.warren.downloader.Downloader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isCacheEnabled() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.vungle.warren.downloader.DownloaderCache r0 = r1.cache     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lb
            boolean r0 = r1.isCacheEnabled     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.AssetDownloader.isCacheEnabled():boolean");
    }

    @Override // com.vungle.warren.downloader.Downloader
    public synchronized void setCacheEnabled(boolean z) {
        this.isCacheEnabled = z;
    }

    @Override // com.vungle.warren.downloader.Downloader
    public void updatePriority(DownloadRequest downloadRequest) {
        Runnable runnable;
        final DownloadRequestMediator downloadRequestMediatorFindMediatorForCancellation = findMediatorForCancellation(downloadRequest);
        if (downloadRequestMediatorFindMediatorForCancellation == null || (runnable = downloadRequestMediatorFindMediatorForCancellation.getRunnable()) == null || !this.downloadExecutor.remove(runnable)) {
            return;
        }
        Log.d(TAG, "prio: updated to " + downloadRequestMediatorFindMediatorForCancellation.getPriority());
        this.downloadExecutor.execute(runnable, new Runnable() { // from class: com.vungle.warren.downloader.AssetDownloader.8
            @Override // java.lang.Runnable
            public void run() {
                AssetDownloader.this.onErrorMediator(new AssetDownloadListener.DownloadError(-1, new VungleException(39), 1), downloadRequestMediatorFindMediatorForCancellation);
            }
        });
    }
}
