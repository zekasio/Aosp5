package com.applovin.exoplayer2.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74a;
    public final float b;

    public k(int i, float f) {
        this.f74a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f74a == kVar.f74a && Float.compare(kVar.b, this.b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f74a) * 31) + Float.floatToIntBits(this.b);
    }
}
