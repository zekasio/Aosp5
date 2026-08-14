package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6W {
    public final C6C A00;
    public final Map<Integer, C02826s> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C6W(C6C c6c, Map<Integer, C02826s> map) {
        this.A00 = c6c;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i) {
        if (this.A00.A0e(i) != null) {
            return this.A00.A0e(i).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(C7A c7a, C02826s c02826s) {
        int iA00 = c02826s.A00();
        Map<Integer, C6H<C7A>> mapA03 = C02876x.A01().A03();
        if (mapA03.containsKey(Integer.valueOf(iA00))) {
            C6H<C7A> c6h = mapA03.get(Integer.valueOf(iA00));
            C7A c7aA02 = c6h != null ? c6h.A02() : null;
            if (c6h == null) {
                c6h = new C6H<>(A00(iA00));
            }
            if (!c7a.A0B(c7aA02, c02826s.A03())) {
                c6h.A04(c7a);
                C02876x.A01().A04(iA00, c6h, c7a.A05());
            }
        } else {
            C6H<C7A> c6h2 = new C6H<>(A00(iA00));
            c6h2.A04(c7a);
            C02876x.A01().A04(iA00, c6h2, c7a.A05());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(C7A c7a, C6V c6v) {
        if (!this.A02.get()) {
            return;
        }
        try {
            switch (c6v) {
                case A0E:
                    C02826s c02826s = this.A01.get(10800);
                    if (c7a == null || c02826s == null) {
                        return;
                    } else {
                        A01(c7a, c02826s);
                    }
                    break;
                case A03:
                    C02826s c02826s2 = this.A01.get(10810);
                    if (c7a == null || c02826s2 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s2);
                    }
                    break;
                case A09:
                    C02826s c02826s3 = this.A01.get(10812);
                    if (c7a == null || c02826s3 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s3);
                    }
                    break;
                case A06:
                    C02826s c02826s4 = this.A01.get(10813);
                    if (c7a == null || c02826s4 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s4);
                    }
                    break;
                case A0A:
                    C02826s c02826s5 = this.A01.get(10814);
                    if (c7a == null || c02826s5 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s5);
                    }
                    break;
                case A0B:
                    C02826s c02826s6 = this.A01.get(10815);
                    if (c7a == null || c02826s6 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s6);
                    }
                    break;
                case A0D:
                    C02826s c02826s7 = this.A01.get(10816);
                    if (c7a == null || c02826s7 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s7);
                    }
                    break;
                case A08:
                    C02826s c02826s8 = this.A01.get(10817);
                    if (c7a == null || c02826s8 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s8);
                    }
                    break;
                case A05:
                    C02826s c02826s9 = this.A01.get(10818);
                    if (c7a == null || c02826s9 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s9);
                    }
                    break;
                case A04:
                    C02826s c02826s10 = this.A01.get(10819);
                    if (c7a == null || c02826s10 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s10);
                    }
                    break;
                case A0C:
                    C02826s c02826s11 = this.A01.get(10820);
                    if (c7a == null || c02826s11 == null) {
                        return;
                    } else {
                        A01(c7a, c02826s11);
                    }
                    break;
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }
}
