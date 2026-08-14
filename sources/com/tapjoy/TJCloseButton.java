package com.tapjoy;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.vungle.warren.AdLoader;

/* JADX INFO: loaded from: classes2.dex */
public class TJCloseButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClosePosition f1659a;
    public boolean b;
    public boolean c;

    public enum ClosePosition {
        TOP_LEFT(new int[]{10, 9}),
        TOP_CENTER(new int[]{10, 14}),
        TOP_RIGHT(new int[]{10, 11}),
        CENTER(new int[]{13}),
        BOTTOM_LEFT(new int[]{12, 9}),
        BOTTOM_CENTER(new int[]{12, 14}),
        BOTTOM_RIGHT(new int[]{12, 11});


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RelativeLayout.LayoutParams f1660a;

        ClosePosition(int[] iArr) {
            double deviceScreenDensityScale = TapjoyConnectCore.getDeviceScreenDensityScale();
            Double.isNaN(deviceScreenDensityScale);
            int i = (int) (deviceScreenDensityScale * 75.0d);
            double deviceScreenDensityScale2 = TapjoyConnectCore.getDeviceScreenDensityScale();
            Double.isNaN(deviceScreenDensityScale2);
            this.f1660a = new RelativeLayout.LayoutParams(i, (int) (deviceScreenDensityScale2 * 75.0d));
            for (int i2 : iArr) {
                this.f1660a.addRule(i2);
            }
            int deviceScreenDensityScale3 = (int) (TapjoyConnectCore.getDeviceScreenDensityScale() * (-10.0f));
            this.f1660a.setMargins(0, deviceScreenDensityScale3, deviceScreenDensityScale3, 0);
        }

        public RelativeLayout.LayoutParams a() {
            return this.f1660a;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.tapjoy.TJCloseButton$a$a, reason: collision with other inner class name */
        public class C0101a implements Animator.AnimatorListener {
            public C0101a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                TJCloseButton tJCloseButton = TJCloseButton.this;
                tJCloseButton.setClickable(tJCloseButton.b);
                TJCloseButton.this.c = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TJCloseButton tJCloseButton = TJCloseButton.this;
                tJCloseButton.setClickable(tJCloseButton.b);
                TJCloseButton.this.c = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCloseButton.this.animate().alpha(1.0f).setDuration(500L).setListener(new C0101a());
        }
    }

    public TJCloseButton(Context context) {
        this(context, ClosePosition.TOP_RIGHT);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        setAlpha(0.0f);
        setVisibility(0);
        this.c = true;
        setClickable(false);
        new Handler().postDelayed(new a(), AdLoader.RETRY_DELAY);
    }

    public void setClickableRequested(boolean z) {
        this.b = z;
        if (this.c) {
            return;
        }
        setClickable(z);
    }

    public TJCloseButton(Context context, ClosePosition closePosition) {
        super(context);
        this.b = true;
        this.f1659a = closePosition;
        setImageBitmap(TapjoyIcons.getCloseCircularImage(new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale()));
        setScaleType(ImageView.ScaleType.FIT_XY);
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        setLayoutParams(this.f1659a.a());
    }
}
