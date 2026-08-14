package com.applovin.exoplayer2.e.i;

import android.net.Uri;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f340a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.i.c$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return c.a();
        }
    };
    private final d b = new d();
    private final com.applovin.exoplayer2.l.y c = new com.applovin.exoplayer2.l.y(16384);
    private boolean d;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new c()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r9.a();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return false;
     */
    @Override // com.applovin.exoplayer2.e.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.exoplayer2.e.i r9) throws java.io.IOException {
        /*
            r8 = this;
            com.applovin.exoplayer2.l.y r0 = new com.applovin.exoplayer2.l.y
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.d()
            r9.d(r4, r2, r1)
            r0.d(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.a()
            r9.c(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.d()
            r6 = 7
            r9.d(r5, r2, r6)
            r0.d(r2)
            int r5 = r0.i()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.c(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.d()
            int r5 = com.applovin.exoplayer2.b.c.a(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.c(r5)
            goto L24
        L65:
            r4 = 3
            r0.e(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.c(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.c.a(com.applovin.exoplayer2.e.i):boolean");
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new v.b(-9223372036854775807L));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.d = false;
        this.b.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int iA = iVar.a(this.c.d(), 0, 16384);
        if (iA == -1) {
            return -1;
        }
        this.c.d(0);
        this.c.c(iA);
        if (!this.d) {
            this.b.a(0L, 4);
            this.d = true;
        }
        this.b.a(this.c);
        return 0;
    }
}
