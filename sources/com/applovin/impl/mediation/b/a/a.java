package com.applovin.impl.mediation.b.a;

import android.text.TextUtils;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.mediation.b.c;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {
    private final String d;
    private final String e;
    private final String f;
    private String g;

    public a(String str, String str2, String str3, p pVar) {
        super("NimbusApiService", pVar);
        this.d = str;
        this.g = UUID.randomUUID().toString().toLowerCase(Locale.US);
        pVar.L();
        if (y.a()) {
            pVar.L().b(this.b, "Initializing Nimbus with apiKey=" + str + ", pubId=" + str2 + ", sessionId=" + this.g);
        }
        this.e = "https://" + str2 + "." + (StringUtils.isValidString(str3) ? str3 : "adsbynimbus.com/rta/v1");
        String string = (String) pVar.b(c.c, null, this.c);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            pVar.a(c.c, string, this.c);
        }
        this.f = string;
        pVar.L();
        if (y.a()) {
            pVar.L().b(this.b, "Setting Nimbus instanceId=" + string);
        }
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        a((MaxAdapterParameters) maxAdapterInitializationParameters);
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final AppLovinAdLoadListener appLovinAdLoadListener) {
        Map<String, Object> mapD;
        this.f978a.L();
        if (y.a()) {
            this.f978a.L().b(this.b, "Loading Nimbus " + maxAdFormat.getLabel() + " ad with position: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        }
        a(maxAdapterResponseParameters);
        if (this.f978a.S() != null) {
            mapD = this.f978a.S().b();
        } else {
            mapD = this.f978a.R().d();
        }
        HashMap map = new HashMap();
        map.put("x-openrtb-version", "2.5");
        map.put("Nimbus-Api-Key", this.d);
        map.put("Nimbus-Sdkv", "2.0.0");
        map.put("Nimbus-Instance-Id", this.f);
        map.put("User-Agent", String.valueOf(mapD.get("ua")));
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, TapjoyConstants.TJC_SESSION_ID, this.g);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "position", maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        this.f978a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(a(this.e, UUID.randomUUID().toString().toLowerCase(Locale.US), maxAdapterResponseParameters, maxAdFormat, b.a.a().a(jSONObject).d(a()).b(jSONObject2).c(b()).a(), map, true, this.f978a), this.f978a) { // from class: com.applovin.impl.mediation.b.a.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject3, int i) {
                if (i == 200 && jSONObject3 != null) {
                    this.f.M().a((com.applovin.impl.sdk.e.a) new b(jSONObject3, maxAdapterResponseParameters, maxAdFormat, a.this.g, appLovinAdLoadListener, this.f));
                    return;
                }
                y yVar = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i);
                }
                appLovinAdLoadListener.failedToReceiveAd(i);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject3) {
                if (jSONObject3 != null && "No Bid".equalsIgnoreCase(JsonUtils.getString(jSONObject3, TJAdUnitConstants.String.MESSAGE, null))) {
                    Object object = JsonUtils.getObject(jSONObject3, "nbr", null);
                    y yVar = this.h;
                    if (y.a()) {
                        this.h.e(this.g, "Nimbus request for " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " returned with no fill code: " + object);
                    }
                    appLovinAdLoadListener.failedToReceiveAd(204);
                }
                y yVar2 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Nimbus ad: server returned " + i);
                }
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
        });
    }

    private void a(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get(TapjoyConstants.TJC_SESSION_ID);
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isValidString(str)) {
                this.f978a.L();
                if (y.a()) {
                    this.f978a.L().b(this.b, "Updating Nimbus sessionId to " + obj);
                }
                this.g = str;
            }
        }
    }
}
