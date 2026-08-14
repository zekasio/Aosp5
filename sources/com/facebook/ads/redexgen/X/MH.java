package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MH {
    public static byte[] A00;
    public static String[] A01 = {"jOafuIGjbmGqGJCoIRCXQtou", "4aVS6XGMEh0UEp1LrL0", "WT7BdI1qWTWyKDUxoAWdDMpw07Ptfw8", "q0ourOn8MOENNWhqaGRKGcv5B4gp2pTE", "Hqz5MCTyQHD2ORxnmIkx6S6it7H3yU", "Fz45vwCH8U7UwOfOH", "", "zqPhk"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-47, -34, -44, -30, -33, -39, -44, -98, -32, -43, -30, -35, -39, -29, -29, -39, -33, -34, -98, -79, -77, -77, -75, -61, -61, -49, -66, -75, -60, -57, -65, -62, -69, -49, -61, -60, -79, -60, -75, 41, 53, 52, 52, 43, 41, 58, 47, 60, 47, 58, 63};
    }

    static {
        A02();
    }

    public static MG A00(Context context) {
        if (context.checkCallingOrSelfPermission(A01(0, 39, 22)) != 0) {
            return MG.A08;
        }
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService(A01(39, 12, 108))).getActiveNetworkInfo();
        if (networkInfo == null || !networkInfo.isConnected()) {
            return MG.A07;
        }
        if (networkInfo.getType() == 0) {
            switch (networkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return MG.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    MG mg = MG.A04;
                    String[] strArr = A01;
                    if (strArr[7].length() == strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[5] = "oOnk32K9Wq3P4PSiK";
                    strArr2[2] = "1DJY3gVRyF4DGenl9OyLPgUFJXOtxby";
                    return mg;
                case 13:
                    return MG.A05;
                default:
                    return MG.A08;
            }
        }
        return MG.A06;
    }
}
