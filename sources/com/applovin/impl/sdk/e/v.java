package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f1319a;

    public v(com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.p pVar) {
        super("TaskReportAppLovinReward", pVar);
        this.f1319a = eVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f1319a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f1319a.ae());
        String clCode = this.f1319a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.w
    protected com.applovin.impl.sdk.b.c b() {
        return this.f1319a.aI();
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Reported reward successfully for ad: " + this.f1319a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(int i) {
        super.a(i);
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Failed to report reward for ad: " + this.f1319a + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void c() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "No reward result was found for ad: " + this.f1319a);
        }
    }
}
