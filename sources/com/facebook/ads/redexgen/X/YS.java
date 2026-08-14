package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YS implements InterfaceC02856v {
    public static String[] A01 = {"Vh7d3JLClPU6O6M8cwd6Jw", "qoTOEE24iOX0Q2iJnmkuihyFZ58dtUeG", "nAWEC03NDSwq9NkCe2EWt", "lKLCTUg5DoQjO8iCafmP2M1qyzkHzRyN", "zIUGSnqgNQBLElYl1akNx9HRDEYjixyz", "g15BZq0dmNsNcXFZVGLSC", "388jVMFAtK4Tm3JKA9SjxAcbz1TvPoye", "A1Sv5qAzVDWgkr4HaP1"};
    public final /* synthetic */ YR A00;

    public YS(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 28) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        YR yr = this.A00;
        String[] strArr = A01;
        if (strArr[4].charAt(18) != strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "bZz0x6nk4wqsfLm60KBH7nDut9sP39y5";
        strArr2[3] = "KyjNNUgB1DvvpLcjDLXdCxQbayCmxayp";
        if (yr.A00 != null) {
            YR yr2 = this.A00;
            return yr2.A04(yr2.A00.getSimCarrierId());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
