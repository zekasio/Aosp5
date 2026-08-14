package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S5 extends AbstractC0766Qv {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC0575Jh A00;
    public final /* synthetic */ MK A01;
    public final /* synthetic */ C0719Pa A02;
    public final /* synthetic */ S3 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public S5(S3 s3, String str, C0719Pa c0719Pa, InterfaceC0575Jh interfaceC0575Jh, Map map, MK mk) {
        this.A03 = s3;
        this.A04 = str;
        this.A02 = c0719Pa;
        this.A00 = interfaceC0575Jh;
        this.A05 = map;
        this.A01 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0766Qv
    public final void A02() {
        if (this.A03.A01.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str) && !this.A03.A04.get(this.A02.A02())) {
            this.A00.A93(this.A04, new OG(this.A05).A03(this.A03.A02).A02(this.A01).A05());
            this.A03.A04.put(this.A02.A02(), true);
        }
    }
}
