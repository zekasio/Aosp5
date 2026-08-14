package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0803Sg implements P1 {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public C0803Sg(A2 a2) {
        this.A00 = a2;
    }

    @Override // com.facebook.ads.redexgen.X.P1
    public final void ACj(String str, JSONObject jSONObject) {
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AF2();
            if (JR.A1I(this.A00.A07)) {
                this.A00.A07.A09().AAT();
            }
        }
        this.A00.A0F.A0h(str, jSONObject);
    }
}
