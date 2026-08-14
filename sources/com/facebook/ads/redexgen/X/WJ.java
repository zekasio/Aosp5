package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WJ extends DY {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public C0420Da A01;
    public C0422Dc A02;
    public C0423De A03;
    public boolean A04;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C0420Da c0420Da) {
        if (!c0420Da.A04[A00(b, c0420Da.A00, 1)].A03) {
            return c0420Da.A02.A03;
        }
        return c0420Da.A02.A04;
    }

    private final C0420Da A02(C0551Ij c0551Ij) throws IOException {
        if (this.A03 == null) {
            this.A03 = C0424Df.A04(c0551Ij);
            return null;
        }
        C0422Dc c0422Dc = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (c0422Dc == null) {
            this.A02 = C0424Df.A03(c0551Ij);
            return null;
        }
        byte[] bArr = new byte[c0551Ij.A07()];
        System.arraycopy(c0551Ij.A00, 0, bArr, 0, c0551Ij.A07());
        return new C0420Da(this.A03, this.A02, bArr, C0424Df.A0C(c0551Ij, this.A03.A05), C0424Df.A00(r4.length - 1));
    }

    public static void A05(C0551Ij c0551Ij, long j) {
        c0551Ij.A0X(c0551Ij.A07() + 4);
        c0551Ij.A00[c0551Ij.A07() - 4] = (byte) (j & 255);
        c0551Ij.A00[c0551Ij.A07() - 3] = (byte) ((j >>> 8) & 255);
        c0551Ij.A00[c0551Ij.A07() - 2] = (byte) ((j >>> 16) & 255);
        c0551Ij.A00[c0551Ij.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C0551Ij c0551Ij) {
        try {
            return C0424Df.A0A(1, c0551Ij, true);
        } catch (C0360Af unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0551Ij c0551Ij) {
        if ((c0551Ij.A00[0] & 1) == 1) {
            return -1L;
        }
        int iA01 = A01(c0551Ij.A00[0], this.A01);
        int i = this.A04 ? (this.A00 + iA01) / 4 : 0;
        A05(c0551Ij, i);
        this.A04 = true;
        this.A00 = iA01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C0423De c0423De = this.A03;
        this.A00 = c0423De != null ? c0423De.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0551Ij c0551Ij, long j, DX dx) throws InterruptedException, IOException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c0551Ij);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        dx.A00 = Format.A07(null, A03(0, 12, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
