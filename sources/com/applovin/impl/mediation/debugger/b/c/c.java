package com.applovin.impl.mediation.debugger.b.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.e;
import com.applovin.impl.sdk.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1036a = e.a(p.y()).a();
    private final boolean b;
    private final boolean c;
    private final String d;

    public c(JSONObject jSONObject, p pVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 != null) {
            this.b = true;
            this.d = JsonUtils.getString(jSONObject2, "description", "");
            if (i.a()) {
                this.c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!i.a((String) it.next())) {
                        break;
                    }
                }
                this.c = z;
                return;
            }
            this.c = false;
            return;
        }
        this.b = false;
        this.d = "";
        this.c = i.a();
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        boolean z = this.c;
        return z && (this.f1036a || z);
    }

    public String c() {
        return this.f1036a ? this.d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
