package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0788Rr extends LinearLayout implements InterfaceC0740Pv {
    public final NativeBannerAd A00;
    public final C0947Xy A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (Lr.A00 * 42.0f);
    public static final int A03 = (int) (Lr.A00 * 48.0f);
    public static final int A05 = (int) (Lr.A00 * 54.0f);
    public static final int A07 = (int) (Lr.A00 * 4.0f);
    public static final int A06 = (int) (Lr.A00 * 8.0f);

    public C0788Rr(C0947Xy c0947Xy, NativeBannerAd nativeBannerAd, K7 k7, K8 k8, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super(c0947Xy);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c0947Xy;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(k8);
        OX ox = new OX(this.A01);
        ox.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams3.gravity = 16;
        ox.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(ox, layoutParams3);
        C0737Ps c0737Ps = new C0737Ps(c0947Xy, this.A00, k8, k7, adOptionsView);
        c0737Ps.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c0737Ps, layoutParams4);
        if (k8 == K8.A0A) {
            int iconSize = A07;
            setPadding(iconSize, iconSize, iconSize, iconSize);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int iconSize2 = A06;
            setPadding(iconSize2, iconSize2, iconSize2, iconSize2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i = A06;
        int iconSize3 = A07;
        textView.setPadding(i, iconSize3, i, iconSize3);
        k7.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(K8 k8) {
        int i = C0738Pt.A00[k8.ordinal()];
        if (i == 1) {
            return A04;
        }
        if (i != 2) {
            return A05;
        }
        return A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
