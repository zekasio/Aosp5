package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S4 implements InterfaceC0711Os {
    public static String[] A02 = {"z07VqEjGvJ", "HVUavbLQzawZdZVBJZvs2mdfMmVurwko", "OXCJr9QWCT6iNhGP7b2SKXpA8jzUGtxO", "XfWPaMhvYm", "d0mI5Otk4DkPTVLBqA06pYB2qhxVYO4x", "4lS6eLthtLYEvbxsvILcFz16jeQVP", "9TNy9PrFUeRgfy9Rk5pKZK4U", "r8zM3TRfMT7OJmVxj71ND5jlCBdKG"};
    public final /* synthetic */ C0719Pa A00;
    public final /* synthetic */ S3 A01;

    public S4(S3 s3, C0719Pa c0719Pa) {
        this.A01 = s3;
        this.A00 = c0719Pa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0711Os
    public final void AA3() {
        if (this.A00.A02() == 0) {
            C0767Qw c0767Qw = this.A01.A01;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "rJocaZsUv9";
            strArr2[6] = "3nzpDtzjz9tePwbisyAfJiul";
            c0767Qw.A0U();
        }
        if (this.A01.A02 != null) {
            this.A01.A02.A0U();
        }
    }
}
