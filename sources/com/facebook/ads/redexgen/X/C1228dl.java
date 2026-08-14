package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1228dl extends L8 {
    public static byte[] A02;
    public final /* synthetic */ C01320u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.SI, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, Ascii.SI, 6};
    }

    public C1228dl(C01320u c01320u, JSONObject jSONObject) {
        this.A00 = c01320u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e) {
            this.A00.A03.A06().A8y(A00(0, 17, 116), C03298z.A1B, new AnonymousClass90(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A06().A8y(A00(0, 17, 116), C03298z.A1A, new AnonymousClass90(e2));
        }
    }
}
