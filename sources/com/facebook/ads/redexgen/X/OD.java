package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OD extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public OD(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A03 = new ImageView(c0947Xy);
        this.A02 = new ImageView(c0947Xy);
        A00();
    }

    public OD(C0947Xy c0947Xy, AttributeSet attributeSet) {
        super(c0947Xy, attributeSet);
        this.A03 = new ImageView(c0947Xy, attributeSet);
        this.A02 = new ImageView(c0947Xy, attributeSet);
        A00();
    }

    public OD(C0947Xy c0947Xy, AttributeSet attributeSet, int i) {
        super(c0947Xy, attributeSet, i);
        this.A03 = new ImageView(c0947Xy, attributeSet, i);
        this.A02 = new ImageView(c0947Xy, attributeSet, i);
        A00();
    }

    @TargetApi(21)
    public OD(C0947Xy c0947Xy, AttributeSet attributeSet, int i, int i2) {
        super(c0947Xy, attributeSet, i, i2);
        this.A03 = new ImageView(c0947Xy, attributeSet, i, i2);
        this.A02 = new ImageView(c0947Xy, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        EnumC0637Lw.A04(this.A03, EnumC0637Lw.A0A);
        setId(MS.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int blurBorderViewWidth, int blurBorderViewHeight, int expectedImageHeight, int i) {
        int i2;
        int i3 = this.A01;
        if (i3 <= 0 || (i2 = this.A00) <= 0) {
            super.onLayout(z, blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i);
            return;
        }
        int i4 = expectedImageHeight - blurBorderViewWidth;
        int i5 = i - blurBorderViewHeight;
        float fMin = Math.min(i4 / i3, i5 / i2);
        int i6 = (int) (this.A01 * fMin);
        int i7 = (int) (this.A00 * fMin);
        this.A02.layout(blurBorderViewWidth, blurBorderViewHeight, expectedImageHeight, i);
        int i8 = (i4 / 2) + blurBorderViewWidth;
        int i9 = (i5 / 2) + blurBorderViewHeight;
        int centerY = i6 / 2;
        int i10 = i8 - centerY;
        int centerY2 = i7 / 2;
        int centerY3 = i7 / 2;
        this.A03.layout(i10, i9 - centerY2, (i6 / 2) + i8, i9 + centerY3);
        this.A02.setVisibility(0);
    }

    public void setImage(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        if (bitmap2 != null) {
            MS.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            MS.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
