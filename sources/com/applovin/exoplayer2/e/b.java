package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static void a(long j, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        while (true) {
            if (yVar.a() <= 1) {
                return;
            }
            int iA = a(yVar);
            int iA2 = a(yVar);
            int iC = yVar.c() + iA2;
            if (iA2 == -1 || iA2 > yVar.a()) {
                com.applovin.exoplayer2.l.q.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iC = yVar.b();
            } else if (iA == 4 && iA2 >= 8) {
                int iH = yVar.h();
                int i = yVar.i();
                int iQ = i == 49 ? yVar.q() : 0;
                int iH2 = yVar.h();
                if (i == 47) {
                    yVar.e(1);
                }
                boolean z = iH == 181 && (i == 49 || i == 47) && iH2 == 3;
                if (i == 49) {
                    z &= iQ == 1195456820;
                }
                if (z) {
                    b(j, yVar, xVarArr);
                }
            }
            yVar.d(iC);
        }
    }

    public static void b(long j, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        int iH = yVar.h();
        if ((iH & 64) != 0) {
            yVar.e(1);
            int i = (iH & 31) * 3;
            int iC = yVar.c();
            for (x xVar : xVarArr) {
                yVar.d(iC);
                xVar.a(yVar, i);
                if (j != -9223372036854775807L) {
                    xVar.a(j, 1, i, 0, null);
                }
            }
        }
    }

    private static int a(com.applovin.exoplayer2.l.y yVar) {
        int i = 0;
        while (yVar.a() != 0) {
            int iH = yVar.h();
            i += iH;
            if (iH != 255) {
                return i;
            }
        }
        return -1;
    }
}
