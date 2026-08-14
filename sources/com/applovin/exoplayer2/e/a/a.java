package com.applovin.exoplayer2.e.a;

import android.net.Uri;
import com.applovin.exoplayer2.e.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    private static final int[] c;
    private static final int f;
    private final byte[] g;
    private final int h;
    private boolean i;
    private long j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private int o;
    private int p;
    private long q;
    private j r;
    private x s;
    private v t;
    private boolean u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f266a = new l() { // from class: com.applovin.exoplayer2.e.a.a$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return a.d();
        }
    };
    private static final int[] b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] d = ai.c("#!AMR\n");
    private static final byte[] e = ai.c("#!AMR-WB\n");

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        c = iArr;
        f = iArr[8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new a()};
    }

    public a() {
        this(0);
    }

    public a(int i) {
        this.h = (i & 2) != 0 ? i | 1 : i;
        this.g = new byte[1];
        this.o = -1;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return b(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.r = jVar;
        this.s = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        if (iVar.c() == 0 && !b(iVar)) {
            throw com.applovin.exoplayer2.ai.b("Could not find AMR header.", null);
        }
        a();
        int iC = c(iVar);
        a(iVar.d(), iC);
        return iC;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.j = 0L;
        this.k = 0;
        this.l = 0;
        if (j != 0) {
            v vVar = this.t;
            if (vVar instanceof d) {
                this.q = ((d) vVar).b(j);
                return;
            }
        }
        this.q = 0L;
    }

    private boolean b(i iVar) throws IOException {
        byte[] bArr = d;
        if (a(iVar, bArr)) {
            this.i = false;
            iVar.b(bArr.length);
            return true;
        }
        byte[] bArr2 = e;
        if (!a(iVar, bArr2)) {
            return false;
        }
        this.i = true;
        iVar.b(bArr2.length);
        return true;
    }

    private static boolean a(i iVar, byte[] bArr) throws IOException {
        iVar.a();
        byte[] bArr2 = new byte[bArr.length];
        iVar.d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void a() {
        if (this.u) {
            return;
        }
        this.u = true;
        boolean z = this.i;
        this.s.a(new v.a().f(z ? "audio/amr-wb" : "audio/3gpp").f(f).k(1).l(z ? 16000 : GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY).a());
    }

    private int c(i iVar) throws IOException {
        if (this.l == 0) {
            try {
                int iD = d(iVar);
                this.k = iD;
                this.l = iD;
                if (this.o == -1) {
                    this.n = iVar.c();
                    this.o = this.k;
                }
                if (this.o == this.k) {
                    this.p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.s.a((g) iVar, this.l, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.l - iA;
        this.l = i;
        if (i > 0) {
            return 0;
        }
        this.s.a(this.q + this.j, 1, this.k, 0, null);
        this.j += 20000;
        return 0;
    }

    private int d(i iVar) throws IOException {
        iVar.a();
        iVar.d(this.g, 0, 1);
        byte b2 = this.g[0];
        if ((b2 & 131) > 0) {
            throw com.applovin.exoplayer2.ai.b("Invalid padding bits for frame header " + ((int) b2), null);
        }
        return a((b2 >> 3) & 15);
    }

    private int a(int i) throws com.applovin.exoplayer2.ai {
        if (b(i)) {
            return this.i ? c[i] : b[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw com.applovin.exoplayer2.ai.b(sb.toString(), null);
    }

    private boolean b(int i) {
        return i >= 0 && i <= 15 && (c(i) || d(i));
    }

    private boolean c(int i) {
        return this.i && (i < 10 || i > 13);
    }

    private boolean d(int i) {
        return !this.i && (i < 12 || i > 14);
    }

    private void a(long j, int i) {
        int i2;
        if (this.m) {
            return;
        }
        int i3 = this.h;
        if ((i3 & 1) == 0 || j == -1 || ((i2 = this.o) != -1 && i2 != this.k)) {
            v.b bVar = new v.b(-9223372036854775807L);
            this.t = bVar;
            this.r.a(bVar);
            this.m = true;
            return;
        }
        if (this.p >= 20 || i == -1) {
            com.applovin.exoplayer2.e.v vVarA = a(j, (i3 & 2) != 0);
            this.t = vVarA;
            this.r.a(vVarA);
            this.m = true;
        }
    }

    private com.applovin.exoplayer2.e.v a(long j, boolean z) {
        return new d(j, this.n, a(this.o, 20000L), this.o, z);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.s);
        ai.a(this.r);
    }

    private static int a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }
}
