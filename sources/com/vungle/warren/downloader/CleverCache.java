package com.vungle.warren.downloader;

import android.util.Base64;
import android.util.Log;
import com.vungle.warren.SizeProvider;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class CleverCache implements DownloaderCache {
    static final String ASSETS_DIR = "assets";
    static final String CACHE_META = "meta";
    public static final String CACHE_TOUCH_JOURNAL = "cache_touch_timestamp";
    public static final String CC_DIR = "clever_cache";
    public static final String FAILED_TO_DELETE = "cache_failed_to_delete";
    private static final String META_POSTFIX_EXT = ".vng_meta";
    private static final String TAG = "CleverCache";
    private final CacheManager cacheManager;
    private final long expirationAge;
    private final CachePolicy<File> policy;
    private final SizeProvider sizeProvider;
    private final HashMap<File, Long> cacheTouchTime = new HashMap<>();
    private final Map<File, Integer> trackedFiles = new ConcurrentHashMap();
    private final HashSet<File> failedToDelete = new HashSet<>();

    public CleverCache(CacheManager cacheManager, CachePolicy<File> cachePolicy, SizeProvider sizeProvider, long j) {
        this.cacheManager = cacheManager;
        this.policy = cachePolicy;
        this.sizeProvider = sizeProvider;
        this.expirationAge = Math.max(0L, j);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void init() {
        this.policy.load();
        loadTouchTimestamps();
        expirationCleanup();
        loadFailedToDelete();
        failedToDeleteCleanUp();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void startTracking(File file) {
        int iValueOf;
        Integer num = this.trackedFiles.get(file);
        this.policy.put(file, 0L);
        this.policy.save();
        if (num == null || num.intValue() <= 0) {
            iValueOf = 1;
        } else {
            iValueOf = Integer.valueOf(num.intValue() + 1);
        }
        this.trackedFiles.put(file, iValueOf);
        Log.d(TAG, "Start tracking file: " + file + " ref count " + iValueOf);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void stopTracking(File file) {
        Integer num = this.trackedFiles.get(file);
        if (num == null) {
            this.trackedFiles.remove(file);
            return;
        }
        int iIntValue = num.intValue() - 1;
        Integer numValueOf = Integer.valueOf(iIntValue);
        numValueOf.getClass();
        if (iIntValue <= 0) {
            this.trackedFiles.remove(file);
        }
        Log.d(TAG, "Stop tracking file: " + file + " ref count " + numValueOf);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void onCacheHit(File file, long j) {
        this.policy.put(file, j);
        this.policy.save();
        Log.d(TAG, "Cache hit " + file + " cache touch updated");
        purge();
    }

    public synchronized File getAssetsDir() {
        File file;
        file = new File(getCacheDir(), ASSETS_DIR);
        if (!file.isDirectory() && file.exists()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public synchronized File getMetaDir() {
        File file;
        file = new File(getAssetsDir(), CACHE_META);
        if (!file.isDirectory()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized List<File> purge() {
        failedToDeleteCleanUp();
        long targetSize = this.sizeProvider.getTargetSize();
        long size = FileUtility.size(getAssetsDir());
        String str = TAG;
        Log.d(str, "Purge check current cache total: " + size + " target: " + targetSize);
        if (size < targetSize) {
            return Collections.emptyList();
        }
        Log.d(str, "Purge start");
        ArrayList arrayList = new ArrayList();
        List<File> orderedCacheItems = this.policy.getOrderedCacheItems();
        integrityCleanup(orderedCacheItems);
        long size2 = FileUtility.size(getAssetsDir());
        if (size2 < targetSize) {
            Log.d(str, "Cleaned up not tracked files, size is ok");
            return Collections.emptyList();
        }
        Iterator<File> it = orderedCacheItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            File next = it.next();
            if (next != null && !isProtected(next)) {
                long length = next.length();
                if (deleteContents(next)) {
                    size2 -= length;
                    arrayList.add(next);
                    String str2 = TAG;
                    Log.d(str2, "Deleted file: " + next.getName() + " size: " + length + " total: " + size2 + " target: " + targetSize);
                    this.policy.remove(next);
                    this.cacheTouchTime.remove(next);
                    if (size2 < targetSize) {
                        targetSize = this.sizeProvider.getTargetSize();
                        if (size2 < targetSize) {
                            Log.d(str2, "Cleaned enough total: " + size2 + " target: " + targetSize);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.size() > 0) {
            this.policy.save();
            saveTouchTimestamps();
        }
        Log.d(TAG, "Purge complete");
        return arrayList;
    }

    private boolean isProtected(File file) {
        Integer num = this.trackedFiles.get(file);
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        Log.d(TAG, "File is tracked and protected : " + file);
        return true;
    }

    private void integrityCleanup(List<File> list) {
        File metaDir = getMetaDir();
        File[] fileArrListFiles = getAssetsDir().listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList(Arrays.asList(fileArrListFiles));
            arrayList.removeAll(list);
            arrayList.remove(metaDir);
            for (File file : arrayList) {
                deleteContents(file);
                Log.d(TAG, "Deleted non tracked file " + file);
            }
        }
    }

    private synchronized void expirationCleanup() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.expirationAge;
        File[] fileArrListFiles = getAssetsDir().listFiles();
        HashSet hashSet = new HashSet(this.cacheTouchTime.keySet());
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                long cacheUpdateTimestamp = getCacheUpdateTimestamp(file);
                hashSet.remove(file);
                if (!isProtected(file) && (cacheUpdateTimestamp == 0 || cacheUpdateTimestamp <= jCurrentTimeMillis)) {
                    if (deleteContents(file)) {
                        this.cacheTouchTime.remove(file);
                        this.policy.remove(file);
                    }
                    Log.d(TAG, "Deleted expired file " + file);
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.cacheTouchTime.remove((File) it.next());
            }
            this.policy.save();
            saveTouchTimestamps();
        }
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized long getCacheUpdateTimestamp(File file) {
        Long l;
        l = this.cacheTouchTime.get(file);
        return l == null ? file.lastModified() : l.longValue();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void setCacheLastUpdateTimestamp(File file, long j) {
        this.cacheTouchTime.put(file, Long.valueOf(j));
        saveTouchTimestamps();
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized boolean deleteAndRemove(File file) {
        if (deleteContents(file)) {
            this.cacheTouchTime.remove(file);
            this.policy.remove(file);
            this.policy.save();
            saveTouchTimestamps();
            this.failedToDelete.remove(file);
            saveFailedToDelete();
            return true;
        }
        this.failedToDelete.add(file);
        saveFailedToDelete();
        return false;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized boolean deleteContents(File file) {
        boolean z;
        try {
            FileUtility.delete(file);
        } catch (IOException e) {
            e = e;
            z = false;
        }
        try {
            FileUtility.delete(getMetaFile(file));
            return true;
        } catch (IOException e2) {
            e = e2;
            z = true;
            VungleLogger.error("CleverCache#deleteContents; loadAd sequence", String.format("Cannot delete %1$s for file %2$s; Error %3$s occured", z ? CACHE_META : "file", file.getPath(), e));
            return false;
        }
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized File getFile(String str) throws IOException {
        File file;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes("UTF-8"));
                file = new File(getAssetsDir(), Base64.encodeToString(messageDigest.digest(), 10));
                this.policy.put(file, 0L);
            } catch (UnsupportedEncodingException e) {
                VungleLogger.error("CleverCache#getFile; loadAd sequence", "cannot encode url with charset = UTF-8");
                throw new IOException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            VungleLogger.error("CleverCache#getFile; loadAd sequence", "cannot get instance of MessageDigest with algorithm SHA-256");
            throw new IOException(e2);
        }
        return file;
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized File getMetaFile(File file) {
        return new File(getMetaDir(), file.getName() + META_POSTFIX_EXT);
    }

    @Override // com.vungle.warren.downloader.DownloaderCache
    public synchronized void clear() {
        List<File> orderedCacheItems = this.policy.getOrderedCacheItems();
        integrityCleanup(orderedCacheItems);
        int i = 0;
        for (File file : orderedCacheItems) {
            if (file != null && !isProtected(file) && deleteContents(file)) {
                i++;
                this.policy.remove(file);
                this.cacheTouchTime.remove(file);
            }
        }
        if (i > 0) {
            this.policy.save();
            saveTouchTimestamps();
        }
    }

    private void loadTouchTimestamps() {
        Serializable serializable = (Serializable) FileUtility.readSerializable(getTouchTimestampsFile());
        if (serializable instanceof HashMap) {
            try {
                this.cacheTouchTime.putAll((HashMap) serializable);
            } catch (ClassCastException e) {
                VungleLogger.error("CleverCache#loadTouchTimestamps; loadAd sequence", String.format("Error %1$s occurred; old map is not File -> Long", e));
                FileUtility.deleteAndLogIfFailed(getTouchTimestampsFile());
            }
        }
    }

    private void loadFailedToDelete() {
        Serializable serializable = (Serializable) FileUtility.readSerializable(getFailedToDeleteFile());
        if (serializable instanceof HashSet) {
            try {
                this.failedToDelete.addAll((HashSet) serializable);
            } catch (ClassCastException e) {
                VungleLogger.error("CleverCache#loadFailedToDelete;", String.format("Error %1$s occurred; old set is not set of File", e));
                FileUtility.deleteAndLogIfFailed(getFailedToDeleteFile());
            }
        }
    }

    private void saveTouchTimestamps() throws Throwable {
        FileUtility.writeSerializable(getTouchTimestampsFile(), new HashMap(this.cacheTouchTime));
    }

    private void saveFailedToDelete() throws Throwable {
        File failedToDeleteFile = getFailedToDeleteFile();
        if (!this.failedToDelete.isEmpty()) {
            FileUtility.writeSerializable(failedToDeleteFile, new HashSet(this.failedToDelete));
        } else if (failedToDeleteFile.exists()) {
            FileUtility.deleteAndLogIfFailed(failedToDeleteFile);
        }
    }

    private File getTouchTimestampsFile() {
        return new File(getCacheDir(), CACHE_TOUCH_JOURNAL);
    }

    private File getCacheDir() {
        File file = new File(this.cacheManager.getCache(), CC_DIR);
        if (!file.isDirectory()) {
            FileUtility.deleteAndLogIfFailed(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File getFailedToDeleteFile() {
        return new File(getCacheDir(), FAILED_TO_DELETE);
    }

    private void failedToDeleteCleanUp() {
        for (File file : new HashSet(this.failedToDelete)) {
            if (!isProtected(file)) {
                deleteAndRemove(file);
            }
        }
    }
}
