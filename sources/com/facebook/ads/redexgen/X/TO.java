package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
@TargetApi(16)
public final class TO extends RelativeLayout implements InterfaceC0658Mr {
    public static byte[] A0W;
    public static String[] A0X = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final RelativeLayout.LayoutParams A0h;

    @Nullable
    public View A00;

    @Nullable
    public RelativeLayout A01;

    @Nullable
    public RelativeLayout A02;
    public Toast A03;

    @Nullable
    public AnonymousClass59 A04;

    @Nullable
    public T1 A05;
    public C0730Pl A06;
    public C0736Pr A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass18 A0D;
    public final C1W A0E;
    public final AnonymousClass57 A0F;
    public final C0947Xy A0G;
    public final InterfaceC0575Jh A0H;
    public final C0583Jp A0I;
    public final C0628Ll A0J;
    public final MF A0K;
    public final InterfaceC0657Mq A0L;
    public final NI A0M;
    public final OT A0N;
    public final OU A0O;
    public final C0735Pq A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    @VisibleForTesting
    public final AbstractC0656Mp A0V;

    public static String A0E(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0W = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, Ascii.CR, 10, 4, Ascii.FF, 0, Ascii.DLE, 19, 10, 8, 10, Ascii.SI, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, -6, -19, 0, -11, 2, -15, -21, -17, -8, -11, -17, -9, -53, -57, -68, -66, -64, -56, -64, -55, -49, -41, -54, -36, -58, -41, -55, -54, -55, -60, -37, -50, -55, -54, -44, -60, -78, -81, -61, -74, -78, -60, -84, -80, -71, -74, -80, -72};
    }

    static {
        A0P();
        A0f = (int) (Lr.A00 * 64.0f);
        A0a = (int) (Lr.A00 * 16.0f);
        A0g = (int) (Lr.A00 * 12.0f);
        A0Y = (int) (Lr.A00 * 10.0f);
        A0h = new RelativeLayout.LayoutParams(-1, -1);
        A0b = (int) (Lr.A00 * 48.0f);
        A0c = (int) (Lr.A00 * 16.0f);
        A0e = (int) (Lr.A00 * 14.0f);
        A0d = C2U.A01(-1, 77);
        A0Z = (int) (Lr.A00 * 8.0f);
    }

    public TO(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, AnonymousClass18 anonymousClass18, @Nullable String str, NI ni) {
        int iA07;
        super(c0947Xy);
        this.A0F = new TV(this);
        this.A0R = new AtomicBoolean(false);
        this.A0Q = new AtomicBoolean(false);
        this.A0A = false;
        this.A0C = true;
        this.A0G = c0947Xy;
        this.A0L = interfaceC0657Mq;
        this.A0H = interfaceC0575Jh;
        this.A0D = anonymousClass18;
        this.A0E = anonymousClass18.A0O().A0D().A06();
        this.A0I = new C0583Jp(this.A0D.A0U(), this.A0H);
        this.A0M = ni;
        this.A07 = new C0736Pr(c0947Xy, this.A0M, str, this.A0L);
        this.A09 = this.A0D.A0O().A0M() && this.A0D.A0O().A0D().A02() > 0;
        this.A0U = this.A0D.A0O().A0D().A0A();
        if (this.A0E == null) {
            this.A0L.A3s(this.A0M.A6Z());
            this.A0L.A3s(this.A0M.A6U());
        }
        if (this.A09 && this.A0U) {
            iA07 = this.A0D.A0O().A0D().A02();
        } else {
            iA07 = this.A0E.A07();
        }
        this.A0R.set(!this.A0E.A0I());
        TV tv = null;
        this.A0J = new C0628Ll(iA07, new TQ(this, tv));
        this.A0T = JR.A23(this.A0G);
        this.A0S = JR.A0i(this.A0G);
        this.A0V = A06();
        this.A0P = new C0735Pq(this.A0G, this.A0H, this.A0D);
        if (!this.A0T) {
            MS.A0M(this, -14473425);
        } else {
            C0696Od.A00(c0947Xy, this, anonymousClass18.A0O().A0D().A07());
        }
        this.A0K = new MF(this);
        this.A0K.A05(ME.A03);
        if (JR.A1X(this.A0G)) {
            this.A0V.setProgressSpinnerInvisible(true);
        }
        HashMap map = new HashMap();
        map.put(A0E(44, 9, 51), this.A0M.A7C());
        this.A06 = new C0730Pl(this.A0G, this.A0D, this.A0E, this.A0H, new TP(this, tv), map);
        A0L();
        this.A0L.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        this.A0N = new TU(this);
        this.A0O = new OU(this.A0G, this.A0V, this.A0D, (QK) null, this.A0L, this.A0N, this.A05, this.A01, this.A06);
    }

    private AbstractC0656Mp A06() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0G, this.A0L, this.A0I, 0, this.A0D.A0F());
        fullScreenAdToolbar.A04(this.A0D.A0N().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0D.A0R(), this.A0D.A0U(), this.A0E.A07(), this.A0D.A0S());
        fullScreenAdToolbar.setToolbarListener(new TS(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private T1 A09() {
        C0730Pl c0730Pl = this.A06;
        if (c0730Pl == null || c0730Pl.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        T1 t1 = new T1(this.A0G, this.A0M.A64(), this.A0D.A0N().A01(), this.A0H, this.A0L, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        MS.A0K(t1);
        t1.setText(this.A0D.A0O().A0F().A04());
        t1.setTextSize(14.0f);
        t1.setIncludeFontPadding(false);
        int i = A0Y;
        t1.setPadding(i, i, i, i);
        if (!this.A0T) {
            MS.A0N(t1, 8);
        }
        t1.setOnClickListener(new N1(this));
        return t1;
    }

    private C0695Oc A0C() {
        C0695Oc c0695Oc = new C0695Oc(this.A0G, this.A0D.A0N().A01(), true, 16, 14, 0);
        c0695Oc.A01(this.A0D.A0O().A0E().A06(), this.A0D.A0O().A0E().A05(), null, false, true);
        TextView descriptionTextView = c0695Oc.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView titleTextView = c0695Oc.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        return c0695Oc;
    }

    private void A0H() {
        int i = A0b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        OW ow = new OW(this.A0G);
        MS.A0M(ow, 0);
        MS.A0K(ow);
        T3 t3 = new T3(ow, this.A0G);
        int i2 = A0b;
        t3.A05(i2, i2).A07(this.A0D.A0R().A01());
        TextView ratingCountView = new TextView(this.A0G);
        MS.A0K(ratingCountView);
        ratingCountView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ratingCountView.setTextColor(this.A0D.A0N().A01().A06(true));
        ratingCountView.setText(this.A0D.A0O().A0E().A06());
        ratingCountView.setTextSize(16.0f);
        ratingCountView.setMaxLines(1);
        ratingCountView.setEllipsize(TextUtils.TruncateAt.END);
        OY oy = new OY(this.A0G, A0e, 5, A0d, -1);
        oy.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView = new TextView(this.A0G);
        textView.setTextColor(this.A0D.A0N().A01().A06(true));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0Z;
        LinearLayout linearLayout = new LinearLayout(this.A0G);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0c);
        layoutParams4.topMargin = A0Z / 2;
        layoutParams4.addRule(3, ratingCountView.getId());
        linearLayout.addView(oy, layoutParams2);
        linearLayout.addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0Z;
        layoutParams5.addRule(1, ow.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(ratingCountView);
        RelativeLayout titleAndRatingContainer = this.A02;
        if (titleAndRatingContainer != null) {
            titleAndRatingContainer.removeAllViews();
            RelativeLayout relativeLayout2 = this.A02;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            A0X[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout2.addView(relativeLayout, layoutParams5);
            this.A02.addView(ow, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0D.A0O().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        oy.setRating(Float.parseFloat(this.A0D.A0O().A0E().A03()));
        if (this.A0D.A0O().A0E().A02() == null) {
            return;
        }
        textView.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0D.A0O().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0E.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A05(ME.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0B = true;
        if (this.A0D.A0O().A0M()) {
            this.A07.A05();
            this.A0L.A3t(this.A0M.A5a(), new AnonymousClass88(0, 0));
            if (this.A08) {
                boolean z = this.A0T;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0X;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    ON.A03(this.A0G, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0D.A0O().A0F(), this.A0D.A0U());
                }
            }
        }
    }

    private void A0K() {
        PR prA0B = new PP(this.A0G, this.A0D.A0O().A0E(), this.A0D.A0R()).A08(this.A0D.A0N().A01()).A0A(this.A0E.A0G()).A09(this.A0E.A0D()).A07(2000).A0B();
        C0585Jr.A04(prA0B, this.A0I, EnumC0582Jo.A0U);
        addView(prA0B, A0h);
        prA0B.A04(new TT(this));
    }

    private void A0L() {
        this.A05 = A09();
        this.A01 = new RelativeLayout(getContext());
        MS.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0a;
        int i2 = A0g;
        layoutParams.setMargins(i, i2, i, i2);
        layoutParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        MS.A0K(this.A02);
        if (this.A0S) {
            A0H();
        } else {
            RelativeLayout relativeLayout = this.A02;
            C0695Oc c0695OcA0C = A0C();
            RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c0695OcA0C, adWebViewParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0a, 0);
        this.A01.addView(this.A02, layoutParams2);
        T1 t1 = this.A05;
        if (t1 != null) {
            layoutParams2.addRule(0, t1.getId());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(6, this.A02.getId());
            layoutParams3.addRule(8, this.A02.getId());
            this.A01.addView(this.A05, layoutParams3);
        }
        MS.A0K(this.A0V);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(10);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        int i3 = A0a;
        layoutParams5.setMargins(i3, 0, i3, 0);
        layoutParams5.addRule(3, this.A0V.getId());
        layoutParams5.addRule(2, this.A01.getId());
        this.A0V.setVisibility(4);
        this.A06.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0V, layoutParams4);
        addView(this.A06, layoutParams5);
        addView(this.A01, layoutParams);
        if (this.A0E.A0J()) {
            this.A06.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C0583Jp(this.A0D.A0U(), this.A0H).A02(EnumC0582Jo.A0r, null);
        this.A0Q.set(true);
        MS.A0T(this);
        MS.A0H(this.A06);
        MS.A0Z(this.A0O, this.A00, this.A06);
        MS.A0L(this.A0V);
        MS.A0L(this.A05);
        Pair<EnumC0734Pp, View> pairA03 = this.A0P.A03(this.A05);
        this.A00 = (View) pairA03.second;
        int i = N2.A00[((EnumC0734Pp) pairA03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                MS.A0Z(relativeLayout);
            }
            ViewGroup.LayoutParams infoParams = new RelativeLayout.LayoutParams(-1, -1);
            addView(this.A00, infoParams);
            return;
        }
        RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
        screenshotParams.setMargins(0, this.A0V.getToolbarHeight(), 0, 0);
        MS.A0L(this.A01);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            screenshotParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, screenshotParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        MS.A0T(this);
        if (!this.A0E.A0J()) {
            C0730Pl c0730Pl = this.A06;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c0730Pl.A0B();
        }
        this.A0V.setVisibility(0);
        this.A06.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.A0J.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0E.A0C(), 1);
        A0Q((int) this.A0J.A03());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        MS.A0Y(this.A03, this.A0E.A0C().replace(A0E(2, 6, 31), String.valueOf(i)), 49, 0, A0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z) {
        HashMap map = new HashMap();
        map.put(A0E(8, 12, 121), z ? A0E(67, 13, 37) : A0E(32, 12, 100));
        ON on = new ON(this.A0G, this.A0M.A64(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0L);
        if (this.A0T) {
            on.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), map);
            return;
        }
        boolean z2 = !this.A0J.A04();
        on.A0A(!z2);
        on.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), map);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new TR(this));
        }
        this.A08 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0D.A0Y().equals(A0E(53, 14, 61))) {
            if (this.A0D.A0Y().equals(A0E(20, 12, 40))) {
                AnonymousClass18 anonymousClass18 = this.A0D;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0X[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (anonymousClass18.A0O().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0U && !this.A0A && !this.A0C && this.A0E.A07() < this.A0D.A0O().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A04 = anonymousClass59;
        this.A04.A0K(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void ABj(boolean z) {
        this.A0J.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AC8(boolean z) {
        if (this.A0U && this.A0C) {
            return;
        }
        boolean z2 = this.A0A;
        if (A0X[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0X[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0R.get() && !this.A0J.A05()) {
            this.A0J.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void onDestroy() {
        this.A0K.A03();
        AnonymousClass59 anonymousClass59 = this.A04;
        if (anonymousClass59 != null) {
            anonymousClass59.A0L(this.A0F);
        }
        if (this.A06 != null) {
            AnonymousClass18 anonymousClass18 = this.A0D;
            if (A0X[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0X[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(anonymousClass18.A0U())) {
                this.A0H.A8v(this.A0D.A0U(), new OG().A03(this.A06.getViewabilityChecker()).A02(this.A06.getTouchDataRecorder()).A05());
            }
            this.A06.A0C();
        }
        this.A0J.A06();
        this.A0V.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AC8(false);
        } else {
            ABj(false);
        }
    }

    public void setListener(InterfaceC0657Mq interfaceC0657Mq) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0736Pr c0736Pr) {
        this.A07 = c0736Pr;
    }
}
