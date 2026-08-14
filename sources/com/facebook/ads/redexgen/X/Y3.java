package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y3 extends L8 {
    public static byte[] A02;
    public final /* synthetic */ Y2 A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, Ascii.SYN, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public Y3(Y2 y2, AtomicBoolean atomicBoolean) {
        this.A00 = y2;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0582Jo.A0H);
                C7X.A02(this.A00.A02.A04, this.A00.A01, C7X.A00, A00(11, 14, 17), this.A00.A02.A00);
                this.A00.A02.A0T();
                this.A00.A00.AAO();
                return;
            }
            this.A00.A02.A0I(EnumC0582Jo.A0G);
            C7X.A02(this.A00.A02.A04, this.A00.A01, C7X.A04, A00(0, 11, 41), this.A00.A02.A00);
            this.A00.A02.A0U();
            this.A00.A00.AAH();
        }
    }
}
