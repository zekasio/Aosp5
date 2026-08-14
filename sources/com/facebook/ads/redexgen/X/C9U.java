package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9U {
    public static C9U A00 = new C9U();

    @VisibleForTesting
    public C9U() {
    }

    public static C9U A00() {
        return A00;
    }

    @SuppressLint({"InstanceMethodCanBeStatic"})
    public final C9T A01(C8U c8u, boolean z) {
        return new XT(c8u, z, new AnonymousClass66());
    }

    @SuppressLint({"CatchGeneralException"})
    public final Map<String, String> A02(C8U c8u) {
        try {
            return A01(c8u, false).A6W();
        } catch (Throwable th) {
            c8u.A06().A3R(th);
            return C9Q.A01(c8u);
        }
    }
}
