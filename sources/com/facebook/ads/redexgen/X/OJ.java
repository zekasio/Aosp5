package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OJ extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C0947Xy A02;
    public final T1 A03;
    public final OW A04;

    public abstract void A0A(int i);

    public OJ(C0947Xy c0947Xy, int i, C1K c1k, boolean z, String str, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, C0767Qw c0767Qw, MK mk) {
        super(c0947Xy);
        MS.A0K(this);
        this.A02 = c0947Xy;
        this.A00 = i;
        this.A04 = new OW(c0947Xy);
        MS.A0M(this.A04, 0);
        MS.A0K(this.A04);
        this.A03 = new T1(c0947Xy, str, c1k, z, interfaceC0575Jh, interfaceC0657Mq, c0767Qw, mk);
        MS.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c0947Xy);
        this.A01.setLayoutParams(A05);
        MS.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final T1 getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable OM om) {
        this.A03.setCta(c1l, str, new HashMap(), om);
        T3 t3 = new T3(this.A04, this.A02);
        int i = this.A00;
        t3.A05(i, i).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
