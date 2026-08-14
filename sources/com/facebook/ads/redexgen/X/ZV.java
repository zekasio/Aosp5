package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZV extends C02766m {
    public static byte[] A00;
    public static String[] A01 = {"y8Nq67FtAwLOnhnq1UqleBVuRpU5lwEq", "kKy3QSHCMFgMLI4jLKgpj6Ml3G5G", "CtFK8Pc2dFCHV68GnB3BGsunpwsbXZLI", "F24bvZCYxJ", "TOSHYJ1lEJvd7RJrf6C3asPns89jgyAB", "1i4XZgSUiEitKg1uirtbWyvJYEy72451", "xxTjtjFBsKHKUg72VLV3KyKqm", "tv2qbFeBoe5tOdCVBoBS0k7Q0eg7h6FY"};
    public static final String A02;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{73, 91, 95, 74, 41, 75, Ascii.SO, 119, 106, 102, 109, 97, 118, Ascii.FF, 47, Ascii.CAN, Ascii.CAN, 5, Ascii.CAN, 74, 8, Ascii.US, 3, 6, Ascii.SO, 3, 4, Ascii.CR, 74, Ascii.FF, 3, 6, Ascii.SI, 74, 37, 8, 0, Ascii.SI, 9, Ascii.RS, 47, Ascii.RS, Ascii.CR, Ascii.FF, Ascii.SUB, 95, 58, 17, 9, 95, 41, Ascii.RS, Ascii.CR, Ascii.SYN, Ascii.RS, Ascii.GS, 19, Ascii.SUB};
    }

    static {
        A09();
        A02 = ZV.class.getSimpleName();
    }

    public ZV(Context context, C6C c6c) {
        super(context, c6c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A02(HashMap<String, ZW> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A0C);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException", "BadMethodUse-android.util.Log.e"})
    public static File A03(String str) {
        try {
            String strSubstring = str.substring(0, str.lastIndexOf(File.separator));
            String fileName = str.substring(str.lastIndexOf(File.separator) + 1);
            return new File(strSubstring, fileName);
        } catch (Exception e) {
            Log.e(A02, A05(14, 26, 93), e);
            return null;
        }
    }

    public static String A06(String str) {
        if (((str.hashCode() == 902502675 && str.equals(A05(6, 8, 5))) ? (byte) 0 : (byte) -1) != 0) {
            String strA05 = A05(0, 0, 28);
            if (A01[0].charAt(3) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "jdgM3VinY7vKBuJQR961ULiFKj7S";
            strArr[3] = "O0JYmDhqre";
            return strA05;
        }
        return Environment.getExternalStorageDirectory().toString();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static String A07(String regex) {
        String strA05 = A05(0, 6, 66);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile(strA05).matcher(regex);
        while (matcher.find()) {
            String matchedPattern = matcher.group();
            matcher.appendReplacement(stringBuffer, A06(matchedPattern));
        }
        matcher.appendTail(stringBuffer);
        String regex2 = stringBuffer.toString();
        try {
            regex2 = new File(regex2).getCanonicalPath();
            return regex2;
        } catch (IOException e) {
            Log.e(A02, A05(40, 18, 72), e);
            return regex2;
        }
    }

    public final InterfaceC02856v A0G(List<C02846u> list) {
        return new ZX(this, list);
    }
}
