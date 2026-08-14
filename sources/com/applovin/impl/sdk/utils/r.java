package com.applovin.impl.sdk.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public class r {
    public static boolean a(int i) {
        return i == 0;
    }

    public static void a(View view, long j) {
        a(view, j, (Runnable) null);
    }

    public static void a(final View view, long j, final Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.r.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static void b(final View view, long j, final Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.r.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static boolean a(int i, int i2) {
        return a(i) != a(i2);
    }

    public static String b(int i) {
        if (i == 0) {
            return "VISIBLE";
        }
        if (i == 4) {
            return "INVISIBLE";
        }
        if (i == 8) {
            return "GONE";
        }
        return String.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(int r3, int r4, int r5) {
        /*
            if (r3 != 0) goto L7
            int[] r3 = new int[]{r4, r5}
            return r3
        L7:
            r0 = r3 & 119(0x77, float:1.67E-43)
            r1 = 119(0x77, float:1.67E-43)
            if (r0 != r1) goto L14
            r3 = 13
            int[] r3 = new int[]{r3}
            return r3
        L14:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r1 = 15
            r2 = 112(0x70, float:1.57E-43)
            if (r0 != r2) goto L1f
        L1c:
            r4 = 15
            goto L38
        L1f:
            r0 = r3 & 48
            r2 = 48
            if (r0 != r2) goto L28
            r4 = 10
            goto L38
        L28:
            r0 = r3 & 80
            r2 = 80
            if (r0 != r2) goto L31
            r4 = 12
            goto L38
        L31:
            r0 = r3 & 16
            r2 = 16
            if (r0 != r2) goto L38
            goto L1c
        L38:
            r0 = r3 & 7
            r1 = 14
            r2 = 7
            if (r0 != r2) goto L42
        L3f:
            r5 = 14
            goto L77
        L42:
            boolean r0 = com.applovin.impl.sdk.utils.h.b()
            if (r0 == 0) goto L52
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r3 & r0
            if (r2 != r0) goto L52
            r5 = 20
            goto L77
        L52:
            r0 = r3 & 3
            r2 = 3
            if (r0 != r2) goto L5a
            r5 = 9
            goto L77
        L5a:
            boolean r0 = com.applovin.impl.sdk.utils.h.b()
            if (r0 == 0) goto L6a
            r0 = 8388613(0x800005, float:1.175495E-38)
            r2 = r3 & r0
            if (r2 != r0) goto L6a
            r5 = 21
            goto L77
        L6a:
            r0 = r3 & 5
            r2 = 5
            if (r0 != r2) goto L72
            r5 = 11
            goto L77
        L72:
            r0 = 1
            r3 = r3 & r0
            if (r3 != r0) goto L77
            goto L3f
        L77:
            int[] r3 = new int[]{r5, r4}
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.r.a(int, int, int):int[]");
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
