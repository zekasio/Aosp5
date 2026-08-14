package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class u extends com.applovin.exoplayer2.e.a {
    public u(ag agVar, long j, long j2) {
        super(new a.b(), new a(agVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ag f363a;
        private final com.applovin.exoplayer2.l.y b;

        private a(ag agVar) {
            this.f363a = agVar;
            this.b = new com.applovin.exoplayer2.l.y();
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public a.e a(com.applovin.exoplayer2.e.i iVar, long j) throws IOException {
            long jC = iVar.c();
            int iMin = (int) Math.min(20000L, iVar.d() - jC);
            this.b.a(iMin);
            iVar.d(this.b.d(), 0, iMin);
            return a(this.b, j, jC);
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public void a() {
            this.b.a(ai.f);
        }

        private a.e a(com.applovin.exoplayer2.l.y yVar, long j, long j2) {
            int iC = -1;
            long j3 = -9223372036854775807L;
            int iC2 = -1;
            while (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) != 442) {
                    yVar.e(1);
                } else {
                    yVar.e(4);
                    long jA = v.a(yVar);
                    if (jA != -9223372036854775807L) {
                        long jB = this.f363a.b(jA);
                        if (jB > j) {
                            if (j3 == -9223372036854775807L) {
                                return a.e.a(jB, j2);
                            }
                            return a.e.a(j2 + ((long) iC2));
                        }
                        if (100000 + jB > j) {
                            return a.e.a(j2 + ((long) yVar.c()));
                        }
                        iC2 = yVar.c();
                        j3 = jB;
                    }
                    a(yVar);
                    iC = yVar.c();
                }
            }
            if (j3 != -9223372036854775807L) {
                return a.e.b(j3, j2 + ((long) iC));
            }
            return a.e.f265a;
        }

        private static void a(com.applovin.exoplayer2.l.y yVar) {
            int iB;
            int iB2 = yVar.b();
            if (yVar.a() < 10) {
                yVar.d(iB2);
                return;
            }
            yVar.e(9);
            int iH = yVar.h() & 7;
            if (yVar.a() < iH) {
                yVar.d(iB2);
                return;
            }
            yVar.e(iH);
            if (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) == 443) {
                    yVar.e(4);
                    int i = yVar.i();
                    if (yVar.a() < i) {
                        yVar.d(iB2);
                        return;
                    }
                    yVar.e(i);
                }
                while (yVar.a() >= 4 && (iB = u.b(yVar.d(), yVar.c())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                    yVar.e(4);
                    if (yVar.a() < 2) {
                        yVar.d(iB2);
                        return;
                    }
                    yVar.d(Math.min(yVar.b(), yVar.c() + yVar.i()));
                }
                return;
            }
            yVar.d(iB2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
