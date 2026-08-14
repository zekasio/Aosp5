package com.applovin.exoplayer2.e.i;

import android.net.Uri;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f342a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.i.e$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return e.a();
        }
    };
    private final int b;
    private final f c;
    private final com.applovin.exoplayer2.l.y d;
    private final com.applovin.exoplayer2.l.y e;
    private final com.applovin.exoplayer2.l.x f;
    private com.applovin.exoplayer2.e.j g;
    private long h;
    private long i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    public e() {
        this(0);
    }

    public e(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.c = new f(true);
        this.d = new com.applovin.exoplayer2.l.y(2048);
        this.j = -1;
        this.i = -1L;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(10);
        this.e = yVar;
        this.f = new com.applovin.exoplayer2.l.x(yVar.d());
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int iB = b(iVar);
        int i = iB;
        int i2 = 0;
        int i3 = 0;
        do {
            iVar.d(this.e.d(), 0, 2);
            this.e.d(0);
            if (f.a(this.e.i())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                iVar.d(this.e.d(), 0, 4);
                this.f.a(14);
                int iC = this.f.c(13);
                if (iC <= 6) {
                    i++;
                    iVar.a();
                    iVar.c(i);
                } else {
                    iVar.c(iC - 6);
                    i3 += iC;
                }
            } else {
                i++;
                iVar.a();
                iVar.c(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iB < 8192);
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.g = jVar;
        this.c.a(jVar, new ad.d(0, 1));
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.l = false;
        this.c.a();
        this.h = j2;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.g);
        long jD = iVar.d();
        int i = this.b;
        if ((i & 2) != 0 || ((i & 1) != 0 && jD != -1)) {
            c(iVar);
        }
        int iA = iVar.a(this.d.d(), 0, 2048);
        boolean z = iA == -1;
        a(jD, z);
        if (z) {
            return -1;
        }
        this.d.d(0);
        this.d.c(iA);
        if (!this.l) {
            this.c.a(this.h, 4);
            this.l = true;
        }
        this.c.a(this.d);
        return 0;
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i = 0;
        while (true) {
            iVar.d(this.e.d(), 0, 10);
            this.e.d(0);
            if (this.e.m() != 4801587) {
                break;
            }
            this.e.e(3);
            int iV = this.e.v();
            i += iV + 10;
            iVar.c(iV);
        }
        iVar.a();
        iVar.c(i);
        if (this.i == -1) {
            this.i = i;
        }
        return i;
    }

    private void a(long j, boolean z) {
        if (this.m) {
            return;
        }
        boolean z2 = (this.b & 1) != 0 && this.j > 0;
        if (z2 && this.c.c() == -9223372036854775807L && !z) {
            return;
        }
        if (z2 && this.c.c() != -9223372036854775807L) {
            this.g.a(b(j, (this.b & 2) != 0));
        } else {
            this.g.a(new v.b(-9223372036854775807L));
        }
        this.m = true;
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int iC;
        if (this.k) {
            return;
        }
        this.j = -1;
        iVar.a();
        long j = 0;
        if (iVar.c() == 0) {
            b(iVar);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!iVar.b(this.e.d(), 0, 2, true)) {
                    break;
                }
                this.e.d(0);
                if (!f.a(this.e.i())) {
                    break;
                }
                if (!iVar.b(this.e.d(), 0, 4, true)) {
                    break;
                }
                this.f.a(14);
                iC = this.f.c(13);
                if (iC <= 6) {
                    this.k = true;
                    throw ai.b("Malformed ADTS stream", null);
                }
                j += (long) iC;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (iVar.b(iC - 6, true));
        i = i2;
        iVar.a();
        if (i > 0) {
            this.j = (int) (j / ((long) i));
        } else {
            this.j = -1;
        }
        this.k = true;
    }

    private com.applovin.exoplayer2.e.v b(long j, boolean z) {
        return new com.applovin.exoplayer2.e.d(j, this.i, a(this.j, this.c.c()), this.j, z);
    }

    private static int a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }
}
