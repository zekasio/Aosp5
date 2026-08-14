package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0787Rq extends FrameLayout implements InterfaceC0740Pv {

    @Nullable
    public TextView A00;

    @Nullable
    public TextView A01;

    @Nullable
    public TextView A02;

    @Nullable
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C0741Pw A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"LrUXeZd5oXG5wJ7", "S6ePTdxfK6c7yhvbHMQjZqIgQsLDz3QO", "YqVXoEdDoNpK3nL0El5", "Exhg7LXIw6HgSAmcccR052cOKtX3WF", "LN", "59F20xOEewuTmZzPatOKMeF6XI6ZvB1j", "IRBrDKvf2o0dBHWjf99N02m12yrR0Bg7", "KZ90h8EmVWfLUNKv0pT"};
    public static final int A0E = (int) (Lr.A00 * 6.0f);
    public static final int A0D = (int) (Lr.A00 * 8.0f);
    public static final int A0C = (int) (Lr.A00 * 12.0f);
    public static final int A0A = (int) (Lr.A00 * 350.0f);
    public static final int A09 = (int) (Lr.A00 * 250.0f);
    public static final int A0B = (int) (Lr.A00 * 175.0f);

    public C0787Rq(C0947Xy c0947Xy, NativeAd nativeAd, K7 k7, K8 k8, OW ow, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c0947Xy);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C0741Pw(c0947Xy, this.A05, k7, ow, adOptionsView);
        C0741Pw c0741Pw = this.A06;
        int i = A0C;
        c0741Pw.setPadding(i, i, i, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (k8 == K8.A09 || k8 == K8.A0B) {
            A07(k7);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (k8 != K8.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(k7);
            A04(k7);
            A05(k7);
        }
        this.A07.add(ow);
        this.A07.add(mediaView);
    }

    private int A00() {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        TextView textView = this.A03;
        int titleHeight = 0;
        if (textView != null && textView.getVisibility() == 0) {
            measuredHeight = this.A03.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        TextView textView2 = this.A02;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[6] = "SrhbzBCrZmwJCsE1GN19GBhRpshhKBl4";
        strArr[5] = "lZXGEU0s5y97LRskCQS4IC0Q6rEMlB8o";
        if (textView2 != null && textView2.getVisibility() == 0) {
            measuredHeight2 = this.A02.getMeasuredHeight();
        } else {
            measuredHeight2 = 0;
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            measuredHeight3 = this.A00.getMeasuredHeight();
        } else {
            measuredHeight3 = 0;
        }
        TextView textView4 = this.A01;
        if (A08[1].charAt(0) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[6] = "nRuc5lutSXPKh9f7kKzdW2kIhLu3nB9m";
        strArr2[5] = "FuxAmHJZMOFMUG38wB3yXnFuBZuRMBRE";
        if (textView4 != null) {
            int subtitleHeight = textView4.getVisibility();
            if (subtitleHeight == 0) {
                int titleHeight2 = this.A01.getMeasuredHeight();
                int subtitleHeight2 = A0C;
                int titleHeight3 = titleHeight2 + subtitleHeight2;
                int subtitleHeight3 = A0D;
                titleHeight = titleHeight3 + subtitleHeight3;
            }
        }
        int measuredHeight4 = getMeasuredHeight();
        int ctaHeight = this.A06.getMeasuredHeight();
        return ((((measuredHeight4 - ctaHeight) - measuredHeight) - measuredHeight2) - measuredHeight3) - titleHeight;
    }

    private void A01() {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setLines(1);
        }
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setLines(1);
        }
        TextView textView3 = this.A00;
        if (textView3 != null) {
            textView3.setLines(1);
        }
    }

    private void A02(int i) {
        MS.A0N(this.A04, i > A0B ? 0 : 8);
        MS.A0N(this.A03, i > A0A ? 0 : 8);
        MS.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = MS.A04(textView, i2);
                textView.setLines(iA04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i2 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(K7 k7) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            k7.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            TextView textView = this.A00;
            int i = A0C;
            textView.setPadding(i, 0, i, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(K7 k7) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            MS.A0K(this.A01);
            k7.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            TextView textView = this.A01;
            int i = A0D;
            textView.setPadding(i, i, i, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int i2 = A0D;
            layoutParams.setMargins(i2, 0, i2, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(K7 k7) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            k7.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            TextView textView = this.A02;
            int i = A0C;
            textView.setPadding(i, A0D, i, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(K7 k7) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            k7.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            TextView textView = this.A03;
            int i = A0C;
            textView.setPadding(i, 0, i, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0741Pw c0741Pw = this.A06;
        c0741Pw.layout(i, i2, i3, c0741Pw.getMeasuredHeight() + i2);
        int measuredHeight = i2 + this.A06.getMeasuredHeight();
        TextView textView = this.A03;
        if (textView != null && textView.getVisibility() == 0) {
            int measuredHeight2 = this.A03.getMeasuredHeight();
            this.A03.layout(i, measuredHeight, i3, measuredHeight + measuredHeight2);
            measuredHeight += measuredHeight2;
        }
        MediaView mediaView = this.A04;
        mediaView.layout(i, measuredHeight, i3, mediaView.getMeasuredHeight() + measuredHeight);
        int measuredHeight3 = measuredHeight + this.A04.getMeasuredHeight();
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.layout(i, measuredHeight3, i3, textView2.getMeasuredHeight() + measuredHeight3);
            measuredHeight3 += this.A02.getMeasuredHeight();
        }
        TextView textView3 = this.A00;
        if (textView3 != null && textView3.getVisibility() == 0) {
            TextView textView4 = this.A00;
            if (A08[1].charAt(0) == 'k') {
                throw new RuntimeException();
            }
            A08[3] = "gjv6mmFqHT0";
            textView4.layout(i, measuredHeight3, i3, textView4.getMeasuredHeight() + measuredHeight3);
        }
        TextView textView5 = this.A01;
        if (textView5 != null) {
            int i5 = A0C + i;
            int measuredHeight4 = i4 - textView5.getMeasuredHeight();
            int i6 = A0C;
            textView5.layout(i5, measuredHeight4 - i6, i3 - i6, i4 - i6);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        A02(View.MeasureSpec.getSize(i2));
        A01();
        super.onMeasure(i, i2);
        int iA00 = A00();
        if (this.A04.getMediaWidth() == 0 || this.A04.getMediaHeight() == 0 || ((C1102bd) this.A04.getMediaViewApi()).A0N()) {
            iMin = iA00;
        } else {
            iMin = Math.min((int) (this.A04.getMeasuredWidth() * (this.A04.getMediaHeight() / this.A04.getMediaWidth())), iA00);
        }
        this.A04.measure(i, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        if (iMin < iA00) {
            A03(i, iA00 - iMin, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Pv
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
