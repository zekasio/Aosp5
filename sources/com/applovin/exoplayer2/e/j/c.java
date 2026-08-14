package com.applovin.exoplayer2.e.j;

import android.util.Pair;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class c {
    public static b a(i iVar) throws IOException {
        byte[] bArr;
        com.applovin.exoplayer2.l.a.b(iVar);
        y yVar = new y(16);
        if (a.a(iVar, yVar).f374a != 1380533830) {
            return null;
        }
        iVar.d(yVar.d(), 0, 4);
        yVar.d(0);
        int iQ = yVar.q();
        if (iQ != 1463899717) {
            q.d("WavHeaderReader", "Unsupported RIFF format: " + iQ);
            return null;
        }
        a aVarA = a.a(iVar, yVar);
        while (aVarA.f374a != 1718449184) {
            iVar.c((int) aVarA.b);
            aVarA = a.a(iVar, yVar);
        }
        com.applovin.exoplayer2.l.a.b(aVarA.b >= 16);
        iVar.d(yVar.d(), 0, 16);
        yVar.d(0);
        int iJ = yVar.j();
        int iJ2 = yVar.j();
        int iX = yVar.x();
        int iX2 = yVar.x();
        int iJ3 = yVar.j();
        int iJ4 = yVar.j();
        int i = ((int) aVarA.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            iVar.d(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = ai.f;
        }
        return new b(iJ, iJ2, iX, iX2, iJ3, iJ4, bArr);
    }

    public static Pair<Long, Long> b(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.b(iVar);
        iVar.a();
        y yVar = new y(8);
        a aVarA = a.a(iVar, yVar);
        while (aVarA.f374a != 1684108385) {
            if (aVarA.f374a != 1380533830 && aVarA.f374a != 1718449184) {
                q.c("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f374a);
            }
            long j = aVarA.b + 8;
            if (aVarA.f374a == 1380533830) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw com.applovin.exoplayer2.ai.a("Chunk is too large (~2GB+) to skip; id: " + aVarA.f374a);
            }
            iVar.b((int) j);
            aVarA = a.a(iVar, yVar);
        }
        iVar.b(8);
        long jC = iVar.c();
        long j2 = aVarA.b + jC;
        long jD = iVar.d();
        if (jD != -1 && j2 > jD) {
            q.c("WavHeaderReader", "Data exceeds input length: " + j2 + ", " + jD);
            j2 = jD;
        }
        return Pair.create(Long.valueOf(jC), Long.valueOf(j2));
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f374a;
        public final long b;

        private a(int i, long j) {
            this.f374a = i;
            this.b = j;
        }

        public static a a(i iVar, y yVar) throws IOException {
            iVar.d(yVar.d(), 0, 8);
            yVar.d(0);
            return new a(yVar.q(), yVar.p());
        }
    }
}
