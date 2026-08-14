package com.tapjoy;

import com.tapjoy.internal.j4;
import com.tapjoy.internal.n0;
import com.tapjoy.internal.z6;

/* JADX INFO: loaded from: classes2.dex */
public class FiveRocksIntegration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static n0<String, TJPlacement> f1622a = new n0<>();

    public static void a() {
        z6 z6Var = z6.r;
        if (!z6Var.c) {
            z6Var.c = true;
        }
        z6.r.a(new j4());
    }

    public static void addPlacementCallback(String str, TJPlacement tJPlacement) {
        synchronized (f1622a) {
            f1622a.put(str, tJPlacement);
        }
    }
}
