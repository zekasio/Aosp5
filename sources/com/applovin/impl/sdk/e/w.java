package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends y {
    protected abstract com.applovin.impl.sdk.b.c b();

    protected abstract void b(JSONObject jSONObject);

    protected abstract void c();

    protected w(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.b.c cVarB = b();
        if (cVarB != null) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Reporting pending reward: " + cVarB + "...");
            }
            a(a(cVarB), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.w.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i) {
                    w.this.b(jSONObject);
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i, String str, JSONObject jSONObject) {
                    w.this.a(i);
                }
            });
            return;
        }
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Pending reward not found");
        }
        c();
    }

    @Override // com.applovin.impl.sdk.e.y
    protected int h() {
        return ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bJ)).intValue();
    }

    private JSONObject a(com.applovin.impl.sdk.b.c cVar) {
        JSONObject jSONObjectI = i();
        JsonUtils.putString(jSONObjectI, "result", cVar.b());
        Map<String, String> mapA = cVar.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectI, TJAdUnitConstants.String.BEACON_PARAMS, new JSONObject(mapA));
        }
        return jSONObjectI;
    }
}
