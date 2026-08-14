package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w implements f {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private f.a e = f.a.f65a;
    private f.a f = f.a.f65a;
    private f.a g = f.a.f65a;
    private f.a h = f.a.f65a;
    private boolean i;
    private v j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public w() {
        ByteBuffer byteBuffer = f64a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = f64a;
        this.b = -1;
    }

    public void a(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    public void b(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public long a(long j) {
        if (this.o >= 1024) {
            long jA = this.n - ((long) ((v) com.applovin.exoplayer2.l.a.b(this.j)).a());
            if (this.h.b == this.g.b) {
                return ai.d(j, jA, this.o);
            }
            return ai.d(j, jA * ((long) this.h.b), this.o * ((long) this.g.b));
        }
        double d = this.c;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    @Override // com.applovin.exoplayer2.b.f
    public f.a a(f.a aVar) throws f.b {
        if (aVar.d != 2) {
            throw new f.b(aVar);
        }
        int i = this.b;
        if (i == -1) {
            i = aVar.b;
        }
        this.e = aVar;
        f.a aVar2 = new f.a(i, aVar.c, 2);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f.b != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.b != this.e.b);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(this.j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            vVar.a(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.applovin.exoplayer2.b.f
    public void b() {
        v vVar = this.j;
        if (vVar != null) {
            vVar.b();
        }
        this.p = true;
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int iD;
        v vVar = this.j;
        if (vVar != null && (iD = vVar.d()) > 0) {
            if (this.k.capacity() < iD) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iD).order(ByteOrder.nativeOrder());
                this.k = byteBufferOrder;
                this.l = byteBufferOrder.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            vVar.b(this.l);
            this.o += (long) iD;
            this.k.limit(iD);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = f64a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        v vVar;
        return this.p && ((vVar = this.j) == null || vVar.d() == 0);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void e() {
        if (a()) {
            f.a aVar = this.e;
            this.g = aVar;
            this.h = this.f;
            if (this.i) {
                this.j = new v(aVar.b, this.g.c, this.c, this.d, this.h.b);
            } else {
                v vVar = this.j;
                if (vVar != null) {
                    vVar.c();
                }
            }
        }
        this.m = f64a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void f() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = f.a.f65a;
        this.f = f.a.f65a;
        this.g = f.a.f65a;
        this.h = f.a.f65a;
        ByteBuffer byteBuffer = f64a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = f64a;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
