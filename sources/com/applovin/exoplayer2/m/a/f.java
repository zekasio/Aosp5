package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.m.a.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static e a(byte[] bArr, int i) {
        ArrayList<e.a> arrayListB;
        y yVar = new y(bArr);
        try {
            arrayListB = a(yVar) ? b(yVar) : c(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListB = null;
        }
        if (arrayListB == null) {
            return null;
        }
        int size = arrayListB.size();
        if (size == 1) {
            return new e(arrayListB.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListB.get(0), arrayListB.get(1), i);
    }

    private static boolean a(y yVar) {
        yVar.e(4);
        int iQ = yVar.q();
        yVar.d(0);
        return iQ == 1886547818;
    }

    private static ArrayList<e.a> b(y yVar) {
        int iQ;
        yVar.e(8);
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB && (iQ = yVar.q() + iC) > iC && iQ <= iB) {
            int iQ2 = yVar.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                yVar.c(iQ);
                return c(yVar);
            }
            yVar.d(iQ);
            iC = iQ;
        }
        return null;
    }

    private static ArrayList<e.a> c(y yVar) {
        if (yVar.h() != 0) {
            return null;
        }
        yVar.e(7);
        int iQ = yVar.q();
        if (iQ == 1684433976) {
            y yVar2 = new y();
            Inflater inflater = new Inflater(true);
            try {
                if (!ai.a(yVar, yVar2, inflater)) {
                    return null;
                }
                inflater.end();
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return d(yVar);
    }

    private static ArrayList<e.a> d(y yVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB) {
            int iQ = yVar.q() + iC;
            if (iQ <= iC || iQ > iB) {
                return null;
            }
            if (yVar.q() == 1835365224) {
                e.a aVarE = e(yVar);
                if (aVarE == null) {
                    return null;
                }
                arrayList.add(aVarE);
            }
            yVar.d(iQ);
            iC = iQ;
        }
        return arrayList;
    }

    private static e.a e(y yVar) {
        int iQ = yVar.q();
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i = 0; i < iQ; i++) {
            fArr[i] = yVar.z();
        }
        int iQ2 = yVar.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        double d2 = iQ;
        Double.isNaN(d2);
        int iCeil = (int) Math.ceil(Math.log(d2 * 2.0d) / dLog);
        x xVar = new x(yVar.d());
        int i2 = 8;
        xVar.a(yVar.c() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iQ2) {
            int i6 = 0;
            while (i6 < i3) {
                int iA = iArr[i6] + a(xVar.c(iCeil));
                if (iA >= iQ || iA < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iA];
                iArr[i6] = iA;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xVar.a((xVar.b() + 7) & (-8));
        int i7 = 32;
        int iC = xVar.c(32);
        e.b[] bVarArr = new e.b[iC];
        int i8 = 0;
        while (i8 < iC) {
            int iC2 = xVar.c(i2);
            int iC3 = xVar.c(i2);
            int iC4 = xVar.c(i7);
            if (iC4 > 128000) {
                return null;
            }
            double d3 = iQ2;
            Double.isNaN(d3);
            int iCeil2 = (int) Math.ceil(Math.log(d3 * d) / dLog);
            float[] fArr3 = new float[iC4 * 3];
            float[] fArr4 = new float[iC4 * 2];
            int iA2 = 0;
            for (int i9 = 0; i9 < iC4; i9++) {
                iA2 += a(xVar.c(iCeil2));
                if (iA2 < 0 || iA2 >= iQ2) {
                    return null;
                }
                int i10 = i9 * 3;
                int i11 = iA2 * 5;
                fArr3[i10] = fArr2[i11];
                fArr3[i10 + 1] = fArr2[i11 + 1];
                fArr3[i10 + 2] = fArr2[i11 + 2];
                int i12 = i9 * 2;
                fArr4[i12] = fArr2[i11 + 3];
                fArr4[i12 + 1] = fArr2[i11 + 4];
            }
            bVarArr[i8] = new e.b(iC2, fArr3, fArr4, iC3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new e.a(bVarArr);
    }
}
