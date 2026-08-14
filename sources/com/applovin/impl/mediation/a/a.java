package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.applovin.impl.mediation.i;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f implements MaxAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected i f942a;
    private final int c;
    private final AtomicBoolean d;
    private final AtomicBoolean e;
    private final String f;
    private MaxAdWaterfallInfo g;
    private long h;
    private String i;
    private String j;
    private com.applovin.mediation.hybridAds.c k;

    public abstract a a(i iVar);

    public int C() {
        return this.c;
    }

    public static a a(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new b(i, map, jSONObject, jSONObject2, pVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new d(i, map, jSONObject, jSONObject2, pVar);
        }
        if (fromString.isFullscreenAd()) {
            return new c(i, map, jSONObject, jSONObject2, pVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    protected a(int i, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, i iVar, p pVar) {
        super(map, jSONObject, jSONObject2, pVar);
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        this.c = i;
        this.f942a = iVar;
        this.f = iVar != null ? iVar.i() : null;
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.g = maxAdWaterfallInfo;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.g;
    }

    public void a(long j) {
        this.h = j;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.h;
    }

    public void a(String str) {
        this.i = str;
    }

    public String a() {
        return this.i;
    }

    public void b(String str) {
        this.j = str;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.j;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b(FirebaseAnalytics.Param.AD_FORMAT, a(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iB = b("ad_width", -3);
        int iB2 = b("ad_height", -3);
        if (iB == -3 || iB2 == -3) {
            return getFormat().getSize();
        }
        return new AppLovinSdkUtils.Size(iB, iB2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(s());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.a.U)).booleanValue() && getFormat().isFullscreenAd() && !z().get()) {
            this.b.L();
            if (!y.a()) {
                return 0.0d;
            }
            this.b.L().e("MediatedAd", "Attempting to retrieve revenue when not available yet");
            return 0.0d;
        }
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return b("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return b("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectC = c();
        if (jSONObjectC.has(str)) {
            return JsonUtils.getString(jSONObjectC, str, str2);
        }
        Bundle bundleAh = ah();
        if (bundleAh.containsKey(str)) {
            return bundleAh.getString(str);
        }
        JSONObject jSONObjectD = d();
        if (jSONObjectD.has(str)) {
            return JsonUtils.getString(jSONObjectD, str, str2);
        }
        return b(str, str2);
    }

    public double b() {
        return b(FirebaseAnalytics.Param.PRICE, -1.0f);
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectC = c();
        JsonUtils.putAll(jSONObjectC, jSONObject);
        a(Utils.KEY_AD_VALUES, (Object) jSONObjectC);
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectD = d();
        JsonUtils.putAll(jSONObjectD, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectD);
    }

    public JSONObject c() {
        return a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    public JSONObject d() {
        return a("publisher_extra_info", new JSONObject());
    }

    public JSONObject e() {
        return a("revenue_parameters", new JSONObject());
    }

    public String f() {
        return JsonUtils.getString(e(), "revenue_event", "");
    }

    public boolean g() {
        i iVar = this.f942a;
        return iVar != null && iVar.f() && this.f942a.g();
    }

    public String h() {
        return a("event_id", "");
    }

    public i i() {
        return this.f942a;
    }

    public String j() {
        return this.f;
    }

    public Bundle k() {
        JSONObject jSONObjectA;
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", s());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public String l() {
        return b("bid_response", (String) null);
    }

    public boolean m() {
        return StringUtils.isValidString(l());
    }

    public long n() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, ah()));
    }

    public boolean o() {
        return b("is_js_tag_ad", (Boolean) false).booleanValue();
    }

    public MaxAdFormat p() {
        String strB = b("haf", (String) null);
        if (StringUtils.isValidString(strB)) {
            return MaxAdFormat.formatFromString(strB);
        }
        return null;
    }

    public com.applovin.mediation.hybridAds.c q() {
        com.applovin.mediation.hybridAds.c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        com.applovin.mediation.hybridAds.c cVar2 = new com.applovin.mediation.hybridAds.c(a("hybrid_ad_config", (JSONObject) null));
        this.k = cVar2;
        return cVar2;
    }

    public View r() {
        i iVar;
        if (!g() || (iVar = this.f942a) == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        i iVar = this.f942a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public String s() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String t() {
        return a("waterfall_name", "");
    }

    public String u() {
        return a("waterfall_test_name", "");
    }

    public long v() {
        if (D() > 0) {
            return x() - D();
        }
        return -1L;
    }

    private long D() {
        return b("load_started_time_ms", 0L);
    }

    public void w() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long x() {
        return b("load_completed_time_ms", 0L);
    }

    public void y() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean z() {
        return this.d;
    }

    public AtomicBoolean A() {
        return this.e;
    }

    public void B() {
        this.f942a = null;
        this.g = null;
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(Utils.KEY_AD_VALUES)) {
            a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            b(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + s() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
