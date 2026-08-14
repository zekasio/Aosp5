package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f641a;
    private final y b;
    private long c;
    private a d;
    private long e;

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    public b() {
        super(6);
        this.f641a = new com.applovin.exoplayer2.c.g(1);
        this.b = new y();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if ("application/x-camera-motion".equals(vVar.l)) {
            return as.CC.b(4);
        }
        return as.CC.b(0);
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i, Object obj) throws p {
        if (i == 8) {
            this.d = (a) obj;
        } else {
            super.a(i, obj);
        }
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(v[] vVarArr, long j, long j2) {
        this.c = j2;
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(long j, boolean z) {
        this.e = Long.MIN_VALUE;
        B();
    }

    @Override // com.applovin.exoplayer2.e
    protected void r() {
        B();
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j, long j2) {
        while (!g() && this.e < 100000 + j) {
            this.f641a.a();
            if (a(t(), this.f641a, 0) != -4 || this.f641a.c()) {
                return;
            }
            this.e = this.f641a.d;
            if (this.d != null && !this.f641a.b()) {
                this.f641a.h();
                float[] fArrA = a((ByteBuffer) ai.a(this.f641a.b));
                if (fArrA != null) {
                    ((a) ai.a(this.d)).a(this.e - this.c, fArrA);
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return g();
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.b.a(byteBuffer.array(), byteBuffer.limit());
        this.b.d(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.b.r());
        }
        return fArr;
    }

    private void B() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }
}
