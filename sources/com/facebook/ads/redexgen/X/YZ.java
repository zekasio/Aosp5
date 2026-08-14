package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YZ implements InterfaceC02856v {
    public static String[] A01 = {"YvgwWocx1FADdeAzbpsmJqKucTKVrLw8", "IN5yo6alVzQxSBDS0LSAMVLc9G2MRZFn", "HAZTu6IPNZsD1qj0M1i9utr9DJx5S0QZ", "N5cGJfQ0ESKW2WKzc5hPaTPWXOaKWBwf", "tNMXMhxZjOCLmtsXwerOChNpJkA4NIz8", "qe3nCZLHllYVPimtyVQbZz0eRg0vYsPF", "hksQgw", "nUQ4NN4k5WyfvhfMBfttwidjpDAXB5K7"};
    public final /* synthetic */ YR A00;

    public YZ(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 == null) {
            return this.A00.A07(AnonymousClass76.A07);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            YR yr = this.A00;
            return yr.A04(yr.A00.getVoiceNetworkType());
        }
        YR yr2 = this.A00;
        TelephonyManager telephonyManager = yr2.A00;
        if (A01[2].charAt(0) == 'L') {
            throw new RuntimeException();
        }
        A01[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
        return yr2.A04(telephonyManager.getNetworkType());
    }
}
