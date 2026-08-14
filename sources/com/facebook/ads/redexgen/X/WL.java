package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.loopj.android.http.AsyncHttpClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WL extends DY {
    public static byte[] A01;
    public static String[] A02 = {"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, -39, -56, -51, -45, -109, -45, -44, -39, -41};
    }

    static {
        A02();
        A03 = C0567Iz.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i2;
        int i3 = bArr[0] & UByte.MAX_VALUE;
        int i4 = i3 & 3;
        if (i4 == 0) {
            i = 1;
        } else if (i4 != 1 && i4 != 2) {
            i = bArr[1] & 63;
        } else {
            i = 2;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            int length = i6 & 1;
            i2 = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << length;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int length2 = str.length();
            int length3 = str2.length();
            if (length2 == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i6 == 3) {
                i2 = 60000;
            } else {
                i2 = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << i6;
            }
        }
        return ((long) i) * ((long) i2);
    }

    private void A03(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean A04(C0551Ij c0551Ij) {
        int iA04 = c0551Ij.A04();
        byte[] bArr = A04;
        if (iA04 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0551Ij.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, A04);
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C0551Ij c0551Ij) {
        return A04(A00(c0551Ij.A00));
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C0551Ij c0551Ij, long j, DX dx) throws InterruptedException, IOException {
        if (!this.A00) {
            byte[] bArrCopyOf = Arrays.copyOf(c0551Ij.A00, c0551Ij.A07());
            int i = bArrCopyOf[9] & UByte.MAX_VALUE;
            int channelCount = (bArrCopyOf[11] & UByte.MAX_VALUE) << 8;
            int channelCount2 = channelCount | (bArrCopyOf[10] & UByte.MAX_VALUE);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            A03(arrayList, channelCount2);
            A03(arrayList, 3840);
            dx.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = c0551Ij.A08() == A03;
        c0551Ij.A0Y(0);
        return z;
    }
}
