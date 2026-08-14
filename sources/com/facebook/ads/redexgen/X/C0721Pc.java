package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0721Pc extends FrameLayout {
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public C0364Aj A00;

    @Nullable
    public C0742Px A01;

    @Nullable
    public AnonymousClass89 A02;
    public KS A03;
    public C02987m A04;
    public C02796p A05;
    public final C0947Xy A06;
    public final C0583Jp A07;

    public C0721Pc(C0947Xy c0947Xy, C0583Jp c0583Jp) {
        super(c0947Xy);
        this.A07 = c0583Jp;
        this.A06 = c0947Xy;
        setUpView(c0947Xy);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C0742Px c0742Px = this.A01;
        if (c0742Px != null) {
            c0742Px.A0A();
            this.A01 = null;
        }
        AnonymousClass89 anonymousClass89 = this.A02;
        if (anonymousClass89 != null) {
            anonymousClass89.A0g();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC03329c abstractC03329c) {
        this.A00.getEventBus().A05(abstractC03329c);
    }

    public final void A04(InterfaceC0575Jh interfaceC0575Jh, String str, Map<String, String> extraParams) {
        A02();
        this.A02 = new AnonymousClass89(this.A06, interfaceC0575Jh, this.A00, str, extraParams);
        if (JR.A1J(this.A06)) {
            this.A01 = new C0742Px(this.A06, interfaceC0575Jh, this.A00, str, extraParams);
        } else {
            this.A01 = null;
        }
    }

    public final void A05(Q6 q6) {
        this.A00.A0b(q6, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public QK getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C0947Xy c0947Xy) {
        this.A00.A0X();
        this.A04 = new C02987m(c0947Xy);
        this.A00.A0c(this.A04);
        this.A03 = new KS(c0947Xy, this.A07);
        this.A00.A0c(new C03047u(c0947Xy));
        this.A00.A0c(this.A03);
        this.A05 = new C02796p(c0947Xy, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new KT(this.A05, QJ.A03, true, true));
        if (!this.A00.A0g() && !JR.A21(c0947Xy)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C0947Xy c0947Xy) {
        this.A00 = new C0364Aj(c0947Xy);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        MS.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0720Pb(this));
    }

    private void setUpView(C0947Xy c0947Xy) {
        setUpVideo(c0947Xy);
        setUpPlugins(c0947Xy);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
