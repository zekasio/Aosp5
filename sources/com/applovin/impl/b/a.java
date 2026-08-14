package com.applovin.impl.b;

import android.content.Context;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.y;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0051a f847a = new C0051a("Age Restricted User", d.o);
    private static final C0051a b = new C0051a("Has User Consent", d.n);
    private static final C0051a c = new C0051a("\"Do Not Sell\"", d.p);

    public static C0051a a() {
        return f847a;
    }

    public static C0051a b() {
        return b;
    }

    public static C0051a c() {
        return c;
    }

    public static boolean a(boolean z, Context context) {
        return a(d.o, Boolean.valueOf(z), context);
    }

    public static boolean b(boolean z, Context context) {
        return a(d.n, Boolean.valueOf(z), context);
    }

    public static boolean c(boolean z, Context context) {
        return a(d.p, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(f847a, context) + a(b, context) + a(c, context);
    }

    private static boolean a(d<Boolean> dVar, Boolean bool, Context context) {
        if (context == null) {
            y.i("AppLovinSdk", "Failed to update compliance value for key: " + dVar);
            return false;
        }
        Boolean bool2 = (Boolean) e.b(dVar, (Object) null, context);
        e.a(dVar, bool, context);
        return bool2 == null || bool2 != bool;
    }

    private static String a(C0051a c0051a, Context context) {
        return "\n" + c0051a.f848a + " - " + c0051a.b(context);
    }

    /* JADX INFO: renamed from: com.applovin.impl.b.a$a, reason: collision with other inner class name */
    public static class C0051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f848a;
        private final d<Boolean> b;

        C0051a(String str, d<Boolean> dVar) {
            this.f848a = str;
            this.b = dVar;
        }

        public String a() {
            return this.f848a;
        }

        public Boolean a(Context context) {
            if (context == null) {
                y.i("AppLovinSdk", "Failed to get value for key: " + this.b);
                return null;
            }
            return (Boolean) e.b(this.b, (Object) null, context);
        }

        public String b(Context context) {
            Boolean boolA = a(context);
            return boolA != null ? boolA.toString() : "No value set";
        }
    }
}
