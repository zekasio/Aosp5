package com.applovin.exoplayer2.h;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.l f459a;
    private com.applovin.exoplayer2.e.h b;
    private com.applovin.exoplayer2.e.i c;

    public c(com.applovin.exoplayer2.e.l lVar) {
        this.f459a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    @Override // com.applovin.exoplayer2.h.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.exoplayer2.k.g r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.applovin.exoplayer2.e.j r15) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.e.e r6 = new com.applovin.exoplayer2.e.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            com.applovin.exoplayer2.e.h r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            com.applovin.exoplayer2.e.l r8 = r7.f459a
            com.applovin.exoplayer2.e.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.b = r8
            goto L80
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L7c
            r1 = r8[r0]
            boolean r2 = r1.a(r6)     // Catch: java.lang.Throwable -> L4d java.io.EOFException -> L62
            if (r2 == 0) goto L40
            r7.b = r1     // Catch: java.lang.Throwable -> L4d java.io.EOFException -> L62
            if (r1 != 0) goto L38
            long r0 = r6.c()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L39
        L38:
            r13 = 1
        L39:
            com.applovin.exoplayer2.l.a.b(r13)
            r6.a()
            goto L7c
        L40:
            com.applovin.exoplayer2.e.h r1 = r7.b
            if (r1 != 0) goto L72
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L70
            goto L72
        L4d:
            r8 = move-exception
            com.applovin.exoplayer2.e.h r9 = r7.b
            if (r9 != 0) goto L5a
            long r9 = r6.c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L5b
        L5a:
            r13 = 1
        L5b:
            com.applovin.exoplayer2.l.a.b(r13)
            r6.a()
            throw r8
        L62:
            com.applovin.exoplayer2.e.h r1 = r7.b
            if (r1 != 0) goto L72
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L70
            goto L72
        L70:
            r1 = 0
            goto L73
        L72:
            r1 = 1
        L73:
            com.applovin.exoplayer2.l.a.b(r1)
            r6.a()
            int r0 = r0 + 1
            goto L22
        L7c:
            com.applovin.exoplayer2.e.h r10 = r7.b
            if (r10 == 0) goto L86
        L80:
            com.applovin.exoplayer2.e.h r8 = r7.b
            r8.a(r15)
            return
        L86:
            com.applovin.exoplayer2.h.ae r10 = new com.applovin.exoplayer2.h.ae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            java.lang.String r8 = com.applovin.exoplayer2.l.ai.b(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = com.applovin.exoplayer2.l.a.b(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            goto Laa
        La9:
            throw r10
        Laa:
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.c.a(com.applovin.exoplayer2.k.g, android.net.Uri, java.util.Map, long, long, com.applovin.exoplayer2.e.j):void");
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a() {
        com.applovin.exoplayer2.e.h hVar = this.b;
        if (hVar != null) {
            hVar.c();
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.applovin.exoplayer2.h.s
    public void b() {
        com.applovin.exoplayer2.e.h hVar = this.b;
        if (hVar instanceof com.applovin.exoplayer2.e.f.d) {
            ((com.applovin.exoplayer2.e.f.d) hVar).a();
        }
    }

    @Override // com.applovin.exoplayer2.h.s
    public long c() {
        com.applovin.exoplayer2.e.i iVar = this.c;
        if (iVar != null) {
            return iVar.c();
        }
        return -1L;
    }

    @Override // com.applovin.exoplayer2.h.s
    public void a(long j, long j2) {
        ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.b)).a(j, j2);
    }

    @Override // com.applovin.exoplayer2.h.s
    public int a(com.applovin.exoplayer2.e.u uVar) throws IOException {
        return ((com.applovin.exoplayer2.e.h) com.applovin.exoplayer2.l.a.b(this.b)).a((com.applovin.exoplayer2.e.i) com.applovin.exoplayer2.l.a.b(this.c), uVar);
    }
}
