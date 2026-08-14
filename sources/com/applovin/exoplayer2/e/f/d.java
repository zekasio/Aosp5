package com.applovin.exoplayer2.e.f;

import android.net.Uri;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.f.e;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.s;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.e.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f290a = new l() { // from class: com.applovin.exoplayer2.e.f.d$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return d.d();
        }
    };
    private static final g.a b = new g.a() { // from class: com.applovin.exoplayer2.e.f.d$$ExternalSyntheticLambda1
        @Override // com.applovin.exoplayer2.g.e.g.a
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return d.a(i, i2, i3, i4, i5);
        }
    };
    private final int c;
    private final long d;
    private final y e;
    private final r.a f;
    private final com.applovin.exoplayer2.e.r g;
    private final s h;
    private final x i;
    private j j;
    private x k;
    private x l;
    private int m;
    private com.applovin.exoplayer2.g.a n;
    private long o;
    private long p;
    private long q;
    private int r;
    private e s;
    private boolean t;
    private boolean u;
    private long v;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    private static boolean a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new d()};
    }

    public d() {
        this(0);
    }

    public d(int i) {
        this(i, -9223372036854775807L);
    }

    public d(int i, long j) {
        this.c = (i & 2) != 0 ? i | 1 : i;
        this.d = j;
        this.e = new y(10);
        this.f = new r.a();
        this.g = new com.applovin.exoplayer2.e.r();
        this.o = -9223372036854775807L;
        this.h = new s();
        com.applovin.exoplayer2.e.g gVar = new com.applovin.exoplayer2.e.g();
        this.i = gVar;
        this.l = gVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return a(iVar, true);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.j = jVar;
        x xVarA = jVar.a(0, 1);
        this.k = xVarA;
        this.l = xVarA;
        this.j.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.m = 0;
        this.o = -9223372036854775807L;
        this.p = 0L;
        this.r = 0;
        this.v = j2;
        e eVar = this.s;
        if (!(eVar instanceof b) || ((b) eVar).b(j2)) {
            return;
        }
        this.u = true;
        this.l = this.i;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        int iB = b(iVar);
        if (iB == -1 && (this.s instanceof b)) {
            long jA = a(this.p);
            if (this.s.b() != jA) {
                ((b) this.s).d(jA);
                this.j.a(this.s);
            }
        }
        return iB;
    }

    public void a() {
        this.t = true;
    }

    private int b(i iVar) throws IOException {
        if (this.m == 0) {
            try {
                a(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.s == null) {
            e eVarE = e(iVar);
            this.s = eVarE;
            this.j.a(eVarE);
            this.l.a(new v.a().f(this.f.b).f(4096).k(this.f.e).l(this.f.d).n(this.g.f383a).o(this.g.b).a((this.c & 8) != 0 ? null : this.n).a());
            this.q = iVar.c();
        } else if (this.q != 0) {
            long jC = iVar.c();
            long j = this.q;
            if (jC < j) {
                iVar.b((int) (j - jC));
            }
        }
        return c(iVar);
    }

    private int c(i iVar) throws IOException {
        if (this.r == 0) {
            iVar.a();
            if (d(iVar)) {
                return -1;
            }
            this.e.d(0);
            int iQ = this.e.q();
            if (!a(iQ, this.m) || r.a(iQ) == -1) {
                iVar.b(1);
                this.m = 0;
                return 0;
            }
            this.f.a(iQ);
            if (this.o == -9223372036854775807L) {
                this.o = this.s.c(iVar.c());
                if (this.d != -9223372036854775807L) {
                    this.o += this.d - this.s.c(0L);
                }
            }
            this.r = this.f.c;
            e eVar = this.s;
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                bVar.a(a(this.p + ((long) this.f.g)), iVar.c() + ((long) this.f.c));
                if (this.u && bVar.b(this.v)) {
                    this.u = false;
                    this.l = this.k;
                }
            }
        }
        int iA = this.l.a((com.applovin.exoplayer2.k.g) iVar, this.r, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.r - iA;
        this.r = i;
        if (i > 0) {
            return 0;
        }
        this.l.a(a(this.p), 1, this.f.c, 0, null);
        this.p += (long) this.f.g;
        this.r = 0;
        return 0;
    }

    private long a(long j) {
        return this.o + ((j * 1000000) / ((long) this.f.d));
    }

    private boolean a(i iVar, boolean z) throws IOException {
        int i;
        int iB;
        int iA;
        int i2 = z ? 32768 : 131072;
        iVar.a();
        if (iVar.c() == 0) {
            com.applovin.exoplayer2.g.a aVarA = this.h.a(iVar, (this.c & 8) == 0 ? null : b);
            this.n = aVarA;
            if (aVarA != null) {
                this.g.a(aVarA);
            }
            iB = (int) iVar.b();
            if (!z) {
                iVar.b(iB);
            }
            i = 0;
        } else {
            i = 0;
            iB = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!d(iVar)) {
                this.e.d(0);
                int iQ = this.e.q();
                if ((i == 0 || a(iQ, i)) && (iA = r.a(iQ)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f.a(iQ);
                        i = iQ;
                    }
                    iVar.c(iA - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ai.b("Searched too many bytes.", null);
                    }
                    if (z) {
                        iVar.a();
                        iVar.c(iB + i5);
                    } else {
                        iVar.b(1);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            iVar.b(iB + i4);
        } else {
            iVar.a();
        }
        this.m = i;
        return true;
    }

    private boolean d(i iVar) throws IOException {
        e eVar = this.s;
        if (eVar != null) {
            long jC = eVar.c();
            if (jC != -1 && iVar.b() > jC - 4) {
                return true;
            }
        }
        try {
            return !iVar.b(this.e.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private e e(i iVar) throws IOException {
        long jA;
        long jC;
        e eVarF = f(iVar);
        c cVarA = a(this.n, iVar.c());
        if (this.t) {
            return new e.a();
        }
        if ((this.c & 4) != 0) {
            if (cVarA != null) {
                jA = cVarA.b();
                jC = cVarA.c();
            } else if (eVarF != null) {
                jA = eVarF.b();
                jC = eVarF.c();
            } else {
                jA = a(this.n);
                jC = -1;
            }
            eVarF = new b(jA, iVar.c(), jC);
        } else if (cVarA != null) {
            eVarF = cVarA;
        } else if (eVarF == null) {
            eVarF = null;
        }
        if (eVarF == null || !(eVarF.a() || (this.c & 1) == 0)) {
            return b(iVar, (this.c & 2) != 0);
        }
        return eVarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.exoplayer2.e.f.e f(com.applovin.exoplayer2.e.i r11) throws java.io.IOException {
        /*
            r10 = this;
            com.applovin.exoplayer2.l.y r5 = new com.applovin.exoplayer2.l.y
            com.applovin.exoplayer2.b.r$a r0 = r10.f
            int r0 = r0.c
            r5.<init>(r0)
            byte[] r0 = r5.d()
            com.applovin.exoplayer2.b.r$a r1 = r10.f
            int r1 = r1.c
            r6 = 0
            r11.d(r0, r6, r1)
            com.applovin.exoplayer2.b.r$a r0 = r10.f
            int r0 = r0.f87a
            r1 = 1
            r0 = r0 & r1
            r2 = 21
            if (r0 == 0) goto L2a
            com.applovin.exoplayer2.b.r$a r0 = r10.f
            int r0 = r0.e
            if (r0 == r1) goto L30
            r2 = 36
            r7 = 36
            goto L37
        L2a:
            com.applovin.exoplayer2.b.r$a r0 = r10.f
            int r0 = r0.e
            if (r0 == r1) goto L33
        L30:
            r7 = 21
            goto L37
        L33:
            r2 = 13
            r7 = 13
        L37:
            int r8 = a(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L66
            if (r8 != r9) goto L46
            goto L66
        L46:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L61
            long r0 = r11.d()
            long r2 = r11.c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f
            com.applovin.exoplayer2.e.f.f r0 = com.applovin.exoplayer2.e.f.f.a(r0, r2, r4, r5)
            com.applovin.exoplayer2.b.r$a r1 = r10.f
            int r1 = r1.c
            r11.b(r1)
            goto Lb6
        L61:
            r11.a()
            r0 = 0
            goto Lb6
        L66:
            long r0 = r11.d()
            long r2 = r11.c()
            com.applovin.exoplayer2.b.r$a r4 = r10.f
            com.applovin.exoplayer2.e.f.g r0 = com.applovin.exoplayer2.e.f.g.a(r0, r2, r4, r5)
            if (r0 == 0) goto La0
            com.applovin.exoplayer2.e.r r1 = r10.g
            boolean r1 = r1.a()
            if (r1 != 0) goto La0
            r11.a()
            int r7 = r7 + 141
            r11.c(r7)
            com.applovin.exoplayer2.l.y r1 = r10.e
            byte[] r1 = r1.d()
            r2 = 3
            r11.d(r1, r6, r2)
            com.applovin.exoplayer2.l.y r1 = r10.e
            r1.d(r6)
            com.applovin.exoplayer2.e.r r1 = r10.g
            com.applovin.exoplayer2.l.y r2 = r10.e
            int r2 = r2.m()
            r1.a(r2)
        La0:
            com.applovin.exoplayer2.b.r$a r1 = r10.f
            int r1 = r1.c
            r11.b(r1)
            if (r0 == 0) goto Lb6
            boolean r1 = r0.a()
            if (r1 != 0) goto Lb6
            if (r8 != r9) goto Lb6
            com.applovin.exoplayer2.e.f.e r11 = r10.b(r11, r6)
            return r11
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.f.d.f(com.applovin.exoplayer2.e.i):com.applovin.exoplayer2.e.f.e");
    }

    private e b(i iVar, boolean z) throws IOException {
        iVar.d(this.e.d(), 0, 4);
        this.e.d(0);
        this.f.a(this.e.q());
        return new a(iVar.d(), iVar.c(), this.f, z);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.k);
        com.applovin.exoplayer2.l.ai.a(this.j);
    }

    private static int a(y yVar, int i) {
        if (yVar.b() >= i + 4) {
            yVar.d(i);
            int iQ = yVar.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (yVar.b() < 40) {
            return 0;
        }
        yVar.d(36);
        return yVar.q() == 1447187017 ? 1447187017 : 0;
    }

    private static c a(com.applovin.exoplayer2.g.a aVar, long j) {
        if (aVar == null) {
            return null;
        }
        int iA = aVar.a();
        for (int i = 0; i < iA; i++) {
            a.InterfaceC0030a interfaceC0030aA = aVar.a(i);
            if (interfaceC0030aA instanceof com.applovin.exoplayer2.g.e.j) {
                return c.a(j, (com.applovin.exoplayer2.g.e.j) interfaceC0030aA, a(aVar));
            }
        }
        return null;
    }

    private static long a(com.applovin.exoplayer2.g.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int iA = aVar.a();
        for (int i = 0; i < iA; i++) {
            a.InterfaceC0030a interfaceC0030aA = aVar.a(i);
            if (interfaceC0030aA instanceof com.applovin.exoplayer2.g.e.l) {
                com.applovin.exoplayer2.g.e.l lVar = (com.applovin.exoplayer2.g.e.l) interfaceC0030aA;
                if (lVar.f.equals("TLEN")) {
                    return com.applovin.exoplayer2.h.b(Long.parseLong(lVar.b));
                }
            }
        }
        return -9223372036854775807L;
    }
}
