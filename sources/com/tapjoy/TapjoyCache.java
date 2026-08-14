package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.tapjoy.internal.w1;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyCache {
    public static final String CACHE_DIRECTORY_NAME = "Tapjoy/Cache/";
    public static final int CACHE_LIMIT = -1;
    public static TapjoyCache f = null;
    public static boolean unit_test_mode = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1719a;
    public TapjoyCacheMap b;
    public Vector<String> c;
    public ExecutorService d;
    public File e;

    public class CacheAssetThread implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URL f1720a;
        public String b;
        public long c;

        public CacheAssetThread(URL url, String str, long j) {
            this.f1720a = url;
            this.b = str;
            this.c = j;
            if (j <= 0) {
                this.c = 86400L;
            }
            TapjoyCache.this.c.add(TapjoyCache.this.a(this.f1720a.toString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.io.BufferedOutputStream] */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.io.BufferedOutputStream] */
        /* JADX WARN: Type inference failed for: r9v11, types: [java.io.BufferedOutputStream] */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean call() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyCache.CacheAssetThread.call():java.lang.Boolean");
        }
    }

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONArray f1721a;
        public final /* synthetic */ TJCacheListener b;

        public a(JSONArray jSONArray, TJCacheListener tJCacheListener) {
            this.f1721a = jSONArray;
            this.b = tJCacheListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            StringBuilder sbA = w1.a("Starting to cache asset group size of ");
            sbA.append(this.f1721a.length());
            TapjoyLog.d("TapjoyCache", sbA.toString());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f1721a.length(); i++) {
                try {
                    Future<Boolean> futureCacheAssetFromJSONObject = TapjoyCache.this.cacheAssetFromJSONObject(this.f1721a.getJSONObject(i));
                    if (futureCacheAssetFromJSONObject != null) {
                        arrayList.add(futureCacheAssetFromJSONObject);
                    }
                } catch (JSONException unused) {
                    TapjoyLog.e("TapjoyCache", "Failed to load JSON object from JSONArray");
                }
            }
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                try {
                } catch (InterruptedException e) {
                    StringBuilder sbA2 = w1.a("Caching thread failed: ");
                    sbA2.append(e.toString());
                    TapjoyLog.e("TapjoyCache", sbA2.toString());
                } catch (ExecutionException e2) {
                    StringBuilder sbA3 = w1.a("Caching thread failed: ");
                    sbA3.append(e2.toString());
                    TapjoyLog.e("TapjoyCache", sbA3.toString());
                }
                if (!((Boolean) ((Future) it.next()).get()).booleanValue()) {
                    i2 = 2;
                }
            }
            TapjoyLog.d("TapjoyCache", "Finished caching group");
            TJCacheListener tJCacheListener = this.b;
            if (tJCacheListener != null) {
                tJCacheListener.onCachingComplete(i2);
            }
        }
    }

    public TapjoyCache(Context context) {
        if (f == null || unit_test_mode) {
            f = this;
            this.f1719a = context;
            this.b = new TapjoyCacheMap(context, -1);
            this.c = new Vector<>();
            this.d = Executors.newFixedThreadPool(5);
            if (Environment.getExternalStorageDirectory() != null) {
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tapjoy"));
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tjcache/tmp/"));
            }
            File file = new File(this.f1719a.getFilesDir() + "/Tapjoy/Cache/");
            this.e = file;
            if (!file.exists()) {
                if (this.e.mkdirs()) {
                    StringBuilder sbA = w1.a("Created directory at: ");
                    sbA.append(this.e.getPath());
                    TapjoyLog.d("TapjoyCache", sbA.toString());
                } else {
                    TapjoyLog.e("TapjoyCache", "Error initalizing cache");
                    f = null;
                }
            }
            SharedPreferences sharedPreferences = this.f1719a.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                File file2 = new File(entry.getKey());
                if (file2.exists() && file2.isFile()) {
                    TapjoyCachedAssetData tapjoyCachedAssetDataFromRawJSONString = TapjoyCachedAssetData.fromRawJSONString(entry.getValue().toString());
                    if (tapjoyCachedAssetDataFromRawJSONString != null) {
                        StringBuilder sbA2 = w1.a("Loaded Asset: ");
                        sbA2.append(tapjoyCachedAssetDataFromRawJSONString.getAssetURL());
                        TapjoyLog.d("TapjoyCache", sbA2.toString());
                        String strA = a(tapjoyCachedAssetDataFromRawJSONString.getAssetURL());
                        if (strA == null || "".equals(strA) || strA.length() <= 0) {
                            TapjoyLog.e("TapjoyCache", "Removing asset because deserialization failed.");
                            editorEdit.remove(entry.getKey()).apply();
                        } else if (tapjoyCachedAssetDataFromRawJSONString.getTimeOfDeathInSeconds() < System.currentTimeMillis() / 1000) {
                            StringBuilder sbA3 = w1.a("Asset expired, removing from cache: ");
                            sbA3.append(tapjoyCachedAssetDataFromRawJSONString.getAssetURL());
                            TapjoyLog.d("TapjoyCache", sbA3.toString());
                            if (tapjoyCachedAssetDataFromRawJSONString.getLocalFilePath() != null && tapjoyCachedAssetDataFromRawJSONString.getLocalFilePath().length() > 0) {
                                TapjoyUtil.deleteFileOrDirectory(new File(tapjoyCachedAssetDataFromRawJSONString.getLocalFilePath()));
                            }
                        } else {
                            this.b.put(strA, tapjoyCachedAssetDataFromRawJSONString);
                        }
                    } else {
                        TapjoyLog.e("TapjoyCache", "Removing asset because deserialization failed.");
                        editorEdit.remove(entry.getKey()).apply();
                    }
                } else {
                    StringBuilder sbA4 = w1.a("Removing reference to missing asset: ");
                    sbA4.append(entry.getKey());
                    TapjoyLog.d("TapjoyCache", sbA4.toString());
                    editorEdit.remove(entry.getKey()).apply();
                }
            }
        }
    }

    public static TapjoyCache getInstance() {
        return f;
    }

    public static void setInstance(TapjoyCache tapjoyCache) {
        f = tapjoyCache;
    }

    public final String a(String str) {
        if (str.startsWith("//")) {
            str = "http:" + str;
        }
        try {
            return new URL(str).getFile();
        } catch (MalformedURLException unused) {
            TapjoyLog.e("TapjoyCache", "Invalid URL " + str);
            return "";
        }
    }

    public void a() {
    }

    public Future<Boolean> cacheAssetFromJSONObject(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("url");
            Long.valueOf(86400L);
            String strOptString = jSONObject.optString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID);
            long jOptLong = jSONObject.optLong(TapjoyConstants.TJC_TIME_TO_LIVE);
            Long.valueOf(jOptLong).getClass();
            return cacheAssetFromURL(string, strOptString, jOptLong);
        } catch (JSONException unused) {
            TapjoyLog.e("TapjoyCache", "Required parameters to cache an asset from JSON is not present");
            return null;
        }
    }

    public Future<Boolean> cacheAssetFromURL(String str, String str2, long j) {
        try {
            URL url = new URL(str);
            if (!this.c.contains(a(str))) {
                return startCachingThread(url, str2, j);
            }
            TapjoyLog.d("TapjoyCache", "URL is already in the process of being cached: " + str);
            return null;
        } catch (MalformedURLException unused) {
            TapjoyLog.d("TapjoyCache", "Invalid cache assetURL");
            return null;
        }
    }

    public void cacheAssetGroup(JSONArray jSONArray, TJCacheListener tJCacheListener) {
        if (jSONArray != null && jSONArray.length() > 0) {
            new a(jSONArray, tJCacheListener).start();
        } else if (tJCacheListener != null) {
            tJCacheListener.onCachingComplete(1);
        }
    }

    public String cachedAssetsToJSON() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, TapjoyCachedAssetData> entry : this.b.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue().toRawJSONString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public void clearTapjoyCache() {
        TapjoyLog.d("TapjoyCache", "Cleaning Tapjoy cache!");
        TapjoyUtil.deleteFileOrDirectory(this.e);
        if (this.e.mkdirs()) {
            StringBuilder sbA = w1.a("Created new cache directory at: ");
            sbA.append(this.e.getPath());
            TapjoyLog.d("TapjoyCache", sbA.toString());
        }
        this.b = new TapjoyCacheMap(this.f1719a, -1);
    }

    public TapjoyCacheMap getCachedData() {
        return this.b;
    }

    public TapjoyCachedAssetData getCachedDataForURL(String str) {
        String strA = a(str);
        if (strA != "") {
            return this.b.get(strA);
        }
        return null;
    }

    public String getCachedOfferIDs() {
        ArrayList arrayList = new ArrayList();
        TapjoyCacheMap tapjoyCacheMap = this.b;
        if (tapjoyCacheMap == null) {
            return "";
        }
        Iterator<Map.Entry<String, TapjoyCachedAssetData>> it = tapjoyCacheMap.entrySet().iterator();
        while (it.hasNext()) {
            String offerId = it.next().getValue().getOfferId();
            if (offerId != null && offerId.length() != 0 && !arrayList.contains(offerId)) {
                arrayList.add(offerId);
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public String getPathOfCachedURL(String str) {
        String strA = a(str);
        if (strA == "" || !this.b.containsKey(strA)) {
            return str;
        }
        TapjoyCachedAssetData tapjoyCachedAssetData = this.b.get(strA);
        if (new File(tapjoyCachedAssetData.getLocalFilePath()).exists()) {
            return tapjoyCachedAssetData.getLocalURL();
        }
        getInstance().removeAssetFromCache(str);
        return str;
    }

    public boolean isURLCached(String str) {
        return this.b.get(a(str)) != null;
    }

    public boolean isURLDownloading(String str) {
        String strA;
        return (this.c == null || (strA = a(str)) == "" || !this.c.contains(strA)) ? false : true;
    }

    public void printCacheInformation() {
        TapjoyLog.d("TapjoyCache", "------------- Cache Data -------------");
        TapjoyLog.d("TapjoyCache", "Number of files in cache: " + this.b.size());
        TapjoyLog.d("TapjoyCache", "Cache Size: " + TapjoyUtil.fileOrDirectorySize(this.e));
        TapjoyLog.d("TapjoyCache", "--------------------------------------");
    }

    public boolean removeAssetFromCache(String str) {
        String strA = a(str);
        return (strA == "" || this.b.remove((Object) strA) == null) ? false : true;
    }

    public Future<Boolean> startCachingThread(URL url, String str, long j) {
        if (url != null) {
            return this.d.submit(new CacheAssetThread(url, str, j));
        }
        return null;
    }
}
