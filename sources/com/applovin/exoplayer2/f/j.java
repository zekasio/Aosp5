package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.c$$ExternalSyntheticApiModelOutline0;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.n;
import com.applovin.exoplayer2.f.a;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.utility.platform.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends com.applovin.exoplayer2.e {
    private static final byte[] b = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private v A;
    private MediaFormat B;
    private boolean C;
    private float D;
    private ArrayDeque<i> E;
    private a F;
    private i G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private e S;
    private long T;
    private int U;
    private int V;
    private ByteBuffer W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.applovin.exoplayer2.c.e f408a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private long ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private p as;
    private long at;
    private long au;
    private int av;
    private final g.b c;
    private final k d;
    private final boolean e;
    private final float f;
    private final com.applovin.exoplayer2.c.g g;
    private final com.applovin.exoplayer2.c.g h;
    private final com.applovin.exoplayer2.c.g i;
    private final d j;
    private final af<v> k;
    private final ArrayList<Long> l;
    private final MediaCodec.BufferInfo m;
    private final long[] n;
    private final long[] o;
    private final long[] p;
    private v q;
    private v r;
    private com.applovin.exoplayer2.d.f s;
    private com.applovin.exoplayer2.d.f t;
    private MediaCrypto u;
    private boolean v;
    private long w;
    private float x;
    private float y;
    private g z;

    protected void C() {
    }

    protected void D() throws p {
    }

    protected boolean F() {
        return false;
    }

    protected float a(float f, v vVar, v[] vVarArr) {
        return -1.0f;
    }

    protected abstract int a(k kVar, v vVar) throws l.b;

    protected abstract g.a a(i iVar, v vVar, MediaCrypto mediaCrypto, float f);

    protected abstract List<i> a(k kVar, v vVar, boolean z) throws l.b;

    protected void a(com.applovin.exoplayer2.c.g gVar) throws p {
    }

    protected void a(v vVar, MediaFormat mediaFormat) throws p {
    }

    protected void a(Exception exc) {
    }

    protected void a(String str) {
    }

    protected void a(String str, long j, long j2) {
    }

    protected abstract boolean a(long j, long j2, g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, v vVar) throws p;

    protected boolean a(i iVar) {
        return true;
    }

    protected void b(com.applovin.exoplayer2.c.g gVar) throws p {
    }

    protected boolean b(v vVar) {
        return false;
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.as
    public final int o() {
        return 8;
    }

    @Override // com.applovin.exoplayer2.e
    protected void p() {
    }

    @Override // com.applovin.exoplayer2.e
    protected void q() {
    }

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f409a;
        public final boolean b;
        public final i c;
        public final String d;
        public final a e;

        public a(v vVar, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + vVar, th, vVar.l, z, null, a(i), null);
        }

        public a(v vVar, Throwable th, boolean z, i iVar) {
            this("Decoder init failed: " + iVar.f407a + ", " + vVar, th, vVar.l, z, iVar, ai.f611a >= 21 ? a(th) : null, null);
        }

        private a(String str, Throwable th, String str2, boolean z, i iVar, String str3, a aVar) {
            super(str, th);
            this.f409a = str2;
            this.b = z;
            this.c = iVar;
            this.d = str3;
            this.e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f409a, this.b, this.c, this.d, aVar);
        }

        private static String a(Throwable th) {
            if (c$$ExternalSyntheticApiModelOutline0.m$2(th)) {
                return c$$ExternalSyntheticApiModelOutline0.m220m((Object) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String a(int i) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }
    }

    public j(int i, g.b bVar, k kVar, boolean z, float f) {
        super(i);
        this.c = bVar;
        this.d = (k) com.applovin.exoplayer2.l.a.b(kVar);
        this.e = z;
        this.f = f;
        this.g = com.applovin.exoplayer2.c.g.f();
        this.h = new com.applovin.exoplayer2.c.g(0);
        this.i = new com.applovin.exoplayer2.c.g(2);
        d dVar = new d();
        this.j = dVar;
        this.k = new af<>();
        this.l = new ArrayList<>();
        this.m = new MediaCodec.BufferInfo();
        this.x = 1.0f;
        this.y = 1.0f;
        this.w = -9223372036854775807L;
        this.n = new long[10];
        this.o = new long[10];
        this.p = new long[10];
        this.at = -9223372036854775807L;
        this.au = -9223372036854775807L;
        dVar.f(0);
        dVar.b.order(ByteOrder.nativeOrder());
        this.D = -1.0f;
        this.H = 0;
        this.ad = 0;
        this.U = -1;
        this.V = -1;
        this.T = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.ae = 0;
        this.af = 0;
    }

    public void a(boolean z) {
        this.ap = z;
    }

    public void b(boolean z) {
        this.aq = z;
    }

    public void c(boolean z) {
        this.ar = z;
    }

    @Override // com.applovin.exoplayer2.as
    public final int a(v vVar) throws p {
        try {
            return a(this.d, vVar);
        } catch (l.b e) {
            throw a(e, vVar, 4002);
        }
    }

    protected final void E() throws p {
        v vVar;
        if (this.z != null || this.Z || (vVar = this.q) == null) {
            return;
        }
        if (this.t == null && b(vVar)) {
            d(this.q);
            return;
        }
        b(this.t);
        String str = this.q.l;
        com.applovin.exoplayer2.d.f fVar = this.s;
        if (fVar != null) {
            if (this.u == null) {
                n nVarC = c(fVar);
                if (nVarC == null) {
                    if (this.s.e() == null) {
                        return;
                    }
                } else {
                    try {
                        this.u = new MediaCrypto(nVarC.b, nVarC.c);
                        this.v = !nVarC.d && this.u.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw a(e, this.q, 6006);
                    }
                }
            }
            if (n.f256a) {
                int iC = this.s.c();
                if (iC == 1) {
                    f.a aVar = (f.a) com.applovin.exoplayer2.l.a.b(this.s.e());
                    throw a(aVar, this.q, aVar.f250a);
                }
                if (iC != 4) {
                    return;
                }
            }
        }
        try {
            a(this.u, this.v);
        } catch (a e2) {
            throw a(e2, this.q, 4001);
        }
    }

    protected final void a(p pVar) {
        this.as = pVar;
    }

    protected final void c(long j) throws p {
        v vVarA = this.k.a(j);
        if (vVarA == null && this.C) {
            vVarA = this.k.c();
        }
        if (vVarA != null) {
            this.r = vVarA;
        } else if (!this.C || this.r == null) {
            return;
        }
        a(this.r, this.B);
        this.C = false;
    }

    protected final g G() {
        return this.z;
    }

    protected final MediaFormat H() {
        return this.B;
    }

    protected final i I() {
        return this.G;
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(boolean z, boolean z2) throws p {
        this.f408a = new com.applovin.exoplayer2.c.e();
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(v[] vVarArr, long j, long j2) throws p {
        if (this.au == -9223372036854775807L) {
            com.applovin.exoplayer2.l.a.b(this.at == -9223372036854775807L);
            this.at = j;
            this.au = j2;
            return;
        }
        int i = this.av;
        if (i == this.o.length) {
            q.c("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.o[this.av - 1]);
        } else {
            this.av = i + 1;
        }
        long[] jArr = this.n;
        int i2 = this.av;
        jArr[i2 - 1] = j;
        this.o[i2 - 1] = j2;
        this.p[i2 - 1] = this.aj;
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(long j, boolean z) throws p {
        this.al = false;
        this.am = false;
        this.ao = false;
        if (this.Z) {
            this.j.a();
            this.i.a();
            this.aa = false;
        } else {
            K();
        }
        if (this.k.b() > 0) {
            this.an = true;
        }
        this.k.a();
        int i = this.av;
        if (i != 0) {
            this.au = this.o[i - 1];
            this.at = this.n[i - 1];
            this.av = 0;
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ar
    public void a(float f, float f2) throws p {
        this.x = f;
        this.y = f2;
        e(this.A);
    }

    @Override // com.applovin.exoplayer2.e
    protected void r() {
        this.q = null;
        this.at = -9223372036854775807L;
        this.au = -9223372036854775807L;
        this.av = 0;
        L();
    }

    @Override // com.applovin.exoplayer2.e
    protected void s() {
        try {
            B();
            J();
        } finally {
            a((com.applovin.exoplayer2.d.f) null);
        }
    }

    private void B() {
        this.ab = false;
        this.j.a();
        this.i.a();
        this.aa = false;
        this.Z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void J() {
        try {
            g gVar = this.z;
            if (gVar != null) {
                gVar.e();
                this.f408a.b++;
                a(this.G.f407a);
            }
            this.z = null;
            try {
                MediaCrypto mediaCrypto = this.u;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.z = null;
            try {
                MediaCrypto mediaCrypto2 = this.u;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j, long j2) throws p {
        boolean z = false;
        if (this.ao) {
            this.ao = false;
            aa();
        }
        p pVar = this.as;
        if (pVar != null) {
            this.as = null;
            throw pVar;
        }
        try {
            if (this.am) {
                D();
                return;
            }
            if (this.q != null || e(2)) {
                E();
                if (this.Z) {
                    ah.a("bypassRender");
                    while (c(j, j2)) {
                    }
                    ah.a();
                } else if (this.z != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    ah.a("drainAndFeed");
                    while (b(j, j2) && e(jElapsedRealtime)) {
                    }
                    while (V() && e(jElapsedRealtime)) {
                    }
                    ah.a();
                } else {
                    this.f408a.d += b(j);
                    e(1);
                }
                this.f408a.a();
            }
        } catch (IllegalStateException e) {
            if (a(e)) {
                a((Exception) e);
                if (ai.f611a >= 21 && c(e)) {
                    z = true;
                }
                if (z) {
                    J();
                }
                throw a(a(e, I()), this.q, z, 4003);
            }
            throw e;
        }
    }

    protected final boolean K() throws p {
        boolean zL = L();
        if (zL) {
            E();
        }
        return zL;
    }

    protected boolean L() {
        if (this.z == null) {
            return false;
        }
        if (this.af == 3 || this.J || ((this.K && !this.ai) || (this.L && this.ah))) {
            J();
            return true;
        }
        R();
        return false;
    }

    private void R() {
        try {
            this.z.d();
        } finally {
            M();
        }
    }

    protected void M() {
        T();
        U();
        this.T = -9223372036854775807L;
        this.ah = false;
        this.ag = false;
        this.P = false;
        this.Q = false;
        this.X = false;
        this.Y = false;
        this.l.clear();
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        e eVar = this.S;
        if (eVar != null) {
            eVar.a();
        }
        this.ae = 0;
        this.af = 0;
        this.ad = this.ac ? 1 : 0;
    }

    protected void N() {
        M();
        this.as = null;
        this.S = null;
        this.E = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.ai = false;
        this.D = -1.0f;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.R = false;
        this.ac = false;
        this.ad = 0;
        this.v = false;
    }

    protected h a(Throwable th, i iVar) {
        return new h(th, iVar);
    }

    private boolean e(int i) throws p {
        w wVarT = t();
        this.g.a();
        int iA = a(wVarT, this.g, i | 4);
        if (iA == -5) {
            a(wVarT);
            return true;
        }
        if (iA != -4 || !this.g.c()) {
            return false;
        }
        this.al = true;
        aa();
        return false;
    }

    private void a(MediaCrypto mediaCrypto, boolean z) throws a {
        if (this.E == null) {
            try {
                List<i> listD = d(z);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.E = arrayDeque;
                if (this.e) {
                    arrayDeque.addAll(listD);
                } else if (!listD.isEmpty()) {
                    this.E.add(listD.get(0));
                }
                this.F = null;
            } catch (l.b e) {
                throw new a(this.q, e, z, -49998);
            }
        }
        if (this.E.isEmpty()) {
            throw new a(this.q, (Throwable) null, z, -49999);
        }
        while (this.z == null) {
            i iVarPeekFirst = this.E.peekFirst();
            if (!a(iVarPeekFirst)) {
                return;
            }
            try {
                a(iVarPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                q.b("MediaCodecRenderer", "Failed to initialize decoder: " + iVarPeekFirst, e2);
                this.E.removeFirst();
                a aVar = new a(this.q, e2, z, iVarPeekFirst);
                a(aVar);
                if (this.F != null) {
                    this.F = this.F.a(aVar);
                } else {
                    this.F = aVar;
                }
                if (this.E.isEmpty()) {
                    throw this.F;
                }
            }
        }
        this.E = null;
    }

    private List<i> d(boolean z) throws l.b {
        List<i> listA = a(this.d, this.q, z);
        if (listA.isEmpty() && z) {
            listA = a(this.d, this.q, false);
            if (!listA.isEmpty()) {
                q.c("MediaCodecRenderer", "Drm session requires secure decoder for " + this.q.l + ", but no secure decoder available. Trying to proceed with " + listA + ".");
            }
        }
        return listA;
    }

    private void d(v vVar) {
        B();
        String str = vVar.l;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.j.g(1);
        } else {
            this.j.g(32);
        }
        this.Z = true;
    }

    private void a(i iVar, MediaCrypto mediaCrypto) throws Exception {
        g gVarB;
        String str = iVar.f407a;
        float fA = ai.f611a < 23 ? -1.0f : a(this.y, this.q, u());
        float f = fA > this.f ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ah.a("createCodec:" + str);
        g.a aVarA = a(iVar, this.q, mediaCrypto, f);
        if (this.ap && ai.f611a >= 23) {
            gVarB = new a.C0029a(a(), this.aq, this.ar).b(aVarA);
        } else {
            gVarB = this.c.b(aVarA);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.z = gVarB;
        this.G = iVar;
        this.D = f;
        this.A = this.q;
        this.H = c(str);
        this.I = a(str, this.A);
        this.J = b(str);
        this.K = d(str);
        this.L = e(str);
        this.M = g(str);
        this.N = f(str);
        this.O = b(str, this.A);
        this.R = b(iVar) || F();
        if (gVarB.a()) {
            this.ac = true;
            this.ad = 1;
            this.P = this.H != 0;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f407a)) {
            this.S = new e();
        }
        if (d_() == 2) {
            this.T = SystemClock.elapsedRealtime() + 1000;
        }
        this.f408a.f99a++;
        a(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    private boolean e(long j) {
        return this.w == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.w;
    }

    private boolean S() {
        return this.V >= 0;
    }

    private void T() {
        this.U = -1;
        this.h.b = null;
    }

    private void U() {
        this.V = -1;
        this.W = null;
    }

    private void a(com.applovin.exoplayer2.d.f fVar) {
        f.CC.a(this.t, fVar);
        this.t = fVar;
    }

    private void b(com.applovin.exoplayer2.d.f fVar) {
        f.CC.a(this.s, fVar);
        this.s = fVar;
    }

    private boolean V() throws p {
        g gVar = this.z;
        if (gVar == null || this.ae == 2 || this.al) {
            return false;
        }
        if (this.U < 0) {
            int iB = gVar.b();
            this.U = iB;
            if (iB < 0) {
                return false;
            }
            this.h.b = this.z.a(iB);
            this.h.a();
        }
        if (this.ae == 1) {
            if (!this.R) {
                this.ah = true;
                this.z.a(this.U, 0, 0, 0L, 4);
                T();
            }
            this.ae = 2;
            return false;
        }
        if (this.P) {
            this.P = false;
            ByteBuffer byteBuffer = this.h.b;
            byte[] bArr = b;
            byteBuffer.put(bArr);
            this.z.a(this.U, 0, bArr.length, 0L, 0);
            T();
            this.ag = true;
            return true;
        }
        if (this.ad == 1) {
            for (int i = 0; i < this.A.n.size(); i++) {
                this.h.b.put(this.A.n.get(i));
            }
            this.ad = 2;
        }
        int iPosition = this.h.b.position();
        w wVarT = t();
        try {
            int iA = a(wVarT, this.h, 0);
            if (g()) {
                this.ak = this.aj;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.ad == 2) {
                    this.h.a();
                    this.ad = 1;
                }
                a(wVarT);
                return true;
            }
            if (this.h.c()) {
                if (this.ad == 2) {
                    this.h.a();
                    this.ad = 1;
                }
                this.al = true;
                if (!this.ag) {
                    aa();
                    return false;
                }
                try {
                    if (!this.R) {
                        this.ah = true;
                        this.z.a(this.U, 0, 0, 0L, 4);
                        T();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw a(e, this.q, com.applovin.exoplayer2.h.b(e.getErrorCode()));
                }
            }
            if (!this.ag && !this.h.d()) {
                this.h.a();
                if (this.ad == 2) {
                    this.ad = 1;
                }
                return true;
            }
            boolean zG = this.h.g();
            if (zG) {
                this.h.f100a.a(iPosition);
            }
            if (this.I && !zG) {
                com.applovin.exoplayer2.l.v.a(this.h.b);
                if (this.h.b.position() == 0) {
                    return true;
                }
                this.I = false;
            }
            long jA = this.h.d;
            e eVar = this.S;
            if (eVar != null) {
                jA = eVar.a(this.q, this.h);
                this.aj = Math.max(this.aj, this.S.a(this.q));
            }
            long j = jA;
            if (this.h.b()) {
                this.l.add(Long.valueOf(j));
            }
            if (this.an) {
                this.k.a(j, this.q);
                this.an = false;
            }
            this.aj = Math.max(this.aj, j);
            this.h.h();
            if (this.h.e()) {
                b(this.h);
            }
            a(this.h);
            try {
                if (zG) {
                    this.z.a(this.U, 0, this.h.f100a, j, 0);
                } else {
                    this.z.a(this.U, 0, this.h.b.limit(), j, 0);
                }
                T();
                this.ag = true;
                this.ad = 0;
                this.f408a.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw a(e2, this.q, com.applovin.exoplayer2.h.b(e2.getErrorCode()));
            }
        } catch (g.a e3) {
            a(e3);
            e(0);
            R();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w r12) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.f.j.a(com.applovin.exoplayer2.w):com.applovin.exoplayer2.c.h");
    }

    protected void d(long j) {
        while (true) {
            int i = this.av;
            if (i == 0 || j < this.p[0]) {
                return;
            }
            long[] jArr = this.n;
            this.at = jArr[0];
            this.au = this.o[0];
            int i2 = i - 1;
            this.av = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.o;
            System.arraycopy(jArr2, 1, jArr2, 0, this.av);
            long[] jArr3 = this.p;
            System.arraycopy(jArr3, 1, jArr3, 0, this.av);
            C();
        }
    }

    protected com.applovin.exoplayer2.c.h a(i iVar, v vVar, v vVar2) {
        return new com.applovin.exoplayer2.c.h(iVar.f407a, vVar, vVar2, 0, 1);
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.am;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return this.q != null && (x() || S() || (this.T != -9223372036854775807L && SystemClock.elapsedRealtime() < this.T));
    }

    protected float O() {
        return this.x;
    }

    private boolean e(v vVar) throws p {
        if (ai.f611a >= 23 && this.z != null && this.af != 3 && d_() != 0) {
            float fA = a(this.y, vVar, u());
            float f = this.D;
            if (f == fA) {
                return true;
            }
            if (fA == -1.0f) {
                Y();
                return false;
            }
            if (f == -1.0f && fA <= this.f) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.z.a(bundle);
            this.D = fA;
        }
        return true;
    }

    private boolean W() {
        if (this.ag) {
            this.ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 1;
        }
        return true;
    }

    private boolean X() throws p {
        if (this.ag) {
            this.ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 2;
        } else {
            ac();
        }
        return true;
    }

    private void Y() throws p {
        if (this.ag) {
            this.ae = 1;
            this.af = 3;
        } else {
            ab();
        }
    }

    private boolean b(long j, long j2) throws p {
        boolean z;
        boolean zA;
        int iA;
        if (!S()) {
            if (this.M && this.ah) {
                try {
                    iA = this.z.a(this.m);
                } catch (IllegalStateException unused) {
                    aa();
                    if (this.am) {
                        J();
                    }
                    return false;
                }
            } else {
                iA = this.z.a(this.m);
            }
            if (iA < 0) {
                if (iA == -2) {
                    Z();
                    return true;
                }
                if (this.R && (this.al || this.ae == 2)) {
                    aa();
                }
                return false;
            }
            if (this.Q) {
                this.Q = false;
                this.z.a(iA, false);
                return true;
            }
            if (this.m.size == 0 && (this.m.flags & 4) != 0) {
                aa();
                return false;
            }
            this.V = iA;
            ByteBuffer byteBufferB = this.z.b(iA);
            this.W = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.m.offset);
                this.W.limit(this.m.offset + this.m.size);
            }
            if (this.N && this.m.presentationTimeUs == 0 && (this.m.flags & 4) != 0) {
                long j3 = this.aj;
                if (j3 != -9223372036854775807L) {
                    this.m.presentationTimeUs = j3;
                }
            }
            this.X = f(this.m.presentationTimeUs);
            this.Y = this.ak == this.m.presentationTimeUs;
            c(this.m.presentationTimeUs);
        }
        if (this.M && this.ah) {
            try {
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zA = a(j, j2, this.z, this.W, this.V, this.m.flags, 1, this.m.presentationTimeUs, this.X, this.Y, this.r);
            } catch (IllegalStateException unused3) {
                aa();
                if (this.am) {
                    J();
                }
                return z;
            }
        } else {
            z = false;
            zA = a(j, j2, this.z, this.W, this.V, this.m.flags, 1, this.m.presentationTimeUs, this.X, this.Y, this.r);
        }
        if (zA) {
            d(this.m.presentationTimeUs);
            boolean z2 = (this.m.flags & 4) != 0;
            U();
            if (!z2) {
                return true;
            }
            aa();
        }
        return z;
    }

    private void Z() {
        this.ai = true;
        MediaFormat mediaFormatC = this.z.c();
        if (this.H != 0 && mediaFormatC.getInteger(TJAdUnitConstants.String.WIDTH) == 32 && mediaFormatC.getInteger(TJAdUnitConstants.String.HEIGHT) == 32) {
            this.Q = true;
            return;
        }
        if (this.O) {
            mediaFormatC.setInteger("channel-count", 1);
        }
        this.B = mediaFormatC;
        this.C = true;
    }

    private void aa() throws p {
        int i = this.af;
        if (i == 1) {
            R();
            return;
        }
        if (i == 2) {
            R();
            ac();
        } else if (i == 3) {
            ab();
        } else {
            this.am = true;
            D();
        }
    }

    protected final void P() {
        this.ao = true;
    }

    protected final long Q() {
        return this.au;
    }

    protected static boolean c(v vVar) {
        return vVar.E == 0 || vVar.E == 2;
    }

    private boolean a(i iVar, v vVar, com.applovin.exoplayer2.d.f fVar, com.applovin.exoplayer2.d.f fVar2) throws p {
        n nVarC;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || ai.f611a < 23 || com.applovin.exoplayer2.h.e.equals(fVar.f()) || com.applovin.exoplayer2.h.e.equals(fVar2.f()) || (nVarC = c(fVar2)) == null) {
            return true;
        }
        return !iVar.g && (nVarC.d ? false : fVar2.a(vVar.l));
    }

    private void ab() throws p {
        J();
        E();
    }

    private boolean f(long j) {
        int size = this.l.size();
        for (int i = 0; i < size; i++) {
            if (this.l.get(i).longValue() == j) {
                this.l.remove(i);
                return true;
            }
        }
        return false;
    }

    private void ac() throws p {
        try {
            this.u.setMediaDrmSession(c(this.t).c);
            b(this.t);
            this.ae = 0;
            this.af = 0;
        } catch (MediaCryptoException e) {
            throw a(e, this.q, 6006);
        }
    }

    private n c(com.applovin.exoplayer2.d.f fVar) throws p {
        com.applovin.exoplayer2.c.b bVarG = fVar.g();
        if (bVarG != null && !(bVarG instanceof n)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + bVarG), this.q, 6001);
        }
        return (n) bVarG;
    }

    private boolean c(long j, long j2) throws p {
        com.applovin.exoplayer2.l.a.b(!this.am);
        if (this.j.l()) {
            if (!a(j, j2, null, this.j.b, this.V, 0, this.j.k(), this.j.i(), this.j.b(), this.j.c(), this.r)) {
                return false;
            }
            d(this.j.j());
            this.j.a();
        }
        if (this.al) {
            this.am = true;
            return false;
        }
        if (this.aa) {
            com.applovin.exoplayer2.l.a.b(this.j.a(this.i));
            this.aa = false;
        }
        if (this.ab) {
            if (this.j.l()) {
                return true;
            }
            B();
            this.ab = false;
            E();
            if (!this.Z) {
                return false;
            }
        }
        ad();
        if (this.j.l()) {
            this.j.h();
        }
        return this.j.l() || this.al || this.ab;
    }

    private void ad() throws p {
        com.applovin.exoplayer2.l.a.b(!this.al);
        w wVarT = t();
        this.i.a();
        do {
            this.i.a();
            int iA = a(wVarT, this.i, 0);
            if (iA == -5) {
                a(wVarT);
                return;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.i.c()) {
                    this.al = true;
                    return;
                }
                if (this.an) {
                    v vVar = (v) com.applovin.exoplayer2.l.a.b(this.q);
                    this.r = vVar;
                    a(vVar, (MediaFormat) null);
                    this.an = false;
                }
                this.i.h();
            }
        } while (this.j.a(this.i));
        this.aa = true;
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (ai.f611a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return c$$ExternalSyntheticApiModelOutline0.m$2(illegalStateException);
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (c$$ExternalSyntheticApiModelOutline0.m$2(illegalStateException)) {
            return c$$ExternalSyntheticApiModelOutline0.m220m((Object) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean b(String str) {
        return ai.f611a < 18 || (ai.f611a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (ai.f611a == 19 && ai.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private int c(String str) {
        if (ai.f611a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (ai.d.startsWith("SM-T585") || ai.d.startsWith("SM-A510") || ai.d.startsWith("SM-A520") || ai.d.startsWith("SM-J700"))) {
            return 2;
        }
        if (ai.f611a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(ai.b) || "flounder_lte".equals(ai.b) || "grouper".equals(ai.b) || "tilapia".equals(ai.b)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean a(String str, v vVar) {
        return ai.f611a < 21 && vVar.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean d(String str) {
        return ai.f611a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean b(i iVar) {
        String str = iVar.f407a;
        return (ai.f611a <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (ai.f611a <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((ai.f611a <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (Platform.MANUFACTURER_AMAZON.equals(ai.c) && "AFTS".equals(ai.d) && iVar.g));
    }

    private static boolean e(String str) {
        return (ai.f611a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (ai.f611a <= 19 && (("hb2000".equals(ai.b) || "stvm8".equals(ai.b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean f(String str) {
        return ai.f611a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(ai.c) && (ai.b.startsWith("baffin") || ai.b.startsWith("grand") || ai.b.startsWith("fortuna") || ai.b.startsWith("gprimelte") || ai.b.startsWith("j2y18lte") || ai.b.startsWith("ms01"));
    }

    private static boolean g(String str) {
        return ai.f611a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean b(String str, v vVar) {
        return ai.f611a <= 18 && vVar.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }
}
