package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AP extends Handler {
    public final /* synthetic */ E3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AP(E3 e3, Looper looper) {
        super(looper);
        this.A00 = e3;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0A(message);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
