package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0413Ck {
    public static byte[] A02;
    public final C0415Cm A00;
    public final C0415Cm A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-54, -66, 1, Ascii.SYN};
    }

    public C0413Ck(C0415Cm c0415Cm) {
        this(c0415Cm, c0415Cm);
    }

    public C0413Ck(C0415Cm c0415Cm, C0415Cm c0415Cm2) {
        this.A00 = (C0415Cm) IK.A01(c0415Cm);
        this.A01 = (C0415Cm) IK.A01(c0415Cm2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0413Ck c0413Ck = (C0413Ck) obj;
        return this.A00.equals(c0413Ck.A00) && this.A01.equals(c0413Ck.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String strA00;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 1, 88));
        sb.append(this.A00);
        if (this.A00.equals(this.A01)) {
            strA00 = A00(0, 0, 98);
        } else {
            strA00 = A00(0, 2, 80) + this.A01;
        }
        sb.append(strA00);
        sb.append(A00(3, 1, 107));
        return sb.toString();
    }
}
