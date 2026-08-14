package com.applovin.exoplayer2.c;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.exoplayer2.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f100a;
    public ByteBuffer b;
    public boolean c;
    public long d;
    public ByteBuffer e;
    private final int f;
    private final int g;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101a;
        public final int b;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f101a = i;
            this.b = i2;
        }
    }

    public static g f() {
        return new g(0);
    }

    public g(int i) {
        this(i, 0);
    }

    public g(int i, int i2) {
        this.f100a = new c();
        this.f = i;
        this.g = i2;
    }

    public void e(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.e = ByteBuffer.allocate(i);
        } else {
            this.e.clear();
        }
    }

    public void f(int i) {
        int i2 = i + this.g;
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = g(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.b = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i3);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.b = byteBufferG;
    }

    public final boolean g() {
        return d(1073741824);
    }

    public final void h() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.c = false;
    }

    private ByteBuffer g(int i) {
        int i2 = this.f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.b;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
