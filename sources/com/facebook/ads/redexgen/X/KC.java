package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KC implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C8U A00;
    public final /* synthetic */ KF A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, Ascii.ESC, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, Ascii.ESC, 45, 32};
    }

    public KC(KF kf, String str, C8U c8u) {
        this.A01 = kf;
        this.A02 = str;
        this.A00 = c8u;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<KE> arrayList;
        if (L0.A02(this)) {
            return;
        }
        try {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (KE ke : arrayList) {
                jSONArray.put(A00(0, 0, 60) + ke.A00 + ';' + ke.A02 + ';' + ke.A01);
            }
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            this.A00.A06().A8z(A00(10, 9, 82), C03298z.A2Q, anonymousClass90);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
