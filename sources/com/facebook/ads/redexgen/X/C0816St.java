package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.St, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0816St extends AbstractC0698Of {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C0707Oo A00;

    public C0816St(C0702Oj c0702Oj, boolean z) {
        super(c0702Oj, z);
        this.A00 = new C0707Oo(c0702Oj.A05(), c0702Oj.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0698Of.A08, AbstractC0698Of.A08, AbstractC0698Of.A08, AbstractC0698Of.A08);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c0702Oj.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0698Of.A08, 0, AbstractC0698Of.A08, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        if (d > 0.0d) {
            this.A00.A00((int) (((double) (A01 - (AbstractC0698Of.A08 * 2))) / d));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A0c() {
        return false;
    }
}
