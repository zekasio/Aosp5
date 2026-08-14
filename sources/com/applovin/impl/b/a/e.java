package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {
    public e(JSONObject jSONObject, p pVar) {
        super(jSONObject, pVar);
    }

    public String e() {
        return a(TJAdUnitConstants.String.TITLE);
    }

    public String f() {
        return a(TJAdUnitConstants.String.MESSAGE);
    }

    public List<f> g() {
        f fVarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (fVarA = f.a(jSONObject, this.f866a)) != null) {
                arrayList.add(fVarA);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "title=" + e() + "message=" + f() + "actions=" + g() + "}";
    }
}
