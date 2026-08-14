package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1120bv extends C4W {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public F9 A00;
    public Scroller A01;
    public final C4Y A02 = new C1121bw(this);

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, Ascii.SI, Ascii.DLE, -3, 10, -1, 1, -68, Ascii.VT, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, Ascii.SI, Ascii.DLE, 1, 10, 1, Ascii.SO, -68, -3, 8, Ascii.SO, 1, -3, 0, Ascii.NAK, -68, Ascii.SI, 1, Ascii.DLE, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(C4T c4t, int i, int i2);

    @Nullable
    public abstract View A0D(C4T c4t);

    @Nullable
    public abstract int[] A0H(@NonNull C4T c4t, @NonNull View view);

    static {
        A09();
    }

    @Nullable
    private final AbstractC02194g A05(C4T c4t) {
        return A0E(c4t);
    }

    private void A07() {
        this.A00.A1k(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1j(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(@NonNull C4T c4t, int i, int i2) {
        AbstractC02194g abstractC02194gA05;
        if (!(c4t instanceof InterfaceC02184f) || (abstractC02194gA05 = A05(c4t)) == null) {
            return false;
        }
        int iA0C = A0C(c4t, i, i2);
        String[] strArr = A04;
        if (strArr[0].charAt(25) == strArr[7].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
        strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
        if (iA0C == -1) {
            return false;
        }
        abstractC02194gA05.A0A(iA0C);
        c4t.A1L(abstractC02194gA05);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final boolean A0B(int i, int i2) {
        C4T layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        int minFlingVelocity2 = Math.abs(i2);
        if (minFlingVelocity2 <= minFlingVelocity) {
            int minFlingVelocity3 = Math.abs(i);
            if (minFlingVelocity3 <= minFlingVelocity) {
                return false;
            }
        }
        return A0A(layoutManager, i, i2);
    }

    @Nullable
    @Deprecated
    public C1134cA A0E(C4T c4t) {
        if (!(c4t instanceof InterfaceC02184f)) {
            return null;
        }
        return new F8(this, this.A00.getContext());
    }

    public final void A0F() {
        C4T layoutManager;
        View snapView;
        F9 f9 = this.A00;
        if (f9 == null || (layoutManager = f9.getLayoutManager()) == null || (snapView = A0D(layoutManager)) == null) {
            return;
        }
        int[] iArrA0H = A0H(layoutManager, snapView);
        if (iArrA0H[0] != 0 || iArrA0H[1] != 0) {
            this.A00.A1e(iArrA0H[0], iArrA0H[1]);
        }
    }

    public final void A0G(@Nullable F9 f9) throws IllegalStateException {
        F9 f92 = this.A00;
        if (f92 == f9) {
            return;
        }
        if (f92 != null) {
            A07();
        }
        this.A00 = f9;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
