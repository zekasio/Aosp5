package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1046aj implements InterfaceC02856v {
    public static String[] A01 = {"xoHvVsjIwv7W5ClpzJbisJEpOcq", "SYDRmpizq5sDZ4GfL4h8WluGMHdmoTuM", "DVzF2PeQv7hgrICuH3nyQdrZNKSxdA", "4lIziXMzxgphshR2rAqW9SlDjwpMcvxS", "Bksnruu9CDcd9v5jIjvraWrOMG1PGOq1", "vT5fBH5lG6OjAtE20tf2f7rqol7xKp1H", "b74VzSGUDjeF5gq780pkK2xwxVTOFG7b", "77MleEyOR9uHuiszCvhjWPNRz4PKDadz"};
    public final /* synthetic */ C1035aY A00;

    public C1046aj(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        String strA0f = this.A00.A02.A0f();
        if (strA0f != null) {
            C1035aY c1035aY = this.A00;
            if (A01[7].charAt(13) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "f9T5AhYAPA98oVvlWKPWGyhu6RS3SO";
            strArr[0] = "b7yxm3cRAk17Eqj8H4F2BjoUql6";
            return c1035aY.A08(strA0f);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
