package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0857Uj implements IN {
    @Override // com.facebook.ads.redexgen.X.IN
    public final IX A4J(Looper looper, @Nullable Handler.Callback callback) {
        return new C0856Ui(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.IN
    public final long A58() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.IN
    public final long AFM() {
        return SystemClock.uptimeMillis();
    }
}
