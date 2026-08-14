package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WQ implements DV {
    public static byte[] A0C;
    public static String[] A0D = {"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final DU A0A = new DU();
    public final DY A0B;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, Ascii.SI, Ascii.SI, 72, Ascii.CAN, 9, Ascii.SI, Ascii.CR, 72, Ascii.VT, 9, 6, 72, 10, Ascii.CR, 72, Ascii.SO, 7, Ascii.GS, 6, Ascii.FF, 70};
    }

    static {
        A0A();
    }

    public WQ(long j, long j2, DY dy, int i, long j3) {
        IK.A03(j >= 0 && j2 > j);
        this.A0B = dy;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        long j7 = this.A08;
        if (j6 >= j7) {
            return j7 - 1;
        }
        return j6;
    }

    private final long A01(long j, InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long jA7F = interfaceC0408Cd.A7F();
        if (A0D(interfaceC0408Cd, this.A01)) {
            this.A0A.A03(interfaceC0408Cd, false);
            interfaceC0408Cd.AEB();
            long j2 = j - this.A0A.A05;
            int i = this.A0A.A01 + this.A0A.A00;
            if (j2 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j2 <= 72000) {
                    interfaceC0408Cd.AEt(i);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j2 < 0) {
                this.A01 = jA7F;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = interfaceC0408Cd.A7F();
                this.A04 = initialPosition + ((long) i);
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + ((long) i) < 100000) {
                    interfaceC0408Cd.AEt(i);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j3 = this.A04;
            if (initialPosition4 - j3 < 100000) {
                this.A01 = j3;
                return j3;
            }
            long jA7F2 = interfaceC0408Cd.A7F() - (((long) i) * (j2 > 0 ? 1L : 2L));
            long j4 = this.A01;
            long j5 = this.A04;
            long j6 = (j4 - j5) * j2;
            String[] strArr3 = A0D;
            String str = strArr3[5];
            String str2 = strArr3[0];
            int pageSize = str.charAt(24);
            if (pageSize != str2.charAt(24)) {
                long initialPosition5 = this.A02;
                return Math.min(Math.max(jA7F2 + (j6 / (initialPosition5 - this.A05)), j5), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            return Math.min(Math.max(jA7F2 + (j6 / (this.A02 - this.A05)), j5), this.A01 - 1);
        }
        long j7 = this.A04;
        if (j7 != jA7F) {
            return j7;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        A0C(interfaceC0408Cd);
        this.A0A.A02();
        while ((this.A0A.A04 & 4) != 4 && interfaceC0408Cd.A7F() < this.A08) {
            this.A0A.A03(interfaceC0408Cd, false);
            interfaceC0408Cd.AEt(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(InterfaceC0408Cd interfaceC0408Cd, long j, long j2) throws InterruptedException, IOException {
        this.A0A.A03(interfaceC0408Cd, false);
        while (this.A0A.A05 < j) {
            interfaceC0408Cd.AEt(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A03(interfaceC0408Cd, false);
        }
        interfaceC0408Cd.AEB();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.DV
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final WR A4S() {
        DS ds = null;
        if (this.A07 != 0) {
            return new WR(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        if (A0D(interfaceC0408Cd, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(InterfaceC0408Cd interfaceC0408Cd, long j) throws InterruptedException, IOException {
        long jMin = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            if (interfaceC0408Cd.A7F() + ((long) length) > jMin && (length = (int) (jMin - interfaceC0408Cd.A7F())) < 4) {
                return false;
            }
            interfaceC0408Cd.AD8(bArr, 0, length, false);
            for (int i = 0; i < length - 3; i++) {
                if (bArr[i] == 79 && bArr[i + 1] == 103 && bArr[i + 2] == 103 && bArr[i + 3] == 83) {
                    interfaceC0408Cd.AEt(i);
                    return true;
                }
            }
            interfaceC0408Cd.AEt(length - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long ADY(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        long jA03;
        int i = this.A00;
        if (i == 0) {
            this.A03 = interfaceC0408Cd.A7F();
            this.A00 = 1;
            long j = this.A08 - 65307;
            if (j > this.A03) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j2 = this.A06;
            if (j2 == 0) {
                jA03 = 0;
            } else {
                long jA01 = A01(j2, interfaceC0408Cd);
                if (jA01 >= 0) {
                    return jA01;
                }
                jA03 = A03(interfaceC0408Cd, this.A06, -(jA01 + 2));
            }
            this.A00 = 3;
            return -(2 + jA03);
        }
        this.A07 = A02(interfaceC0408Cd);
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long AF1(long j) {
        int i = this.A00;
        IK.A03(i == 3 || i == 2);
        long jA04 = 0;
        if (j != 0) {
            jA04 = this.A0B.A04(j);
        }
        this.A06 = jA04;
        this.A00 = 2;
        A0B();
        long j2 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A0D[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j2;
    }
}
