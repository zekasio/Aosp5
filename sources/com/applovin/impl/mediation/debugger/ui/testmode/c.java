package com.applovin.impl.mediation.debugger.ui.testmode;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1102a;
    private boolean b;
    private boolean c;
    private String d;

    public c(p pVar) {
        this.f1102a = pVar;
        this.d = (String) pVar.b(d.J, (Object) null);
        pVar.b(d.J);
        if (StringUtils.isValidString(this.d)) {
            this.c = true;
        }
        this.b = ((Boolean) pVar.b((d<boolean>) d.K, false)).booleanValue();
        pVar.b(d.K);
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public String c() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public void d() {
        this.f1102a.a((d<boolean>) d.K, true);
    }

    public void a(JSONObject jSONObject) {
        String strB;
        boolean zG;
        if (this.b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        if (this.f1102a.S() != null) {
            strB = this.f1102a.Q().d().b();
            zG = this.f1102a.Q().D();
        } else {
            strB = this.f1102a.R().k().b();
            zG = this.f1102a.R().g();
        }
        this.b = JsonUtils.containsCaseInsensitiveString(strB, jSONArray) || zG || AppLovinSdkUtils.isEmulator();
    }
}
