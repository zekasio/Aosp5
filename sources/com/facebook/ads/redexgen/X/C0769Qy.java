package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0769Qy {
    public static boolean A00(View view) {
        return view.getBackground() == null || (Build.VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0);
    }
}
