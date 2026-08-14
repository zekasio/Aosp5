package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class C0730Pl extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass18 A03;
    public final C1W A04;
    public final C0947Xy A05;
    public final InterfaceC0575Jh A06;
    public final O9 A07;
    public final T5 A08;
    public final InterfaceC0728Pj A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{Ascii.VT, 47, Ascii.GS, 33, 44, 52, 44, 47, 33, 40, Ascii.FF, 41, 52, 5, Ascii.SYN, Ascii.ETB, Ascii.CR, 10, 3, 68, 1, Ascii.SYN, Ascii.SYN, Ascii.VT, Ascii.SYN, 52, 8, 5, Ascii.GS, 5, 6, 8, 1, 68, 0, Ascii.VT, 39, Ascii.DLE, 5, 39, 8, Ascii.CR, 7, Ascii.SI, 68, Ascii.DLE, Ascii.SYN, Ascii.CR, 3, 3, 1, Ascii.SYN, 1, 0, 68, 19, Ascii.CR, Ascii.DLE, Ascii.FF, 68, Ascii.DC4, Ascii.SYN, 1, 73, 1, Ascii.DC2, 1, 10, Ascii.DLE, 68, 7, 8, Ascii.CR, 7, Ascii.SI, Ascii.ETB, 68, 7, Ascii.VT, 17, 10, Ascii.DLE, 68, 5, 10, 0, 68, 32, 1, 8, 5, Ascii.GS, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, Ascii.CAN, 53, 34, 42, 40, 51, 34, Ascii.NAK, 2, 10, 8, 19, 2, 56, Ascii.DC4, 2, Ascii.DC4, Ascii.DC4, Ascii.SO, 8, 9, 56, Ascii.SO, 3, Ascii.DC4, Ascii.SI, Ascii.VT, 5, Ascii.SO, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (Lr.A00 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0730Pl(C0947Xy c0947Xy, AnonymousClass18 anonymousClass18, C1W c1w, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0728Pj interfaceC0728Pj, Map<String, String> map) {
        super(c0947Xy);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new T8() { // from class: com.facebook.ads.redexgen.X.8J
            @Override // com.facebook.ads.redexgen.X.O9
            public final void AA3() {
            }

            @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
            public final void AAn(int i, @Nullable String str) {
                this.A00.A0B.set(true);
                this.A00.A09.ABK();
            }

            @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
            public final void AAz() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.AAz();
            }

            @Override // com.facebook.ads.redexgen.X.O9
            public final void ACu() {
                this.A00.A09.ACu();
            }
        };
        this.A05 = c0947Xy;
        this.A03 = anonymousClass18;
        this.A04 = c1w;
        this.A06 = interfaceC0575Jh;
        this.A09 = interfaceC0728Pj;
        this.A02 = map;
        this.A08 = A04();
        if (JR.A1I(this.A05)) {
            this.A05.A09().AFP(this.A08, this.A03.A0U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C0730Pl c0730Pl) {
        int i = c0730Pl.A00;
        c0730Pl.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private T5 A04() {
        T5 t5 = new T5(this.A05, (WeakReference<O9>) new WeakReference(this.A07), 10, JR.A1P(this.A05));
        t5.setCornerRadius(A0E);
        t5.setLogMultipleImpressions(false);
        t5.setCheckAssetsByJavascriptBridge(false);
        t5.setWebViewTimeoutInMillis(this.A04.A08());
        t5.setRequestId(this.A03.A0Z());
        t5.setOnTouchListener(new ViewOnTouchListenerC0729Pk(this));
        WebSettings settings = t5.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            t5.addJavascriptInterface(new C0731Pm(this.A05, this, this.A06, this.A02, this.A03.A0U()), A06(0, 12, 104));
        }
        return t5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.X.JR.A0F(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
    
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.C0730Pl.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
    
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0730Pl.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.X.JR.A0F(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
    
        r6.A03(0);
        r9.A05.A06().A8y(r5, com.facebook.ads.redexgen.X.C03298z.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0730Pl.A0A():void");
    }

    public final void A0B() {
        String strA0E;
        if (this.A04.A0J()) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0U());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            InterfaceC03288y interfaceC03288yA06 = this.A05.A06();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C03298z.A2F;
            String strA06 = A06(155, 15, 98);
            interfaceC03288yA06.A8z(strA06, i, anonymousClass90);
            if (JR.A0l(this.A05) && MH.A00(this.A05) == MG.A07) {
                this.A05.A06().A8z(strA06, C03298z.A2E, anonymousClass90);
                this.A07.AAn(0, null);
                return;
            }
        }
        try {
            T5 t5 = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                strA0E = this.A04.A0B();
            } else {
                strA0E = this.A04.A0E();
            }
            t5.loadUrl(strA0E);
        } catch (Exception e2) {
            this.A05.A06().A8y(A06(192, 8, 57), C03298z.A2c, new AnonymousClass90(e2));
        }
    }

    public final void A0C() {
        if (JR.A1I(this.A05)) {
            C0947Xy c0947Xy = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c0947Xy.A09().AFF(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
        } else {
            this.A08.destroy();
        }
    }

    public MK getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C0767Qw getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
