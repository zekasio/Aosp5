package com.facebook.ads.redexgen.X;

import com.google.android.gms.games.GamesActivityResultCodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1051ao implements InterfaceC02856v {
    public final /* synthetic */ C1035aY A00;

    public C1051ao(C1035aY c1035aY) {
        this.A00 = c1035aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() throws Exception {
        String strA06 = this.A00.A03.A06(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
        if (strA06 != null) {
            return this.A00.A08(strA06);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
