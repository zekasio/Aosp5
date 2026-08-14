package com.applovin.exoplayer2.e;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface x {
    int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) throws IOException;

    int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z, int i2) throws IOException;

    void a(long j, int i, int i2, int i3, a aVar);

    void a(com.applovin.exoplayer2.l.y yVar, int i);

    void a(com.applovin.exoplayer2.l.y yVar, int i, int i2);

    void a(com.applovin.exoplayer2.v vVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f390a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f390a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f390a == aVar.f390a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.f390a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.x$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
