package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1128c4 implements C4N {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ F9 A00;

    public C1128c4(F9 f9) {
        this.A00 = f9;
    }

    @Override // com.facebook.ads.redexgen.X.C4N
    public final void A9z(AbstractC02244l abstractC02244l) {
        abstractC02244l.A0Z(true);
        if (abstractC02244l.A06 != null && abstractC02244l.A07 == null) {
            abstractC02244l.A06 = null;
        }
        abstractC02244l.A07 = null;
        if (!abstractC02244l.A0A() && !this.A00.A1z(abstractC02244l.A0H) && abstractC02244l.A0e()) {
            F9 f9 = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            f9.removeDetachedView(abstractC02244l.A0H, false);
        }
    }
}
