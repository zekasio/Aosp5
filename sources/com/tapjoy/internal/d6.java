package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6 f1780a;
    public static d6 b;

    static {
        d6 d6Var = new d6();
        f1780a = d6Var;
        b = d6Var;
    }

    public Object a(Context context, String str, TJPlacementListener tJPlacementListener) {
        return new TJPlacement(context, str, tJPlacementListener);
    }

    public Object a() {
        return TJPrivacyPolicy.getInstance();
    }
}
