package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02876x {
    public final Map<Integer, C6H<C7A>> A00;

    @Nullable
    public static C02876x A02 = null;
    public static long A01 = 0;

    public C02876x(Map<Integer, C6H<C7A>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        return A01;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C02876x A01() {
        if (A02 == null) {
            A02 = new C02876x(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(C6H<C7A> c6h, int i) {
        int iA05 = 0;
        boolean z = false;
        if (c6h.A00() == 0) {
            z = true;
            iA05 = c6h.A01().A05();
        }
        int updatedSize = i - iA05;
        A01 += (long) ((z ? 0 : 4) + updatedSize);
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, C6H<C7A>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i, C6H<C7A> c6h, int i2) {
        this.A00.put(Integer.valueOf(i), c6h);
        A02(c6h, i2);
    }
}
