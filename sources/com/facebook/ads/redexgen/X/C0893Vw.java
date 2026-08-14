package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0893Vw implements InterfaceC0434Dq {
    public static String[] A05 = {"RGyTh4SpGx69CnC3uYB0gmKqWWTNP", "iDg", "j2BD3qxwlCatqD2Ch8dsr4SydA7XKwXL", "m1LAn1cIXYa33UPzElI", "cPJKdoCFMTZnGOgvNAg6pI", "iUx5cAJ8Ufw2U1Fp6uB6P", "qd", "YeOgnvzSUR8"};
    public final int A00;
    public final /* synthetic */ C0892Vv A04;
    public final C0550Ii A03 = new C0550Ii(new byte[5]);
    public final SparseArray<InterfaceC0441Dx> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    public C0893Vw(C0892Vv c0892Vv, int i) {
        this.A04 = c0892Vv;
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C0438Du A00(com.facebook.ads.redexgen.X.C0551Ij r13, int r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0893Vw.A00(com.facebook.ads.redexgen.X.Ij, int):com.facebook.ads.redexgen.X.Du");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0434Dq
    public final void A48(C0551Ij c0551Ij) {
        C0563Iv c0563Iv;
        InterfaceC0441Dx interfaceC0441DxA4P;
        if (c0551Ij.A0E() == 2) {
            if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
                c0563Iv = (C0563Iv) this.A04.A0B.get(0);
            } else {
                c0563Iv = new C0563Iv(((C0563Iv) this.A04.A0B.get(0)).A03());
                this.A04.A0B.add(c0563Iv);
            }
            c0551Ij.A0Z(2);
            int iA0I = c0551Ij.A0I();
            int i = 5;
            c0551Ij.A0Z(5);
            c0551Ij.A0a(this.A03, 2);
            int i2 = 4;
            this.A03.A08(4);
            int i3 = 12;
            int programNumber = this.A03.A04(12);
            c0551Ij.A0Z(programNumber);
            int programNumber2 = this.A04.A05;
            int programInfoLength = 21;
            if (programNumber2 == 2 && this.A04.A03 == null) {
                C0438Du c0438Du = new C0438Du(21, null, null, new byte[0]);
                C0892Vv c0892Vv = this.A04;
                c0892Vv.A03 = c0892Vv.A09.A4P(21, c0438Du);
                this.A04.A03.A8K(c0563Iv, this.A04.A02, new C0440Dw(iA0I, 21, 8192));
            }
            this.A01.clear();
            this.A02.clear();
            int iA04 = c0551Ij.A04();
            while (iA04 > 0) {
                c0551Ij.A0a(this.A03, i);
                int iA042 = this.A03.A04(8);
                this.A03.A08(3);
                int iA043 = this.A03.A04(13);
                this.A03.A08(i2);
                int iA044 = this.A03.A04(i3);
                C0438Du c0438DuA00 = A00(c0551Ij, iA044);
                if (iA042 == 6) {
                    iA042 = c0438DuA00.A00;
                }
                int esInfoLength = iA044 + 5;
                iA04 -= esInfoLength;
                int esInfoLength2 = this.A04.A05;
                int i4 = esInfoLength2 == 2 ? iA042 : iA043;
                if (!this.A04.A07.get(i4)) {
                    int trackId = this.A04.A05;
                    if (trackId == 2 && iA042 == programInfoLength) {
                        interfaceC0441DxA4P = this.A04.A03;
                    } else {
                        C0892Vv c0892Vv2 = this.A04;
                        String[] strArr = A05;
                        String str = strArr[0];
                        String str2 = strArr[1];
                        int programInfoLength2 = str.length();
                        if (programInfoLength2 == str2.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A05;
                        strArr2[5] = "uMTX0BK3hwRt9LI9TXEhN";
                        strArr2[7] = "Q6yhhKO6s7v";
                        interfaceC0441DxA4P = c0892Vv2.A09.A4P(iA042, c0438DuA00);
                    }
                    if (this.A04.A05 != 2 || iA043 < this.A02.get(i4, 8192)) {
                        SparseIntArray sparseIntArray = this.A02;
                        int programInfoLength3 = A05[4].length();
                        if (programInfoLength3 == 17) {
                            throw new RuntimeException();
                        }
                        A05[3] = "hYuW2ZxScZvjOUyRYzD";
                        sparseIntArray.put(i4, iA043);
                        this.A01.put(i4, interfaceC0441DxA4P);
                    }
                }
                i = 5;
                i2 = 4;
                i3 = 12;
                programInfoLength = 21;
            }
            int size = this.A02.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.A02.keyAt(i5);
                this.A04.A07.put(iKeyAt, true);
                InterfaceC0441Dx interfaceC0441DxValueAt = this.A01.valueAt(i5);
                if (interfaceC0441DxValueAt != null) {
                    if (interfaceC0441DxValueAt != this.A04.A03) {
                        interfaceC0441DxValueAt.A8K(c0563Iv, this.A04.A02, new C0440Dw(iA0I, iKeyAt, 8192));
                    }
                    SparseArray sparseArray = this.A04.A06;
                    int trackIdCount = this.A02.valueAt(i5);
                    sparseArray.put(trackIdCount, interfaceC0441DxValueAt);
                }
            }
            if (this.A04.A05 == 2) {
                if (!this.A04.A04) {
                    this.A04.A02.A5D();
                    this.A04.A01 = 0;
                    this.A04.A04 = true;
                    return;
                }
                return;
            }
            int i6 = 0;
            SparseArray sparseArray2 = this.A04.A06;
            int programInfoLength4 = this.A00;
            sparseArray2.remove(programInfoLength4);
            C0892Vv c0892Vv3 = this.A04;
            if (c0892Vv3.A05 != 1) {
                i6 = this.A04.A01 - 1;
            }
            c0892Vv3.A01 = i6;
            if (this.A04.A01 == 0) {
                this.A04.A02.A5D();
                this.A04.A04 = true;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0434Dq
    public final void A8K(C0563Iv c0563Iv, InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
    }
}
