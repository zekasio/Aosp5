package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TI extends NN {
    public static final int A03 = (int) (Lr.A00 * 8.0f);
    public final RelativeLayout A00;
    public final C2D A01;
    public final C0947Xy A02;

    public TI(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, C1U c1u, InterfaceC0658Mr interfaceC0658Mr, InterfaceC0657Mq interfaceC0657Mq) {
        super(c0947Xy, interfaceC0575Jh, str, c1u, interfaceC0658Mr, interfaceC0657Mq);
        this.A02 = c0947Xy;
        this.A01 = C2E.A00(c0947Xy.A00());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        MS.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new NS(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            MS.A0V(this, transitionSet);
            return;
        }
        MS.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0L() {
        C2H reportingReason = this.A01.A0A();
        C0669Nc adChoicesView = new C0669Nc(this.A02);
        adChoicesView.setInfo(EnumC0641Ma.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        adChoicesView.setOnClickListener(new NT(this));
        C2H c2hA0B = this.A01.A0B();
        C0669Nc c0669Nc = new C0669Nc(this.A02);
        c0669Nc.setInfo(EnumC0641Ma.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c0669Nc.setOnClickListener(new NU(this));
        C0669Nc c0669Nc2 = new C0669Nc(this.A02);
        c0669Nc2.setInfo(EnumC0641Ma.AD_CHOICES_ICON, this.A01.A0M(), "");
        c0669Nc2.setOnClickListener(new NV(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        MS.A0M(linearLayout, -1);
        if (!reportingReason.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!c2hA0B.A05().isEmpty()) {
            linearLayout.addView(c0669Nc, layoutParams);
        }
        linearLayout.addView(c0669Nc2, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0M() {
        MS.A0I(this);
        this.A00.removeAllViews();
        MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0N(C2H c2h, C2F c2f) {
        String strA0E;
        int i;
        if (c2f == C2F.A04) {
            return;
        }
        boolean z = c2f == C2F.A05;
        NL nl = new NL(this.A02, this.A0B);
        if (z) {
            strA0E = this.A01.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        NL nlA0E = nl.A0I(strA0E).A0H(this.A01.A0D()).A0F(c2h.A04()).A0E(z ? EnumC0641Ma.REPORT_AD : EnumC0641Ma.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        NM nmA0M = nlA0E.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        MS.A0M(nmA0M, -1);
        MS.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(nmA0M, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final void A0O(C2H c2h, C2F c2f) {
        String strA0H;
        boolean z = c2f == C2F.A05;
        C0947Xy c0947Xy = this.A02;
        NP np = this.A0B;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C0672Nf c0672Nf = new C0672Nf(c0947Xy, c2h, np, strA0H, z ? EnumC0641Ma.REPORT_AD : EnumC0641Ma.HIDE_AD);
        c0672Nf.setClickable(true);
        MS.A0M(c0672Nf, -1);
        int i = A03;
        c0672Nf.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c0672Nf, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NN
    public final boolean A0P() {
        return false;
    }
}
