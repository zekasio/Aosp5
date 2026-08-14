package com.tapjoy.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class w2 implements Application.ActivityLifecycleCallbacks {
    public static w2 d = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1934a;
    public boolean b;
    public a c;

    public interface a {
    }

    public final void a() {
        boolean z = this.b;
        Iterator it = Collections.unmodifiableCollection(v2.c.f1928a).iterator();
        while (it.hasNext()) {
            k3 k3Var = ((q2) it.next()).e;
            if (k3Var.f1834a.get() != null) {
                a3.f1744a.a(k3Var.e(), "setState", !z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (this.f1934a) {
                a();
                a aVar = this.c;
                if (aVar != null) {
                    ((b3) aVar).a(!z);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewC;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance != 100;
        boolean z2 = true;
        for (q2 q2Var : Collections.unmodifiableCollection(v2.c.b)) {
            if (q2Var.d() && (viewC = q2Var.c()) != null && viewC.hasWindowFocus()) {
                z2 = false;
            }
        }
        a(z && z2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
