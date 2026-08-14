package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f1756a;
    public static int b;
    public static final m1<Activity> c = new m1<>();
    public static final Set<Activity> d = Collections.synchronizedSet(new m0());
    public static final m1<Activity> e = new m1<>();

    public static Activity a() {
        Activity activityA = c.a();
        if (activityA != null) {
            return activityA;
        }
        Set<Activity> set = d;
        synchronized (set) {
            if (!set.iterator().hasNext()) {
                return null;
            }
            return set.iterator().next();
        }
    }

    public static synchronized void a(Application application) {
        if (f1756a != application) {
            f1756a = application;
        }
    }
}
