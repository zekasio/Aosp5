package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {
    private Map<String, String> c;

    public Map<String, String> f() {
        return this.c;
    }

    public void a(Map<String, String> map) {
        this.c = map;
    }

    public g(JSONObject jSONObject, p pVar) {
        super(jSONObject, pVar);
    }

    public String e() {
        return JsonUtils.getString(this.b, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "name=" + e() + "}";
    }
}
