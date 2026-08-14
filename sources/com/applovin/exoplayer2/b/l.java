package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements f {
    private boolean h;
    private ByteBuffer f = f64a;
    private ByteBuffer g = f64a;
    private f.a d = f.a.f65a;
    private f.a e = f.a.f65a;
    protected f.a b = f.a.f65a;
    protected f.a c = f.a.f65a;

    protected void h() {
    }

    protected void i() {
    }

    protected void j() {
    }

    @Override // com.applovin.exoplayer2.b.f
    public final f.a a(f.a aVar) throws f.b {
        this.d = aVar;
        this.e = b(aVar);
        return a() ? this.e : f.a.f65a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.e != f.a.f65a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void b() {
        this.h = true;
        h();
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = f64a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        return this.h && this.g == f64a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void e() {
        this.g = f64a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void f() {
        e();
        this.f = f64a;
        this.d = f.a.f65a;
        this.e = f.a.f65a;
        this.b = f.a.f65a;
        this.c = f.a.f65a;
        j();
    }

    protected final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean g() {
        return this.g.hasRemaining();
    }

    protected f.a b(f.a aVar) throws f.b {
        return f.a.f65a;
    }
}
