package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementManager;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.internal.k7;
import com.tapjoy.internal.x5;
import java.util.Observer;

/* JADX INFO: loaded from: classes2.dex */
public class u5 extends k7 {
    public final x5<k7.a> c = new a(this);

    static {
        k7.a(new u5());
    }

    public static void b() {
    }

    @Override // com.tapjoy.internal.k7
    public boolean a() {
        return this.c.f1942a != null;
    }

    public class a extends x5<k7.a> {
        public a(u5 u5Var) {
        }

        @Override // com.tapjoy.internal.x5
        public x5<k7.a>.a a(k7.a aVar) {
            k7.a aVar2 = aVar;
            return new x5.a(aVar2, aVar2.c);
        }

        @Override // com.tapjoy.internal.x5
        public boolean a() {
            return true;
        }

        @Override // com.tapjoy.internal.x5
        public String b(k7.a aVar) {
            k7.a aVar2 = aVar;
            if (aVar2 != null) {
                return aVar2.b;
            }
            return null;
        }

        @Override // com.tapjoy.internal.x5
        public TJPlacement a(Context context, TJPlacementListener tJPlacementListener, k7.a aVar) {
            k7.a aVar2 = aVar;
            TJPlacement tJPlacementCreatePlacement = TJPlacementManager.createPlacement(TapjoyConnectCore.getContext(), aVar2.b, false, tJPlacementListener);
            tJPlacementCreatePlacement.pushId = aVar2.f1839a;
            return tJPlacementCreatePlacement;
        }

        @Override // com.tapjoy.internal.x5
        public boolean a(Observer observer) {
            if (TapjoyConnectCore.isViewOpen()) {
                TJPlacementManager.dismissContentShowing(true);
            }
            return super.a(observer);
        }
    }
}
