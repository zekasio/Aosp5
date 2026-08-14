package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.loopj.android.http.AsyncHttpClient;
import com.tapjoy.internal.b5;
import com.tapjoy.internal.f5;
import com.tapjoy.internal.i5;
import com.tapjoy.internal.v4;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class c7 {
    public static final String f = UUID.randomUUID().toString();
    public static c7 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.a f1774a;
    public final v4.a b;
    public final i5.a c;
    public final Context d;
    public final j7 e;

    /* JADX WARN: Removed duplicated region for block: B:89:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c7(android.content.Context r11, com.tapjoy.internal.j7 r12) {
        /*
            Method dump skipped, instruction units count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.c7.<init>(android.content.Context, com.tapjoy.internal.j7):void");
    }

    public static synchronized c7 a(Context context) {
        if (g == null) {
            g = new c7(context, j7.a(context));
        }
        return g;
    }

    public String b() {
        String strB;
        synchronized (this) {
            strB = this.e.d.b();
        }
        return strB;
    }

    public boolean c(String str) {
        boolean z;
        synchronized (this) {
            j jVar = this.e.q;
            jVar.f1815a.edit().putString(jVar.b, str).apply();
            boolean zA = a.a((Object) this.c.s, (Object) str);
            z = !zA;
            if (!zA) {
                this.c.s = str;
            }
        }
        return z;
    }

    public boolean d() {
        Boolean bool = this.c.B;
        Boolean bool2 = i5.D;
        if (bool == null) {
            bool2.getClass();
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public void e() {
        Window window;
        synchronized (this) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                Activity activityA = p6.a();
                if (activityA != null && (window = activityA.getWindow()) != null) {
                    int i = displayMetrics.heightPixels;
                    Rect rect = new Rect();
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    displayMetrics.heightPixels = i - rect.top;
                }
                this.f1774a.i = Integer.valueOf(displayMetrics.densityDpi);
                this.f1774a.j = Integer.valueOf(displayMetrics.widthPixels);
                this.f1774a.k = Integer.valueOf(displayMetrics.heightPixels);
            } catch (Exception unused) {
            }
        }
    }

    public final void f() {
        this.e.g.a(Base64.encodeToString(g5.d.a(new g5(this.c.g, x8.e)), 2));
    }

    public d5 g() {
        d5 d5Var;
        synchronized (this) {
            Calendar calendar = Calendar.getInstance();
            int i = 1;
            int i2 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT) + 100;
            int iIntValue = this.e.e.c().intValue();
            if (iIntValue == i2) {
                return null;
            }
            if (iIntValue == 0) {
                this.c.e = 1;
                this.c.f = 1;
                d5Var = new d5("fq7_0_1", "fq30_0_1", null);
            } else {
                int iIntValue2 = this.e.f.c().intValue();
                int iA = a(7, iIntValue2);
                int iA2 = a(30, iIntValue2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(iIntValue / AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT, ((iIntValue / 100) % 100) - 1, iIntValue % 100);
                int iA3 = a.a(calendar, calendar2);
                i = 1 | (Math.abs(iA3) >= 30 ? 0 : iA3 >= 0 ? iIntValue2 << iA3 : iIntValue2 >> (-iA3));
                int iA4 = a(7, i);
                int iA5 = a(30, i);
                this.c.e = Integer.valueOf(iA4);
                this.c.f = Integer.valueOf(iA5);
                d5Var = new d5("fq7_" + iA + "_" + iA4, "fq30_" + iA2 + "_" + iA5, null);
            }
            this.e.e.a(i2);
            this.e.f.a(i);
            return d5Var;
        }
    }

    public void h() {
        synchronized (this) {
            int iB = this.e.h.b() + 1;
            this.e.h.a(iB);
            this.c.h = Integer.valueOf(iB);
        }
    }

    public void b(String str) {
        synchronized (this) {
            j jVar = this.e.d;
            jVar.f1815a.edit().putString(jVar.b, str).apply();
            this.c.d = str;
        }
    }

    public c5 a() {
        c5 c5Var;
        synchronized (this) {
            this.f1774a.l = Locale.getDefault().toString();
            this.f1774a.m = TimeZone.getDefault().getID();
            long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
            Iterator<f5> it = this.c.g.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().d.longValue() <= jCurrentTimeMillis) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                f();
            }
            c5Var = new c5(this.f1774a.b(), this.b.b(), this.c.b(), x8.e);
        }
        return c5Var;
    }

    public boolean b(Integer num) {
        boolean z;
        synchronized (this) {
            this.e.r.a(num);
            boolean zA = a.a(this.c.t, num);
            z = !zA;
            if (!zA) {
                this.c.t = num;
            }
        }
        return z;
    }

    public Set<String> c() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.c.A);
        }
        return hashSet;
    }

    public static int a(int i, int i2) {
        return Integer.bitCount(((1 << i) - 1) & i2);
    }

    public void a(long j) {
        synchronized (this) {
            long jB = this.e.i.b() + j;
            h hVar = this.e.i;
            hVar.f1815a.edit().putLong(hVar.b, jB).apply();
            this.c.i = Long.valueOf(jB);
        }
    }

    public void a(long j, long j2) {
        synchronized (this) {
            SharedPreferences.Editor editorA = this.e.a();
            editorA.putLong(this.e.j.b, j);
            editorA.putLong(this.e.k.b, j2);
            editorA.apply();
            this.c.j = Long.valueOf(j);
            this.c.k = Long.valueOf(j2);
        }
    }

    public void a(String str, double d) {
        synchronized (this) {
            SharedPreferences.Editor editorA = this.e.a();
            int iB = 1;
            if (str.equals(this.e.l.b())) {
                iB = 1 + this.e.m.b();
                editorA.putInt(this.e.m.b, iB);
                d += this.e.n.b();
                editorA.putString(this.e.n.b, Double.toString(d));
                editorA.apply();
            } else {
                editorA.putString(this.e.l.b, str);
                editorA.putInt(this.e.m.b, 1);
                editorA.putString(this.e.n.b, Double.toString(d));
                this.e.o.a(editorA, null);
                this.e.p.a(editorA, null);
                editorA.apply();
                this.c.l = str;
                this.c.o = null;
                this.c.p = null;
            }
            this.c.m = Integer.valueOf(iB);
            this.c.n = Double.valueOf(d);
        }
    }

    public void a(long j, double d) {
        synchronized (this) {
            SharedPreferences.Editor editorA = this.e.a();
            editorA.putLong(this.e.o.b, j);
            editorA.putString(this.e.p.b, Double.toString(d));
            editorA.apply();
            this.c.o = Long.valueOf(j);
            this.c.p = Double.valueOf(d);
        }
    }

    public boolean a(String str, long j, boolean z) {
        synchronized (this) {
            int size = this.c.g.size();
            for (int i = 0; i < size; i++) {
                f5 f5Var = this.c.g.get(i);
                if (f5Var.c.equals(str)) {
                    if (!z) {
                        return false;
                    }
                    f5.a aVarB = f5Var.b();
                    aVarB.d = Long.valueOf(j);
                    this.c.g.set(i, aVarB.b());
                    return true;
                }
            }
            this.c.g.add(new f5(str, Long.valueOf(j), null, x8.e));
            f();
            return true;
        }
    }

    public boolean a(Integer num) {
        boolean z;
        synchronized (this) {
            this.e.s.a(num);
            boolean zA = a.a(this.c.u, num);
            z = !zA;
            if (!zA) {
                this.c.u = num;
            }
        }
        return z;
    }

    public boolean a(int i, String str) {
        boolean z;
        boolean z2;
        synchronized (this) {
            if (i == 1) {
                j jVar = this.e.t;
                jVar.f1815a.edit().putString(jVar.b, str).apply();
                boolean zA = a.a((Object) this.c.v, (Object) str);
                z = !zA;
                if (!zA) {
                    this.c.v = str;
                }
            } else if (i == 2) {
                j jVar2 = this.e.u;
                jVar2.f1815a.edit().putString(jVar2.b, str).apply();
                boolean zA2 = a.a((Object) this.c.w, (Object) str);
                z = !zA2;
                if (!zA2) {
                    this.c.w = str;
                }
            } else if (i == 3) {
                j jVar3 = this.e.v;
                jVar3.f1815a.edit().putString(jVar3.b, str).apply();
                boolean zA3 = a.a((Object) this.c.x, (Object) str);
                z = !zA3;
                if (!zA3) {
                    this.c.x = str;
                }
            } else if (i == 4) {
                j jVar4 = this.e.w;
                jVar4.f1815a.edit().putString(jVar4.b, str).apply();
                boolean zA4 = a.a((Object) this.c.y, (Object) str);
                z = !zA4;
                if (!zA4) {
                    this.c.y = str;
                }
            } else if (i != 5) {
                z2 = false;
            } else {
                j jVar5 = this.e.x;
                jVar5.f1815a.edit().putString(jVar5.b, str).apply();
                boolean zA5 = a.a((Object) this.c.z, (Object) str);
                z = !zA5;
                if (!zA5) {
                    this.c.z = str;
                }
            }
            z2 = z;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036 A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0044, B:7:0x0036), top: B:13:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L36
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L36
            com.tapjoy.internal.b4<com.tapjoy.internal.h5> r0 = com.tapjoy.internal.h5.d     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.h5 r1 = new com.tapjoy.internal.h5     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.x8 r3 = com.tapjoy.internal.x8.e     // Catch: java.lang.Throwable -> L46
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L46
            byte[] r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L46
            r1 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.j7 r1 = r4.e     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.j r1 = r1.y     // Catch: java.lang.Throwable -> L46
            r1.a(r0)     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.i5$a r0 = r4.c     // Catch: java.lang.Throwable -> L46
            java.util.List<java.lang.String> r0 = r0.A     // Catch: java.lang.Throwable -> L46
            r0.clear()     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.i5$a r0 = r4.c     // Catch: java.lang.Throwable -> L46
            java.util.List<java.lang.String> r0 = r0.A     // Catch: java.lang.Throwable -> L46
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L46
            goto L44
        L36:
            com.tapjoy.internal.j7 r5 = r4.e     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.j r5 = r5.y     // Catch: java.lang.Throwable -> L46
            r5.a()     // Catch: java.lang.Throwable -> L46
            com.tapjoy.internal.i5$a r5 = r4.c     // Catch: java.lang.Throwable -> L46
            java.util.List<java.lang.String> r5 = r5.A     // Catch: java.lang.Throwable -> L46
            r5.clear()     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.c7.a(java.util.Set):void");
    }

    public boolean a(boolean z) {
        boolean z2;
        synchronized (this) {
            e eVar = this.e.B;
            eVar.f1815a.edit().putBoolean(eVar.b, z).apply();
            Boolean bool = this.c.B;
            Boolean bool2 = i5.D;
            if (bool == null) {
                if (bool2 == null) {
                    throw new NullPointerException();
                }
                bool = bool2;
            }
            z2 = z != bool.booleanValue();
            this.c.B = Boolean.valueOf(z);
        }
        return z2;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.e.C.b())) {
            return;
        }
        j jVar = this.e.C;
        jVar.f1815a.edit().putString(jVar.b, str).apply();
        this.e.a(false);
    }
}
