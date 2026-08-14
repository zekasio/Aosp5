package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o7 implements k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f1874a;

    static {
        String[] strArr = {"reward", FirebaseAnalytics.Event.PURCHASE, "custom_action"};
        f1874a = strArr;
        Arrays.sort(strArr);
    }

    public void a(l6 l6Var) {
        if (this instanceof n6) {
            x7 x7Var = (x7) this;
            ((i4) l6Var).a(x7Var.b, x7Var.c);
        } else if (this instanceof o6) {
            z7 z7Var = (z7) this;
            ((i4) l6Var).a(z7Var.b, z7Var.c, z7Var.d, z7Var.e);
        }
    }

    public static boolean a(String str) {
        return Arrays.binarySearch(f1874a, str) >= 0;
    }

    public static o7 a(String str, z0 z0Var) {
        if ("reward".equals(str)) {
            return (o7) z0Var.b(z7.f);
        }
        if (FirebaseAnalytics.Event.PURCHASE.equals(str)) {
            return (o7) z0Var.b(x7.d);
        }
        return null;
    }
}
