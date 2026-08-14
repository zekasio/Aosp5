package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0974Yz implements InterfaceC02856v {
    public static String[] A01 = {"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    public final /* synthetic */ C0970Yv A00;

    public C0974Yz(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A01 != null && Build.VERSION.SDK_INT >= 22) {
            C0970Yv c0970Yv = this.A00;
            if (A01[1].length() != 30) {
                throw new RuntimeException();
            }
            A01[6] = "SsABSdrOWb5CHUfmSefeH";
            return c0970Yv.A04(c0970Yv.A01.baseRevisionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
