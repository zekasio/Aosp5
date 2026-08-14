package com.applovin.exoplayer2.e.j;

import android.net.Uri;
import android.util.Pair;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.y;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.v;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f370a = new l() { // from class: com.applovin.exoplayer2.e.j.a$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return a.b();
        }
    };
    private j b;
    private x c;
    private b d;
    private int e = -1;
    private long f = -1;

    private interface b {
        void a(int i, long j) throws ai;

        void a(long j);

        boolean a(i iVar, long j) throws IOException;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return com.applovin.exoplayer2.e.j.c.a(iVar) != null;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.b = jVar;
        this.c = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        a();
        if (this.d == null) {
            com.applovin.exoplayer2.e.j.b bVarA = com.applovin.exoplayer2.e.j.c.a(iVar);
            if (bVarA == null) {
                throw ai.b("Unsupported or unrecognized wav header.", null);
            }
            if (bVarA.f373a == 17) {
                this.d = new C0028a(this.b, this.c, bVarA);
            } else if (bVarA.f373a == 6) {
                this.d = new c(this.b, this.c, bVarA, "audio/g711-alaw", -1);
            } else if (bVarA.f373a == 7) {
                this.d = new c(this.b, this.c, bVarA, "audio/g711-mlaw", -1);
            } else {
                int iA = y.a(bVarA.f373a, bVarA.f);
                if (iA == 0) {
                    throw ai.a("Unsupported WAV format type: " + bVarA.f373a);
                }
                this.d = new c(this.b, this.c, bVarA, "audio/raw", iA);
            }
        }
        if (this.e == -1) {
            Pair<Long, Long> pairB = com.applovin.exoplayer2.e.j.c.b(iVar);
            this.e = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.f = jLongValue;
            this.d.a(this.e, jLongValue);
        } else if (iVar.c() == 0) {
            iVar.b(this.e);
        }
        com.applovin.exoplayer2.l.a.b(this.f != -1);
        return this.d.a(iVar, this.f - iVar.c()) ? -1 : 0;
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.c);
        com.applovin.exoplayer2.l.ai.a(this.b);
    }

    private static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f372a;
        private final x b;
        private final com.applovin.exoplayer2.e.j.b c;
        private final v d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar, String str, int i) throws ai {
            this.f372a = jVar;
            this.b = xVar;
            this.c = bVar;
            int i2 = (bVar.b * bVar.f) / 8;
            if (bVar.e != i2) {
                throw ai.b("Expected block size: " + i2 + "; got: " + bVar.e, null);
            }
            int i3 = bVar.c * i2 * 8;
            int iMax = Math.max(i2, (bVar.c * i2) / 10);
            this.e = iMax;
            this.d = new v.a().f(str).d(i3).e(i3).f(iMax).k(bVar.b).l(bVar.c).m(i).a();
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i, long j) {
            this.f372a.a(new d(this.c, 1, i, j));
            this.b.a(this.d);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public boolean a(i iVar, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iA = this.b.a((g) iVar, (int) Math.min(i2 - i, j2), true);
                if (iA == -1) {
                    j2 = 0;
                } else {
                    this.g += iA;
                    j2 -= (long) iA;
                }
            }
            int i3 = this.c.e;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long jD = this.f + com.applovin.exoplayer2.l.ai.d(this.h, 1000000L, this.c.c);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(jD, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.j.a$a, reason: collision with other inner class name */
    private static final class C0028a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f371a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final j c;
        private final x d;
        private final com.applovin.exoplayer2.e.j.b e;
        private final int f;
        private final byte[] g;
        private final com.applovin.exoplayer2.l.y h;
        private final int i;
        private final v j;
        private int k;
        private long l;
        private int m;
        private long n;

        private static int a(int i, int i2) {
            return i * 2 * i2;
        }

        public C0028a(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar) throws ai {
            this.c = jVar;
            this.d = xVar;
            this.e = bVar;
            int iMax = Math.max(1, bVar.c / 10);
            this.i = iMax;
            com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bVar.g);
            yVar.j();
            int iJ = yVar.j();
            this.f = iJ;
            int i = bVar.b;
            int i2 = (((bVar.e - (i * 4)) * 8) / (bVar.f * i)) + 1;
            if (iJ != i2) {
                throw ai.b("Expected frames per block: " + i2 + "; got: " + iJ, null);
            }
            int iA = com.applovin.exoplayer2.l.ai.a(iMax, iJ);
            this.g = new byte[bVar.e * iA];
            this.h = new com.applovin.exoplayer2.l.y(iA * a(iJ, i));
            int i3 = ((bVar.c * bVar.e) * 8) / iJ;
            this.j = new v.a().f("audio/raw").d(i3).e(i3).f(a(iMax, i)).k(bVar.b).l(bVar.c).m(2).a();
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j) {
            this.k = 0;
            this.l = j;
            this.m = 0;
            this.n = 0L;
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i, long j) {
            this.c.a(new d(this.e, this.f, i, j));
            this.d.a(this.j);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        @Override // com.applovin.exoplayer2.e.j.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(com.applovin.exoplayer2.e.i r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.i
                int r1 = r6.m
                int r1 = r6.b(r1)
                int r0 = r0 - r1
                int r1 = r6.f
                int r0 = com.applovin.exoplayer2.l.ai.a(r0, r1)
                com.applovin.exoplayer2.e.j.b r1 = r6.e
                int r1 = r1.e
                int r0 = r0 * r1
                r1 = 0
                r3 = 1
                int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                int r2 = r6.k
                if (r2 >= r0) goto L3f
                int r2 = r0 - r2
                long r4 = (long) r2
                long r4 = java.lang.Math.min(r4, r8)
                int r2 = (int) r4
                byte[] r4 = r6.g
                int r5 = r6.k
                int r2 = r7.a(r4, r5, r2)
                r4 = -1
                if (r2 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.k
                int r4 = r4 + r2
                r6.k = r4
                goto L1f
            L3f:
                int r7 = r6.k
                com.applovin.exoplayer2.e.j.b r8 = r6.e
                int r8 = r8.e
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.g
                com.applovin.exoplayer2.l.y r9 = r6.h
                r6.a(r8, r7, r9)
                int r8 = r6.k
                com.applovin.exoplayer2.e.j.b r9 = r6.e
                int r9 = r9.e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.k = r8
                com.applovin.exoplayer2.l.y r7 = r6.h
                int r7 = r7.b()
                com.applovin.exoplayer2.e.x r8 = r6.d
                com.applovin.exoplayer2.l.y r9 = r6.h
                r8.a(r9, r7)
                int r8 = r6.m
                int r8 = r8 + r7
                r6.m = r8
                int r7 = r6.b(r8)
                int r8 = r6.i
                if (r7 < r8) goto L77
                r6.a(r8)
            L77:
                if (r1 == 0) goto L84
                int r7 = r6.m
                int r7 = r6.b(r7)
                if (r7 <= 0) goto L84
                r6.a(r7)
            L84:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.j.a.C0028a.a(com.applovin.exoplayer2.e.i, long):boolean");
        }

        private void a(int i) {
            long jD = this.l + com.applovin.exoplayer2.l.ai.d(this.n, 1000000L, this.e.c);
            int iC = c(i);
            this.d.a(jD, 1, iC, this.m - iC, null);
            this.n += (long) i;
            this.m -= iC;
        }

        private void a(byte[] bArr, int i, com.applovin.exoplayer2.l.y yVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.e.b; i3++) {
                    a(bArr, i2, i3, yVar.d());
                }
            }
            int iC = c(this.f * i);
            yVar.d(0);
            yVar.c(iC);
        }

        private void a(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.e.e;
            int i4 = this.e.b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iA = (short) (((bArr[i5 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i5] & UByte.MAX_VALUE));
            int iMin = Math.min(bArr[i5 + 2] & UByte.MAX_VALUE, 88);
            int i8 = b[iMin];
            int i9 = ((i * this.f * i4) + i2) * 2;
            bArr2[i9] = (byte) (iA & 255);
            bArr2[i9 + 1] = (byte) (iA >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b2 = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b2 & Ascii.SI : (b2 & UByte.MAX_VALUE) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iA = com.applovin.exoplayer2.l.ai.a(iA + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iA & 255);
                bArr2[i9 + 1] = (byte) (iA >> 8);
                int i13 = iMin + f371a[i11];
                int[] iArr = b;
                iMin = com.applovin.exoplayer2.l.ai.a(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int b(int i) {
            return i / (this.e.b * 2);
        }

        private int c(int i) {
            return a(i, this.e.b);
        }
    }
}
