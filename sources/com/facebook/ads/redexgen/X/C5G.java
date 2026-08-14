package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5G {
    public static C0R A00(Context context, C8W c8w) {
        C0946Xx sdkContext = A07(context);
        C0U c0uA6i = c8w.A6i(sdkContext);
        if (c0uA6i != null) {
            return c0uA6i.A9T();
        }
        return new C1232dq();
    }

    public static C0947Xy A01(Activity activity) {
        return new C0947Xy(activity, A08(), A00(activity, A08()));
    }

    public static C0947Xy A02(Context context) {
        return new C0947Xy(context, A08(), new C1232dq());
    }

    public static C0947Xy A03(Context context) {
        return new C0947Xy(context, A08(), A00(context, A08()));
    }

    public static C0947Xy A04(Context context) {
        if (JR.A0o(context)) {
            return new C0947Xy(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C0947Xy A05(Context context) {
        return new C0947Xy(context, A08(), A00(context, A08()));
    }

    public static C0451El A06(Context context) {
        return new C0451El(context, A08(), A08().A6i(A07(context)));
    }

    public static C0946Xx A07(Context context) {
        return new C0946Xx(context, A08());
    }

    public static synchronized C8W A08() {
        return XW.A02();
    }
}
