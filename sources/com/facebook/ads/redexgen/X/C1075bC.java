package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1075bC implements LP {
    @Override // com.facebook.ads.redexgen.X.LP
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow() != null ? activity.getWindow().getCallback() : null;
        if (callback != null) {
            LK lk = new LK(callback, activity);
            LK.A00(new C1076bD(this));
            activity.getWindow().setCallback(lk);
        }
    }
}
