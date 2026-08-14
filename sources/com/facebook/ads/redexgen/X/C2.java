package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HandlerLeak"})
public class C2 extends Handler {
    public final /* synthetic */ C0922Wz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    public C2(C0922Wz c0922Wz, Looper looper) {
        super(looper);
        this.A00 = c0922Wz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C2 != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                this.A00.A0A(obj, obj2);
                return;
            }
            this.A00.A0B(obj, obj2);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
