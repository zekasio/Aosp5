package com.applovin.impl.mediation.d;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f1013a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};
    private static final String[] b = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    public static void a(JSONObject jSONObject, p pVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f1013a);
            pVar.a(d.F, jSONObjectShallowCopy.toString());
            com.applovin.impl.mediation.c.b.a(jSONObjectShallowCopy);
        }
    }

    public static void a(JSONObject jSONObject) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            com.applovin.impl.mediation.c.b.b(jSONObject);
        }
    }

    public static void b(JSONObject jSONObject, p pVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, b);
            pVar.a(d.G, jSONObjectShallowCopy.toString());
            return;
        }
        pVar.b(d.G);
    }

    public static String a(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.c), "1.0/mediate", pVar);
    }

    public static String b(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.d), "1.0/mediate", pVar);
    }

    public static String c(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.c), "1.0/mediate_debug", pVar);
    }

    public static String d(p pVar) {
        return i.a((String) pVar.a(com.applovin.impl.sdk.c.a.d), "1.0/mediate_debug", pVar);
    }
}
