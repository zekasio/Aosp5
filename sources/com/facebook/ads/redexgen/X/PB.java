package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PB {
    public static final Map<String, WeakReference<PA>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static PA A01(C0947Xy c0947Xy, AnonymousClass18 anonymousClass18, int i, P8 p8) {
        PA pa = new PA(c0947Xy, anonymousClass18, c0947Xy.A00().A08(), i);
        pa.A0b(p8);
        pa.A0X();
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(pa));
        return pa;
    }

    @Nullable
    public static PA A02(String str) {
        WeakReference<PA> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AnonymousClass18 anonymousClass18, PA pa) {
        A00.put(anonymousClass18.A0Z(), new WeakReference<>(pa));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
