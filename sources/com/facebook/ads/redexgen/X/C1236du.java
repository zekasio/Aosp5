package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1236du implements C0R {
    public static byte[] A07;
    public static String[] A08 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C1234ds A00;
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC01150c> A06 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{5, Ascii.SYN, Ascii.CR, Ascii.CR, 6, Ascii.SI, 60, 109, 126, 101, 101, 110, 103, 84, 120, 110, 122};
        String[] strArr = A08;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A08[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    static {
        A01();
    }

    public C1236du(C1234ds c1234ds) {
        this.A00 = c1234ds;
    }

    private void A02(int i, String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + C0X.A0N.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9D(i, jSONObject);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    private final void A03(JSONObject jSONObject) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A02.getAndIncrement());
            } catch (JSONException unused) {
            }
            C0X.A0E.A04(this.A01).A02(jSONObject);
            String str = this.A05.get();
            if (!TextUtils.isEmpty(str)) {
                C0X.A0Q.A04(str).A02(jSONObject);
            }
            String str2 = this.A04.get();
            if (!TextUtils.isEmpty(str2)) {
                C0X.A0P.A04(str2).A02(jSONObject);
            }
            String str3 = this.A03.get();
            if (!TextUtils.isEmpty(str3)) {
                C0X.A0O.A04(str3).A02(jSONObject);
            }
            EnumC01150c enumC01150c = this.A06.get();
            if (enumC01150c != null) {
                C0X.A0D.A04(enumC01150c).A02(jSONObject);
            }
        } catch (Throwable th) {
            String placementType = A08[2];
            if (placementType.length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "UnqhnC2RP1s6q9DMOMPvS7zFM4J";
            strArr[3] = "fX0qBiaLsOBwY7ffp1ojH1RHxSy";
            L0.A00(th, this);
        }
    }

    public final void A04(C0T c0t, C0W... c0wArr) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0W c0w : c0wArr) {
                c0w.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A90(c0t, jSONObject);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Q(String str, int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0R, C0X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2R(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0S, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2S(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0T, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2T(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0U, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2U(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0V, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2V(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0W, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2W(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0X, C0X.A0K.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2X() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0i, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Y() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0v, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2Z(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0Z, C0X.A01.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2a(long j, int i, String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0x, C0X.A0F.A04(Integer.valueOf(i)), C0X.A0L.A04(str), C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2b() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0z, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2c() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0y, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2d() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A10, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2e(long j) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A11, C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2f(C0Q c0q) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A25, C0X.A00.A04(c0q));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2g(String str, String str2) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A04.set(str);
            this.A03.set(str2);
            A04(C0T.A0a, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2h() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0b, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2i() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0c, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2j(long j, int i, @Nullable String str, boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0d, C0X.A0J.A04(Long.valueOf(j)), C0X.A0F.A04(Integer.valueOf(i)), C0X.A0L.A04(str), C0X.A09.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2k(long j) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0e, C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2l(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A18, C0X.A0C.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2m() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A19, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2n(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1D, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2o() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1E, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2p() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1F, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2q() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1G, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2r(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1H, C0X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2s() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1I, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2t() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1L, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2u() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1J, new C0W[0]);
        } catch (Throwable th) {
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A08[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2v(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1K, C0X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2w() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1M, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2x(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1N, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2y() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1O, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A2z() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1P, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A30() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Q, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A31() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1R, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A32(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1S, C0X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A33() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1T, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A34(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1U, C0X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A35() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A27, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A36() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A28, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A37(C0Q c0q) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A24, C0X.A00.A04(c0q));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A38(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A26, C0X.A0H.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A39() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A29, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3v(long j) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0g, C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A3w(long j) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0h, C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A41() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0j, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4W() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0k, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4X() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0o, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4Y(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0f, C0X.A08.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4Z(int i, String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0p, C0X.A0F.A04(Integer.valueOf(i)), C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4a(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0n, C0X.A03.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4b() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0r, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4c() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0s, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4d() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0t, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4e() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A0u, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4u() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Y, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4v(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1Z, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4w() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1a, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4x() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1b, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4y() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1c, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A4z(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1d, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A50(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1e, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A51(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1f, C0X.A0N.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A52(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1h, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A53() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1i, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A54(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1j, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A55(long j) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1k, C0X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A56(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1l, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A88() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1m, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A89(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1n, C0X.A07.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8A() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1o, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8B(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1p, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8C() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1q, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8D() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1r, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8E(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1s, C0X.A0M.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A8w(int i, String str) throws Throwable {
        if (L0.A02(this) || i < 11000 || i > 11099) {
            return;
        }
        try {
            A02(i, str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9c(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A12, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9d(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A13, C0X.A0H.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9e() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1v, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9f() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1w, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9g() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1x, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void A9i() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A14, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A08[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void ADk(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A16, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void ADl() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A17, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AEh(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A05.set(str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AEj(EnumC01150c enumC01150c) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A06.set(enumC01150c);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFN() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1B, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFO() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1V, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFS() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2A, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFT(int i, String str) throws Throwable {
        if (L0.A02(this) || i < 12000 || i > 12099) {
            return;
        }
        try {
            A02(i, str);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFU() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2B, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFV() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2C, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFW() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2D, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFX(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2E, C0X.A02.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFY() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2F, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFZ() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2G, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFa(int i, @Nullable String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2H, C0X.A0F.A04(Integer.valueOf(i)), C0X.A0L.A04(str));
        } catch (Throwable th) {
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFb(boolean z) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2I, C0X.A06.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFc() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2J, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFd(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2K, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFe(int i, String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2L, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFf() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2M, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFg(int i) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A2N, C0X.A0I.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFl(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1W, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void AFm(String str) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1X, C0X.A0L.A04(str));
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final String getId() throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0R
    public final void unregisterView() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A04(C0T.A1A, new C0W[0]);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
