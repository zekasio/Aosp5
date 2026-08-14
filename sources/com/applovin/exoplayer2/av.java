package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final av f45a;
    public static final av b;
    public static final av c;
    public static final av d;
    public static final av e;
    public final long f;
    public final long g;

    static {
        av avVar = new av(0L, 0L);
        f45a = avVar;
        b = new av(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new av(Long.MAX_VALUE, 0L);
        d = new av(0L, Long.MAX_VALUE);
        e = avVar;
    }

    public av(long j, long j2) {
        com.applovin.exoplayer2.l.a.a(j >= 0);
        com.applovin.exoplayer2.l.a.a(j2 >= 0);
        this.f = j;
        this.g = j2;
    }

    public long a(long j, long j2, long j3) {
        long j4 = this.f;
        if (j4 == 0 && this.g == 0) {
            return j;
        }
        long jC = com.applovin.exoplayer2.l.ai.c(j, j4, Long.MIN_VALUE);
        long jB = com.applovin.exoplayer2.l.ai.b(j, this.g, Long.MAX_VALUE);
        boolean z = jC <= j2 && j2 <= jB;
        boolean z2 = jC <= j3 && j3 <= jB;
        return (z && z2) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z2 ? j3 : jC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        av avVar = (av) obj;
        return this.f == avVar.f && this.g == avVar.g;
    }

    public int hashCode() {
        return (((int) this.f) * 31) + ((int) this.g);
    }
}
