package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f1440a = "0123456789abcdef".toCharArray();

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i) {
        return isNumeric(str) ? Integer.parseInt(str) : i;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int iIndexOf = sb.indexOf(str2);
        while (iIndexOf != -1) {
            sb.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb.indexOf(str2, iIndexOf + str3.length());
        }
        return sb.toString();
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i = (cCharAt == '-' || cCharAt == '+') ? 1 : 0;
        int length = str.length();
        if (i == 1 && length == 1) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static String prefixToIndex(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i > str.length()) {
            i = str.length();
        }
        return str.substring(0, i);
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : "";
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.StringUtils.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(String str2, String str3) {
                    return str2.compareToIgnoreCase(str3);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static String getHostAndPath(String str) {
        Uri uri = Uri.parse(str);
        return uri.getHost() + uri.getPath();
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    private static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            char[] cArr2 = f1440a;
            byte b = bArr[i];
            cArr[i2] = cArr2[(b & 240) >>> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    sb.append(str2.substring(0, 1).toUpperCase(Locale.ENGLISH));
                    sb.append(str2.substring(1).toLowerCase(Locale.ENGLISH));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i) {
        return createSpannedString(str, i, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i) {
        return createSpannedString(str, i, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i, int i2) {
        return createSpannedString(str, i, i2, 0);
    }

    public static SpannedString createSpannedString(String str, int i, int i2, int i3) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i3), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z) {
                spannable.setSpan(new StyleSpan(1), iStart, iEnd, 256);
            }
        }
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\.");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (isValidString(str2)) {
                String[] strArrSplit2 = str2.split("[^0-9]+");
                if (strArrSplit2.length > 0) {
                    arrayList.add(strArrSplit2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(charSequence);
        }
        sb.delete((sb.length() - 1) - charSequence.length(), sb.length());
        return sb.toString();
    }
}
