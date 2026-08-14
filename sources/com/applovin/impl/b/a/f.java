package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.tapjoy.TJAdUnitConstants;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f868a;
    private final JSONObject b;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    public static f a(JSONObject jSONObject, p pVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, TJAdUnitConstants.String.TITLE, (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && pVar.ae().e() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && pVar.ae().d() == null) {
            return null;
        }
        return new f(jSONObject, pVar);
    }

    private f(JSONObject jSONObject, p pVar) {
        this.f868a = pVar;
        this.b = jSONObject;
    }

    public String a() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, TJAdUnitConstants.String.TITLE, (JSONObject) null);
        return p.a(JsonUtils.getString(jSONObject, "key", ""), (List<String>) JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public a b() {
        String string = JsonUtils.getString(this.b, TJAdUnitConstants.String.STYLE, null);
        if (CookieSpecs.DEFAULT.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) {
            return a.NEGATIVE;
        }
        return a.NEUTRAL;
    }

    public String c() {
        return JsonUtils.getString(this.b, "destination_state_id", null);
    }

    public String d() {
        return JsonUtils.getString(this.b, "event", null);
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + a() + "destinationStateId=" + c() + "event=" + d() + "}";
    }
}
