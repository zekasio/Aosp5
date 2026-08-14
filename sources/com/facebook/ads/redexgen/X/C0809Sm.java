package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0809Sm extends AbstractC0698Of {

    @Nullable
    public static C0809Sm A0S;
    public static byte[] A0T;
    public static String[] A0U = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass18 A0A;
    public C0685Ns A0B;
    public C0686Nt A0C;

    @Nullable
    public TE A0D;
    public C0702Oj A0E;
    public C0709Oq A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final View A0M;
    public final AbstractC01180f A0N;
    public final C0583Jp A0O;
    public final OT A0P;
    public final OU A0Q;
    public final C0565Ix A0R;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0T, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A0T = new byte[]{36};
    }

    static {
        A0K();
        A0X = (int) (Lr.A00 * 26.0f);
        A0V = (int) (Lr.A00 * 4.0f);
        A0Z = (int) (Lr.A00 * 8.0f);
        A0W = C2U.A01(-1, 77);
        A0Y = (int) (Lr.A00 * 12.0f);
        A0S = null;
    }

    public C0809Sm(C0702Oj c0702Oj) {
        super(c0702Oj, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0E = c0702Oj;
        this.A0A = this.A0E.A04();
        this.A0O = new C0583Jp(c0702Oj.A04().A0U(), c0702Oj.A06());
        this.A0R = this.A0E.A0A();
        C0565Ix c0565Ix = this.A0R;
        if (c0565Ix != null) {
            MS.A0K(c0565Ix);
        }
        this.A0M = this.A0E.A03();
        this.A0N = C01190g.A01(c0702Oj.A05(), c0702Oj.A06(), c0702Oj.A04().A0U(), C0617La.A00(c0702Oj.A04().A0O().A0F().A05()), new HashMap(), false, true);
        C0696Od.A00(c0702Oj.A05(), this, c0702Oj.A04().A0O().A0D().A07());
        setupLayoutConfiguration(false);
        A0G();
        A0C();
        postDelayed(new C0815Ss(this), 1000L);
        A0J();
        this.A0P = new C0814Sr(this);
        this.A0Q = new OU(c0702Oj, this.A0A, this.A0E.A02() instanceof QK ? (QK) this.A0E.A02() : null, this.A0E.A09(), this.A0P, this.A09, this.A0F, this.A0R, this.A0M);
    }

    private void A0B() {
        MS.A0J(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        MS.A0R(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0C() {
        MS.A0J(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        MS.A0K(this.A07);
        A0H();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0D() {
        View view = this.A0M;
        if (view != null) {
            MS.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0698Of.A09, AbstractC0698Of.A09);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0698Of.A08, this.A05, AbstractC0698Of.A08, AbstractC0698Of.A08);
            addView(this.A0M, layoutParams);
        }
    }

    private void A0E() {
        C0565Ix c0565Ix = this.A0R;
        if (c0565Ix != null) {
            MS.A0J(c0565Ix);
            C0565Ix c0565Ix2 = this.A0R;
            int i = A0Y;
            c0565Ix2.setPadding(i, i, i, i);
            this.A0R.A06(-1, A0W);
            this.A0R.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0X);
            if (this.A0H) {
                layoutParams.addRule(8, this.A06.getId());
            } else {
                String[] strArr = A0U;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0U;
                strArr2[3] = "zjul6o0OG2Ezis8Q";
                strArr2[0] = "LmcEL";
                layoutParams.addRule(12);
            }
            addView(this.A0R, layoutParams);
        }
    }

    private void A0F() {
        AbstractC0656Mp abstractC0656MpA08 = this.A0E.A08();
        if (abstractC0656MpA08 == null) {
            return;
        }
        abstractC0656MpA08.setPageDetailsVisible((this.A0H || abstractC0656MpA08.A05()) ? false : true);
    }

    private void A0G() {
        this.A06 = this.A0E.A02();
        MS.A0J(this.A06);
        MS.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        MS.A0K(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i = A0Z;
        layoutParams2.setMargins(i, i / 2, i, this.A0R == null ? i : A0X);
        addView(this.A09, layoutParams2);
        MS.A0K(this.A09);
        C0702Oj c0702Oj = this.A0E;
        this.A0F = new C0709Oq(c0702Oj, c0702Oj.A04().A0O().A0F().A04(), getColors(), new C0813Sq(this));
        MS.A0G(1001, this.A0F);
        addView(this.A0F);
        A0I();
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.A03 * 4) / 5);
        if (A0e()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.addRule(12);
            LinearLayout linearLayout = this.A07;
            String[] strArr = A0U;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            linearLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A03 + 1, 0, 0);
        }
        this.A07.setTranslationY(0.0f);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0I() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A09.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A0J() {
        A0E();
        A0D();
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str) {
        TE te;
        MS.A0J(this.A0D);
        C0811So c0811So = new C0811So(this);
        if (this.A0E.A05().A0C() == null) {
            this.A0E.A05().A0D().A88();
        }
        if (JS.A02(this.A0E.A05()) || this.A0E.A05().A0C() == null) {
            te = new TE(this.A0E.A05(), c0811So);
        } else {
            te = new TE(this.A0E.A05(), this.A0E.A05().A0C(), c0811So);
        }
        this.A0D = te;
        setUpBrowserControls(this.A0D);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        int i2;
        long j;
        int i3;
        this.A0H = z;
        postDelayed(new C0810Sn(this, z), 250L);
        ObjectAnimator ctaTransAnim = null;
        String strA0A = A0A(0, 1, 39);
        if (z) {
            C0709Oq c0709Oq = this.A0F;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0709Oq, strA0A, c0709Oq.getY(), this.A03 / 5);
        } else {
            objectAnimatorOfFloat = null;
        }
        LinearLayout linearLayout = this.A07;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i4 = this.A03;
        if (z) {
            i4 /= 5;
        }
        fArr[1] = i4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0A, fArr);
        objectAnimatorOfFloat2.setDuration(500L);
        int i5 = (this.A03 / 2) - (this.A01 / 2);
        View view = this.A06;
        float[] fArr2 = new float[2];
        fArr2[0] = view.getY();
        fArr2[1] = (z || this.A0G) ? 0.0f : i5;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, strA0A, fArr2);
        browserTransAnim.setDuration(500L);
        C0565Ix c0565Ix = this.A0R;
        int height = c0565Ix == null ? 0 : c0565Ix.getHeight();
        if (z) {
            int i6 = this.A02;
            String[] strArr = A0U;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0U;
                strArr2[7] = "g83HcTndNM";
                strArr2[4] = "KO02it";
                i = (i6 / 5) - height;
            }
            throw new RuntimeException();
        }
        i = (this.A03 - A0X) - A0Z;
        C0565Ix c0565Ix2 = this.A0R;
        if (c0565Ix2 != null) {
            float[] fArr3 = new float[2];
            fArr3[0] = c0565Ix2.getY();
            String[] strArr3 = A0U;
            if (strArr3[6].length() == strArr3[1].length()) {
                A0U[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                fArr3[1] = i;
                ctaTransAnim = ObjectAnimator.ofFloat(c0565Ix2, strA0A, fArr3);
            }
            throw new RuntimeException();
        }
        int[] iArr = new int[2];
        iArr[0] = this.A06.getHeight();
        if (z) {
            i2 = this.A03 / 5;
        } else {
            i2 = this.A01;
        }
        iArr[1] = i2;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new C0705Om(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            j = 500;
            objectAnimatorOfFloat.setDuration(500L);
            i3 = 1;
            animatorSet.playTogether(objectAnimatorOfFloat);
        } else {
            j = 500;
            i3 = 1;
        }
        if (ctaTransAnim != null) {
            ctaTransAnim.setDuration(j);
            Animator[] animatorArr = new Animator[i3];
            animatorArr[0] = ctaTransAnim;
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new C0706On(this, z));
        animatorSet.start();
    }

    private void A0Q(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        MS.A0J(this.A06);
        this.A06 = this.A0E.A02();
        MS.A0K(this.A06);
        if (this.A0H) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A03 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0C();
        }
        this.A06.setTranslationY(0.0f);
        String[] strArr = A0U;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0U;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A06, 1, layoutParams);
        A0B();
        A0I();
    }

    private boolean A0R() {
        if (this.A0A.A0O().A0D().A0A()) {
            boolean z = this.A0J;
            String[] strArr = A0U;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z && !this.A0L && !this.A0K) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0W() {
        super.A0W();
        A0S = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0X() {
        AbstractC0656Mp abstractC0656MpA08 = this.A0E.A08();
        if (abstractC0656MpA08 != null) {
            abstractC0656MpA08.setPageDetailsVisible((A0e() || abstractC0656MpA08.A05()) ? false : true);
        }
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0Y() {
        if (this.A0E.A08() != null) {
            AbstractC0656Mp abstractC0656MpA08 = this.A0E.A08();
            String[] strArr = A0U;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            abstractC0656MpA08.setPageDetailsVisible(false);
        }
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0Z() {
        this.A0K = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0a() {
        this.A0K = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        String strA05 = c1b.A0E().A05();
        if (strA05 == null || strA05.trim().length() == 0) {
            MS.A0N(this.A08, 8);
        } else {
            this.A09.setText(strA05);
        }
        if (d > 0.0d) {
            this.A01 = (int) (((double) this.A04) / d);
        }
        this.A01 = this.A0G ? this.A02 : this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public final boolean A0d(boolean z) {
        if (A0e()) {
            A0P(false);
            return true;
        }
        if (!A0R()) {
            return false;
        }
        this.A0Q.A07(this);
        return true;
    }

    public final boolean A0e() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0e()) {
            return 3;
        }
        if (this.A0K) {
            return 2;
        }
        if (this.A0A.A0O().A0D().A0A()) {
            return 1;
        }
        if (!this.A0J) {
            return super.getCloseButtonStyle();
        }
        if (A0U[5].charAt(10) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0U;
        strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
        strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
        return 4;
    }

    private String getUrl() {
        return this.A0E.A04().A0O().A0F().A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0Q(A0e());
        A0J();
        setupLayoutConfiguration(A0e());
        A0H();
    }

    private void setUpBrowserControls(TE te) {
        MS.A0J(this.A0B);
        this.A0B = new C0685Ns(this.A0E.A05(), te);
        te.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        MS.A0K(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C0812Sp(this));
        this.A0B.setOnTouchListener(new ViewOnTouchListenerC0704Ol(this));
        this.A07.addView(this.A0B, layoutParams);
        MS.A0J(this.A0C);
        this.A0C = new C0686Nt(this.A0E.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0V));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0G = getResources().getConfiguration().orientation == 2;
        this.A05 = this.A0E.A08() == null ? 0 : this.A0E.A08().getToolbarHeight();
        this.A0H = z;
        this.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.A03 = this.A02 + (this.A0G ? 0 : this.A05);
        this.A01 = this.A02;
    }
}
