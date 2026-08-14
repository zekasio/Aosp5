package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.c.i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class j extends com.applovin.exoplayer2.c.i {
    public int c;
    public int d;
    public ByteBuffer[] e;
    public int[] f;
    public int g;
    private final i.a<j> h;

    @Override // com.applovin.exoplayer2.c.i
    public void f() {
        this.h.releaseOutputBuffer(this);
    }
}
