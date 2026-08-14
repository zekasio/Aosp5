package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1025a;
    private final String b;
    private final MaxAdFormat c;
    private final c d;
    private final List<c> e;

    public a(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.c.b> map, p pVar) {
        this.f1025a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.b = JsonUtils.getString(jSONObject, "display_name", "");
        this.c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.e = new ArrayList(jSONArray.length());
        c cVar = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                c cVar2 = new c(jSONObject2, map, this.c, pVar);
                this.e.add(cVar2);
                if (cVar == null && cVar2.c()) {
                    cVar = cVar2;
                }
            }
        }
        this.d = cVar;
    }

    public String a() {
        return this.f1025a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public MaxAdFormat d() {
        return this.c;
    }

    public c e() {
        c cVar = this.d;
        return cVar != null ? cVar : g();
    }

    public String f() {
        return "\n---------- " + this.b + " ----------\nIdentifier - " + this.f1025a + "\nFormat     - " + c();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.b.compareToIgnoreCase(aVar.b);
    }

    private c g() {
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.get(0);
    }
}
