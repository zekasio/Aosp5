package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KR {
    public static byte[] A04;
    public static String[] A05 = {"YPLhW1YthHwH", "C5pYKBzTNFhaTyoOn8CLtRZjld8VucJT", "nwsPGMG6WiL6DBh0FHrHZ0R5IXcuLobJ", "gK87iCVuQY9qRaZHEz4I1", "yLpaI56t1HZbTv34O8DVm8KvrNdbdGTz", "u7C3r8DCX9eoMUGzC5EwjUGrObNKQaYD", "hw4dG9XbulEGH2HnH1CXedNx1Lx9pLFE", "teiwDyYVI0VIQpP4hHHpy5xIPHWhYAA5"};
    public final KQ A00;

    @Nullable
    public final Long A01;

    @Nullable
    public final String A02;

    @Nullable
    public final String A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-13, Ascii.SUB, Ascii.NAK, -47, -42, Ascii.NAK, -47, Ascii.ETB, 32, 35, -47, 4, -11, -4, -47, 39, Ascii.SYN, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -47, 19, Ascii.SYN, Ascii.SUB, Ascii.US, Ascii.CAN, -47, 38, 36, Ascii.SYN, Ascii.NAK, -47, 32, Ascii.US, -47, 4, -11, -4, -47, 39, Ascii.SYN, 35, 36, Ascii.SUB, 32, Ascii.US, -47, -42, 36, -57, -18, -23, -91, -86, -23, -91, -21, -12, -9, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -91, -25, -22, -18, -13, -20, -91, -6, -8, -22, -23, -91, -12, -13, -91, -11, -15, -26, -24, -22, -14, -22, -13, -7, -91, -86, -8, -14, Ascii.EM, Ascii.DC4, -48, -43, Ascii.DC4, -48, Ascii.SYN, Ascii.US, 34, -48, 36, Ascii.NAK, Ascii.GS, 32, Ascii.FS, 17, 36, Ascii.NAK, -48, -43, 35, -48, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.RS, Ascii.ETB, -48, 37, 35, Ascii.NAK, Ascii.DC4, -48, Ascii.US, Ascii.RS, -48, 36, Ascii.NAK, Ascii.GS, 32, Ascii.FS, 17, 36, Ascii.NAK, -48, -43, 35, -57, -20, -12, -33, -22, -25, -30, -98, -64, -25, -30, -50, -33, -9, -22, -19, -33, -30, Ascii.SI, 32, 40, 43, 39, Ascii.FS, 47, 32, -37, -32, 46, -37, 36, 46, -37, 41, 42, 47, -37, 49, Ascii.FS, 39, 36, Ascii.US, -37, Ascii.GS, Ascii.FS, 41, 41, 32, 45, -37, 47, 32, 40, 43, 39, Ascii.FS, 47, 32, -56, -31, -26, -24, -29, -29, -30, -27, -25, -40, -41, -109, -75, -36, -41, -61, -44, -20, -33, -30, -44, -41, -109, -25, -20, -29, -40, -109, -23, -8, -15, -14, -7, -12, -17, -7, -12, 6, Ascii.CR, 8, 3, Ascii.CAN, Ascii.CR, 17, 9, 3, Ascii.CAN, 19, Ascii.SI, 9, Ascii.DC2, -55, -54, -37, -50, -56, -54, -60, -50, -55, 58, 45, 59, 55, 52, 62, 45, 44, 39, 56, 52, 41, 43, 45, 53, 45, 54, 60, 39, 49, 44, 58, 43, 50, 38, 61, 44, 57, 58, 48, 54, 53, 44, Ascii.GS, 37, 40, 36, Ascii.EM, 44, Ascii.GS, 33, 38, Ascii.GS, Ascii.DC2};
    }

    static {
        A02();
    }

    public KR() {
        this.A00 = KQ.A03;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public KR(C8U c8u, @Nullable String str, @Nullable String str2, @Nullable KM km) throws KI {
        String strA01 = A01(270, 21, 101);
        String strA012 = A01(291, 11, 100);
        String strA013 = A01(247, 14, 65);
        String strA014 = A01(310, 4, 74);
        String strA015 = A01(HttpStatus.SC_MOVED_TEMPORARILY, 8, 85);
        if (TextUtils.isEmpty(str)) {
            this.A00 = KQ.A03;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (KP.A00[KQ.valueOf(jSONObject.getString(strA014).toUpperCase()).ordinal()] == 1) {
                this.A00 = KQ.A02;
                this.A01 = Long.valueOf(jSONObject.getString(A01(241, 6, 45)));
                if (jSONObject.has(strA013)) {
                    this.A02 = jSONObject.getString(strA013);
                } else {
                    this.A02 = null;
                }
                this.A03 = jSONObject.getString(A01(261, 9, 2));
                if (jSONObject.getString(strA012).equals(c8u.A03().A7n())) {
                    if (jSONObject.getString(strA01).equals(str2)) {
                        HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(KM.A0G.A03()), Integer.valueOf(KM.A0J.A03()), Integer.valueOf(KM.A0H.A03()), Integer.valueOf(KM.A0I.A03())));
                        if (jSONObject.getInt(strA015) != km.A03()) {
                            if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(strA015))) || !hashSet.contains(Integer.valueOf(km.A03()))) {
                                throw new KI(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 77), this.A01, Integer.valueOf(jSONObject.getInt(strA015)), km));
                            }
                            return;
                        }
                        return;
                    }
                    throw new KI(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 34), this.A01, jSONObject.getString(strA01), str2));
                }
                throw new KI(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 78), this.A01, jSONObject.getString(strA012), c8u.A03().A7n()));
            }
            throw new KI(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 16) + jSONObject.getString(strA014));
        } catch (JSONException e) {
            c8u.A06().A8y(A01(238, 3, 37), C03298z.A0P, new AnonymousClass90(e));
            throw new KI(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e);
        }
    }

    @Nullable
    public static KM A00(String str) throws KI {
        try {
            return KM.A00(new JSONObject(str).getInt(A01(HttpStatus.SC_MOVED_TEMPORARILY, 8, 85)));
        } catch (JSONException e) {
            throw new KI(AdErrorType.BID_PAYLOAD_ERROR, A01(152, 18, 27), e);
        }
    }

    public static void A03(KM km) throws KI {
        if (KM.A0F.equals(km) || KM.A0D.equals(km) || KM.A0E.equals(km) || KM.A0C.equals(km)) {
        } else {
            throw new KI(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(170, 40, 88), Integer.valueOf(km.A03())));
        }
    }

    @Nullable
    public final String A04() {
        Long l = this.A01;
        if (l == null) {
            return null;
        }
        String string = l.toString();
        if (A05[5].charAt(0) == 'P') {
            throw new RuntimeException();
        }
        A05[2] = "nWWGWN2JOSzWcz2EKeaa2WFuGi6FMoRa";
        return string;
    }

    @Nullable
    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != KQ.A03;
    }
}
