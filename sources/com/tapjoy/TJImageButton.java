package com.tapjoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
public class TJImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f1681a;
    public Bitmap b;

    public TJImageButton(Context context) {
        super(context);
    }

    public void setDisableImageBitmap(Bitmap bitmap) {
        this.b = bitmap;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setImageBitmap(z ? this.f1681a : this.b);
    }

    public void setEnabledImageBitmap(Bitmap bitmap) {
        this.f1681a = bitmap;
    }

    public TJImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
