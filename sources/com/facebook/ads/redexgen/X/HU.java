package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HU {
    public final int A00;
    public final HR A01;

    @Nullable
    public final Object A02;
    public final C0376Av[] A03;

    public HU(C0376Av[] c0376AvArr, HQ[] hqArr, @Nullable Object obj) {
        this.A03 = c0376AvArr;
        this.A01 = new HR(hqArr);
        this.A02 = obj;
        this.A00 = c0376AvArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(HU hu) {
        if (hu == null || hu.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(hu, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HU hu, int i) {
        return hu != null && C0567Iz.A0g(this.A03[i], hu.A03[i]) && C0567Iz.A0g(this.A01.A00(i), hu.A01.A00(i));
    }
}
