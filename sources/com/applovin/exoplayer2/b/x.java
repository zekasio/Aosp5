package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class x extends l {
    private int d;
    private int e;
    private boolean f;
    private int g;
    private byte[] h = ai.f;
    private int i;
    private long j;

    public void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public void k() {
        this.j = 0L;
    }

    public long l() {
        return this.j;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.d != 2) {
            throw new f.b(aVar);
        }
        this.f = true;
        return (this.d == 0 && this.e == 0) ? f.a.f65a : aVar;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.g);
        this.j += (long) (iMin / this.b.e);
        this.g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.g > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.i + i2) - this.h.length;
        ByteBuffer byteBufferA = a(length);
        int iA = ai.a(length, 0, this.i);
        byteBufferA.put(this.h, 0, iA);
        int iA2 = ai.a(length - iA, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iA2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iA2;
        int i4 = this.i - iA;
        this.i = i4;
        byte[] bArr = this.h;
        System.arraycopy(bArr, iA, bArr, 0, i4);
        byteBuffer.get(this.h, this.i, i3);
        this.i += i3;
        byteBufferA.flip();
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int i;
        if (super.d() && (i = this.i) > 0) {
            a(i).put(this.h, 0, this.i).flip();
            this.i = 0;
        }
        return super.c();
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean d() {
        return super.d() && this.i == 0;
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void h() {
        if (this.f) {
            int i = this.i;
            if (i > 0) {
                this.j += (long) (i / this.b.e);
            }
            this.i = 0;
        }
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void i() {
        if (this.f) {
            this.f = false;
            this.h = new byte[this.e * this.b.e];
            this.g = this.d * this.b.e;
        }
        this.i = 0;
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void j() {
        this.h = ai.f;
    }
}
