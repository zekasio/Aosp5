package com.vungle.warren.downloader;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface CachePolicy<T> {
    void clean();

    List<T> getOrderedCacheItems();

    void load();

    void put(T t, long j);

    void remove(T t);

    void save();
}
