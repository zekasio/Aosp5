package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AI extends SB {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public AI(C2M c2m, int i, @Nullable List<C0719Pa> list, @Nullable C0767Qw c0767Qw, @Nullable Bundle bundle) {
        super(c2m, i, list, c0767Qw, bundle);
        c2m.A1j(this);
        this.A03 = new TD(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA27 = this.A0C.A27();
        if (this.A05 != null && iA27 != -1 && iA27 < this.A05.size() - 1) {
            A0V(iA27 + 1);
        }
    }

    private void A01(int lastVisibleItem) {
        int iA28 = this.A0C.A28();
        int iA29 = this.A0C.A29();
        int visibleItem = this.A0C.A27();
        if (visibleItem != iA28) {
            A0S(iA28);
        }
        if (visibleItem != iA29) {
            A0S(iA29);
        }
        A0T(visibleItem);
        A0W(iA28, iA29, lastVisibleItem);
    }

    @Override // com.facebook.ads.redexgen.X.SB, com.facebook.ads.redexgen.X.C4Y
    public final void A0L(F9 f9, int i) {
    }

    @Override // com.facebook.ads.redexgen.X.SB, com.facebook.ads.redexgen.X.C4Y
    public final void A0M(F9 f9, int i, int i2) {
        if (this.A0C.A27() != -1) {
            AbstractC0808Sl abstractC0808Sl = (AbstractC0808Sl) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC0808Sl != null && abstractC0808Sl.A0i() && !abstractC0808Sl.A0h()) {
                abstractC0808Sl.A0f();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final void A0a(AbstractC0808Sl abstractC0808Sl, boolean z) {
        A0Y(abstractC0808Sl, z);
        if (!z && abstractC0808Sl.A0h()) {
            abstractC0808Sl.A0e();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SB
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C0767Qw A0c() {
        return this.A04;
    }

    public final void A0d(C0767Qw c0767Qw) {
        this.A04 = c0767Qw;
    }

    public final void A0e(List<C0719Pa> list) {
        this.A05 = list;
    }
}
