package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XW implements C8W {
    public static XW A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};

    @Nullable
    public C0U A00;

    @Nullable
    public C8V A01;

    @Nullable
    public InterfaceC03178l A02;

    @Nullable
    public C9P A03;

    @Nullable
    public InterfaceC0587Jt A04;

    @Nullable
    public GU A05;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A08;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr3 = A08;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A08;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A07 = new byte[]{-57, -64, -10, -56, -56, -64, -59, -63, -16, 2, Ascii.DLE, Ascii.DLE, 6, Ascii.FF, Ascii.VT, -67, 1, -2, 17, -2, -67, 6, Ascii.VT, 6, 17, 6, -2, 9, 6, Ascii.ETB, 2, 1, 33, Ascii.DC4, Ascii.US, Ascii.RS, 33, 35, 2, Ascii.DC4, 34, 34, Ascii.CAN, Ascii.RS, Ascii.GS, -13, Ascii.DLE, 35, Ascii.DLE, -8, Ascii.GS, Ascii.CAN, 35, Ascii.CAN, Ascii.DLE, Ascii.ESC, Ascii.CAN, 41, Ascii.DC4, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC02495k A00(C0946Xx c0946Xx, @Nullable GU gu) {
        if (!JR.A1B(c0946Xx) || gu == null) {
            return null;
        }
        return AbstractC02505l.A00().A01(gu);
    }

    public static InterfaceC03178l A01(C0946Xx c0946Xx) {
        return C8m.A00().A01(c0946Xx, new C0926Xd());
    }

    public static synchronized XW A02() {
        if (A06 == null) {
            A06 = new XW();
        }
        return A06;
    }

    @Nullable
    public static R2 A03(C0946Xx c0946Xx) {
        if (!JR.A17(c0946Xx)) {
            return null;
        }
        return RK.A01(c0946Xx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized GU A7d() {
        return this.A05;
    }

    @Nullable
    public static GU A05(C0946Xx c0946Xx, InterfaceC03178l interfaceC03178l, @Nullable R2 r2) {
        if (!JR.A1u(c0946Xx) || r2 == null) {
            return null;
        }
        return AbstractC0778Rh.A00().A01(c0946Xx, interfaceC03178l, r2, C0606Ko.A04(c0946Xx), new XX(new C0600Kh(c0946Xx, A06(0, 0, 122), null, KM.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c0946Xx), AdSettings.isMixedAudience(), new KR(), MA.A01(JR.A0H(c0946Xx)), null, null), c0946Xx), C0776Rf.A00().A00());
    }

    public static void A08() {
        String strA06 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        KV.A05(strA06, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C0946Xx c0946Xx, @Nullable InterfaceC02495k interfaceC02495k) {
        if (!JR.A1B(c0946Xx) || interfaceC02495k == null) {
            return;
        }
        AbstractC02475i.A00().A01(interfaceC02495k, c0946Xx);
    }

    public static void A0A(C0946Xx c0946Xx, @Nullable GU gu) {
        if (!JR.A0h(c0946Xx) || gu == null) {
            return;
        }
        new AnonymousClass65(c0946Xx, gu, new AnonymousClass66(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C0946Xx c0946Xx, @Nullable GU gu) {
        if (gu == null) {
            return;
        }
        JU.A00(c0946Xx, gu);
    }

    public final synchronized void A0C(C0946Xx c0946Xx) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c0946Xx);
        this.A05 = A05(c0946Xx, this.A02, A03(c0946Xx));
        A09(c0946Xx, A00(c0946Xx, this.A05));
        A0A(c0946Xx, this.A05);
        A0B(c0946Xx, this.A05);
        if (this.A05 != null) {
            this.A05.A5U();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final InterfaceC0575Jh A5c(C0946Xx c0946Xx) {
        return UX.A01(c0946Xx);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8V A5q(C8U c8u) {
        if (this.A01 == null) {
            this.A01 = new XY(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC03178l A6L(C8U c8u) {
        if (this.A02 == null) {
            this.A02 = A01(c8u.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC03288y A6M(C8U c8u) {
        return new C0935Xm(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8X A6V(C8U c8u) {
        return new EL(this, c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    public final synchronized C0U A6i(C8U c8u) {
        if (!JR.A0s(c8u)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0V.A00().A01(new C0924Xb(c8u));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8Z A7L(C8U c8u) {
        return new XZ(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final C0946Xx A7M(Context context) {
        C0946Xx c0946XxA00 = C8T.A00();
        if (c0946XxA00 == null) {
            C0946Xx c0946Xx = new C0946Xx(context, this);
            C8T.A01(c0946Xx);
            return c0946Xx;
        }
        return c0946XxA00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC0587Jt A7N(C0946Xx c0946Xx) {
        if (this.A04 == null) {
            this.A04 = new C0852Ue(c0946Xx);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C9P A7T() {
        if (this.A03 == null) {
            this.A03 = new C9P();
            A08();
        }
        return this.A03;
    }
}
