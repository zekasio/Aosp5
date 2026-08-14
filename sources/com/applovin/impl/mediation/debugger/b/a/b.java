package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1026a;
    private final e b;
    private final List<e> c;

    public b(JSONObject jSONObject, MaxAdFormat maxAdFormat, com.applovin.impl.mediation.debugger.b.c.b bVar, p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new e(jSONObject2, pVar);
        } else {
            this.b = null;
        }
        this.f1026a = new d(JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new e(jSONObject3, pVar));
            }
        }
    }

    public d a() {
        return this.f1026a;
    }

    public e b() {
        return this.b;
    }

    public boolean c() {
        return this.b != null;
    }

    public List<e> d() {
        return this.c;
    }
}
