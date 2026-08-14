package com.applovin.impl.mediation.debugger.c;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b.c<JSONObject> f1042a;

    public c(b.c<JSONObject> cVar, p pVar) {
        super("TaskFetchMediationDebuggerInfo", pVar, true);
        this.f1042a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).b("POST").a(com.applovin.impl.mediation.d.b.c(this.f)).c(com.applovin.impl.mediation.d.b.d(this.f)).a(a()).a(new JSONObject()).b(((Long) this.f.a(com.applovin.impl.sdk.c.a.g)).intValue()).a(b()).a(), this.f, g()) { // from class: com.applovin.impl.mediation.debugger.c.c.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                c.this.f1042a.a(jSONObject, i);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                c.this.f1042a.a(i, str, jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.a.c);
        uVar.b(com.applovin.impl.sdk.c.a.d);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    protected Map<String, String> a() {
        Map<String, Object> mapH;
        Map<String, Object> mapB;
        Map<String, String> map = CollectionUtils.map();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
        }
        if (this.f.S() != null) {
            mapH = this.f.S().d();
            mapB = this.f.S().f();
        } else {
            mapH = this.f.R().h();
            mapB = this.f.R().b();
        }
        map.put("package_name", String.valueOf(mapH.get("package_name")));
        map.put(TapjoyConstants.TJC_APP_VERSION_NAME, String.valueOf(mapH.get(TapjoyConstants.TJC_APP_VERSION_NAME)));
        map.put(TapjoyConstants.TJC_PLATFORM, String.valueOf(mapB.get(TapjoyConstants.TJC_PLATFORM)));
        map.put("os", String.valueOf(mapB.get("os")));
        return map;
    }

    private JSONObject b() {
        d.a aVarK;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f));
            if (this.f.S() != null) {
                aVarK = this.f.Q().d();
            } else {
                aVarK = this.f.R().k();
            }
            jSONObject.put("dnt_code", aVarK.c().a());
            Boolean boolA = com.applovin.impl.b.a.a().a(f());
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dS)).booleanValue() && !Boolean.TRUE.equals(boolA)) {
                JsonUtils.putStringIfValid(jSONObject, "idfa", aVarK.b());
            }
        } catch (JSONException e) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Failed to construct JSON body", e);
            }
        }
        return jSONObject;
    }
}
