package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0938Xp extends L8 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8U A01;
    public final /* synthetic */ InterfaceC03228s A02;
    public final /* synthetic */ AnonymousClass90 A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, Ascii.RS, Ascii.ESC, 46, 32, -39, Ascii.FS, 43, Ascii.SUB, 44, 33, -39, Ascii.ESC, Ascii.RS, Ascii.FS, Ascii.SUB, 46, 44, Ascii.RS, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, Ascii.RS, 39, 45, -3, Ascii.SUB, 45, Ascii.SUB, 9, 43, 40, 47, 34, Ascii.GS, Ascii.RS, 43, -39, 39, 40, 45, -39, 34, 39, 35, Ascii.RS, Ascii.FS, 45, Ascii.RS, Ascii.GS, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, Ascii.RS, 33, 33, 38, 49, 38, 44, 43, Ascii.RS, 41, Ascii.FS, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, Ascii.ESC, 45, 50, 41, Ascii.RS, 49, 51, 32, 50, 55, 46, 35, Ascii.GS, 33, 45, 34, 35};
    }

    public C0938Xp(C8U c8u, String str, int i, AnonymousClass90 anonymousClass90, InterfaceC03228s interfaceC03228s) {
        this.A01 = c8u;
        this.A04 = str;
        this.A00 = i;
        this.A03 = anonymousClass90;
        this.A02 = interfaceC03228s;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        String stackTrace;
        Map<String, String> mapA4T;
        String strA6q;
        try {
            if (C03238t.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C0586Js.A08(this.A01, EnumC0578Jk.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = MA.A03(this.A01, cause);
            } else if (JT.A0R(this.A01)) {
                stackTrace = MA.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (JT.A0V(this.A01)) {
                mapA4T = this.A01.A02().A4T();
            } else if (this.A02 != null) {
                mapA4T = this.A02.A6X();
            } else if (C03238t.A02) {
                String message = A00(1, 57, 65);
                C03238t.A0F(new RuntimeException(message, this.A03));
                mapA4T = new HashMap<>();
            } else {
                mapA4T = this.A01.A02().A4T();
            }
            mapA4T.put(A00(136, 7, 65), this.A04);
            mapA4T.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject jSONObjectA02 = this.A03.A02();
            if (jSONObjectA02 != null) {
                mapA4T.put(A00(71, 15, 69), jSONObjectA02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 15, 126).equals(this.A04)) && (strA6q = this.A01.A02().A6q()) != null) {
                mapA4T.put(A00(86, 20, 84), strA6q);
            }
            String strA0A = this.A01.A0A();
            if (strA0A != null && !TextUtils.isEmpty(strA0A)) {
                mapA4T.put(A00(126, 10, 4), strA0A);
            }
            C8r c8r = (C8r) C03238t.A0A.get();
            if (c8r == null) {
                C03238t.A0F(new RuntimeException(A00(58, 13, 7)));
            } else {
                c8r.AFh(stackTrace, mapA4T, this.A01);
            }
        } catch (Throwable th) {
            C03238t.A0F(th);
        }
    }
}
