package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0878Ve implements F4 {
    public static String[] A06 = {"0vmpU1QtAhI6qjIdcVId", "klBv", "qKjW3ego541fEYihs", "NuBFx4EY8fIgWeMvZ", "vAKBh2R", "FoB4J1nu", "9b5WU1uKCw6g3SYcMdOb", "twQXN8Z"};
    public final C0526Hi A00;
    public final I4 A01;
    public final C0864Uq A02;
    public final C0555In A04;
    public final I9 A03 = new I9();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C0878Ve(Uri uri, String str, F5 f5) {
        this.A00 = new C0526Hi(uri, 0L, -1L, str, 0);
        this.A01 = f5.A00();
        this.A02 = f5.A01(false);
        this.A04 = f5.A02();
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void A4t() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            IA.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
            C0555In c0555In = this.A04;
            String[] strArr = A06;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "qX3fQQGAY3dTsBjdyBPn";
            strArr2[6] = "Z0TFAaYyqvVnxMY9deNw";
            c0555In.A03(-1000);
        } catch (Throwable th) {
            this.A04.A03(-1000);
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final float A6P() {
        long j = this.A03.A01;
        if (j == -1) {
            return -1.0f;
        }
        return (this.A03.A00() * 100.0f) / j;
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final long A6Q() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.F4
    public final void remove() {
        IA.A05(this.A01, IA.A02(this.A00));
    }
}
