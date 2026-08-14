package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class SF {
    public static byte[] A02;
    public static String[] A03 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};

    @VisibleForTesting
    public BlockingDeque<SG> A00 = new LinkedBlockingDeque();

    @Nullable
    public final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, 127, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, Ascii.SYN, 55, 62, 38, 51, 45, 123, 42, Ascii.CR, 57, 40, 37, 35, 57, 49, Ascii.FS, 6, 38, Ascii.SUB, 0, Ascii.ESC, 17, 58, Ascii.ESC, 10, Ascii.EM, Ascii.SO, Ascii.SI, Ascii.NAK, 19, Ascii.DC2, 109, 52, 115, 100, 100, 52, 44, 52, 69, 95, 76, 83, 73, 83, 78, 85, 83, 83, 82, 73, 91, 87, 78, 73, 85, 87, 70, 52, 107};
    }

    static {
        A07();
    }

    public SF(@Nullable String str) {
        this.A01 = str;
    }

    public static long A00(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* JADX WARN: Incorrect condition in loop: B:26:0x00d9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A01(java.util.List<com.facebook.ads.redexgen.X.SG> r9) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SF.A01(java.util.List):long");
    }

    @SuppressLint({"BadMethodUse-java.lang.String.charAt"})
    public static String A03(String base64chars) {
        String strA02 = A02(0, 64, 117);
        StringBuilder sb = new StringBuilder(base64chars);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A03;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A03[2] = "LfiGB0y4";
                sb3.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        for (int n4 = 0; n4 < sb.length(); n4 += 3) {
            int iCharAt = (sb.charAt(n4) << 16) + (sb.charAt(n4 + 1) << '\b') + sb.charAt(n4 + 2);
            int n3 = (iCharAt >> 18) & 63;
            sb2.append(strA02.charAt(n3));
            sb2.append(strA02.charAt((iCharAt >> 12) & 63));
            sb2.append(strA02.charAt((iCharAt >> 6) & 63));
            sb2.append(strA02.charAt(iCharAt & 63));
        }
        return sb2.substring(0, sb2.length() - sb3.length()) + ((Object) sb3);
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0065 */
    @javax.annotation.Nullable
    @android.annotation.SuppressLint({"BadMethodUse-java.lang.String.length"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A04(@javax.annotation.Nullable java.util.List<com.facebook.ads.redexgen.X.SG> r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SF.A04(java.util.List):java.lang.String");
    }

    public static String A05(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A08(sb, A00(it.next().longValue()));
        }
        return A03(sb.toString());
    }

    public static String A06(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08(StringBuilder sb, long j) {
        while (j >= 128) {
            char c = (char) ((((long) (128 - 1)) & j) | ((long) 128));
            j >>= 7;
            sb.append(c);
        }
        char c2 = (char) j;
        String[] strArr = A03;
        if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "TgLp8xzira9J3G7G7T0jqPUigov5tglm";
        strArr2[0] = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6";
        sb.append(c2);
    }

    public static void A09(List<SG> list) {
        long jA00;
        for (int size = list.size() - 1; size > 0; size--) {
            list.get(size).A08(list.get(size).A03() - list.get(size - 1).A03());
            list.get(size).A06(list.get(size).A01() - list.get(size - 1).A01());
            list.get(size).A07(list.get(size).A02() - list.get(size - 1).A02());
            SG sg = list.get(size);
            if (list.get(size - 1).A00() == -1) {
                jA00 = 0;
            } else {
                jA00 = list.get(size).A00() - list.get(size - 1).A00();
            }
            sg.A05(jA00);
            list.get(size).A07(list.get(size).A02() - list.get(size).A01());
        }
    }

    public final List<SG> A0A() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0B(SG sg) {
        SG sgPeekLast = this.A00.peekLast();
        if (sgPeekLast != null) {
            long jA03 = sgPeekLast.A03();
            if (A03[7].length() == 7) {
                throw new RuntimeException();
            }
            A03[1] = "fQhMIvl";
            if (jA03 == sg.A03() && sgPeekLast.A01() == sg.A01()) {
                return;
            }
        }
        this.A00.add(sg);
    }
}
