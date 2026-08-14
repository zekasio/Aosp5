package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1095bW implements InterfaceC01561s {
    public static byte[] A03;
    public C5Q A00;
    public C0947Xy A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, 127, 122, 127, 126, 102, 127};
    }

    public C1095bW(C5Q c5q, C0947Xy c0947Xy, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5q;
        this.A01 = c0947Xy;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01561s
    public final void AAi(KH kh) {
        C0616Kz.A00(new C1098bZ(this, kh));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01561s
    public final void ABd(List<C1217da> list) {
        C7U c7u = new C7U(this.A01);
        String strA02 = A02(6, 7, 70);
        for (C1217da c1217da : list) {
            if (A02(6, 7, 70).equals(strA02)) {
                strA02 = c1217da.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1217da.A0E().A0G() != null) {
                    c7u.A0b(new C7S(c1217da.A0E().A0G().getUrl(), c1217da.A0E().A0G().getHeight(), c1217da.A0E().A0G().getWidth(), c1217da.A0G(), A02(0, 6, 2)));
                }
                if (c1217da.A0E().A0F() != null) {
                    c7u.A0b(new C7S(c1217da.A0E().A0F().getUrl(), c1217da.A0E().A0F().getHeight(), c1217da.A0E().A0F().getWidth(), c1217da.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1217da.A0E().A0d())) {
                    c7u.A0a(new C7Q(c1217da.A0E().A0d(), c1217da.A0G(), A02(0, 6, 2), c1217da.A0E().A0A()));
                }
            }
        }
        c7u.A0W(new C1096bX(this, list), new C7N(strA02, A02(0, 6, 2)));
    }
}
