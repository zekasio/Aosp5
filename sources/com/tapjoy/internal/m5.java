package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class m5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f1852a;

    public m5(n5 n5Var, HashSet hashSet) {
        this.f1852a = hashSet;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f1852a.add(n5.a(activity));
        if (this.f1852a.size() == 1) {
            a.d();
        }
        b.c.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f1852a.remove(n5.a(activity));
        if (this.f1852a.size() <= 0) {
            a.a();
        }
    }
}
