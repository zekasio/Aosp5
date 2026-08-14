package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.g.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f445a = new y();
    private final x b = new x();
    private ag c;

    @Override // com.applovin.exoplayer2.g.g
    protected com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        a.InterfaceC0030a eVar;
        if (this.c == null || dVar.f != this.c.c()) {
            ag agVar = new ag(dVar.d);
            this.c = agVar;
            agVar.c(dVar.d - dVar.f);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f445a.a(bArrArray, iLimit);
        this.b.a(bArrArray, iLimit);
        this.b.b(39);
        long jC = (((long) this.b.c(1)) << 32) | ((long) this.b.c(32));
        this.b.b(20);
        int iC = this.b.c(12);
        int iC2 = this.b.c(8);
        this.f445a.e(14);
        if (iC2 == 0) {
            eVar = new e();
        } else if (iC2 == 255) {
            eVar = a.a(this.f445a, iC, jC);
        } else if (iC2 == 4) {
            eVar = f.a(this.f445a);
        } else if (iC2 == 5) {
            eVar = d.a(this.f445a, jC, this.c);
        } else {
            eVar = iC2 != 6 ? null : g.a(this.f445a, jC, this.c);
        }
        return eVar == null ? new com.applovin.exoplayer2.g.a(new a.InterfaceC0030a[0]) : new com.applovin.exoplayer2.g.a(eVar);
    }
}
