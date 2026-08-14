package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1155cZ implements MB<Bundle> {
    public static byte[] A03;
    public final C2C A00;
    public final Q4 A01;
    public final List<C1154cY> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public C1155cZ(List<C2A> list, Bundle bundle, Q4 q4) {
        this.A02 = new ArrayList(list.size());
        this.A01 = q4;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C1154cY(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (C2C) M5.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public C1155cZ(List<C2A> list, Q4 q4) {
        this.A02 = new ArrayList(list.size());
        this.A01 = q4;
        Iterator<C2A> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1154cY(it.next()));
        }
        this.A00 = new C2C();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), M5.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1154cY> it = this.A02.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().A05());
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2C A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (C1154cY test : this.A02) {
            test.A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double dA7p = this.A01.A7p();
        this.A00.A04(d, dA7p);
        Iterator<C1154cY> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, dA7p);
        }
    }
}
