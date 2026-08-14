package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.w;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f1009a;

    public g(com.applovin.impl.mediation.a.c cVar, p pVar) {
        super("TaskReportMaxReward", pVar);
        this.f1009a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f1009a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f1009a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f1009a.am());
        String strL = this.f1009a.L();
        if (!StringUtils.isValidString(strL)) {
            strL = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL);
        String strK = this.f1009a.K();
        if (!StringUtils.isValidString(strK)) {
            strK = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strK);
    }

    @Override // com.applovin.impl.sdk.e.w
    protected com.applovin.impl.sdk.b.c b() {
        return this.f1009a.O();
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void b(JSONObject jSONObject) {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Reported reward successfully for mediated ad: " + this.f1009a);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(int i) {
        super.a(i);
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Failed to report reward for mediated ad: " + this.f1009a + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.sdk.e.w
    protected void c() {
        y yVar = this.h;
        if (y.a()) {
            this.h.e(this.g, "No reward result was found for mediated ad: " + this.f1009a);
        }
    }
}
