package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "WrongCall", "RethrownThrowableArgument"})
public final class L9 extends View {
    public static String[] A00 = {"kAVfBRgsuHAPyLthoP", "", "t17O26GbxI", "rw", "AAEx162laq7qeqX9thcQ", "HAXhrl7a7PCZ9u3oTFWkwwhVB4A5", "GFzV2eDHhD", "HOPUDh1leN9OTkJ3x1a"};
    public static final AtomicBoolean A01 = new AtomicBoolean();

    private final void A00() {
        super.onAttachedToWindow();
    }

    private final void A01() {
        super.onDetachedFromWindow();
    }

    private final void A02() {
        super.onFinishInflate();
    }

    private final void A03(int i) {
        super.onWindowVisibilityChanged(i);
    }

    private final void A04(int i, int i2) {
        super.onMeasure(i, i2);
    }

    private final void A05(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    private final void A06(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A07(Throwable th) {
        LF.A00().A8p(3303, th);
    }

    public static void A08(boolean z) {
        A01.set(z);
    }

    private final void A09(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private final void A0A(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private final void A0B(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    private final boolean A0C() {
        return super.performClick();
    }

    private final boolean A0D(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    private final boolean A0E(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    private final boolean A0F(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        try {
            A00();
        } catch (Throwable th) {
            String[] strArr = A00;
            if (strArr[6].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A00[7] = "rnq1MXg";
            if (A01.get()) {
                A07(th);
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A06(canvas);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A02();
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            A0B(z, i, rect);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onFocusChanged(z, i, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            return A0D(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                boolean zOnKeyDown = super.onKeyDown(i, keyEvent);
                String[] strArr = A00;
                if (strArr[6].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[6] = "5DVI70tdQk";
                strArr2[1] = "";
                return zOnKeyDown;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        try {
            return A0E(i, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onKeyUp(i, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            A0A(z, i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            A04(i, i2);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onMeasure(i, i2);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            A05(i, i2, i3, i4);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                super.onSizeChanged(i, i2, i3, i4);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0F(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0G(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            A09(z);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                if (A00[5].length() == 25) {
                    throw new RuntimeException();
                }
                A00[0] = "0jBFwaBL8FA97JJQoE8VdUJeS";
                super.onWindowFocusChanged(z);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        try {
            A03(i);
        } catch (Throwable th) {
            if (A01.get()) {
                A07(th);
                if (A00[0].length() == 7) {
                    throw new RuntimeException();
                }
                A00[5] = "8Ha1wZjMuo1MUnpr2KcgLPpAJB";
                super.onWindowVisibilityChanged(i);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0C();
        } catch (Throwable th) {
            AtomicBoolean atomicBoolean = A01;
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "LfZZ0wz91OrvOK";
            if (atomicBoolean.get()) {
                A07(th);
                return super.performClick();
            }
            throw th;
        }
    }
}
