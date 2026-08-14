package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class C1249eC {
    public final C1260eN A00;
    public final C1258eL A01;

    public C1249eC(AbstractC1265eS abstractC1265eS, C1258eL c1258eL, C1260eN c1260eN) {
        this.A00 = c1260eN;
        this.A01 = c1258eL;
        abstractC1265eS.A02(new GK(c1258eL));
    }

    public static C1249eC A00(AbstractC1265eS abstractC1265eS, InterfaceC1269eW interfaceC1269eW, GL gl) {
        C1260eN c1260eN = new C1260eN();
        return new C1249eC(abstractC1265eS, new C1258eL(interfaceC1269eW, new GP(), gl, c1260eN, new Handler()), c1260eN);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1267eU c1267eU) {
        this.A00.A02(view, c1267eU);
    }

    public final void A03(@Nullable InterfaceC1264eR interfaceC1264eR) {
        this.A01.A0B(interfaceC1264eR);
    }

    public final void A04(@Nullable InterfaceC1262eP interfaceC1262eP) {
        this.A01.A0C(interfaceC1262eP);
    }
}
