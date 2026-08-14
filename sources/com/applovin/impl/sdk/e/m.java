package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1296a;

    public interface a {
        void a();
    }

    public m(com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskFetchVariables", pVar);
        this.f1296a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.l(this.f)).c(com.applovin.impl.sdk.utils.i.m(this.f)).a(a()).b("GET").a(new JSONObject()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dt)).intValue()).a(), this.f) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                com.applovin.impl.sdk.utils.i.d(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.f(jSONObject, this.f);
                com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
                m.this.f1296a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Unable to fetch variables: server returned " + i);
                }
                com.applovin.impl.sdk.y.i("AppLovinVariableService", "Failed to load variables.");
                m.this.f1296a.a();
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bl);
        uVar.b(com.applovin.impl.sdk.c.b.bm);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    private Map<String, String> a() {
        if (this.f.S() != null) {
            return Utils.stringifyObjectMap(this.f.S().a(null, false, false));
        }
        return Utils.stringifyObjectMap(this.f.R().a(null, false, false));
    }
}
