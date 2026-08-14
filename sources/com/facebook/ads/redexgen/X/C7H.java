package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7H {
    public static byte[] A00;
    public static String[] A01 = {"eFrFuMkSf6MHcof7LOi6YZLllbM352nJ", "mAvGXXYFupd5OuM4XCWCl6Ymf1L0CYcu", "NOO30l6olRO1IZ4LfmYkunta1od", "bvzGMF7Q1FtgEXIkORXr7PxZ7BJPLsgM", "hXdYhHbEFyr1sbwxo", "3nkhTPKg5suoqFFED69qNRFImDpUoi1X", "AqSvMoRqc6BrPHC1U9YSDW7FElWr0vU0", "cACdptFygePFXCUb5rEKoIEmqMGQ4nRx"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
            if (A01[6].charAt(16) != 'U') {
                throw new RuntimeException();
            }
            A01[7] = "4KTBK77LN1KTDos5IeArWQYcubpfVnlF";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{75, 101, 102, 126, 111, 96, 122, 97, 115, 114, 115, Ascii.SUB, 61, 37, 50, 63, 58, 55, 115, Ascii.SUB, 5, 98, 69, 93, 74, 71, 66, 79, Ascii.VT, 98, 69, 91, 94, 95, 71, 96, 120, 111, 98, 103, 106, 46, 66, 107, 96, 105, 122, 102, 17, 42, 51, 51, 127, Ascii.GS, Ascii.ESC, 127, Ascii.FF, 58, 44, 44, 54, 48, 49, 127, Ascii.SYN, 59, 33, 58, 50, 34, 68, 33, Ascii.DLE, Ascii.NAK, Ascii.NAK, Ascii.CAN, Ascii.US, Ascii.SYN, 69, 101, 92, 90};
    }

    static {
        A03();
    }

    @SuppressLint({"CatchGeneralException", "BadMethodUse-java.lang.String.length"})
    public static String A01(String str, String str2) {
        try {
            String[] strArrSplit = str2.split(A00(78, 2, 73));
            if (strArrSplit != null && strArrSplit.length != 0) {
                String str3 = strArrSplit[strArrSplit.length - 1];
                if (str3.length() == 16) {
                    return A02(str, str3);
                }
                throw new InvalidParameterSpecException(A00(34, 14, 94));
            }
            throw new IllegalArgumentException(A00(48, 18, 15));
        } catch (Throwable th) {
            C6O.A03(th);
            String strA00 = A00(80, 2, 119);
            String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "q1rcyONSgbGNz9bqB8WSs99USD9RjoFj";
            strArr2[5] = "jIC3cCNXapYytCTk8CpXHStINYfHDphY";
            return strA00;
        }
    }

    @SuppressLint({"TrulyRandom", "BadMethodUse-java.lang.String.length"})
    public static String A02(String str, String str2) throws Throwable {
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            int length = str2.length();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 8, 89);
            sb.append(strA00);
            sb.append(File.separatorChar);
            sb.append(A00(8, 3, 96));
            sb.append(File.separatorChar);
            sb.append(A00(66, 12, 33));
            Cipher cipher = Cipher.getInstance(sb.toString());
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), strA00);
            byte[] ivBytes = A04(str2.substring(0, length / 2).getBytes(), str2.substring(length / 2, length).getBytes());
            cipher.init(1, secretKeySpec, new IvParameterSpec(ivBytes));
            byte[] ivBytes2 = str.getBytes();
            return Base64.encodeToString(cipher.doFinal(ivBytes2), 0);
        }
        throw new IllegalArgumentException(A00(21, 13, 123));
    }

    public static byte[] A04(byte[] result, byte[] bArr) throws NullPointerException {
        if (result != null && bArr != null && result.length == bArr.length) {
            byte[] bArr2 = new byte[result.length];
            for (int i = 0; i < result.length; i++) {
                bArr2[i] = (byte) (result[i] ^ bArr[i]);
            }
            return bArr2;
        }
        throw new NullPointerException(A00(11, 10, 3));
    }
}
