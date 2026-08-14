package com.tapjoy.internal;

import android.app.Activity;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Activity f1885a;
    public static final m1<GLSurfaceView> b = new m1<>();
    public static final m1<Thread> c = new m1<>();
    public static final o0 d = new a();

    public static class a implements o0 {
        @Override // com.tapjoy.internal.o0
        public boolean a(Runnable runnable) {
            GLSurfaceView gLSurfaceViewA = p6.b.a();
            if (gLSurfaceViewA == null) {
                return false;
            }
            gLSurfaceViewA.queueEvent(runnable);
            return true;
        }
    }

    public static Activity a() {
        Activity activity = f1885a;
        if (activity != null) {
            return activity;
        }
        Activity activityA = b.e.a();
        return activityA == null ? b.a() : activityA;
    }
}
