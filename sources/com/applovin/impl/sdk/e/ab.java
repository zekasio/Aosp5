package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends y {
    protected abstract void a(com.applovin.impl.sdk.b.c cVar);

    protected abstract boolean b();

    protected ab(String str, com.applovin.impl.sdk.p pVar) {
        super(str, pVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        a(i(), new b.c<JSONObject>() { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                if (ab.this.b()) {
                    com.applovin.impl.sdk.y yVar = ab.this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab.this.h.e(ab.this.g, "Reward validation succeeded with code " + i + " but task was cancelled already");
                    }
                    com.applovin.impl.sdk.y yVar2 = ab.this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab.this.h.e(ab.this.g, "Response: " + jSONObject);
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar3 = ab.this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    ab.this.h.b(ab.this.g, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
                }
                ab.this.b(jSONObject);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                if (ab.this.b()) {
                    com.applovin.impl.sdk.y yVar = ab.this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        ab.this.h.e(ab.this.g, "Reward validation failed with error code " + i + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar2 = ab.this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    ab.this.h.e(ab.this.g, "Reward validation failed with code " + i + " and error: " + str);
                }
                ab.this.a(i);
            }
        });
    }

    @Override // com.applovin.impl.sdk.e.y
    protected int h() {
        return ((Integer) this.f.a(com.applovin.impl.sdk.c.b.bI)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.b.c cVarC = c(jSONObject);
        if (cVarC == null) {
            return;
        }
        a(cVarC);
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Pending reward handled: " + cVarC);
        }
    }

    private com.applovin.impl.sdk.b.c c(JSONObject jSONObject) {
        Map<String, String> mapEmptyMap;
        String string;
        try {
            JSONObject jSONObjectB = com.applovin.impl.sdk.utils.i.b(jSONObject);
            com.applovin.impl.sdk.utils.i.d(jSONObjectB, this.f);
            com.applovin.impl.sdk.utils.i.c(jSONObject, this.f);
            com.applovin.impl.sdk.utils.i.e(jSONObject, this.f);
            try {
                mapEmptyMap = JsonUtils.toStringMap((JSONObject) jSONObjectB.get(TJAdUnitConstants.String.BEACON_PARAMS));
            } catch (Throwable unused) {
                mapEmptyMap = Collections.emptyMap();
            }
            try {
                string = jSONObjectB.getString("result");
            } catch (Throwable unused2) {
                string = "network_timeout";
            }
            return com.applovin.impl.sdk.b.c.a(string, mapEmptyMap);
        } catch (JSONException e) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (!com.applovin.impl.sdk.y.a()) {
                return null;
            }
            this.h.b(this.g, "Unable to parse API response", e);
            return null;
        }
    }
}
