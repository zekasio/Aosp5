package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f57a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.f58a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        int i = b[(yVar.h() & 192) >> 6];
        int iH = yVar.h();
        int i2 = d[(iH & 56) >> 3];
        if ((iH & 4) != 0) {
            i2++;
        }
        return new v.a().a(str).f("audio/ac3").k(i2).l(i).a(eVar).c(str2).a();
    }

    public static com.applovin.exoplayer2.v b(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        String str3;
        yVar.e(2);
        int i = b[(yVar.h() & 192) >> 6];
        int iH = yVar.h();
        int i2 = d[(iH & 14) >> 1];
        if ((iH & 1) != 0) {
            i2++;
        }
        if (((yVar.h() & 30) >> 1) > 0 && (2 & yVar.h()) != 0) {
            i2 += 2;
        }
        if (yVar.a() > 0 && (yVar.h() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        return new v.a().a(str).f(str3).k(i2).l(i).a(eVar).c(str2).a();
    }

    public static a a(com.applovin.exoplayer2.l.x xVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iC;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int iB = xVar.b();
        xVar.b(40);
        boolean z = xVar.c(5) > 10;
        xVar.a(iB);
        int i11 = -1;
        if (z) {
            xVar.b(16);
            int iC2 = xVar.c(2);
            if (iC2 == 0) {
                i11 = 0;
            } else if (iC2 == 1) {
                i11 = 1;
            } else if (iC2 == 2) {
                i11 = 2;
            }
            xVar.b(3);
            int iC3 = (xVar.c(11) + 1) * 2;
            int iC4 = xVar.c(2);
            if (iC4 == 3) {
                i7 = c[xVar.c(2)];
                iC = 3;
                i6 = 6;
            } else {
                iC = xVar.c(2);
                i6 = f57a[iC];
                i7 = b[iC4];
            }
            int i12 = i6 * 256;
            int iC5 = xVar.c(3);
            boolean zE = xVar.e();
            int i13 = d[iC5] + (zE ? 1 : 0);
            xVar.b(10);
            if (xVar.e()) {
                xVar.b(8);
            }
            if (iC5 == 0) {
                xVar.b(5);
                if (xVar.e()) {
                    xVar.b(8);
                }
            }
            if (i11 == 1 && xVar.e()) {
                xVar.b(16);
            }
            if (xVar.e()) {
                if (iC5 > 2) {
                    xVar.b(2);
                }
                if ((iC5 & 1) == 0 || iC5 <= 2) {
                    i9 = 6;
                } else {
                    i9 = 6;
                    xVar.b(6);
                }
                if ((iC5 & 4) != 0) {
                    xVar.b(i9);
                }
                if (zE && xVar.e()) {
                    xVar.b(5);
                }
                if (i11 == 0) {
                    if (xVar.e()) {
                        i10 = 6;
                        xVar.b(6);
                    } else {
                        i10 = 6;
                    }
                    if (iC5 == 0 && xVar.e()) {
                        xVar.b(i10);
                    }
                    if (xVar.e()) {
                        xVar.b(i10);
                    }
                    int iC6 = xVar.c(2);
                    if (iC6 == 1) {
                        xVar.b(5);
                    } else if (iC6 == 2) {
                        xVar.b(12);
                    } else if (iC6 == 3) {
                        int iC7 = xVar.c(5);
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                            }
                        }
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(7);
                                if (xVar.e()) {
                                    xVar.b(8);
                                }
                            }
                        }
                        xVar.b((iC7 + 2) * 8);
                        xVar.f();
                    }
                    if (iC5 < 2) {
                        if (xVar.e()) {
                            xVar.b(14);
                        }
                        if (iC5 == 0 && xVar.e()) {
                            xVar.b(14);
                        }
                    }
                    if (xVar.e()) {
                        if (iC == 0) {
                            xVar.b(5);
                        } else {
                            for (int i14 = 0; i14 < i6; i14++) {
                                if (xVar.e()) {
                                    xVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.e()) {
                xVar.b(5);
                if (iC5 == 2) {
                    xVar.b(4);
                }
                if (iC5 >= 6) {
                    xVar.b(2);
                }
                if (xVar.e()) {
                    xVar.b(8);
                }
                if (iC5 == 0 && xVar.e()) {
                    xVar.b(8);
                }
                if (iC4 < 3) {
                    xVar.d();
                }
            }
            if (i11 == 0 && iC != 3) {
                xVar.d();
            }
            if (i11 == 2 && (iC == 3 || xVar.e())) {
                i8 = 6;
                xVar.b(6);
            } else {
                i8 = 6;
            }
            if (xVar.e() && xVar.c(i8) == 1 && xVar.c(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
            i4 = i11;
            i5 = i12;
            i = iC3;
            i2 = i7;
            i3 = i13;
        } else {
            xVar.b(32);
            int iC8 = xVar.c(2);
            String str3 = iC8 == 3 ? null : "audio/ac3";
            int iA = a(iC8, xVar.c(6));
            xVar.b(8);
            int iC9 = xVar.c(3);
            if ((iC9 & 1) != 0 && iC9 != 1) {
                xVar.b(2);
            }
            if ((iC9 & 4) != 0) {
                xVar.b(2);
            }
            if (iC9 == 2) {
                xVar.b(2);
            }
            int[] iArr = b;
            str = str3;
            i = iA;
            i2 = iC8 < iArr.length ? iArr[iC8] : -1;
            i3 = d[iC9] + (xVar.e() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new a(str, i4, i3, i2, i, i5);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f57a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((ai.a(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
