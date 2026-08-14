package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class b extends a {
    b(com.applovin.impl.sdk.p pVar) {
        super("TaskApiSubmitData", pVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.c(this.g, "Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
        } catch (JSONException e) {
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Unable to build JSON message with collected data", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectB = com.applovin.impl.sdk.utils.i.b(jSONObject);
            this.f.N().a(com.applovin.impl.sdk.c.b.ad, jSONObjectB.getString("device_id"));
            this.f.N().a(com.applovin.impl.sdk.c.b.af, jSONObjectB.getString("device_token"));
            this.f.N().a(com.applovin.impl.sdk.c.b.ag, Long.valueOf(jSONObjectB.getLong("publisher_id")));
            com.applovin.impl.sdk.utils.i.d(jSONObjectB, this.f);
            com.applovin.impl.sdk.utils.i.e(jSONObjectB, this.f);
            String string = JsonUtils.getString(jSONObjectB, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string)) {
                String string2 = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(jSONObjectB, "sdk_update_message")) {
                    string2 = JsonUtils.getString(jSONObjectB, "sdk_update_message", string2);
                }
                com.applovin.impl.sdk.y.h("AppLovinSdk", string2);
            }
            this.f.P().b();
        } catch (Throwable th) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Unable to parse API response", th);
            }
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        Map<String, Object> mapD;
        Map<String, Object> mapH;
        if (this.f.S() != null) {
            com.applovin.impl.sdk.r rVarS = this.f.S();
            mapD = rVarS.b();
            mapH = rVarS.d();
        } else {
            com.applovin.impl.sdk.q qVarR = this.f.R();
            mapD = qVarR.d();
            mapH = qVarR.h();
        }
        Utils.renameKeyInObjectMap(TapjoyConstants.TJC_PLATFORM, TapjoyAuctionFlags.AUCTION_TYPE, mapD);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", mapD);
        jSONObject.put("device_info", new JSONObject(mapD));
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", mapH);
        Utils.renameKeyInObjectMap("ia", "installed_at", mapH);
        jSONObject.put("app_info", new JSONObject(mapH));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.eB)).booleanValue()) {
            jSONObject.put("stats", this.f.P().c());
        }
    }

    private void d(JSONObject jSONObject) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).a(com.applovin.impl.sdk.utils.i.a("2.0/device", this.f)).c(com.applovin.impl.sdk.utils.i.b("2.0/device", this.f)).a(com.applovin.impl.sdk.utils.i.e(this.f)).b("POST").a(jSONObject).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fi)).booleanValue()).a(new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dm)).intValue()).a(), this.f) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i) {
                b.this.a(jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.i.a(i, this.f);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bh);
        uVar.b(com.applovin.impl.sdk.c.b.bi);
        this.f.M().a((a) uVar);
    }
}
