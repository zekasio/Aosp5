package com.applovin.exoplayer2.m;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.f.h {
    public final int c;
    public final boolean d;

    public g(Throwable th, com.applovin.exoplayer2.f.i iVar, Surface surface) {
        super(th, iVar);
        this.c = System.identityHashCode(surface);
        this.d = surface == null || surface.isValid();
    }
}
