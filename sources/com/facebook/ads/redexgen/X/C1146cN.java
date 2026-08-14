package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1146cN implements InterfaceC01812s {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3M A01;

    public C1146cN(C3M c3m) {
        this.A01 = c3m;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01812s
    public final C3P AA0(View view, C3P c3p) {
        C3P c3pA06 = AnonymousClass38.A06(view, c3p);
        if (c3pA06.A07()) {
            return c3pA06;
        }
        Rect rect = this.A00;
        rect.left = c3pA06.A03();
        rect.top = c3pA06.A05();
        rect.right = c3pA06.A04();
        rect.bottom = c3pA06.A02();
        int childCount = this.A01.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3P c3pA05 = AnonymousClass38.A05(this.A01.getChildAt(i), c3pA06);
            rect.left = Math.min(c3pA05.A03(), rect.left);
            rect.top = Math.min(c3pA05.A05(), rect.top);
            rect.right = Math.min(c3pA05.A04(), rect.right);
            rect.bottom = Math.min(c3pA05.A02(), rect.bottom);
        }
        return c3pA06.A06(rect.left, rect.top, rect.right, rect.bottom);
    }
}
