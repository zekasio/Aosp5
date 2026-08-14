package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NO {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (Lr.A00 * 200.0f);
    public static final int A03 = (int) (Lr.A00 * 200.0f);
    public static final int A02 = (int) (Lr.A00 * 50.0f);

    public static AnonymousClass10 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass10.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass10.A06;
        }
        return AnonymousClass10.A04;
    }

    @Nullable
    public static NN A01(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i = A01;
        if (width >= i && height >= i) {
            return new TG(c0947Xy, interfaceC0575Jh, str);
        }
        if (width < A03 || height < A02) {
            return null;
        }
        return new TH(c0947Xy, interfaceC0575Jh, str);
    }

    public static NN A02(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, C1U c1u, InterfaceC0658Mr interfaceC0658Mr, InterfaceC0657Mq interfaceC0657Mq) {
        return new TI(c0947Xy, interfaceC0575Jh, str, c1u, interfaceC0658Mr, interfaceC0657Mq);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h < i || w < i) {
            if (h >= A03) {
                int i2 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (w < i2) {
                }
            }
            return true;
        }
        return false;
    }
}
