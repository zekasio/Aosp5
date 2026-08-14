package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TQ implements InterfaceC0627Lk {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ TO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public TQ(TO to) {
        this.A00 = to;
    }

    public /* synthetic */ TQ(TO to, TV tv) {
        this(to);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void AAN() {
        this.A00.A0V.setToolbarActionMessage(A00(0, 0, 7));
        this.A00.A0J();
        if (this.A00.A0S && this.A00.A0Y()) {
            this.A00.A0V.setToolbarActionMode(1);
        } else {
            this.A00.A0V.setToolbarActionMode(0);
        }
        boolean z = this.A00.A0T;
        if (A02[4].length() != 6) {
            throw new RuntimeException();
        }
        A02[4] = "RNuzR8";
        if (!z) {
            MS.A0U(this.A00, 500);
            if (this.A00.A05 != null) {
                MS.A0N(this.A00.A05, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0627Lk
    public final void ABy(float f) {
        float fA03;
        this.A00.A0Q((int) f);
        if (!this.A00.A0U) {
            float percentage = 100.0f * (1.0f - (f / this.A00.A0E.A07()));
            this.A00.A0V.setProgress(percentage);
            return;
        }
        if (this.A00.A09) {
            fA03 = 1.0f - (f / this.A00.A0D.A0O().A0D().A02());
            if (this.A00.A0C || fA03 < 1.0f) {
                this.A00.A0C = false;
                String strA00 = this.A00.A0D.A0S().A00();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                this.A00.A0V.setToolbarActionMessage(strA00.replace(A00(0, 6, 65), String.valueOf((int) f)));
            } else {
                this.A00.A0C = true;
                this.A00.A0V.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            fA03 = 1.0f - (f / this.A00.A0D.A0O().A0D().A03());
        }
        this.A00.A0V.setProgress(100.0f * fA03);
        boolean z = ((float) this.A00.A0D.A0O().A0D().A02()) - f >= ((float) this.A00.A0D.A0O().A0D().A03());
        if (!this.A00.A0C && z) {
            this.A00.A0V.setToolbarActionMode(1);
        }
    }
}
