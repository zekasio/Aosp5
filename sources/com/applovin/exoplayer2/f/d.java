package com.applovin.exoplayer2.f;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class d extends com.applovin.exoplayer2.c.g {
    private long f;
    private int g;
    private int h;

    public d() {
        super(2);
        this.h = 32;
    }

    @Override // com.applovin.exoplayer2.c.g, com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.g = 0;
    }

    public void g(int i) {
        com.applovin.exoplayer2.l.a.a(i > 0);
        this.h = i;
    }

    public long i() {
        return this.d;
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.g;
    }

    public boolean l() {
        return this.g > 0;
    }

    public boolean a(com.applovin.exoplayer2.c.g gVar) {
        com.applovin.exoplayer2.l.a.a(!gVar.g());
        com.applovin.exoplayer2.l.a.a(!gVar.e());
        com.applovin.exoplayer2.l.a.a(!gVar.c());
        if (!b(gVar)) {
            return false;
        }
        int i = this.g;
        this.g = i + 1;
        if (i == 0) {
            this.d = gVar.d;
            if (gVar.d()) {
                a_(1);
            }
        }
        if (gVar.b()) {
            a_(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.b;
        if (byteBuffer != null) {
            f(byteBuffer.remaining());
            this.b.put(byteBuffer);
        }
        this.f = gVar.d;
        return true;
    }

    private boolean b(com.applovin.exoplayer2.c.g gVar) {
        if (!l()) {
            return true;
        }
        if (this.g >= this.h || gVar.b() != b()) {
            return false;
        }
        ByteBuffer byteBuffer = gVar.b;
        return byteBuffer == null || this.b == null || this.b.position() + byteBuffer.remaining() <= 3072000;
    }
}
