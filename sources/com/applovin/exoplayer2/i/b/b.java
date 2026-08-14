package com.applovin.exoplayer2.i.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f498a = {0, 7, 8, Ascii.SI};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final C0037b g;
    private final a h;
    private final h i;
    private Bitmap j;

    private static int a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public b(int i, int i2) {
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.g = new C0037b(719, 575, 0, 719, 0, 575);
        this.h = new a(0, b(), c(), d());
        this.i = new h(i, i2);
    }

    public void a() {
        this.i.a();
    }

    public List<com.applovin.exoplayer2.i.a> a(byte[] bArr, int i) {
        C0037b c0037b;
        int i2;
        int i3;
        SparseArray<g> sparseArray;
        x xVar = new x(bArr, i);
        while (xVar.a() >= 48 && xVar.c(8) == 15) {
            a(xVar, this.i);
        }
        d dVar = this.i.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        if (this.i.h != null) {
            c0037b = this.i.h;
        } else {
            c0037b = this.g;
        }
        if (this.j == null || c0037b.f500a + 1 != this.j.getWidth() || c0037b.b + 1 != this.j.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0037b.f500a + 1, c0037b.b + 1, Bitmap.Config.ARGB_8888);
            this.j = bitmapCreateBitmap;
            this.f.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f.save();
            e eVarValueAt = sparseArray2.valueAt(i4);
            f fVar = this.i.c.get(sparseArray2.keyAt(i4));
            int i5 = eVarValueAt.f503a + c0037b.c;
            int i6 = eVarValueAt.b + c0037b.e;
            this.f.clipRect(i5, i6, Math.min(fVar.c + i5, c0037b.d), Math.min(fVar.d + i6, c0037b.f));
            a aVar = this.i.d.get(fVar.g);
            if (aVar == null && (aVar = this.i.f.get(fVar.g)) == null) {
                aVar = this.h;
            }
            SparseArray<g> sparseArray3 = fVar.k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i7);
                g gVarValueAt = sparseArray3.valueAt(i7);
                c cVar = this.i.e.get(iKeyAt);
                c cVar2 = cVar == null ? this.i.g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f, gVarValueAt.c + i5, i6 + gVarValueAt.d, cVar2.b ? null : this.d, this.f);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                if (fVar.f == 3) {
                    i2 = aVar.d[fVar.h];
                } else if (fVar.f == 2) {
                    i2 = aVar.c[fVar.i];
                } else {
                    i2 = aVar.b[fVar.j];
                }
                this.e.setColor(i2);
                this.f.drawRect(i5, i6, fVar.c + i5, fVar.d + i6, this.e);
            }
            arrayList.add(new a.C0033a().a(Bitmap.createBitmap(this.j, i5, i6, fVar.c, fVar.d)).a(i5 / c0037b.f500a).b(0).a(i6 / c0037b.b, 0).a(0).b(fVar.c / c0037b.f500a).c(fVar.d / c0037b.b).e());
            this.f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(x xVar, h hVar) {
        f fVar;
        int iC = xVar.c(8);
        int iC2 = xVar.c(16);
        int iC3 = xVar.c(16);
        int iC4 = xVar.c() + iC3;
        if (iC3 * 8 > xVar.a()) {
            q.c("DvbParser", "Data field length exceeds limit");
            xVar.b(xVar.a());
            return;
        }
        switch (iC) {
            case 16:
                if (iC2 == hVar.f506a) {
                    d dVar = hVar.i;
                    d dVarA = a(xVar, iC3);
                    if (dVarA.c != 0) {
                        hVar.i = dVarA;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                    } else if (dVar != null && dVar.b != dVarA.b) {
                        hVar.i = dVarA;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (iC2 == hVar.f506a && dVar2 != null) {
                    f fVarB = b(xVar, iC3);
                    if (dVar2.c == 0 && (fVar = hVar.c.get(fVarB.f504a)) != null) {
                        fVarB.a(fVar);
                    }
                    hVar.c.put(fVarB.f504a, fVarB);
                }
                break;
            case 18:
                if (iC2 == hVar.f506a) {
                    a aVarC = c(xVar, iC3);
                    hVar.d.put(aVarC.f499a, aVarC);
                } else if (iC2 == hVar.b) {
                    a aVarC2 = c(xVar, iC3);
                    hVar.f.put(aVarC2.f499a, aVarC2);
                }
                break;
            case 19:
                if (iC2 == hVar.f506a) {
                    c cVarB = b(xVar);
                    hVar.e.put(cVarB.f501a, cVarB);
                } else if (iC2 == hVar.b) {
                    c cVarB2 = b(xVar);
                    hVar.g.put(cVarB2.f501a, cVarB2);
                }
                break;
            case 20:
                if (iC2 == hVar.f506a) {
                    hVar.h = a(xVar);
                }
                break;
        }
        xVar.e(iC4 - xVar.c());
    }

    private static C0037b a(x xVar) {
        int i;
        int iC;
        int i2;
        int i3;
        xVar.b(4);
        boolean zE = xVar.e();
        xVar.b(3);
        int iC2 = xVar.c(16);
        int iC3 = xVar.c(16);
        if (zE) {
            int iC4 = xVar.c(16);
            int iC5 = xVar.c(16);
            int iC6 = xVar.c(16);
            iC = xVar.c(16);
            i = iC5;
            i3 = iC6;
            i2 = iC4;
        } else {
            i = iC2;
            iC = iC3;
            i2 = 0;
            i3 = 0;
        }
        return new C0037b(iC2, iC3, i2, i, i3, iC);
    }

    private static d a(x xVar, int i) {
        int iC = xVar.c(8);
        int iC2 = xVar.c(4);
        int iC3 = xVar.c(2);
        xVar.b(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iC4 = xVar.c(8);
            xVar.b(8);
            i2 -= 6;
            sparseArray.put(iC4, new e(xVar.c(16), xVar.c(16)));
        }
        return new d(iC, iC2, iC3, sparseArray);
    }

    private static f b(x xVar, int i) {
        int iC;
        int iC2;
        int iC3 = xVar.c(8);
        xVar.b(4);
        boolean zE = xVar.e();
        xVar.b(3);
        int i2 = 16;
        int iC4 = xVar.c(16);
        int iC5 = xVar.c(16);
        int iC6 = xVar.c(3);
        int iC7 = xVar.c(3);
        int i3 = 2;
        xVar.b(2);
        int iC8 = xVar.c(8);
        int iC9 = xVar.c(8);
        int iC10 = xVar.c(4);
        int iC11 = xVar.c(2);
        xVar.b(2);
        int i4 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int iC12 = xVar.c(i2);
            int iC13 = xVar.c(i3);
            int iC14 = xVar.c(i3);
            int iC15 = xVar.c(12);
            int i5 = iC11;
            xVar.b(4);
            int iC16 = xVar.c(12);
            int i6 = i4 - 6;
            if (iC13 == 1 || iC13 == 2) {
                i4 -= 8;
                iC = xVar.c(8);
                iC2 = xVar.c(8);
            } else {
                i4 = i6;
                iC = 0;
                iC2 = 0;
            }
            sparseArray.put(iC12, new g(iC13, iC14, iC15, iC16, iC, iC2));
            iC11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new f(iC3, zE, iC4, iC5, iC6, iC7, iC8, iC9, iC10, iC11, sparseArray);
    }

    private static a c(x xVar, int i) {
        int iC;
        int i2;
        int iC2;
        int iC3;
        int iC4;
        int i3 = 8;
        int iC5 = xVar.c(8);
        xVar.b(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrB = b();
        int[] iArrC = c();
        int[] iArrD = d();
        while (i5 > 0) {
            int iC6 = xVar.c(i3);
            int iC7 = xVar.c(i3);
            int[] iArr = (iC7 & 128) != 0 ? iArrB : (iC7 & 64) != 0 ? iArrC : iArrD;
            if ((iC7 & 1) != 0) {
                iC3 = xVar.c(i3);
                iC4 = xVar.c(i3);
                iC = xVar.c(i3);
                iC2 = xVar.c(i3);
                i2 = i5 - 6;
            } else {
                int iC8 = xVar.c(6) << i4;
                int iC9 = xVar.c(4) << 4;
                iC = xVar.c(4) << 4;
                i2 = i5 - 4;
                iC2 = xVar.c(i4) << 6;
                iC3 = iC8;
                iC4 = iC9;
            }
            if (iC3 == 0) {
                iC4 = 0;
                iC = 0;
                iC2 = 255;
            }
            double d2 = iC3;
            double d3 = iC4 - 128;
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d4 = iC - 128;
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            iArr[iC6] = a((byte) (255 - (iC2 & 255)), ai.a((int) (d2 + (1.402d * d3)), 0, 255), ai.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), ai.a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i5 = i2;
            iC5 = iC5;
            i3 = 8;
            i4 = 2;
        }
        return new a(iC5, iArrB, iArrC, iArrD);
    }

    private static c b(x xVar) {
        int iC = xVar.c(16);
        xVar.b(4);
        int iC2 = xVar.c(2);
        boolean zE = xVar.e();
        xVar.b(1);
        byte[] bArr = ai.f;
        byte[] bArr2 = ai.f;
        if (iC2 == 1) {
            xVar.b(xVar.c(8) * 16);
        } else if (iC2 == 0) {
            int iC3 = xVar.c(16);
            int iC4 = xVar.c(16);
            if (iC3 > 0) {
                bArr = new byte[iC3];
                xVar.b(bArr, 0, iC3);
            }
            if (iC4 > 0) {
                bArr2 = new byte[iC4];
                xVar.b(bArr2, 0, iC4);
            } else {
                bArr2 = bArr;
            }
        }
        return new c(iC, zE, bArr, bArr2);
    }

    private static int[] b() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = a(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = a(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = a(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = a(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void a(c cVar, a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.d;
        } else if (i == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        a(cVar.c, iArr2, i, i2, i3, paint, canvas);
        a(cVar.d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    private static void a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        x xVar = new x(bArr);
        int iA = i2;
        int i4 = i3;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (xVar.a() != 0) {
            int iC = xVar.c(8);
            if (iC != 240) {
                switch (iC) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrA == null ? b : bArrA;
                        } else if (i == 2) {
                            bArr3 = bArrA3 == null ? f498a : bArrA3;
                        } else {
                            bArr2 = null;
                            iA = a(xVar, iArr, bArr2, iA, i4, paint, canvas);
                            xVar.f();
                        }
                        bArr2 = bArr3;
                        iA = a(xVar, iArr, bArr2, iA, i4, paint, canvas);
                        xVar.f();
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrA2 == null ? c : bArrA2;
                        } else {
                            bArr4 = null;
                        }
                        iA = b(xVar, iArr, bArr4, iA, i4, paint, canvas);
                        xVar.f();
                        break;
                    case 18:
                        iA = c(xVar, iArr, null, iA, i4, paint, canvas);
                        break;
                    default:
                        switch (iC) {
                            case 32:
                                bArrA3 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, xVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, xVar);
                                break;
                        }
                        break;
                }
            } else {
                i4 += 2;
                iA = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.applovin.exoplayer2.l.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.e()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.c(r6)
            int r4 = r4 + r6
            int r3 = r13.c(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.e()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.c(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 29
            int r3 = r13.c(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.c(r4)
            int r4 = r4 + 12
            int r3 = r13.c(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.a(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[LOOP:0: B:3:0x0009->B:36:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(com.applovin.exoplayer2.l.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L12:
            r12 = 1
            goto L6e
        L15:
            boolean r4 = r13.e()
            r6 = 3
            if (r4 != 0) goto L2b
            int r3 = r13.c(r6)
            if (r3 == 0) goto L28
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
            r4 = 0
            goto L6e
        L28:
            r4 = 0
            r11 = 1
            goto L4d
        L2b:
            boolean r4 = r13.e()
            r7 = 2
            if (r4 != 0) goto L3f
            int r4 = r13.c(r7)
            int r4 = r4 + r3
            int r3 = r13.c(r3)
        L3b:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L6e
        L3f:
            int r4 = r13.c(r7)
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L67
            if (r4 == r7) goto L5c
            if (r4 == r6) goto L4f
            r11 = r2
            r4 = 0
        L4d:
            r12 = 0
            goto L6e
        L4f:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 25
            int r3 = r13.c(r3)
            goto L3b
        L5c:
            int r4 = r13.c(r3)
            int r4 = r4 + 9
            int r3 = r13.c(r3)
            goto L3b
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L12
        L6e:
            if (r12 == 0) goto L8c
            if (r8 == 0) goto L8c
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8c:
            int r10 = r10 + r12
            if (r11 == 0) goto L90
            return r10
        L90:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.b(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int c(x xVar, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int iC;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int iC2 = xVar.c(8);
            if (iC2 != 0) {
                z = z2;
                iC = 1;
            } else if (!xVar.e()) {
                int iC3 = xVar.c(7);
                if (iC3 != 0) {
                    z = z2;
                    iC = iC3;
                    iC2 = 0;
                } else {
                    iC2 = 0;
                    z = true;
                    iC = 0;
                }
            } else {
                z = z2;
                iC = xVar.c(7);
                iC2 = xVar.c(8);
            }
            if (iC != 0 && paint != null) {
                if (bArr != null) {
                    iC2 = bArr[iC2];
                }
                paint.setColor(iArr[iC2]);
                canvas.drawRect(i3, i2, i3 + iC, i2 + 1, paint);
            }
            i3 += iC;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    private static byte[] a(int i, int i2, x xVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) xVar.c(i2);
        }
        return bArr;
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f506a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public C0037b h;
        public d i;

        public h(int i, int i2) {
            this.f506a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.b.b$b, reason: collision with other inner class name */
    private static final class C0037b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f500a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public C0037b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f500a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f502a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.f502a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f503a;
        public final int b;

        public e(int i, int i2) {
            this.f503a = i;
            this.b = i2;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f504a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.f504a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f505a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f505a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f499a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f499a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f501a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f501a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }
}
