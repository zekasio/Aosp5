package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HandlerLeak"})
public class CC extends Handler {
    public final /* synthetic */ C0921Wy A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public CC(C0921Wy c0921Wy, Looper looper) {
        super(looper);
        this.A00 = c0921Wy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            for (C0922Wz c0922Wz : this.A00.A09) {
                if (c0922Wz.A0N(bArr)) {
                    c0922Wz.A0J(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
