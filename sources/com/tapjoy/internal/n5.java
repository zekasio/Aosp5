package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class n5 {
    public static final n5 d = new n5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f1864a;
    public Application.ActivityLifecycleCallbacks b;
    public final HashSet<String> c = new HashSet<>();

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        d.a(context.getApplicationContext());
    }

    public static void c() {
        d.a();
    }

    public final void a(Context context) {
        if (this.f1864a == null) {
            try {
                if (context instanceof Application) {
                    this.f1864a = (Application) context;
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    TapjoyUtil.runOnMainThread(new l5(this, countDownLatch));
                    countDownLatch.await();
                }
            } catch (Exception e) {
                TapjoyLog.w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
            }
            if (this.f1864a == null) {
                return;
            }
        }
        synchronized (this) {
            if (this.b == null) {
                Activity activityA = b.a();
                if (activityA != null) {
                    this.c.add(a(activityA));
                }
                m5 m5Var = new m5(this, this.c);
                this.b = m5Var;
                this.f1864a.registerActivityLifecycleCallbacks(m5Var);
                a.d();
            }
        }
    }

    public static /* synthetic */ Application b() {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
    }

    public final void a() {
        if (this.f1864a == null) {
            return;
        }
        synchronized (this) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
            if (activityLifecycleCallbacks != null) {
                this.f1864a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                this.b = null;
            }
        }
    }

    public static String a(Activity activity) {
        return activity.getClass().getName() + "@" + System.identityHashCode(activity);
    }
}
