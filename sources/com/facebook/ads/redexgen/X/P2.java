package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P2 extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};

    @Nullable
    public Q6 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass18 A05;
    public final C7U A06;
    public final C0947Xy A07;
    public final C0583Jp A08;
    public final InterfaceC0657Mq A09;
    public final NI A0A;
    public final P1 A0B;
    public final C0742Px A0C;
    public final QK A0D;
    public final AnonymousClass89 A0E;
    public final N6 A0F;
    public final N4 A0G;
    public final AbstractC0640Lz A0H;
    public final AbstractC0626Lj A0I;
    public final L4 A0J;
    public final L3 A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, Ascii.DC4, Ascii.DC4, 3, 8, Ascii.DC2, 50, Ascii.SI, Ascii.VT, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public P2(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, AnonymousClass18 anonymousClass18, C7U c7u, C0583Jp c0583Jp, InterfaceC0657Mq interfaceC0657Mq, NI ni, P1 p1) {
        super(c0947Xy);
        this.A0J = new L4() { // from class: com.facebook.ads.redexgen.X.9z
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 5);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{Ascii.DLE, Ascii.DC2, 5, Ascii.DLE, 1, Ascii.DC2, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(LG lg) {
                this.A00.A03 = true;
                this.A00.A0B.ACj(A00(0, 8, 101), this.A00.A03());
            }
        };
        this.A0I = new AbstractC0626Lj() { // from class: com.facebook.ads.redexgen.X.9s
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C0639Ly c0639Ly) {
                this.A00.A04 = true;
                this.A00.A0B.ACj(A00(0, 4, 62), this.A00.A03());
            }
        };
        this.A0H = new AbstractC0640Lz() { // from class: com.facebook.ads.redexgen.X.9n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{Ascii.FS, Ascii.CR, Ascii.EM, Ascii.US, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass85 anonymousClass85) {
                this.A00.A0B.ACj(A00(0, 5, 49), this.A00.A03());
            }
        };
        this.A0K = new L3() { // from class: com.facebook.ads.redexgen.X.9Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass84 anonymousClass84) {
                this.A00.A0H(anonymousClass84);
                this.A00.A0A();
            }
        };
        this.A0F = new N6() { // from class: com.facebook.ads.redexgen.X.9G
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{Ascii.DC4, 32, Ascii.RS, 33, Ascii.GS, Ascii.SYN, 37, Ascii.SYN, Ascii.NAK};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass88 anonymousClass88) {
                this.A00.A07();
                P1 p12 = this.A00.A0B;
                P2 p2 = this.A00;
                p12.ACj(A00(0, 9, 100), p2.A04(p2.A0D.getDuration()));
            }
        };
        this.A0G = new C9E(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c0947Xy;
        this.A05 = anonymousClass18;
        this.A06 = c7u;
        this.A08 = c0583Jp;
        this.A09 = interfaceC0657Mq;
        this.A0A = ni;
        this.A0D = new QK(c0947Xy);
        this.A0B = p1;
        this.A0D.setFunnelLoggingHandler(c0583Jp);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new AnonymousClass89(c0947Xy, interfaceC0575Jh, this.A0D, anonymousClass18.A0U());
        if (JR.A1J(this.A07)) {
            this.A0C = new C0742Px(c0947Xy, interfaceC0575Jh, this.A0D, anonymousClass18.A0U(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A0O().A0D().A08()));
        A09();
        MS.A0M(this, this.A05.A0N().A01().A07(true));
        String strA07 = anonymousClass18.A0O().A0D().A07();
        if (!TextUtils.isEmpty(strA07)) {
            C0696Od.A00(c0947Xy, this, strA07);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C0797Sa(this), JR.A0I(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new SZ(this), JR.A0J(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ACj(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0O().A0D().A07())) {
            C02987m c02987m = new C02987m(this.A07);
            this.A0D.A0c(c02987m);
            c02987m.setImage(this.A05.A0O().A0D().A07());
        }
        C02796p c02796p = new C02796p(this.A07, true, this.A08);
        this.A0D.A0c(c02796p);
        this.A0D.A0c(new KT(c02796p, QJ.A03, true));
        this.A0D.A0c(new C02927c(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(AnonymousClass84 anonymousClass84) {
        if (this.A0D.getState() == EnumC0764Qt.A02 && JR.A11(this.A07)) {
            this.A0D.postDelayed(new SY(this, anonymousClass84), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0D().A2n(str);
        if (JR.A12(this.A07)) {
            A07();
            return;
        }
        InterfaceC0657Mq interfaceC0657Mq = this.A09;
        NI ni = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC0657Mq.A3s(ni.A6Z());
        this.A09.A3s(this.A0A.A6U());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(Q6.A02, 26);
        A08();
    }

    public final void A0O() {
        QK qk = this.A0D;
        if (qk != null) {
            if (!this.A02) {
                qk.A0a(Q1.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C0742Px c0742Px = this.A0C;
        if (c0742Px != null) {
            c0742Px.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        MS.A0T(this);
        MS.A0H(this.A0D);
        MS.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(Q1.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == EnumC0764Qt.A06 || this.A00 == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(Q6.A04, 25);
    }
}
