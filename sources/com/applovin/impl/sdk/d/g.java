package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1277a;
    private final Map<String, Long> b = CollectionUtils.map();

    public g(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1277a = pVar;
    }

    public long a(f fVar) {
        return a(fVar, 1L);
    }

    long a(f fVar, long j) {
        long jLongValue;
        synchronized (this.b) {
            Long l = this.b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue() + j;
            this.b.put(fVar.a(), Long.valueOf(jLongValue));
        }
        e();
        return jLongValue;
    }

    public long b(f fVar) {
        long jLongValue;
        synchronized (this.b) {
            Long l = this.b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            jLongValue = l.longValue();
        }
        return jLongValue;
    }

    public void b(f fVar, long j) {
        synchronized (this.b) {
            this.b.put(fVar.a(), Long.valueOf(j));
        }
        e();
    }

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        e();
    }

    public void c(f fVar) {
        synchronized (this.b) {
            this.b.remove(fVar.a());
        }
        e();
    }

    public void b() {
        synchronized (this.b) {
            Iterator<f> it = f.b().iterator();
            while (it.hasNext()) {
                this.b.remove(it.next().a());
            }
            e();
        }
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.f1277a.b(com.applovin.impl.sdk.c.d.y, JsonUtils.EMPTY_JSON));
            synchronized (this.b) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        this.b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.f1277a.L();
            if (y.a()) {
                this.f1277a.L().b("GlobalStatsManager", "Unable to load stats", th);
            }
        }
    }

    private void e() {
        this.f1277a.M().a(new Runnable() { // from class: com.applovin.impl.sdk.d.g.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.f1277a.a(com.applovin.impl.sdk.c.d.y, g.this.c().toString());
                } catch (Throwable th) {
                    g.this.f1277a.L();
                    if (y.a()) {
                        g.this.f1277a.L().b("GlobalStatsManager", "Unable to save stats", th);
                    }
                }
            }
        });
    }
}
