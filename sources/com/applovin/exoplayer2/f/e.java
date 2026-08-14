package com.applovin.exoplayer2.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f402a;
    private long b;
    private boolean c;

    e() {
    }

    public void a() {
        this.f402a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long a(v vVar, com.applovin.exoplayer2.c.g gVar) {
        if (this.b == 0) {
            this.f402a = gVar.d;
        }
        if (this.c) {
            return gVar.d;
        }
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.b);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
        }
        int iB = r.b(i);
        if (iB == -1) {
            this.c = true;
            this.b = 0L;
            this.f402a = gVar.d;
            q.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.d;
        }
        long jA = a(vVar.z);
        this.b += (long) iB;
        return jA;
    }

    public long a(v vVar) {
        return a(vVar.z);
    }

    private long a(long j) {
        return this.f402a + Math.max(0L, ((this.b - 529) * 1000000) / j);
    }
}
