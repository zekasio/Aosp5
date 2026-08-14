package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f681a;
    private a b;
    private float c;
    private int d;

    public interface a {
        void a(float f, float f2, boolean z);
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f681a = new b();
    }

    public void setAspectRatio(float f) {
        if (this.c != f) {
            this.c = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
        this.b = aVar;
    }

    public int getResizeMode() {
        return this.d;
    }

    public void setResizeMode(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.c / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f681a.a(this.c, f5, false);
            return;
        }
        int i3 = this.d;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.c;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.c;
                    } else {
                        f2 = this.c;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.c;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.c;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.c;
            measuredWidth = (int) (f4 * f);
        }
        this.f681a.a(this.c, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    private final class b implements Runnable {
        private float b;
        private float c;
        private boolean d;
        private boolean e;

        private b() {
        }

        public void a(float f, float f2, boolean z) {
            this.b = f;
            this.c = f2;
            this.d = z;
            if (this.e) {
                return;
            }
            this.e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.e = false;
            if (AspectRatioFrameLayout.this.b == null) {
                return;
            }
            AspectRatioFrameLayout.this.b.a(this.b, this.c, this.d);
        }
    }
}
