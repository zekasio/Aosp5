package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1107bi implements InterfaceC0718Oz {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1102bd A01;
    public final /* synthetic */ UB A02;

    public C1107bi(C1102bd c1102bd, UB ub, NativeAd nativeAd) {
        this.A01 = c1102bd;
        this.A02 = ub;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void A8i() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void AAf(A1 a1) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1108bj(this, a1), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void AAt() {
        if (this.A01.A0A != null) {
            this.A01.A0A.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0718Oz
    public final void ACX(View view, MotionEvent motionEvent) throws Throwable {
        this.A02.A19().A06(this.A01.A07, motionEvent, view, view);
        if (motionEvent.getAction() == 1 && !this.A01.A0J(this.A00) && this.A02.A12() != null) {
            this.A02.A12().onClick(view);
        }
    }
}
