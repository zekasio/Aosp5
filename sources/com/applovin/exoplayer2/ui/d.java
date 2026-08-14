package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class d extends View implements k {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f687a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final StringBuilder u;
    private final Formatter v;
    private final Runnable w;
    private final CopyOnWriteArraySet<k.a> x;
    private final Point y;
    private final float z;

    private static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private static int b(float f, int i) {
        return (int) (i / f);
    }

    public d(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f687a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet<>();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int iA = a(f, 4);
        int iA2 = a(f, 26);
        int iA3 = a(f, 4);
        int iA4 = a(f, 12);
        int iA5 = a(f, 0);
        int iA6 = a(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.k = drawable;
                if (drawable != null) {
                    a(drawable);
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, iA);
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, iA2);
                this.n = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, iA3);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, iA4);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, iA5);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, iA6);
                int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.l = iA;
            this.m = iA2;
            this.n = 0;
            this.o = iA3;
            this.p = iA4;
            this.q = iA5;
            this.r = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new Runnable() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        };
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.a(valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f687a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.f687a);
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.f687a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.f687a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.f687a);
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.f687a);
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.f687a);
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(k.a aVar) {
        com.applovin.exoplayer2.l.a.b(aVar);
        this.x.add(aVar);
    }

    public void setKeyTimeIncrement(long j) {
        com.applovin.exoplayer2.l.a.a(j > 0);
        this.A = -1;
        this.B = j;
    }

    public void setKeyCountIncrement(int i) {
        com.applovin.exoplayer2.l.a.a(i > 0);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        a();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        a();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            a(true);
        }
        a();
    }

    @Override // com.applovin.exoplayer2.ui.k
    public long getPreferredUpdateDelay() {
        int iB = b(this.z, this.b.width());
        if (iB != 0) {
            long j = this.J;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iB);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // com.applovin.exoplayer2.ui.k
    public void a(long[] jArr, boolean[] zArr, int i) {
        com.applovin.exoplayer2.l.a.a(i == 0 || !(jArr == null || zArr == null));
        this.M = i;
        this.N = jArr;
        this.O = zArr;
        a();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.k
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        a(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        a(canvas);
        b(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.H
            if (r8 == 0) goto L76
            int r8 = r7.t
            if (r0 >= r8) goto L3a
            int r8 = r7.C
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.a(r8)
            goto L40
        L3a:
            r7.C = r2
            float r8 = (float) r2
            r7.a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.b(r0)
            r7.a()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.H
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.a(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a(r8, r0)
            if (r0 == 0) goto L76
            r7.a(r8)
            long r0 = r7.getScrubberPosition()
            r7.a(r0)
            r7.a()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.H
            if (r0 == 0) goto L30
            r5 = 0
            r4.a(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        a(false);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        b();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.m;
        } else if (mode != 1073741824) {
            size = Math.min(this.m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        b();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.G ? 0 : this.s;
        if (this.n == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.m;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.l;
            iMax = (paddingBottom2 - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.m) / 2;
            iMax = (i6 - this.l) / 2;
        }
        this.f687a.set(paddingLeft, paddingBottom, paddingRight, this.m + paddingBottom);
        this.b.set(this.f687a.left + i7, iMax, this.f687a.right - i7, this.l + iMax);
        if (ai.f611a >= 29) {
            a(i5, i6);
        }
        a();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable == null || !a(drawable, i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        if (ai.f611a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (c(-getPositionIncrement())) {
                a(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (c(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    private void a(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<k.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(this, j);
        }
    }

    private void b(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator<k.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(this, j);
        }
    }

    private void a(boolean z) {
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<k.a> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.I, z);
        }
    }

    private boolean c(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long jA = ai.a(j3 + j, 0L, j2);
        if (jA == j3) {
            return false;
        }
        if (!this.H) {
            a(jA);
        } else {
            b(jA);
        }
        a();
        return true;
    }

    private void a() {
        this.c.set(this.b);
        this.d.set(this.b);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            this.c.right = Math.min(this.b.left + ((int) ((((long) this.b.width()) * this.L) / this.J)), this.b.right);
            this.d.right = Math.min(this.b.left + ((int) ((((long) this.b.width()) * j) / this.J)), this.b.right);
        } else {
            this.c.right = this.b.left;
            this.d.right = this.b.left;
        }
        invalidate(this.f687a);
    }

    private void a(float f) {
        this.d.right = ai.a((int) f, this.b.left, this.b.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.y;
    }

    private long getScrubberPosition() {
        if (this.b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.d.width()) * this.J) / ((long) this.b.width());
    }

    private boolean a(float f, float f2) {
        return this.f687a.contains((int) f, (int) f2);
    }

    private void a(Canvas canvas) {
        int iHeight = this.b.height();
        int iCenterY = this.b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.J <= 0) {
            canvas.drawRect(this.b.left, iCenterY, this.b.right, i, this.g);
            return;
        }
        int i2 = this.c.left;
        int i3 = this.c.right;
        int iMax = Math.max(Math.max(this.b.left, i3), this.d.right);
        if (iMax < this.b.right) {
            canvas.drawRect(iMax, iCenterY, this.b.right, i, this.g);
        }
        int iMax2 = Math.max(i2, this.d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.f);
        }
        if (this.d.width() > 0) {
            canvas.drawRect(this.d.left, iCenterY, this.d.right, i, this.e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.b(this.N);
        boolean[] zArr = (boolean[]) com.applovin.exoplayer2.l.a.b(this.O);
        int i4 = this.o / 2;
        for (int i5 = 0; i5 < this.M; i5++) {
            canvas.drawRect(this.b.left + Math.min(this.b.width() - this.o, Math.max(0, ((int) ((((long) this.b.width()) * ai.a(jArr[i5], 0L, this.J)) / this.J)) - i4)), iCenterY, r9 + this.o, i, zArr[i5] ? this.i : this.h);
        }
    }

    private void b(Canvas canvas) {
        int i;
        if (this.J <= 0) {
            return;
        }
        int iA = ai.a(this.d.right, this.d.left, this.b.right);
        int iCenterY = this.d.centerY();
        if (this.k == null) {
            if (this.H || isFocused()) {
                i = this.r;
            } else {
                i = isEnabled() ? this.p : this.q;
            }
            canvas.drawCircle(iA, iCenterY, (int) ((i * this.F) / 2.0f), this.j);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.k.getIntrinsicHeight() * this.F)) / 2;
        this.k.setBounds(iA - intrinsicWidth, iCenterY - intrinsicHeight, iA + intrinsicWidth, iCenterY + intrinsicHeight);
        this.k.draw(canvas);
    }

    private void b() {
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void a(int i, int i2) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i && this.D.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private String getProgressText() {
        return ai.a(this.u, this.v, this.K);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.A);
    }

    private boolean a(Drawable drawable) {
        return ai.f611a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i) {
        return ai.f611a >= 23 && drawable.setLayoutDirection(i);
    }
}
