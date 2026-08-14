package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class C1260eN {
    public final Map<View, C1267eU> A00 = new WeakHashMap();

    public final synchronized C1267eU A00(View view) {
        C1267eU c1267eU = this.A00.get(view);
        if (c1267eU != null) {
            return c1267eU;
        }
        return C1267eU.A06;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1267eU c1267eU) {
        this.A00.put(view, c1267eU);
    }

    public final synchronized void A03(Collection<View> collection) {
        Iterator<View> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
