package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.e.i;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f287a = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] b = new byte[8];
    private int c;
    private int d;

    public void a() {
        this.c = 0;
        this.d = 0;
    }

    public long a(i iVar, boolean z, boolean z2, int i) throws IOException {
        if (this.c == 0) {
            if (!iVar.a(this.b, 0, 1, z)) {
                return -1L;
            }
            int iA = a(this.b[0] & UByte.MAX_VALUE);
            this.d = iA;
            if (iA == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.c = 1;
        }
        int i2 = this.d;
        if (i2 > i) {
            this.c = 0;
            return -2L;
        }
        if (i2 != 1) {
            iVar.b(this.b, 1, i2 - 1);
        }
        this.c = 0;
        return a(this.b, this.d, z2);
    }

    public int b() {
        return this.d;
    }

    public static int a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f287a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f287a[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
