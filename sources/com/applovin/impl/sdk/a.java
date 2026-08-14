package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.impl.sdk.utils.a> f1193a = Collections.synchronizedList(new ArrayList());
    private WeakReference<Activity> b;
    private WeakReference<Activity> c;

    public a(Context context) {
        this.b = new WeakReference<>(null);
        this.c = new WeakReference<>(null);
        y.f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.c = this.b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.b.get();
    }

    public Activity b() {
        return this.c.get();
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.f1193a.add(aVar);
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.f1193a.remove(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.b = weakReference;
        this.c = weakReference;
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.c = new WeakReference<>(null);
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStopped(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f1193a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityDestroyed(activity);
        }
    }
}
