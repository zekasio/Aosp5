package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final at f44a = new at(false);
    public final boolean b;

    public at(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((at) obj).b;
    }

    public int hashCode() {
        return !this.b ? 1 : 0;
    }
}
