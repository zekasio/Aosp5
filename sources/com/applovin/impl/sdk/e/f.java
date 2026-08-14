package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.d;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f1287a;

    public interface a {
        void a(d.a aVar);
    }

    public f(com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskCollectAdvertisingId", pVar, true);
        this.f1287a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1287a.a(this.f.R().k());
    }
}
