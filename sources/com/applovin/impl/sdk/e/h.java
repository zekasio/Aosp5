package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.d f1291a;

    protected abstract a a(JSONObject jSONObject);

    protected abstract String b();

    protected abstract String c();

    public h(com.applovin.impl.sdk.ad.d dVar, String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
        this.f1291a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> mapA;
        Map<String, String> map;
        Map<String, Object> mapA2;
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Fetching next ad of zone: " + this.f1291a);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.ea)).booleanValue() && Utils.isVPNConnected()) {
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "User is connected to a VPN");
            }
        }
        com.applovin.impl.sdk.d.g gVarP = this.f.P();
        gVarP.a(com.applovin.impl.sdk.d.f.f1276a);
        if (gVarP.b(com.applovin.impl.sdk.d.f.d) == 0) {
            gVarP.b(com.applovin.impl.sdk.d.f.d, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f.E().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
                if (this.f.S() != null) {
                    mapA2 = this.f.S().a(a(), false, true);
                } else {
                    mapA2 = this.f.R().a(a(), false, true);
                }
                JSONObject jSONObject = new JSONObject(mapA2);
                map = CollectionUtils.map();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                if (this.f.S() != null) {
                    mapA = this.f.S().a(a(), false, false);
                } else {
                    mapA = this.f.R().a(a(), false, false);
                }
                Map<String, String> mapStringifyObjectMap = Utils.stringifyObjectMap(mapA);
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                map = mapStringifyObjectMap;
            }
            if (Utils.isDspDemoApp(f())) {
                map.putAll(this.f.E().getAndResetCustomQueryParams());
            }
            a(gVarP);
            c.a aVarB = com.applovin.impl.sdk.network.c.a(this.f).a(b()).c(c()).a(map).b(str).b(i()).a(new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dj)).intValue()).a(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dk)).booleanValue()).b(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dl)).booleanValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.di)).intValue());
            if (andResetCustomPostBody != null) {
                aVarB.a(andResetCustomPostBody);
                aVarB.d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fj)).booleanValue());
            }
            u<JSONObject> uVar = new u<JSONObject>(aVarB.a(), this.f) { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject2, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject2, "ad_fetch_latency_millis", this.e.a());
                        JsonUtils.putLong(jSONObject2, "ad_fetch_response_size", this.e.b());
                        h.this.b(jSONObject2);
                        return;
                    }
                    h.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i, String str2, JSONObject jSONObject2) {
                    h.this.a(i, str2);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.b.bf);
            uVar.b(com.applovin.impl.sdk.c.b.bg);
            this.f.M().a((a) uVar);
        } catch (Throwable th) {
            com.applovin.impl.sdk.y yVar3 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Unable to fetch ad " + this.f1291a, th);
            }
            a(0, th.getMessage());
        }
    }

    protected com.applovin.impl.sdk.ad.b h() {
        return this.f1291a.e() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    private Map<String, String> i() {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("AppLovin-Zone-Id", this.f1291a.a());
        if (this.f1291a.c() != null) {
            map.put("AppLovin-Ad-Size", this.f1291a.c().getLabel());
        }
        if (this.f1291a.d() != null) {
            map.put("AppLovin-Ad-Type", this.f1291a.d().getLabel());
        }
        return map;
    }

    protected Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f1291a.a());
        if (this.f1291a.c() != null) {
            map.put("size", this.f1291a.c().getLabel());
        }
        if (this.f1291a.d() != null) {
            map.put("require", this.f1291a.d().getLabel());
        }
        return map;
    }

    protected void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
        com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
        com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
        com.applovin.impl.sdk.ad.d.a(jSONObject);
        this.f.M().a(a(jSONObject));
    }

    protected void a(int i, String str) {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Unable to fetch " + this.f1291a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f.P().a(com.applovin.impl.sdk.d.f.j);
        }
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        long jB = gVar.b(com.applovin.impl.sdk.d.f.d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dB)).intValue())) {
            gVar.b(com.applovin.impl.sdk.d.f.d, jCurrentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.e);
            gVar.c(com.applovin.impl.sdk.d.f.f);
        }
    }
}
