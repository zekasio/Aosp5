package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.p;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {
    public h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(map, jSONObject, jSONObject2, pVar);
    }

    public boolean a() {
        return b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    public boolean b() {
        return b("use_cached_adapter", (Boolean) true).booleanValue();
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        return "SignalProviderSpec{adObject=" + W() + '}';
    }
}
