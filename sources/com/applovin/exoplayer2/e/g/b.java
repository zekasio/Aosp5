package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f295a = ai.c("OpusHead");

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.g.b$b, reason: collision with other inner class name */
    private interface InterfaceC0025b {
        int a();

        int b();

        int c();
    }

    private static int a(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<n> a(a.C0024a c0024a, r rVar, long j, com.applovin.exoplayer2.d.e eVar, boolean z, boolean z2, Function<k, k> function) throws com.applovin.exoplayer2.ai {
        k kVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0024a.d.size(); i++) {
            a.C0024a c0024a2 = c0024a.d.get(i);
            if (c0024a2.f294a == 1953653099 && (kVarApply = function.apply(a(c0024a2, (a.b) com.applovin.exoplayer2.l.a.b(c0024a.d(1836476516)), j, eVar, z, z2))) != null) {
                arrayList.add(a(kVarApply, (a.C0024a) com.applovin.exoplayer2.l.a.b(((a.C0024a) com.applovin.exoplayer2.l.a.b(((a.C0024a) com.applovin.exoplayer2.l.a.b(c0024a2.e(1835297121))).e(1835626086))).e(1937007212)), rVar));
            }
        }
        return arrayList;
    }

    public static Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> a(a.b bVar) {
        y yVar = bVar.b;
        yVar.d(8);
        com.applovin.exoplayer2.g.a aVarA = null;
        com.applovin.exoplayer2.g.a aVarC = null;
        while (yVar.a() >= 8) {
            int iC = yVar.c();
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1835365473) {
                yVar.d(iC);
                aVarA = a(yVar, iC + iQ);
            } else if (iQ2 == 1936553057) {
                yVar.d(iC);
                aVarC = c(yVar, iC + iQ);
            }
            yVar.d(iC + iQ);
        }
        return Pair.create(aVarA, aVarC);
    }

    public static com.applovin.exoplayer2.g.a a(a.C0024a c0024a) {
        a.b bVarD = c0024a.d(1751411826);
        a.b bVarD2 = c0024a.d(1801812339);
        a.b bVarD3 = c0024a.d(1768715124);
        if (bVarD == null || bVarD2 == null || bVarD3 == null || d(bVarD.b) != 1835299937) {
            return null;
        }
        y yVar = bVarD2.b;
        yVar.d(12);
        int iQ = yVar.q();
        String[] strArr = new String[iQ];
        for (int i = 0; i < iQ; i++) {
            int iQ2 = yVar.q();
            yVar.e(4);
            strArr[i] = yVar.f(iQ2 - 8);
        }
        y yVar2 = bVarD3.b;
        yVar2.d(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() > 8) {
            int iC = yVar2.c();
            int iQ3 = yVar2.q();
            int iQ4 = yVar2.q() - 1;
            if (iQ4 >= 0 && iQ4 < iQ) {
                com.applovin.exoplayer2.g.f.a aVarA = com.applovin.exoplayer2.e.g.f.a(yVar2, iC + iQ3, strArr[iQ4]);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            } else {
                q.c("AtomParsers", "Skipped metadata with unknown key index: " + iQ4);
            }
            yVar2.d(iC + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    public static void a(y yVar) {
        int iC = yVar.c();
        yVar.e(4);
        if (yVar.q() != 1751411826) {
            iC += 4;
        }
        yVar.d(iC);
    }

    private static k a(a.C0024a c0024a, a.b bVar, long j, com.applovin.exoplayer2.d.e eVar, boolean z, boolean z2) throws com.applovin.exoplayer2.ai {
        a.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        a.C0024a c0024aE;
        Pair<long[], long[]> pairB;
        a.C0024a c0024a2 = (a.C0024a) com.applovin.exoplayer2.l.a.b(c0024a.e(1835297121));
        int iA = a(d(((a.b) com.applovin.exoplayer2.l.a.b(c0024a2.d(1751411826))).b));
        if (iA == -1) {
            return null;
        }
        f fVarC = c(((a.b) com.applovin.exoplayer2.l.a.b(c0024a.d(1953196132))).b);
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = fVarC.b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long jB = b(bVar2.b);
        long jD = j2 != -9223372036854775807L ? ai.d(j2, 1000000L, jB) : -9223372036854775807L;
        a.C0024a c0024a3 = (a.C0024a) com.applovin.exoplayer2.l.a.b(((a.C0024a) com.applovin.exoplayer2.l.a.b(c0024a2.e(1835626086))).e(1937007212));
        Pair<Long, String> pairE = e(((a.b) com.applovin.exoplayer2.l.a.b(c0024a2.d(1835296868))).b);
        c cVarA = a(((a.b) com.applovin.exoplayer2.l.a.b(c0024a3.d(1937011556))).b, fVarC.f300a, fVarC.c, (String) pairE.second, eVar, z2);
        if (z || (c0024aE = c0024a.e(1701082227)) == null || (pairB = b(c0024aE)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairB.first;
            jArr2 = (long[]) pairB.second;
            jArr = jArr3;
        }
        if (cVarA.b == null) {
            return null;
        }
        return new k(fVarC.f300a, iA, ((Long) pairE.first).longValue(), jB, jD, cVarA.b, cVarA.d, cVarA.f297a, cVarA.c, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.e.g.n a(com.applovin.exoplayer2.e.g.k r38, com.applovin.exoplayer2.e.g.a.C0024a r39, com.applovin.exoplayer2.e.r r40) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instruction units count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.b.a(com.applovin.exoplayer2.e.g.k, com.applovin.exoplayer2.e.g.a$a, com.applovin.exoplayer2.e.r):com.applovin.exoplayer2.e.g.n");
    }

    private static com.applovin.exoplayer2.g.a a(y yVar, int i) {
        yVar.e(8);
        a(yVar);
        while (yVar.c() < i) {
            int iC = yVar.c();
            int iQ = yVar.q();
            if (yVar.q() == 1768715124) {
                yVar.d(iC);
                return b(yVar, iC + iQ);
            }
            yVar.d(iC + iQ);
        }
        return null;
    }

    private static com.applovin.exoplayer2.g.a b(y yVar, int i) {
        yVar.e(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.c() < i) {
            a.InterfaceC0030a interfaceC0030aA = com.applovin.exoplayer2.e.g.f.a(yVar);
            if (interfaceC0030aA != null) {
                arrayList.add(interfaceC0030aA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static com.applovin.exoplayer2.g.a c(y yVar, int i) {
        yVar.e(12);
        while (yVar.c() < i) {
            int iC = yVar.c();
            int iQ = yVar.q();
            if (yVar.q() == 1935766900) {
                if (iQ < 14) {
                    return null;
                }
                yVar.e(5);
                int iH = yVar.h();
                if (iH != 12 && iH != 13) {
                    return null;
                }
                float f2 = iH == 12 ? 240.0f : 120.0f;
                yVar.e(1);
                return new com.applovin.exoplayer2.g.a(new com.applovin.exoplayer2.g.f.d(f2, yVar.h()));
            }
            yVar.d(iC + iQ);
        }
        return null;
    }

    private static long b(y yVar) {
        yVar.d(8);
        yVar.e(com.applovin.exoplayer2.e.g.a.a(yVar.q()) != 0 ? 16 : 8);
        return yVar.o();
    }

    private static f c(y yVar) {
        long j;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(iA == 0 ? 8 : 16);
        int iQ = yVar.q();
        yVar.e(4);
        int iC = yVar.c();
        int i = iA == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 < i) {
                if (yVar.d()[iC + i3] != -1) {
                    long jO = iA == 0 ? yVar.o() : yVar.y();
                    if (jO != 0) {
                        j = jO;
                    }
                } else {
                    i3++;
                }
            } else {
                yVar.e(i);
                break;
            }
        }
        yVar.e(16);
        int iQ2 = yVar.q();
        int iQ3 = yVar.q();
        yVar.e(4);
        int iQ4 = yVar.q();
        int iQ5 = yVar.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i2 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i2 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i2 = 180;
        }
        return new f(iQ, j, i2);
    }

    private static int d(y yVar) {
        yVar.d(16);
        return yVar.q();
    }

    private static Pair<Long, String> e(y yVar) {
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(iA == 0 ? 8 : 16);
        long jO = yVar.o();
        yVar.e(iA == 0 ? 4 : 8);
        int i = yVar.i();
        return Pair.create(Long.valueOf(jO), "" + ((char) (((i >> 10) & 31) + 96)) + ((char) (((i >> 5) & 31) + 96)) + ((char) ((i & 31) + 96)));
    }

    private static c a(y yVar, int i, int i2, String str, com.applovin.exoplayer2.d.e eVar, boolean z) throws com.applovin.exoplayer2.ai {
        int i3;
        yVar.d(12);
        int iQ = yVar.q();
        c cVar = new c(iQ);
        for (int i4 = 0; i4 < iQ; i4++) {
            int iC = yVar.c();
            int iQ2 = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = yVar.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                i3 = iC;
                a(yVar, iQ3, i3, iQ2, i, i2, eVar, cVar, i4);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667) {
                i3 = iC;
                a(yVar, iQ3, iC, iQ2, i, str, z, eVar, cVar, i4);
            } else {
                if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                    a(yVar, iQ3, iC, iQ2, i, str, cVar);
                } else if (iQ3 == 1835365492) {
                    a(yVar, iQ3, iC, i, cVar);
                } else if (iQ3 == 1667329389) {
                    cVar.b = new v.a().a(i).f("application/x-camera-motion").a();
                }
                i3 = iC;
            }
            yVar.d(i3 + iQ2);
        }
        return cVar;
    }

    private static void a(y yVar, int i, int i2, int i3, int i4, String str, c cVar) {
        yVar.d(i2 + 16);
        String str2 = "application/ttml+xml";
        s sVarA = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                yVar.a(bArr, 0, i5);
                sVarA = s.a(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.b = new v.a().a(i4).f(str2).c(str).a(j).a(sVarA).a();
    }

    private static void a(y yVar, int i, int i2, int i3, int i4, int i5, com.applovin.exoplayer2.d.e eVar, c cVar, int i6) throws com.applovin.exoplayer2.ai {
        String str;
        com.applovin.exoplayer2.d.e eVar2;
        String str2;
        y yVar2 = yVar;
        int i7 = i2;
        int i8 = i3;
        com.applovin.exoplayer2.d.e eVarA = eVar;
        yVar2.d(i7 + 16);
        yVar2.e(16);
        int i9 = yVar.i();
        int i10 = yVar.i();
        yVar2.e(50);
        int iC = yVar.c();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, l> pairC = c(yVar2, i7, i8);
            if (pairC != null) {
                iIntValue = ((Integer) pairC.first).intValue();
                eVarA = eVarA == null ? null : eVarA.a(((l) pairC.second).b);
                cVar.f297a[i6] = (l) pairC.second;
            }
            yVar2.d(iC);
        }
        String str3 = "video/3gpp";
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        } else {
            str = "video/mpeg";
        }
        float fD = 1.0f;
        int i11 = -1;
        String str4 = null;
        List<byte[]> listA = null;
        byte[] bArrD = null;
        com.applovin.exoplayer2.m.b bVar = null;
        boolean z = false;
        while (true) {
            if (iC - i7 >= i8) {
                eVar2 = eVarA;
                break;
            }
            yVar2.d(iC);
            int iC2 = yVar.c();
            String str5 = str3;
            int iQ = yVar.q();
            if (iQ == 0) {
                eVar2 = eVarA;
                if (yVar.c() - i7 == i8) {
                    break;
                }
            } else {
                eVar2 = eVarA;
            }
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = yVar.q();
            if (iQ2 == 1635148611) {
                com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                yVar2.d(iC2 + 8);
                com.applovin.exoplayer2.m.a aVarA = com.applovin.exoplayer2.m.a.a(yVar);
                listA = aVarA.f640a;
                cVar.c = aVarA.b;
                if (!z) {
                    fD = aVarA.e;
                }
                str4 = aVarA.f;
                str2 = "video/avc";
            } else if (iQ2 == 1752589123) {
                com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                yVar2.d(iC2 + 8);
                com.applovin.exoplayer2.m.f fVarA = com.applovin.exoplayer2.m.f.a(yVar);
                listA = fVarA.f656a;
                cVar.c = fVarA.b;
                str4 = fVarA.c;
                str2 = "video/hevc";
            } else {
                if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                    com.applovin.exoplayer2.m.c cVarA = com.applovin.exoplayer2.m.c.a(yVar);
                    if (cVarA != null) {
                        str4 = cVarA.c;
                        str = "video/dolby-vision";
                    }
                } else if (iQ2 == 1987076931) {
                    com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                    str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (iQ2 == 1635135811) {
                    com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                    str = "video/av01";
                } else if (iQ2 == 1681012275) {
                    com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                    str = str5;
                } else if (iQ2 == 1702061171) {
                    com.applovin.exoplayer2.e.k.a(str == null, (String) null);
                    Pair<String, byte[]> pairE = e(yVar2, iC2);
                    String str6 = (String) pairE.first;
                    byte[] bArr = (byte[]) pairE.second;
                    if (bArr != null) {
                        listA = s.a(bArr);
                    }
                    str = str6;
                } else if (iQ2 == 1885434736) {
                    fD = d(yVar2, iC2);
                    z = true;
                } else if (iQ2 == 1937126244) {
                    bArrD = d(yVar2, iC2, iQ);
                } else if (iQ2 == 1936995172) {
                    int iH = yVar.h();
                    yVar2.e(3);
                    if (iH == 0) {
                        int iH2 = yVar.h();
                        if (iH2 == 0) {
                            i11 = 0;
                        } else if (iH2 == 1) {
                            i11 = 1;
                        } else if (iH2 == 2) {
                            i11 = 2;
                        } else if (iH2 == 3) {
                            i11 = 3;
                        }
                    }
                } else if (iQ2 == 1668246642) {
                    int iQ3 = yVar.q();
                    boolean z2 = iQ3 == 1852009592;
                    if (z2 || iQ3 == 1852009571) {
                        int i12 = yVar.i();
                        int i13 = yVar.i();
                        yVar2.e(2);
                        bVar = new com.applovin.exoplayer2.m.b(com.applovin.exoplayer2.m.b.a(i12), z2 && (yVar.h() & 128) != 0 ? 1 : 2, com.applovin.exoplayer2.m.b.b(i13), null);
                    } else {
                        q.c("AtomParsers", "Unsupported color type: " + com.applovin.exoplayer2.e.g.a.c(iQ3));
                    }
                }
                iC += iQ;
                yVar2 = yVar;
                i7 = i2;
                i8 = i3;
                str3 = str5;
                eVarA = eVar2;
            }
            str = str2;
            iC += iQ;
            yVar2 = yVar;
            i7 = i2;
            i8 = i3;
            str3 = str5;
            eVarA = eVar2;
        }
        if (str == null) {
            return;
        }
        cVar.b = new v.a().a(i4).f(str).d(str4).g(i9).h(i10).b(fD).i(i5).a(bArrD).j(i11).a(listA).a(eVar2).a(bVar).a();
    }

    private static void a(y yVar, int i, int i2, int i3, c cVar) {
        yVar.d(i2 + 16);
        if (i == 1835365492) {
            yVar.B();
            String strB = yVar.B();
            if (strB != null) {
                cVar.b = new v.a().a(i3).f(strB).a();
            }
        }
    }

    private static Pair<long[], long[]> b(a.C0024a c0024a) {
        a.b bVarD = c0024a.d(1701606260);
        if (bVarD == null) {
            return null;
        }
        y yVar = bVarD.b;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        int iW = yVar.w();
        long[] jArr = new long[iW];
        long[] jArr2 = new long[iW];
        for (int i = 0; i < iW; i++) {
            jArr[i] = iA == 1 ? yVar.y() : yVar.o();
            jArr2[i] = iA == 1 ? yVar.s() : yVar.q();
            if (yVar.k() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            yVar.e(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float d(y yVar, int i) {
        yVar.d(i + 8);
        return yVar.w() / yVar.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.applovin.exoplayer2.l.y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.exoplayer2.d.e r27, com.applovin.exoplayer2.e.g.b.c r28, int r29) throws com.applovin.exoplayer2.ai {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.b.a(com.applovin.exoplayer2.l.y, int, int, int, int, java.lang.String, boolean, com.applovin.exoplayer2.d.e, com.applovin.exoplayer2.e.g.b$c, int):void");
    }

    private static int b(y yVar, int i, int i2) throws com.applovin.exoplayer2.ai {
        int iC = yVar.c();
        while (iC - i < i2) {
            yVar.d(iC);
            int iQ = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1702061171) {
                return iC;
            }
            iC += iQ;
        }
        return -1;
    }

    private static Pair<String, byte[]> e(y yVar, int i) {
        yVar.d(i + 12);
        yVar.e(1);
        f(yVar);
        yVar.e(2);
        int iH = yVar.h();
        if ((iH & 128) != 0) {
            yVar.e(2);
        }
        if ((iH & 64) != 0) {
            yVar.e(yVar.i());
        }
        if ((iH & 32) != 0) {
            yVar.e(2);
        }
        yVar.e(1);
        f(yVar);
        String strA = u.a(yVar.h());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return Pair.create(strA, null);
        }
        yVar.e(12);
        yVar.e(1);
        int iF = f(yVar);
        byte[] bArr = new byte[iF];
        yVar.a(bArr, 0, iF);
        return Pair.create(strA, bArr);
    }

    private static Pair<Integer, l> c(y yVar, int i, int i2) throws com.applovin.exoplayer2.ai {
        Pair<Integer, l> pairA;
        int iC = yVar.c();
        while (iC - i < i2) {
            yVar.d(iC);
            int iQ = yVar.q();
            com.applovin.exoplayer2.e.k.a(iQ > 0, "childAtomSize must be positive");
            if (yVar.q() == 1936289382 && (pairA = a(yVar, iC, iQ)) != null) {
                return pairA;
            }
            iC += iQ;
        }
        return null;
    }

    static Pair<Integer, l> a(y yVar, int i, int i2) throws com.applovin.exoplayer2.ai {
        int i3 = i + 8;
        String strF = null;
        Integer numValueOf = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            yVar.d(i3);
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(yVar.q());
            } else if (iQ2 == 1935894637) {
                yVar.e(4);
                strF = yVar.f(4);
            } else if (iQ2 == 1935894633) {
                i4 = i3;
                i5 = iQ;
            }
            i3 += iQ;
        }
        if (!"cenc".equals(strF) && !"cbc1".equals(strF) && !"cens".equals(strF) && !"cbcs".equals(strF)) {
            return null;
        }
        com.applovin.exoplayer2.e.k.a(numValueOf != null, "frma atom is mandatory");
        com.applovin.exoplayer2.e.k.a(i4 != -1, "schi atom is mandatory");
        l lVarA = a(yVar, i4, i5, strF);
        com.applovin.exoplayer2.e.k.a(lVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (l) ai.a(lVarA));
    }

    private static l a(y yVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            yVar.d(i5);
            int iQ = yVar.q();
            if (yVar.q() == 1952804451) {
                int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
                yVar.e(1);
                if (iA == 0) {
                    yVar.e(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iH = yVar.h();
                    i3 = iH & 15;
                    i4 = (iH & 240) >> 4;
                }
                boolean z = yVar.h() == 1;
                int iH2 = yVar.h();
                byte[] bArr2 = new byte[16];
                yVar.a(bArr2, 0, 16);
                if (z && iH2 == 0) {
                    int iH3 = yVar.h();
                    bArr = new byte[iH3];
                    yVar.a(bArr, 0, iH3);
                }
                return new l(z, str, iH2, bArr2, i4, i3, bArr);
            }
            i5 += iQ;
        }
    }

    private static byte[] d(y yVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            yVar.d(i3);
            int iQ = yVar.q();
            if (yVar.q() == 1886547818) {
                return Arrays.copyOfRange(yVar.d(), i3, iQ + i3);
            }
            i3 += iQ;
        }
        return null;
    }

    private static int f(y yVar) {
        int iH = yVar.h();
        int i = iH & 127;
        while ((iH & 128) == 128) {
            iH = yVar.h();
            i = (i << 7) | (iH & 127);
        }
        return i;
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[ai.a(4, 0, length)] && jArr[ai.a(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f296a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final y f;
        private final y g;
        private int h;
        private int i;

        public a(y yVar, y yVar2, boolean z) throws com.applovin.exoplayer2.ai {
            this.g = yVar;
            this.f = yVar2;
            this.e = z;
            yVar2.d(12);
            this.f296a = yVar2.w();
            yVar.d(12);
            this.i = yVar.w();
            com.applovin.exoplayer2.e.k.a(yVar.q() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long jO;
            int i = this.b + 1;
            this.b = i;
            if (i == this.f296a) {
                return false;
            }
            if (this.e) {
                jO = this.f.y();
            } else {
                jO = this.f.o();
            }
            this.d = jO;
            if (this.b == this.h) {
                this.c = this.g.w();
                this.g.e(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.w() - 1 : -1;
            }
            return true;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f300a;
        private final long b;
        private final int c;

        public f(int i, long j, int i2) {
            this.f300a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l[] f297a;
        public v b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.f297a = new l[i];
        }
    }

    static final class d implements InterfaceC0025b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f298a;
        private final int b;
        private final y c;

        public d(a.b bVar, v vVar) {
            y yVar = bVar.b;
            this.c = yVar;
            yVar.d(12);
            int iW = yVar.w();
            if ("audio/raw".equals(vVar.l)) {
                int iC = ai.c(vVar.A, vVar.y);
                if (iW == 0 || iW % iC != 0) {
                    q.c("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iC + ", stsz sample size: " + iW);
                    iW = iC;
                }
            }
            this.f298a = iW == 0 ? -1 : iW;
            this.b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int a() {
            return this.b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int b() {
            return this.f298a;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int c() {
            int i = this.f298a;
            return i == -1 ? this.c.w() : i;
        }
    }

    static final class e implements InterfaceC0025b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f299a;
        private final int b;
        private final int c;
        private int d;
        private int e;

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int b() {
            return -1;
        }

        public e(a.b bVar) {
            y yVar = bVar.b;
            this.f299a = yVar;
            yVar.d(12);
            this.c = yVar.w() & 255;
            this.b = yVar.w();
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int a() {
            return this.b;
        }

        @Override // com.applovin.exoplayer2.e.g.b.InterfaceC0025b
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.f299a.h();
            }
            if (i == 16) {
                return this.f299a.i();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int iH = this.f299a.h();
                this.e = iH;
                return (iH & 240) >> 4;
            }
            return this.e & 15;
        }
    }
}
