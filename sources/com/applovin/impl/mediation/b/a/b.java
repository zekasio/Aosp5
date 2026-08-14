package com.applovin.impl.mediation.b.a;

import android.text.TextUtils;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.s;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.tapjoy.TapjoyAuctionFlags;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends d implements AppLovinAdLoadListener {
    private final String i;
    private final AppLovinAdLoadListener j;
    private String k;
    private JSONObject l;
    private JSONObject m;
    private String n;

    public b(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, p pVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, pVar);
        this.i = str;
        this.j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = JsonUtils.getString(this.f984a, "markup", "");
        this.k = string;
        if (TextUtils.isEmpty(string)) {
            this.j.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(this.f984a, "position", "");
        String string3 = JsonUtils.getString(this.f984a, "placement_id", "");
        String string4 = JsonUtils.getString(this.f984a, "auction_id", "");
        y yVar = this.h;
        if (y.a()) {
            this.h.b("TaskProcessNimbusAd", "Processing Nimbus ad (" + string2 + ") for placement: " + string3 + " with auction id: " + string4 + "...");
        }
        this.e = JsonUtils.getString(this.f984a, "network", "");
        this.n = JsonUtils.getString(this.f984a, "crid", null);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f984a, "trackers", new JSONObject());
        this.m = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", null));
        this.l = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", null));
        JSONObject jSONObjectA = a();
        JSONObject jSONObjectA2 = a(jSONObjectA);
        y yVar2 = this.h;
        if (y.a()) {
            this.h.b("TaskProcessNimbusAd", "Starting render task for Nimbus ad: " + string2 + "...");
        }
        this.d.M().a(new s(jSONObjectA, jSONObjectA2, com.applovin.impl.sdk.ad.b.UNKNOWN, this.j, this.d), o.a.MAIN);
    }

    @Override // com.applovin.impl.mediation.b.d
    protected JSONObject a() {
        JSONObject jSONObjectA = a(this.k, this.m, this.l);
        JsonUtils.putString(jSONObjectA, "cache_prefix", "nimbus");
        JsonUtils.putString(jSONObjectA, TapjoyAuctionFlags.AUCTION_TYPE, "nimbus");
        JsonUtils.putJSONObject(jSONObjectA, "http_headers_for_postbacks", b());
        return jSONObjectA;
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, "");
                }
            } catch (JSONException e) {
                this.d.L();
                if (y.a()) {
                    this.d.L().b(this.g, "Failed to retrieve tracking url with a non-String value.", e);
                }
            }
        }
        return jSONObject;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.i);
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue("creative_id", this.n);
        this.j.adReceived(appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        this.j.failedToReceiveAd(i);
    }
}
