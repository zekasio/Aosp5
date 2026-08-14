package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MA {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, Ascii.DLE, 5, 45, 2, 90, 42, Ascii.DLE, 92, Ascii.VT, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, Ascii.ESC, 72, 79, 90, 88, 80, Ascii.ESC, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = i;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, JR.A0G(context), JR.A01(context), JR.A13(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String strA02 = A02(0, 0, 122);
        if (th == null) {
            return strA02;
        }
        try {
            C0838Tq c0838Tq = new C0838Tq();
            M8 c0837Tp = c0838Tq;
            if (i2 >= 0) {
                c0837Tp = new C0836To(c0837Tp, i2);
            }
            if (i >= 0) {
                c0837Tp = new C0835Tn(c0837Tp, i, i);
            }
            if (z) {
                c0837Tp = new C0837Tp(c0837Tp);
            }
            C0839Tr c0839Tr = new C0839Tr(c0838Tq, 1, c0837Tp);
            th.printStackTrace(new PrintWriter(new M9(c0839Tr)));
            c0839Tr.flush();
            return c0838Tq.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(M7 m7) {
        String strA02 = m7.A02();
        if (strA02 == null) {
            return false;
        }
        if (A0A(strA02)) {
            return true;
        }
        Iterator<String> it = m7.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = m7.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
