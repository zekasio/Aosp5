package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tapjoy.internal.i5;
import com.tapjoy.internal.w4;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public class z6 {
    public static final z6 q;
    public static z6 r;
    public static Handler s;
    public static File t;
    public i7 b;
    public Context e;
    public c7 f;
    public x6 g;
    public m7 h;
    public w6 i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public String o;
    public boolean c = false;
    public String d = null;
    public boolean n = false;
    public a7 p = a7.a((m6) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7 f1961a = new h7(this);

    static {
        z6 z6Var = new z6();
        q = z6Var;
        r = z6Var;
    }

    public static z6 d(Context context) {
        z6 z6Var = r;
        z6Var.a(context);
        return z6Var;
    }

    public void a(boolean z) {
        if (a.b != z) {
            a.b = z;
            if (z) {
                a.e("The debug mode has been enabled");
            } else {
                a.e("The debug mode has been disabled");
            }
            if (z && this.k) {
                this.i.a();
            }
        }
    }

    public final boolean b(String str) {
        if ((this.k || this.j != null) && this.e != null) {
            return true;
        }
        if (!a.b) {
            return false;
        }
        a.d(str + ": Should be called after initializing the SDK");
        return false;
    }

    public synchronized void c(String str) {
        String str2;
        if (this.k) {
            if (str == null && (str2 = this.o) != null) {
                str = str2;
            }
            this.o = null;
            if (str != null) {
                c5 c5VarA = this.f.a();
                a.b("GCM registration id of device %s updated: %s", c5VarA.c.d, str);
                new m8(c5VarA, str).a(new y6(this, str), n1.b);
            }
        } else if (str != null) {
            this.o = str;
        }
    }

    public boolean e() {
        m7 m7Var = this.h;
        return m7Var != null && m7Var.b.get();
    }

    public boolean d() {
        if (!a("isPushNotificationDisabled")) {
            return false;
        }
        boolean zD = this.f.d();
        a.b("isPushNotificationDisabled = %b", Boolean.valueOf(zD));
        return zD;
    }

    public void b(Activity activity) {
        if (a.m327b((Object) activity, "onActivityStop: The given activity was null")) {
            a.c("onActivityStop");
            b.b--;
            b.c.f1848a = null;
            b.d.remove(activity);
            if (b.b < 0) {
                b.b = 0;
            }
            if (b("onActivityStop") && b.b <= 0) {
                this.h.a();
            }
        }
    }

    public void a(Context context, String str) {
        if (str != null) {
            z6 z6Var = r;
            z6Var.a(context);
            if (TextUtils.isEmpty(z6Var.f.b())) {
                z6Var.f.b(str);
                if (str.length() > 0) {
                    z6Var.g.b();
                }
            }
        }
    }

    public Set<String> c() {
        if (!a("getUserTags")) {
            return new HashSet();
        }
        return this.f.c();
    }

    public synchronized void a(Context context) {
        if (this.e == null) {
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            z5.d.a(applicationContext);
            this.f = c7.a(applicationContext);
            File file = new File(b(applicationContext), "events2");
            if (this.i == null) {
                this.i = new w6(file);
            }
            x6 x6Var = new x6(this.f, this.i);
            this.g = x6Var;
            this.h = new m7(x6Var);
            this.b = new i7(applicationContext);
            u7.f.a(applicationContext);
        }
    }

    public static File c(Context context) {
        return new File(b(context), "install");
    }

    public a7 b() {
        return this.p;
    }

    public static synchronized File b(Context context) {
        if (t == null) {
            t = context.getDir("fiverocks", 0);
        }
        return t;
    }

    public void b(boolean z) {
        this.n = z;
    }

    public void a(String str, boolean z) {
        c7 c7Var = this.f;
        String strB = c7Var.e.z.b();
        i5.a aVar = c7Var.c;
        aVar.q = str;
        aVar.r = Boolean.valueOf(z);
        j jVar = c7Var.e.z;
        jVar.f1815a.edit().putString(jVar.b, str).apply();
        c7Var.e.A.a(z);
        n7.d = str;
        n7.e = z;
        n7.f.countDown();
        if (TextUtils.isEmpty(strB) || str.equals(strB)) {
            return;
        }
        c7Var.e.a(false);
    }

    public boolean a(Context context, String str, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        a(context);
        if (!this.f.a(str, jCurrentTimeMillis, z)) {
            return false;
        }
        this.g.b(str);
        return true;
    }

    public void a(GLSurfaceView gLSurfaceView) {
        if (a.m327b((Object) gLSurfaceView, "setGLSurfaceView: The given GLSurfaceView was null")) {
            p6.b.a(gLSurfaceView);
            gLSurfaceView.queueEvent(new q6());
        }
    }

    public void a(Set<String> set) {
        if (a("setUserTags")) {
            if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (str != null) {
                        String strTrim = str.trim();
                        if (!strTrim.isEmpty() && strTrim.length() <= 200) {
                            hashSet.add(strTrim);
                            if (hashSet.size() >= 200) {
                                break;
                            }
                        }
                    }
                }
                set = hashSet;
            }
            this.f.a(set);
        }
    }

    public synchronized void a(Context context, String str, String str2, String str3, String str4, String str5) {
        if (this.k) {
            return;
        }
        a(context);
        if (a.b(this.e != null, "The given context was null")) {
            if (str4 == null || str4.length() != 24 || !str4.matches("[0-9a-f]{24}")) {
                a.a("Invalid App ID: %s", str4);
                return;
            }
            if (str5 == null || str5.length() != 20 || !str5.matches("[0-9A-Za-z\\-_]{20}")) {
                a.a("Invalid App Key: %s", str5);
                return;
            }
            this.l = str;
            this.m = str2;
            try {
                r1 r1Var = new r1("TapjoySDK " + str2 + " (" + Build.MODEL + "; Android " + Build.VERSION.RELEASE + "; " + Locale.getDefault() + ")", new URL(str3));
                n1.c = r1Var;
                n1.b = Executors.newCachedThreadPool();
                w6 w6Var = this.i;
                w6Var.d = r1Var;
                w6Var.a();
                this.k = true;
                d7 d7Var = new d7(c(this.e));
                if (d7Var.b() == null && d7Var.a()) {
                    this.g.a();
                }
                this.f.a(str4);
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public final boolean a(String str) {
        if (this.e != null) {
            return true;
        }
        if (!a.b) {
            return false;
        }
        a.d(str + ": Should be called after initializing the SDK");
        return false;
    }

    public void a(Activity activity) {
        s6 s6Var;
        if (a.m327b((Object) activity, "onActivityStart: The given activity was null")) {
            a.c("onActivityStart");
            b.a(activity.getApplication());
            b.b++;
            b.c.a(activity);
            b.d.add(activity);
            if (b("onActivityStart") && a() && (s6Var = s6.f1907a) != null) {
                s6Var.a(activity);
            }
        }
    }

    public final boolean a() {
        m7 m7Var = this.h;
        ScheduledFuture<?> scheduledFuture = m7Var.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            m7Var.d = null;
        }
        if (!m7Var.b.compareAndSet(false, true)) {
            return false;
        }
        a.e("New session started");
        x6 x6Var = m7Var.f1853a;
        d5 d5VarG = x6Var.f1944a.g();
        x6Var.f1944a.h();
        w4.a aVarA = x6Var.a(z4.APP, "bootup");
        x6Var.e = SystemClock.elapsedRealtime();
        if (d5VarG != null) {
            aVarA.s = d5VarG;
        }
        x6Var.a(aVarA);
        s5.c.notifyObservers();
        this.f1961a.a();
        u7 u7Var = u7.f;
        u7Var.e.submit(new s7(u7Var));
        return true;
    }

    public void a(Map<String, Object> map, long j) {
        this.g.a(map, j);
    }

    public void a(m6 m6Var) {
        this.p = a7.a(m6Var);
    }

    public static synchronized void a(Runnable runnable) {
        if (s == null) {
            s = new Handler(Looper.getMainLooper());
        }
        s.post(runnable);
    }
}
