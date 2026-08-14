package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0617La {
    public static byte[] A00;
    public static String[] A01 = {"7ohGC5g", "BESl4Xd", "iUgFvmR9fU9rB14tb7We98OmvwePZ1", "TAphUfcpA", "kzqdOSSqZA4kTMjsfdu0WHMTMSeOJpsG", "kkWiSP6EEdgokKFwFZk1KzEPUpP5pdBL", "Sq5ynKeXE6NTcDzdnBNMA", "lzNSrnHLqWOxwLQ"};

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
            if (A01[3].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "rgUP3FcFDVOOAnn";
            strArr[6] = "C5ye4JewP89EotTU6TfsV";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{7, 58, 64, Ascii.FF, 89, 32, Ascii.FF, 57, 60, 58, 64, Ascii.FF, 89, 32, Ascii.FF, 57, Ascii.SI, Ascii.FF, Ascii.CAN, 10, Ascii.CR, Ascii.FF, 60, 9, 8, Ascii.RS, 3, Ascii.DC4, 37, 38, Ascii.FS, 33, Ascii.SUB, -45, 40, 37, Ascii.US, -45, -40, 38, -45, Ascii.SYN, Ascii.DC4, 40, 38, Ascii.CAN, Ascii.ETB, -45, Ascii.CAN, 43, Ascii.SYN, Ascii.CAN, 35, 39, Ascii.FS, 34, 33, -19, -45, -40, 38, -31, -24, 48, 39, 60, 39, -26, 59, 56, 47, -26, -24, -21, 57, -24, -26, 52, 53, 58, -26, 43, 55, 59, 39, 50, -26, 58, 53, -26, 39, 52, 42, 56, 53, 47, 42, -26, 59, 56, 47, -26, -24, -21, 57, -24, -12, -26, 10, 43, 40, 59, 45, -26, 47, 52, 44, 53, 0, -26, -21, 57, -12, -26, Ascii.NAK, 56, 47, 45, 47, 52, 39, 50, -26, 59, 56, 47, 0, -26, -21, 57, -9, -18, 3, -18, -30, -1, -10, -83, -18, 2, 1, -11, -4, -1, -10, 1, 6, -57, -83, -81, -78, 0, -81, -69, -83, -18, -5, -15, -1, -4, -10, -15, -30, -1, -10, -83, -18, 2, 1, -11, -4, -1, -10, 1, 6, -57, -83, -81, -78, 0, -81, -69, Ascii.SYN, Ascii.CR, 34, Ascii.CR, 1, Ascii.RS, Ascii.NAK, -52, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.GS, 33, 17, -52, Ascii.FS, Ascii.CR, Ascii.RS, 32, -26, -52, -50, -47, Ascii.US, -50, -38, -52, Ascii.CR, Ascii.SUB, Ascii.DLE, Ascii.RS, Ascii.ESC, Ascii.NAK, Ascii.DLE, 1, Ascii.RS, Ascii.NAK, -52, Ascii.ESC, Ascii.FS, Ascii.CR, Ascii.GS, 33, 17, -52, Ascii.FS, Ascii.CR, Ascii.RS, 32, -26, -52, -50, -47, Ascii.US, -50, -38, 48, 39, 60, 39, Ascii.ESC, 56, 47, -26, 54, 39, 58, 46, 0, -26, -24, -21, 57, -24, -12, -26, 39, 52, 42, 56, 53, 47, 42, Ascii.ESC, 56, 47, -26, 54, 39, 58, 46, 0, -26, -24, -21, 57, -24, -12, 1, -8, Ascii.CR, -8, -20, 9, 0, -73, 10, -6, -1, -4, 4, -4, -47, -73, -71, -68, 10, -71, -59, -73, -8, 5, -5, 9, 6, 0, -5, -20, 9, 0, -73, 10, -6, -1, -4, 4, -4, -47, -73, -71, -68, 10, -71, -59};
    }

    static {
        A09();
    }

    public static Uri A00(String str) {
        Uri uri = Uri.parse(str);
        C0946Xx c0946XxA00 = C8T.A00();
        if (c0946XxA00 != null) {
            boolean zA24 = JR.A24(c0946XxA00);
            if (A01[4].charAt(6) != 'S') {
                throw new RuntimeException();
            }
            A01[4] = "EnCbrOSPna2eJt3ahTIDz2YGURRqGvvY";
            if (!zA24) {
                return uri;
            }
        }
        if (!A0D(uri)) {
            return A01(str);
        }
        A0A(str, uri);
        if (A01[0].length() == 17) {
            throw new RuntimeException();
        }
        A01[0] = "gq60LFwB18XMq";
        return uri;
    }

    public static Uri A01(String str) {
        try {
            URI uri = new URI(str);
            if (uri.isOpaque()) {
                Uri uriA03 = A03(uri);
                A0B(str, uri, uriA03);
                return uriA03;
            }
            Uri uriA02 = A02(uri);
            A0C(str, uri, uriA02, false);
            return uriA02;
        } catch (URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static Uri A02(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static Uri A03(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static SecurityException A04(String str, URISyntaxException uRISyntaxException) {
        return new SecurityException(String.format(Locale.US, A05(26, 36, 65), str, uRISyntaxException.getMessage()));
    }

    @Nullable
    public static URI A06(Uri uri) {
        try {
            URI uri2 = new URI(uri.toString());
            if (A0F(uri2, uri)) {
                return uri2;
            }
            return null;
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static URI A07(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            if (A01[3].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "2Q8u2ghBzy6EIpF";
            strArr[6] = "vCUILh5Fo1xS1klaxOFGD";
            URI uriA06 = A06(uri);
            if (uriA06 != null) {
                return uriA06;
            }
            throw A04(str, e);
        }
    }

    public static URI A08(String str, Uri uri) {
        try {
            return new URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static void A0A(String str, Uri uri) throws SecurityException {
        if (uri.isOpaque()) {
            A0B(str, A08(str, uri), uri);
        } else {
            URI uriA07 = A07(str, uri);
            A0C(str, uriA07, uri, A0F(uriA07, uri));
        }
    }

    public static void A0B(String str, URI uri, Uri uri2) {
        boolean zA0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean zA0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (zA0E && zA0E2) {
            return;
        }
        String strA05 = A05(0, 0, 114);
        if (!zA0E) {
            strA05 = strA05 + String.format(Locale.US, A05(290, 46, 37), uri.getScheme(), uri2.getScheme());
        }
        if (!zA0E2) {
            strA05 = strA05 + String.format(Locale.US, A05(192, 56, 58), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        throw new SecurityException(String.format(Locale.US, A05(63, 77, 84), uri.toString(), uri2.toString(), strA05, str));
    }

    public static void A0C(String str, URI uri, Uri uri2, boolean z) {
        boolean zA0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean zA0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean zA0E3 = A0E(uri.getPath(), uri2.getPath());
        String strA05 = A05(0, 0, 114);
        if (!zA0E) {
            strA05 = strA05 + String.format(Locale.US, A05(290, 46, 37), uri.getScheme(), uri2.getScheme());
        }
        if (!z && !zA0E2) {
            strA05 = strA05 + String.format(Locale.US, A05(140, 52, 27), uri.getAuthority(), uri2.getAuthority());
        }
        if (!zA0E3) {
            strA05 = strA05 + String.format(Locale.US, A05(248, 42, 84), uri.getPath(), uri2.getPath());
        }
        if (zA0E && zA0E2 && zA0E3) {
        } else {
            throw new SecurityException(String.format(Locale.US, A05(63, 77, 84), uri.toString(), uri2.toString(), strA05, str));
        }
    }

    public static boolean A0D(Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 109));
    }

    public static boolean A0E(@Nullable String str, @Nullable String str2) {
        String strA05 = A05(0, 0, 114);
        if (str == null || str.equals(strA05)) {
            return str2 == null || str2.equals(strA05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(URI uri, Uri uri2) {
        String host = uri2.getHost();
        return uri.getHost() == null && host != null && host.contains(A05(62, 1, 23));
    }
}
