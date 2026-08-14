package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.p;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a extends com.applovin.exoplayer2.e.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(final p pVar, int i, long j, long j2) {
        super(new a.d() { // from class: com.applovin.exoplayer2.e.b.a$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.e.a.d
            public final long timeUsToTargetTime(long j3) {
                return pVar.a(j3);
            }
        }, new C0022a(pVar, i), pVar.a(), 0L, pVar.j, j, j2, pVar.b(), Math.max(6, pVar.c));
        Objects.requireNonNull(pVar);
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.b.a$a, reason: collision with other inner class name */
    private static final class C0022a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f267a;
        private final int b;
        private final m.a c;

        @Override // com.applovin.exoplayer2.e.a.f
        public /* synthetic */ void a() {
            a.f.CC.$default$a(this);
        }

        private C0022a(p pVar, int i) {
            this.f267a = pVar;
            this.b = i;
            this.c = new m.a();
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(i iVar, long j) throws IOException {
            long jC = iVar.c();
            long jA = a(iVar);
            long jB = iVar.b();
            iVar.c(Math.max(6, this.f267a.c));
            long jA2 = a(iVar);
            long jB2 = iVar.b();
            if (jA <= j && jA2 > j) {
                return a.e.a(jB);
            }
            if (jA2 <= j) {
                return a.e.b(jA2, jB2);
            }
            return a.e.a(jA, jC);
        }

        private long a(i iVar) throws IOException {
            while (iVar.b() < iVar.d() - 6 && !m.a(iVar, this.f267a, this.b, this.c)) {
                iVar.c(1);
            }
            if (iVar.b() >= iVar.d() - 6) {
                iVar.c((int) (iVar.d() - iVar.b()));
                return this.f267a.j;
            }
            return this.c.f377a;
        }
    }
}
