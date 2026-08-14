package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<AppLovinAdImpl> f1218a = new LinkedList();
    private final Object b = new Object();

    aa() {
    }

    int a() {
        int size;
        synchronized (this.b) {
            size = this.f1218a.size();
        }
        return size;
    }

    boolean b() {
        boolean z;
        synchronized (this.b) {
            z = a() == 0;
        }
        return z;
    }

    void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            if (a() <= 25) {
                this.f1218a.offer(appLovinAdImpl);
            } else {
                y.i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    AppLovinAdImpl c() {
        AppLovinAdImpl appLovinAdImplPoll;
        synchronized (this.b) {
            appLovinAdImplPoll = !b() ? this.f1218a.poll() : null;
        }
        return appLovinAdImplPoll;
    }

    AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImplPeek;
        synchronized (this.b) {
            appLovinAdImplPeek = this.f1218a.peek();
        }
        return appLovinAdImplPeek;
    }
}
