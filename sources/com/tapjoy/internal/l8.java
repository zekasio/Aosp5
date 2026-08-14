package com.tapjoy.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.x4;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class l8 extends j8<Void> {
    public final x4.a d = new x4.a();
    public z4 e = null;

    public boolean a(w4 w4Var) {
        z4 z4Var = this.e;
        if (z4Var == null) {
            this.e = w4Var.c;
        } else if (w4Var.c != z4Var) {
            return false;
        }
        this.d.c.add(w4Var);
        return true;
    }

    @Override // com.tapjoy.internal.j8, com.tapjoy.internal.n1
    public Map<String, Object> b() {
        b5 b5Var;
        boolean z;
        boolean z2;
        v4 v4Var;
        i5 i5Var;
        String str;
        Map<String, Object> mapB = super.b();
        x4 x4VarB = this.d.b();
        StringWriter stringWriter = new StringWriter();
        f1 f1Var = new f1(stringWriter);
        try {
            f1Var.d();
            Iterator<w4> it = x4VarB.c.iterator();
            b5 b5Var2 = null;
            v4 v4Var2 = null;
            i5 i5Var2 = null;
            while (it.hasNext()) {
                w4 next = it.next();
                boolean z3 = true;
                if (b5Var2 == null || !b5Var2.equals(next.j)) {
                    b5Var = next.j;
                    z = false;
                } else {
                    b5Var = b5Var2;
                    z = true;
                }
                if (v4Var2 == null || !v4Var2.equals(next.k)) {
                    v4Var2 = next.k;
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i5Var2 == null || !i5Var2.equals(next.l)) {
                    i5Var2 = next.l;
                    z3 = false;
                }
                t0 t0VarB = new t0().a().a(TapjoyAuctionFlags.AUCTION_TYPE).b(a.a(next.c)).a(AppMeasurementSdk.ConditionalUserProperty.NAME).b(next.d);
                t0VarB.a("time");
                Iterator<w4> it2 = it;
                if (next.f != null) {
                    t0VarB.a((Number) next.e);
                    t0VarB.a("systime").a((Number) next.f);
                    v4Var = v4Var2;
                    i5Var = i5Var2;
                } else {
                    if (!p.f1877a || (str = next.g) == null) {
                        v4Var = v4Var2;
                    } else {
                        v4Var = v4Var2;
                        if (next.h != null && c7.f.equals(str)) {
                            i5Var = i5Var2;
                            t0VarB.a(next.h.longValue() + p.d);
                            t0VarB.a("systime").a((Number) next.e);
                        }
                    }
                    i5Var = i5Var2;
                    t0VarB.a((Number) next.e);
                }
                if (next.i != null) {
                    t0VarB.a("duration").a((Number) next.i);
                }
                if (!z && next.j != null) {
                    t0VarB.a(TJAdUnitConstants.String.VIDEO_INFO).a((x0) new y0(a.a(next.j)));
                }
                if (!z2 && next.k != null) {
                    t0VarB.a(TapjoyConstants.TJC_APP_PLACEMENT).a((x0) new y0(a.a(next.k)));
                }
                if (!z3 && next.l != null) {
                    t0VarB.a("user").a((x0) new y0(a.a(next.l, next)));
                }
                if (next.n != null) {
                    t0VarB.a("event_seq").a((Number) next.n);
                }
                if (next.o != null) {
                    t0 t0VarA = t0VarB.a("event_prev");
                    y4 y4Var = next.o;
                    t0 t0VarB2 = new t0().a().a(TapjoyAuctionFlags.AUCTION_TYPE).b(a.a(y4Var.c)).a(AppMeasurementSdk.ConditionalUserProperty.NAME).b(y4Var.d);
                    if (y4Var.e != null) {
                        t0VarB2.a("category").b(y4Var.e);
                    }
                    t0VarA.a((x0) new y0(t0VarB2.b().toString()));
                }
                if (next.p != null) {
                    t0 t0VarA2 = t0VarB.a(FirebaseAnalytics.Event.PURCHASE);
                    e5 e5Var = next.p;
                    t0 t0VarB3 = new t0().a().a("product_id").b(e5Var.c);
                    if (e5Var.d != null) {
                        t0VarB3.a("product_quantity").a((Number) e5Var.d);
                    }
                    if (e5Var.e != null) {
                        t0VarB3.a("product_price").a((Number) e5Var.e);
                    }
                    if (e5Var.f != null) {
                        t0VarB3.a("product_price_currency").b(e5Var.f);
                    }
                    if (e5Var.n != null) {
                        t0VarB3.a("currency_price").b(e5Var.n);
                    }
                    if (e5Var.g != null) {
                        t0VarB3.a("product_type").b(e5Var.g);
                    }
                    if (e5Var.h != null) {
                        t0VarB3.a("product_title").b(e5Var.h);
                    }
                    if (e5Var.i != null) {
                        t0VarB3.a("product_description").b(e5Var.i);
                    }
                    if (e5Var.j != null) {
                        t0VarB3.a("transaction_id").b(e5Var.j);
                    }
                    if (e5Var.k != null) {
                        t0VarB3.a("transaction_state").a((Number) e5Var.k);
                    }
                    if (e5Var.l != null) {
                        t0VarB3.a("transaction_date").a((Number) e5Var.l);
                    }
                    if (e5Var.m != null) {
                        t0VarB3.a("campaign_id").b(e5Var.m);
                    }
                    if (e5Var.o != null) {
                        t0VarB3.a("receipt").b(e5Var.o);
                    }
                    if (e5Var.p != null) {
                        t0VarB3.a("signature").b(e5Var.p);
                    }
                    t0VarA2.a((x0) new y0(t0VarB3.b().toString()));
                }
                if (next.q != null) {
                    t0VarB.a("exception").b(next.q);
                }
                try {
                    if (next.s != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str2 = next.r;
                        if (str2 != null) {
                            z0.b(str2).a(linkedHashMap);
                        }
                        d5 d5Var = next.s;
                        if (d5Var.c != null) {
                            linkedHashMap.put("fq7_change", d5Var.c);
                        }
                        String str3 = d5Var.d;
                        if (str3 != null) {
                            linkedHashMap.put("fq30_change", str3);
                        }
                        String str4 = d5Var.e;
                        if (str4 != null) {
                            linkedHashMap.put(TJAdUnitConstants.PARAM_PUSH_ID, str4);
                        }
                        try {
                            t0VarB.a("meta").b.a((Map) linkedHashMap);
                        } catch (IOException e) {
                            a.a(e);
                            throw null;
                        }
                    } else if (next.r != null) {
                        t0VarB.a("meta").a((x0) new y0(next.r));
                    }
                } catch (IOException unused) {
                }
                if (next.t != null) {
                    t0VarB.a("category").b(next.t);
                }
                if (next.u != null) {
                    t0VarB.a("p1").b(next.u);
                }
                if (next.v != null) {
                    t0VarB.a("p2").b(next.v);
                }
                if (next.w.size() > 0) {
                    t0VarB.a("values").a();
                    for (a5 a5Var : next.w) {
                        t0VarB.a(a5Var.c).a((Number) a5Var.d);
                    }
                    t0VarB.b();
                }
                String string = t0VarB.b().toString();
                try {
                    f1Var.a(false);
                    f1Var.f1796a.write(string);
                    i5Var2 = i5Var;
                    b5Var2 = b5Var;
                    it = it2;
                    v4Var2 = v4Var;
                } catch (IOException e2) {
                    a.a(e2);
                    throw null;
                }
            }
            try {
                f1Var.f();
                try {
                    f1Var.f1796a.flush();
                    mapB.put("events", new y0(stringWriter.toString()));
                    return mapB;
                } catch (IOException e3) {
                    a.a(e3);
                    throw null;
                }
            } catch (IOException e4) {
                a.a(e4);
                throw null;
            }
        } catch (IOException e5) {
            a.a(e5);
            throw null;
        }
    }

    @Override // com.tapjoy.internal.n1
    public String c() {
        return this.e == z4.USAGES ? "api/v1/usages" : "api/v1/cevs";
    }

    public int e() {
        return this.d.c.size();
    }
}
