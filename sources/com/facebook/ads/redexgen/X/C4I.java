package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4I extends Observable<C4J> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C4J) this.mObservers.get(size)).A00();
        }
    }
}
