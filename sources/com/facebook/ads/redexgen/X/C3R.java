package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3R {
    public static final C3Q A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new FG();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C1143cJ();
        } else {
            A00 = new C3Q();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
