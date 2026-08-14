package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1024aN implements InterfaceC02856v {
    public static byte[] A01;
    public static String[] A02 = {"dNr6PPQsY9l", "RH2U4Hh24YJB1CaC1uFo9RGIyJZKKzLP", "dQYGehnAuPol14EFpizMkTDsN0LYSx6h", "7Q5ZVjGu0JJTpQG9POYIlRIj1jnsmDo", "fVmoe7EJsPLcTdm", "gOyCjpHNXOG3DgRDYrCD", "Bt7utfgyfoKMrlpwfOIMwYj8ykKc", "iv3XcVN43HhJpxh2FG4KyUlJf74g4nGs"};
    public final /* synthetic */ C1014aD A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {32, Ascii.US, 50, 50, 35, 48, 55, Ascii.GS, 42, 45, 53};
        String[] strArr = A02;
        if (strArr[5].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A02[7] = "zsr7uVrJNcFH7kX5XxLPdtK6eEcZRxEm";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1024aN(C1014aD c1014aD) {
        this.A00 = c1014aD;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        return this.A00.A0B(A00(0, 11, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), false);
    }
}
