package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0407Cc {
    public static byte[] A04;
    public static String[] A05 = {"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    public static final InterfaceC0410Cf A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final WD A02;
    public final C0551Ij A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.ESC, Ascii.SYN, 97};
    }

    static {
        A01();
        A06 = new WF();
        A07 = C0567Iz.A08(A00(0, 3, 42));
    }

    public WE() {
        this(0L);
    }

    public WE(long j) {
        this.A01 = j;
        this.A02 = new WD(true);
        this.A03 = new C0551Ij(200);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A02.A4V(interfaceC0409Ce, new C0440Dw(0, 1));
        interfaceC0409Ce.A5D();
        interfaceC0409Ce.AEM(new C0913Wq(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final int ADX(InterfaceC0408Cd interfaceC0408Cd, C0412Cj c0412Cj) throws InterruptedException, IOException {
        int i = interfaceC0408Cd.read(this.A03.A00, 0, 200);
        if (i == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(i);
        if (!this.A00) {
            this.A02.AD4(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        this.A00 = false;
        this.A02.AEK();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        C0551Ij c0551Ij = new C0551Ij(10);
        C0550Ii c0550Ii = new C0550Ii(c0551Ij.A00);
        int validFramesCount = 0;
        while (true) {
            interfaceC0408Cd.AD7(c0551Ij.A00, 0, 10);
            c0551Ij.A0Y(0);
            if (c0551Ij.A0G() != A07) {
                break;
            }
            c0551Ij.A0Z(3);
            int iA0D = c0551Ij.A0D();
            int length = iA0D + 10;
            validFramesCount += length;
            interfaceC0408Cd.A3K(iA0D);
        }
        interfaceC0408Cd.AEB();
        interfaceC0408Cd.A3K(validFramesCount);
        int i = validFramesCount;
        int i2 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        A05[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int i3 = 0;
        while (true) {
            interfaceC0408Cd.AD7(c0551Ij.A00, 0, 2);
            c0551Ij.A0Y(0);
            int validFramesSize = c0551Ij.A0I();
            if ((65526 & validFramesSize) != 65520) {
                i3 = 0;
                i2 = 0;
                interfaceC0408Cd.AEB();
                i++;
                if (i - validFramesCount >= 8192) {
                    return false;
                }
                interfaceC0408Cd.A3K(i);
            } else {
                i3++;
                if (i3 >= 4 && i2 > 188) {
                    return true;
                }
                interfaceC0408Cd.AD7(c0551Ij.A00, 0, 4);
                c0550Ii.A07(14);
                int iA04 = c0550Ii.A04(13);
                if (iA04 <= 6) {
                    return false;
                }
                int syncBytes = iA04 - 6;
                interfaceC0408Cd.A3K(syncBytes);
                i2 += iA04;
            }
        }
    }
}
