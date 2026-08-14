package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NN extends FrameLayout {
    public int A00;
    public C2F A01;
    public C2G A02;

    @Nullable
    public C2H A03;
    public final C2D A04;
    public final C0947Xy A05;
    public final InterfaceC0575Jh A06;

    @Nullable
    public final InterfaceC0657Mq A07;

    @Nullable
    public final InterfaceC0658Mr A08;
    public final String A09;

    @Nullable
    public final C1U A0A;
    public final NP A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2H c2h, C2F c2f);

    public abstract void A0O(C2H c2h, C2F c2f);

    public abstract boolean A0P();

    public NN(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str) {
        this(c0947Xy, interfaceC0575Jh, str, null, null, null);
    }

    public NN(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, @Nullable C1U c1u, @Nullable InterfaceC0658Mr interfaceC0658Mr, @Nullable InterfaceC0657Mq interfaceC0657Mq) {
        super(c0947Xy);
        this.A00 = 0;
        this.A01 = C2F.A04;
        this.A03 = null;
        this.A0B = new TJ(this);
        this.A05 = c0947Xy;
        this.A06 = interfaceC0575Jh;
        this.A08 = interfaceC0658Mr;
        this.A07 = interfaceC0657Mq;
        this.A09 = str;
        this.A0A = c1u;
        this.A04 = C2E.A00(this.A05.A00());
    }

    public static /* synthetic */ int A00(NN nn) {
        int i = nn.A00;
        nn.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(NN nn) {
        int i = nn.A00;
        nn.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A8q(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2H c2h) {
        this.A02.A08(this.A01);
        A0N(c2h, this.A01);
        C01320u.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2H c2h) {
        this.A03 = c2h;
        this.A02.A09(this.A01, this.A00);
        A0O(c2h, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2G(new C0583Jp(this.A09, this.A06));
        InterfaceC0658Mr interfaceC0658Mr = this.A08;
        if (interfaceC0658Mr != null) {
            interfaceC0658Mr.ABj(true);
        }
        A0C();
    }
}
