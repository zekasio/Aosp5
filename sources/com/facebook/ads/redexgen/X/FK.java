package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FK extends AbstractC1172cq {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};

    @VisibleForTesting
    public static final AnonymousClass21 A03 = new C1161cf();

    @Nullable
    public C1166ck A00;
    public final AnonymousClass20 A01;

    public FK(AnonymousClass20 anonymousClass20) {
        super(anonymousClass20.A05(), A03.A4N(anonymousClass20));
        this.A01 = anonymousClass20;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1172cq
    public final void A05() {
        C1166ck c1166ck = this.A00;
        if (c1166ck != null) {
            c1166ck.A0F();
        }
        InterfaceC01591v interfaceC01591v = super.A00;
        EnumC01581u enumC01581u = EnumC01581u.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC01591v.AEV(enumC01581u);
    }

    public final C1166ck A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C1166ck(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        if (super.A00.A5K()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C1166ck c1166ck = this.A00;
        if (c1166ck != null) {
            c1166ck.A0I(enumSet, str);
            return;
        }
        this.A01.A0J(enumSet);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C1166ck c1166ck = this.A00;
        if (c1166ck != null) {
            return c1166ck.A0J();
        }
        if (this.A01.A00() > 0) {
            long jA00 = MJ.A00();
            long jA002 = this.A01.A00();
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (jA00 > jA002) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C1166ck c1166ck = this.A00;
        if (c1166ck != null) {
            return c1166ck.A0K();
        }
        return super.A00.A5d() == EnumC01581u.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5L()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C1166ck c1166ck = this.A00;
        if (c1166ck != null) {
            return c1166ck.A0L();
        }
        this.A00 = new C1166ck(this.A01, this, this.A02);
        this.A00.A0L();
        return false;
    }
}
