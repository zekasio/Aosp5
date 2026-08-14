package com.tapjoy.internal;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Animation f1916a;

    public enum a {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    public u(Animation animation) {
        this.f1916a = animation;
        animation.setDuration(400L);
    }

    public static x a() {
        return new x();
    }

    public static y b() {
        return new y();
    }
}
