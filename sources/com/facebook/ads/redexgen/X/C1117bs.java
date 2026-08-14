package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1117bs implements InterfaceC0657Mq {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<AnonymousClass59> A00;

    public C1117bs(AnonymousClass59 anonymousClass59) {
        this.A00 = new WeakReference<>(anonymousClass59);
    }

    private void A00(AnonymousClass59 anonymousClass59) {
        C0727Pi c0727Pi = anonymousClass59.A0C;
        if (c0727Pi != null) {
            anonymousClass59.A06.bringChildToFront(c0727Pi);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void A3H(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            anonymousClass59.A06.addView(view, i, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void A3I(View view, RelativeLayout.LayoutParams layoutParams) {
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            anonymousClass59.A06.addView(view, layoutParams);
            A00(anonymousClass59);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public void A3s(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public void A3t(String str, C03309a c03309a) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str, c03309a);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void A8j(String str, C1U c1u) {
        if (this.A00.get() != null) {
            AnonymousClass59 anonymousClass59 = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            anonymousClass59.A0E(str, c1u);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void AAF(int i) {
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (anonymousClass59 != null) {
            anonymousClass59.finish(i);
        }
    }
}
