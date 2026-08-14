package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4a, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4a {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C4Z> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        long j3 = j / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j3 * 3) + (j2 / 4);
    }

    private C4Z A01(int i) {
        C4Z c4z = this.A00.get(i);
        if (c4z == null) {
            C4Z c4z2 = new C4Z();
            this.A00.put(i, c4z2);
            return c4z2;
        }
        return c4z;
    }

    private final void A02() {
        for (int i = 0; i < this.A00.size(); i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final AbstractC02244l A03(int i) {
        C4Z c4z = this.A00.get(i);
        if (c4z != null && !c4z.A03.isEmpty()) {
            ArrayList<AbstractC02244l> arrayList = c4z.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C4Z c4zA01 = A01(i);
        c4zA01.A01 = A00(c4zA01.A01, j);
    }

    public final void A06(int i, long j) {
        C4Z c4zA01 = A01(i);
        c4zA01.A02 = A00(c4zA01.A02, j);
    }

    public final void A07(C4H c4h) {
        this.A01++;
    }

    public final void A08(C4H c4h, C4H c4h2, boolean z) {
        if (c4h != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (c4h2 != null) {
            A07(c4h2);
        }
    }

    public final void A09(AbstractC02244l abstractC02244l) {
        int iA0H = abstractC02244l.A0H();
        ArrayList<AbstractC02244l> arrayList = A01(iA0H).A03;
        if (this.A00.get(iA0H).A00 <= arrayList.size()) {
            return;
        }
        abstractC02244l.A0Q();
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC02244l);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
