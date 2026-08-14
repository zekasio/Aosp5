package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0972Yx implements InterfaceC02856v {
    public static String[] A01 = {"BjEOBj6HSQS8i4DRK2qoJX27hoC0R4DA", "kauKwe7CVPrqe4cOgSIwGmxqelbhToEk", "XZC7QZo7Jtp8ceyvJGPCObnucv7Agiw", "JUan8YMmX5ogxlB6aq0dkHVlKOHTqFeF", "IuTolVrjy7qRtOK6QcTLTodgNQuY61bU", "4L2hIP4Kb6m", "Yg6y90VIZ7Ah3ybSxqXW6wOi2HMwnGfT", "hl8KcVIJUlPiTEXEjbalUYczznSZgz62"};
    public final /* synthetic */ C0970Yv A00;

    public C0972Yx(C0970Yv c0970Yv) {
        this.A00 = c0970Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A04 != null) {
            C0970Yv c0970Yv = this.A00;
            ActivityInfo[] activityInfoArr = c0970Yv.A04;
            if (A01[3].charAt(20) != 'k') {
                throw new RuntimeException();
            }
            A01[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
            return c0970Yv.A04(activityInfoArr.length);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
