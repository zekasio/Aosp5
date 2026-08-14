package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0879Vf extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"zIk8lFjKPo5VqXBeAWetc3TePOqewtK4", "Krv9CUV84BxP4tXlBDsVq5ZfguHkkPOw", "qZweMgdQpTvQjM16IN332AToX", "5wIly2IGyFbenCO8uByiE", "WVTy90LHtMArJ1Mx15Navn95RKOGxxfC", "YMittl3f14YbQo67yPLY6h3Kxcx5v1", "fVvKsKq8KPyH9", "YcDFZjjwvX0vuueDfq7B81mncQMZao1W"};
    public static final DownloadAction.Deserializer A03;

    @Nullable
    public final String A00;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{3, 1, Ascii.FS, Ascii.DC4, 1, Ascii.SYN, 0, 0, Ascii.SUB, 5, Ascii.SYN};
    }

    static {
        A06();
        A03 = new C0880Vg(A05(0, 11, 68), 0);
    }

    public C0879Vf(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A05(0, 11, 68), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C0878Ve A07(F5 f5) {
        return new C0878Ve(this.A01, this.A00, f5);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : IA.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z = this.A00 != null;
        dataOutputStream.writeBoolean(z);
        if (z) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof C0879Vf) && A04().equals(((C0879Vf) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean zEquals = super.equals(obj);
        String[] strArr = A02;
        if (strArr[0].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[3] = "S1dYnav0YyHlHBWJfncCN";
        if (!zEquals) {
            return false;
        }
        return C0567Iz.A0g(this.A00, ((C0879Vf) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.A00;
        int result = str != null ? str.hashCode() : 0;
        int i = iHashCode + result;
        String[] strArr = A02;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
        return i;
    }
}
