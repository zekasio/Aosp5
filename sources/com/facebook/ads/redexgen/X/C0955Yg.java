package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0955Yg implements AnonymousClass72<String> {
    public static byte[] A02;
    public static String[] A03 = {"2Ak12k3KxlDre9BMfcQZJm1fVAEd6Tgf", "y4tPrpxAohrbTAcrGFRil83jmLq5oYH4", "e1svbR4LjnL9Uq0", "fjsFD3QQ6IDqIywrJIHqXmb1Bv2DWOX8", "ZSEXe", "1cuzbVcJHyn9kOUsdImxi6RVnab7", "gZujDznUETD0P37Bbl", "6v0D04DrfcPbr3xPrMqOit1DxHvgs0fP"};
    public static final String A04;
    public final String A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        String[] strArr = A03;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A03[6] = "kBylwnmSfcelW07O9B";
        A02 = new byte[]{86, 97, 97, 124, 97, 51, 117, 118, 103, 112, 123, 122, 125, 116, 51, 64, 106, 96, 103, 118, 126, 51, 67, 97, 124, 99, 118, 97, 103, 106, 112, 113, 106, 97, 120, 113, 107, 112, 122};
    }

    static {
        A03();
        A04 = C0955Yg.class.getSimpleName();
    }

    public C0955Yg(String str) {
        this.A00 = str;
        this.A01 = A01(str);
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static String A01(String ret) {
        String strA00 = A00(30, 9, 121);
        try {
            Object[] params = {ret};
            if (C0954Yf.A01 != null && C0954Yf.A02 != null) {
                strA00 = (String) C0954Yf.A02.invoke(C0954Yf.A01, params);
                return strA00;
            }
            return strA00;
        } catch (Exception e) {
            String str = A04;
            if (A03[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "oXiwA6B1oi6grML0rznkDv7zegE0";
            strArr[3] = "MpkqXegYf54bz8gSrJrjZ1BXYdnwAcLG";
            Log.e(str, A00(0, 30, 84), e);
            return strA00;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        C0955Yg c0955Yg = (C0955Yg) obj;
        return this.A00.equals(c0955Yg.A00) && this.A01.equals(c0955Yg.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return this.A00.getBytes().length + this.A01.getBytes().length;
    }
}
