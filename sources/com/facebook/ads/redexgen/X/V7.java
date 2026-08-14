package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V7 implements InterfaceC0522He {
    public static byte[] A0A;
    public static String[] A0B = {"FbuaOXxD8R3r2Sez", "nl2ebpznfahqYQ0iJMeMraM5u9ytbnkM", "LukWv8Q1lv25Jz9VZoWHVgr80BMsfj7N", "UITThFDmXIK6qk0JXllT0SDhOskljLuD", "WWGwJIDbyg2bl1Mdb", "YrbKAvAwCNNri3u3ecPrw9BDMC3UJFWv", "h8pfgUZlB4VhxmKVTbPlaDG6t2cnqOd2", "IQvStArhblJullrSqn3"};
    public InterfaceC0522He A00;
    public InterfaceC0522He A01;
    public InterfaceC0522He A02;
    public InterfaceC0522He A03;
    public InterfaceC0522He A04;
    public InterfaceC0522He A05;
    public InterfaceC0522He A06;
    public final Context A07;
    public final InterfaceC0522He A08;
    public final I0<? super InterfaceC0522He> A09;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {119, -87, -74, -84, -70, -73, -79, -84, -89, -87, -69, -69, -83, -68, 119, -40, Ascii.VT, Ascii.VT, -4, 4, 7, Ascii.VT, 0, 5, -2, -73, Ascii.VT, 6, -73, 7, 3, -8, Ascii.DLE, -73, -23, -21, -28, -25, -73, 10, Ascii.VT, 9, -4, -8, 4, -73, Ascii.SO, 0, Ascii.VT, -1, 6, Ascii.FF, Ascii.VT, -73, -5, -4, 7, -4, 5, -5, 0, 5, -2, -73, 6, 5, -73, Ascii.VT, -1, -4, -73, -23, -21, -28, -25, -73, -4, Ascii.SI, Ascii.VT, -4, 5, 10, 0, 6, 5, -13, Ascii.DC4, Ascii.NAK, Ascii.DLE, 36, Ascii.ESC, 35, -13, Ascii.DLE, 35, Ascii.DLE, 2, Ascii.RS, 36, 33, Ascii.DC2, Ascii.DC4, -90, -45, -45, -48, -45, -127, -54, -49, -44, -43, -62, -49, -43, -54, -62, -43, -54, -49, -56, -127, -77, -75, -82, -79, -127, -58, -39, -43, -58, -49, -44, -54, -48, -49, -82, -64, -64, -78, -63, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -22, -35, -24, -86, -31, -12, -21, -20, -24, -35, -11, -31, -18, -82, -86, -31, -12, -16, -86, -18, -16, -23, -20, -86, -50, -16, -23, -20, -64, -35, -16, -35, -49, -21, -15, -18, -33, -31, 17, Ascii.GS, Ascii.FS, 34, 19, Ascii.FS, 34, -13, -16, 3, -16, -30, -47, -25, -30, -43, -29, -33, -27, -30, -45, -43, -27, -25, -32, -29};
        if (A0B[7].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "aTM6G8lKpIJ6RP017QMILejHyUH2B7dh";
        strArr[3] = "ERhfqbVtKjwR0y0XTQNxaBJXl7PFqJQV";
        A0A = bArr;
    }

    static {
        A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public V7(Context context, I0<? super InterfaceC0522He> i0, InterfaceC0522He interfaceC0522He) {
        this.A07 = context.getApplicationContext();
        this.A09 = i0;
        this.A08 = (InterfaceC0522He) IK.A01(interfaceC0522He);
    }

    private InterfaceC0522He A00() {
        if (this.A00 == null) {
            this.A00 = new VC(this.A07, this.A09);
        }
        return this.A00;
    }

    private InterfaceC0522He A01() {
        if (this.A01 == null) {
            this.A01 = new VB(this.A07, this.A09);
        }
        InterfaceC0522He interfaceC0522He = this.A01;
        if (A0B[4].length() != 17) {
            throw new RuntimeException();
        }
        A0B[7] = "5KWAQaHsfffdQGrIbOe";
        return interfaceC0522He;
    }

    private InterfaceC0522He A02() {
        if (this.A02 == null) {
            this.A02 = new VA();
        }
        return this.A02;
    }

    private InterfaceC0522He A03() {
        if (this.A04 == null) {
            this.A04 = new V3(this.A09);
        }
        return this.A04;
    }

    private InterfaceC0522He A04() {
        if (this.A05 == null) {
            this.A05 = new C0868Uu(this.A07, this.A09);
        }
        return this.A05;
    }

    private InterfaceC0522He A05() {
        if (this.A06 == null) {
            try {
                this.A06 = (InterfaceC0522He) Class.forName(A06(141, 60, 75)).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Log.w(A06(85, 17, 126), A06(15, 70, 102));
            } catch (Exception e) {
                throw new RuntimeException(A06(102, 34, 48), e);
            }
            if (this.A06 == null) {
                this.A06 = this.A08;
            }
        }
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        InterfaceC0522He interfaceC0522He = this.A03;
        if (interfaceC0522He == null) {
            return null;
        }
        return interfaceC0522He.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final long ACw(C0526Hi c0526Hi) throws IOException {
        IK.A04(this.A03 == null);
        String scheme = c0526Hi.A04.getScheme();
        if (C0567Iz.A0e(c0526Hi.A04)) {
            if (c0526Hi.A04.getPath().startsWith(A06(0, 15, 23))) {
                this.A03 = A00();
            } else {
                this.A03 = A03();
            }
        } else if (A06(136, 5, 28).equals(scheme)) {
            this.A03 = A00();
        } else if (A06(HttpStatus.SC_CREATED, 7, 125).equals(scheme)) {
            this.A03 = A01();
        } else if (A06(223, 4, 66).equals(scheme)) {
            this.A03 = A05();
        } else if (A06(208, 4, 94).equals(scheme)) {
            this.A03 = A02();
        } else {
            if (A0B[7].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "D4NYqGk09rVUGFQV4qQWMtXs9QaZTkcz";
            strArr[2] = "qnlKhzyemJcEWBYVQAP4EuZEjLdcMELi";
            if (A06(212, 11, 63).equals(scheme)) {
                this.A03 = A04();
            } else {
                this.A03 = this.A08;
            }
        }
        return this.A03.ACw(c0526Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws IOException {
        InterfaceC0522He interfaceC0522He = this.A03;
        if (interfaceC0522He != null) {
            try {
                interfaceC0522He.close();
            } finally {
                this.A03 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.A03.read(bArr, i, i2);
    }
}
