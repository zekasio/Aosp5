package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FL extends d2 {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 112);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, Ascii.VT, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public FL(C0947Xy c0947Xy, C01531p c01531p) {
        super(c0947Xy, c01531p);
    }

    private AnonymousClass14 A00(Runnable runnable) {
        return new C1176cu(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        AbstractC1207dQ abstractC1207dQ = (AbstractC1207dQ) this.A01;
        abstractC1207dQ.A00(this.A07.A00);
        abstractC1207dQ.A01(this.A07.A01);
        abstractC1207dQ.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC01250n interfaceC01250n, C9H c9h, C9F c9f, C01541q c01541q) {
        C0474Fi c0474Fi = (C0474Fi) interfaceC01250n;
        Runnable rewardedVideoTimeout = new C1177cv(this, c01541q, c0474Fi);
        if (JR.A1n(this.A0B)) {
            A0C().postDelayed(rewardedVideoTimeout, c9h.A05().A05());
        }
        C0947Xy c0947Xy = this.A0B;
        AnonymousClass14 anonymousClass14A00 = A00(rewardedVideoTimeout);
        boolean z = this.A07.A06;
        String str = this.A07.A04;
        C01531p c01531p = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        c0474Fi.A0G(c0947Xy, anonymousClass14A00, c01541q, z, str, c01531p.A05);
    }

    public final AnonymousClass18 A0T() {
        return ((AbstractC1207dQ) this.A01).A0E();
    }

    public final void A0U(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7B() == AdPlacementType.REWARDED_VIDEO) {
                ((AbstractC1207dQ) this.A01).A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
