package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0385Bf extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ X9 A01;

    public C0385Bf(X9 x9, AudioTrack audioTrack) {
        this.A01 = x9;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                this.A01.A0f.open();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
