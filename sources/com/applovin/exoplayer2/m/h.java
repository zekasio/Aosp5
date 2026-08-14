package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.t;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.google.android.gms.common.Scopes;
import com.tapjoy.TJAdUnitConstants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.exoplayer2.f.j {
    private static final int[] c = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean d;
    private static boolean e;
    private int A;
    private long B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private int H;
    private float I;
    private o J;
    private boolean K;
    private int L;
    private l M;
    b b;
    private final Context f;
    private final m g;
    private final n.a h;
    private final long i;
    private final int j;
    private final boolean k;
    private a l;
    private boolean m;
    private boolean n;
    private Surface o;
    private d p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private long v;
    private long w;
    private long x;
    private int y;
    private int z;

    private static boolean g(long j) {
        return j < -30000;
    }

    private static boolean h(long j) {
        return j < -500000;
    }

    public h(Context context, com.applovin.exoplayer2.f.k kVar, long j, boolean z, Handler handler, n nVar, int i) {
        this(context, g.b.f405a, kVar, j, z, handler, nVar, i);
    }

    public h(Context context, g.b bVar, com.applovin.exoplayer2.f.k kVar, long j, boolean z, Handler handler, n nVar, int i) {
        super(2, bVar, kVar, z, 30.0f);
        this.i = j;
        this.j = i;
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.g = new m(applicationContext);
        this.h = new n.a(handler, nVar);
        this.k = aa();
        this.w = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.I = -1.0f;
        this.r = 1;
        this.L = 0;
        V();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j
    protected int a(com.applovin.exoplayer2.f.k kVar, v vVar) throws l.b {
        int i = 0;
        if (!u.b(vVar.l)) {
            return as.CC.b(0);
        }
        boolean z = vVar.o != null;
        List<com.applovin.exoplayer2.f.i> listA = a(kVar, vVar, z, false);
        if (z && listA.isEmpty()) {
            listA = a(kVar, vVar, false, false);
        }
        if (listA.isEmpty()) {
            return as.CC.b(1);
        }
        if (!c(vVar)) {
            return as.CC.b(2);
        }
        com.applovin.exoplayer2.f.i iVar = listA.get(0);
        boolean zA = iVar.a(vVar);
        int i2 = iVar.c(vVar) ? 16 : 8;
        if (zA) {
            List<com.applovin.exoplayer2.f.i> listA2 = a(kVar, vVar, z, true);
            if (!listA2.isEmpty()) {
                com.applovin.exoplayer2.f.i iVar2 = listA2.get(0);
                if (iVar2.a(vVar) && iVar2.c(vVar)) {
                    i = 32;
                }
            }
        }
        return as.CC.a(zA ? 4 : 3, i2, i);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z) throws l.b {
        return a(kVar, vVar, z, this.K);
    }

    private static List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z, boolean z2) throws l.b {
        Pair<Integer, Integer> pairA;
        String str = vVar.l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.applovin.exoplayer2.f.i> listA = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str, z, z2), vVar);
        if ("video/dolby-vision".equals(str) && (pairA = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listA.addAll(kVar.getDecoderInfos("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                listA.addAll(kVar.getDecoderInfos("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void a(boolean z, boolean z2) throws p {
        super.a(z, z2);
        boolean z3 = v().b;
        com.applovin.exoplayer2.l.a.b((z3 && this.L == 0) ? false : true);
        if (this.K != z3) {
            this.K = z3;
            J();
        }
        this.h.a(this.f408a);
        this.g.a();
        this.t = z2;
        this.u = false;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void a(long j, boolean z) throws p {
        super.a(j, z);
        T();
        this.g.c();
        this.B = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.z = 0;
        if (z) {
            S();
        } else {
            this.w = -9223372036854775807L;
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        d dVar;
        if (super.z() && (this.s || (((dVar = this.p) != null && this.o == dVar) || G() == null || this.K))) {
            this.w = -9223372036854775807L;
            return true;
        }
        if (this.w == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.w) {
            return true;
        }
        this.w = -9223372036854775807L;
        return false;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void p() {
        super.p();
        this.y = 0;
        this.x = SystemClock.elapsedRealtime();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.D = 0L;
        this.E = 0;
        this.g.b();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void q() {
        this.w = -9223372036854775807L;
        Y();
        Z();
        this.g.d();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void r() {
        V();
        T();
        this.q = false;
        this.g.e();
        this.b = null;
        try {
            super.r();
        } finally {
            this.h.b(this.f408a);
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void s() {
        try {
            super.s();
            d dVar = this.p;
            if (dVar != null) {
                if (this.o == dVar) {
                    this.o = null;
                }
                dVar.release();
                this.p = null;
            }
        } catch (Throwable th) {
            if (this.p != null) {
                Surface surface = this.o;
                d dVar2 = this.p;
                if (surface == dVar2) {
                    this.o = null;
                }
                dVar2.release();
                this.p = null;
            }
            throw th;
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i, Object obj) throws p {
        if (i == 1) {
            a(obj);
            return;
        }
        if (i == 7) {
            this.M = (l) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.L != iIntValue) {
                this.L = iIntValue;
                if (this.K) {
                    J();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5) {
                this.g.a(((Integer) obj).intValue());
                return;
            } else {
                super.a(i, obj);
                return;
            }
        }
        this.r = ((Integer) obj).intValue();
        com.applovin.exoplayer2.f.g gVarG = G();
        if (gVarG != null) {
            gVarG.c(this.r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.applovin.exoplayer2.m.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.exoplayer2.m.h] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.applovin.exoplayer2.m.d] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a(Object obj) throws p {
        ?? A = obj instanceof Surface ? (Surface) obj : 0;
        if (A == 0) {
            d dVar = this.p;
            if (dVar != null) {
                A = dVar;
            } else {
                com.applovin.exoplayer2.f.i iVarI = I();
                if (iVarI != null && b(iVarI)) {
                    A = d.a(this.f, iVarI.g);
                    this.p = A;
                }
            }
        }
        if (this.o != A) {
            this.o = A;
            this.g.a(A);
            this.q = false;
            int iD_ = d_();
            com.applovin.exoplayer2.f.g gVarG = G();
            if (gVarG != null) {
                if (ai.f611a >= 23 && A != 0 && !this.m) {
                    a(gVarG, A);
                } else {
                    J();
                    E();
                }
            }
            if (A != 0 && A != this.p) {
                X();
                T();
                if (iD_ == 2) {
                    S();
                    return;
                }
                return;
            }
            V();
            T();
            return;
        }
        if (A == 0 || A == this.p) {
            return;
        }
        X();
        U();
    }

    @Override // com.applovin.exoplayer2.f.j
    protected boolean a(com.applovin.exoplayer2.f.i iVar) {
        return this.o != null || b(iVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected boolean F() {
        return this.K && ai.f611a < 23;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected g.a a(com.applovin.exoplayer2.f.i iVar, v vVar, MediaCrypto mediaCrypto, float f) {
        d dVar = this.p;
        if (dVar != null && dVar.f652a != iVar.g) {
            this.p.release();
            this.p = null;
        }
        String str = iVar.c;
        a aVarA = a(iVar, vVar, u());
        this.l = aVarA;
        MediaFormat mediaFormatA = a(vVar, str, aVarA, f, this.k, this.K ? this.L : 0);
        if (this.o == null) {
            if (!b(iVar)) {
                throw new IllegalStateException();
            }
            if (this.p == null) {
                this.p = d.a(this.f, iVar.g);
            }
            this.o = this.p;
        }
        return g.a.a(iVar, mediaFormatA, vVar, this.o, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, v vVar, v vVar2) {
        com.applovin.exoplayer2.c.h hVarA = iVar.a(vVar, vVar2);
        int i = hVarA.e;
        if (vVar2.q > this.l.f657a || vVar2.r > this.l.b) {
            i |= 256;
        }
        if (a(iVar, vVar2) > this.l.c) {
            i |= 64;
        }
        int i2 = i;
        return new com.applovin.exoplayer2.c.h(iVar.f407a, vVar, vVar2, i2 != 0 ? 0 : hVarA.d, i2);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void M() {
        super.M();
        this.A = 0;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e, com.applovin.exoplayer2.ar
    public void a(float f, float f2) throws p {
        super.a(f, f2);
        this.g.a(f);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected float a(float f, v vVar, v[] vVarArr) {
        float fMax = -1.0f;
        for (v vVar2 : vVarArr) {
            float f2 = vVar2.s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(String str, long j, long j2) {
        this.h.a(str, j, j2);
        this.m = b(str);
        this.n = ((com.applovin.exoplayer2.f.i) com.applovin.exoplayer2.l.a.b(I())).b();
        if (ai.f611a < 23 || !this.K) {
            return;
        }
        this.b = new b((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(G()));
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(String str) {
        this.h.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(Exception exc) {
        q.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.h.a(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected com.applovin.exoplayer2.c.h a(w wVar) throws p {
        com.applovin.exoplayer2.c.h hVarA = super.a(wVar);
        this.h.a(wVar.b, hVarA);
        return hVarA;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(com.applovin.exoplayer2.c.g gVar) throws p {
        if (!this.K) {
            this.A++;
        }
        if (ai.f611a >= 23 || !this.K) {
            return;
        }
        e(gVar.d);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(v vVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        com.applovin.exoplayer2.f.g gVarG = G();
        if (gVarG != null) {
            gVarG.c(this.r);
        }
        if (this.K) {
            this.F = vVar.q;
            this.G = vVar.r;
        } else {
            com.applovin.exoplayer2.l.a.b(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(TJAdUnitConstants.String.WIDTH);
            }
            this.F = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(TJAdUnitConstants.String.HEIGHT);
            }
            this.G = integer2;
        }
        this.I = vVar.u;
        if (ai.f611a >= 21) {
            if (vVar.t == 90 || vVar.t == 270) {
                int i = this.F;
                this.F = this.G;
                this.G = i;
                this.I = 1.0f / this.I;
            }
        } else {
            this.H = vVar.t;
        }
        this.g.b(vVar.s);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void b(com.applovin.exoplayer2.c.g gVar) throws p {
        if (this.n) {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.e);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(G(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    protected boolean a(long j, long j2, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, v vVar) throws p {
        long j4;
        boolean z3;
        com.applovin.exoplayer2.l.a.b(gVar);
        if (this.v == -9223372036854775807L) {
            this.v = j;
        }
        if (j3 != this.B) {
            this.g.a(j3);
            this.B = j3;
        }
        long jQ = Q();
        long j5 = j3 - jQ;
        if (z && !z2) {
            a(gVar, i, j5);
            return true;
        }
        double dO = O();
        boolean z4 = d_() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d2 = j3 - j;
        Double.isNaN(d2);
        Double.isNaN(dO);
        long j6 = (long) (d2 / dO);
        if (z4) {
            j6 -= jElapsedRealtime - j2;
        }
        if (this.o == this.p) {
            if (!g(j6)) {
                return false;
            }
            a(gVar, i, j5);
            f(j6);
            return true;
        }
        long j7 = jElapsedRealtime - this.C;
        if (this.u ? this.s : !(z4 || this.t)) {
            j4 = j7;
            z3 = false;
        } else {
            j4 = j7;
            z3 = true;
        }
        if (this.w == -9223372036854775807L && j >= jQ && (z3 || (z4 && b(j6, j4)))) {
            long jNanoTime = System.nanoTime();
            a(j5, jNanoTime, vVar);
            if (ai.f611a >= 21) {
                a(gVar, i, j5, jNanoTime);
            } else {
                c(gVar, i, j5);
            }
            f(j6);
            return true;
        }
        if (z4 && j != this.v) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.g.b((j6 * 1000) + jNanoTime2);
            long j8 = (jB - jNanoTime2) / 1000;
            boolean z5 = this.w != -9223372036854775807L;
            if (b(j8, j2, z2) && b(j, z5)) {
                return false;
            }
            if (a(j8, j2, z2)) {
                if (z5) {
                    a(gVar, i, j5);
                } else {
                    b(gVar, i, j5);
                }
                f(j8);
                return true;
            }
            if (ai.f611a >= 21) {
                if (j8 < 50000) {
                    a(j5, jB, vVar);
                    a(gVar, i, j5, jB);
                    f(j8);
                    return true;
                }
            } else if (j8 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - WorkRequest.MIN_BACKOFF_MILLIS) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j5, jB, vVar);
                c(gVar, i, j5);
                f(j8);
                return true;
            }
        }
        return false;
    }

    private void a(long j, long j2, v vVar) {
        l lVar = this.M;
        if (lVar != null) {
            lVar.a(j, j2, vVar, H());
        }
    }

    protected void e(long j) throws p {
        c(j);
        W();
        this.f408a.e++;
        B();
        d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        P();
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void d(long j) {
        super.d(j);
        if (this.K) {
            return;
        }
        this.A--;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void C() {
        super.C();
        T();
    }

    protected boolean a(long j, long j2, boolean z) {
        return g(j) && !z;
    }

    protected boolean b(long j, long j2, boolean z) {
        return h(j) && !z;
    }

    protected boolean b(long j, long j2) {
        return g(j) && j2 > 100000;
    }

    protected void a(com.applovin.exoplayer2.f.g gVar, int i, long j) {
        ah.a("skipVideoBuffer");
        gVar.a(i, false);
        ah.a();
        this.f408a.f++;
    }

    protected void b(com.applovin.exoplayer2.f.g gVar, int i, long j) {
        ah.a("dropVideoBuffer");
        gVar.a(i, false);
        ah.a();
        e(1);
    }

    protected boolean b(long j, boolean z) throws p {
        int iB = b(j);
        if (iB == 0) {
            return false;
        }
        this.f408a.i++;
        int i = this.A + iB;
        if (z) {
            this.f408a.f += i;
        } else {
            e(i);
        }
        K();
        return true;
    }

    protected void e(int i) {
        this.f408a.g += i;
        this.y += i;
        this.z += i;
        this.f408a.h = Math.max(this.z, this.f408a.h);
        int i2 = this.j;
        if (i2 <= 0 || this.y < i2) {
            return;
        }
        Y();
    }

    protected void f(long j) {
        this.f408a.a(j);
        this.D += j;
        this.E++;
    }

    protected void c(com.applovin.exoplayer2.f.g gVar, int i, long j) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i, true);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.f408a.e++;
        this.z = 0;
        B();
    }

    protected void a(com.applovin.exoplayer2.f.g gVar, int i, long j, long j2) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i, j2);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.f408a.e++;
        this.z = 0;
        B();
    }

    private boolean b(com.applovin.exoplayer2.f.i iVar) {
        return ai.f611a >= 23 && !this.K && !b(iVar.f407a) && (!iVar.g || d.a(this.f));
    }

    private void S() {
        this.w = this.i > 0 ? SystemClock.elapsedRealtime() + this.i : -9223372036854775807L;
    }

    private void T() {
        com.applovin.exoplayer2.f.g gVarG;
        this.s = false;
        if (ai.f611a < 23 || !this.K || (gVarG = G()) == null) {
            return;
        }
        this.b = new b(gVarG);
    }

    void B() {
        this.u = true;
        if (this.s) {
            return;
        }
        this.s = true;
        this.h.a(this.o);
        this.q = true;
    }

    private void U() {
        if (this.q) {
            this.h.a(this.o);
        }
    }

    private void V() {
        this.J = null;
    }

    private void W() {
        if (this.F == -1 && this.G == -1) {
            return;
        }
        o oVar = this.J;
        if (oVar != null && oVar.b == this.F && this.J.c == this.G && this.J.d == this.H && this.J.e == this.I) {
            return;
        }
        o oVar2 = new o(this.F, this.G, this.H, this.I);
        this.J = oVar2;
        this.h.a(oVar2);
    }

    private void X() {
        o oVar = this.J;
        if (oVar != null) {
            this.h.a(oVar);
        }
    }

    private void Y() {
        if (this.y > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.h.a(this.y, jElapsedRealtime - this.x);
            this.y = 0;
            this.x = jElapsedRealtime;
        }
    }

    private void Z() {
        int i = this.E;
        if (i != 0) {
            this.h.a(this.D, i);
            this.D = 0L;
            this.E = 0;
        }
    }

    private static void a(com.applovin.exoplayer2.f.g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gVar.a(bundle);
    }

    protected void a(com.applovin.exoplayer2.f.g gVar, Surface surface) {
        gVar.a(surface);
    }

    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected MediaFormat a(v vVar, String str, a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> pairA;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(TJAdUnitConstants.String.WIDTH, vVar.q);
        mediaFormat.setInteger(TJAdUnitConstants.String.HEIGHT, vVar.r);
        t.a(mediaFormat, vVar.n);
        t.a(mediaFormat, "frame-rate", vVar.s);
        t.a(mediaFormat, "rotation-degrees", vVar.t);
        t.a(mediaFormat, vVar.x);
        if ("video/dolby-vision".equals(vVar.l) && (pairA = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            t.a(mediaFormat, Scopes.PROFILE, ((Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f657a);
        mediaFormat.setInteger("max-height", aVar.b);
        t.a(mediaFormat, "max-input-size", aVar.c);
        if (ai.f611a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            a(mediaFormat, i);
        }
        return mediaFormat;
    }

    protected a a(com.applovin.exoplayer2.f.i iVar, v vVar, v[] vVarArr) {
        int iC;
        int iMax = vVar.q;
        int iMax2 = vVar.r;
        int iA = a(iVar, vVar);
        if (vVarArr.length == 1) {
            if (iA != -1 && (iC = c(iVar, vVar)) != -1) {
                iA = Math.min((int) (iA * 1.5f), iC);
            }
            return new a(iMax, iMax2, iA);
        }
        int length = vVarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            v vVarA = vVarArr[i];
            if (vVar.x != null && vVarA.x == null) {
                vVarA = vVarA.a().a(vVar.x).a();
            }
            if (iVar.a(vVar, vVarA).d != 0) {
                z |= vVarA.q == -1 || vVarA.r == -1;
                iMax = Math.max(iMax, vVarA.q);
                iMax2 = Math.max(iMax2, vVarA.r);
                iA = Math.max(iA, a(iVar, vVarA));
            }
        }
        if (z) {
            q.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointB = b(iVar, vVar);
            if (pointB != null) {
                iMax = Math.max(iMax, pointB.x);
                iMax2 = Math.max(iMax2, pointB.y);
                iA = Math.max(iA, c(iVar, vVar.a().g(iMax).h(iMax2).a()));
                q.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iA);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected com.applovin.exoplayer2.f.h a(Throwable th, com.applovin.exoplayer2.f.i iVar) {
        return new g(th, iVar, this.o);
    }

    private static Point b(com.applovin.exoplayer2.f.i iVar, v vVar) {
        boolean z = vVar.r > vVar.q;
        int i = z ? vVar.r : vVar.q;
        int i2 = z ? vVar.q : vVar.r;
        float f = i2 / i;
        for (int i3 : c) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (ai.f611a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point pointA = iVar.a(i5, i3);
                if (iVar.a(pointA.x, pointA.y, vVar.s)) {
                    return pointA;
                }
            } else {
                try {
                    int iA = ai.a(i3, 16) * 16;
                    int iA2 = ai.a(i4, 16) * 16;
                    if (iA * iA2 <= com.applovin.exoplayer2.f.l.b()) {
                        int i6 = z ? iA2 : iA;
                        if (!z) {
                            iA = iA2;
                        }
                        return new Point(i6, iA);
                    }
                } catch (l.b unused) {
                }
            }
        }
        return null;
    }

    protected static int a(com.applovin.exoplayer2.f.i iVar, v vVar) {
        if (vVar.m != -1) {
            int size = vVar.n.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += vVar.n.get(i).length;
            }
            return vVar.m + length;
        }
        return c(iVar, vVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(com.applovin.exoplayer2.f.i r10, com.applovin.exoplayer2.v r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.c(com.applovin.exoplayer2.f.i, com.applovin.exoplayer2.v):int");
    }

    private static boolean aa() {
        return "NVIDIA".equals(ai.c);
    }

    protected boolean b(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!d) {
                e = ab();
                d = true;
            }
        }
        return e;
    }

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f657a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.f657a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean ab() {
        /*
            Method dump skipped, instruction units count: 3050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.ab():boolean");
    }

    private final class b implements Handler.Callback, g.c {
        private final Handler b;

        public b(com.applovin.exoplayer2.f.g gVar) {
            Handler handlerA = ai.a((Handler.Callback) this);
            this.b = handlerA;
            gVar.a(this, handlerA);
        }

        @Override // com.applovin.exoplayer2.f.g.c
        public void a(com.applovin.exoplayer2.f.g gVar, long j, long j2) {
            if (ai.f611a < 30) {
                this.b.sendMessageAtFrontOfQueue(Message.obtain(this.b, 0, (int) (j >> 32), (int) j));
            } else {
                a(j);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(ai.b(message.arg1, message.arg2));
            return true;
        }

        private void a(long j) {
            if (this != h.this.b) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                h.this.R();
                return;
            }
            try {
                h.this.e(j);
            } catch (p e) {
                h.this.a(e);
            }
        }
    }
}
