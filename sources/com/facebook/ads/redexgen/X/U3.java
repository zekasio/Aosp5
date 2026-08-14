package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U3 extends L8 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C0600Kh A00;
    public final /* synthetic */ C0602Kk A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, Ascii.VT, 69, 78, 95, 92, 68, 89, 64, Ascii.VT, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    static {
        A02();
    }

    public U3(C0602Kk c0602Kk, C0600Kh c0600Kh) {
        this.A01 = c0602Kk;
        this.A00 = c0600Kh;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (MH.A00(this.A01.A04) != MG.A07) {
            AnonymousClass98.A08(this.A01.A04);
            C02575s.A07(this.A01.A04);
            boolean z = true;
            Map<String, String> mapA08 = this.A00.A08(C9U.A00().A01(this.A01.A04, true).A6W());
            this.A01.A02 = mapA08;
            try {
                PackageManager packageManager = this.A01.A04.getPackageManager();
                if (packageManager != null) {
                    mapA08.put(A00(1, 12, 113), new String(Base64.encode((this.A01.A04.getPackageName() + A00(0, 1, 93) + packageManager.getInstallerPackageName(this.A01.A04.getPackageName())).getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != KM.A03 && this.A00.A05() != KM.A05 && this.A00.A05() != KM.A04 && this.A00.A05() != null) {
                    z = false;
                }
                RK.A02(z, this.A01.A04).ADC(this.A01.A06, new RG().A05(this.A01.A02).A08(), this.A01.A03(MJ.A00(), this.A00));
                return;
            } catch (Exception e) {
                AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
                String message = e.getMessage();
                C0R c0rA0D = this.A01.A04.A0D();
                String errorMessage = A03[5];
                if (errorMessage.length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                c0rA0D.A2j(MJ.A01(this.A01.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
                this.A01.A0D(KH.A01(adErrorType, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
        String strA00 = A00(13, 21, 92);
        this.A01.A04.A0D().A2j(MJ.A01(this.A01.A00), adErrorType2.getErrorCode(), strA00, adErrorType2.isPublicError());
        this.A01.A0D(new KH(adErrorType2, strA00));
    }
}
