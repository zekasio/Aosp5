package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f995a;
    private final MaxAdFormat b;
    private final Map<String, Object> c;
    private final Map<String, Object> d;
    private final Map<String, Object> e;
    private final JSONArray i;
    private final Context j;
    private final a.InterfaceC0058a k;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, JSONArray jSONArray, Context context, p pVar, a.InterfaceC0058a interfaceC0058a) {
        super("TaskFetchMediatedAd " + str, pVar);
        this.f995a = str;
        this.b = maxAdFormat;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.i = jSONArray;
        this.j = context;
        this.k = interfaceC0058a;
    }

    @Override // java.lang.Runnable
    public void run() {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Fetching next ad for ad unit id: " + this.f995a + " and format: " + this.b);
        }
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.ea)).booleanValue() && Utils.isVPNConnected()) {
            y yVar2 = this.h;
            if (y.a()) {
                this.h.b(this.g, "User is connected to a VPN");
            }
        }
        com.applovin.impl.sdk.d.g gVarP = this.f.P();
        gVarP.a(com.applovin.impl.sdk.d.f.p);
        if (gVarP.b(com.applovin.impl.sdk.d.f.d) == 0) {
            gVarP.b(com.applovin.impl.sdk.d.f.d, System.currentTimeMillis());
        }
        try {
            JSONObject jSONObjectH = h();
            Map<String, String> map = CollectionUtils.map();
            map.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
            }
            if (this.f.av().a()) {
                map.put("test_mode", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
            }
            String strC = this.f.av().c();
            String str = this.f.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.FILTER_AD_NETWORK);
            if (StringUtils.isValidString(strC)) {
                map.put("filter_ad_network", strC);
                if (!this.f.av().a()) {
                    map.put("fhkZsVqYC7", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
                }
                if (this.f.av().b()) {
                    map.put("force_ad_network", strC);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            a(gVarP);
            u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f).b("POST").b(c()).a(a()).c(b()).a(map).a(jSONObjectH).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.a.aa)).booleanValue()).a(new JSONObject()).b(((Long) this.f.a(com.applovin.impl.sdk.c.a.f)).intValue()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dj)).intValue()).c(((Long) this.f.a(com.applovin.impl.sdk.c.a.e)).intValue()).a(), this.f) { // from class: com.applovin.impl.mediation.c.c.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i) {
                    if (i != 200) {
                        c.this.a(i, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.e.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.e.b());
                    c.this.a(jSONObject);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i, String str2, JSONObject jSONObject) {
                    c.this.a(i, str2);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.a.c);
            uVar.b(com.applovin.impl.sdk.c.a.d);
            this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
        } catch (Throwable th) {
            y yVar3 = this.h;
            if (y.a()) {
                this.h.b(this.g, "Unable to fetch ad " + this.f995a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }

    private String a() {
        return com.applovin.impl.mediation.d.b.a(this.f);
    }

    private String b() {
        return com.applovin.impl.mediation.d.b.b(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            i.d(jSONObject, this.f);
            i.c(jSONObject, this.f);
            i.e(jSONObject, this.f);
            i.f(jSONObject, this.f);
            com.applovin.impl.mediation.d.b.a(jSONObject, this.f);
            com.applovin.impl.mediation.d.b.a(jSONObject);
            com.applovin.impl.mediation.d.b.b(jSONObject, this.f);
            com.applovin.impl.sdk.h.a(this.f);
            if (this.b != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, null))) {
                y.i(this.g, "Ad format requested does not match ad unit id's format.");
            }
            this.f.M().a(b(jSONObject));
        } catch (Throwable th) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private com.applovin.impl.sdk.e.a b(JSONObject jSONObject) {
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.a.W)).booleanValue()) {
            return new f(this.f995a, this.b, this.c, jSONObject, this.j, this.f, this.k);
        }
        return new e(this.f995a, this.b, this.c, jSONObject, this.j, this.f, this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        MaxErrorImpl maxErrorImpl;
        y yVar = this.h;
        if (y.a()) {
            this.h.e(this.g, "Unable to fetch " + this.f995a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f.P().a(com.applovin.impl.sdk.d.f.q);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        k.a(this.k, this.f995a, maxErrorImpl);
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        long jB = gVar.b(com.applovin.impl.sdk.d.f.d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jB > TimeUnit.MINUTES.toMillis(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dB)).intValue())) {
            gVar.b(com.applovin.impl.sdk.d.f.d, jCurrentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.e);
            gVar.c(com.applovin.impl.sdk.d.f.f);
        }
    }

    private Map<String, String> c() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("AppLovin-Ad-Unit-Id", this.f995a);
        map.put("AppLovin-Ad-Format", this.b.getLabel());
        return map;
    }

    private JSONObject h() throws JSONException {
        Map<String, Object> mapA;
        if (this.f.S() != null) {
            mapA = this.f.S().a(null, false, true);
        } else {
            mapA = this.f.R().a(null, false, true);
        }
        mapA.putAll(this.e);
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f.an().c()));
            jSONObject2.put(TapjoyConstants.TJC_INSTALLED, com.applovin.impl.mediation.d.c.a(this.f));
            jSONObject2.put("initialized", this.f.ao().c());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f.ao().b().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f.an().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f.an().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.i;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f995a);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.b.getLabel());
        Map map = CollectionUtils.map(this.d);
        com.applovin.impl.mediation.a.a aVarA = this.f.at().a(this.f995a);
        if (aVarA != null) {
            if (Boolean.parseBoolean(this.f.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.ENABLE_SEQUENTIAL_CACHING))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarA.Y());
                map.put("previous_winning_network_name", aVarA.getNetworkName());
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f.ap().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null) {
            p pVar = this.f;
            if (Utils.isDspDemoApp(p.y())) {
                JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
            }
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f.C().getExtraParameters()));
    }
}
