package com.applovin.exoplayer2.e.i;

import android.net.Uri;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f329a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.i.a$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return a.a();
        }
    };
    private final b b = new b();
    private final com.applovin.exoplayer2.l.y c = new com.applovin.exoplayer2.l.y(2786);
    private boolean d;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new a()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.a();
        r4 = r4 + 1;
     */
    @Override // com.applovin.exoplayer2.e.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.applovin.exoplayer2.e.i r8) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.l.y r0 = new com.applovin.exoplayer2.l.y
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.d()
            r8.d(r4, r2, r1)
            r0.d(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.a()
            r8.c(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.d()
            r6 = 6
            r8.d(r5, r2, r6)
            r0.d(r2)
            int r5 = r0.i()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.c(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.d()
            int r5 = com.applovin.exoplayer2.b.b.a(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.c(r5)
            goto L24
        L5f:
            r4 = 3
            r0.e(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.c(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.a.a(com.applovin.exoplayer2.e.i):boolean");
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
        int iA = iVar.a(this.c.d(), 0, 2786);
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
