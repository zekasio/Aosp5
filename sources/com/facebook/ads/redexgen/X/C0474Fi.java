package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.proguard.annotations.DoNotStrip;
import com.google.android.gms.drive.DriveFile;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0474Fi extends AbstractC1207dQ {
    public static byte[] A0D;
    public static String[] A0E = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass14 A01;
    public AnonymousClass15 A02;
    public AnonymousClass18 A03;
    public C0947Xy A04;
    public C0583Jp A05;
    public EnumC0608Kq A06;

    @Nullable
    @DoNotStrip
    public PA A07;
    public String A08;

    @Nullable
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 6, 3, Ascii.SI, 4, Ascii.RS, 62, 5, 1, Ascii.SI, 4, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, Ascii.FF, Ascii.DLE, Ascii.GS, Ascii.US, Ascii.EM, 17, Ascii.EM, Ascii.DC2, 8, 53, Ascii.CAN, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, Ascii.US, Ascii.ESC, 19, 104, 127, 109, 123, 104, 126, 73, 127, 104, 108, 127, 104, 79, 72, 86, Ascii.EM, Ascii.SO, Ascii.FS, 10, Ascii.EM, Ascii.SI, Ascii.SO, Ascii.SI, 61, 2, Ascii.SI, Ascii.SO, 4, 42, Ascii.SI, 47, 10, Ascii.US, 10, 41, Ascii.RS, 5, Ascii.SI, 7, Ascii.SO, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C2T c2tA00 = C2T.A00(this.A04);
        AnonymousClass15 anonymousClass15 = this.A02;
        c2tA00.A06(anonymousClass15, anonymousClass15.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C2T.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i = super.A00;
        String strA04 = A04(69, 24, 89);
        if (i != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0E[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i2 = super.A00;
                if (A0E[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(strA04, i2);
                return;
            }
        }
        if (!JR.A0e(this.A04)) {
            intent.putExtra(strA04, 6);
        }
    }

    private void A0A(boolean z) {
        if (this.A06 == EnumC0608Kq.A0C) {
            A0C(z);
            return;
        }
        EnumC0608Kq enumC0608Kq = this.A06;
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC0608Kq == EnumC0608Kq.A0B) {
            A0B(z);
        } else {
            A0C(z);
        }
    }

    private void A0B(boolean z) {
        C7U c7u = new C7U(this.A04);
        boolean z2 = JR.A1U(this.A04) && C02455g.A0A(this.A03.A0d());
        if (z2) {
            C02455g c02455g = new C02455g(c7u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z2, new C1213dW(this));
            C0583Jp funnelLoggingHandler = new C0583Jp(this.A03.A0U(), this.A04.A08());
            c7u.A0d(funnelLoggingHandler);
            c02455g.A0B();
            return;
        }
        C01511n.A02(this.A04, this.A03, z, new C1212dV(this));
    }

    private void A0C(boolean isUnifiedAssetsLoaderEnabled) {
        C7U c7u = new C7U(this.A04);
        c7u.A0d(this.A05);
        boolean z = JR.A1U(this.A04) && C02455g.A0A(this.A03.A0d());
        boolean zA0r = this.A03.A0r();
        if (z) {
            new C02455g(c7u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C1215dY(this, zA0r)).A0B();
            return;
        }
        C1196dF c1196dF = (C1196dF) this.A03;
        if (TextUtils.isEmpty(c1196dF.A0O().A0D().A08())) {
            this.A01.ACF(this, AdError.INTERNAL_ERROR);
        } else {
            C01521o.A02(this.A04, c7u, c1196dF);
            c7u.A0W(new C0481Fp(this, isUnifiedAssetsLoaderEnabled, zA0r, c1196dF, this), new C7N(c1196dF.A0Z(), A04(144, 14, 91)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1207dQ
    public final int A0D() {
        AnonymousClass18 anonymousClass18 = this.A03;
        if (anonymousClass18 != null) {
            return anonymousClass18.A0K();
        }
        String[] strArr = A0E;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0E[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1207dQ
    public final AnonymousClass18 A0E() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1207dQ
    public final boolean A0F() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0f(super.A01);
        String strA03 = C0736Pr.A03(super.A02, this.A0B, this.A08);
        this.A03.A0g(super.A02);
        this.A03.A0k(strA03);
        AdActivityIntent adActivityIntentA04 = LN.A04(this.A04);
        adActivityIntentA04.putExtra(A04(166, 8, 91), this.A06);
        adActivityIntentA04.putExtra(A04(119, 25, 21), this.A03);
        adActivityIntentA04.putExtra(A04(158, 8, 119), this.A0B);
        if (strA03 != null) {
            adActivityIntentA04.putExtra(A04(104, 15, 100), strA03);
        }
        adActivityIntentA04.putExtra(A04(58, 11, 2), this.A0A);
        adActivityIntentA04.putExtra(A04(93, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            adActivityIntentA04.putExtra(A04(45, 13, 87), str);
        }
        A09(adActivityIntentA04);
        adActivityIntentA04.setFlags(adActivityIntentA04.getFlags() | DriveFile.MODE_READ_ONLY);
        adActivityIntentA04.putExtra(A04(34, 11, 20), this.A03.A0U());
        ActivityUtils.A03(this.A04);
        try {
            LN.A09(this.A04, adActivityIntentA04);
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            this.A04.A06().A8y(A04(23, 11, 115), C03298z.A01, new AnonymousClass90(cause2));
        }
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0G(C0947Xy c0947Xy, AnonymousClass14 anonymousClass14, C01541q c01541q, boolean z, @Nullable String str, @Nullable String str2) {
        this.A0C.set(false);
        this.A04 = c0947Xy;
        this.A01 = anonymousClass14;
        this.A0A = c01541q.A02();
        this.A00 = c01541q.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A08 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        this.A03 = C1196dF.A01(c01541q.A03(), this.A04);
        this.A03.A0i(str);
        this.A03.A0e(c01541q.A01().A06());
        this.A05 = new C0583Jp(this.A03.A0U(), c0947Xy.A08());
        if (this.A03.A0r()) {
            this.A06 = EnumC0608Kq.A05;
            if (this.A03.A0o()) {
                C0R c0rA0D = this.A04.A0D();
                EnumC01150c enumC01150c = EnumC01150c.A04;
                String[] strArr = A0E;
                if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                    String[] strArr2 = A0E;
                    strArr2[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
                    strArr2[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
                    c0rA0D.AEj(enumC01150c);
                }
                throw new RuntimeException();
            }
            this.A04.A0D().AEj(EnumC01150c.A06);
            this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
            A06();
            A0A(z);
        }
        int iA0J = this.A03.A0J();
        if (iA0J == 0) {
            this.A06 = EnumC0608Kq.A0C;
            C0947Xy c0947Xy2 = this.A04;
            String[] strArr3 = A0E;
            if (strArr3[4].charAt(5) != strArr3[5].charAt(5)) {
                String[] strArr4 = A0E;
                strArr4[4] = "sE7A2oUzbi1vVIMuEE2CogviWDEosGc5";
                strArr4[5] = "5NgD8lzbPLe7uQJdX4ST7JevLzoIctPR";
                c0947Xy2.A0D().AEj(EnumC01150c.A09);
            }
            throw new RuntimeException();
        }
        if (iA0J == 1) {
            this.A06 = EnumC0608Kq.A0B;
            this.A04.A0D().AEj(EnumC01150c.A08);
        }
        this.A02 = new AnonymousClass15(this.A0B, this, anonymousClass14);
        A06();
        A0A(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    public final String A65() {
        return this.A03.A0U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    public final void onDestroy() {
        A07();
    }
}
