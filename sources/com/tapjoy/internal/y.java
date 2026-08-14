package com.tapjoy.internal;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1946a = 0;
    public float b = 0.0f;
    public int c = 0;
    public float d = 0.0f;
    public int e = 0;
    public float f = 0.0f;
    public int g = 0;
    public float h = 0.0f;

    public Animation a() {
        return new TranslateAnimation(this.f1946a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public y b(float f) {
        this.e = 1;
        this.f = f;
        return this;
    }

    public y a(float f) {
        this.f1946a = 1;
        this.b = f;
        return this;
    }
}
