package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.b.j;
import com.applovin.exoplayer2.l.ai;
import com.google.android.gms.games.GamesStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.b.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f75a = false;
    private long A;
    private long B;
    private long C;
    private long D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private float I;
    private com.applovin.exoplayer2.b.f[] J;
    private ByteBuffer[] K;
    private ByteBuffer L;
    private int M;
    private ByteBuffer N;
    private byte[] O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private k W;
    private boolean X;
    private long Y;
    private boolean Z;
    private boolean aa;
    private final com.applovin.exoplayer2.b.e b;
    private final a c;
    private final boolean d;
    private final m e;
    private final x f;
    private final com.applovin.exoplayer2.b.f[] g;
    private final com.applovin.exoplayer2.b.f[] h;
    private final ConditionVariable i;
    private final j j;
    private final ArrayDeque<e> k;
    private final boolean l;
    private final int m;
    private h n;
    private final f<h.b> o;
    private final f<h.e> p;
    private h.c q;
    private b r;
    private b s;
    private AudioTrack t;
    private com.applovin.exoplayer2.b.d u;
    private e v;
    private e w;
    private am x;
    private ByteBuffer y;
    private int z;

    public interface a {
        long a(long j);

        am a(am amVar);

        boolean a(boolean z);

        com.applovin.exoplayer2.b.f[] a();

        long b();
    }

    public static final class d extends RuntimeException {
        private d(String str) {
            super(str);
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.b.f[] f78a;
        private final u b;
        private final w c;

        public c(com.applovin.exoplayer2.b.f... fVarArr) {
            this(fVarArr, new u(), new w());
        }

        public c(com.applovin.exoplayer2.b.f[] fVarArr, u uVar, w wVar) {
            com.applovin.exoplayer2.b.f[] fVarArr2 = new com.applovin.exoplayer2.b.f[fVarArr.length + 2];
            this.f78a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.b = uVar;
            this.c = wVar;
            fVarArr2[fVarArr.length] = uVar;
            fVarArr2[fVarArr.length + 1] = wVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public com.applovin.exoplayer2.b.f[] a() {
            return this.f78a;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public am a(am amVar) {
            this.c.a(amVar.b);
            this.c.b(amVar.c);
            return amVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public boolean a(boolean z) {
            this.b.a(z);
            return z;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long a(long j) {
            return this.c.a(j);
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long b() {
            return this.b.k();
        }
    }

    public n(com.applovin.exoplayer2.b.e eVar, a aVar, boolean z, boolean z2, int i) {
        this.b = eVar;
        this.c = (a) com.applovin.exoplayer2.l.a.b(aVar);
        this.d = ai.f611a >= 21 && z;
        this.l = ai.f611a >= 23 && z2;
        this.m = ai.f611a >= 29 ? i : 0;
        this.i = new ConditionVariable(true);
        this.j = new j(new g());
        m mVar = new m();
        this.e = mVar;
        x xVar = new x();
        this.f = xVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new t(), mVar, xVar);
        Collections.addAll(arrayList, aVar.a());
        this.g = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[0]);
        this.h = new com.applovin.exoplayer2.b.f[]{new p()};
        this.I = 1.0f;
        this.u = com.applovin.exoplayer2.b.d.f61a;
        this.V = 0;
        this.W = new k(0, 0.0f);
        this.w = new e(am.f38a, false, 0L, 0L);
        this.x = am.f38a;
        this.Q = -1;
        this.J = new com.applovin.exoplayer2.b.f[0];
        this.K = new ByteBuffer[0];
        this.k = new ArrayDeque<>();
        this.o = new f<>(100L);
        this.p = new f<>(100L);
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(h.c cVar) {
        this.q = cVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(com.applovin.exoplayer2.v vVar) {
        return b(vVar) != 0;
    }

    @Override // com.applovin.exoplayer2.b.h
    public int b(com.applovin.exoplayer2.v vVar) {
        if (!"audio/raw".equals(vVar.l)) {
            return ((this.Z || !a(vVar, this.u)) && !a(vVar, this.b)) ? 0 : 2;
        }
        if (ai.d(vVar.A)) {
            return (vVar.A == 2 || (this.d && vVar.A == 4)) ? 2 : 1;
        }
        com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Invalid PCM encoding: " + vVar.A);
        return 0;
    }

    @Override // com.applovin.exoplayer2.b.h
    public long a(boolean z) {
        if (!y() || this.G) {
            return Long.MIN_VALUE;
        }
        return d(c(Math.min(this.j.a(z), this.s.b(A()))));
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.v vVar, int i, int[] iArr) throws h.a {
        int iC;
        com.applovin.exoplayer2.b.f[] fVarArr;
        int iIntValue;
        int iB;
        int i2;
        int i3;
        int i4;
        com.applovin.exoplayer2.b.f[] fVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(vVar.l)) {
            com.applovin.exoplayer2.l.a.a(ai.d(vVar.A));
            int iC2 = ai.c(vVar.A, vVar.y);
            if (d(vVar.A)) {
                fVarArr2 = this.h;
            } else {
                fVarArr2 = this.g;
            }
            this.f.a(vVar.B, vVar.C);
            if (ai.f611a < 21 && vVar.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.e.a(iArr2);
            f.a aVar = new f.a(vVar.z, vVar.y, vVar.A);
            for (com.applovin.exoplayer2.b.f fVar : fVarArr2) {
                try {
                    f.a aVarA = fVar.a(aVar);
                    if (fVar.a()) {
                        aVar = aVarA;
                    }
                } catch (f.b e2) {
                    throw new h.a(e2, vVar);
                }
            }
            int i6 = aVar.d;
            i3 = aVar.b;
            iIntValue = ai.f(aVar.c);
            fVarArr = fVarArr2;
            iB = i6;
            i4 = iC2;
            iC = ai.c(i6, aVar.c);
            i2 = 0;
        } else {
            com.applovin.exoplayer2.b.f[] fVarArr3 = new com.applovin.exoplayer2.b.f[0];
            int i7 = vVar.z;
            iC = -1;
            if (a(vVar, this.u)) {
                fVarArr = fVarArr3;
                iB = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.l), vVar.i);
                iIntValue = ai.f(vVar.y);
                i2 = 1;
            } else {
                Pair<Integer, Integer> pairB = b(vVar, this.b);
                if (pairB == null) {
                    throw new h.a("Unable to configure passthrough for: " + vVar, vVar);
                }
                int iIntValue2 = ((Integer) pairB.first).intValue();
                fVarArr = fVarArr3;
                iIntValue = ((Integer) pairB.second).intValue();
                iB = iIntValue2;
                i2 = 2;
            }
            i3 = i7;
            i4 = -1;
        }
        if (iB == 0) {
            throw new h.a("Invalid output encoding (mode=" + i2 + ") for: " + vVar, vVar);
        }
        if (iIntValue == 0) {
            throw new h.a("Invalid output channel config (mode=" + i2 + ") for: " + vVar, vVar);
        }
        this.Z = false;
        b bVar = new b(vVar, i4, i2, iC, i3, iIntValue, iB, i, this.l, fVarArr);
        if (y()) {
            this.r = bVar;
        } else {
            this.s = bVar;
        }
    }

    private void n() {
        com.applovin.exoplayer2.b.f[] fVarArr = this.s.i;
        ArrayList arrayList = new ArrayList();
        for (com.applovin.exoplayer2.b.f fVar : fVarArr) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.e();
            }
        }
        int size = arrayList.size();
        this.J = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[size]);
        this.K = new ByteBuffer[size];
        o();
    }

    private void o() {
        int i = 0;
        while (true) {
            com.applovin.exoplayer2.b.f[] fVarArr = this.J;
            if (i >= fVarArr.length) {
                return;
            }
            com.applovin.exoplayer2.b.f fVar = fVarArr[i];
            fVar.e();
            this.K[i] = fVar.c();
            i++;
        }
    }

    private void p() throws h.b {
        this.i.block();
        AudioTrack audioTrackQ = q();
        this.t = audioTrackQ;
        if (b(audioTrackQ)) {
            a(this.t);
            if (this.m != 3) {
                this.t.setOffloadDelayPadding(this.s.f77a.B, this.s.f77a.C);
            }
        }
        this.V = this.t.getAudioSessionId();
        this.j.a(this.t, this.s.c == 2, this.s.g, this.s.d, this.s.h);
        t();
        if (this.W.f74a != 0) {
            this.t.attachAuxEffect(this.W.f74a);
            this.t.setAuxEffectSendLevel(this.W.b);
        }
        this.G = true;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a() {
        this.T = true;
        if (y()) {
            this.j.a();
            this.t.play();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b() {
        this.F = true;
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.L;
        com.applovin.exoplayer2.l.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.r != null) {
            if (!s()) {
                return false;
            }
            if (!this.r.a(this.s)) {
                B();
                if (e()) {
                    return false;
                }
                j();
            } else {
                this.s = this.r;
                this.r = null;
                if (b(this.t) && this.m != 3) {
                    this.t.setOffloadEndOfStream();
                    this.t.setOffloadDelayPadding(this.s.f77a.B, this.s.f77a.C);
                    this.aa = true;
                }
            }
            b(j);
        }
        if (!y()) {
            try {
                p();
            } catch (h.b e2) {
                if (e2.b) {
                    throw e2;
                }
                this.o.a(e2);
                return false;
            }
        }
        this.o.a();
        if (this.G) {
            this.H = Math.max(0L, j);
            this.F = false;
            this.G = false;
            if (this.l && ai.f611a >= 23) {
                b(this.x);
            }
            b(j);
            if (this.T) {
                a();
            }
        }
        if (!this.j.a(A())) {
            return false;
        }
        if (this.L == null) {
            com.applovin.exoplayer2.l.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.s.c != 0 && this.E == 0) {
                int iA = a(this.s.g, byteBuffer);
                this.E = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.v != null) {
                if (!s()) {
                    return false;
                }
                b(j);
                this.v = null;
            }
            long jA = this.H + this.s.a(z() - this.f.l());
            if (!this.F && Math.abs(jA - j) > 200000) {
                this.q.a(new h.d(j, jA));
                this.F = true;
            }
            if (this.F) {
                if (!s()) {
                    return false;
                }
                long j2 = j - jA;
                this.H += j2;
                this.F = false;
                b(j);
                h.c cVar = this.q;
                if (cVar != null && j2 != 0) {
                    cVar.a();
                }
            }
            if (this.s.c == 0) {
                this.A += (long) byteBuffer.remaining();
            } else {
                this.B += (long) (this.E * i);
            }
            this.L = byteBuffer;
            this.M = i;
        }
        a(j);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        if (!this.j.d(A())) {
            return false;
        }
        com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Resetting stalled audio track");
        j();
        return true;
    }

    private AudioTrack q() throws h.b {
        try {
            return ((b) com.applovin.exoplayer2.l.a.b(this.s)).a(this.X, this.u, this.V);
        } catch (h.b e2) {
            r();
            h.c cVar = this.q;
            if (cVar != null) {
                cVar.a(e2);
            }
            throw e2;
        }
    }

    private void a(AudioTrack audioTrack) {
        if (this.n == null) {
            this.n = new h();
        }
        this.n.a(audioTrack);
    }

    private void a(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.K[i - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = com.applovin.exoplayer2.b.f.f64a;
                }
            }
            if (i == length) {
                a(byteBuffer, j);
            } else {
                com.applovin.exoplayer2.b.f fVar = this.J[i];
                if (i > this.Q) {
                    fVar.a(byteBuffer);
                }
                ByteBuffer byteBufferC = fVar.c();
                this.K[i] = byteBufferC;
                if (byteBufferC.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private void a(ByteBuffer byteBuffer, long j) throws Exception {
        int iA;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.N;
            if (byteBuffer2 != null) {
                com.applovin.exoplayer2.l.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.N = byteBuffer;
                if (ai.f611a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.O;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.O = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.O, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.P = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (ai.f611a < 21) {
                int iB = this.j.b(this.C);
                if (iB > 0) {
                    iA = this.t.write(this.O, this.P, Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.P += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                } else {
                    iA = 0;
                }
            } else if (this.X) {
                com.applovin.exoplayer2.l.a.b(j != -9223372036854775807L);
                iA = a(this.t, byteBuffer, iRemaining2, j);
            } else {
                iA = a(this.t, byteBuffer, iRemaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (iA < 0) {
                boolean zC = c(iA);
                if (zC) {
                    r();
                }
                h.e eVar = new h.e(iA, this.s.f77a, zC);
                h.c cVar = this.q;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (eVar.b) {
                    throw eVar;
                }
                this.p.a(eVar);
                return;
            }
            this.p.a();
            if (b(this.t)) {
                long j2 = this.D;
                if (j2 > 0) {
                    this.aa = false;
                }
                if (this.T && this.q != null && iA < iRemaining2 && !this.aa) {
                    this.q.b(this.j.c(j2));
                }
            }
            if (this.s.c == 0) {
                this.C += (long) iA;
            }
            if (iA == iRemaining2) {
                if (this.s.c != 0) {
                    com.applovin.exoplayer2.l.a.b(byteBuffer == this.L);
                    this.D += (long) (this.E * this.M);
                }
                this.N = null;
            }
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void c() throws h.e {
        if (!this.R && y() && s()) {
            B();
            this.R = true;
        }
    }

    private void r() {
        if (this.s.a()) {
            this.Z = true;
        }
    }

    private static boolean c(int i) {
        return (ai.f611a >= 24 && i == -6) || i == -32;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.Q
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.Q = r2
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.Q
            com.applovin.exoplayer2.b.f[] r5 = r9.J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.a(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.Q
            int r0 = r0 + r1
            r9.Q = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.Q = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.n.s():boolean");
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean d() {
        return !y() || (this.R && !e());
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean e() {
        return y() && this.j.f(A());
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(am amVar) {
        am amVar2 = new am(ai.a(amVar.b, 0.1f, 8.0f), ai.a(amVar.c, 0.1f, 8.0f));
        if (this.l && ai.f611a >= 23) {
            b(amVar2);
        } else {
            a(amVar2, m());
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public am f() {
        if (this.l) {
            return this.x;
        }
        return v();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b(boolean z) {
        a(v(), z);
    }

    public boolean m() {
        return w().b;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (this.u.equals(dVar)) {
            return;
        }
        this.u = dVar;
        if (this.X) {
            return;
        }
        j();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(int i) {
        if (this.V != i) {
            this.V = i;
            this.U = i != 0;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(k kVar) {
        if (this.W.equals(kVar)) {
            return;
        }
        int i = kVar.f74a;
        float f2 = kVar.b;
        if (this.t != null) {
            if (this.W.f74a != i) {
                this.t.attachAuxEffect(i);
            }
            if (i != 0) {
                this.t.setAuxEffectSendLevel(f2);
            }
        }
        this.W = kVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void g() {
        com.applovin.exoplayer2.l.a.b(ai.f611a >= 21);
        com.applovin.exoplayer2.l.a.b(this.U);
        if (this.X) {
            return;
        }
        this.X = true;
        j();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void h() {
        if (this.X) {
            this.X = false;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(float f2) {
        if (this.I != f2) {
            this.I = f2;
            t();
        }
    }

    private void t() {
        if (y()) {
            if (ai.f611a >= 21) {
                a(this.t, this.I);
            } else {
                b(this.t, this.I);
            }
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void i() {
        this.T = false;
        if (y() && this.j.c()) {
            this.t.pause();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.applovin.exoplayer2.b.n$1] */
    @Override // com.applovin.exoplayer2.b.h
    public void j() {
        if (y()) {
            u();
            if (this.j.b()) {
                this.t.pause();
            }
            if (b(this.t)) {
                ((h) com.applovin.exoplayer2.l.a.b(this.n)).b(this.t);
            }
            final AudioTrack audioTrack = this.t;
            this.t = null;
            if (ai.f611a < 21 && !this.U) {
                this.V = 0;
            }
            b bVar = this.r;
            if (bVar != null) {
                this.s = bVar;
                this.r = null;
            }
            this.j.d();
            this.i.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") { // from class: com.applovin.exoplayer2.b.n.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        n.this.i.open();
                    }
                }
            }.start();
        }
        this.p.a();
        this.o.a();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void k() {
        if (ai.f611a < 25) {
            j();
            return;
        }
        this.p.a();
        this.o.a();
        if (y()) {
            u();
            if (this.j.b()) {
                this.t.pause();
            }
            this.t.flush();
            this.j.d();
            this.j.a(this.t, this.s.c == 2, this.s.g, this.s.d, this.s.h);
            this.G = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void l() {
        j();
        for (com.applovin.exoplayer2.b.f fVar : this.g) {
            fVar.f();
        }
        for (com.applovin.exoplayer2.b.f fVar2 : this.h) {
            fVar2.f();
        }
        this.T = false;
        this.Z = false;
    }

    private void u() {
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.aa = false;
        this.E = 0;
        this.w = new e(v(), m(), 0L, 0L);
        this.H = 0L;
        this.v = null;
        this.k.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.S = false;
        this.R = false;
        this.Q = -1;
        this.y = null;
        this.z = 0;
        this.f.k();
        o();
    }

    private void b(am amVar) {
        if (y()) {
            try {
                this.t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(amVar.b).setPitch(amVar.c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                com.applovin.exoplayer2.l.q.b("DefaultAudioSink", "Failed to set playback params", e2);
            }
            amVar = new am(this.t.getPlaybackParams().getSpeed(), this.t.getPlaybackParams().getPitch());
            this.j.a(amVar.b);
        }
        this.x = amVar;
    }

    private void a(am amVar, boolean z) {
        e eVarW = w();
        if (amVar.equals(eVarW.f79a) && z == eVarW.b) {
            return;
        }
        e eVar = new e(amVar, z, -9223372036854775807L, -9223372036854775807L);
        if (y()) {
            this.v = eVar;
        } else {
            this.w = eVar;
        }
    }

    private am v() {
        return w().f79a;
    }

    private e w() {
        e eVar = this.v;
        if (eVar != null) {
            return eVar;
        }
        if (!this.k.isEmpty()) {
            return this.k.getLast();
        }
        return this.w;
    }

    private void b(long j) {
        am amVarA;
        if (x()) {
            amVarA = this.c.a(v());
        } else {
            amVarA = am.f38a;
        }
        am amVar = amVarA;
        boolean zA = x() ? this.c.a(m()) : false;
        this.k.add(new e(amVar, zA, Math.max(0L, j), this.s.b(A())));
        n();
        h.c cVar = this.q;
        if (cVar != null) {
            cVar.a(zA);
        }
    }

    private boolean x() {
        return (this.X || !"audio/raw".equals(this.s.f77a.l) || d(this.s.f77a.A)) ? false : true;
    }

    private boolean d(int i) {
        return this.d && ai.e(i);
    }

    private long c(long j) {
        while (!this.k.isEmpty() && j >= this.k.getFirst().d) {
            this.w = this.k.remove();
        }
        long j2 = j - this.w.d;
        if (this.w.f79a.equals(am.f38a)) {
            return this.w.c + j2;
        }
        if (this.k.isEmpty()) {
            return this.w.c + this.c.a(j2);
        }
        e first = this.k.getFirst();
        return first.c - ai.a(first.d - j, this.w.f79a.b);
    }

    private long d(long j) {
        return j + this.s.b(this.c.b());
    }

    private boolean y() {
        return this.t != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long z() {
        if (this.s.c == 0) {
            return this.A / ((long) this.s.b);
        }
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A() {
        if (this.s.c == 0) {
            return this.C / ((long) this.s.d);
        }
        return this.D;
    }

    private static boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        return b(vVar, eVar) != null;
    }

    private static Pair<Integer, Integer> b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        if (eVar == null) {
            return null;
        }
        int iB = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.l), vVar.i);
        int iA = 6;
        if (iB != 5 && iB != 6 && iB != 18 && iB != 17 && iB != 7 && iB != 8 && iB != 14) {
            return null;
        }
        if (iB == 18 && !eVar.a(18)) {
            iB = 6;
        } else if (iB == 8 && !eVar.a(8)) {
            iB = 7;
        }
        if (!eVar.a(iB)) {
            return null;
        }
        if (iB == 18) {
            if (ai.f611a >= 29 && (iA = a(18, vVar.z)) == 0) {
                com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            iA = vVar.y;
            if (iA > eVar.a()) {
                return null;
            }
        }
        int iE = e(iA);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iE));
    }

    private static int a(int i, int i2) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(ai.f(i3)).build(), audioAttributesBuild)) {
                return i3;
            }
        }
        return 0;
    }

    private static int e(int i) {
        if (ai.f611a <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (ai.f611a <= 26 && "fugu".equals(ai.b) && i == 1) {
            i = 2;
        }
        return ai.f(i);
    }

    private boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.d dVar) {
        int iB;
        int iF;
        int iA;
        if (ai.f611a < 29 || this.m == 0 || (iB = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.l), vVar.i)) == 0 || (iF = ai.f(vVar.y)) == 0 || (iA = a(b(vVar.z, iF, iB), dVar.a())) == 0) {
            return false;
        }
        if (iA == 1) {
            return ((vVar.B != 0 || vVar.C != 0) && (this.m == 1)) ? false : true;
        }
        if (iA == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        if (ai.f611a >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (ai.f611a == 30 && ai.d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean b(AudioTrack audioTrack) {
        return ai.f611a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return GamesStatusCodes.STATUS_REAL_TIME_CONNECTION_FAILED;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    private static int a(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return com.applovin.exoplayer2.b.b.a(byteBuffer);
            case 7:
            case 8:
                return o.a(byteBuffer);
            case 9:
                int iB = r.b(ai.a(byteBuffer, byteBuffer.position()));
                if (iB != -1) {
                    return iB;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int iB2 = com.applovin.exoplayer2.b.b.b(byteBuffer);
                if (iB2 == -1) {
                    return 0;
                }
                return com.applovin.exoplayer2.b.b.a(byteBuffer, iB2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.applovin.exoplayer2.b.c.a(byteBuffer);
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (ai.f611a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.y == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.y = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.y.putInt(1431633921);
        }
        if (this.z == 0) {
            this.y.putInt(4, i);
            this.y.putLong(8, j * 1000);
            this.y.position(0);
            this.z = i;
        }
        int iRemaining = this.y.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.y, iRemaining, 1);
            if (iWrite < 0) {
                this.z = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i);
        if (iA < 0) {
            this.z = 0;
            return iA;
        }
        this.z -= iA;
        return iA;
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private void B() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.j.e(A());
        this.t.stop();
        this.z = 0;
    }

    private final class h {
        private final Handler b = new Handler();
        private final AudioTrack.StreamEventCallback c;

        public h() {
            this.c = new AudioTrack.StreamEventCallback() { // from class: com.applovin.exoplayer2.b.n.h.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.t);
                    if (n.this.q == null || !n.this.T) {
                        return;
                    }
                    n.this.q.b();
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.t);
                    if (n.this.q == null || !n.this.T) {
                        return;
                    }
                    n.this.q.b();
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: com.applovin.exoplayer2.b.n$h$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.c);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.c);
            this.b.removeCallbacksAndMessages(null);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am f79a;
        public final boolean b;
        public final long c;
        public final long d;

        private e(am amVar, boolean z, long j, long j2) {
            this.f79a = amVar;
            this.b = z;
            this.c = j;
            this.d = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private final class g implements j.a {
        private g() {
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + n.this.z() + ", " + n.this.A();
            if (n.f75a) {
                throw new d(str);
            }
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", str);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + n.this.z() + ", " + n.this.A();
            if (n.f75a) {
                throw new d(str);
            }
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", str);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j) {
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j) {
            if (n.this.q != null) {
                n.this.q.a(j);
            }
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(int i, long j) {
            if (n.this.q != null) {
                n.this.q.a(i, j, SystemClock.elapsedRealtime() - n.this.Y);
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f77a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final com.applovin.exoplayer2.b.f[] i;

        public b(com.applovin.exoplayer2.v vVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, com.applovin.exoplayer2.b.f[] fVarArr) {
            this.f77a = vVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.i = fVarArr;
            this.h = a(i7, z);
        }

        public boolean a(b bVar) {
            return bVar.c == this.c && bVar.g == this.g && bVar.e == this.e && bVar.f == this.f && bVar.d == this.d;
        }

        public long a(long j) {
            return (j * 1000000) / ((long) this.f77a.z);
        }

        public long b(long j) {
            return (j * 1000000) / ((long) this.e);
        }

        public long c(long j) {
            return (j * ((long) this.e)) / 1000000;
        }

        public AudioTrack a(boolean z, com.applovin.exoplayer2.b.d dVar, int i) throws h.b {
            try {
                AudioTrack audioTrackB = b(z, dVar, i);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new h.b(state, this.e, this.f, this.h, this.f77a, a(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new h.b(0, this.e, this.f, this.h, this.f77a, a(), e);
            }
        }

        private AudioTrack b(boolean z, com.applovin.exoplayer2.b.d dVar, int i) {
            if (ai.f611a >= 29) {
                return c(z, dVar, i);
            }
            if (ai.f611a >= 21) {
                return d(z, dVar, i);
            }
            return a(dVar, i);
        }

        private AudioTrack c(boolean z, com.applovin.exoplayer2.b.d dVar, int i) {
            return new AudioTrack.Builder().setAudioAttributes(a(dVar, z)).setAudioFormat(n.b(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }

        private AudioTrack d(boolean z, com.applovin.exoplayer2.b.d dVar, int i) {
            return new AudioTrack(a(dVar, z), n.b(this.e, this.f, this.g), this.h, 1, i);
        }

        private AudioTrack a(com.applovin.exoplayer2.b.d dVar, int i) {
            int iG = ai.g(dVar.d);
            if (i == 0) {
                return new AudioTrack(iG, this.e, this.f, this.g, this.h, 1);
            }
            return new AudioTrack(iG, this.e, this.f, this.g, this.h, 1, i);
        }

        private int a(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.c;
            if (i2 == 0) {
                return a(z ? 8.0f : 1.0f);
            }
            if (i2 == 1) {
                return d(50000000L);
            }
            if (i2 == 2) {
                return d(250000L);
            }
            throw new IllegalStateException();
        }

        private int d(long j) {
            int iF = n.f(this.g);
            if (this.g == 5) {
                iF *= 2;
            }
            return (int) ((j * ((long) iF)) / 1000000);
        }

        private int a(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
            com.applovin.exoplayer2.l.a.b(minBufferSize != -2);
            int iA = ai.a(minBufferSize * 4, ((int) c(250000L)) * this.d, Math.max(minBufferSize, ((int) c(750000L)) * this.d));
            return f != 1.0f ? Math.round(iA * f) : iA;
        }

        private static AudioAttributes a(com.applovin.exoplayer2.b.d dVar, boolean z) {
            if (z) {
                return b();
            }
            return dVar.a();
        }

        private static AudioAttributes b() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public boolean a() {
            return this.c == 1;
        }
    }

    private static final class f<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f80a;
        private T b;
        private long c;

        public f(long j) {
            this.f80a = j;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void a(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = t;
                this.c = this.f80a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.c) {
                T t2 = this.b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.b;
                a();
                throw t3;
            }
        }

        public void a() {
            this.b = null;
        }
    }
}
