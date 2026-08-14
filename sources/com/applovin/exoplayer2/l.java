package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public class l implements aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.m f604a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public l() {
        this(new com.applovin.exoplayer2.k.m(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected l(com.applovin.exoplayer2.k.m mVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(i6, 0, "backBufferDurationMs", "0");
        this.f604a = mVar;
        this.b = h.b(i);
        this.c = h.b(i2);
        this.d = h.b(i3);
        this.e = h.b(i4);
        this.f = i5;
        this.j = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = h.b(i6);
        this.i = z2;
    }

    @Override // com.applovin.exoplayer2.aa
    public void a() {
        a(false);
    }

    @Override // com.applovin.exoplayer2.aa
    public void a(ar[] arVarArr, com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.d[] dVarArr) {
        int iA = this.f;
        if (iA == -1) {
            iA = a(arVarArr, dVarArr);
        }
        this.j = iA;
        this.f604a.a(iA);
    }

    @Override // com.applovin.exoplayer2.aa
    public void b() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public void c() {
        a(true);
    }

    @Override // com.applovin.exoplayer2.aa
    public com.applovin.exoplayer2.k.b d() {
        return this.f604a;
    }

    @Override // com.applovin.exoplayer2.aa
    public long e() {
        return this.h;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean f() {
        return this.i;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f604a.e() >= this.j;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(com.applovin.exoplayer2.l.ai.a(jMin, f), this.c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j2 < 500000) {
                com.applovin.exoplayer2.l.q.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    @Override // com.applovin.exoplayer2.aa
    public boolean a(long j, float f, boolean z, long j2) {
        long jB = com.applovin.exoplayer2.l.ai.b(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || (!this.g && this.f604a.e() >= this.j);
    }

    protected int a(ar[] arVarArr, com.applovin.exoplayer2.j.d[] dVarArr) {
        int iA = 0;
        for (int i = 0; i < arVarArr.length; i++) {
            if (dVarArr[i] != null) {
                iA += a(arVarArr[i].a());
            }
        }
        return Math.max(13107200, iA);
    }

    private void a(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            this.f604a.d();
        }
    }

    private static int a(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private static void a(int i, int i2, String str, String str2) {
        com.applovin.exoplayer2.l.a.a(i >= i2, str + " cannot be less than " + str2);
    }
}
