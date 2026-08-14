package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import org.cocos2dx.cpp.AppActivity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        AppActivity.AnonymousClass15 anonymousClass15 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass15.add(arrayList.get(i).freeze());
        }
        return anonymousClass15;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        AppActivity.AnonymousClass15 anonymousClass15 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            anonymousClass15.add(it.next().freeze());
        }
        return anonymousClass15;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        AppActivity.AnonymousClass15 anonymousClass15 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            anonymousClass15.add(e.freeze());
        }
        return anonymousClass15;
    }
}
