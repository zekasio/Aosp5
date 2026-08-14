package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public final class aa extends ba {
    private static final Object c = new Object();
    private static final com.applovin.exoplayer2.ab d = new ab.b().a("SinglePeriodTimeline").a(Uri.EMPTY).a();
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Object o;
    private final com.applovin.exoplayer2.ab p;
    private final ab.e q;

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return 1;
    }

    public aa(long j, boolean z, boolean z2, boolean z3, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, abVar);
    }

    public aa(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, com.applovin.exoplayer2.ab abVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, abVar, z3 ? abVar.d : null);
    }

    public aa(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, com.applovin.exoplayer2.ab abVar, ab.e eVar) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = j7;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = obj;
        this.p = (com.applovin.exoplayer2.ab) com.applovin.exoplayer2.l.a.b(abVar);
        this.q = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v10 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.applovin.exoplayer2.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.ba.c a(int r30, com.applovin.exoplayer2.ba.c r31, long r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = 0
            r2 = 1
            r3 = r30
            com.applovin.exoplayer2.l.a.a(r3, r1, r2)
            long r1 = r0.k
            boolean r3 = r0.m
            if (r3 == 0) goto L2e
            boolean r3 = r0.n
            if (r3 != 0) goto L2e
            r3 = 0
            int r5 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r21 = r5
            goto L30
        L27:
            long r1 = r1 + r32
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r21 = r1
        L30:
            java.lang.Object r9 = com.applovin.exoplayer2.ba.c.f91a
            com.applovin.exoplayer2.ab r10 = r0.p
            java.lang.Object r11 = r0.o
            long r12 = r0.e
            long r14 = r0.f
            long r1 = r0.g
            r16 = r1
            boolean r1 = r0.l
            r18 = r1
            boolean r1 = r0.m
            r19 = r1
            com.applovin.exoplayer2.ab$e r1 = r0.q
            r20 = r1
            long r1 = r0.i
            r23 = r1
            r26 = 0
            long r1 = r0.j
            r27 = r1
            r25 = 0
            r8 = r31
            com.applovin.exoplayer2.ba$c r1 = r8.a(r9, r10, r11, r12, r14, r16, r18, r19, r20, r21, r23, r25, r26, r27)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.aa.a(int, com.applovin.exoplayer2.ba$c, long):com.applovin.exoplayer2.ba$c");
    }

    @Override // com.applovin.exoplayer2.ba
    public ba.a a(int i, ba.a aVar, boolean z) {
        com.applovin.exoplayer2.l.a.a(i, 0, 1);
        return aVar.a(null, z ? c : null, 0, this.h, -this.j);
    }

    @Override // com.applovin.exoplayer2.ba
    public int c(Object obj) {
        return c.equals(obj) ? 0 : -1;
    }

    @Override // com.applovin.exoplayer2.ba
    public Object a(int i) {
        com.applovin.exoplayer2.l.a.a(i, 0, 1);
        return c;
    }
}
