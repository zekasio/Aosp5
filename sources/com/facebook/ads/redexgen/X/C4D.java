package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4D {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final C4T A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, Ascii.GS, 82, 79, 84, 88, 83, 73, 92, 73, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public C4D(C4T c4t) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = c4t;
    }

    public /* synthetic */ C4D(C4T c4t, C1133c9 c1133c9) {
        this(c4t);
    }

    public static C4D A00(C4T c4t) {
        return new C1133c9(c4t);
    }

    public static C4D A01(C4T c4t) {
        return new C1132c8(c4t);
    }

    public static C4D A02(C4T c4t, int i) {
        if (i == 0) {
            return A00(c4t);
        }
        if (i == 1) {
            return A01(c4t);
        }
        throw new IllegalArgumentException(A03(0, 19, 11));
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
