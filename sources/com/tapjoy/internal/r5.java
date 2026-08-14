package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;

/* JADX INFO: loaded from: classes2.dex */
public class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5<Void> f1898a = new a();

    public static class a extends x5<Void> {
        @Override // com.tapjoy.internal.x5
        public TJPlacement a(Context context, TJPlacementListener tJPlacementListener, Void r4) {
            return TJPlacementManager.createPlacement(context, "InsufficientCurrency", true, tJPlacementListener);
        }

        @Override // com.tapjoy.internal.x5
        public String b(Void r1) {
            return "InsufficientCurrency";
        }
    }
}
