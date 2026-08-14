package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<F9> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432) {
                if ((anonymousClass43.A03 == null) != (anonymousClass432.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                }
                if (anonymousClass43.A04 != anonymousClass432.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                }
                int i = anonymousClass432.A02 - anonymousClass43.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = anonymousClass43.A00 - anonymousClass432.A00;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
        };
    }

    private AbstractC02244l A00(F9 f9, int i, long j) {
        if (A08(f9, i)) {
            return null;
        }
        C02144b c02144b = f9.A0r;
        try {
            f9.A1L();
            AbstractC02244l abstractC02244lA0I = c02144b.A0I(i, false, j);
            if (abstractC02244lA0I != null) {
                if (abstractC02244lA0I.A0a() && !abstractC02244lA0I.A0b()) {
                    c02144b.A0X(abstractC02244lA0I.A0H);
                } else {
                    c02144b.A0d(abstractC02244lA0I, false);
                }
            }
            return abstractC02244lA0I;
        } finally {
            f9.A1q(false);
        }
    }

    private void A02() {
        AnonymousClass43 task;
        int i = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            F9 f9 = this.A02.get(i3);
            int totalTaskCount = f9.getWindowVisibility();
            if (totalTaskCount == 0) {
                f9.A02.A04(f9, false);
                int totalTaskCount2 = f9.A02.A00;
                i2 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int i4 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i5 = 0; i5 < i; i5++) {
            F9 f92 = this.A02.get(i5);
            int totalTaskCount4 = f92.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C1136cC c1136cC = f92.A02;
                int iAbs = Math.abs(c1136cC.A01) + Math.abs(c1136cC.A02);
                for (int i6 = 0; i6 < c1136cC.A00 * 2; i6 += 2) {
                    if (i4 >= this.A03.size()) {
                        task = new AnonymousClass43();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i4);
                    }
                    int j = i6 + 1;
                    int i7 = c1136cC.A03[j];
                    task.A04 = i7 <= iAbs;
                    task.A02 = iAbs;
                    task.A00 = i7;
                    task.A03 = f92;
                    int j2 = c1136cC.A03[i6];
                    task.A01 = j2;
                    i4++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j) {
        for (int i = 0; i < this.A03.size(); i++) {
            AnonymousClass43 anonymousClass43 = this.A03.get(i);
            if (anonymousClass43.A03 == null) {
                return;
            }
            A06(anonymousClass43, j);
            anonymousClass43.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j) {
        AbstractC02244l abstractC02244lA00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j);
        if (abstractC02244lA00 != null && abstractC02244lA00.A09 != null && abstractC02244lA00.A0a() && !abstractC02244lA00.A0b()) {
            A07(abstractC02244lA00.A09.get(), j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(@androidx.annotation.Nullable com.facebook.ads.redexgen.X.F9 r7, long r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L26
            com.facebook.ads.redexgen.X.3r r3 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            java.lang.String r1 = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW"
            r0 = 6
            r2[r0] = r1
            int r0 = r3.A06()
            if (r0 == 0) goto L26
            r7.A1O()
        L26:
            com.facebook.ads.redexgen.X.cC r4 = r7.A02
            r0 = 1
            r4.A04(r7, r0)
            int r0 = r4.A00
            if (r0 == 0) goto L76
            r2 = 0
            r1 = 18
            r0 = 7
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.X.C2V.A01(r0)     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.X.4i r1 = r7.A0s     // Catch: java.lang.Throwable -> L6e
            com.facebook.ads.redexgen.X.4H r0 = r7.A04     // Catch: java.lang.Throwable -> L6e
            r1.A05(r0)     // Catch: java.lang.Throwable -> L6e
            r3 = 0
        L43:
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L6e
            int r5 = r0 * 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            r0 = 6
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            java.lang.String r1 = "nG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "TD"
            r0 = 7
            r2[r0] = r1
            if (r3 >= r5) goto L73
            int[] r0 = r4.A03     // Catch: java.lang.Throwable -> L6e
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L6e
            r6.A00(r7, r0, r8)     // Catch: java.lang.Throwable -> L6e
            int r3 = r3 + 2
            goto L43
        L6e:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C2V.A00()
            throw r0
        L73:
            com.facebook.ads.redexgen.X.C2V.A00()
        L76:
            return
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass44.A07(com.facebook.ads.redexgen.X.F9, long):void");
    }

    public static boolean A08(F9 f9, int i) {
        int iA06 = f9.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            View attachedView = f9.A01.A0A(i2);
            AbstractC02244l abstractC02244lA0G = F9.A0G(attachedView);
            if (abstractC02244lA0G.A03 == i && !abstractC02244lA0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(F9 f9) {
        this.A02.add(f9);
    }

    public final void A0A(F9 f9) {
        this.A02.remove(f9);
    }

    public final void A0B(F9 f9, int i, int i2) {
        if (f9.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = f9.getNanoTime();
            f9.post(this);
        }
        f9.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                F9 f9 = this.A02.get(i);
                int i2 = f9.getWindowVisibility();
                if (i2 == 0) {
                    jMax = Math.max(f9.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(jMax);
            A05(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C2V.A00();
        }
    }
}
