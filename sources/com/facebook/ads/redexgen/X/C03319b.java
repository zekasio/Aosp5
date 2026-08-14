package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.AbstractC03329c;
import com.facebook.ads.redexgen.X.C03309a;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03319b<T extends AbstractC03329c, E extends C03309a> {
    public static String[] A02 = {"WBmgDKUAJnOjRPVdo459bnYJXDnRSoZA", "OZ5TpfWbSmXE", "sC9WLlq1dd0W0qrWeGI0su3O22TcCAEW", "0Ub2X", "5m4s5CvbohnvtMuC", "JEGJTDHJWZGaFE0Bjwe", "ELtjylBnyGpGsAAS3nfDjHYeujv6lcAm", "LzmA2INjpudrbI3uXcOOEdZHAsdjx9ZW"};
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    private void A00(E e) {
        List<WeakReference<T>> list;
        Map<Class<E>, List<WeakReference<T>>> map = this.A00;
        if (map == null || (list = map.get(e.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        for (WeakReference<T> subscriberReference : new ArrayList(list)) {
            T subscriber = subscriberReference.get();
            if (subscriber != null && subscriber.A00(e)) {
                subscriber.A03(e);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    private void A01(List<WeakReference<T>> list) {
        if (list != null) {
            int i = 0;
            for (int writePtr = 0; writePtr < list.size(); writePtr++) {
                WeakReference<T> weakReference = list.get(writePtr);
                T t = weakReference.get();
                if (A02[1].length() != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[6] = "MDutMibHR0xfS0kHpIX6qzWASaThPw85";
                strArr[0] = "nvT9JaP2TDwXv3h3yDNvutMp299h55Zc";
                if (t != null) {
                    list.set(i, weakReference);
                    i++;
                }
            }
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                E event = this.A01.peek();
                A00(event);
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    public final synchronized void A03(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    public final synchronized void A04(T... tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        Class<E> clsA01 = t.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9b != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.9c, E extends com.facebook.ads.redexgen.X.9a> */
    public final synchronized boolean A06(@Nullable T t) {
        if (t == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(t.A01());
        if (list == null) {
            return false;
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (list.get(i).get() == t) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}
