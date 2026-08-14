package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.tapjoy.internal.d3;
import com.tapjoy.internal.p3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o3 implements d3.a {
    public static o3 g = new o3();
    public static Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final Runnable j = new a();
    public static final Runnable k = new b();
    public int b;
    public long f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d> f1870a = new ArrayList();
    public p3 d = new p3();
    public e3 c = new e3();
    public w3 e = new w3(new s3());

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            o3 o3Var = o3.g;
            o3Var.b = 0;
            o3Var.f = System.nanoTime();
            o3Var.d.c();
            long jNanoTime = System.nanoTime();
            f3 f3Var = o3Var.c.b;
            if (o3Var.d.b().size() > 0) {
                for (String str : o3Var.d.b()) {
                    JSONObject jSONObjectA = f3Var.a(null);
                    View view = o3Var.d.c.get(str);
                    g3 g3Var = o3Var.c.f1787a;
                    String str2 = o3Var.d.g.get(str);
                    if (str2 != null) {
                        JSONObject jSONObjectA2 = g3Var.a(view);
                        h3.a(jSONObjectA2, str);
                        try {
                            jSONObjectA2.put("notVisibleReason", str2);
                        } catch (JSONException e) {
                            com.tapjoy.internal.a.a("Error with setting not visible reason", (Exception) e);
                        }
                        h3.a(jSONObjectA, jSONObjectA2);
                    }
                    h3.a(jSONObjectA);
                    HashSet hashSet = new HashSet();
                    hashSet.add(str);
                    w3 w3Var = o3Var.e;
                    w3Var.b.a(new u3(w3Var, hashSet, jSONObjectA, jNanoTime));
                }
            }
            if (o3Var.d.a().size() > 0) {
                JSONObject jSONObjectA3 = f3Var.a(null);
                o3Var.a(null, f3Var, jSONObjectA3, x3.PARENT_VIEW);
                h3.a(jSONObjectA3);
                w3 w3Var2 = o3Var.e;
                w3Var2.b.a(new v3(w3Var2, o3Var.d.a(), jSONObjectA3, jNanoTime));
            } else {
                o3Var.e.a();
            }
            p3 p3Var = o3Var.d;
            p3Var.f1880a.clear();
            p3Var.b.clear();
            p3Var.c.clear();
            p3Var.d.clear();
            p3Var.e.clear();
            p3Var.f.clear();
            p3Var.g.clear();
            p3Var.h = false;
            long jNanoTime2 = System.nanoTime() - o3Var.f;
            if (o3Var.f1870a.size() > 0) {
                for (d dVar : o3Var.f1870a) {
                    dVar.b(o3Var.b, TimeUnit.NANOSECONDS.toMillis(jNanoTime2));
                    if (dVar instanceof c) {
                        ((c) dVar).a(o3Var.b, jNanoTime2);
                    }
                }
            }
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Handler handler = o3.i;
            if (handler != null) {
                handler.post(o3.j);
                o3.i.postDelayed(o3.k, 200L);
            }
        }
    }

    public interface c extends d {
        void a(int i, long j);
    }

    public interface d {
        void b(int i, long j);
    }

    public void a() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, d3 d3Var, JSONObject jSONObject, x3 x3Var) {
        d3Var.a(view, jSONObject, this, x3Var == x3.PARENT_VIEW);
    }

    public void b() {
        Handler handler = i;
        if (handler != null) {
            handler.removeCallbacks(k);
            i = null;
        }
    }

    public void a(View view, d3 d3Var, JSONObject jSONObject) {
        String str;
        if (com.tapjoy.internal.a.b(view) == null) {
            p3 p3Var = this.d;
            x3 x3Var = p3Var.d.contains(view) ? x3.PARENT_VIEW : p3Var.h ? x3.OBSTRUCTION_VIEW : x3.UNDERLYING_VIEW;
            if (x3Var == x3.UNDERLYING_VIEW) {
                return;
            }
            JSONObject jSONObjectA = d3Var.a(view);
            h3.a(jSONObject, jSONObjectA);
            p3 p3Var2 = this.d;
            if (p3Var2.f1880a.size() == 0) {
                str = null;
            } else {
                String str2 = p3Var2.f1880a.get(view);
                if (str2 != null) {
                    p3Var2.f1880a.remove(view);
                }
                str = str2;
            }
            if (str != null) {
                h3.a(jSONObjectA, str);
                this.d.h = true;
            } else {
                p3 p3Var3 = this.d;
                p3.a aVar = p3Var3.b.get(view);
                if (aVar != null) {
                    p3Var3.b.remove(view);
                }
                if (aVar != null) {
                    h3.a(jSONObjectA, aVar);
                }
                d3Var.a(view, jSONObjectA, this, x3Var == x3.PARENT_VIEW);
            }
            this.b++;
        }
    }
}
