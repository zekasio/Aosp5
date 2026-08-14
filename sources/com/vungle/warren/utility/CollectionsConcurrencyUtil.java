package com.vungle.warren.utility;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class CollectionsConcurrencyUtil {
    public static synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }

    public static synchronized void addToSet(HashSet hashSet, String str) {
        hashSet.add(str);
    }
}
