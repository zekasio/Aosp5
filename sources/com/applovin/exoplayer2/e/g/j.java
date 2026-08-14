package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f312a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, true, false);
    }

    public static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z) throws IOException {
        return a(iVar, false, z);
    }

    private static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        int i;
        long jD = iVar.d();
        long j = 4096;
        long j2 = -1;
        if (jD != -1 && jD <= 4096) {
            j = jD;
        }
        int i2 = (int) j;
        y yVar = new y(64);
        boolean z5 = false;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < i2) {
            yVar.a(8);
            if (!iVar.b(yVar.d(), z5 ? 1 : 0, 8, true)) {
                break;
            }
            long jO = yVar.o();
            int iQ = yVar.q();
            if (jO == 1) {
                iVar.d(yVar.d(), 8, 8);
                yVar.c(16);
                jO = yVar.s();
                i = 16;
            } else {
                if (jO == 0) {
                    long jD2 = iVar.d();
                    if (jD2 != j2) {
                        jO = ((long) 8) + (jD2 - iVar.b());
                    }
                }
                i = 8;
            }
            long j3 = i;
            if (jO < j3) {
                return z5;
            }
            i3 += i;
            if (iQ == 1836019574) {
                i2 += (int) jO;
                if (jD != j2 && i2 > jD) {
                    i2 = (int) jD;
                }
            } else {
                if (iQ == 1836019558 || iQ == 1836475768) {
                    z3 = true;
                    z4 = true;
                    break;
                }
                if ((((long) i3) + jO) - j3 >= i2) {
                    break;
                }
                int i4 = (int) (jO - j3);
                i3 += i4;
                if (iQ == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    yVar.a(i4);
                    iVar.d(yVar.d(), 0, i4);
                    int i5 = i4 / 4;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            break;
                        }
                        if (i6 == 1) {
                            yVar.e(4);
                        } else if (a(yVar.q(), z2)) {
                            z6 = true;
                            break;
                        }
                        i6++;
                    }
                    if (!z6) {
                        return false;
                    }
                } else if (i4 != 0) {
                    iVar.c(i4);
                }
                j2 = -1;
                z5 = false;
            }
        }
        z3 = true;
        z4 = false;
        if (z6 && z == z4) {
            return z3;
        }
        return false;
    }

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f312a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
