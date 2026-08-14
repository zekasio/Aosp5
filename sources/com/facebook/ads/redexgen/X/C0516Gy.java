package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0516Gy implements RR {
    public static byte[] A05;
    public static String[] A06 = {"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};

    @Nullable
    public JSONObject A00;

    @Nullable
    public JSONObject A01;
    public final RS A03;
    public final List<RT> A04 = new ArrayList();
    public boolean A02 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        A06[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, Ascii.CR, Ascii.SYN, Ascii.FS, Ascii.DC4, Ascii.GS, 88, 93, Ascii.VT, 88, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.EM, 88, Ascii.CR, 8, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.GS, 66, 114, 82, 82, 88, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.EM, 88, 82, 82, 114, 93, Ascii.VT, 114, 82, 82, 88, Ascii.RS, 17, Ascii.SYN, Ascii.US, Ascii.GS, 10, 8, 10, 17, Ascii.SYN, Ascii.FF, 88, 82, 82, 114, 93, Ascii.VT, 89, 110, 117, 127, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, Ascii.ETB, Ascii.FF, 6, Ascii.SO, 7, 66, Ascii.VT, 17, 66, Ascii.FF, Ascii.CR, Ascii.SYN, 66, Ascii.DLE, 7, 3, 6, Ascii.ESC, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, 127, 125, 127, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    static {
        A03();
    }

    public C0516Gy(RS rs) {
        this.A03 = rs;
    }

    private boolean A04(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean zA02 = RQ.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ zA02;
    }

    public final synchronized boolean A05(JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject != null) {
            if (jSONObject2 == null && this.A03.A04()) {
                throw new IllegalArgumentException(A02(132, 19, 0));
            }
            if (jSONObject2 == null || this.A03.A04()) {
                if (!A04(this.A01, jSONObject2) && !A04(this.A00, jSONObject)) {
                    return false;
                }
                this.A00 = jSONObject;
                this.A01 = jSONObject2;
                this.A02 = true;
                for (RT l : this.A04) {
                    l.A3u();
                }
                try {
                    Locale locale = Locale.US;
                    String strA02 = A02(0, 57, 99);
                    Object[] objArr = new Object[3];
                    objArr[0] = this.A03;
                    objArr[1] = this.A00 == null ? A02(151, 4, 56) : this.A00.toString(2);
                    objArr[2] = this.A01 == null ? A02(151, 4, 56) : this.A01.toString(2);
                    String.format(locale, strA02, objArr);
                } catch (JSONException unused) {
                }
                return true;
            }
            throw new IllegalArgumentException(A02(113, 19, 22));
        }
        throw new IllegalArgumentException(A02(101, 12, 84));
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized void A3F(RT rt) {
        this.A04.add(rt);
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized JSONObject A6J() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized JSONObject A6g() {
        if (this.A03.A04()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final RS A6l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.RR
    public final synchronized boolean A8c() {
        return this.A02;
    }
}
