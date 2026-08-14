package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f319a;
    private a b;

    b() {
    }

    public static boolean a(y yVar) {
        return yVar.a() >= 5 && yVar.h() == 127 && yVar.o() == 1179402563;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.f319a = null;
            this.b = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected long b(y yVar) {
        if (a(yVar.d())) {
            return c(yVar);
        }
        return -1L;
    }

    @Override // com.applovin.exoplayer2.e.h.h
    protected boolean a(y yVar, long j, h.a aVar) {
        byte[] bArrD = yVar.d();
        p pVar = this.f319a;
        if (pVar == null) {
            p pVar2 = new p(bArrD, 17);
            this.f319a = pVar2;
            aVar.f326a = pVar2.a(Arrays.copyOfRange(bArrD, 9, yVar.b()), (com.applovin.exoplayer2.g.a) null);
            return true;
        }
        if ((bArrD[0] & 127) == 3) {
            p.a aVarA = n.a(yVar);
            p pVarA = pVar.a(aVarA);
            this.f319a = pVarA;
            this.b = new a(pVarA, aVarA);
            return true;
        }
        if (!a(bArrD)) {
            return true;
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.b(j);
            aVar.b = this.b;
        }
        com.applovin.exoplayer2.l.a.b(aVar.f326a);
        return false;
    }

    private int c(y yVar) {
        int i = (yVar.d()[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            yVar.e(4);
            yVar.D();
        }
        int iA = m.a(yVar, i);
        yVar.d(0);
        return iA;
    }

    private static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f320a;
        private p.a b;
        private long c = -1;
        private long d = -1;

        public a(p pVar, p.a aVar) {
            this.f320a = pVar;
            this.b = aVar;
        }

        public void b(long j) {
            this.c = j;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j) {
            long[] jArr = this.b.f381a;
            this.d = jArr[ai.a(jArr, j, true, true)];
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public v b() {
            com.applovin.exoplayer2.l.a.b(this.c != -1);
            return new o(this.f320a, this.c);
        }
    }
}
