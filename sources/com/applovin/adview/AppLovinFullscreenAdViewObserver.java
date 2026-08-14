package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f10a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private a c;
    private com.applovin.impl.adview.p d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, com.applovin.impl.adview.p pVar, p pVar2) {
        this.d = pVar;
        this.f10a = pVar2;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.g();
            this.c.e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        a aVar;
        if (this.b.getAndSet(false) || (aVar = this.c) == null) {
            return;
        }
        aVar.f();
        this.c.a(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.j();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        com.applovin.impl.adview.p pVar = this.d;
        if (pVar != null) {
            pVar.a();
            this.d = null;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.h();
            this.c.k();
            this.c = null;
        }
    }

    public void setPresenter(a aVar) {
        this.c = aVar;
    }
}
