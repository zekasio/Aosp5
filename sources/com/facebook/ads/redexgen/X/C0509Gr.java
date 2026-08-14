package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0509Gr {
    public static byte[] A07;
    public static String[] A08 = {"0rGqU9QbqgRhw9xCYiy2ikjdJF0tZxW0", "O5zJjRmwn", "Zuwvbdj2tlT5lxRkpa9deVxz18dZQdtj", "3cu9YvSu9oYTgNu7SXt0BZa9RO8c3dJe", "fSpgVoQESo9i788g3Yt2BRpnP7rxN0lE", "PNJ5rPmEA0nUP9bGeJM8wQu7KuAYrDy", "AGqKR696jXLUBqkrCQSQW886irj6NtRI", "IRr9cxFu4Mtz1eOchhtcqFpk7Zjv6sDY"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C0501Gj A04;
    public final C0502Gk A05;
    public final C0508Gq A06;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
            String[] strArr = A08;
            if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "o838eL9fL";
            strArr2[5] = "J6qCpr7RcsAqb79Ub3PrHCSZxMucifP";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-109, -80, -61, -80, 111, -75, -72, -76, -69, -77, 111, -69, -76, -67, -74, -61, -73, 111, -76, -57, -78, -76, -76, -77, -62, 111, -69, -72, -68, -72, -61, -16, 34, Ascii.SO, -4, Ascii.CR, Ascii.RS, Ascii.US, 17, Ascii.RS};
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, Ascii.SI};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0509Gr(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0502Gk(719, 575, 0, 719, 0, 575);
        this.A04 = new C0501Gj(0, A0F(), A0G(), A0H());
        this.A06 = new C0508Gq(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0550Ii c0550Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        int column = 0;
        do {
            int runLength = 0;
            int iA04 = c0550Ii.A04(2);
            if (iA04 != 0) {
                runLength = 1;
            } else {
                boolean zA0F = c0550Ii.A0F();
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "NWJ2j8DR8";
                strArr2[5] = "tuFwEgjWv5QsbV2rgY7O01mW2P3xd0b";
                if (zA0F) {
                    runLength = c0550Ii.A04(3) + 3;
                    iA04 = c0550Ii.A04(2);
                } else if (c0550Ii.A0F()) {
                    runLength = 1;
                    iA04 = 0;
                } else {
                    int iA042 = c0550Ii.A04(2);
                    if (iA042 == 0) {
                        column = 1;
                        iA04 = 0;
                    } else if (iA042 != 1) {
                        if (iA042 == 2) {
                            runLength = c0550Ii.A04(4) + 12;
                            iA04 = c0550Ii.A04(2);
                        } else if (iA042 != 3) {
                            iA04 = 0;
                        } else {
                            int iA043 = c0550Ii.A04(8);
                            String[] strArr3 = A08;
                            if (strArr3[1].length() == strArr3[5].length()) {
                                String[] strArr4 = A08;
                                strArr4[1] = "EWrEb5ztJ";
                                strArr4[5] = "osfW1bR5YMm4TxT0YESgxQn9EHcmZGy";
                                runLength = iA043 + 12;
                                iA04 = c0550Ii.A04(2);
                            } else {
                                A08[7] = "aK1SAaExMssx18Id1roywrSfe1Et1yGa";
                                runLength = iA043 + 29;
                                iA04 = c0550Ii.A04(2);
                            }
                        }
                    } else {
                        runLength = 2;
                        iA04 = 0;
                    }
                }
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(i3, i2, i3 + runLength, i2 + 1, paint);
            }
            i3 += runLength;
        } while (column == 0);
        return i3;
    }

    public static int A02(C0550Ii c0550Ii, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int runLength = i;
        int column = 0;
        do {
            int clutIndex = 0;
            int iA04 = c0550Ii.A04(4);
            if (iA04 != 0) {
                clutIndex = 1;
            } else if (!c0550Ii.A0F()) {
                int iA042 = c0550Ii.A04(3);
                if (iA042 != 0) {
                    clutIndex = iA042 + 2;
                    iA04 = 0;
                } else {
                    column = 1;
                    iA04 = 0;
                }
            } else if (!c0550Ii.A0F()) {
                clutIndex = c0550Ii.A04(2) + 4;
                iA04 = c0550Ii.A04(4);
            } else {
                int iA043 = c0550Ii.A04(2);
                if (iA043 == 0) {
                    clutIndex = 1;
                    iA04 = 0;
                } else if (iA043 == 1) {
                    clutIndex = 2;
                    iA04 = 0;
                } else if (iA043 == 2) {
                    clutIndex = c0550Ii.A04(4) + 9;
                    iA04 = c0550Ii.A04(4);
                } else if (iA043 != 3) {
                    iA04 = 0;
                } else {
                    clutIndex = c0550Ii.A04(8) + 25;
                    iA04 = c0550Ii.A04(4);
                }
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    iA04 = bArr[iA04];
                }
                paint.setColor(iArr[iA04]);
                canvas.drawRect(runLength, i2, runLength + clutIndex, i2 + 1, paint);
            }
            runLength += clutIndex;
        } while (column == 0);
        return runLength;
    }

    public static int A03(C0550Ii c0550Ii, int[] iArr, @Nullable byte[] bArr, int i, int peek, Paint paint, Canvas canvas) {
        int iA04;
        int runLength = i;
        int column = 0;
        do {
            int iA042 = c0550Ii.A04(8);
            if (iA042 != 0) {
                iA04 = 1;
            } else if (!c0550Ii.A0F()) {
                iA04 = c0550Ii.A04(7);
                if (iA04 != 0) {
                    iA042 = 0;
                } else {
                    column = 1;
                    iA04 = 0;
                    iA042 = 0;
                }
            } else {
                iA04 = c0550Ii.A04(7);
                iA042 = c0550Ii.A04(8);
                String[] strArr = A08;
                if (strArr[4].charAt(19) != strArr[0].charAt(19)) {
                    throw new RuntimeException();
                }
                A08[7] = "oE62i0kU0YacGkvCLxgFzKdMfiudOn3o";
            }
            if (iA04 != 0 && paint != null) {
                if (bArr != null) {
                    iA042 = bArr[iA042];
                }
                paint.setColor(iArr[iA042]);
                canvas.drawRect(runLength, peek, runLength + iA04, peek + 1, paint);
            }
            runLength += iA04;
            String[] strArr2 = A08;
            if (strArr2[1].length() == strArr2[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[6] = "jmdilAXdKLha38CDbN17xGIpmuplWnFc";
            strArr3[3] = "1PNl1axnrexK2c7Nxi5CJrHaXY90XFpd";
        } while (column == 0);
        return runLength;
    }

    public static C0501Gj A04(C0550Ii c0550Ii, int i) {
        int[] iArr;
        int iA04;
        int clutId;
        int iA042;
        int cb;
        int b = 8;
        int iA043 = c0550Ii.A04(8);
        c0550Ii.A08(8);
        int i2 = i - 2;
        int[] clutEntries8Bit = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        while (i2 > 0) {
            int r = c0550Ii.A04(b);
            int t = c0550Ii.A04(b);
            int y = i2 - 2;
            if ((t & 128) != 0) {
                iArr = clutEntries8Bit;
            } else {
                int cr = t & 64;
                if (cr != 0) {
                    iArr = iArrA0G;
                } else {
                    iArr = iArrA0H;
                }
            }
            if ((t & 1) != 0) {
                iA04 = c0550Ii.A04(b);
                clutId = c0550Ii.A04(b);
                iA042 = c0550Ii.A04(b);
                cb = c0550Ii.A04(b);
                i2 = y - 4;
            } else {
                iA04 = c0550Ii.A04(6) << 2;
                int remainingLength = c0550Ii.A04(4);
                clutId = remainingLength << 4;
                int cr2 = c0550Ii.A04(4);
                iA042 = cr2 << 4;
                int cr3 = c0550Ii.A04(2);
                cb = cr3 << 6;
                i2 = y - 2;
            }
            if (iA04 == 0) {
                clutId = 0;
                iA042 = 0;
                cb = 255;
            }
            byte b2 = (byte) (255 - (cb & 255));
            int a2 = clutId - 128;
            int i3 = (int) (((double) iA04) + (((double) a2) * 1.402d));
            int cb2 = iA042 - 128;
            double d = ((double) iA04) - (((double) cb2) * 0.34414d);
            int cb3 = clutId - 128;
            int i4 = (int) (d - (((double) cb3) * 0.71414d));
            int cb4 = iA042 - 128;
            int a3 = C0567Iz.A06(i3, 0, 255);
            int b3 = C0567Iz.A06(i4, 0, 255);
            iArr[r] = A00(b2, a3, b3, C0567Iz.A06((int) (((double) iA04) + (((double) cb4) * 1.772d)), 0, 255));
            b = 8;
        }
        return new C0501Gj(iA043, clutEntries8Bit, iArrA0G, iArrA0H);
    }

    public static C0502Gk A05(C0550Ii c0550Ii) {
        int verticalPositionMinimum;
        int width;
        int verticalPositionMaximum;
        int height;
        c0550Ii.A08(4);
        boolean zA0F = c0550Ii.A0F();
        c0550Ii.A08(3);
        int iA04 = c0550Ii.A04(16);
        int iA042 = c0550Ii.A04(16);
        if (zA0F) {
            verticalPositionMinimum = c0550Ii.A04(16);
            verticalPositionMaximum = c0550Ii.A04(16);
            width = c0550Ii.A04(16);
            height = c0550Ii.A04(16);
        } else {
            verticalPositionMinimum = 0;
            width = 0;
            verticalPositionMaximum = iA04;
            height = iA042;
        }
        return new C0502Gk(iA04, iA042, verticalPositionMinimum, verticalPositionMaximum, width, height);
    }

    public static C0503Gl A06(C0550Ii c0550Ii) {
        int objectCodingMethod = c0550Ii.A04(16);
        c0550Ii.A08(4);
        int iA04 = c0550Ii.A04(2);
        boolean zA0F = c0550Ii.A0F();
        c0550Ii.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (iA04 == 1) {
            c0550Ii.A08(c0550Ii.A04(8) * 16);
        } else if (iA04 == 0) {
            int iA042 = c0550Ii.A04(16);
            int objectId = c0550Ii.A04(16);
            String[] strArr = A08;
            String str = strArr[4];
            String str2 = strArr[0];
            int iCharAt = str.charAt(19);
            int topFieldDataLength = str2.charAt(19);
            if (iCharAt != topFieldDataLength) {
                throw new RuntimeException();
            }
            A08[2] = "pcqe5F2CDJi5oBWvBkq2zbdYSROcg8Hm";
            if (iA042 > 0) {
                bArr = new byte[iA042];
                c0550Ii.A0E(bArr, 0, iA042);
            }
            if (objectId > 0) {
                bArr2 = new byte[objectId];
                c0550Ii.A0E(bArr2, 0, objectId);
            } else {
                bArr2 = bArr;
            }
        }
        return new C0503Gl(objectCodingMethod, zA0F, bArr, bArr2);
    }

    public static C0504Gm A07(C0550Ii c0550Ii, int timeoutSecs) {
        int remainingLength = c0550Ii.A04(8);
        int iA04 = c0550Ii.A04(4);
        int iA042 = c0550Ii.A04(2);
        c0550Ii.A08(2);
        int regionHorizontalAddress = timeoutSecs - 2;
        SparseArray sparseArray = new SparseArray();
        while (regionHorizontalAddress > 0) {
            int iA043 = c0550Ii.A04(8);
            c0550Ii.A08(8);
            regionHorizontalAddress -= 6;
            sparseArray.put(iA043, new C0505Gn(c0550Ii.A04(16), c0550Ii.A04(16)));
        }
        return new C0504Gm(remainingLength, iA04, iA042, sparseArray);
    }

    public static C0506Go A08(C0550Ii c0550Ii, int i) {
        int i2 = 8;
        int iA04 = c0550Ii.A04(8);
        c0550Ii.A08(4);
        boolean zA0F = c0550Ii.A0F();
        c0550Ii.A08(3);
        int iA042 = c0550Ii.A04(16);
        int iA043 = c0550Ii.A04(16);
        int iA044 = c0550Ii.A04(3);
        int iA045 = c0550Ii.A04(3);
        c0550Ii.A08(2);
        int id = c0550Ii.A04(8);
        int iA046 = c0550Ii.A04(8);
        int width = c0550Ii.A04(4);
        int height = c0550Ii.A04(2);
        c0550Ii.A08(2);
        int pixelCode8Bit = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (pixelCode8Bit > 0) {
            int pixelCode4Bit = c0550Ii.A04(16);
            int pixelCode2Bit = c0550Ii.A04(2);
            int remainingLength = c0550Ii.A04(2);
            int objectHorizontalPosition = c0550Ii.A04(12);
            c0550Ii.A08(4);
            int objectVerticalPosition = c0550Ii.A04(12);
            pixelCode8Bit -= 6;
            int remainingLength2 = 0;
            int objectType = 0;
            if (pixelCode2Bit == 1 || pixelCode2Bit == 2) {
                remainingLength2 = c0550Ii.A04(i2);
                objectType = c0550Ii.A04(i2);
                pixelCode8Bit -= 2;
                int objectProvider = A08[2].charAt(23);
                if (objectProvider == 111) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[4] = "2juIiSC4ZxHJWLrTtxN2ANki5argYjtZ";
                strArr[0] = "MWq7TNsVs7aXK0A5Gh22llfb9AkLnJo6";
            }
            sparseArray.put(pixelCode4Bit, new C0507Gp(pixelCode2Bit, remainingLength, objectHorizontalPosition, objectVerticalPosition, remainingLength2, objectType));
            i2 = 8;
        }
        return new C0506Go(iA04, zA0F, iA042, iA043, iA044, iA045, id, iA046, width, height, sparseArray);
    }

    public static void A0B(C0503Gl c0503Gl, C0501Gj c0501Gj, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0501Gj.A03;
        } else if (i == 2) {
            iArr = c0501Gj.A02;
        } else {
            iArr = c0501Gj.A01;
        }
        A0D(c0503Gl.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c0503Gl.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0C(C0550Ii c0550Ii, C0508Gq c0508Gq) {
        int dataFieldLimit = c0550Ii.A04(8);
        int iA04 = c0550Ii.A04(16);
        int iA042 = c0550Ii.A04(16);
        int iA02 = c0550Ii.A02() + iA042;
        int i = iA042 * 8;
        int pageId = c0550Ii.A01();
        if (i > pageId) {
            Log.w(A09(31, 9, 98), A09(0, 31, 5));
            int pageId2 = c0550Ii.A01();
            c0550Ii.A08(pageId2);
            return;
        }
        switch (dataFieldLimit) {
            case 16:
                if (iA04 == c0508Gq.A03) {
                    C0504Gm c0504Gm = c0508Gq.A01;
                    C0504Gm c0504GmA07 = A07(c0550Ii, iA042);
                    if (c0504GmA07.A00 != 0) {
                        c0508Gq.A01 = c0504GmA07;
                        c0508Gq.A08.clear();
                        c0508Gq.A06.clear();
                        c0508Gq.A07.clear();
                    } else if (c0504Gm != null && c0504Gm.A02 != c0504GmA07.A02) {
                        c0508Gq.A01 = c0504GmA07;
                    }
                }
                break;
            case 17:
                C0504Gm c0504Gm2 = c0508Gq.A01;
                if (iA04 == c0508Gq.A03 && c0504Gm2 != null) {
                    C0506Go c0506GoA08 = A08(c0550Ii, iA042);
                    if (c0504Gm2.A00 == 0) {
                        c0506GoA08.A00(c0508Gq.A08.get(c0506GoA08.A03));
                    }
                    c0508Gq.A08.put(c0506GoA08.A03, c0506GoA08);
                }
                break;
            case 18:
                int i2 = c0508Gq.A03;
                String[] strArr = A08;
                if (strArr[6].charAt(3) == strArr[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[6] = "mRSclinCADIq46C9KldTbFaax6B9q8b4";
                strArr2[3] = "vFkDlZLj3MIArV1XHnB7DSJLlPCTmot7";
                if (iA04 == i2) {
                    C0501Gj c0501GjA04 = A04(c0550Ii, iA042);
                    c0508Gq.A06.put(c0501GjA04.A00, c0501GjA04);
                } else if (iA04 == c0508Gq.A02) {
                    C0501Gj c0501GjA042 = A04(c0550Ii, iA042);
                    c0508Gq.A04.put(c0501GjA042.A00, c0501GjA042);
                }
                break;
                break;
            case 19:
                int i3 = c0508Gq.A03;
                String[] strArr3 = A08;
                if (strArr3[6].charAt(3) == strArr3[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A08;
                strArr4[4] = "pcWRhVspQCHgNcWnX1u2k42jPLp60tyv";
                strArr4[0] = "kZn4JsYkhf5tuSMKkFW2HGy26pqZZVve";
                if (iA04 == i3) {
                    C0503Gl c0503GlA06 = A06(c0550Ii);
                    c0508Gq.A07.put(c0503GlA06.A00, c0503GlA06);
                } else if (iA04 == c0508Gq.A02) {
                    C0503Gl c0503GlA062 = A06(c0550Ii);
                    c0508Gq.A05.put(c0503GlA062.A00, c0503GlA062);
                }
                break;
                break;
            case 20:
                if (iA04 == c0508Gq.A03) {
                    c0508Gq.A00 = A05(c0550Ii);
                }
                break;
        }
        int pageId3 = c0550Ii.A02();
        c0550Ii.A09(iA02 - pageId3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(byte[] r16, int[] r17, int r18, int r19, int r20, android.graphics.Paint r21, android.graphics.Canvas r22) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0509Gr.A0D(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] A0E(int i, int i2, C0550Ii c0550Ii) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0550Ii.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0G() {
        /*
            r0 = 16
            int[] r5 = new int[r0]
            r0 = 0
            r5[r0] = r0
            r4 = 1
        L8:
            int r0 = r5.length
            if (r4 >= r0) goto L51
            r0 = 8
            r6 = 255(0xff, float:3.57E-43)
            if (r4 >= r0) goto L32
            r0 = r4 & 1
            if (r0 == 0) goto L30
            r2 = 255(0xff, float:3.57E-43)
        L17:
            r0 = r4 & 2
            if (r0 == 0) goto L2e
            r1 = 255(0xff, float:3.57E-43)
        L1d:
            r0 = r4 & 4
            if (r0 == 0) goto L2c
            r0 = 255(0xff, float:3.57E-43)
        L23:
            int r0 = A00(r6, r2, r1, r0)
            r5[r4] = r0
        L29:
            int r4 = r4 + 1
            goto L8
        L2c:
            r0 = 0
            goto L23
        L2e:
            r1 = 0
            goto L1d
        L30:
            r2 = 0
            goto L17
        L32:
            r0 = r4 & 1
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 == 0) goto L4f
            r2 = 127(0x7f, float:1.78E-43)
        L3a:
            r0 = r4 & 2
            if (r0 == 0) goto L4d
            r1 = 127(0x7f, float:1.78E-43)
        L40:
            r0 = r4 & 4
            if (r0 == 0) goto L4b
        L44:
            int r0 = A00(r6, r2, r1, r3)
            r5[r4] = r0
            goto L29
        L4b:
            r3 = 0
            goto L44
        L4d:
            r1 = 0
            goto L40
        L4f:
            r2 = 0
            goto L3a
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0509Gr.A0G():int[]");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0509Gr.A0H():int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b3, code lost:
    
        if (r1.A0A == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r1.A01 != 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        r9 = r14.A03[r1.A07];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c0, code lost:
    
        r20.A03.setColor(r9);
        r20.A01.drawRect(r4, r3, r1.A08 + r4, r1.A02 + r3, r20.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0213, code lost:
    
        if (r1.A01 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0215, code lost:
    
        r9 = r14.A02[r1.A06];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021c, code lost:
    
        r11 = r14.A01;
        r10 = com.facebook.ads.redexgen.X.C0509Gr.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0230, code lost:
    
        if (r10[4].charAt(19) == r10[0].charAt(19)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0232, code lost:
    
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0237, code lost:
    
        r10 = com.facebook.ads.redexgen.X.C0509Gr.A08;
        r10[1] = "SK7qwpqeD";
        r10[5] = "H8yQ2FZGH97VM0iLZGupvWVfM60nEcr";
        r9 = r11[r1.A05];
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123 A[PHI: r3
      0x0123: PHI (r3v25 int) = (r3v15 int), (r3v29 int) binds: [B:71:0x028c, B:32:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299 A[EDGE_INSN: B:83:0x0299->B:77:0x0299 BREAK  A[LOOP:1: B:25:0x0095->B:59:0x01d6, LOOP_LABEL: LOOP:1: B:25:0x0095->B:59:0x01d6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.ads.redexgen.X.GX> A0I(byte[] r21, int r22) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0509Gr.A0I(byte[], int):java.util.List");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
