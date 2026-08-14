package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q3 extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};

    @Nullable
    public C02987m A00;
    public WeakReference<Q2> A01;
    public final InterfaceC0762Qr A02;

    public Q3(C0947Xy c0947Xy, InterfaceC0762Qr interfaceC0762Qr) {
        super(c0947Xy);
        this.A02 = interfaceC0762Qr;
        MS.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(NQ nq) {
        addView(nq, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C02987m) nq;
    }

    public final void A01(NQ nq) {
        MS.A0J(nq);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A86();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C02987m c02987m = this.A00;
        if (c02987m != null) {
            c02987m.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Q3.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(Q2 q2) {
        this.A01 = new WeakReference<>(q2);
    }
}
