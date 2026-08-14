package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01220j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, Ascii.ESC, 2};
    }

    static {
        A02();
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0014 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Collection<java.lang.String> A01(@androidx.annotation.Nullable org.json.JSONArray r3) {
        /*
            if (r3 == 0) goto L8
            int r0 = r3.length()
            if (r0 != 0) goto La
        L8:
            r0 = 0
            return r0
        La:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 0
        L10:
            int r0 = r3.length()
            if (r1 >= r0) goto L20
            java.lang.String r0 = r3.optString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L10
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01220j.A01(org.json.JSONArray):java.util.Collection");
    }

    public static boolean A03(C0947Xy c0947Xy, InterfaceC01210i interfaceC01210i, InterfaceC0575Jh interfaceC0575Jh) {
        EnumC01200h enumC01200hA6p = interfaceC01210i.A6p();
        if (enumC01200hA6p == null || enumC01200hA6p == EnumC01200h.A03) {
            return false;
        }
        boolean z = false;
        Collection<String> collectionA6O = interfaceC01210i.A6O();
        if (collectionA6O == null || collectionA6O.isEmpty()) {
            return false;
        }
        Iterator<String> it = collectionA6O.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String packageName = it.next();
            if (M0.A04(c0947Xy, packageName)) {
                z = true;
                break;
            }
        }
        if (z != (enumC01200hA6p == EnumC01200h.A02)) {
            return false;
        }
        String strA65 = interfaceC01210i.A65();
        boolean zIsEmpty = TextUtils.isEmpty(strA65);
        String[] strArr = A01;
        if (strArr[7].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
        if (!zIsEmpty) {
            interfaceC0575Jh.A94(strA65, null);
            return true;
        }
        InterfaceC03288y interfaceC03288yA06 = c0947Xy.A06();
        int i = C03298z.A0Z;
        String packageName2 = A00(0, 32, 28);
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(packageName2);
        String packageName3 = A00(32, 3, 83);
        interfaceC03288yA06.A8y(packageName3, i, anonymousClass90);
        return true;
    }
}
