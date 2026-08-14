package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1027a;
    private final boolean b;
    private final List<b> c;
    private final List<b> d;
    private boolean e = false;

    c(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, p pVar) {
        this.f1027a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.b = JsonUtils.getBoolean(jSONObject, CookieSpecs.DEFAULT, false).booleanValue();
        this.c = a("bidders", jSONObject, map, maxAdFormat, pVar);
        this.d = a("waterfall", jSONObject, map, maxAdFormat, pVar);
    }

    public List<b> a() {
        return this.c;
    }

    public List<b> b() {
        return this.d;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.e;
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, MaxAdFormat maxAdFormat, p pVar) {
        com.applovin.impl.mediation.debugger.b.c.b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (bVar.A()) {
                    this.e = true;
                }
                arrayList.add(new b(jSONObject2, maxAdFormat, bVar, pVar));
            }
        }
        return arrayList;
    }
}
