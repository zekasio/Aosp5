package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public class f6 {
    public static final f6 f = new f6(0, 0, 0, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1798a;
    public final long b;
    public final long c;
    public final double d;
    public long e;

    public f6(long j, long j2, long j3, double d) {
        this.f1798a = j;
        this.b = j2;
        this.c = j3;
        this.d = d;
        this.e = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0011 A[PHI: r4
      0x0011: PHI (r4v4 long) = (r4v1 long), (r4v2 long) binds: [B:3:0x000f, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r7 = this;
            long r0 = r7.e
            double r2 = (double) r0
            double r4 = r7.d
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            long r2 = (long) r2
            long r4 = r7.b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L13
        L11:
            r2 = r4
            goto L1a
        L13:
            long r4 = r7.c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            goto L11
        L1a:
            r7.e = r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2d
            monitor-enter(r7)
            r7.wait(r0)     // Catch: java.lang.Throwable -> L27 java.lang.InterruptedException -> L29
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L2b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.f6.a():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f6.class != obj.getClass()) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return this.f1798a == f6Var.f1798a && this.b == f6Var.b && this.c == f6Var.c && this.d == f6Var.d && this.e == f6Var.e;
    }
}
