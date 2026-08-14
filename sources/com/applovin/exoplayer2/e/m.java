package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f377a;
    }

    public static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i, a aVar) {
        int iC = yVar.c();
        long jO = yVar.o();
        long j = jO >>> 16;
        if (j != i) {
            return false;
        }
        return a((int) (15 & (jO >> 4)), pVar) && b((int) ((jO >> 1) & 7), pVar) && !(((jO & 1) > 1L ? 1 : ((jO & 1) == 1L ? 0 : -1)) == 0) && a(yVar, pVar, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(yVar, pVar, (int) ((jO >> 12) & 15)) && b(yVar, pVar, (int) ((jO >> 8) & 15)) && b(yVar, iC);
    }

    public static boolean a(i iVar, p pVar, int i, a aVar) throws IOException {
        long jB = iVar.b();
        byte[] bArr = new byte[2];
        iVar.d(bArr, 0, 2);
        if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
            iVar.a();
            iVar.c((int) (jB - iVar.c()));
            return false;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(16);
        System.arraycopy(bArr, 0, yVar.d(), 0, 2);
        yVar.c(k.a(iVar, yVar.d(), 2, 14));
        iVar.a();
        iVar.c((int) (jB - iVar.c()));
        return a(yVar, pVar, i, aVar);
    }

    public static long a(i iVar, p pVar) throws IOException {
        iVar.a();
        iVar.c(1);
        byte[] bArr = new byte[1];
        iVar.d(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        iVar.c(2);
        int i = z ? 7 : 6;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i);
        yVar.c(k.a(iVar, yVar.d(), 0, i));
        iVar.a();
        a aVar = new a();
        if (!a(yVar, pVar, z, aVar)) {
            throw ai.b(null, null);
        }
        return aVar.f377a;
    }

    public static int a(com.applovin.exoplayer2.l.y yVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yVar.h() + 1;
            case 7:
                return yVar.i() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean a(int i, p pVar) {
        return i <= 7 ? i == pVar.g - 1 : i <= 10 && pVar.g == 2;
    }

    private static boolean b(int i, p pVar) {
        return i == 0 || i == pVar.i;
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, boolean z, a aVar) {
        try {
            long jD = yVar.D();
            if (!z) {
                jD *= (long) pVar.b;
            }
            aVar.f377a = jD;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i) {
        int iA = a(yVar, i);
        return iA != -1 && iA <= pVar.b;
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, p pVar, int i) {
        int i2 = pVar.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == pVar.f;
        }
        if (i == 12) {
            return yVar.h() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int i3 = yVar.i();
        if (i == 14) {
            i3 *= 10;
        }
        return i3 == i2;
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, int i) {
        return yVar.h() == com.applovin.exoplayer2.l.ai.b(yVar.d(), i, yVar.c() - 1, 0);
    }
}
