package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UN extends C5E implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C0947Xy A01;

    @Nullable
    public InterfaceC0592Jy A02;

    @Nullable
    public C0366Al A04;
    public C02987m A05;
    public ViewOnClickListenerC02937e A06;

    @DoNotStrip
    public AbstractC0766Qv A07;
    public C0767Qw A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Q2 A0C = new UT(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public KA A03 = KA.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, Ascii.SO, 38, 39, 42, 34, Ascii.NAK, 42, 38, 52, Ascii.NAK, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, Ascii.DLE, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = UN.class.getSimpleName();
    }

    private K0 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new US(this, mediaViewVideoRendererApi);
    }

    private K0 A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UR(this, mediaViewVideoRendererApi);
    }

    private AbstractC0766Qv A04() {
        return new UP(this);
    }

    private C0767Qw A05() {
        return new C0767Qw(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C0366Al c0366Al = this.A04;
        if (c0366Al != null) {
            Q3 q3 = (Q3) c0366Al.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            q3.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C0366Al c0366Al = this.A04;
        if (c0366Al != null) {
            c0366Al.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0591Jx(this));
        }
    }

    private void A0B() {
        C0366Al c0366Al = this.A04;
        if (c0366Al != null) {
            Q3 q3 = (Q3) c0366Al.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            q3.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        C0366Al c0366Al = this.A04;
        if (c0366Al != null && c0366Al.getState() == EnumC0764Qt.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = KA.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0I(com.facebook.ads.redexgen.X.UB r6, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.InterfaceC0592Jy r7) {
        /*
            r5 = this;
            r0 = 0
            r5.A0A = r0
            r5.A0B = r0
            r5.A02 = r7
            r5.A09()
            com.facebook.ads.redexgen.X.7m r3 = r5.A05
            if (r6 == 0) goto L2a
            com.facebook.ads.redexgen.X.K5 r4 = r6.getAdCoverImage()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UN.A0G
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            r1 = 0
            goto L3d
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.UN.A0G
            java.lang.String r1 = "zpp3cHPhluFOPvL30kkcY8af"
            r0 = 3
            r2[r0] = r1
            if (r4 == 0) goto L2a
            com.facebook.ads.redexgen.X.K5 r0 = r6.getAdCoverImage()
            java.lang.String r1 = r0.getUrl()
        L3d:
            com.facebook.ads.redexgen.X.UQ r0 = new com.facebook.ads.redexgen.X.UQ
            r0.<init>(r5)
            r3.setImage(r1, r0)
            com.facebook.ads.redexgen.X.KA r0 = r6.A18()
            r5.A03 = r0
            com.facebook.ads.redexgen.X.7e r1 = r5.A06
            java.lang.String r0 = r6.A1E()
            r1.setPlayAccessibilityLabel(r0)
            com.facebook.ads.redexgen.X.7e r1 = r5.A06
            java.lang.String r0 = r6.A1D()
            r1.setPauseAccessibilityLabel(r0)
            com.facebook.ads.redexgen.X.Qw r0 = r5.A08
            r0.A0U()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UN.A0I(com.facebook.ads.redexgen.X.UB, com.facebook.ads.redexgen.X.Jy):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(Q6 q6) {
        C0366Al c0366Al = this.A04;
        if (c0366Al != null) {
            c0366Al.A0b(q6, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        C0366Al c0366Al = this.A04;
        if (c0366Al == null || c0366Al.getState() == EnumC0764Qt.A06) {
            return false;
        }
        return this.A03 == KA.A05 || this.A03 == KA.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        K0 k0A02;
        ((C5E) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        if (i == 0) {
            k0A02 = A02(mediaViewVideoRendererApi);
        } else if (i == 1) {
            k0A02 = A01(mediaViewVideoRendererApi);
        } else {
            throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5L) mediaViewVideoRendererApi).A06(k0A02);
        this.A01 = C5G.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C02987m(this.A01);
        this.A07 = A04();
        this.A08 = A05();
        float f = Lr.A00;
        int i2 = (int) (2.0f * f);
        int i3 = (int) (25.0f * f);
        this.A06 = new ViewOnClickListenerC02937e(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(i2, i3, i3, i2);
        this.A06.setLayoutParams(layoutParams);
        int i4 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[3].length() == 24) {
                String[] strArr = A0G;
                strArr[2] = "oEzbzrDqpY4LpZuK9aeaZZijHYv0V";
                strArr[0] = "65U2aK7TrzSKlLOXQMMYyslcv3rZK";
                if (i4 >= childCount) {
                    break;
                }
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C0366Al) {
                    this.A04 = (C0366Al) childAt;
                    break;
                }
                i4++;
            } else {
                throw new RuntimeException();
            }
        }
        C0366Al c0366Al = this.A04;
        if (c0366Al == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 58));
            }
        } else {
            c0366Al.A0c(this.A05);
            this.A04.A0c(this.A06);
        }
        this.A08.A0W(0);
        this.A08.A0X(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        k0A02.AEa();
        String[] strArr2 = A0G;
        if (strArr2[4].length() != strArr2[1].length()) {
            String[] strArr3 = A0G;
            strArr3[4] = "NjD77g9sbns6FUonJskLzorZMVzfs";
            strArr3[1] = "sF6jyMJNRDvSJleY8k7g51skJQqlgl";
        } else {
            String[] strArr4 = A0G;
            strArr4[2] = "irNdkufru0tgAA9z3l7YlJhRv0dZK";
            strArr4[0] = "zN5wNlZvELtjdUjcESL7VUEU7ru13";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0590Jw(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
