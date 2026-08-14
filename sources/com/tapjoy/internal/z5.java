package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class z5 {
    public static final z5 c;
    public static z5 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f1960a = new w5();
    public Context b;

    static {
        z5 z5Var = new z5();
        c = z5Var;
        d = z5Var;
    }

    public static w5 b() {
        return d.f1960a;
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void a(Context context) {
        if (context != null) {
            if (this.b == null) {
                this.b = context;
                SharedPreferences sharedPreferencesA = a();
                String string = a().getString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, null);
                if (string != null) {
                    try {
                        z0 z0VarB = z0.b(string);
                        try {
                            Map<String, Object> mapD = z0VarB.d();
                            ((a1) z0VarB).close();
                            this.f1960a.a((Map) mapD);
                        } catch (Throwable th) {
                            ((a1) z0VarB).close();
                            throw th;
                        }
                    } catch (Exception unused) {
                        sharedPreferencesA.edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                    }
                }
            }
        }
    }

    public final SharedPreferences a() {
        return this.b.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
    }

    public void a(Object obj) {
        if (obj instanceof Map) {
            try {
                this.f1960a.a((Map) obj);
                a().edit().putString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, t0.a(obj)).apply();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (obj == null) {
            this.f1960a.a((Map) null);
            a().edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
        }
    }
}
