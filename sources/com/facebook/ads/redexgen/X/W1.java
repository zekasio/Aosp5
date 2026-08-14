package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0407Cc {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    public static final InterfaceC0410Cf A09 = new W2();
    public long A00;
    public InterfaceC0409Ce A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0433Dp> A05;
    public final C0551Ij A06;
    public final C0563Iv A07;

    public W1() {
        this(new C0563Iv(0L));
    }

    public W1(C0563Iv c0563Iv) {
        this.A07 = c0563Iv;
        this.A06 = new C0551Ij(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void A8I(InterfaceC0409Ce interfaceC0409Ce) {
        this.A01 = interfaceC0409Ce;
        interfaceC0409Ce.AEM(new C0913Wq(-9223372036854775807L));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ADX(com.facebook.ads.redexgen.X.InterfaceC0408Cd r10, com.facebook.ads.redexgen.X.C0412Cj r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W1.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final void AEL(long j, long j2) {
        this.A07.A08();
        for (int i = 0; i < this.A05.size(); i++) {
            this.A05.valueAt(i).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0407Cc
    public final boolean AEv(InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        interfaceC0408Cd.AD7(bArr, 0, 14);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        if (A08[7].length() == 3) {
            throw new RuntimeException();
        }
        A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
        interfaceC0408Cd.A3K(bArr[13] & 7);
        interfaceC0408Cd.AD7(bArr, 0, 3);
        return 1 == ((bArr[2] & UByte.MAX_VALUE) | (((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)));
    }
}
