package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ON {
    public static byte[] A09;
    public static String[] A0A = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};

    @Nullable
    public OM A00;
    public boolean A01;
    public boolean A02;
    public final C0947Xy A03;
    public final InterfaceC0575Jh A04;
    public final MK A05;
    public final InterfaceC0657Mq A06;

    @Nullable
    public final C0767Qw A07;
    public final String A08;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{Ascii.US, 8, Ascii.GS, Ascii.RS, 41, 40, 40, 51, 50, Ascii.US, 48, 53, 63, 55, Ascii.DLE, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, Ascii.ETB, 82, 79, 82, 84, 66, 67, 94, 89, 80, Ascii.ETB, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A02();
    }

    public ON(C0947Xy c0947Xy, String str, @Nullable C0767Qw c0767Qw, MK mk, InterfaceC0575Jh interfaceC0575Jh) {
        this.A01 = true;
        this.A03 = c0947Xy;
        this.A08 = str;
        this.A07 = c0767Qw;
        this.A05 = mk;
        this.A04 = interfaceC0575Jh;
        this.A06 = new T2(this);
    }

    public ON(C0947Xy c0947Xy, String str, @Nullable C0767Qw c0767Qw, MK mk, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq) {
        this.A01 = true;
        this.A03 = c0947Xy;
        this.A08 = str;
        this.A07 = c0767Qw;
        this.A05 = mk;
        this.A04 = interfaceC0575Jh;
        this.A06 = interfaceC0657Mq;
    }

    public static void A03(C0947Xy c0947Xy, @Nullable C0767Qw c0767Qw, MK mk, InterfaceC0575Jh interfaceC0575Jh, C1L c1l, String str) {
        AbstractC01180f abstractC01180fA01 = C01190g.A01(c0947Xy, interfaceC0575Jh, str, C0617La.A00(c1l.A05()), new OG().A03(c0767Qw).A02(mk).A05(), false, false);
        if (abstractC01180fA01 != null) {
            abstractC01180fA01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A9O(str, map);
        Lq.A00(new OK(this, map, str, str2), new OL(this, str, map), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 52);
        try {
            AbstractC01180f abstractC01180fA01 = C01190g.A01(this.A03, this.A04, str, C0617La.A00(str2), new OG(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (abstractC01180fA01 != null) {
                abstractC01180fA01.A0C();
            }
            if (this.A00 != null) {
                this.A00.AAR();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(strA01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            String[] strArr = A0A;
            if (strArr[0].length() != strArr[6].length()) {
                A0A[5] = "";
                Log.e(strA01, A01(22, 22, 95), e2);
                return;
            }
            throw new RuntimeException();
        }
    }

    public final void A07(OM om) {
        this.A00 = om;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new C0583Jp(str, this.A04).A02(EnumC0582Jo.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A8u(str, map);
        } else if (JR.A14(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
