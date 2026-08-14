package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0699Og {
    public static AbstractC0698Of A00(C0702Oj c0702Oj, @Nullable Bundle bundle, boolean z) {
        AbstractC0698Of c0816St;
        C1B c1bA0O = c0702Oj.A04().A0O();
        double dA00 = C0697Oe.A00(c1bA0O);
        boolean isWatchAndBrowse = c0702Oj.A04().A0O().A0N();
        boolean isVideo = C0697Oe.A05(c0702Oj.A00(), c0702Oj.A01(), dA00);
        AbstractC01180f abstractC01180fA00 = C01190g.A00(c0702Oj.A05(), c0702Oj.A06(), "", C0617La.A00(c0702Oj.A04().A0O().A0F().A05()), new HashMap());
        boolean z2 = !TextUtils.isEmpty(c1bA0O.A0D().A08());
        if (JR.A1I(c0702Oj.A05())) {
            c0702Oj.A05().A09().AFP(c0702Oj.A02(), c0702Oj.A04().A0U(), z2);
        }
        if (isWatchAndBrowse && (abstractC01180fA00 instanceof G0)) {
            c0816St = new C0809Sm(c0702Oj);
        } else if (z2) {
            c0816St = new A9(c0702Oj);
        } else if (!z2 && JR.A1q(c0702Oj.A05())) {
            c0816St = new AA(c0702Oj, isVideo);
        } else if (isVideo) {
            c0816St = new C0818Sv(c0702Oj, c0702Oj.A00() == 2);
        } else {
            c0816St = new C0816St(c0702Oj, C0697Oe.A03(dA00));
        }
        if (z) {
            c0816St.A0b(c1bA0O, c0702Oj.A04().A0U(), dA00, bundle);
        }
        return c0816St;
    }
}
