package com.tapjoy.internal;

import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.e5;
import com.tapjoy.internal.w4;
import com.tapjoy.internal.y4;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7 f1944a;
    public final w6 b;
    public int c = 1;
    public final y4.a d = new y4.a();
    public long e;

    public x6(c7 c7Var, w6 w6Var) {
        this.f1944a = c7Var;
        this.b = w6Var;
    }

    public void a() {
        a(a(z4.APP, "install"));
    }

    public void b() {
        a(a(z4.APP, TapjoyConstants.TJC_REFERRER));
    }

    public void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        this.f1944a.a(jElapsedRealtime);
        w4.a aVarA = a(z4.APP, "session");
        aVarA.i = Long.valueOf(jElapsedRealtime);
        a(aVarA);
        this.e = 0L;
        this.f1944a.a(aVarA.e.longValue(), jElapsedRealtime);
        w6 w6Var = this.b;
        if (w6Var.d != null) {
            w6Var.a();
            new v6(w6Var, 300L).run();
        }
        w6Var.f1936a.flush();
    }

    public void d() {
    }

    public void a(String str, String str2, double d, String str3, String str4, String str5) {
        this.f1944a.a(str2, d);
        w4.a aVarA = a(z4.APP, FirebaseAnalytics.Event.PURCHASE);
        e5.a aVar = new e5.a();
        aVar.c = str;
        aVar.f = str2;
        aVar.e = Double.valueOf(d);
        if (str5 != null) {
            aVar.m = str5;
        }
        if (str3 != null) {
            aVar.o = str3;
        }
        if (str4 != null) {
            aVar.p = str4;
        }
        aVarA.p = aVar.b();
        a(aVarA);
        this.f1944a.a(aVarA.e.longValue(), d);
    }

    public void b(String str) {
        w4.a aVarA = a(z4.APP, "push_show");
        aVarA.s = new d5(null, null, str);
        a(aVarA);
    }

    public void a(String str) {
        w4.a aVarA = a(z4.APP, "push_ignore");
        aVarA.s = new d5(null, null, str);
        a(aVarA);
    }

    public void a(String str, String str2, String str3, String str4, Map<String, Long> map) {
        w4.a aVarA = a(z4.CUSTOM, str2);
        aVarA.t = str;
        aVarA.u = str3;
        aVarA.v = str4;
        if (map != null) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                aVarA.w.add(new a5(entry.getKey(), entry.getValue(), x8.e));
            }
        }
        a(aVarA);
    }

    public void a(Map<String, Object> map) {
        w4.a aVarA = a(z4.CAMPAIGN, "impression");
        if (map != null) {
            aVarA.r = t0.a(map);
        }
        a(aVarA);
    }

    public void a(Map<String, Object> map, long j) {
        w4.a aVarA = a(z4.CAMPAIGN, "view");
        aVarA.i = Long.valueOf(j);
        if (map != null) {
            aVarA.r = t0.a(map);
        }
        a(aVarA);
    }

    public void a(Map<String, Object> map, String str) {
        w4.a aVarA = a(z4.CAMPAIGN, TJAdUnitConstants.String.CLICK);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("region", str);
        aVarA.r = t0.a(linkedHashMap);
        a(aVarA);
    }

    public final w4.a a(z4 z4Var, String str) {
        c5 c5VarA = this.f1944a.a();
        w4.a aVar = new w4.a();
        aVar.g = c7.f;
        aVar.c = z4Var;
        aVar.d = str;
        if (p.f1877a) {
            aVar.e = Long.valueOf(p.a());
            aVar.f = Long.valueOf(System.currentTimeMillis());
        } else {
            aVar.e = Long.valueOf(System.currentTimeMillis());
            aVar.h = Long.valueOf(SystemClock.elapsedRealtime());
        }
        aVar.j = c5VarA.c;
        aVar.k = c5VarA.d;
        aVar.l = c5VarA.e;
        return aVar;
    }

    public final synchronized void a(w4.a aVar) {
        if (aVar.c != z4.USAGES) {
            int i = this.c;
            this.c = i + 1;
            aVar.n = Integer.valueOf(i);
            y4.a aVar2 = this.d;
            if (aVar2.c != null) {
                aVar.o = aVar2.b();
            }
            y4.a aVar3 = this.d;
            aVar3.c = aVar.c;
            aVar3.d = aVar.d;
            aVar3.e = aVar.t;
        }
        this.b.a(aVar.b());
    }
}
