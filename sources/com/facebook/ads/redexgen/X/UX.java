package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UX implements InterfaceC0575Jh {

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC0575Jh A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C0946Xx A00;
    public final InterfaceC03369g A01;
    public final InterfaceC0574Jg A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, Ascii.US};
    }

    static {
        A03();
        A05 = UX.class.getSimpleName();
        A06 = false;
    }

    public UX(C0946Xx c0946Xx) {
        InterfaceC0573Jf interfaceC0573JfA00;
        this.A00 = c0946Xx;
        if (JT.A0T(c0946Xx)) {
            this.A01 = C03349e.A00(c0946Xx);
            interfaceC0573JfA00 = C0580Jm.A01(c0946Xx, this.A01);
        } else {
            E5 e5A01 = C03349e.A01(c0946Xx);
            interfaceC0573JfA00 = C0580Jm.A00(c0946Xx, e5A01);
            this.A01 = e5A01;
        }
        this.A02 = new C0848Ua(c0946Xx, interfaceC0573JfA00);
        MX.A08.execute(new UZ(this));
        A04(c0946Xx);
    }

    public static synchronized InterfaceC0575Jh A01(C0946Xx c0946Xx) {
        if (A03 == null) {
            A03 = new UX(c0946Xx);
        }
        return A03;
    }

    public static synchronized void A04(C0946Xx c0946Xx) {
        if (A06) {
            return;
        }
        c0946Xx.A02().A9t();
        A06 = true;
    }

    private void A05(C0572Je c0572Je) {
        if (!c0572Je.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c0572Je.A06() + A02(0, 7, 55));
            return;
        }
        A06(c0572Je);
        this.A01.AFi(c0572Je, new UY(this, c0572Je));
    }

    @SuppressLint({"ThrowException"})
    private void A06(C0572Je c0572Je) {
        switch (C0576Ji.A00[c0572Je.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(new Exception(A02(36, 5, 50)));
                anonymousClass90.A03(1);
                try {
                    anonymousClass90.A05(new JSONObject().put(A02(48, 4, 107), c0572Je.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A06().A8z(A02(41, 7, 50), C03298z.A1H, anonymousClass90);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A8q(String str, Map<String, String> map) {
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A8t(String str, Map<String, String> map) {
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A8u(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A07).A06(C0585Jr.A0A(str, EnumC0582Jo.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A8v(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A08).A06(C0585Jr.A0A(str, EnumC0582Jo.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A8x(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A91(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A93(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0D).A06(C0585Jr.A0A(str, EnumC0582Jo.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A94(String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A95(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0F).A06(C0585Jr.A0A(str, EnumC0582Jo.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A96(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0K).A06(C0585Jr.A0A(str, EnumC0582Jo.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A97(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0H).A06(C0585Jr.A0A(str, EnumC0582Jo.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A99(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0J).A06(C0585Jr.A0A(str, EnumC0582Jo.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9B(String str, Map<String, String> map, String str2, EnumC0577Jj enumC0577Jj) {
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(enumC0577Jj).A02(EnumC0578Jk.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9C(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0L).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9G(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0N).A06(C0585Jr.A0A(str, EnumC0582Jo.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9H(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0O).A06(C0585Jr.A0A(str, EnumC0582Jo.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0P).A06(C0585Jr.A0A(str, EnumC0582Jo.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0Q).A06(C0585Jr.A0A(str, EnumC0582Jo.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0U).A06(C0585Jr.A0A(str, EnumC0582Jo.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9O(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A04).A02(EnumC0578Jk.A0T).A06(C0585Jr.A0A(str, EnumC0582Jo.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9P(String str, Map<String, String> map) {
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void A9R(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0571Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0577Jj.A05).A02(EnumC0578Jk.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0575Jh
    public final void ADD(String str) {
        new RM(this.A00).execute(str);
    }
}
