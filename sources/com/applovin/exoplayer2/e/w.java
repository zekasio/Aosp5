package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f389a = new w(0, 0);
    public final long b;
    public final long c;

    public w(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public String toString() {
        return "[timeUs=" + this.b + ", position=" + this.c + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.b == wVar.b && this.c == wVar.c;
    }

    public int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }
}
