package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0951Yc implements InterfaceC02856v {
    public static String[] A01 = {"Zr9pMbCXDOnIQia1rxNbs", "xgHdKmUla89dgoNlEUmYBSdthljERTVN", "t0eJ9CzsilrQTJZ3mBY5uHdLOToWpPD0", "xn7Df6Bsn6N8b", "nuXOesuXOGqaff6jWjDzzwB48Mr7m9Ru", "HD4PNhpjIErL9f7FhF1L2XB0w8jmfy8z", "GFJMAbd7JtPv78Iw3eZ5GKABpr6j7C", "a6D5eDw1EZzTAa7WvhZLV0FGc6KUpGTS"};
    public final /* synthetic */ YR A00;

    public C0951Yc(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    @SuppressLint({"MissingPermission"})
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 17) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        boolean zA0D = C7J.A0D();
        if (A01[2].charAt(7) != 's') {
            throw new RuntimeException();
        }
        A01[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        if (zA0D) {
            boolean zA0C = C7J.A0C();
            if (A01[1].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            A01[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            if (zA0C) {
                return this.A00.A07(AnonymousClass76.A07);
            }
        }
        if (this.A00.A00 != null) {
            YR yr = this.A00;
            return yr.A04(YR.A01(yr.A00.getAllCellInfo().get(0)));
        }
        YR yr2 = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
        String[] strArr = A01;
        if (strArr[3].length() == strArr[6].length()) {
            return yr2.A07(anonymousClass76);
        }
        String[] strArr2 = A01;
        strArr2[3] = "coCM9MFponCPc";
        strArr2[6] = "NV1iD8UH9ErBba9OnjbAeyrfSpL8qw";
        return yr2.A07(anonymousClass76);
    }
}
