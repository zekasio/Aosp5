package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f323a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final y k = new y(255);

    e() {
    }

    public void a() {
        this.f323a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r12 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r11.c() >= r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r11.a(1) == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.exoplayer2.e.i r11, long r12) throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r11.c()
            long r2 = r11.b()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.applovin.exoplayer2.l.a.a(r0)
            com.applovin.exoplayer2.l.y r0 = r10.k
            r1 = 4
            r0.a(r1)
        L1a:
            r2 = -1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r6 = r11.c()
            r8 = 4
            long r6 = r6 + r8
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L51
        L2b:
            com.applovin.exoplayer2.l.y r0 = r10.k
            byte[] r0 = r0.d()
            boolean r0 = com.applovin.exoplayer2.e.k.a(r11, r0, r4, r1, r5)
            if (r0 == 0) goto L51
            com.applovin.exoplayer2.l.y r0 = r10.k
            r0.d(r4)
            com.applovin.exoplayer2.l.y r0 = r10.k
            long r2 = r0.o()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r11.a()
            return r5
        L4d:
            r11.b(r5)
            goto L1a
        L51:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r0 = r11.c()
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 >= 0) goto L65
        L5d:
            int r0 = r11.a(r5)
            r1 = -1
            if (r0 == r1) goto L65
            goto L51
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.h.e.a(com.applovin.exoplayer2.e.i, long):boolean");
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar, boolean z) throws IOException {
        a();
        this.k.a(27);
        if (!k.a(iVar, this.k.d(), 0, 27, z) || this.k.o() != 1332176723) {
            return false;
        }
        int iH = this.k.h();
        this.f323a = iH;
        if (iH != 0) {
            if (z) {
                return false;
            }
            throw ai.a("unsupported bit stream revision");
        }
        this.b = this.k.h();
        this.c = this.k.t();
        this.d = this.k.p();
        this.e = this.k.p();
        this.f = this.k.p();
        int iH2 = this.k.h();
        this.g = iH2;
        this.h = iH2 + 27;
        this.k.a(iH2);
        if (!k.a(iVar, this.k.d(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.h();
            this.i += this.j[i];
        }
        return true;
    }
}
