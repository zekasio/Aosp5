package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0841Tt extends L8 {
    public static byte[] A01;
    public static String[] A02 = {"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    public final /* synthetic */ Context A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, -123, -123, 98, 126, -125, 104, 121, ByteCompanionObject.MIN_VALUE, 107, 122, -121, -120, 126, -124, -125};
    }

    static {
        A02();
    }

    public C0841Tt(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        int iA02;
        if (C0625Li.A02 == EnumC0624Lh.A02) {
            return;
        }
        SharedPreferences sharedPreferencesA00 = C0610Kt.A00(this.A00);
        String strA00 = A00(0, 16, 10);
        int returnMinSdkVersion = sharedPreferencesA00.getInt(strA00, -1);
        if (returnMinSdkVersion != -1) {
            int unused = C0625Li.A00 = returnMinSdkVersion;
            C0625Li.A02 = EnumC0624Lh.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            iA02 = C0625Li.A03(this.A00);
        } else {
            iA02 = C0625Li.A02(this.A00);
        }
        int unused2 = C0625Li.A00 = iA02;
        if (A02[7].charAt(31) == 71) {
            throw new RuntimeException();
        }
        A02[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        sharedPreferencesA00.edit().putInt(strA00, iA02).commit();
        C0625Li.A02 = EnumC0624Lh.A02;
    }
}
