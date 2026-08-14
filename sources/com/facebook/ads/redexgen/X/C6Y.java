package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Y {

    @Nullable
    public static OrientationEventListener A02;
    public final C6W A00;
    public final EnumC02896z A01;

    public C6Y(C6W c6w, EnumC02896z enumC02896z) {
        this.A00 = c6w;
        this.A01 = enumC02896z;
    }

    public final synchronized void A01() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A02(final Context context) {
        final AnonymousClass78 anonymousClass78;
        if (A02 != null) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context == null ? "" : context.getPackageName();
        if (this.A01 == EnumC02896z.A0G) {
            anonymousClass78 = null;
        } else {
            anonymousClass78 = new AnonymousClass78(packageName);
        }
        final int i = 3;
        A02 = new OrientationEventListener(context, i) { // from class: com.facebook.ads.redexgen.X.6X
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i2) {
                this.A01.A00.A02(new YA(jElapsedRealtime, anonymousClass78, i2), C6V.A0A);
            }
        };
        A02.enable();
    }
}
