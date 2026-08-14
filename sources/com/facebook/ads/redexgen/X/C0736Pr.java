package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0736Pr {
    public static byte[] A05;
    public static String[] A06 = {"4IoXmskrHF1p6dXqKQn3apqXXvi8", "1tZtBqJSVjxeNtOdqegUYYfHC8", "yIG7nuwjW", "6uVpGgk4XMyp6iT3bnZwHJmMch5uofQt", "GVQj", "RdXauxF0SpMDtL", "yOCZ", "m5Wr6psr3K5zQ"};
    public Executor A00 = MX.A06;
    public final C0947Xy A01;
    public final InterfaceC0657Mq A02;
    public final NI A03;

    @Nullable
    public final String A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {99, 114, 114, 107, 102, 104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46, 37, 115, 46, 102, 97, 99, 101, 98, 111, 111, 107, 46, 99, 111, 109, 47, 97, 117, 100, 105, 101, 110, 99, 101, 95, 110, 101, 116, 119, 111, 114, 107, 47, 115, 101, 114, 118, 101, 114, 95, 115, 105, 100, 101, 95, 114, 101, 119, 97, 114, 100, 76, 80, 80, 84, 87, Ascii.RS, Ascii.VT, Ascii.VT, 83, 83, 83, 10, 66, 69, 71, 65, 70, 75, 75, 79, 10, 71, 75, 73, Ascii.VT, 69, 81, 64, 77, 65, 74, 71, 65, 123, 74, 65, 80, 83, 75, 86, 79, Ascii.VT, 87, 65, 86, 82, 65, 86, 123, 87, 77, 64, 65, 123, 86, 65, 83, 69, 86, 64, 67, 80, 120, 124, 97, 108, 97, 100, 120, 117};
        String[] strArr = A06;
        if (strArr[4].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "UxdDTxCBISRzTQMngmIIdhyBS5kV";
        strArr2[5] = "aUHRRDOUc27Pb9";
        A05 = bArr;
    }

    static {
        A04();
    }

    public C0736Pr(C0947Xy c0947Xy, NI ni, @Nullable String str, InterfaceC0657Mq interfaceC0657Mq) {
        this.A01 = c0947Xy;
        this.A03 = ni;
        this.A04 = str;
        this.A02 = interfaceC0657Mq;
    }

    @Nullable
    public static String A03(@Nullable RewardData rewardData, String serverSideProxyURL, String str) {
        String strA02;
        if (rewardData != null) {
            String urlPrefix = AdSettings.getUrlPrefix();
            if (urlPrefix == null || urlPrefix.isEmpty()) {
                strA02 = A02(68, 60, 14);
            } else {
                strA02 = String.format(Locale.US, A02(5, 63, 42), urlPrefix);
            }
            Uri uriA00 = C0617La.A00(strA02);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uriA00.getScheme());
            builder.authority(uriA00.getAuthority());
            builder.path(uriA00.getPath());
            builder.query(uriA00.getQuery());
            builder.fragment(uriA00.getFragment());
            builder.appendQueryParameter(A02(134, 4, 59), rewardData.getUserID());
            builder.appendQueryParameter(A02(128, 2, 25), rewardData.getCurrency());
            builder.appendQueryParameter(A02(130, 4, 34), serverSideProxyURL);
            builder.appendQueryParameter(A02(0, 5, 40), str);
            return builder.build().toString();
        }
        return null;
    }

    public final void A05() {
        if (!TextUtils.isEmpty(this.A04)) {
            RM rm = new RM(this.A01, new HashMap());
            rm.A07(new C0789Rs(this));
            rm.executeOnExecutor(this.A00, this.A04);
        }
    }
}
