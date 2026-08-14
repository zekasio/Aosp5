package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0864Uq implements InterfaceC0522He {
    public static byte[] A0L;
    public static String[] A0M = {"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0522He A07;
    public I8 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0522He A0D;
    public final InterfaceC0522He A0E;
    public final InterfaceC0522He A0F;
    public final I4 A0G;

    @Nullable
    public final I6 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "0DeGlGnSrcDo9YH";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{Ascii.FS, Ascii.GS, 48, Ascii.DC2, Ascii.DLE, Ascii.ESC, Ascii.SYN, Ascii.ETB, 49, 10, 7, Ascii.SYN, 0, 33, Ascii.SYN, Ascii.DC2, Ascii.ETB};
    }

    static {
        A06();
    }

    public C0864Uq(I4 i4, InterfaceC0522He interfaceC0522He, InterfaceC0522He interfaceC0522He2, @Nullable InterfaceC0520Hc interfaceC0520Hc, int i, @Nullable I6 i6) {
        this.A0G = i4;
        this.A0D = interfaceC0522He2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0522He;
        if (interfaceC0520Hc != null) {
            this.A0E = new C0867Ut(interfaceC0522He, interfaceC0520Hc);
        } else {
            this.A0E = null;
        }
        this.A0H = i6;
    }

    private int A00(C0526Hi c0526Hi) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c0526Hi.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(I4 i4, String str, Uri uri) {
        IE contentMetadata = i4.A69(str);
        Uri uriA01 = IF.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A03() throws IOException {
        InterfaceC0522He interfaceC0522He = this.A07;
        if (interfaceC0522He == null) {
            return;
        }
        try {
            interfaceC0522He.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            I8 i8 = this.A08;
            if (i8 != null) {
                this.A0G.ADq(i8);
                this.A08 = null;
            }
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5v();
            throw new NullPointerException(A02(0, 17, 87));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEW(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof I2)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb A[PHI: r4
      0x01bb: PHI (r4v9 long) = (r4v8 long), (r4v10 long) binds: [B:76:0x01d0, B:73:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0864Uq.A08(boolean):void");
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0523Hf) && ((C0523Hf) cause).A00 == 0) {
                return true;
            }
        }
        if (A0M[5].charAt(13) != 'v') {
            throw new RuntimeException();
        }
        A0M[1] = "Fi50x9pU4R4a4ch";
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final long ACw(C0526Hi c0526Hi) throws IOException {
        try {
            this.A09 = IA.A02(c0526Hi);
            this.A06 = c0526Hi.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0526Hi.A00;
            this.A03 = c0526Hi.A03;
            this.A0B = A00(c0526Hi) != -1;
            boolean z = this.A0B;
            if (c0526Hi.A02 != -1 || this.A0B) {
                this.A01 = c0526Hi.A02;
            } else {
                this.A01 = this.A0G.A68(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c0526Hi.A03;
                    if (this.A01 <= 0) {
                        throw new C0523Hf(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            long j = this.A03;
            long j2 = this.A02;
            String[] strArr = A0M;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (j >= j2) {
                A08(true);
            }
            int i3 = this.A07.read(bArr, i, i2);
            if (i3 != -1) {
                if (A0A()) {
                    this.A04 += (long) i3;
                }
                this.A03 += (long) i3;
                if (this.A01 != -1) {
                    this.A01 -= (long) i3;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return i3;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
