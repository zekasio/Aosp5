package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9 {
    public final CopyOnWriteArrayList<C8> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        for (C8 handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new C4(this, handlerAndListener.A01));
        }
    }

    public final void A01() {
        for (C8 handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new C7(this, handlerAndListener.A01));
        }
    }

    public final void A02() {
        for (C8 handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new C6(this, handlerAndListener.A01));
        }
    }

    public final void A03(Handler handler, CA ca) {
        IK.A03((handler == null || ca == null) ? false : true);
        this.A00.add(new C8(handler, ca));
    }

    public final void A04(Exception exc) {
        for (C8 c8 : this.A00) {
            c8.A00.post(new C5(this, c8.A01, exc));
        }
    }
}
