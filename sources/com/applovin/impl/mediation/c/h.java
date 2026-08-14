package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.ab;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.c f1010a;

    public h(com.applovin.impl.mediation.a.c cVar, p pVar) {
        super("TaskValidateMaxReward", pVar);
        this.f1010a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    protected String a() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f1010a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f1010a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f1010a.am());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.f1010a.getFormat().getLabel());
        String strL = this.f1010a.L();
        if (!StringUtils.isValidString(strL)) {
            strL = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL);
        String strK = this.f1010a.K();
        if (!StringUtils.isValidString(strK)) {
            strK = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strK);
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.f1010a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f1010a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected boolean b() {
        return this.f1010a.M();
    }
}
