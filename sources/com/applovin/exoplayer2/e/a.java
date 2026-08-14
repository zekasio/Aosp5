package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0021a f262a;
    protected final f b;
    protected c c;
    private final int d;

    public static final class b implements d {
        @Override // com.applovin.exoplayer2.e.a.d
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long timeUsToTargetTime(long j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.e.a$f$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(f _this) {
            }
        }

        e a(i iVar, long j) throws IOException;

        void a();
    }

    protected void b(boolean z, long j) {
    }

    protected a(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.f262a = new C0021a(dVar, j, j2, j3, j4, j5, j6);
    }

    public final v a() {
        return this.f262a;
    }

    public final void a(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.d() != j) {
            this.c = b(j);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            c cVar = (c) com.applovin.exoplayer2.l.a.a(this.c);
            long jA = cVar.a();
            long jB = cVar.b();
            long jE = cVar.e();
            if (jB - jA <= this.d) {
                a(false, jA);
                return a(iVar, jA, uVar);
            }
            if (!a(iVar, jE)) {
                return a(iVar, jE, uVar);
            }
            iVar.a();
            e eVarA = this.b.a(iVar, cVar.c());
            int i = eVarA.b;
            if (i == -3) {
                a(false, jE);
                return a(iVar, jE, uVar);
            }
            if (i == -2) {
                cVar.a(eVarA.c, eVarA.d);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    a(iVar, eVarA.d);
                    a(true, eVarA.d);
                    return a(iVar, eVarA.d, uVar);
                }
                cVar.b(eVarA.c, eVarA.d);
            }
        }
    }

    protected c b(long j) {
        return new c(j, this.f262a.b(j), this.f262a.c, this.f262a.d, this.f262a.e, this.f262a.f, this.f262a.g);
    }

    protected final void a(boolean z, long j) {
        this.c = null;
        this.b.a();
        b(z, j);
    }

    protected final boolean a(i iVar, long j) throws IOException {
        long jC = j - iVar.c();
        if (jC < 0 || jC > 262144) {
            return false;
        }
        iVar.b((int) jC);
        return true;
    }

    protected final int a(i iVar, long j, u uVar) {
        if (j == iVar.c()) {
            return 0;
        }
        uVar.f386a = j;
        return 1;
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f264a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return ai.a(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f264a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f264a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            this.d = j;
            this.f = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j, long j2) {
            this.e = j;
            this.g = j2;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.h;
        }

        private void f() {
            this.h = a(this.b, this.d, this.e, this.f, this.g, this.c);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f265a = new e(-3, -9223372036854775807L, -1);
        private final int b;
        private final long c;
        private final long d;

        private e(int i, long j, long j2) {
            this.b = i;
            this.c = j;
            this.d = j2;
        }

        public static e a(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e b(long j, long j2) {
            return new e(-2, j, j2);
        }

        public static e a(long j) {
            return new e(0, -9223372036854775807L, j);
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.a$a, reason: collision with other inner class name */
    public static class C0021a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f263a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        public C0021a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f263a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j) {
            return new v.a(new w(j, c.a(this.f263a.timeUsToTargetTime(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.b;
        }

        public long b(long j) {
            return this.f263a.timeUsToTargetTime(j);
        }
    }
}
