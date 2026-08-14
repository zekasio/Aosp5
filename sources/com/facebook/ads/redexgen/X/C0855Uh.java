package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0855Uh implements RT {
    public static byte[] A02;
    public final /* synthetic */ C0946Xx A00;
    public final /* synthetic */ RR A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0855Uh(RR rr, C0946Xx c0946Xx) {
        this.A01 = rr;
        this.A00 = c0946Xx;
    }

    @Override // com.facebook.ads.redexgen.X.RT
    public final void A3u() {
        try {
            JR.A0O(this.A00).A2F(this.A01.A6J().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A06().A3R(e);
        }
    }
}
