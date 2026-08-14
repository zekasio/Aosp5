package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0949Ya implements InterfaceC02856v {
    public static String[] A01 = {"fhgAKr3d26sPe206xi", "SjffeijJA1Vv6PcXWUgct", "EsQusZwl1jUwipz2lU1dtOeOynoqp4qu", "0VpWGFYwNM1shdn7oayU", "oGsU7X9gn8B3aKKKnK6Um4C", "3PuUzv37NfYax6hYz8jf", "w27NqvUy0J9VzwNZKDXUsnO8qh2oDxhJ", "FZXbTPmbge4RvKyxAzubgHD8Txvy8Otv"};
    public final /* synthetic */ YR A00;

    public C0949Ya(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02856v
    public final C7A A5J() {
        if (this.A00.A00 == null) {
            C7A c7aA07 = this.A00.A07(AnonymousClass76.A07);
            if (A01[6].charAt(19) != 'U') {
                throw new RuntimeException();
            }
            A01[6] = "mdGsZgeczhjsROxHbS4UhtOI0ggMdB2A";
            return c7aA07;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            YR yr = this.A00;
            TelephonyManager telephonyManager = yr.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "gYbGBXsMnQLVbPxH35aVX";
            strArr2[4] = "c9uQZVFrEkdSbUXAtWNBNx9";
            return yr.A04(telephonyManager.getDataNetworkType());
        }
        YR yr2 = this.A00;
        String[] strArr3 = A01;
        if (strArr3[2].length() != strArr3[0].length()) {
            A01[6] = "dEMR1C0fCLJEsmN6YStUhJGVUagFQ5EF";
            return yr2.A04(yr2.A00.getNetworkType());
        }
        A01[7] = "IeVVB4pQAR4pX23W54Z95CGRKG6wHZI8";
        return yr2.A04(yr2.A00.getNetworkType());
    }
}
