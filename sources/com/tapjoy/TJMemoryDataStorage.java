package com.tapjoy;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TJMemoryDataStorage {
    public static TJMemoryDataStorage b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap<String, Object> f1684a = new WeakHashMap<>();

    public static TJMemoryDataStorage getInstance() {
        if (b == null) {
            synchronized (TJMemoryDataStorage.class) {
                if (b == null) {
                    b = new TJMemoryDataStorage();
                }
            }
        }
        return b;
    }

    public Object get(String str) {
        return this.f1684a.get(str);
    }

    public void put(String str, Object obj) {
        this.f1684a.put(str, obj);
    }

    public Object remove(String str) {
        return this.f1684a.remove(str);
    }
}
