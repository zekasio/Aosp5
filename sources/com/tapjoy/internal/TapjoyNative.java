package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyNative {
    public static Object createPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        return d6.b.a(context, str, tJPlacementListener);
    }

    public static Object getPrivacyPolicy() {
        return d6.b.a();
    }
}
