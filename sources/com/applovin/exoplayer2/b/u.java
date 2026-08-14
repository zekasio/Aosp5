package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u extends l {
    private final long d;
    private final long e;
    private final short f;
    private int g;
    private boolean h;
    private byte[] i;
    private byte[] j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private long o;

    public u() {
        this(150000L, 20000L, (short) 1024);
    }

    public u(long j, long j2, short s) {
        com.applovin.exoplayer2.l.a.a(j2 <= j);
        this.d = j;
        this.e = j2;
        this.f = s;
        this.i = ai.f;
        this.j = ai.f;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public long k() {
        return this.o;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        if (aVar.d == 2) {
            return this.h ? aVar : f.a.f65a;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.l, com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.h;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i = this.k;
            if (i == 0) {
                b(byteBuffer);
            } else if (i == 1) {
                c(byteBuffer);
            } else if (i == 2) {
                d(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void h() {
        int i = this.l;
        if (i > 0) {
            a(this.i, i);
        }
        if (this.n) {
            return;
        }
        this.o += (long) (this.m / this.g);
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void i() {
        if (this.h) {
            this.g = this.b.e;
            int iA = a(this.d) * this.g;
            if (this.i.length != iA) {
                this.i = new byte[iA];
            }
            int iA2 = a(this.e) * this.g;
            this.m = iA2;
            if (this.j.length != iA2) {
                this.j = new byte[iA2];
            }
        }
        this.k = 0;
        this.o = 0L;
        this.l = 0;
        this.n = false;
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void j() {
        this.h = false;
        this.m = 0;
        this.i = ai.f;
        this.j = ai.f;
    }

    private void b(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.i.length));
        int iG = g(byteBuffer);
        if (iG == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(iG);
            e(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void c(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        int iPosition = iF - byteBuffer.position();
        byte[] bArr = this.i;
        int length = bArr.length;
        int i = this.l;
        int i2 = length - i;
        if (iF < iLimit && iPosition < i2) {
            a(bArr, i);
            this.l = 0;
            this.k = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.i, this.l, iMin);
        int i3 = this.l + iMin;
        this.l = i3;
        byte[] bArr2 = this.i;
        if (i3 == bArr2.length) {
            if (this.n) {
                a(bArr2, this.m);
                this.o += (long) ((this.l - (this.m * 2)) / this.g);
            } else {
                this.o += (long) ((i3 - this.m) / this.g);
            }
            a(byteBuffer, this.i, this.l);
            this.l = 0;
            this.k = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void d(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        byteBuffer.limit(iF);
        this.o += (long) (byteBuffer.remaining() / this.g);
        a(byteBuffer, this.j, this.m);
        if (iF < iLimit) {
            a(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void a(byte[] bArr, int i) {
        a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.n = true;
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        a(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.n = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.m);
        int i2 = this.m - iMin;
        System.arraycopy(bArr, i - i2, this.j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.j, i2, iMin);
    }

    private int a(long j) {
        return (int) ((j * ((long) this.b.b)) / 1000000);
    }

    private int f(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f) {
                int i = this.g;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    private int g(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f);
        int i = this.g;
        return ((iLimit / i) * i) + i;
    }
}
