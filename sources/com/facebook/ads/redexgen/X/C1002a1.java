package com.facebook.ads.redexgen.X;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1002a1 implements InterfaceC02856v {
    public final /* synthetic */ C0982Zh A00;

    public C1002a1(C0982Zh c0982Zh) {
        this.A00 = c0982Zh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A0E(Arrays.asList(strArr));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
