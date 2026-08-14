package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0530Ho extends IOException {
    public final int A00;
    public final C0526Hi A01;

    public C0530Ho(IOException iOException, C0526Hi c0526Hi, int i) {
        super(iOException);
        this.A01 = c0526Hi;
        this.A00 = i;
    }

    public C0530Ho(String str, C0526Hi c0526Hi, int i) {
        super(str);
        this.A01 = c0526Hi;
        this.A00 = i;
    }

    public C0530Ho(String str, IOException iOException, C0526Hi c0526Hi, int i) {
        super(str, iOException);
        this.A01 = c0526Hi;
        this.A00 = i;
    }
}
