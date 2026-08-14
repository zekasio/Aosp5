package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0735Pq {
    public final AnonymousClass19 A00;
    public final C1I A01;
    public final C1M A02;
    public final C1U A03;
    public final C0947Xy A04;
    public final C0583Jp A05;
    public static String[] A06 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A09 = (int) (Lr.A00 * 4.0f);
    public static final int A07 = (int) (Lr.A00 * 72.0f);
    public static final int A08 = (int) (Lr.A00 * 8.0f);

    public C0735Pq(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, AnonymousClass18 anonymousClass18) {
        this.A04 = c0947Xy;
        this.A05 = new C0583Jp(anonymousClass18.A0U(), interfaceC0575Jh);
        this.A00 = anonymousClass18.A0N();
        this.A01 = anonymousClass18.A0O().A0E();
        this.A03 = anonymousClass18.A0R();
        this.A02 = anonymousClass18.A0O().A0G();
    }

    private View A00() {
        F9 f9 = new F9(this.A04);
        f9.setLayoutManager(new C1135cB(this.A04, 0, false));
        f9.setAdapter(new C0792Rv(this.A04, this.A02.A00(), A09));
        return f9;
    }

    private View A01(@Nullable T1 t1) {
        C0695Oc c0695Oc = new C0695Oc(this.A04, this.A00.A01(), true, false, false);
        c0695Oc.A01(this.A01.A06(), this.A01.A01(), null, false, true);
        c0695Oc.setAlignment(17);
        OW ow = new OW(this.A04);
        MS.A0M(ow, 0);
        ow.setRadius(50);
        new T3(ow, this.A04).A04().A07(this.A03.A01());
        LinearLayout linearLayout = new LinearLayout(this.A04);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A07;
        linearLayout.addView(ow, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(c0695Oc, layoutParams);
        if (t1 != null) {
            MS.A0J(t1);
            linearLayout.addView(t1, layoutParams);
            if (TextUtils.isEmpty(t1.getText())) {
                MS.A0H(t1);
            }
        }
        return linearLayout;
    }

    private final EnumC0734Pp A02() {
        if (!this.A02.A00().isEmpty()) {
            return EnumC0734Pp.A04;
        }
        EnumC0734Pp enumC0734Pp = EnumC0734Pp.A03;
        String[] strArr = A06;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A06[4] = "qwlEjiYhEcV8j1J";
        return enumC0734Pp;
    }

    public final Pair<EnumC0734Pp, View> A03(@Nullable T1 t1) {
        View viewA00;
        EnumC0734Pp enumC0734PpA02 = A02();
        if (C0733Po.A00[enumC0734PpA02.ordinal()] != 1) {
            viewA00 = A01(t1);
        } else {
            viewA00 = A00();
        }
        C0585Jr.A04(viewA00, this.A05, EnumC0582Jo.A0S);
        return new Pair<>(enumC0734PpA02, viewA00);
    }
}
