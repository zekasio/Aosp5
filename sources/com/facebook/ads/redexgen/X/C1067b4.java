package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1067b4 implements InterfaceC02856v {
    public static String[] A01 = {"ks6FgoJovve7iHM2pZkl", "wha53u", "49wSJ7V8XkDKZTUcjMDnpoSn", "1JQ5I5ad77Yrp3ewkirQ0oRutiEmvr6i", "jAt3ZHaaMbDXz0fIQiir7V", "EKdcAjdCbYFTR4bnYqi4SV", "MwtlcC", "w1RouBmka6J1zGDRhikmrfItH78owLWg"};
    public final /* synthetic */ C1056at A00;

    public C1067b4(C1056at c1056at) {
        this.A00 = c1056at;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A02 != null) {
            return this.A00.A0F(ActivityManager.isUserAMonkey());
        }
        C1056at c1056at = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
        if (A01[2].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "MHidzBjnmsHNQkooJipxy3AaWgleVPOv";
        strArr[7] = "EW2Ra62KpqEXQLSIkiFDqiivYFqdEGvM";
        return c1056at.A07(anonymousClass76);
    }
}
