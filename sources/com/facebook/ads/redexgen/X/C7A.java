package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C7A<T> {
    public static byte[] A04;
    public static String[] A05 = {"IPzGtGdAf7dMWjoiAfsJwT8MSbfW", "XMCeZkZyu3cdrivUr2jZRBASAtioBKsk", "M9df3TmYW4NVaJXwV617xCLf0ka0RL", "QgNQyFbsObpuCkNzfa3XkTwr8fWterHM", "OM6XrXF8htknNzzoWXy", "2umg9hNEEJctkPlZR8BXtgIxIwG9FY0j", "MjJVouBCVmg2kVwWDhDqrlmadtoLZ7M", "22y3hOnyLMExHbJepmdK5jKs80KnwphC"};
    public static final String A06;
    public final long A00;

    @Nullable
    public final AnonymousClass78 A01;
    public final AnonymousClass79 A02;
    public final T A03;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{105, 126, 114, 40, 124};
    }

    public abstract int A06() throws Exception;

    public abstract JSONObject A08(JSONObject jSONObject) throws JSONException;

    public abstract boolean A0A(C7A<T> c7a);

    static {
        A04();
        A06 = C7A.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public C7A(long j, @Nullable AnonymousClass78 anonymousClass78, T signalValue, AnonymousClass79 anonymousClass79) {
        this.A00 = j;
        this.A01 = anonymousClass78;
        this.A03 = signalValue;
        this.A02 = anonymousClass79;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final long A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @Nullable
    private final AnonymousClass78 A01() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    private final AnonymousClass79 A02() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    @SuppressLint({"CatchGeneralException"})
    public final int A05() {
        int length = (A01() != null ? A01().A02().getBytes().length : 0) + 8;
        try {
            return A06() + length;
        } catch (Exception e) {
            C6O.A03(e);
            return length;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final T A07() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:4:0x0007, B:5:0x0018, B:8:0x001e, B:9:0x002e, B:11:0x0034, B:13:0x003a, B:14:0x003e, B:21:0x0067, B:22:0x0073, B:24:0x0077), top: B:28:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject A09(boolean r8) {
        /*
            r7 = this;
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            if (r8 == 0) goto L18
            r2 = 4
            r1 = 1
            r0 = 2
            java.lang.String r2 = A03(r2, r1, r0)     // Catch: java.lang.Throwable -> L86
            long r4 = r7.A00     // Catch: java.lang.Throwable -> L86
            float r1 = (float) r4     // Catch: java.lang.Throwable -> L86
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L86
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L86
        L18:
            com.facebook.ads.redexgen.X.78 r0 = r7.A01     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L2e
            if (r8 == 0) goto L2e
            r2 = 0
            r1 = 3
            r0 = 0
            java.lang.String r1 = A03(r2, r1, r0)     // Catch: java.lang.Throwable -> L86
            com.facebook.ads.redexgen.X.78 r0 = r7.A01     // Catch: java.lang.Throwable -> L86
            org.json.JSONObject r0 = r0.A03()     // Catch: java.lang.Throwable -> L86
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L86
        L2e:
            com.facebook.ads.redexgen.X.79 r1 = r7.A02     // Catch: java.lang.Throwable -> L86
            com.facebook.ads.redexgen.X.79 r0 = com.facebook.ads.redexgen.X.AnonymousClass79.A04     // Catch: java.lang.Throwable -> L86
            if (r1 == r0) goto L3e
            java.lang.Object r0 = r7.A07()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L3e
            r7.A08(r3)     // Catch: java.lang.Throwable -> L86
            goto L8a
        L3e:
            com.facebook.ads.redexgen.X.79 r5 = r7.A02     // Catch: java.lang.Throwable -> L86
            com.facebook.ads.redexgen.X.79 r4 = com.facebook.ads.redexgen.X.AnonymousClass79.A04     // Catch: java.lang.Throwable -> L86
            r6 = 3
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C7A.A05
            r0 = 7
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L57
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L57:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C7A.A05
            java.lang.String r1 = "j6hvLenmhks7DifvzYp6ZMm4s1P7WZuQ"
            r0 = 7
            r2[r0] = r1
            r1 = 1
            r0 = 71
            java.lang.String r2 = A03(r6, r1, r0)
            if (r5 != r4) goto L73
            T r0 = r7.A03     // Catch: java.lang.Throwable -> L86
            com.facebook.ads.redexgen.X.77 r0 = (com.facebook.ads.redexgen.X.AnonymousClass77) r0     // Catch: java.lang.Throwable -> L86
            org.json.JSONObject r0 = r0.A08()     // Catch: java.lang.Throwable -> L86
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L86
            goto L8a
        L73:
            T r0 = r7.A03     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L8a
            com.facebook.ads.redexgen.X.76 r1 = com.facebook.ads.redexgen.X.AnonymousClass76.A07     // Catch: java.lang.Throwable -> L86
            com.facebook.ads.redexgen.X.77 r0 = new com.facebook.ads.redexgen.X.77     // Catch: java.lang.Throwable -> L86
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L86
            org.json.JSONObject r0 = r0.A08()     // Catch: java.lang.Throwable -> L86
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L86
            goto L8a
        L86:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C6O.A03(r0)
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7A.A09(boolean):org.json.JSONObject");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7A != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<T> */
    public final boolean A0B(@Nullable C7A<T> c7a, EnumSet<EnumC02896z> enumSet) {
        long jA08;
        if (c7a == null || A02() != c7a.A02()) {
            return false;
        }
        if (A02() == AnonymousClass79.A04 && c7a.A02() == AnonymousClass79.A04) {
            return A0A(c7a);
        }
        boolean zA0A = false;
        if (enumSet.contains(EnumC02896z.A0E)) {
            zA0A = A0A(c7a);
        }
        if (enumSet.contains(EnumC02896z.A0C)) {
            zA0A &= (A01() == null || c7a.A01() == null || !A01().A02().equals(c7a.A01().A02())) ? false : true;
        }
        if (enumSet.contains(EnumC02896z.A0D)) {
            if (A02() == AnonymousClass79.A0D || A02() == AnonymousClass79.A0B) {
                jA08 = C6C.A08();
            } else {
                jA08 = C6C.A09();
            }
            long epsilon = Math.abs(this.A00 - c7a.A00());
            return zA0A & (epsilon < jA08);
        }
        return zA0A;
    }
}
