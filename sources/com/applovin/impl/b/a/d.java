package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f866a;
    protected final JSONObject b;

    public enum a {
        ALERT,
        GDPR_ALERT,
        EVENT,
        TERMS_OF_SERVICE,
        PRIVACY_POLICY,
        HAS_USER_CONSENT,
        REINIT
    }

    public d(JSONObject jSONObject, p pVar) {
        this.f866a = pVar;
        this.b = jSONObject;
    }

    public static d a(JSONObject jSONObject, p pVar) {
        a aVarB = b(JsonUtils.getString(jSONObject, TapjoyAuctionFlags.AUCTION_TYPE, null));
        if (aVarB == a.ALERT) {
            return new e(jSONObject, pVar);
        }
        if (aVarB == a.GDPR_ALERT) {
            return new h(jSONObject, pVar);
        }
        if (aVarB == a.EVENT) {
            return new g(jSONObject, pVar);
        }
        return new d(jSONObject, pVar);
    }

    public String a() {
        return JsonUtils.getString(this.b, "id", null);
    }

    public a b() {
        return b(JsonUtils.getString(this.b, TapjoyAuctionFlags.AUCTION_TYPE, null));
    }

    public boolean c() {
        return JsonUtils.getBoolean(this.b, "is_initial_state", false).booleanValue();
    }

    public String d() {
        return JsonUtils.getString(this.b, "destination_state_id", null);
    }

    private static a b(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return a.ALERT;
        }
        if ("gdpr_alert".equalsIgnoreCase(str)) {
            return a.GDPR_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return a.EVENT;
        }
        if ("tos".equalsIgnoreCase(str)) {
            return a.TERMS_OF_SERVICE;
        }
        if ("pp".equalsIgnoreCase(str)) {
            return a.PRIVACY_POLICY;
        }
        if (AppLovinSdkExtraParameterKey.HAS_USER_CONSENT.equalsIgnoreCase(str)) {
            return a.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return a.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    protected String a(String str) {
        String strB;
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                if (this.f866a.S() != null) {
                    strB = this.f866a.Q().B().b();
                } else {
                    strB = (String) this.f866a.R().c().get("app_name");
                }
                if (StringUtils.isValidString(strB)) {
                    arrayList.add(strB);
                } else {
                    arrayList.add(p.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return p.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "destinationStateId=" + d() + "}";
    }
}
