package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PD {
    public static byte[] A00;
    public static String[] A01 = {"CXRchRuqobcH0303RF", "0PvsG2xJSmQLgGTcWH9EYe7sEgRs7pRt", "Ep2muPcKb5OPprn584rkOKVS7ZwPor7u", "ESdTFl6hgzo0PrNou", "ifIc3126Iu24LMQAqXU9MKX3mrrg1qWL", "gYyPZy3RrUjZ7", "cRp6DEQTFSLuVCLvwOm8", "Iag0U1Rq9Q0ZydVPffrz8fjunI2ky4CH"};

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-119, -68, -8, -14, -50, -16, -16, -14, -3, 1, -70, -33, -18, -5, -12, -14, 0, -46, -2, -3, 3, -12, -3, 3, -68, -37, -12, -3, -10, 3, -9, -17, Ascii.ESC, Ascii.SUB, 32, 17, Ascii.SUB, 32, -39, -2, Ascii.CR, Ascii.SUB, 19, 17, -71, -75, -49, -32, -15, -13, -24, -32, -21, -97, -62, -18, -19, -13, -28, -19, -13, 9, Ascii.RS, 9, 17, Ascii.DC4, 9, 10, Ascii.DC4, Ascii.CR, -7, Ascii.DLE, Ascii.VT, -4, 10, -50, -27, -32, -47, -33, -116, 4, Ascii.DLE, 5, 6, -15, -2, -2, -5, -2, Ascii.NAK, Ascii.FS, 19, 19, -7, -24, -11, -18, -20};
    }

    static {
        A04();
    }

    @Nullable
    @RequiresApi(api = 21)
    public static WebResourceResponse A00(C0947Xy c0947Xy, WebResourceRequest webResourceRequest, Uri uri, String str, HashMap<String, String> map) throws IOException {
        String strA02;
        String strA022 = A02(85, 5, 49);
        C0755Qk exoPlayerCacheManager = C0755Qk.A05(c0947Xy.A00());
        InterfaceC0521Hd dataSourceFactory = exoPlayerCacheManager.A0F(c0947Xy);
        C7U.A0H(c0947Xy, uri.toString());
        try {
            PE pe = new PE(c0947Xy.A00(), uri, dataSourceFactory);
            int iAvailable = pe.available();
            if (iAvailable <= 0) {
                A05(c0947Xy, 1, new Pair[]{new Pair(A02(61, 9, 77), String.valueOf(iAvailable))});
                return null;
            }
            String strA03 = A03(webResourceRequest.getRequestHeaders());
            if (strA03 != null) {
                try {
                    PC pcA01 = A01(strA03);
                    if (!pcA01.A03) {
                        Pair[] pairArr = new Pair[1];
                        if (pcA01.A02 != null) {
                            strA02 = pcA01.A02;
                        } else {
                            if (A01[2].charAt(11) != 'P') {
                                throw new RuntimeException();
                            }
                            A01[0] = "OMRpqA07uUbGIz9l3e";
                            strA02 = A02(90, 4, 76);
                        }
                        pairArr[0] = new Pair(A02(94, 5, 44), strA02);
                        A05(c0947Xy, 0, pairArr);
                        return null;
                    }
                    int i = pcA01.A01;
                    int rangeEnd = pcA01.A00 == -1 ? iAvailable - 1 : pcA01.A00;
                    A06(map, iAvailable);
                    map.put(A02(31, 13, 81), A02(75, 6, 17) + i + A02(1, 1, 52) + rangeEnd + A02(2, 1, 110) + iAvailable);
                    c0947Xy.A0D().A53();
                    return new WebResourceResponse(str, null, HttpStatus.SC_PARTIAL_CONTENT, A02(46, 15, 36), map, pe);
                } catch (NumberFormatException e) {
                    A05(c0947Xy, 3, new Pair[]{new Pair(strA022, e.toString())});
                    return null;
                }
            }
            c0947Xy.A0D().A53();
            A06(map, iAvailable);
            return new WebResourceResponse(str, null, 200, A02(44, 2, 15), map, pe);
        } catch (IOException e2) {
            A05(c0947Xy, 2, new Pair[]{new Pair(strA022, e2.toString())});
            return null;
        }
    }

    @RequiresApi(api = 21)
    public static PC A01(String str) {
        if (str == null) {
            PC pc = new PC();
            pc.A03 = false;
            pc.A02 = null;
            return pc;
        }
        String[] strArrSplit = str.split(A02(3, 1, 90));
        if (strArrSplit.length >= 2) {
            if (A02(70, 5, 60).equals(strArrSplit[0].toLowerCase(Locale.US).trim())) {
                String[] ranges = strArrSplit[1].trim().split(A02(0, 1, 2));
                if (ranges.length != 1) {
                    PC pc2 = new PC();
                    pc2.A03 = false;
                    pc2.A02 = str;
                    return pc2;
                }
                String[] strArrSplit2 = strArrSplit[1].trim().split(A02(1, 1, 52));
                PC pc3 = new PC();
                pc3.A03 = true;
                pc3.A02 = str;
                pc3.A01 = TextUtils.isEmpty(strArrSplit2[0]) ? 0 : Integer.parseInt(strArrSplit2[0]);
                if (strArrSplit2.length > 1) {
                    pc3.A00 = TextUtils.isEmpty(strArrSplit2[1]) ? -1 : Integer.parseInt(strArrSplit2[1]);
                } else {
                    pc3.A00 = -1;
                }
                return pc3;
            }
        }
        PC pc4 = new PC();
        pc4.A03 = false;
        pc4.A02 = str;
        return pc4;
    }

    @Nullable
    public static String A03(Map<String, String> map) {
        for (String str : map.keySet()) {
            String lowerCase = str.toLowerCase(Locale.US);
            String header = A02(94, 5, 44);
            if (header.equals(lowerCase)) {
                String header2 = map.get(str);
                return header2;
            }
        }
        return null;
    }

    public static void A05(C0947Xy c0947Xy, int i, Pair<String, String>[] pairArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(81, 4, 70), i);
            for (Pair<String, String> pair : pairArr) {
                jSONObject.put((String) pair.first, pair.second);
            }
        } catch (JSONException unused) {
        }
        c0947Xy.A0D().A52(jSONObject.toString());
    }

    public static void A06(HashMap<String, String> map, int i) {
        map.put(A02(4, 13, 50), A02(70, 5, 60));
        map.put(A02(17, 14, 52), String.valueOf(i));
    }
}
