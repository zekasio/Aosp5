package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0461Ev implements Runnable {
    public static String[] A02 = {"PHglGL4XjX34Q6IxLVPE9YioC0GgMwVu", "C2v6p3cvqb8VeZJmls5VVCvxLYipHy3t", "B1N0Tyuu9FQ6QTrTU7ijuANEMG", "iuv0k0UwV2hxTLPIE5sOwikENKEW9q70", "E2s9cNULSafngvXq", "pcZveafGMpvyt6r1oEwZuN", "WTgfgYLlZCoaxL5kkJP8NMEH1L99huZD", "JeTmk3Th2rZrNzRyDKokFPK9mdehXDhr"};
    public final /* synthetic */ RunnableC0463Ex A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC0461Ev(RunnableC0463Ex runnableC0463Ex, Throwable th) {
        this.A00 = runnableC0463Ex;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G(1, this.A01 != null ? 4 : 2, this.A01) && !this.A00.A0F(6, 3) && !this.A00.A0F(7, 0)) {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
            String[] strArr = A02;
            if (strArr[3].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "RKKtkNHXa9KnDNNutMsCnoFR2DmhfaHg";
            strArr2[7] = "GRntkGfXke7q4gy1a5nBcYrAffQzlmQw";
        }
    }
}
