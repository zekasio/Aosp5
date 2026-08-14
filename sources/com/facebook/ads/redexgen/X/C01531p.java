package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdSettings;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01531p {
    public static String[] A0D = {"erlsxJKV5RGKo0fyhsjft4C8myFkBTFD", "xxCOSS58nTJL4g358MAx2boWparhVsnt", "50HA7KO7TX73z1", "kwTSvTyvqMkAeNvnsZNufhK8xoNKpC5A", "CvvJJ5wn5WoPjh", "PJeUG8MSArG13FCqdbuWaTyquTMQa3YW", "KbVXHt7uQSAfPtAdYM2eE220TAgmiqZ3", "QWgxf2msfb1fWKXeTjGnwNJbVHOPLzwf"};
    public int A00;
    public long A01;

    @Nullable
    public RewardData A02;

    @Nullable
    public EnumC0593Jz A03;

    @Nullable
    public String A04;

    @Nullable
    public String A05;
    public boolean A06;
    public final KK A07;
    public final KM A08;
    public final String A09;

    @Nullable
    public final EnumSet<CacheFlag> A0A;
    public final int A0B;
    public final AdPlacementType A0C;

    public C01531p(String str, KM km, AdPlacementType adPlacementType, KK kk, int i) {
        this(str, km, adPlacementType, kk, i, EnumSet.of(CacheFlag.NONE));
    }

    public C01531p(String str, KM km, AdPlacementType adPlacementType, KK kk, int i, @Nullable EnumSet<CacheFlag> enumSet) {
        this.A09 = str;
        this.A0C = adPlacementType;
        this.A07 = kk;
        this.A0B = i;
        this.A0A = enumSet;
        this.A08 = km;
        this.A00 = -1;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0C;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        KK kk = this.A07;
        if (kk == null) {
            return AdPlacementType.NATIVE;
        }
        if (kk == KK.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final C0600Kh A01(C0947Xy c0947Xy, KR kr, @Nullable AdExperienceType adExperienceType) {
        M4 m4;
        String adTypeString;
        String str = this.A09;
        KK kk = this.A07;
        if (kk != null) {
            m4 = new M4(kk.A03(), this.A07.A02());
        } else {
            m4 = null;
        }
        KM km = this.A08;
        if (AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT) {
            adTypeString = AdSettings.getTestAdType().getAdTypeString();
        } else {
            adTypeString = null;
        }
        C0600Kh c0600Kh = new C0600Kh(c0947Xy, str, m4, km, adTypeString, this.A0B, AdSettings.isTestMode(c0947Xy), AdSettings.isMixedAudience(), kr, MA.A01(JR.A0H(c0947Xy)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null);
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "1YKhexqCB6oyofjWexJTrFb8PReFz0lW";
        strArr2[3] = "PDYLpd11u8hpbIrKg4rw9QV8MRNrtAlX";
        return c0600Kh;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(@Nullable RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(@Nullable EnumC0593Jz enumC0593Jz) {
        this.A03 = enumC0593Jz;
    }

    public final void A06(@Nullable String str) {
        this.A04 = str;
    }

    public final void A07(@Nullable String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
