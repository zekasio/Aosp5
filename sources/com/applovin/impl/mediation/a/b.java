package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.i;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    public b(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i, map, jSONObject, jSONObject2, null, pVar);
    }

    private b(b bVar, i iVar) {
        super(bVar.C(), bVar.ag(), bVar.W(), bVar.V(), iVar, bVar.b);
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(i iVar) {
        return new b(this, iVar);
    }

    public int D() {
        int iB = b("ad_view_width", -2);
        if (iB != -2) {
            return iB;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public int E() {
        int iB = b("ad_view_height", -2);
        if (iB != -2) {
            return iB;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long F() {
        return b("viewability_imp_delay_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.b.bX)).longValue());
    }

    public boolean G() {
        return H() >= 0;
    }

    public long H() {
        long jB = b("ad_refresh_ms", -1L);
        return jB >= 0 ? jB : a("ad_refresh_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.l)).longValue());
    }

    public boolean I() {
        return b("proe", (Boolean) this.b.a(com.applovin.impl.sdk.c.a.J)).booleanValue();
    }

    public long J() {
        return Utils.parseColor(b("bg_color", (String) null));
    }
}
