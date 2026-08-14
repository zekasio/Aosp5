package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z6 implements InterfaceC02856v {
    public static String[] A01 = {"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    public final /* synthetic */ C0970Yv A00;

    public Z6(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 26) {
            if (this.A00.A02 != null && this.A00.A02.getPackageInstaller() != null && this.A00.A02.getPackageInstaller().getSessionInfo(0) != null) {
                C0970Yv c0970Yv = this.A00;
                return c0970Yv.A04(c0970Yv.A02.getPackageInstaller().getSessionInfo(0).getInstallReason());
            }
            C0970Yv c0970Yv2 = this.A00;
            AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
            if (A01[4].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A01[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
            return c0970Yv2.A07(anonymousClass76);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
