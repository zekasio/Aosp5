package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FJ extends AbstractC1172cq {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};

    @Nullable
    public C1163ch A00;
    public final AnonymousClass24 A01;

    public FJ(AnonymousClass24 anonymousClass24) {
        super(anonymousClass24.A0B, A00(anonymousClass24));
        this.A01 = anonymousClass24;
    }

    public static AnonymousClass23 A00(AnonymousClass24 anonymousClass24) {
        return new C1158cc(anonymousClass24);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1172cq
    public final void A05() {
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            c1163ch.A0I();
        }
        super.A00.AEV(EnumC01581u.A04);
    }

    @Nullable
    public final C1163ch A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C1163ch(this.A01, this, this.A02);
        this.A00.A0M(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A09(com.facebook.ads.Ad ad, @Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        if (super.A00.A5K()) {
            return;
        }
        this.A01.A01(ad);
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            c1163ch.A0M(str, adExperienceType, z);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        AnonymousClass24 anonymousClass24 = this.A01;
        anonymousClass24.A05 = str;
        anonymousClass24.A02 = adExperienceType;
        anonymousClass24.A08 = z;
        A08();
    }

    public final void A0A(RewardData rewardData) {
        this.A01.A03 = rewardData;
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            c1163ch.A0K(rewardData);
        }
    }

    public final boolean A0B() {
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            return c1163ch.A0N();
        }
        return this.A01.A01 > 0 && MJ.A00() > this.A01.A01;
    }

    public final boolean A0C() {
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            return c1163ch.A0O();
        }
        return super.A00.A5d() == EnumC01581u.A06;
    }

    public final boolean A0D(com.facebook.ads.Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((C02425d) rewardedVideoShowAdConfig).A00();
        long jA01 = ((C02425d) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5L()) {
            return false;
        }
        this.A01.A01(ad);
        C1163ch c1163ch = this.A00;
        if (c1163ch != null) {
            return c1163ch.A0P(iA00, jA01);
        }
        this.A00 = new C1163ch(this.A01, this, this.A02);
        this.A00.A0P(iA00, jA01);
        return false;
    }
}
