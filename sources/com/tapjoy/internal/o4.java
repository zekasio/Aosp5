package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o4 {
    public static final o4 c;
    public static o4 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f1871a = false;
    public volatile boolean b = false;

    static {
        u5.b();
        q5.a();
        q4 q4Var = new q4();
        c = q4Var;
        d = q4Var;
    }

    public abstract TJPlacement a(String str, TJPlacementListener tJPlacementListener);

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(int i, String str);

    public abstract void a(Activity activity);

    public abstract void a(Context context);

    public abstract void a(Context context, String str);

    public abstract void a(Context context, Map<String, String> map);

    public abstract void a(Context context, boolean z);

    public abstract void a(GLSurfaceView gLSurfaceView);

    public abstract void a(String str);

    public abstract void a(String str, long j);

    public abstract void a(String str, String str2);

    public abstract void a(String str, String str2, double d2, String str3);

    public abstract void a(String str, String str2, long j);

    public abstract void a(String str, String str2, String str3, String str4);

    public abstract void a(String str, String str2, String str3, String str4, long j);

    public abstract void a(String str, String str2, String str3, String str4, String str5, long j);

    public abstract void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2);

    public abstract void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3);

    public abstract void a(String str, String str2, String str3, String str4, Map<String, Long> map);

    public abstract void a(Set<String> set);

    public abstract void a(boolean z);

    public abstract boolean a(Context context, String str, TJConnectListener tJConnectListener);

    public abstract boolean a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    public abstract TJPlacement b(String str, TJPlacementListener tJPlacementListener);

    public abstract String b();

    public abstract void b(int i);

    public abstract void b(Activity activity);

    public abstract void b(String str);

    public abstract void b(String str, String str2, String str3, String str4);

    public abstract void b(boolean z);

    public abstract TJPrivacyPolicy c();

    public abstract void c(Activity activity);

    public abstract void c(String str);

    public abstract Set<String> d();

    public abstract void d(String str);

    public abstract String e();

    public abstract void e(String str);

    public abstract String f();

    public abstract boolean g();
}
