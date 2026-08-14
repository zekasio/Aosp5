package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01411d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};

    @Nullable
    public C7U A00;
    public OH A01 = OH.A06;

    @Nullable
    @DoNotStrip
    public PA A02;
    public final C1200dJ A03;
    public final InterfaceC01401c A04;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, Ascii.US, 34, Ascii.GS, 34, Ascii.US, 50, Ascii.US, Ascii.GS, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    static {
        A07();
    }

    public C01411d(C0947Xy c0947Xy, C01541q c01541q, InterfaceC01401c interfaceC01401c, @Nullable String str) {
        this.A03 = A02(c0947Xy, c01541q, str, c01541q.A03());
        this.A04 = interfaceC01401c;
    }

    @Nullable
    private AdError A00(C0947Xy c0947Xy) {
        if (this.A03.A0c().isEmpty()) {
            c0947Xy.A06().A8y(A06(62, 3, 18), C03298z.A0Z, new AnonymousClass90(A06(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1200dJ A02(C0947Xy c0947Xy, C01541q c01541q, @Nullable String str, JSONObject jSONObject) {
        C1200dJ adDataBundle = C1200dJ.A01(jSONObject, c0947Xy);
        adDataBundle.A0i(str);
        C9I c9iA01 = c01541q.A01();
        if (c9iA01 != null) {
            adDataBundle.A0e(c9iA01.A06());
        }
        return adDataBundle;
    }

    private C7U A04(C0947Xy c0947Xy) {
        C7U c7u = this.A00;
        return c7u != null ? c7u : new C7U(c0947Xy);
    }

    private void A08(C0947Xy c0947Xy) {
        C1W c1wA06 = this.A03.A0O().A0D().A06();
        A0A(c1wA06 != null ? c1wA06.A0A() : OH.A06);
        C1191dA c1191dA = new C1191dA(this);
        C7U c7u = new C7U(c0947Xy);
        boolean z = JR.A1U(c0947Xy) && C02455g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C02455g c02455g = new C02455g(c7u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C1190d9(this));
            C0583Jp funnelLoggingHandler = new C0583Jp(this.A03.A0U(), c0947Xy.A08());
            c7u.A0d(funnelLoggingHandler);
            c02455g.A0B();
            return;
        }
        C1200dJ c1200dJ = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C01511n.A02(c0947Xy, c1200dJ, true, c1191dA);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C01511n.A02(c0947Xy, c1200dJ, true, c1191dA);
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x00c9 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x0112 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09(com.facebook.ads.redexgen.X.C0947Xy r21, java.util.EnumSet<com.facebook.ads.CacheFlag> r22) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01411d.A09(com.facebook.ads.redexgen.X.Xy, java.util.EnumSet):void");
    }

    private void A0A(OH oh) {
        this.A01 = oh;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC0608Kq A0C() {
        if (this.A03.A0r()) {
            return EnumC0608Kq.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0608Kq.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC0608Kq enumC0608Kq = EnumC0608Kq.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0608Kq;
                }
            } else {
                if (A0I()) {
                    EnumC0608Kq enumC0608Kq2 = EnumC0608Kq.A0A;
                    String[] strArr3 = A06;
                    if (strArr3[6].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A06[3] = "JH";
                    return enumC0608Kq2;
                }
                EnumC0608Kq enumC0608Kq3 = EnumC0608Kq.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0608Kq3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0608Kq3;
            }
        }
        throw new RuntimeException();
    }

    public final OH A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AFH();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final void A0H(C0947Xy c0947Xy, EnumSet<CacheFlag> enumSet) {
        AdError adErrorA00 = A00(c0947Xy);
        if (adErrorA00 != null) {
            this.A04.A9u(adErrorA00);
            return;
        }
        this.A04.ADj();
        if (A0C() == EnumC0608Kq.A09) {
            A08(c0947Xy);
        } else {
            A09(c0947Xy, enumSet);
        }
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
