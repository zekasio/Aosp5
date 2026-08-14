package com.applovin.exoplayer2.b;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.b.h;
import com.applovin.exoplayer2.f.g;
import com.applovin.exoplayer2.f.l;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q extends com.applovin.exoplayer2.f.j implements com.applovin.exoplayer2.l.s {
    private final Context b;
    private final g.a c;
    private final h d;
    private int e;
    private boolean f;
    private com.applovin.exoplayer2.v g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private ar.a m;

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return this;
    }

    public q(Context context, com.applovin.exoplayer2.f.k kVar, boolean z, Handler handler, g gVar, h hVar) {
        this(context, g.b.f405a, kVar, z, handler, gVar, hVar);
    }

    public q(Context context, g.b bVar, com.applovin.exoplayer2.f.k kVar, boolean z, Handler handler, g gVar, h hVar) {
        super(1, bVar, kVar, z, 44100.0f);
        this.b = context.getApplicationContext();
        this.d = hVar;
        this.c = new g.a(handler, gVar);
        hVar.a(new a());
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j
    protected int a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar) throws l.b {
        if (!com.applovin.exoplayer2.l.u.a(vVar.l)) {
            return as.CC.b(0);
        }
        int i = ai.f611a >= 21 ? 32 : 0;
        boolean z = vVar.E != 0;
        boolean zC = c(vVar);
        int i2 = 8;
        if (zC && this.d.a(vVar) && (!z || com.applovin.exoplayer2.f.l.a() != null)) {
            return as.CC.a(4, 8, i);
        }
        if ("audio/raw".equals(vVar.l) && !this.d.a(vVar)) {
            return as.CC.b(1);
        }
        if (!this.d.a(ai.b(2, vVar.y, vVar.z))) {
            return as.CC.b(1);
        }
        List<com.applovin.exoplayer2.f.i> listA = a(kVar, vVar, false);
        if (listA.isEmpty()) {
            return as.CC.b(1);
        }
        if (!zC) {
            return as.CC.b(2);
        }
        com.applovin.exoplayer2.f.i iVar = listA.get(0);
        boolean zA = iVar.a(vVar);
        if (zA && iVar.c(vVar)) {
            i2 = 16;
        }
        return as.CC.a(zA ? 4 : 3, i2, i);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar, boolean z) throws l.b {
        com.applovin.exoplayer2.f.i iVarA;
        String str = vVar.l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.d.a(vVar) && (iVarA = com.applovin.exoplayer2.f.l.a()) != null) {
            return Collections.singletonList(iVarA);
        }
        List<com.applovin.exoplayer2.f.i> listA = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str, z, false), vVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listA);
            arrayList.addAll(kVar.getDecoderInfos("audio/eac3", z, false));
            listA = arrayList;
        }
        return Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected boolean b(com.applovin.exoplayer2.v vVar) {
        return this.d.a(vVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected g.a a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, MediaCrypto mediaCrypto, float f) {
        this.e = a(iVar, vVar, u());
        this.f = b(iVar.f407a);
        MediaFormat mediaFormatA = a(vVar, iVar.c, this.e, f);
        this.g = (!"audio/raw".equals(iVar.b) || "audio/raw".equals(vVar.l)) ? null : vVar;
        return g.a.a(iVar, mediaFormatA, vVar, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v vVar2) {
        com.applovin.exoplayer2.c.h hVarA = iVar.a(vVar, vVar2);
        int i = hVarA.e;
        if (a(iVar, vVar2) > this.e) {
            i |= 64;
        }
        int i2 = i;
        return new com.applovin.exoplayer2.c.h(iVar.f407a, vVar, vVar2, i2 != 0 ? 0 : hVarA.d, i2);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected float a(float f, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int iMax = -1;
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            int i = vVar2.z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(String str, long j, long j2) {
        this.c.a(str, j, j2);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(String str) {
        this.c.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.c.b(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    protected com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w wVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.h hVarA = super.a(wVar);
        this.c.a(wVar.b, hVarA);
        return hVarA;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(com.applovin.exoplayer2.v vVar, MediaFormat mediaFormat) throws com.applovin.exoplayer2.p {
        int iC;
        com.applovin.exoplayer2.v vVar2 = this.g;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (G() != null) {
            if ("audio/raw".equals(vVar.l)) {
                iC = vVar.A;
            } else if (ai.f611a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iC = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iC = ai.c(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iC = "audio/raw".equals(vVar.l) ? vVar.A : 2;
            }
            com.applovin.exoplayer2.v vVarA = new v.a().f("audio/raw").m(iC).n(vVar.B).o(vVar.C).k(mediaFormat.getInteger("channel-count")).l(mediaFormat.getInteger("sample-rate")).a();
            if (this.f && vVarA.y == 6 && vVar.y < 6) {
                iArr = new int[vVar.y];
                for (int i = 0; i < vVar.y; i++) {
                    iArr[i] = i;
                }
            }
            vVar = vVarA;
        }
        try {
            this.d.a(vVar, 0, iArr);
        } catch (h.a e) {
            throw a(e, e.f67a, 5001);
        }
    }

    protected void B() {
        this.j = true;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void a(boolean z, boolean z2) throws com.applovin.exoplayer2.p {
        super.a(z, z2);
        this.c.a(this.f408a);
        if (v().b) {
            this.d.g();
        } else {
            this.d.h();
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void a(long j, boolean z) throws com.applovin.exoplayer2.p {
        super.a(j, z);
        if (this.l) {
            this.d.k();
        } else {
            this.d.j();
        }
        this.h = j;
        this.i = true;
        this.j = true;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void p() {
        super.p();
        this.d.a();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void q() {
        R();
        this.d.i();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void r() {
        this.k = true;
        try {
            this.d.j();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    protected void s() {
        try {
            super.s();
        } finally {
            if (this.k) {
                this.k = false;
                this.d.l();
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean A() {
        return super.A() && this.d.d();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        return this.d.e() || super.z();
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        if (d_() == 2) {
            R();
        }
        return this.h;
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        this.d.a(amVar);
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.d.f();
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void a(com.applovin.exoplayer2.c.g gVar) {
        if (!this.i || gVar.b()) {
            return;
        }
        if (Math.abs(gVar.d - this.h) > 500000) {
            this.h = gVar.d;
        }
        this.i = false;
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void C() {
        super.C();
        this.d.b();
    }

    @Override // com.applovin.exoplayer2.f.j
    protected boolean a(long j, long j2, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.l.a.b(byteBuffer);
        if (this.g != null && (i2 & 2) != 0) {
            ((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(gVar)).a(i, false);
            return true;
        }
        if (z) {
            if (gVar != null) {
                gVar.a(i, false);
            }
            this.f408a.f += i3;
            this.d.b();
            return true;
        }
        try {
            if (!this.d.a(byteBuffer, j3, i3)) {
                return false;
            }
            if (gVar != null) {
                gVar.a(i, false);
            }
            this.f408a.e += i3;
            return true;
        } catch (h.b e) {
            throw a(e, e.c, e.b, 5001);
        } catch (h.e e2) {
            throw a(e2, vVar, e2.b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    protected void D() throws com.applovin.exoplayer2.p {
        try {
            this.d.c();
        } catch (h.e e) {
            throw a(e, e.c, e.b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i, Object obj) throws com.applovin.exoplayer2.p {
        if (i == 2) {
            this.d.a(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.d.a((d) obj);
            return;
        }
        if (i == 6) {
            this.d.a((k) obj);
            return;
        }
        switch (i) {
            case 9:
                this.d.b(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.d.a(((Integer) obj).intValue());
                break;
            case 11:
                this.m = (ar.a) obj;
                break;
            default:
                super.a(i, obj);
                break;
        }
    }

    protected int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int iA = a(iVar, vVar);
        if (vVarArr.length == 1) {
            return iA;
        }
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            if (iVar.a(vVar, vVar2).d != 0) {
                iA = Math.max(iA, a(iVar, vVar2));
            }
        }
        return iA;
    }

    private int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar) {
        if (!"OMX.google.raw.decoder".equals(iVar.f407a) || ai.f611a >= 24 || (ai.f611a == 23 && ai.c(this.b))) {
            return vVar.m;
        }
        return -1;
    }

    protected MediaFormat a(com.applovin.exoplayer2.v vVar, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", vVar.y);
        mediaFormat.setInteger("sample-rate", vVar.z);
        com.applovin.exoplayer2.l.t.a(mediaFormat, vVar.n);
        com.applovin.exoplayer2.l.t.a(mediaFormat, "max-input-size", i);
        if (ai.f611a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !S()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (ai.f611a <= 28 && "audio/ac4".equals(vVar.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (ai.f611a >= 24 && this.d.b(ai.b(4, vVar.y, vVar.z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    private void R() {
        long jA = this.d.a(A());
        if (jA != Long.MIN_VALUE) {
            if (!this.j) {
                jA = Math.max(this.h, jA);
            }
            this.h = jA;
            this.j = false;
        }
    }

    private static boolean S() {
        return ai.f611a == 23 && ("ZTE B2017G".equals(ai.d) || "AXON 7 mini".equals(ai.d));
    }

    private static boolean b(String str) {
        return ai.f611a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ai.c) && (ai.b.startsWith("zeroflte") || ai.b.startsWith("herolte") || ai.b.startsWith("heroqlte"));
    }

    private final class a implements h.c {
        private a() {
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a() {
            q.this.B();
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(long j) {
            q.this.c.a(j);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(int i, long j, long j2) {
            q.this.c.a(i, j, j2);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(boolean z) {
            q.this.c.a(z);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b() {
            if (q.this.m != null) {
                q.this.m.a();
            }
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b(long j) {
            if (q.this.m != null) {
                q.this.m.a(j);
            }
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(Exception exc) {
            com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio sink error", exc);
            q.this.c.a(exc);
        }
    }
}
