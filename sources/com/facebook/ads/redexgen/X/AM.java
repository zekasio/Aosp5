package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AM extends Exception {
    public final int A00;
    public final int A01;

    public AM(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static AM A00(IOException iOException) {
        return new AM(0, null, iOException, -1);
    }

    public static AM A01(Exception exc, int i) {
        return new AM(1, null, exc, i);
    }

    public static AM A02(RuntimeException runtimeException) {
        return new AM(2, null, runtimeException, -1);
    }
}
