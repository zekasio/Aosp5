package com.applovin.impl.mediation.b.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.b.b {
    public static final Uri d = Uri.parse("https://api.taboola.com/");
    private final String e;
    private final Uri f;
    private final Map<String, Object> g;
    private String h;
    private String i;

    public a(String str, String str2, String str3, p pVar) {
        super("TaboolaApiService", pVar);
        this.h = "init";
        this.i = "";
        this.e = str;
        this.f = Uri.withAppendedPath(URLUtil.isValidUrl(str3) ? Uri.parse(str3) : d, "2.0/json/" + str2);
        HashMap map = new HashMap(3);
        this.g = map;
        map.put(TapjoyAuctionFlags.AUCTION_TYPE, TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE);
        map.put("apiKey", str);
        map.put("origin", "SERVER");
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, b bVar) {
        String str = (String) this.f978a.b(com.applovin.impl.mediation.b.c.f983a, null, this.c);
        Long l = (Long) this.f978a.b(com.applovin.impl.mediation.b.c.b, null, this.c);
        if (!StringUtils.isValidString(str) || l == null) {
            a(bVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30L)) - (System.currentTimeMillis() - l.longValue()) > TimeUnit.HOURS.toMillis(1L)) {
            this.i = str;
            bVar.onInitialized(true, null);
        } else {
            a(bVar);
        }
    }

    public void a(final MaxAdapterResponseParameters maxAdapterResponseParameters, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, new JSONObject(this.g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", a(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, FirebaseAnalytics.Param.SOURCE, b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "view", c(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", d(maxAdapterResponseParameters));
        this.f978a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f978a).a(this.f.toString() + "/recommendations.get").b("POST").a(jSONObject).a(new JSONObject()).c(false).d(false).a(), this.f978a) { // from class: com.applovin.impl.mediation.b.b.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i) {
                if (i == 200 && jSONObject2 != null) {
                    a.this.h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject2, "user", new JSONObject()), "session", "");
                    this.f.M().a((com.applovin.impl.sdk.e.a) new c(jSONObject2, maxAdapterResponseParameters, MaxAdFormat.NATIVE, appLovinNativeAdLoadListener, this.f));
                    return;
                }
                y yVar = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i);
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i, "Taboola server returned with code: " + jSONObject2));
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject2) {
                y yVar = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i);
                }
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i, "Taboola server returned with code: " + jSONObject2));
            }
        });
    }

    private void a(final b bVar) {
        HashMap map = new HashMap(2);
        map.put("app.type", TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE);
        map.put("app.apikey", this.e);
        this.f978a.M().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f978a).a(this.f.toString() + "/user.sync").b("GET").a((Map<String, String>) map).a(new JSONObject()).c(false).d(false).a(), this.f978a) { // from class: com.applovin.impl.mediation.b.b.a.2
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                if (i == 200 && jSONObject != null) {
                    a.this.i = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "id", "");
                    this.f.a(com.applovin.impl.mediation.b.c.f983a, a.this.i, a.this.c);
                    this.f.a(com.applovin.impl.mediation.b.c.b, Long.valueOf(System.currentTimeMillis()), a.this.c);
                    bVar.onInitialized(true, null);
                    return;
                }
                String str = "Unable to fetch user id. Server returned " + i;
                y yVar = this.h;
                if (y.a()) {
                    this.h.e(this.g, str);
                }
                bVar.onInitialized(false, str);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                y yVar = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unable to fetch user id. Server returned " + i);
                }
                bVar.onInitialized(false, str);
            }
        });
    }

    private JSONObject d() {
        Map<String, Object> mapH;
        JSONObject jSONObject = new JSONObject();
        if (this.f978a.S() != null) {
            mapH = this.f978a.S().d();
        } else {
            mapH = this.f978a.R().h();
        }
        Object obj = mapH.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(mapH.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    private JSONObject a(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> mapD;
        if (this.f978a.S() != null) {
            mapD = this.f978a.S().b();
        } else {
            mapD = this.f978a.R().d();
        }
        String strValueOf = String.valueOf(mapD.get("ua"));
        String strValueOf2 = String.valueOf(mapD.get("idfa"));
        String str = this.h;
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_session")) {
            Object obj = localExtraParameters.get("taboola_session");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "session", str);
        if (strValueOf == null) {
            strValueOf = "";
        }
        JsonUtils.putString(jSONObject, "agent", strValueOf);
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        JsonUtils.putString(jSONObject, "device", strValueOf2);
        JsonUtils.putString(jSONObject, "id", this.i);
        JsonUtils.putString(jSONObject, "realip", maxAdapterResponseParameters.getServerParameters().getString("s2s_ip", ""));
        return jSONObject;
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, TapjoyAuctionFlags.AUCTION_TYPE, maxAdapterResponseParameters.getCustomParameters().getString("source_type", ""));
        JsonUtils.putString(jSONObject, "id", maxAdapterResponseParameters.getCustomParameters().getString("source_id", ""));
        JsonUtils.putString(jSONObject, "url", maxAdapterResponseParameters.getCustomParameters().getString("source_url", ""));
        return jSONObject;
    }

    private JSONObject c(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", a(maxAdapterResponseParameters, "taboola_view_id", ""));
        return jSONObject;
    }

    private JSONArray d(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer numA = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer numA2 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (numA.intValue() > 0 && numA2.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, TJAdUnitConstants.String.WIDTH, numA.intValue());
                JsonUtils.putInt(jSONObject2, TJAdUnitConstants.String.HEIGHT, numA2.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }
}
