package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f280a = new byte[8];
    private final ArrayDeque<C0023a> b = new ArrayDeque<>();
    private final f c = new f();
    private b d;
    private int e;
    private int f;
    private long g;

    @Override // com.applovin.exoplayer2.e.e.c
    public void a(b bVar) {
        this.d = bVar;
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.d);
        while (true) {
            C0023a c0023aPeek = this.b.peek();
            if (c0023aPeek == null || iVar.c() < c0023aPeek.b) {
                if (this.e == 0) {
                    long jA = this.c.a(iVar, true, false, 4);
                    if (jA == -2) {
                        jA = b(iVar);
                    }
                    if (jA == -1) {
                        return false;
                    }
                    this.f = (int) jA;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.a(iVar, false, true, 8);
                    this.e = 2;
                }
                int iA = this.d.a(this.f);
                if (iA != 0) {
                    if (iA == 1) {
                        long jC = iVar.c();
                        this.b.push(new C0023a(this.f, this.g + jC));
                        this.d.a(this.f, jC, this.g);
                        this.e = 0;
                        return true;
                    }
                    if (iA == 2) {
                        long j = this.g;
                        if (j > 8) {
                            throw ai.b("Invalid integer size: " + this.g, null);
                        }
                        this.d.a(this.f, a(iVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    if (iA == 3) {
                        long j2 = this.g;
                        if (j2 > 2147483647L) {
                            throw ai.b("String element size: " + this.g, null);
                        }
                        this.d.a(this.f, c(iVar, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    if (iA == 4) {
                        this.d.a(this.f, (int) this.g, iVar);
                        this.e = 0;
                        return true;
                    }
                    if (iA == 5) {
                        long j3 = this.g;
                        if (j3 != 4 && j3 != 8) {
                            throw ai.b("Invalid float size: " + this.g, null);
                        }
                        this.d.a(this.f, b(iVar, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    throw ai.b("Invalid element type " + iA, null);
                }
                iVar.b((int) this.g);
                this.e = 0;
            } else {
                this.d.c(this.b.pop().f281a);
                return true;
            }
        }
    }

    private long b(i iVar) throws IOException {
        iVar.a();
        while (true) {
            iVar.d(this.f280a, 0, 4);
            int iA = f.a(this.f280a[0]);
            if (iA != -1 && iA <= 4) {
                int iA2 = (int) f.a(this.f280a, iA, false);
                if (this.d.b(iA2)) {
                    iVar.b(iA);
                    return iA2;
                }
            }
            iVar.b(1);
        }
    }

    private long a(i iVar, int i) throws IOException {
        iVar.b(this.f280a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f280a[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    private double b(i iVar, int i) throws IOException {
        long jA = a(iVar, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jA);
        }
        return Double.longBitsToDouble(jA);
    }

    private static String c(i iVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        iVar.b(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.e.a$a, reason: collision with other inner class name */
    private static final class C0023a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f281a;
        private final long b;

        private C0023a(int i, long j) {
            this.f281a = i;
            this.b = j;
        }
    }
}
