package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1159cd implements AnonymousClass22 {
    public static byte[] A04;
    public static String[] A05 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final AbstractC1172cq A00;
    public final InterfaceC01591v A01;
    public final AnonymousClass24 A02;
    public final C0947Xy A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, Ascii.FS, 88, Ascii.ETB, Ascii.SUB, Ascii.DC2, Ascii.GS, Ascii.ESC, Ascii.FF, 88, 17, Ascii.VT, 88, Ascii.SYN, Ascii.CR, Ascii.DC4, Ascii.DC4, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, Ascii.CR, Ascii.SO, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, 98, 101, 127, 116, 110, 121, 121, 100, 121, 116, 104, 100, 111, 110, 116, 96, 110, 114, Ascii.SO, 9, 19, Ascii.CAN, Ascii.NAK, 17, Ascii.CAN, 17, Ascii.SO, 3, 2, 8, Ascii.CAN, 3, Ascii.DC2, Ascii.NAK, 6, 19, Ascii.SO, 8, 9, Ascii.CAN, Ascii.FF, 2, Ascii.RS, 111, 108, 109, 100, 124, 106, 109, 117, 98, 111, 106, 103, 98, 119, 106, 108, 109, 124, 119, 106, 110, 102, 124, 104, 102, 122, 59, 19, 5, 5, Ascii.ETB, 17, 19, 76, 86, 96, 68, 94, 94, 68, 67, 74, Ascii.CR, 79, 88, 67, 73, 65, 72, Ascii.CR, 75, 66, 95, Ascii.CR, 64, 72, 94, 94, 76, 74, 72, 8, 44, 54, 54, 44, 43, 34, 101, 39, 48, 43, 33, 41, 32, 101, 35, 42, 55, 101, 40, 32, 54, 54, 36, 34, 32, 107, 90, 93, 91, 86, 76, 91, 91, 70, 91, 86, 68, 76, 90, 90, 72, 78, 76, 86, 66, 76, 80, 5, Ascii.DC4, Ascii.CR};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public C1159cd(C0947Xy c0947Xy, AnonymousClass24 anonymousClass24, InterfaceC01591v interfaceC01591v, AbstractC1172cq abstractC1172cq) {
        this.A03 = c0947Xy;
        this.A02 = anonymousClass24;
        this.A01 = interfaceC01591v;
        this.A00 = abstractC1172cq;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    public final void A80(Message message) {
        com.facebook.ads.Ad adA00 = this.A02.A00();
        String strA00 = A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 3, 16);
        if (adA00 == null) {
            this.A03.A06().A8y(strA00, C03298z.A0K, new AnonymousClass90(A00(0, 17, 12)));
            return;
        }
        int i = message.what;
        String strA002 = A00(120, 9, 2);
        String strA003 = A00(17, 17, 14);
        if (i != 10) {
            if (i == 2100) {
                this.A01.AEc();
                Bundle bundle = message.getData().getBundle(strA003);
                if (bundle != null) {
                    this.A02.A01 = bundle.getLong(A00(94, 26, 87));
                    this.A02.A00 = bundle.getInt(A00(69, 25, 51));
                } else {
                    this.A03.A06().A8y(strA00, C03298z.A0V, new AnonymousClass90(A00(129, 26, 89), strA002 + message));
                }
                this.A02.A01(null);
            } else if (i != 2103) {
                if (i == 2106) {
                    this.A02.A01(null);
                } else if (i == 2110) {
                    this.A01.AEi();
                } else if (i != 2010) {
                    String[] strArr = A05;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                }
            }
            if (this.A02.A04 == null) {
                return;
            }
            int i2 = message.what;
            if (i2 == 2100) {
                this.A02.A04.onAdLoaded(adA00);
                return;
            }
            if (i2 != 2110) {
                switch (i2) {
                    case 2104:
                        this.A02.A04.onAdClicked(adA00);
                        return;
                    case 2105:
                        this.A02.A04.onLoggingImpression(adA00);
                        return;
                    case 2106:
                        if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                            ((RewardedVideoAdExtendedListener) this.A02.A04).onRewardedVideoActivityDestroyed();
                            return;
                        }
                        return;
                    default:
                        switch (i2) {
                            case 3000:
                                this.A02.A04.onRewardedVideoCompleted();
                                return;
                            case 3001:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                                    return;
                                }
                                return;
                            case 3002:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                }
            }
            this.A02.A04.onRewardedVideoClosed();
            return;
        }
        Bundle bundle2 = message.getData();
        Bundle bundle3 = bundle2.getBundle(strA003);
        if (bundle3 != null) {
            int i3 = bundle3.getInt(A00(51, 18, 95));
            String string = bundle3.getString(A00(182, 21, 125));
            AdError adError = new AdError(i3, string);
            this.A01.AEY(adError);
            if (this.A02.A04 != null) {
                this.A02.A04.onError(adA00, adError);
            } else {
                Log.e(A00(34, 17, 59), string);
            }
        } else {
            this.A01.AEV(EnumC01581u.A05);
            this.A03.A06().A8y(strA00, C03298z.A0V, new AnonymousClass90(A00(155, 27, 49), strA002 + message));
        }
        AnonymousClass24 anonymousClass24 = this.A02;
        String[] strArr3 = A05;
        if (strArr3[1].length() != strArr3[2].length()) {
            String[] strArr4 = A05;
            strArr4[3] = "9bbWCvtTNy4UVYSvKE";
            strArr4[4] = "MUJHaNV8";
            anonymousClass24.A01(null);
            return;
        }
        String[] strArr5 = A05;
        strArr5[6] = "1K6GDc";
        strArr5[7] = "I0Fko4DemMWRrizY9fBW0";
        anonymousClass24.A01(null);
    }
}
