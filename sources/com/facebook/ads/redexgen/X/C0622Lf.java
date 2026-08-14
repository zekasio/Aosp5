package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0622Lf {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<KK, KM> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, Ascii.EM, 74, Ascii.RS, 93, 76, 91, 95, 74, 91, Ascii.RS, 127, 90, 109, 87, 68, 91, Ascii.RS, 75, 77, 87, 80, 89, Ascii.RS, 74, 86, 87, 77, Ascii.RS, 73, 87, 90, 74, 86, Ascii.RS, 95, 80, 90, Ascii.RS, 86, 91, 87, 89, 86, 74, Ascii.DLE, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(KK.A08, KM.A0C);
        A02.put(KK.A06, KM.A0E);
        A02.put(KK.A05, KM.A0D);
    }

    public static AdSize A00(KK kk) {
        return AdSize.fromWidthAndHeight(kk.A03(), kk.A02());
    }

    public static AdSize A01(KM km) {
        for (Map.Entry<KK, KM> entry : A02.entrySet()) {
            if (entry.getValue() == km) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static KK A02(int i) {
        if (i == 4) {
            return KK.A04;
        }
        if (i == 5) {
            return KK.A05;
        }
        if (i == 6) {
            return KK.A06;
        }
        if (i == 7) {
            return KK.A08;
        }
        if (i == 100) {
            return KK.A07;
        }
        throw new IllegalArgumentException(A06(48, 20, 63));
    }

    public static KK A03(int i, int i2) {
        if (KK.A07.A02() == i2 && KK.A07.A03() == i) {
            KK kk = KK.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return kk;
        }
        if (KK.A04.A02() == i2 && KK.A04.A03() == i) {
            return KK.A04;
        }
        if (KK.A05.A02() == i2 && KK.A05.A03() == i) {
            KK kk2 = KK.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return kk2;
        }
        if (KK.A06.A02() == i2 && KK.A06.A03() == i) {
            return KK.A06;
        }
        if (KK.A08.A02() == i2 && KK.A08.A03() == i) {
            return KK.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static KK A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static KM A05(KK kk) {
        KM km = A02.get(kk);
        if (km == null) {
            KM adTemplate = KM.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return adTemplate;
        }
        return km;
    }
}
