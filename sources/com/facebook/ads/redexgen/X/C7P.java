package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C7P implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C7U A01;

    public C7P(C7U c7u, C7Q c7q) {
        this.A01 = c7u;
        new Handler(Looper.getMainLooper()).post(new Y0(this, c7u, c7q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C7Q c7q) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0755Qk c0755QkA05 = C0755Qk.A05(this.A01.A04.A00());
        Uri uriA00 = C0617La.A00(c7q.A08);
        long jA0M = c7q.A00;
        if (jA0M == -1) {
            jA0M = JR.A0M(this.A01.A04);
        }
        c0755QkA05.A0G(uriA00, new C0948Xz(this, c7q, jA0M, jCurrentTimeMillis), jA0M);
    }
}
