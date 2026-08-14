package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1042af implements InterfaceC02856v {
    public static String[] A01 = {"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    public final /* synthetic */ C1035aY A00;

    public C1042af(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A01 != null) {
            C1035aY c1035aY = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[2] = "ZWV";
            return c1035aY.A08(c1035aY.A01.sourceDir);
        }
        C1035aY c1035aY2 = this.A00;
        if (A01[6].length() == 14) {
            return c1035aY2.A07(AnonymousClass76.A07);
        }
        A01[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
        return c1035aY2.A07(AnonymousClass76.A07);
    }
}
