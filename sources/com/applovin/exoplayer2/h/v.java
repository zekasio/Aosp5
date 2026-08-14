package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f480a;
    private final int b;
    private final com.applovin.exoplayer2.l.y c;
    private a d;
    private a e;
    private a f;
    private long g;

    public v(com.applovin.exoplayer2.k.b bVar) {
        this.f480a = bVar;
        int iC = bVar.c();
        this.b = iC;
        this.c = new com.applovin.exoplayer2.l.y(32);
        a aVar = new a(0L, iC);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public void a() {
        a(this.d);
        a aVar = new a(0L, this.b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.f480a.b();
    }

    public void b() {
        this.e = this.d;
    }

    public void a(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        this.e = a(this.e, gVar, aVar, this.c);
    }

    public void b(com.applovin.exoplayer2.c.g gVar, w.a aVar) {
        a(this.e, gVar, aVar, this.c);
    }

    public void a(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.d.b) {
            this.f480a.a(this.d.d);
            this.d = this.d.a();
        }
        if (this.e.f481a < this.d.f481a) {
            this.e = this.d;
        }
    }

    public long c() {
        return this.g;
    }

    public int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) throws IOException {
        int iA = gVar.a(this.f.d.f571a, this.f.a(this.g), a(i));
        if (iA != -1) {
            b(iA);
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(com.applovin.exoplayer2.l.y yVar, int i) {
        while (i > 0) {
            int iA = a(i);
            yVar.a(this.f.d.f571a, this.f.a(this.g), iA);
            i -= iA;
            b(iA);
        }
    }

    private void a(a aVar) {
        if (aVar.c) {
            boolean z = this.f.c;
            int i = (z ? 1 : 0) + (((int) (this.f.f481a - aVar.f481a)) / this.b);
            com.applovin.exoplayer2.k.a[] aVarArr = new com.applovin.exoplayer2.k.a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.f480a.a(aVarArr);
        }
    }

    private int a(int i) {
        if (!this.f.c) {
            this.f.a(this.f480a.a(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    private void b(int i) {
        long j = this.g + ((long) i);
        this.g = j;
        if (j == this.f.b) {
            this.f = this.f.e;
        }
    }

    private static a a(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        if (gVar.g()) {
            aVar = b(aVar, gVar, aVar2, yVar);
        }
        if (gVar.e()) {
            yVar.a(4);
            a aVarA = a(aVar, aVar2.b, yVar.d(), 4);
            int iW = yVar.w();
            aVar2.b += 4;
            aVar2.f483a -= 4;
            gVar.f(iW);
            a aVarA2 = a(aVarA, aVar2.b, gVar.b, iW);
            aVar2.b += (long) iW;
            aVar2.f483a -= iW;
            gVar.e(aVar2.f483a);
            return a(aVarA2, aVar2.b, gVar.e, aVar2.f483a);
        }
        gVar.f(aVar2.f483a);
        return a(aVar, aVar2.b, gVar.b, aVar2.f483a);
    }

    private static a b(a aVar, com.applovin.exoplayer2.c.g gVar, w.a aVar2, com.applovin.exoplayer2.l.y yVar) {
        int i;
        long j = aVar2.b;
        yVar.a(1);
        a aVarA = a(aVar, j, yVar.d(), 1);
        long j2 = j + 1;
        byte b = yVar.d()[0];
        boolean z = (b & ByteCompanionObject.MIN_VALUE) != 0;
        int i2 = b & 127;
        com.applovin.exoplayer2.c.c cVar = gVar.f100a;
        if (cVar.f97a == null) {
            cVar.f97a = new byte[16];
        } else {
            Arrays.fill(cVar.f97a, (byte) 0);
        }
        a aVarA2 = a(aVarA, j2, cVar.f97a, i2);
        long j3 = j2 + ((long) i2);
        if (z) {
            yVar.a(2);
            aVarA2 = a(aVarA2, j3, yVar.d(), 2);
            j3 += 2;
            i = yVar.i();
        } else {
            i = 1;
        }
        int[] iArr = cVar.d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            yVar.a(i3);
            aVarA2 = a(aVarA2, j3, yVar.d(), i3);
            j3 += (long) i3;
            yVar.d(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = yVar.i();
                iArr4[i4] = yVar.w();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f483a - ((int) (j3 - aVar2.b));
        }
        x.a aVar3 = (x.a) ai.a(aVar2.c);
        cVar.a(i, iArr2, iArr4, aVar3.b, cVar.f97a, aVar3.f390a, aVar3.c, aVar3.d);
        int i5 = (int) (j3 - aVar2.b);
        aVar2.b += (long) i5;
        aVar2.f483a -= i5;
        return aVarA2;
    }

    private static a a(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a aVarA = a(aVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarA.b - j));
            byteBuffer.put(aVarA.d.f571a, aVarA.a(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, long j, byte[] bArr, int i) {
        a aVarA = a(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarA.b - j));
            System.arraycopy(aVarA.d.f571a, aVarA.a(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVarA.b) {
                aVarA = aVarA.e;
            }
        }
        return aVarA;
    }

    private static a a(a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.e;
        }
        return aVar;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f481a;
        public final long b;
        public boolean c;
        public com.applovin.exoplayer2.k.a d;
        public a e;

        public a(long j, int i) {
            this.f481a = j;
            this.b = j + ((long) i);
        }

        public void a(com.applovin.exoplayer2.k.a aVar, a aVar2) {
            this.d = aVar;
            this.e = aVar2;
            this.c = true;
        }

        public int a(long j) {
            return ((int) (j - this.f481a)) + this.d.b;
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }
    }
}
