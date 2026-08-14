package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YH implements InterfaceC02856v {
    public static byte[] A01;
    public final /* synthetic */ YG A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{84, 91, 81, 71, 90, 92, 81, Ascii.ESC, 93, 84, 71, 81, 66, 84, 71, 80, Ascii.ESC, 64, 70, 87, Ascii.ESC, 84, 86, 65, 92, 90, 91, Ascii.ESC, 96, 102, 119, 106, 102, 97, 116, 97, 112, Ascii.FS, Ascii.DLE, 17, 17, Ascii.SUB, Ascii.FS, Ascii.VT, Ascii.SUB, Ascii.ESC};
    }

    public YH(YG yg) {
        this.A00 = yg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        Intent intent = this.A00.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 55)));
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            return this.A00.A0F(extras.getBoolean(A00(37, 9, 125)));
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
