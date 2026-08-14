package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
public final class C6D {
    public static EnumC02866w A06;
    public static byte[] A07;
    public static String[] A08 = {"eZKmHpMMDfaoBqW8nqrxEoXtMavqlqNM", "AtFM24PyHDF8", "75v22abHTVt154frUD1Ye4KyqdVteY4i", "Q1X3dzo1KUJ0DHl8HY6jDpMlStfBjogW", "z2ZYiDayfErc", "35EgzrmLPkhoCqMLba9eqfKFMV7fawsP", "opJsobvHgIMCHkez4yG45JKspLs2PehX", "oVaFSOpmfGo5v5TJJzClDpDAWRdHWsbi"};
    public static final AtomicReference<C6D> A09;
    public C6F A00;
    public C02716h A01;
    public final Context A02;
    public final C6C A03;
    public final AtomicReference<C6S> A04 = new AtomicReference<>();
    public final AtomicReference<C1071b8> A05 = new AtomicReference<>();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{99, 101, 116, 127, Ascii.EM, Ascii.DC4, 92, 90, 114, 109, 113};
    }

    static {
        A01();
        A09 = new AtomicReference<>();
    }

    public C6D(Context context, C6C c6c, EnumC02866w enumC02866w) {
        this.A02 = context;
        this.A03 = c6c;
        this.A01 = new C02716h(this.A02, this.A03);
        if (this.A04.get() == null && C7J.A0E(enumC02866w)) {
            A02(enumC02866w);
        }
    }

    private synchronized void A02(EnumC02866w enumC02866w) {
        if (this.A04.get() == null) {
            C6O.A02(this.A03.A0Z());
            C1071b8 c1071b8 = new C1071b8(this.A03, this.A01);
            this.A05.set(c1071b8);
            this.A00 = new C6F();
            this.A00.A00(c1071b8);
            if (this.A01.A06() && C7J.A0E(enumC02866w)) {
                c1071b8.A05(enumC02866w);
            }
            A06 = enumC02866w;
            this.A00.A01(enumC02866w);
            this.A04.set(C6S.A00(this.A02, this.A03));
        }
    }

    private boolean A03(EnumC02866w enumC02866w) {
        if (C7J.A0E(enumC02866w)) {
            A02(enumC02866w);
        }
        if (enumC02866w.equals(A06)) {
            return false;
        }
        A06 = enumC02866w;
        C6F c6f = this.A00;
        if (c6f != null) {
            c6f.A01(enumC02866w);
        }
        if (A08[0].charAt(4) == 't') {
            throw new RuntimeException();
        }
        A08[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
        return true;
    }

    private boolean A04(String str, AnonymousClass70 anonymousClass70) {
        if (!C7J.A0E(A06) || this.A04.get() == null) {
            return false;
        }
        C02716h c02716h = this.A01;
        if (c02716h != null) {
            c02716h.A05(EnumC02886y.A02, A06, str, anonymousClass70);
            return true;
        }
        return true;
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A05(MotionEvent motionEvent) {
        try {
            if (this.A04.get() == null) {
                return;
            }
            this.A04.get().A05(motionEvent);
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A06(String str) {
        AnonymousClass70 anonymousClass70A00;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(A00(0, 2, 69));
                    if (jSONObject != null) {
                        zA03 = jSONObject.has(A00(6, 2, 106)) ? false | A03(EnumC02866w.A00(jSONObject.getInt(A00(6, 2, 106)))) : false;
                        JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 83));
                        if (jSONObject.has(A00(8, 3, 69))) {
                            anonymousClass70A00 = AnonymousClass70.A00(jSONObject.getInt(A00(8, 3, 69)));
                        } else {
                            anonymousClass70A00 = AnonymousClass70.A04;
                        }
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            if (jSONObject2.has(A00(4, 2, 52)) && (string = jSONObject2.getString(A00(4, 2, 52))) != null && !string.isEmpty()) {
                                C7J.A0B(this.A03, C6J.A04.A02(), string);
                                zA03 |= A04(string, anonymousClass70A00);
                            }
                        }
                    } else {
                        return false;
                    }
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    C6O.A03(th);
                }
                return zA03;
            }
        }
        return false;
    }
}
