package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends a {
    protected abstract String a();

    protected abstract void a(JSONObject jSONObject);

    protected abstract int h();

    protected y(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.a(a(), this.f)).c(com.applovin.impl.sdk.utils.i.b(a(), this.f)).a(com.applovin.impl.sdk.utils.i.e(this.f)).b("POST").a(jSONObject).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fm)).booleanValue()).a(new JSONObject()).a(h()).a(), this.f) { // from class: com.applovin.impl.sdk.e.y.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i) {
                cVar.a(jSONObject2, i);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject2) {
                cVar.a(i, str, jSONObject2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bh);
        uVar.b(com.applovin.impl.sdk.c.b.bi);
        this.f.M().a((a) uVar);
    }

    protected JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String strO = this.f.o();
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dL)).booleanValue() && StringUtils.isValidString(strO)) {
            JsonUtils.putString(jSONObject, "cuid", strO);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dN)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f.p());
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f.q());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected void a(int i) {
        com.applovin.impl.sdk.utils.i.a(i, this.f);
    }
}
