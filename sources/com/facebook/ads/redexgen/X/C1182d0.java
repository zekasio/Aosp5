package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1182d0 implements InterfaceC01350x {
    public static byte[] A02;
    public static String[] A03 = {"CodBKn6Rx4Nd2NCJ9VlYeJoUvBmT0K9p", "5Rf8WjvcJZOUdeEvkpnEyeT6h0OK8cqO", "9H9umRBAwWbsUQsHVAjP1GvoefoGWKiv", "nqryT6E7", "BkgpBj4q", "vUmBCwuwnOwC6wDkIlhiKnb32h6Srhe1", "47HB5bdSxtP74yDXUEGozfNjn4WOkRGN", "xids5JFtyjlo4uGEh5DI8Wwgi7h0jVQM"};
    public final /* synthetic */ FP A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] ^ i3) ^ 34;
            String[] strArr = A03;
            if (strArr[5].charAt(5) == strArr[1].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "sVZQ6Ml9fBzEITS5ybXWTtwXQoWqWbAN";
            strArr2[1] = "MwEMOJFXQFuJpU8zWQ85tYeWswvxAO3B";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{106, 111, 108, 61, 56, 109, 107, 98, Ascii.SI, 42, 47, 62, 58, 43, 60, 110, 39, 61, 110, 32, 59, 34, 34, 110, 33, 32, 110, 34, 33, 47, 42, 7, 32, 58, 43, 60, 61, 58, 39, 58, 39, 47, 34, Ascii.SI, 42, 93, 122, 96, 113, 102, 103, 96, 125, 96, 125, 117, 120, 52, 125, 121, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 125, 102, 113, 112, 106, 101, 84, 106, 104, 127, 98, 125, 98, 127, 114, 47, 32, 42, 60, 33, 39, 42, 96, 39, 32, 58, 43, 32, 58, 96, 47, 45, 58, 39, 33, 32, 96, Ascii.CAN, 7, Ascii.VT, Ascii.EM, 110, 127, 102, Ascii.VT, 10, 45, 10, Ascii.DLE, 1, Ascii.SYN, Ascii.ETB, Ascii.DLE, Ascii.CR, Ascii.DLE, Ascii.CR, 5, 8, 40, Ascii.VT, 3, 3, Ascii.CR, 10, 3, 45, 9, Ascii.DC4, Ascii.SYN, 1, Ascii.ETB, Ascii.ETB, Ascii.CR, Ascii.VT, 10};
    }

    static {
        A01();
    }

    public C1182d0(FP fp, Runnable runnable) {
        this.A00 = fp;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB1(C1219dc c1219dc, String str, boolean z) {
        this.A00.A06.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 108));
                intent.setData(C0617La.A00(str));
                LN.A0B(this.A00.A0B, intent);
            } catch (LL e) {
                Throwable cause = e.getCause();
                LL cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                this.A00.A0B.A06().A8y(A00(74, 11, 41), C03298z.A04, new AnonymousClass90(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB2(C1219dc c1219dc) {
        this.A00.A06.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB3(C1219dc c1219dc) {
        this.A00.A06.A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB4(C1219dc c1219dc) {
        if (c1219dc != this.A00.A00) {
            return;
        }
        if (c1219dc == null) {
            this.A00.A0B.A06().A8y(A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 3, 45), C03298z.A0X, new AnonymousClass90(A00(8, 37, 108)));
            AB5(c1219dc, AdError.internalError(AdError.INTERNAL_ERROR_2004));
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        FP fp = this.A00;
        fp.A01 = c1219dc;
        fp.A0F();
        this.A00.A06.A0F(c1219dc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB5(C1219dc c1219dc, AdError adError) {
        if (c1219dc != this.A00.A00) {
            return;
        }
        this.A00.A0C().removeCallbacks(this.A01);
        this.A00.A0K(c1219dc);
        this.A00.A0B.A0D().A4Z(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A06.A0G(new KH(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB6(C1219dc c1219dc) {
        KV.A05(A00(114, 31, 70), A00(45, 29, 54), A00(0, 8, 121));
        this.A00.A06.A0D();
        this.A00.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB7() {
        this.A00.A06.A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB8() {
        this.A00.A06.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void AB9() {
        this.A00.A06.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01350x
    public final void onInterstitialActivityDestroyed() {
        this.A00.A06.A02();
    }
}
