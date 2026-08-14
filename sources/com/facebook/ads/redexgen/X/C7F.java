package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"StringFormatUse", "SharedPreferencesUse"})
public final class C7F {
    public static C7F A01;
    public static byte[] A02;
    public static String[] A03 = {"rLDjBgKz63Bn2bjdq5T9imrieVp5PIBM", "m8wp0Vw9GL6Om21Qq8m8Tj5zfu0l", "YgqNWwRBt3ccTC8L8vt9EnrOaTNX", "Ji4mlDElrKKLO0fU8k8hI0n9H2FXwyxW", "wf5MYK5ehGzLy7SkBsWbSYGwiXhb8bxZ", "VWIuBm7xkqaJ1AqGCIKfvhlqUEnKMMIs", "Q1uyQO5SpdafJkDIvdpZDIFmVDRWB0Ou", "30w5jfTvH5e90EUSXrOKs1RMT2PDXB24"};
    public final HashMap<Integer, String> A00 = new HashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{103, 114, 116, -70};
    }

    static {
        A03();
    }

    @SuppressLint({"CatchGeneralException"})
    public C7F(Context context, EnumC02896z enumC02896z, @Nullable String str) {
        try {
            A04(context);
            if (enumC02896z.A04() == EnumC02896z.A0G.A04()) {
                A05(context, str);
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    public static C7F A00(Context context, EnumC02896z enumC02896z, @Nullable String str) {
        if (A01 == null) {
            A01 = new C7F(context, enumC02896z, str);
        }
        return A01;
    }

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(A01(0, 4, 62), Byte.valueOf(b)));
        }
        String string = sb.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(8) == strArr[6].charAt(8)) {
            throw new RuntimeException();
        }
        A03[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
        return string;
    }

    private void A04(Context context) throws Exception {
        int i;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            MessageDigest messageDigest = MessageDigest.getInstance(C7I.A04.A02());
            MessageDigest messageDigest2 = MessageDigest.getInstance(C7I.A05.A02());
            MessageDigest messageDigest3 = MessageDigest.getInstance(C7I.A06.A02());
            byte[] bArr = new byte[1024];
            do {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                    messageDigest2.update(bArr, 0, i);
                    messageDigest3.update(bArr, 0, i);
                }
                if (A03[7].charAt(26) != 'P') {
                    throw new RuntimeException();
                }
                A03[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
            } while (i != -1);
            this.A00.put(Integer.valueOf(GamesActivityResultCodes.RESULT_LICENSE_FAILED), A02(messageDigest.digest()));
            this.A00.put(Integer.valueOf(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED), A02(messageDigest2.digest()));
            this.A00.put(10005, A02(messageDigest3.digest()));
            bufferedInputStream.close();
        } catch (Throwable th) {
            String[] strArr = A03;
            if (strArr[4].charAt(30) != strArr[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "XS9zpWe4kggJPLQjl3jzxSvjjqaK1CvG";
            strArr2[6] = "1gkHVsehFegipbXpJD0YhFUDmEZYz3Bw";
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private void A05(Context context, @Nullable String str) throws Throwable {
        int i;
        if (str == null || str.isEmpty()) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7I.A04.A02());
            byte[] bArr = new byte[1024];
            do {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                }
            } while (i != -1);
            this.A00.put(10010, A02(messageDigest.digest()));
            bufferedInputStream.close();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Nullable
    public final String A06(int i) {
        String str = this.A00.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        return null;
    }
}
