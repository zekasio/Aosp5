package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0515Gx {
    public static byte[] A00;
    public static String[] A01 = {"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, Ascii.FF, Ascii.VT, 53, Ascii.ESC, 17, 49, Ascii.ESC, 17, 100, Ascii.US, 54, 99, 71, Ascii.SI, 125, 51, 50, 98, Ascii.DC4};
    }

    static {
        A03();
    }

    public static H1 A00(H1 h1, String[] strArr, Map<String, H1> map) {
        if (h1 == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (h1 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (h1 == null && strArr.length > 1) {
            H1 h12 = new H1();
            int length = strArr.length;
            while (i < length) {
                String id = strArr[i];
                h12.A0E(map.get(id));
                i++;
            }
            return h12;
        }
        if (h1 != null && strArr != null && strArr.length == 1) {
            return h1.A0E(map.get(strArr[0]));
        }
        if (h1 != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                h1.A0E(map.get(strArr[i]));
                i++;
            }
            return h1;
        }
        return h1;
    }

    public static String A02(String str) {
        String strA01 = A01(0, 1, 106);
        String strReplaceAll = str.replaceAll(A01(1, 2, 93), strA01).replaceAll(A01(4, 5, 103), strA01);
        String strA012 = A01(3, 1, 73);
        return strReplaceAll.replaceAll(strA01, strA012).replaceAll(A01(9, 11, 99), strA012);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2, H1 h1) {
        if (h1.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(h1.A07()), i, i2, 33);
        }
        if (h1.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (h1.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (h1.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(h1.A05()), i, i2, 33);
        }
        if (h1.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(h1.A04()), i, i2, 33);
        }
        if (h1.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(h1.A0L()), i, i2, 33);
        }
        Layout.Alignment alignmentA08 = h1.A08();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "m";
        strArr2[2] = "ujiHtYdg";
        if (alignmentA08 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h1.A08()), i, i2, 33);
        }
        int iA06 = h1.A06();
        if (iA06 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h1.A03(), true), i, i2, 33);
        } else if (iA06 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h1.A03()), i, i2, 33);
        } else {
            if (iA06 != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h1.A03() / 100.0f), i, i2, 33);
        }
    }
}
