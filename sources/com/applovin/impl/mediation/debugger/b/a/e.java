package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1029a;
    private final String b;

    public e(JSONObject jSONObject, p pVar) {
        this.f1029a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.PRICE, null);
    }

    public String a() {
        return this.f1029a;
    }

    public String b() {
        return this.b;
    }
}
