package com.applovin.impl.sdk.e;

/* JADX INFO: loaded from: classes.dex */
public class z extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f1324a;

    public z(com.applovin.impl.sdk.p pVar, Runnable runnable) {
        this(pVar, false, runnable);
    }

    public z(com.applovin.impl.sdk.p pVar, boolean z, Runnable runnable) {
        super("TaskRunnable", pVar, z);
        this.f1324a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1324a.run();
    }
}
