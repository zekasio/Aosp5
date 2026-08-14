package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class C8L extends TW implements InterfaceC0724Pf {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;

    @Nullable
    public RelativeLayout A03;
    public C1200dJ A04;
    public C7U A05;

    @Nullable
    public C2M A06;

    @Nullable
    public OJ A07;

    @Nullable
    public OV A08;

    @Nullable
    public SB A09;

    @Nullable
    @DoNotStrip
    public AbstractC0766Qv A0A;
    public C0767Qw A0B;

    @Nullable
    public String A0C;
    public List<C0719Pa> A0D;
    public final int A0E;
    public final C1K A0F;
    public final C0947Xy A0G;
    public final MK A0H;
    public final InterfaceC0657Mq A0I;
    public final C0702Oj A0J;
    public final C0725Pg A0K;
    public final C0725Pg A0L;
    public final C0565Ix A0M;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = (bArrCopyOfRange[i4] - i3) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            bArrCopyOfRange[i4] = (byte) i5;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, 122, -115, -126, -121, ByteCompanionObject.MIN_VALUE, 57, 124, 122, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, ByteCompanionObject.MIN_VALUE, 121, 52, 119, 117, -122, -125, -119, -121, 121, ByteCompanionObject.MIN_VALUE, 52, 119, 117, -122, 120, 52, 119, 124, 117, -126, 123, 121, 66, 91, 87, 86, -118, 121, 126, 122, -125, 120, 122, 99, 122, -119, -116, -124, -121, ByteCompanionObject.MIN_VALUE, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    static {
        A0B();
        A0Q = (int) (Lr.A00 * 8.0f);
        A0R = (int) (Lr.A00 * 8.0f);
        A0S = (int) (Lr.A00 * 12.0f);
        A0P = (int) (Lr.A00 * 42.0f);
    }

    public C8L(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, C7U c7u, InterfaceC0657Mq interfaceC0657Mq, C1200dJ c1200dJ) {
        super(c0947Xy, interfaceC0575Jh, interfaceC0657Mq, c1200dJ);
        this.A0H = new MK();
        this.A00 = -1;
        this.A05 = c7u;
        this.A0G = c0947Xy;
        this.A0I = interfaceC0657Mq;
        this.A0E = super.A08.A0c().size();
        this.A0M = new C0565Ix(this.A0G);
        this.A0L = new C0725Pg(this.A0G, EnumC0723Pe.A04, this);
        this.A0K = new C0725Pg(this.A0G, EnumC0723Pe.A03, this);
        this.A0J = new C0701Oi(this.A0G, interfaceC0575Jh, getAudienceNetworkListener(), this.A04, null, this.A0B, this.A0H).A0J();
        this.A0F = c1200dJ.A0N().A01();
        if (JR.A1X(this.A0G)) {
            super.A0C.setProgressSpinnerInvisible(true);
        }
    }

    private void A08() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            C0725Pg c0725Pg = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            c0725Pg.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A09() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private void A0A() {
        int iMin;
        int i;
        int childWidth;
        int i2 = getResources().getConfiguration().orientation;
        int i3 = Lr.A01.widthPixels;
        int i4 = Lr.A01.heightPixels;
        if (i2 == 1) {
            int height = A0Q;
            int i5 = i3 - (height * 4);
            int height2 = i4 / 2;
            iMin = Math.min(i5, height2);
            i = (i3 - iMin) / 8;
            childWidth = i * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            iMin = Math.min(i4, i3);
            i = (i3 - iMin) / 2;
            childWidth = i;
            A08();
        }
        C2M c2m = this.A06;
        if (c2m != null) {
            S9 fullscreenCarouselRecyclerViewAdapter = c2m.getFullscreenCarouselRecyclerViewAdapter();
            if (fullscreenCarouselRecyclerViewAdapter != null) {
                fullscreenCarouselRecyclerViewAdapter.A0F(iMin, i, childWidth);
                fullscreenCarouselRecyclerViewAdapter.A07();
                return;
            }
            return;
        }
        Log.e(A06(61, 17, 7), A06(0, 28, 11));
        onDestroy();
    }

    private final void A0C() {
        C2M c2m = this.A06;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A06 = null;
        }
        OV ov = this.A08;
        if (ov != null) {
            ov.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private final void A0D(int i, @Nullable Bundle bundle) {
        boolean z = i == 1;
        this.A03 = new RelativeLayout(getContext());
        this.A07 = new C0820Sx(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == C1G.A05, this.A0F, super.A08.A0O().A0F().A06(), A06(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H);
        this.A07.A0A(z ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new S8(this);
        this.A0B = new C0767Qw(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B.A0W(this.A01);
        this.A0B.A0X(this.A02);
        this.A06 = new C2M(this.A0G);
        MS.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.A09 = new SB(this.A06, i, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new S9(this.A0G, this.A0D, this.A04, super.A0A, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M));
            A0A();
        } else {
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
        }
        A0F(this.A09);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        if (JR.A1I(this.A0G)) {
            InterfaceC0587Jt interfaceC0587JtA09 = this.A0G.A09();
            C2M c2m = this.A06;
            String strA0U = super.A08.A0U();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            interfaceC0587JtA09.AFP(c2m, strA0U, false);
        }
        this.A03.addView(this.A06, layoutParams);
        A09();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A09();
        this.A07.A08();
        this.A03.addView(this.A07, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        int i2 = A0P;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        layoutParams3.setMargins(A0Q, 0, 0, 0);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        int i3 = A0P;
        layoutParams4.width = i3;
        layoutParams4.height = i3;
        layoutParams4.setMargins(0, 0, A0Q, 0);
        this.A03.addView(this.A0K, layoutParams3);
        this.A03.addView(this.A0L, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        this.A03.addView(this.A0M, layoutParams5);
        A0U(this.A03, true, i);
        removeView(findViewById(C0696Od.A00));
        boolean isPortrait = JR.A21(this.A0G);
        if (isPortrait) {
            MS.A0M(this, -1);
        } else {
            C0696Od.A00(this.A0J.A05(), this, this.A04.A0O().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0O().A0E(), this.A04.A0O().A0F(), this.A0C, super.A08.A0R().A01(), null);
        }
    }

    private void A0E(C1200dJ c1200dJ) {
        this.A04 = c1200dJ;
        this.A0C = this.A04.A0U();
        this.A01 = this.A04.A0H();
        this.A02 = this.A04.A0I();
        List<C1B> listA0c = this.A04.A0c();
        this.A0D = new ArrayList(listA0c.size());
        for (int i = 0; i < listA0c.size(); i++) {
            this.A0D.add(new C0719Pa(i, listA0c.size(), listA0c.get(i)));
        }
    }

    private void A0F(SB sb) {
        new FA().A0G(this.A06);
        sb.A0Z(new S7(this));
        this.A08 = new OV(this.A0G, super.A05.A01(), this.A0D.size());
        MS.A0K(this.A08);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TW
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1200dJ c1200dJ = (C1200dJ) intent.getSerializableExtra(A06(78, 14, 48));
        A0V(anonymousClass59);
        if (c1200dJ != null) {
            A0E(c1200dJ);
        }
        A0D(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new S6(this, anonymousClass59));
        int iA03 = super.A08.A0O().A0D().A03();
        if (iA03 > 0) {
            A0T(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void ABj(boolean z) {
        super.ABj(z);
        SB sb = this.A09;
        if (sb != null) {
            sb.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AC8(boolean z) {
        super.AC8(z);
        SB sb = this.A09;
        if (sb != null) {
            sb.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0724Pf
    public final void ACT(EnumC0723Pe enumC0723Pe) {
        int i;
        C2M c2m = this.A06;
        if (c2m != null) {
            C1135cB layoutManager = c2m.getLayoutManager();
            if (enumC0723Pe == EnumC0723Pe.A03) {
                int i2 = this.A00;
                i = i2 <= 0 ? 0 : i2 - 1;
                layoutManager.A21(this.A06, new C02214i(), i);
            } else {
                int i3 = this.A00;
                int i4 = this.A0E;
                i = i3 >= i4 + (-1) ? i4 - 1 : i3 + 1;
                layoutManager.A21(this.A06, new C02214i(), i);
            }
            setUpLayoutForCardAtIndex(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AEI(Bundle bundle) {
        SB sb = this.A09;
        if (sb != null) {
            sb.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AEI(new Bundle());
        super.onConfigurationChanged(configuration);
        A0A();
        C2M c2m = this.A06;
        if (c2m != null && this.A09 != null) {
            c2m.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A09();
        OJ oj = this.A07;
        if (oj != null) {
            oj.A0A(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void onDestroy() {
        super.onDestroy();
        if (JR.A1I(this.A0G)) {
            InterfaceC0587Jt interfaceC0587JtA09 = this.A0G.A09();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            interfaceC0587JtA09.AFF(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0A.A8v(this.A0C, new OG().A03(this.A0B).A02(this.A0H).A05());
        }
        A0C();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setUpLayoutForCardAtIndex(int r12) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.OV r0 = r11.A08
            if (r0 == 0) goto L7
            r0.A00(r12)
        L7:
            com.facebook.ads.redexgen.X.dJ r0 = r11.A04
            com.facebook.ads.redexgen.X.1B r4 = r0.A0P(r12)
            if (r4 == 0) goto L81
            int r0 = r11.A00
            if (r0 == r12) goto L81
            r11.A00 = r12
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L25
            r11.A08()
        L25:
            int r0 = com.facebook.ads.redexgen.X.C0696Od.A00
            android.view.View r0 = r11.findViewById(r0)
            r11.removeView(r0)
            com.facebook.ads.redexgen.X.Xy r0 = r11.A0G
            boolean r0 = com.facebook.ads.redexgen.X.JR.A21(r0)
            if (r0 == 0) goto La3
            r0 = -1
            com.facebook.ads.redexgen.X.MS.A0M(r11, r0)
        L3a:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.OJ r5 = r11.A07
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C8L.A0O
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C8L.A0O
            java.lang.String r1 = "kFih28rpO37RepskuaJrvvoNb65qRIkh"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L8a
        L58:
            r2 = 61
            r1 = 17
            r0 = 7
            java.lang.String r3 = A06(r2, r1, r0)
            r2 = 28
            r1 = 33
            r0 = 6
            java.lang.String r0 = A06(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L6d:
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.Ix r1 = r11.A0M
            r0 = 0
            r1.setVisibility(r0)
        L81:
            return
        L82:
            com.facebook.ads.redexgen.X.Ix r1 = r11.A0M
            r0 = 8
            r1.setVisibility(r0)
            goto L81
        L8a:
            com.facebook.ads.redexgen.X.1I r6 = r4.A0E()
            com.facebook.ads.redexgen.X.1L r7 = r4.A0F()
            java.lang.String r8 = r11.A0C
            com.facebook.ads.redexgen.X.dJ r0 = r11.A08
            com.facebook.ads.redexgen.X.1U r0 = r0.A0R()
            java.lang.String r9 = r0.A01()
            r10 = 0
            r5.setInfo(r6, r7, r8, r9, r10)
            goto L6d
        La3:
            com.facebook.ads.redexgen.X.Oj r0 = r11.A0J
            com.facebook.ads.redexgen.X.Xy r1 = r0.A05()
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A07()
            com.facebook.ads.redexgen.X.C0696Od.A00(r1, r11, r0)
            goto L3a
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8L.setUpLayoutForCardAtIndex(int):void");
    }
}
