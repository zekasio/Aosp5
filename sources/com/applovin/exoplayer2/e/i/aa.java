package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class aa extends com.applovin.exoplayer2.e.a {
    public aa(ag agVar, long j, long j2, int i, int i2) {
        super(new a.b(), new a(i, agVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }

    private static final class a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ag f330a;
        private final com.applovin.exoplayer2.l.y b = new com.applovin.exoplayer2.l.y();
        private final int c;
        private final int d;

        public a(int i, ag agVar, int i2) {
            this.c = i;
            this.f330a = agVar;
            this.d = i2;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(com.applovin.exoplayer2.e.i iVar, long j) throws IOException {
            long jC = iVar.c();
            int iMin = (int) Math.min(this.d, iVar.d() - jC);
            this.b.a(iMin);
            iVar.d(this.b.d(), 0, iMin);
            return a(this.b, j, jC);
        }

        private a.e a(com.applovin.exoplayer2.l.y yVar, long j, long j2) {
            int iA;
            int iA2;
            int iB = yVar.b();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (yVar.a() >= 188 && (iA2 = (iA = ae.a(yVar.d(), yVar.c(), iB)) + 188) <= iB) {
                long jA = ae.a(yVar, iA, this.c);
                if (jA != -9223372036854775807L) {
                    long jB = this.f330a.b(jA);
                    if (jB > j) {
                        if (j5 == -9223372036854775807L) {
                            return a.e.a(jB, j2);
                        }
                        return a.e.a(j2 + j4);
                    }
                    if (100000 + jB > j) {
                        return a.e.a(j2 + ((long) iA));
                    }
                    j4 = iA;
                    j5 = jB;
                }
                yVar.d(iA2);
                j3 = iA2;
            }
            if (j5 != -9223372036854775807L) {
                return a.e.b(j5, j2 + j3);
            }
            return a.e.f265a;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.b.a(ai.f);
        }
    }
}
