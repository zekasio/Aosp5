package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XL<T> implements InterfaceC03469r<T> {
    public static byte[] A06;
    public C03399j A00;
    public C03399j A01;
    public List<XL<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C03389i A04;
    public final C03539y A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, Ascii.SI, -63, Ascii.DLE, Ascii.SI, Ascii.CR, Ascii.SUB, -63, 5, 6, Ascii.CR, 6, Ascii.NAK, 6, -63, 4, Ascii.SYN, 19, Ascii.DC4, Ascii.DLE, 19, Ascii.DC4, -63, 17, Ascii.DLE, 10, Ascii.SI, Ascii.NAK, 10, Ascii.SI, 8, -63, 2, Ascii.NAK, -63, Ascii.NAK, 9, 6, -63, 5, 2, Ascii.NAK, 2, 3, 2, Ascii.DC4, 6, -63, Ascii.DC4, Ascii.NAK, 2, 19, Ascii.NAK, -38, Ascii.FF, 9, 10, 6, 9, -73, 7, 6, 10, 0, Ascii.VT, 0, 6, 5, -73, 0, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, Ascii.FF, -4, 5, -6, -4, -73, 10, Ascii.VT, -8, 9, Ascii.VT, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, Ascii.VT, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, Ascii.DLE, -73, -7, -4, -4, 5, -73, 3, 6, 10, Ascii.VT, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, Ascii.VT, 4, 3, -65, 19, Ascii.SO, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, Ascii.SO, -65, Ascii.VT, Ascii.SO, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.NAK, -47, 37, 32, -47, Ascii.ETB, Ascii.SYN, 37, Ascii.DC4, Ascii.EM, -47, Ascii.NAK, Ascii.DC2, 37, Ascii.DC2, -47, Ascii.ETB, 35, 32, Ascii.RS, -47, Ascii.GS, 32, Ascii.CAN, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, Ascii.US, 66, 69, 62, Ascii.ESC, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, Ascii.GS, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -20, Ascii.SI, Ascii.DC2, Ascii.VT, -24, 7, Ascii.EM, Ascii.VT, 10, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -22, 7, Ascii.SUB, 7, 8, 7, Ascii.EM, Ascii.VT, -58, Ascii.SI, Ascii.EM, -58, 9, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.VT, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, Ascii.VT, Ascii.GS, Ascii.SUB, Ascii.ESC, Ascii.ETB, Ascii.SUB, 5, 2, Ascii.NAK, 2};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XL(C03439o c03439o, InterfaceC03519w interfaceC03519w) throws IOException {
        this.A05 = new C03539y(c03439o.A04(A00(515, 4, 63)), interfaceC03519w);
        this.A04 = new C03389i(new File(c03439o.A05(), A00(509, 6, 70)));
        this.A00 = this.A04.A03();
        A05(interfaceC03519w);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        this.A00 = new C03399j(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XL<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(XM xm) throws A0 {
        if (!this.A03) {
            if (A06(xm)) {
                if (xm.A5N() == 0) {
                    return;
                }
                if (this.A00.A04(xm.A00().A02) == 0) {
                    try {
                        Iterator<C03509v> it = xm.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), xm.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new A0(A00(361, 30, 93), e);
                    }
                }
                throw new A0(A00(0, 54, 63));
            }
            throw new A0(A00(466, 43, 49));
        }
        throw new A0(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(InterfaceC03519w interfaceC03519w) throws IOException {
        C03399j c03399j = new C03399j(this.A05.A06(), 0);
        if (c03399j.A04(this.A00) > 0) {
            interfaceC03519w.AE4(String.format(Locale.US, A00(54, 102, 53), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c03399j.A02()), Integer.valueOf(c03399j.A03())));
            this.A00 = c03399j;
            return;
        }
        while (c03399j.A02() < this.A00.A02()) {
            if (this.A05.A0D()) {
                c03399j = new C03399j(this.A05.A06(), 0);
            } else {
                interfaceC03519w.AE4(String.format(Locale.US, A00(156, 101, 13), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c03399j.A02())));
                this.A00 = new C03399j(this.A05.A06(), this.A05.A07());
                this.A04.A04(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XL<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(XM xm) {
        if (!this.A02.remove(xm)) {
            return false;
        }
        if (xm.A5N() > 0 && xm.A01().A02.A05(xm.A01().A01).equals(this.A01)) {
            this.A01 = xm.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XM != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03469r
    public final synchronized InterfaceC03459q A5M(byte[] bArr, int[] iArr) throws A0 {
        XL<T>.RecordFileBasedFetch xm;
        if (!this.A03) {
            int iA02 = 0;
            int i = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = true;
                while (true) {
                    C03419m c03419mA0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, iA02, iArr, i);
                    int iA00 = c03419mA0A.A01().A00() - c03419mA0A.A01().A01();
                    iA02 += c03419mA0A.A01().A02();
                    i += iA00;
                    if (c03419mA0A.A01().A03() == EnumC03409k.A02) {
                        arrayList.add(c03419mA0A);
                    }
                    if (c03419mA0A.A01().A03() == EnumC03409k.A03) {
                        break;
                    }
                    if (c03419mA0A.A01().A03() == EnumC03409k.A04) {
                        if (this.A05.A06() + this.A05.A08() != this.A01.A02() + 1) {
                            this.A01 = new C03399j(this.A01.A02() + 1, 0);
                        } else {
                            z = false;
                            break;
                        }
                    } else {
                        this.A01 = this.A01.A05(iA00);
                    }
                }
                xm = new XM(this, arrayList, z);
                this.A02.add(xm);
                if (!arrayList.isEmpty()) {
                    this.A01 = xm.A01().A02.A05(xm.A01().A01);
                }
            } catch (IOException e) {
                throw new A0(A00(306, 29, 79), e);
            }
        } else {
            throw new A0(A00(391, 36, 119));
        }
        return xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03469r
    public final synchronized int A7I() throws A0 {
        int iA09;
        if (!this.A03) {
            try {
                iA09 = this.A05.A09();
                if (this.A00.A02() == this.A05.A06()) {
                    iA09 -= this.A00.A03();
                }
            } catch (IOException e) {
                throw new A0(A00(335, 26, 122), e);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
        return iA09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03469r
    public final synchronized void AF5(byte[] bArr) throws A0 {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new A0(A00(257, 25, 61), e);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03469r
    public final synchronized void clear() throws A0 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new A0(A00(282, 24, 16), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XL != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
