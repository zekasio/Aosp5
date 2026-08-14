package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0795Ry extends AbstractC0766Qv {
    public final /* synthetic */ InterfaceC0575Jh A00;
    public final /* synthetic */ MK A01;
    public final /* synthetic */ C0719Pa A02;
    public final /* synthetic */ C0793Rw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0795Ry(C0793Rw c0793Rw, String str, C0719Pa c0719Pa, InterfaceC0575Jh interfaceC0575Jh, Map map, MK mk) {
        this.A03 = c0793Rw;
        this.A04 = str;
        this.A02 = c0719Pa;
        this.A00 = interfaceC0575Jh;
        this.A05 = map;
        this.A01 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A02() {
        if (!this.A03.A01.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A07.get(this.A02.A02())) {
            this.A00.A93(this.A04, new OG(this.A05).A03(this.A03.A02).A02(this.A01).A05());
            this.A03.A07.put(this.A02.A02(), true);
        }
    }
}
