package com.vungle.warren.downloader;

import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
class DownloadRequestMediator {
    public final String filePath;
    public final boolean isCacheable;
    public final String key;
    public final String metaPath;
    public final AssetPriority priority;
    public final String url;
    private AtomicInteger statusAtomic = new AtomicInteger(0);
    private Map<String, Pair<DownloadRequest, AssetDownloadListener>> children = new ConcurrentHashMap(1);
    private final ReentrantLock lock = new ReentrantLock();
    private AtomicBoolean connectedAtomic = new AtomicBoolean(true);
    private AtomicReference<Runnable> runnable = new AtomicReference<>();

    DownloadRequestMediator(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, String str, String str2, boolean z, String str3) {
        this.url = downloadRequest.url;
        this.filePath = str;
        this.metaPath = str2;
        this.isCacheable = z;
        this.key = str3;
        this.priority = downloadRequest.getPriority();
        this.children.put(downloadRequest.id, new Pair<>(downloadRequest, assetDownloadListener));
    }

    synchronized void add(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        this.children.put(downloadRequest.id, new Pair<>(downloadRequest, assetDownloadListener));
    }

    synchronized Pair<DownloadRequest, AssetDownloadListener> remove(DownloadRequest downloadRequest) {
        return this.children.remove(downloadRequest.id);
    }

    synchronized List<Pair<DownloadRequest, AssetDownloadListener>> values() {
        return new ArrayList(this.children.values());
    }

    synchronized List<DownloadRequest> requests() {
        ArrayList arrayList;
        List<Pair<DownloadRequest, AssetDownloadListener>> listValues = values();
        arrayList = new ArrayList();
        Iterator<Pair<DownloadRequest, AssetDownloadListener>> it = listValues.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().first);
        }
        return arrayList;
    }

    void lock() {
        this.lock.lock();
    }

    void unlock() {
        this.lock.unlock();
    }

    AssetPriority getPriority() {
        AssetPriority priority;
        AssetPriority assetPriority = new AssetPriority(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (Pair<DownloadRequest, AssetDownloadListener> pair : values()) {
            if (pair.first != null && (priority = pair.first.getPriority()) != null && assetPriority.compareTo(priority) >= 0) {
                assetPriority = priority;
            }
        }
        return assetPriority;
    }

    boolean isPausable() {
        for (Pair<DownloadRequest, AssetDownloadListener> pair : values()) {
            if (pair.first != null && pair.first.pauseOnConnectionLost) {
                return true;
            }
        }
        return false;
    }

    public int getStatus() {
        return this.statusAtomic.get();
    }

    boolean is(int i) {
        return this.statusAtomic.get() == i;
    }

    void set(int i) {
        if (this.statusAtomic.get() == 3) {
            return;
        }
        this.statusAtomic.set(i);
    }

    boolean isConnected() {
        return this.connectedAtomic.get();
    }

    void setConnected(boolean z) {
        this.connectedAtomic.set(z);
    }

    public void setRunnable(Runnable runnable) {
        this.runnable.set(runnable);
    }

    public Runnable getRunnable() {
        return this.runnable.get();
    }
}
