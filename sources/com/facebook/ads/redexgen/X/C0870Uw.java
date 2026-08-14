package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0870Uw implements InterfaceC0539Hx {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC0533Hr<? extends InterfaceC0534Hs> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C0870Uw(String str) {
        this.A02 = C0567Iz.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    public final <T extends InterfaceC0534Hs> long A04(T loadable, InterfaceC0532Hq<T> interfaceC0532Hq, int i) {
        Looper looperMyLooper = Looper.myLooper();
        IK.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0533Hr(this, looperMyLooper, loadable, interfaceC0532Hq, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0533Hr<? extends InterfaceC0534Hs> handlerC0533Hr = this.A00;
            if (handlerC0533Hr != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i == Integer.MIN_VALUE) {
                        i = handlerC0533Hr.A03;
                    }
                    handlerC0533Hr.A05(i);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0535Ht interfaceC0535Ht) {
        HandlerC0533Hr<? extends InterfaceC0534Hs> handlerC0533Hr = this.A00;
        if (handlerC0533Hr != null) {
            handlerC0533Hr.A07(true);
        }
        if (interfaceC0535Ht != null) {
            this.A02.execute(new RunnableC0536Hu(interfaceC0535Ht));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
