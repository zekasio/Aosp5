package com.applovin.impl.b.a;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static List<d> a(p pVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, pVar);
    }

    public static List<d> b(p pVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, pVar);
    }

    public static List<d> c(p pVar) {
        return a(R.raw.applovin_consent_flow_gdpr, pVar);
    }

    private static List<d> a(int i, p pVar) {
        String rawResourceString = Utils.getRawResourceString(i, p.y(), pVar);
        if (TextUtils.isEmpty(rawResourceString)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(rawResourceString, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectJsonObjectFromJsonString, "states", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(d.a(JsonUtils.getJSONObject(jSONArray, i2, new JSONObject()), pVar));
        }
        return arrayList;
    }
}
