package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1165cj extends AbstractC01260o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C1163ch A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C1165cj(C1163ch c1163ch) {
        this.A00 = c1163ch;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A06() {
        this.A00.A0B.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A07() {
        this.A00.A0B.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A0B.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A0B.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0A() {
        if (this.A00.A03 != null) {
            C02425d c02425d = (C02425d) this.A00.A03.buildShowAdConfig();
            c02425d.A02(System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(c02425d.build());
        } else {
            this.A00.A0B.onRewardedVideoClosed();
            this.A00.A07.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0C() {
        this.A00.A0B.onAdClicked(this.A00.A0C.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0D() {
        this.A00.A0B.onLoggingImpression(this.A00.A0C.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0F(InterfaceC01250n interfaceC01250n) {
        if (this.A00.A05 == null) {
            this.A00.A0A.A06().A8y(A00(0, 3, 70), C03298z.A0N, new AnonymousClass90(A00(3, 18, 43)));
            return;
        }
        C1163ch c1163ch = this.A00;
        c1163ch.A08 = c1163ch.A05.A0E();
        AbstractC1207dQ abstractC1207dQ = (AbstractC1207dQ) interfaceC01250n;
        if (this.A00.A0C.A03 != null) {
            abstractC1207dQ.A02(this.A00.A0C.A03);
        }
        AnonymousClass24 anonymousClass24 = this.A00.A0C;
        int iA0D = abstractC1207dQ.A0D();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass24.A00 = iA0D;
        this.A00.A09 = true;
        C1163ch c1163ch2 = this.A00;
        c1163ch2.A04 = c1163ch2.A05.A0T();
        if (this.A00.A04 != null && this.A00.A04.A0G() > 0) {
            C0618Lb c0618Lb = new C0618Lb();
            if (c0618Lb.A09(this.A00.A0A, this.A00.A0C.A06, this.A00.A04.A0G())) {
                c0618Lb.A08(this.A00.A0A, true);
                C1163ch c1163ch3 = this.A00;
                c1163ch3.A03 = c0618Lb.A07(c1163ch3.A0A, this.A00.A0C.A0C, this.A00.A0C.A06);
            } else {
                c0618Lb.A08(this.A00.A0A, false);
            }
        }
        if (this.A00.A03 != null) {
            this.A00.A04.A0m(true);
            this.A00.A03.loadAd(this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0M()).withAdExperience(this.A00.A0C.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.1z
                @Override // com.facebook.ads.AdListener
                public final void onAdClicked(com.facebook.ads.Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public final void onAdLoaded(com.facebook.ads.Ad ad) {
                    this.A00.A00.A0B.onAdLoaded(this.A00.A00.A0C.A00());
                }

                @Override // com.facebook.ads.AdListener
                public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                    this.A00.A00.A03 = null;
                    this.A00.A00.A04.A0m(false);
                    this.A00.A00.A0B.onAdLoaded(this.A00.A00.A0C.A00());
                }

                @Override // com.facebook.ads.AdListener
                public final void onLoggingImpression(com.facebook.ads.Ad ad) {
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoClosed() {
                    this.A00.A00.A0B.onRewardedVideoClosed();
                    this.A00.A00.A07.A05();
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoCompleted() {
                    this.A00.A00.A0B.onRewardedVideoCompleted();
                }
            }).build());
            return;
        }
        this.A00.A0B.onAdLoaded(this.A00.A0C.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01260o
    public final void A0G(KH kh) {
        this.A00.A0F(true);
        this.A00.A0C.A0B.A0D().A2a(MJ.A01(this.A00.A01), kh.A03().getErrorCode(), kh.A04());
        this.A00.A0B.onError(this.A00.A0C.A00(), C0620Ld.A00(kh));
    }
}
