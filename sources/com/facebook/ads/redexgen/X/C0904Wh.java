package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0904Wh implements Cu {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0419Cw A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0418Ct> A05 = new ArrayDeque<>();
    public final D1 A04 = new D1();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, ByteCompanionObject.MIN_VALUE, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(InterfaceC0408Cd interfaceC0408Cd, int i) throws InterruptedException, IOException {
        long jA02 = A02(interfaceC0408Cd, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    private long A01(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        interfaceC0408Cd.AEB();
        while (true) {
            interfaceC0408Cd.AD7(this.A06, 0, 4);
            int iA00 = D1.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) D1.A01(this.A06, iA00, false);
                if (this.A03.A8X(iA01)) {
                    interfaceC0408Cd.AEt(iA00);
                    return iA01;
                }
            }
            interfaceC0408Cd.AEt(1);
        }
    }

    private long A02(InterfaceC0408Cd interfaceC0408Cd, int i) throws InterruptedException, IOException {
        interfaceC0408Cd.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.A06[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    private String A04(InterfaceC0408Cd interfaceC0408Cd, int trimmedLength) throws InterruptedException, IOException {
        if (trimmedLength == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[trimmedLength];
        interfaceC0408Cd.readFully(bArr, 0, trimmedLength);
        while (trimmedLength > 0 && bArr[trimmedLength - 1] == 0) {
            trimmedLength--;
        }
        return new String(bArr, 0, trimmedLength);
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final void A8J(InterfaceC0419Cw interfaceC0419Cw) {
        this.A03 = interfaceC0419Cw;
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final boolean ADZ(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        IK.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty() && interfaceC0408Cd.A7F() >= this.A05.peek().A01) {
                this.A03.A5C(this.A05.pop().A00);
                return true;
            }
            if (this.A01 == 0) {
                long jA05 = this.A04.A05(interfaceC0408Cd, true, false, 4);
                if (jA05 == -2) {
                    jA05 = A01(interfaceC0408Cd);
                }
                if (jA05 == -1) {
                    return false;
                }
                this.A00 = (int) jA05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0408Cd, false, true, 8);
                this.A01 = 2;
            }
            int iA6T = this.A03.A6T(this.A00);
            if (iA6T != 0) {
                if (iA6T == 1) {
                    long jA7F = interfaceC0408Cd.A7F();
                    this.A05.push(new C0418Ct(this.A00, jA7F + this.A02));
                    this.A03.AEy(this.A00, jA7F, this.A02);
                    this.A01 = 0;
                    return true;
                }
                if (iA6T == 2) {
                    long j = this.A02;
                    if (j <= 8) {
                        this.A03.A8L(this.A00, A02(interfaceC0408Cd, (int) j));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0360Af(A03(41, 22, 60) + this.A02);
                }
                if (iA6T == 3) {
                    long j2 = this.A02;
                    if (j2 <= 2147483647L) {
                        this.A03.AF6(this.A00, A04(interfaceC0408Cd, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0360Af(A03(63, 21, 81) + this.A02);
                }
                if (iA6T == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, interfaceC0408Cd);
                    this.A01 = 0;
                    return true;
                }
                if (iA6T == 5) {
                    long j3 = this.A02;
                    if (j3 == 4 || j3 == 8) {
                        this.A03.A5R(this.A00, A00(interfaceC0408Cd, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C0360Af(A03(21, 20, 82) + this.A02);
                }
                throw new C0360Af(A03(0, 21, 0) + iA6T);
            }
            interfaceC0408Cd.AEt((int) this.A02);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cu
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
