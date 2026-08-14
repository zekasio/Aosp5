package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class V1 implements InterfaceC0553Il<String> {
    public static byte[] A00;
    public static String[] A01 = {"u8G08HFxhQG7mlQK0N08J24LskAFk0Fz", "MT2vKhidsLEKISovOxHKhqO4VFEbCdVt", "JUZDuoVTBw7gjm", "iOPubIquN8qe", "0M6TS0Q", "HZwTTDt8MowEsM3lUInYTfNVGUxvh7Fx", "C1UIBnl28yc1uc0E2ccxntR095C7RYBw", "f1f0cNh4gPGC00wb8Jrm0MnwGgNgR"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-51, -39, -46, -47, Ascii.SO, -1, Ascii.DC2, Ascii.SO, -60, -75, -56, -60, 127, -58, -60, -60, -87, -98, -99};
    }

    static {
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0553Il
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A5G(String str) {
        String strA0M = C0567Iz.A0M(str);
        if (!TextUtils.isEmpty(strA0M)) {
            if (A01[7].length() == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "QIxKUOjxUFjuFXd3UTFt4bedwIhosxNy";
            strArr[0] = "KyBHe82bx80nGeQY27WRdJvWIWXouYTm";
            if ((!strA0M.contains(A00(4, 4, 113)) || strA0M.contains(A00(8, 8, 39))) && !strA0M.contains(A00(0, 4, 60)) && !strA0M.contains(A00(16, 3, 8))) {
                return true;
            }
        }
        return false;
    }
}
