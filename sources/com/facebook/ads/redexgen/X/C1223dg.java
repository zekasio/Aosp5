package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1223dg implements InterfaceC0718Oz {
    public final /* synthetic */ C1220dd A00;

    public C1223dg(C1220dd c1220dd) {
        this.A00 = c1220dd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void A8i() {
        String strA00 = this.A00.A02.A0R().A00();
        if (!TextUtils.isEmpty(strA00)) {
            LZ.A0E(new LZ(), this.A00.A03, C0617La.A00(strA00), this.A00.A65());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void AAf(A1 a1) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1224dh(this, a1), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void AAt() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void ACX(View view, MotionEvent motionEvent) {
    }
}
