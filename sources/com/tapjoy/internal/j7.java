package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes2.dex */
public class j7 {
    public final e A;
    public final e B;
    public final j C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1828a;
    public final SharedPreferences b;
    public final j c;
    public final j d;
    public final g e;
    public final g f;
    public final j g;
    public final g h;
    public final h i;
    public final h j;
    public final h k;
    public final j l;
    public final g m;
    public final f n;
    public final h o;
    public final f p;
    public final j q;
    public final g r;
    public final g s;
    public final j t;
    public final j u;
    public final j v;
    public final j w;
    public final j x;
    public final j y;
    public final j z;

    public j7(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1828a = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("fiverocks", 0);
        this.b = sharedPreferences;
        this.c = new j(sharedPreferences, TapjoyConstants.TJC_SDK_PLACEMENT, null);
        this.d = new j(sharedPreferences, "ir", null);
        this.e = new g(sharedPreferences, "fql", 0);
        this.f = new g(sharedPreferences, "fq", 0);
        this.g = new j(sharedPreferences, "push", null);
        this.h = new g(sharedPreferences, "ss", 0);
        this.i = new h(sharedPreferences, "std", 0L);
        this.j = new h(sharedPreferences, "slt", 0L);
        this.k = new h(sharedPreferences, "sld", 0L);
        this.l = new j(sharedPreferences, "ptc", null);
        this.m = new g(sharedPreferences, "pc", 0);
        this.n = new f(sharedPreferences, "ptp", 0.0d);
        this.o = new h(sharedPreferences, "lpt", 0L);
        this.p = new f(sharedPreferences, "plp", 0.0d);
        this.q = new j(sharedPreferences, "ui", null);
        this.r = new g(sharedPreferences, "ul", -1);
        this.s = new g(sharedPreferences, "uf", -1);
        this.t = new j(sharedPreferences, TapjoyConstants.TJC_USER_VARIABLE_1, null);
        this.u = new j(sharedPreferences, TapjoyConstants.TJC_USER_VARIABLE_2, null);
        this.v = new j(sharedPreferences, TapjoyConstants.TJC_USER_VARIABLE_3, null);
        this.w = new j(sharedPreferences, TapjoyConstants.TJC_USER_VARIABLE_4, null);
        this.x = new j(sharedPreferences, TapjoyConstants.TJC_USER_VARIABLE_5, null);
        this.y = new j(sharedPreferences, "utags", null);
        this.z = new j(sharedPreferences, "idfa", null);
        this.A = new e(sharedPreferences, "idfa.optout", false);
        this.B = new e(sharedPreferences, "push.optout", false);
        this.C = new j(sharedPreferences, "appId", null);
    }

    public static j7 a(Context context) {
        return new j7(context);
    }

    public SharedPreferences.Editor a() {
        return this.b.edit();
    }

    public void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putBoolean("gcm.onServer", z);
        editorEdit.apply();
    }
}
