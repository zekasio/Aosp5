package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0547If {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"Oi30oJFxUMFG0gOFP1qEoKnGUzBDTsvx", "3WD4gW2GQkEI5AwBfxSAXddooip3O", "Ouz028YKvSlJVOERB46zGmLFjnusBt99", "zuSd86snyfkH6Kt688AXpDWJmpjjYjYh", "jm5obH6VrXyDYReHZwz8l0mhz55kc4yf", "71eZjkBm8iWWJxdGvDt2NXp", "W8ZvrObejWqz7a9mktO8s2uWHHxOtI0w", "Nv5C13AVolnSAeqab8n4y7TwRlreXIzh"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-4, Ascii.SI, Ascii.SUB, 3, Ascii.FS, Ascii.ETB, 34, 3, 34, Ascii.ETB, Ascii.SUB, -41, -16, -25, -6, -14, -25, -27, -10, -25, -26, -94, -29, -11, -14, -25, -27, -10, -31, -12, -29, -10, -21, -15, -31, -21, -26, -27, -94, -8, -29, -18, -9, -25, -68, -94, -9, -22, -27, -26, -16, -80, -30, -9, -28, 7, -6, -11, -10, 0, -64, -7, -10, 7, -12};
    }

    static {
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.US;
    }

    public static int A02(byte[] bArr, int position) {
        int position2;
        synchronized (A05) {
            int iA03 = 0;
            int scratchEscapeCount = 0;
            while (iA03 < position) {
                iA03 = A03(bArr, iA03, position);
                if (iA03 < position) {
                    if (A01.length <= scratchEscapeCount) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[scratchEscapeCount] = iA03;
                    iA03 += 3;
                    scratchEscapeCount++;
                }
            }
            position2 = position - scratchEscapeCount;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < scratchEscapeCount; i3++) {
                int unescapedPosition = A01[i3] - i;
                System.arraycopy(bArr, i, bArr, i2, unescapedPosition);
                int i4 = i2 + unescapedPosition;
                int copyLength = i4 + 1;
                bArr[i4] = 0;
                i2 = copyLength + 1;
                bArr[copyLength] = 0;
                i += unescapedPosition + 3;
            }
            int remainingLength = position2 - i2;
            System.arraycopy(bArr, i, bArr, i2, remainingLength);
        }
        return position2;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0547If.A04(byte[], int, int, boolean[]):int");
    }

    public static C0545Id A05(byte[] bArr, int i, int i2) {
        C0552Ik c0552Ik = new C0552Ik(bArr, i, i2);
        c0552Ik.A07(8);
        int picParameterSetId = c0552Ik.A04();
        int iA04 = c0552Ik.A04();
        c0552Ik.A06();
        boolean bottomFieldPicOrderInFramePresentFlag = c0552Ik.A0A();
        return new C0545Id(picParameterSetId, iA04, bottomFieldPicOrderInFramePresentFlag);
    }

    public static C0546Ie A06(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        C0552Ik c0552Ik = new C0552Ik(bArr, i, i2);
        c0552Ik.A07(8);
        int iA05 = c0552Ik.A05(8);
        c0552Ik.A07(16);
        int iA04 = c0552Ik.A04();
        int iA042 = 1;
        boolean zA0A = false;
        if (iA05 == 100 || iA05 == 110 || iA05 == 122 || iA05 == 244 || iA05 == 44 || iA05 == 83 || iA05 == 86 || iA05 == 118 || iA05 == 128 || iA05 == 138) {
            iA042 = c0552Ik.A04();
            if (iA042 == 3) {
                zA0A = c0552Ik.A0A();
            }
            c0552Ik.A04();
            c0552Ik.A04();
            c0552Ik.A06();
            if (c0552Ik.A0A()) {
                int i5 = iA042 != 3 ? 8 : 12;
                int i6 = 0;
                while (i6 < i5) {
                    if (c0552Ik.A0A()) {
                        A09(c0552Ik, i6 < 6 ? 16 : 64);
                    }
                    i6++;
                }
            }
        }
        int iA043 = c0552Ik.A04() + 4;
        int iA044 = c0552Ik.A04();
        int iA045 = 0;
        boolean zA0A2 = false;
        if (iA044 == 0) {
            iA045 = c0552Ik.A04() + 4;
        } else if (iA044 == 1) {
            zA0A2 = c0552Ik.A0A();
            c0552Ik.A03();
            c0552Ik.A03();
            long jA04 = c0552Ik.A04();
            for (int i7 = 0; i7 < jA04; i7++) {
                c0552Ik.A04();
            }
        } else {
            if (A02[1].length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "gg30aCps8xaKqlQpqNwqV8MpUTOLFqGh";
            strArr[2] = "6dq0Mx0u8Kgv53YJdcFQMlotDlRuazjf";
        }
        c0552Ik.A04();
        c0552Ik.A06();
        int iA046 = c0552Ik.A04() + 1;
        int iA047 = c0552Ik.A04() + 1;
        boolean zA0A3 = c0552Ik.A0A();
        int i8 = (2 - (zA0A3 ? 1 : 0)) * iA047;
        if (!zA0A3) {
            c0552Ik.A06();
        }
        c0552Ik.A06();
        int i9 = iA046 * 16;
        int i10 = i8 * 16;
        if (c0552Ik.A0A()) {
            int iA048 = c0552Ik.A04();
            int iA049 = c0552Ik.A04();
            int iA0410 = c0552Ik.A04();
            int iA0411 = c0552Ik.A04();
            if (iA042 == 0) {
                i3 = 1;
                i4 = 2 - (zA0A3 ? 1 : 0);
            } else {
                i3 = iA042 == 3 ? 1 : 2;
                i4 = (2 - (zA0A3 ? 1 : 0)) * (iA042 == 1 ? 2 : 1);
            }
            i9 -= (iA048 + iA049) * i3;
            i10 -= (iA0410 + iA0411) * i4;
        }
        float f = 1.0f;
        boolean zA0A4 = c0552Ik.A0A();
        String[] strArr2 = A02;
        if (strArr2[0].charAt(3) == strArr2[2].charAt(3)) {
            String[] strArr3 = A02;
            strArr3[6] = "jcRzMhbBY3Dw1JTLjGKCGc6YaVOjENSo";
            strArr3[3] = "o4pmI9swvtrYdLR0BRHjmVJPNciV1YNp";
            if (zA0A4) {
                boolean zA0A5 = c0552Ik.A0A();
                String[] strArr4 = A02;
                if (strArr4[0].charAt(3) == strArr4[2].charAt(3)) {
                    String[] strArr5 = A02;
                    strArr5[0] = "nxo01JuHYgIdSih3CNMvKr0vsuD4ByKM";
                    strArr5[2] = "Ktm0TZ4NHFdoOw88agihQWJn0ILc0Ki9";
                    if (zA0A5) {
                        int iA052 = c0552Ik.A05(8);
                        if (iA052 == 255) {
                            int iA053 = c0552Ik.A05(16);
                            int iA054 = c0552Ik.A05(16);
                            if (iA053 != 0 && iA054 != 0) {
                                f = iA053 / iA054;
                            }
                        } else {
                            float[] fArr = A04;
                            if (iA052 < fArr.length) {
                                f = fArr[iA052];
                            } else {
                                Log.w(A07(0, 11, 97), A07(11, 35, 53) + iA052);
                            }
                        }
                    }
                }
            }
            return new C0546Ie(iA04, i9, i10, f, zA0A, zA0A3, iA043, iA044, iA045, zA0A2);
        }
        throw new RuntimeException();
    }

    public static void A09(C0552Ik c0552Ik, int nextScale) {
        int i = 8;
        int deltaScale = 8;
        for (int i2 = 0; i2 < nextScale; i2++) {
            if (deltaScale != 0) {
                int deltaScale2 = c0552Ik.A03();
                deltaScale = ((deltaScale2 + i) + 256) % 256;
            }
            if (deltaScale != 0) {
                i = deltaScale;
            }
        }
    }

    public static void A0A(ByteBuffer byteBuffer) {
        int consecutiveZeros = byteBuffer.position();
        int offset = 0;
        for (int value = 0; value + 1 < consecutiveZeros; value++) {
            int i = byteBuffer.get(value) & UByte.MAX_VALUE;
            if (offset == 3) {
                if (i == 1 && (byteBuffer.get(value + 1) & Ascii.US) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(value - 3);
                    byteBufferDuplicate.limit(consecutiveZeros);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i == 0) {
                offset++;
            }
            if (i != 0) {
                offset = 0;
            }
        }
        byteBuffer.clear();
        if (A02[1].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "LhexrLoV7v0KAfJEyFTOZZKZaNSS1gs0";
        strArr[4] = "gpIVcqUVkpQz0S61taD9WNDesiV6owqm";
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0C(String str, byte b) {
        if (A07(46, 9, 52).equals(str) && (b & Ascii.US) == 6) {
            return true;
        }
        return A07(55, 10, 68).equals(str) && ((b & 126) >> 1) == 39;
    }
}
