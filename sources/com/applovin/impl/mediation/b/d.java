package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.Advertisement;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends com.applovin.impl.sdk.e.a {
    private static JSONObject i;
    private static JSONObject j;
    private static JSONObject k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JSONObject f984a;
    protected final MaxAdapterResponseParameters b;
    protected final MaxAdFormat c;
    protected final p d;
    protected String e;
    private final AppLovinAdSize l;
    private final AppLovinAdType m;

    protected abstract JSONObject a();

    public d(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, p pVar) {
        super(str, pVar);
        this.f984a = jSONObject;
        this.b = maxAdapterResponseParameters;
        this.c = maxAdFormat;
        this.d = pVar;
        this.l = a(maxAdFormat);
        this.m = b(maxAdFormat);
    }

    protected JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.e);
        JsonUtils.putInt(jSONObject2, "status", 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, "ads", jSONArray);
        return jSONObject2;
    }

    protected JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectB = b();
        JsonUtils.putAll(jSONObjectB, JsonUtils.deserialize(this.b.getServerParameters().getString("ad_object")));
        JsonUtils.putString(jSONObjectB, TJAdUnitConstants.String.HTML, str);
        JsonUtils.putJSONObject(jSONObjectB, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(jSONObjectB, "imp_urls", jSONObject2);
        return jSONObjectB;
    }

    protected JSONObject a(a aVar) {
        JSONObject jSONObjectC = c();
        JsonUtils.putAll(jSONObjectC, JsonUtils.deserialize(this.b.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(jSONObjectC, "ortb_response", b(aVar));
        return jSONObjectC;
    }

    private JSONObject b() {
        JSONObject jSONObject = i;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", Advertisement.FILE_SCHEME);
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        i = jSONObject2;
        return jSONObject2;
    }

    private JSONObject c() {
        JSONObject jSONObject = j;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", h());
        j = jSONObject2;
        return jSONObject2;
    }

    private JSONObject b(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, "assets", c(aVar));
        JsonUtils.putJSONObject(jSONObject, "link", d(aVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", e(aVar));
        JsonUtils.putString(jSONObject, "ver", aVar.b());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, TapjoyConstants.TJC_PLUGIN_NATIVE, jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, ClientCookie.VERSION_ATTR, aVar.b());
        JsonUtils.putJSONObject(jSONObject3, "value", jSONObject2);
        return jSONObject3;
    }

    private JSONArray c(a aVar) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "id", 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "text", aVar.c());
        JsonUtils.putJSONObject(jSONObject, TJAdUnitConstants.String.TITLE, jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, "id", 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, "value", aVar.d());
        JsonUtils.putJSONObject(jSONObject3, TJAdUnitConstants.String.DATA, jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, "id", 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, "value", aVar.e());
        JsonUtils.putJSONObject(jSONObject5, TJAdUnitConstants.String.DATA, jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(aVar.f())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, "id", 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, "url", aVar.f());
            JsonUtils.putInt(jSONObject8, "w", aVar.g());
            JsonUtils.putInt(jSONObject8, "h", aVar.h());
            JsonUtils.putJSONObject(jSONObject7, "img", jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    private JSONObject d(a aVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "url", aVar.i());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", aVar.j());
        return jSONObject;
    }

    private JSONArray e(a aVar) {
        JSONArray jSONArray = new JSONArray();
        for (String str : aVar.l()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "url", str);
            JsonUtils.putInt(jSONObject, "event", 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String str2 : aVar.k()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "url", str2);
            JsonUtils.putInt(jSONObject2, TapjoyAuctionFlags.AUCTION_TYPE, 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd() || MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.REGULAR;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdType.NATIVE;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            return AppLovinAdType.INCENTIVIZED;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.AUTO_INCENTIVIZED;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            return AppLovinAdType.APP_OPEN;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private static JSONObject h() {
        JSONObject jSONObject = k;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        k = jSONObject2;
        return jSONObject2;
    }
}
