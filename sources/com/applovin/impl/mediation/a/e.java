package com.applovin.impl.mediation.a;

import com.applovin.impl.mediation.i;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {
    protected e(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, i iVar, p pVar) {
        super(i, map, jSONObject, jSONObject2, iVar, pVar);
    }

    public int L() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.bY;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.ca;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.cc;
        } else {
            bVar = format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.ce : null;
        }
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.b.a(bVar)).intValue());
        }
        return 0;
    }

    public int M() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.bZ;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.cb;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.cd;
        } else {
            bVar = format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.cf : null;
        }
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.b.a(bVar)).intValue());
        }
        return 0;
    }

    public float N() {
        return a("viewability_min_alpha", ((Float) this.b.a(com.applovin.impl.sdk.c.a.cg)).floatValue() / 100.0f);
    }

    public int O() {
        return b("viewability_min_pixels", -1);
    }

    public float P() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float R() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public boolean T() {
        return O() >= 0 || P() >= 0.0f || R() >= 0.0f;
    }

    public long U() {
        return b("viewability_timer_min_visible_ms", ((Long) this.b.a(com.applovin.impl.sdk.c.a.ch)).longValue());
    }
}
