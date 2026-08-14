package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VC implements InterfaceC0522He {
    public static byte[] A06;
    public static String[] A07 = {"pM08nT1ncmNJ", "g85", "nscQf0o4Li7UcF904CUq0pnhLdimh0nx", "F8VXv1qVoFp68OVo6WPqVPomjNx", "ZQ8cSAnJS", "Qhc2B", "YeRFTalD9", "SLGuxMrf5R7JWBKvcRLC7wUDDVq2YQ4u"};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    @Nullable
    public final I0<? super VC> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{107, 98, 44, 35, 41, 63, 34, 36, 41, Ascii.DC2, 44, 62, 62, 40, 57, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public VC(Context context, @Nullable I0<? super VC> i0) {
        this.A04 = context.getAssets();
        this.A05 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final Uri A7k() {
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: IOException -> 0x00b9, TRY_ENTER, TryCatch #0 {IOException -> 0x00b9, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0064, B:24:0x0093, B:26:0x00a5, B:23:0x008e, B:32:0x00b3, B:33:0x00b8, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0064, B:24:0x0093, B:26:0x00a5, B:23:0x008e, B:32:0x00b3, B:33:0x00b8, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACw(com.facebook.ads.redexgen.X.C0526Hi r9) throws com.facebook.ads.redexgen.X.HX {
        /*
            r8 = this;
            android.net.Uri r0 = r9.A04     // Catch: java.io.IOException -> Lb9
            r8.A01 = r0     // Catch: java.io.IOException -> Lb9
            android.net.Uri r0 = r8.A01     // Catch: java.io.IOException -> Lb9
            java.lang.String r3 = r0.getPath()     // Catch: java.io.IOException -> Lb9
            r2 = 1
            r1 = 15
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.io.IOException -> Lb9
            boolean r0 = r3.startsWith(r0)     // Catch: java.io.IOException -> Lb9
            r7 = 1
            if (r0 == 0) goto L33
            r0 = 15
            java.lang.String r3 = r3.substring(r0)     // Catch: java.io.IOException -> Lb9
        L20:
            android.content.res.AssetManager r0 = r8.A04     // Catch: java.io.IOException -> Lb9
            java.io.InputStream r0 = r0.open(r3, r7)     // Catch: java.io.IOException -> Lb9
            r8.A02 = r0     // Catch: java.io.IOException -> Lb9
            java.io.InputStream r2 = r8.A02     // Catch: java.io.IOException -> Lb9
            long r0 = r9.A03     // Catch: java.io.IOException -> Lb9
            long r4 = r2.skip(r0)     // Catch: java.io.IOException -> Lb9
            long r0 = r9.A03     // Catch: java.io.IOException -> Lb9
            goto L46
        L33:
            r2 = 0
            r1 = 1
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.io.IOException -> Lb9
            boolean r0 = r3.startsWith(r0)     // Catch: java.io.IOException -> Lb9
            if (r0 == 0) goto L20
            java.lang.String r3 = r3.substring(r7)     // Catch: java.io.IOException -> Lb9
            goto L20
        L46:
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VC.A07
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L5b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VC.A07
            java.lang.String r1 = "V0B6GAr2PKDbDxhNZksh7AEMCKFKekNi"
            r0 = 7
            r2[r0] = r1
            if (r3 < 0) goto Lb3
            long r0 = r9.A02     // Catch: java.io.IOException -> Lb9
            r5 = -1
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VC.A07
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VC.A07
            java.lang.String r1 = "LLeOWo0qfJ5aEilGNMg5Y9nqgC8u5H4z"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "bhHcjvupHtwrsEsZMKxHQW2SejO"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L93
            goto L8e
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VC.A07
            java.lang.String r1 = "z68meBkT3TqiKmw4pf8g7Y6845REpoZL"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L93
        L8e:
            long r0 = r9.A02     // Catch: java.io.IOException -> Lb9
            r8.A00 = r0     // Catch: java.io.IOException -> Lb9
            goto La7
        L93:
            java.io.InputStream r0 = r8.A02     // Catch: java.io.IOException -> Lb9
            int r0 = r0.available()     // Catch: java.io.IOException -> Lb9
            long r0 = (long) r0     // Catch: java.io.IOException -> Lb9
            r8.A00 = r0     // Catch: java.io.IOException -> Lb9
            long r3 = r8.A00     // Catch: java.io.IOException -> Lb9
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La7
            r8.A00 = r5     // Catch: java.io.IOException -> Lb9
        La7:
            r8.A03 = r7
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.VC> r0 = r8.A05
            if (r0 == 0) goto Lb0
            r0.ACb(r8, r9)
        Lb0:
            long r0 = r8.A00
            return r0
        Lb3:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.io.IOException -> Lb9
            r0.<init>()     // Catch: java.io.IOException -> Lb9
            throw r0     // Catch: java.io.IOException -> Lb9
        Lb9:
            r1 = move-exception
            com.facebook.ads.redexgen.X.HX r0 = new com.facebook.ads.redexgen.X.HX
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VC.ACw(com.facebook.ads.redexgen.X.Hi):long");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final void close() throws HX {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new HX(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                I0<? super VC> i0 = this.A05;
                if (i0 != null) {
                    i0.ACa(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522He
    public final int read(byte[] bArr, int i, int i2) throws HX {
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
                throw new HX(e);
            }
        }
        int i3 = this.A02.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HX(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super VC> i0 = this.A05;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
