package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.z;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f327a;
    private int b;
    private boolean c;
    private z.d d;
    private z.b e;

    static int a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    i() {
    }

    public static boolean a(y yVar) {
        try {
            return z.a(1, yVar, true);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.f327a = null;
            this.d = null;
            this.e = null;
        }
        this.b = 0;
        this.c = false;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected void c(long j) {
        super.c(j);
        this.c = j != 0;
        z.d dVar = this.d;
        this.b = dVar != null ? dVar.g : 0;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected long b(y yVar) {
        if ((yVar.d()[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(yVar.d()[0], (a) com.applovin.exoplayer2.l.a.a(this.f327a));
        long j = this.c ? (this.b + iA) / 4 : 0;
        a(yVar, j);
        this.c = true;
        this.b = iA;
        return j;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected boolean a(y yVar, long j, h.a aVar) throws IOException {
        if (this.f327a != null) {
            com.applovin.exoplayer2.l.a.b(aVar.f326a);
            return false;
        }
        a aVarC = c(yVar);
        this.f327a = aVarC;
        if (aVarC == null) {
            return true;
        }
        z.d dVar = aVarC.f328a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(aVarC.c);
        aVar.f326a = new v.a().f("audio/vorbis").d(dVar.e).e(dVar.d).k(dVar.b).l(dVar.c).a(arrayList).a();
        return true;
    }

    a c(y yVar) throws IOException {
        z.d dVar = this.d;
        if (dVar == null) {
            this.d = z.a(yVar);
            return null;
        }
        z.b bVar = this.e;
        if (bVar == null) {
            this.e = z.b(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.b()];
        System.arraycopy(yVar.d(), 0, bArr, 0, yVar.b());
        return new a(dVar, bVar, bArr, z.a(yVar, dVar.b), z.a(r4.length - 1));
    }

    static void a(y yVar, long j) {
        if (yVar.e() < yVar.b() + 4) {
            yVar.a(Arrays.copyOf(yVar.d(), yVar.b() + 4));
        } else {
            yVar.c(yVar.b() + 4);
        }
        byte[] bArrD = yVar.d();
        bArrD[yVar.b() - 4] = (byte) (j & 255);
        bArrD[yVar.b() - 3] = (byte) ((j >>> 8) & 255);
        bArrD[yVar.b() - 2] = (byte) ((j >>> 16) & 255);
        bArrD[yVar.b() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int a(byte b, a aVar) {
        if (!aVar.d[a(b, aVar.e, 1)].f394a) {
            return aVar.f328a.g;
        }
        return aVar.f328a.h;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z.d f328a;
        public final z.b b;
        public final byte[] c;
        public final z.c[] d;
        public final int e;

        public a(z.d dVar, z.b bVar, byte[] bArr, z.c[] cVarArr, int i) {
            this.f328a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }
}
