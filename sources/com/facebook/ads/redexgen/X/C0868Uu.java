package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0868Uu implements InterfaceC0522He {
    public static byte[] A07;
    public static String[] A08 = {"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    @Nullable
    public final I0<? super C0868Uu> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, Ascii.ESC, 114, 63, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, 63, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C0868Uu(Context context, @Nullable I0<? super C0868Uu> i0) {
        this.A05 = context.getResources();
        this.A06 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[Catch: IOException -> 0x0105, TRY_ENTER, TryCatch #1 {IOException -> 0x0105, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0071, B:21:0x009e, B:23:0x00a8, B:24:0x00ab, B:20:0x0099, B:34:0x00e0, B:35:0x00e5, B:38:0x00f5, B:39:0x0104, B:36:0x00e6, B:37:0x00f4), top: B:45:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[Catch: IOException -> 0x0105, TryCatch #1 {IOException -> 0x0105, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0071, B:21:0x009e, B:23:0x00a8, B:24:0x00ab, B:20:0x0099, B:34:0x00e0, B:35:0x00e5, B:38:0x00f5, B:39:0x0104, B:36:0x00e6, B:37:0x00f4), top: B:45:0x0000, inners: #0 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACw(com.facebook.ads.redexgen.X.C0526Hi r8) throws com.facebook.ads.redexgen.X.C0541Hz {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0868Uu.ACw(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws C0541Hz {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            I0<? super C0868Uu> i0 = this.A06;
                            if (i0 != null) {
                                i0.ACa(this);
                            }
                        }
                        throw th;
                    } catch (IOException e) {
                        throw new C0541Hz(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        I0<? super C0868Uu> i02 = this.A06;
                        if (i02 != null) {
                            i02.ACa(this);
                        }
                    }
                }
            }
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                } catch (IOException e2) {
                    throw new C0541Hz(e2);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    I0<? super C0868Uu> i03 = this.A06;
                    if (i03 != null) {
                        i03.ACa(this);
                    }
                }
            }
        } catch (IOException e3) {
            throw new C0541Hz(e3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws C0541Hz {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0541Hz(e);
            }
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0541Hz(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super C0868Uu> i0 = this.A06;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
