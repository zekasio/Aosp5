package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1038ab implements InterfaceC02856v {
    public static String[] A01 = {"9CH7FUr60fjSOu0uDtam6QWrW1LAXcO0", "MGZ5NGAJYsXrcQ530Rpa4mq072uYsiXm", "FSEpTqAJrXrPXD8Cb", "YDmM9nsCETgUfJB46tzDOSpydcNxEQ3F", "VGv8Kw1xSq2totQkDwmbaDQvoJVXTwia", "PqLjk4LqC3tC9ytXEM059nB67sHSnsxP", "xjbenFCMrkBs7EfKqhSnYCZ0lRG62qii", "xgMaaa53aLKiV09tKVXK6rj7dvlbsjte"};
    public final /* synthetic */ C1035aY A00;

    public C1038ab(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.A00.A01 != null) {
                C1035aY c1035aY = this.A00;
                return c1035aY.A08(c1035aY.A01.deviceProtectedDataDir);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        C1035aY c1035aY2 = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A05;
        String[] strArr = A01;
        if (strArr[4].charAt(20) == strArr[5].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "fnZh3TS8JAEKtifjP4n7RBztgRvZoar8";
        strArr2[2] = "4XQjD71oxr9tiB6pv";
        return c1035aY2.A07(anonymousClass76);
    }
}
