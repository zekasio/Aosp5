package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9D extends SQ {

    @Nullable
    public AbstractC0698Of A00;
    public final ImageView A01;
    public final AnonymousClass57 A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C9D(C0947Xy c0947Xy, NI ni, InterfaceC0575Jh interfaceC0575Jh, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC0657Mq interfaceC0657Mq) {
        super(c0947Xy, ni, interfaceC0575Jh, anonymousClass18, c7u, interfaceC0657Mq);
        this.A02 = new SP(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new T3(this.A01, super.A03).A05(super.A01.A0O().A0D().A00(), super.A01.A0O().A0D().A01()).A06(new SO(this)).A07(super.A01.A0O().A0D().A07());
    }

    private AbstractC0698Of A01(int i) {
        if (this.A01.getParent() != null) {
            MS.A0J(this.A01);
        }
        return C0699Og.A00(new C0701Oi(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i).A0J(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i) {
        MS.A0J(this.A00);
        this.A00 = A01(i);
        C1K colors = this.A00.getColors();
        AbstractC0698Of abstractC0698Of = this.A00;
        MS.A0M(this, colors.A07(abstractC0698Of != null && (abstractC0698Of.A0c() || (this.A00 instanceof AbstractC0819Sw))));
        this.A07.A04(colors, this.A00.A0c());
        addView(this.A00, 0, SQ.A0D);
        AbstractC0698Of abstractC0698Of2 = this.A00;
        setUpFullscreenMode(abstractC0698Of2 != null && abstractC0698Of2.A0c());
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0Q() {
        MS.A0L(this.A00);
        MS.A0L(this.A07);
        this.A03.set(true);
        A05();
        int iA03 = super.A01.A0O().A0D().A03();
        if (iA03 > 0) {
            AbstractC0698Of abstractC0698Of = this.A00;
            if (abstractC0698Of != null) {
                abstractC0698Of.A0a();
            }
            A0R(iA03, new SN(this));
            return;
        }
        this.A05.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final void A0S(AnonymousClass59 anonymousClass59) {
        anonymousClass59.A0K(this.A02);
        A06(anonymousClass59.A0H().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        MS.A0H(this.A00);
        MS.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.SQ
    public final boolean A0T() {
        AbstractC0698Of abstractC0698Of = this.A00;
        return abstractC0698Of != null && abstractC0698Of.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void ABj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AC8(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC0698Of abstractC0698Of = this.A00;
        if (abstractC0698Of != null) {
            return abstractC0698Of.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0O().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SQ, com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void onDestroy() {
        if (JR.A1I(super.A03)) {
            super.A03.A09().AFF(this.A01);
        }
        AbstractC0698Of abstractC0698Of = this.A00;
        if (abstractC0698Of != null) {
            abstractC0698Of.A0W();
        }
        super.onDestroy();
    }
}
