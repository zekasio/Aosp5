package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01511n {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            bArrCopyOfRange[i4] = b;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C0947Xy c0947Xy, AnonymousClass18 anonymousClass18, boolean z, InterfaceC01491l interfaceC01491l) {
        if (!JR.A1S(c0947Xy)) {
            C7U c7u = new C7U(c0947Xy);
            C1W c1wA06 = anonymousClass18.A0O().A0D().A06();
            c7u.A0d(new C0583Jp(anonymousClass18.A0U(), c0947Xy.A08()));
            if (c1wA06 == null) {
                interfaceC01491l.ABm(AdError.CACHE_ERROR);
                return;
            }
            if (c1wA06.A0J()) {
                interfaceC01491l.ABn();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C7Q c7q = new C7Q(c1wA06.A0E(), anonymousClass18.A0Z(), anonymousClass18.A0Y());
            c7q.A04 = true;
            if (JR.A1L(c0947Xy)) {
                c7q.A03 = A00(0, 5, 22);
            }
            int i = C01481k.A00[c1wA06.A09().ordinal()];
            if (i == 1 || i == 2) {
                c7u.A0X(c7q);
            }
            c7u.A0b(new C7S(anonymousClass18.A0R().A01(), -1, -1, anonymousClass18.A0Z(), anonymousClass18.A0Y()));
            c7u.A0b(new C7S(c1wA06.A0D(), -1, -1, anonymousClass18.A0Z(), anonymousClass18.A0Y()));
            c7u.A0W(new C1189d8(c0947Xy, interfaceC01491l, c7u, c1wA06, z), new C7N(anonymousClass18.A0Z(), anonymousClass18.A0Y()));
            return;
        }
        interfaceC01491l.ABn();
    }
}
