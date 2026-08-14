package com.applovin.impl.sdk;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1420a;
    private final s c;
    private final Object e = new Object();
    private final Object g = new Object();
    private final Context b = p.y();
    private final Map<String, Object> d = i();
    private final Map<String, Object> f = k();

    public Map<String, Object> f() {
        return this.d;
    }

    public Map<String, Object> g() {
        return this.f;
    }

    protected r(p pVar) {
        this.f1420a = pVar;
        this.c = pVar.Q();
    }

    protected String a() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(h()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.fc)).booleanValue()) {
            return strEncodeToString;
        }
        return com.applovin.impl.sdk.utils.n.a(strEncodeToString, this.f1420a.B(), Utils.getServerAdjustedUnixTimestampMillis(this.f1420a));
    }

    private Map<String, String> h() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    public Map<String, Object> a(Map<String, String> map, boolean z, boolean z2) {
        Map<String, Object> map2;
        Map<String, Object> mapA = a(z);
        Map<String, Object> mapD = d();
        Map<String, Object> mapJ = j();
        Map<String, String> allData = this.f1420a.r().getAllData();
        Map<String, Object> mapE = e();
        if (z2) {
            map2 = CollectionUtils.map(mapE.size() + 19);
            map2.put("device_info", mapA);
            map2.put("app_info", mapD);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapJ != null) {
                map2.put("location_info", mapJ);
            }
            if (allData != null) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2 = CollectionUtils.map(mapA.size() + 14 + mapD.size() + (map != null ? map.size() : 0) + (mapJ != null ? mapJ.size() : 0) + allData.size() + mapE.size());
            map2.putAll(mapA);
            map2.putAll(mapD);
            if (map != null) {
                map2.putAll(map);
            }
            if (mapJ != null) {
                map2.putAll(mapJ);
            }
            if (!allData.isEmpty()) {
                map2.putAll(allData);
            }
        }
        map2.putAll(mapE);
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f1420a.s(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.dU), map2);
        CollectionUtils.putStringIfValid("rid", UUID.randomUUID().toString(), map2);
        if (!((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            CollectionUtils.putStringIfValid(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1420a.B(), map2);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.eB)).booleanValue()) {
            com.applovin.impl.sdk.d.g gVarP = this.f1420a.P();
            CollectionUtils.putLongIfValid("li", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.b)), map2);
            CollectionUtils.putLongIfValid("si", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.e)), map2);
            CollectionUtils.putLongIfValid("mad", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.c)), map2);
            CollectionUtils.putLongIfValid("msad", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.f)), map2);
            CollectionUtils.putLongIfValid("pf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.j)), map2);
            CollectionUtils.putLongIfValid("mpf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.q)), map2);
            CollectionUtils.putLongIfValid("gpf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.k)), map2);
            CollectionUtils.putLongIfValid("asoac", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.o)), map2);
        }
        return map2;
    }

    public Map<String, Object> b() {
        return a(false);
    }

    public Map<String, Object> a(boolean z) {
        Map<String, Object> map;
        d.a aVarD;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        if (z) {
            aVarD = this.c.b();
            if (aVarD != null) {
                this.c.e();
            } else if (Utils.isMainThread()) {
                aVarD = new d.a();
                map.put("inc", true);
            } else {
                aVarD = this.f1420a.Q().d();
            }
        } else {
            aVarD = this.f1420a.Q().d();
        }
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, com.applovin.impl.b.a.b().a(this.b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, com.applovin.impl.b.a.a().a(this.b), map);
        CollectionUtils.putBooleanIfValid(AppLovinSdkExtraParameterKey.DO_NOT_SELL, com.applovin.impl.b.a.c().a(this.b), map);
        CollectionUtils.putBooleanIfValid("dnt", Boolean.valueOf(aVarD.a()), map);
        CollectionUtils.putStringIfValid("dnt_code", aVarD.c().a(), map);
        CollectionUtils.putStringIfValid("idfa", aVarD.b(), map);
        s.b bVarA = this.c.a();
        if (bVarA != null) {
            CollectionUtils.putStringIfValid("idfv", bVarA.a(), map);
            CollectionUtils.putIntegerIfValid("idfv_scope", Integer.valueOf(bVarA.b()), map);
        }
        CollectionUtils.putIntegerIfValid(TapjoyConstants.TJC_VOLUME, z ? this.c.c() : this.c.r().b(), map);
        CollectionUtils.putIntegerIfValid("lpm", this.c.p().a(), map);
        CollectionUtils.putIntegerIfValid("sb", this.c.j(), map);
        CollectionUtils.putIntegerIfValid("mute_switch", Integer.valueOf(this.c.r().a()), map);
        CollectionUtils.putLongIfValid("fs", this.c.g(), map);
        CollectionUtils.putStringIfValid("network", this.c.f(), map);
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dY)).booleanValue()) {
            CollectionUtils.putLongIfValid("fm", this.c.u().a(), map);
            CollectionUtils.putLongIfValid("lmt", this.c.u().b(), map);
            CollectionUtils.putBooleanIfValid("lm", this.c.u().c(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("rat", this.c.q().a(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            CollectionUtils.putStringIfValid("so", this.c.r().c(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ea)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("vs", Boolean.valueOf(this.c.m()), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ek)).booleanValue()) {
            CollectionUtils.putFloatIfValid("da", this.c.h(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            CollectionUtils.putFloatIfValid("dm", this.c.i(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dV)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("act", this.c.s().b(), map);
            CollectionUtils.putIntegerIfValid("acm", this.c.s().a(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.eg)).booleanValue()) {
            CollectionUtils.putBooleanIfValid("adr", Boolean.valueOf(this.c.o()), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            CollectionUtils.putIntegerIfValid("mtl", Integer.valueOf(this.f1420a.Y().getLastTrimMemoryLevel()), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f1420a)) {
            af.b(this.f1420a);
            CollectionUtils.putStringIfValid("ua", af.a(), map);
        }
        ArrayService arrayServiceAi = this.f1420a.ai();
        if (!arrayServiceAi.isAppHubInstalled()) {
            CollectionUtils.putLongIfValid("ah_sdk_version_code", Long.valueOf(arrayServiceAi.getAppHubVersionCode()), map);
            CollectionUtils.putBooleanIfValid("ah_dd_enabled", Boolean.valueOf(arrayServiceAi.isDirectDownloadEnabled()), map);
            CollectionUtils.putStringIfValid("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceAi.getRandomUserToken()), map);
        }
        return map;
    }

    public void c() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    private Map<String, Object> i() {
        Map<String, Object> map = CollectionUtils.map(35);
        CollectionUtils.putStringIfValid("kb", this.c.z(), map);
        CollectionUtils.putBooleanIfValid("gy", Boolean.valueOf(this.c.y()), map);
        CollectionUtils.putDoubleIfValid("tz_offset", Double.valueOf(this.c.x()), map);
        CollectionUtils.putLongIfValid("tm", Long.valueOf(this.c.u().d()), map);
        CollectionUtils.putLongIfValid("tds", Long.valueOf(this.c.A()), map);
        CollectionUtils.putStringIfValid(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.c.q().b(), map);
        CollectionUtils.putStringIfValid("carrier", this.c.q().c(), map);
        CollectionUtils.putStringIfValid("mcc", this.c.q().d(), map);
        CollectionUtils.putStringIfValid("mnc", this.c.q().e(), map);
        CollectionUtils.putIntegerIfValid("adnsd", Integer.valueOf(this.c.t().c()), map);
        CollectionUtils.putIntegerIfValid("dx", Integer.valueOf(this.c.t().a()), map);
        CollectionUtils.putIntegerIfValid("dy", Integer.valueOf(this.c.t().b()), map);
        CollectionUtils.putFloatIfValid("adns", Float.valueOf(this.c.t().f()), map);
        CollectionUtils.putFloatIfValid("xdpi", Float.valueOf(this.c.t().d()), map);
        CollectionUtils.putFloatIfValid("ydpi", Float.valueOf(this.c.t().e()), map);
        CollectionUtils.putDoubleIfValid("screen_size_in", Double.valueOf(this.c.t().g()), map);
        CollectionUtils.putStringIfValid("orientation_lock", this.c.w(), map);
        CollectionUtils.putIntegerIfValid("api_level", Integer.valueOf(Build.VERSION.SDK_INT), map);
        CollectionUtils.putStringIfValid("brand", Build.MANUFACTURER, map);
        CollectionUtils.putStringIfValid("brand_name", Build.BRAND, map);
        CollectionUtils.putStringIfValid("hardware", Build.HARDWARE, map);
        CollectionUtils.putStringIfValid("locale", Locale.getDefault().toString(), map);
        CollectionUtils.putStringIfValid("model", Build.MODEL, map);
        CollectionUtils.putStringIfValid("os", Build.VERSION.RELEASE, map);
        CollectionUtils.putStringIfValid("revision", Build.DEVICE, map);
        CollectionUtils.putStringIfValid(TapjoyConstants.TJC_PLATFORM, AppLovinSdkUtils.isFireOS(this.b) ? "fireos" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE, map);
        CollectionUtils.putBooleanIfValid("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()), map);
        CollectionUtils.putBooleanIfValid("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()), map);
        CollectionUtils.putBooleanIfValid("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.b)), map);
        CollectionUtils.putBooleanIfValid("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.b)), map);
        CollectionUtils.putLongIfValid("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()), map);
        a(map);
        return map;
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f1420a)) {
            af.b(this.f1420a);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.eb)).booleanValue() && !map.containsKey("af")) {
            CollectionUtils.putLongIfValid("af", Long.valueOf(this.c.k()), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ec)).booleanValue() && !map.containsKey("font")) {
            CollectionUtils.putFloatIfValid("font", Float.valueOf(this.c.l()), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && !map.containsKey("sua")) {
            CollectionUtils.putStringIfValid("sua", System.getProperty("http.agent"), map);
        }
        if (!((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ee)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        CollectionUtils.putBooleanIfValid("network_restricted", Boolean.valueOf(this.c.n()), map);
    }

    private Map<String, Object> j() {
        if (!this.f1420a.C().isLocationCollectionEnabled() || !((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map(4);
        x xVarAh = this.f1420a.ah();
        boolean zB = xVarAh.b();
        CollectionUtils.putBooleanIfValid("loc_services_enabled", Boolean.valueOf(zB), map);
        if (!zB) {
            return map;
        }
        CollectionUtils.putBooleanIfValid("loc_auth", Boolean.valueOf(xVarAh.a()), map);
        if (!this.f1420a.ah().c()) {
            return map;
        }
        CollectionUtils.putStringIfValid("loc_lat", Utils.formatDoubleValue(xVarAh.d(), ((Integer) this.f1420a.a(com.applovin.impl.sdk.c.b.eA)).intValue()), map);
        CollectionUtils.putStringIfValid("loc_long", Utils.formatDoubleValue(xVarAh.e(), ((Integer) this.f1420a.a(com.applovin.impl.sdk.c.b.eA)).intValue()), map);
        return map;
    }

    public Map<String, Object> d() {
        Map<String, Object> map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        CollectionUtils.putBooleanIfValid("test_ads", Boolean.valueOf(this.c.D()), map);
        CollectionUtils.putBooleanIfValid("muted", Boolean.valueOf(this.f1420a.C().isMuted()), map);
        CollectionUtils.putStringIfValid("user_segment_name", this.f1420a.D().getName(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.c.C().a(), map);
        Object objB = this.c.C().b();
        if (objB != null) {
            map.put("IABTCF_gdprApplies", objB);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dK)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f1420a.o(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dN)).booleanValue()) {
            CollectionUtils.putStringIfValid("compass_random_token", this.f1420a.p(), map);
        }
        if (((Boolean) this.f1420a.a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            CollectionUtils.putStringIfValid("applovin_random_token", this.f1420a.q(), map);
        }
        return map;
    }

    private Map<String, Object> k() {
        Map<String, Object> map = CollectionUtils.map(21);
        CollectionUtils.putStringIfValid("app_name", this.c.B().b(), map);
        CollectionUtils.putStringIfValid(TapjoyConstants.TJC_APP_VERSION_NAME, this.c.B().c(), map);
        CollectionUtils.putStringIfValid("package_name", this.c.B().d(), map);
        CollectionUtils.putStringIfValid("vz", this.c.B().e(), map);
        CollectionUtils.putStringIfValid("installer_name", this.c.B().f(), map);
        CollectionUtils.putIntegerIfValid("app_version_code", Integer.valueOf(this.c.B().i()), map);
        CollectionUtils.putIntegerIfValid("target_sdk", Integer.valueOf(this.c.B().j()), map);
        CollectionUtils.putLongIfValid("first_install_v3_ms", this.c.B().g(), map);
        CollectionUtils.putLongIfValid("ia", Long.valueOf(this.c.B().h()), map);
        CollectionUtils.putLongIfValid("ia_v2", this.c.B().a(), map);
        CollectionUtils.putStringIfValid("tg", com.applovin.impl.sdk.utils.q.a(this.f1420a), map);
        CollectionUtils.putStringIfValid("sdk_version", AppLovinSdk.VERSION, map);
        CollectionUtils.putStringIfValid("omid_sdk_version", this.f1420a.ag().c(), map);
        CollectionUtils.putStringIfValid("api_did", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.ad), map);
        CollectionUtils.putBooleanIfValid(TapjoyConstants.TJC_DEBUG, Boolean.valueOf(Utils.isPubInDebugMode(this.b, this.f1420a)), map);
        CollectionUtils.putBooleanIfValid("j8", Boolean.valueOf(p.A()), map);
        CollectionUtils.putBooleanIfValid("first_install", Boolean.valueOf(this.f1420a.aw()), map);
        CollectionUtils.putBooleanIfValid("first_install_v2", Boolean.valueOf(!this.f1420a.u()), map);
        CollectionUtils.putIntegerIfValid("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()), map);
        CollectionUtils.putLongIfValid("alts_ms", Long.valueOf(p.z()), map);
        return map;
    }

    public Map<String, Object> e() {
        Map<String, Object> map = CollectionUtils.map(5);
        CollectionUtils.putStringIfValid("sc", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.ai), map);
        CollectionUtils.putStringIfValid("sc2", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.aj), map);
        CollectionUtils.putStringIfValid("sc3", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.ak), map);
        CollectionUtils.putStringIfValid("server_installed_at", (String) this.f1420a.a(com.applovin.impl.sdk.c.b.al), map);
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f1420a.a(com.applovin.impl.sdk.c.d.H), map);
        return map;
    }
}
