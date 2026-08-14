package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.impl.sdk.utils.h;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q {
    private static final AtomicReference<d.a> h = new AtomicReference<>();
    private static final AtomicReference<a> j = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1412a;
    private final y b;
    private final Context c;
    private final Map<String, Object> d;
    private final Map<String, Object> f;
    private boolean g;
    private final Object e = new Object();
    private final AtomicReference<Integer> i = new AtomicReference<>();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1419a = -1;
        public int b = -1;
    }

    protected q(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1412a = pVar;
        this.b = pVar.L();
        this.c = p.y();
        this.d = q();
        this.f = s();
    }

    String a() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(p()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.fc)).booleanValue()) {
            return strEncodeToString;
        }
        return com.applovin.impl.sdk.utils.n.a(strEncodeToString, this.f1412a.B(), Utils.getServerAdjustedUnixTimestampMillis(this.f1412a));
    }

    private Map<String, String> p() {
        return Utils.stringifyObjectMap(a(null, true, false));
    }

    public Map<String, Object> a(Map<String, String> map, boolean z, boolean z2) {
        Map<String, Object> map2 = CollectionUtils.map(64);
        Map<String, Object> mapA = a(z);
        Map<String, Object> mapH = h();
        Map<String, Object> mapJ = j();
        Map<String, String> allData = this.f1412a.r().getAllData();
        if (z2) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapH);
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (mapJ != null) {
                map2.put("location_info", mapJ);
            }
            if (!allData.isEmpty()) {
                map2.put("targeting_data", allData);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapH);
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
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f1412a.s(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f1412a.a(com.applovin.impl.sdk.c.b.dU), map2);
        if (!((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1412a.B());
        }
        map2.putAll(i());
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.eB)).booleanValue()) {
            com.applovin.impl.sdk.d.g gVarP = this.f1412a.P();
            map2.put("li", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.b)));
            map2.put("si", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.e)));
            map2.put("mad", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.c)));
            map2.put("msad", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.f)));
            map2.put("pf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.j)));
            map2.put("mpf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.q)));
            map2.put("gpf", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.k)));
            map2.put("asoac", Long.valueOf(gVarP.b(com.applovin.impl.sdk.d.f.o)));
        }
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    public Map<String, Object> b() {
        return CollectionUtils.map(this.d);
    }

    public Map<String, Object> c() {
        return CollectionUtils.map(this.f);
    }

    public Map<String, Object> d() {
        return a(false);
    }

    public Map<String, Object> a(boolean z) {
        Map<String, Object> map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return a(map, z);
    }

    public void e() {
        synchronized (this.e) {
            a(this.d);
        }
    }

    public String f() {
        return AppLovinSdkUtils.isFireOS(this.c) ? "fireos" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
    }

    private Map<String, Object> q() {
        Map<String, Object> map = CollectionUtils.map(32);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.sdk.utils.d.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put(TapjoyConstants.TJC_PLATFORM, f());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(B()));
        map.put("gy", Boolean.valueOf(C()));
        map.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, D());
        map.put("mcc", E());
        map.put("mnc", F());
        map.put("carrier", G());
        map.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.c)));
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.c)));
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            Point pointA = com.applovin.impl.sdk.utils.h.a(this.c);
            double dSqrt = Math.sqrt(Math.pow(pointA.x, 2.0d) + Math.pow(pointA.y, 2.0d));
            double d = displayMetrics.xdpi;
            Double.isNaN(d);
            map.put("screen_size_in", Double.valueOf(dSqrt / d));
            h.a aVarA = com.applovin.impl.sdk.utils.h.a(this.c, this.f1412a);
            if (aVarA != null) {
                map.put("tl_cr", Integer.valueOf(aVarA.a()));
                map.put("tr_cr", Integer.valueOf(aVarA.b()));
                map.put("bl_cr", Integer.valueOf(aVarA.c()));
                map.put("br_cr", Integer.valueOf(aVarA.d()));
            }
        }
        map.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        a(map);
        return map;
    }

    private void a(Map<String, Object> map) {
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.eb)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(w()));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ec)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(x()));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f1412a)) {
            af.b(this.f1412a);
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ei)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (!((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ee)).booleanValue() || map.containsKey("network_restricted")) {
            return;
        }
        map.put("network_restricted", Boolean.valueOf(u()));
    }

    private Map<String, Object> a(Map<String, Object> map, boolean z) {
        d.a aVarK;
        PowerManager powerManager;
        Map<String, Object> map2 = CollectionUtils.map(map);
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.c);
        map2.put("dx", Integer.valueOf(pointA.x));
        map2.put("dy", Integer.valueOf(pointA.y));
        if (z) {
            aVarK = h.get();
            if (aVarK != null) {
                m();
            } else if (Utils.isMainThread()) {
                aVarK = new d.a();
                map2.put("inc", true);
            } else {
                aVarK = this.f1412a.R().k();
            }
        } else {
            aVarK = this.f1412a.R().k();
        }
        String strB = aVarK.b();
        if (StringUtils.isValidString(strB)) {
            map2.put("idfa", strB);
        }
        map2.put("dnt", Boolean.valueOf(aVarK.a()));
        map2.put("dnt_code", aVarK.c().a());
        a aVar = j.get();
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue() && aVar != null) {
            map2.put("idfv", aVar.f1418a);
            map2.put("idfv_scope", Integer.valueOf(aVar.b));
        }
        Object objA = com.applovin.impl.b.a.b().a(this.c);
        if (objA != null) {
            map2.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, objA);
        }
        Object objA2 = com.applovin.impl.b.a.a().a(this.c);
        if (objA2 != null) {
            map2.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, objA2);
        }
        Object objA3 = com.applovin.impl.b.a.c().a(this.c);
        if (objA3 != null) {
            map2.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, objA3);
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dV)).booleanValue()) {
            b bVarV = v();
            map2.put("act", Integer.valueOf(bVarV.f1419a));
            map2.put("acm", Integer.valueOf(bVarV.b));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f1412a.Y().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.eg)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(H()));
        }
        Object objA4 = z ? (Integer) this.i.get() : A();
        if (objA4 != null) {
            map2.put(TapjoyConstants.TJC_VOLUME, objA4);
        }
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (y.a()) {
                this.b.b("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ej)).booleanValue() && Utils.isUserAgentCollectionEnabled(this.f1412a)) {
            af.b(this.f1412a);
            String strA = af.a();
            if (StringUtils.isValidString(strA)) {
                map2.put("ua", strA);
            }
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (y.a()) {
                    this.b.b("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dY)).booleanValue()) {
            ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                try {
                    activityManager.getMemoryInfo(memoryInfo);
                    map2.put("fm", Long.valueOf(memoryInfo.availMem));
                    map2.put("tm", Long.valueOf(memoryInfo.totalMem));
                    map2.put("lmt", Long.valueOf(memoryInfo.threshold));
                    map2.put("lm", Boolean.valueOf(memoryInfo.lowMemory));
                } catch (Throwable th2) {
                    map2.put("fm", -1);
                    map2.put("tm", -1);
                    map2.put("lmt", -1);
                    if (y.a()) {
                        this.b.b("DataCollector", "Unable to collect memory info.", th2);
                    }
                }
            }
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue() && com.applovin.impl.sdk.utils.h.a("android.permission.READ_PHONE_STATE", this.c) && com.applovin.impl.sdk.utils.h.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            String strY = y();
            if (!TextUtils.isEmpty(strY)) {
                map2.put("so", strY);
            }
        }
        map2.put("orientation_lock", r());
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ea)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(Utils.isVPNConnected()));
        }
        if (com.applovin.impl.sdk.utils.h.d() && (powerManager = (PowerManager) this.c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ek)).booleanValue() && this.f1412a.ac() != null) {
            map2.put("da", Float.valueOf(this.f1412a.ac().c()));
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.el)).booleanValue() && this.f1412a.ac() != null) {
            map2.put("dm", Float.valueOf(this.f1412a.ac().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f1412a.ad().a()));
        map2.put("network", com.applovin.impl.sdk.utils.i.f(this.f1412a));
        String strZ = z();
        if (StringUtils.isValidString(strZ)) {
            map2.put("kb", strZ);
        }
        ArrayService arrayServiceAi = this.f1412a.ai();
        if (arrayServiceAi.isAppHubInstalled()) {
            map2.put("ah_sdk_version_code", Long.valueOf(arrayServiceAi.getAppHubVersionCode()));
            map2.put("ah_dd_enabled", Boolean.valueOf(arrayServiceAi.isDirectDownloadEnabled()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceAi.getRandomUserToken()));
        }
        return map2;
    }

    private String r() {
        int orientation = AppLovinSdkUtils.getOrientation(this.c);
        if (orientation == 1) {
            return TJAdUnitConstants.String.PORTRAIT;
        }
        if (orientation != 2) {
            return "none";
        }
        return TJAdUnitConstants.String.LANDSCAPE;
    }

    public boolean g() {
        return this.g;
    }

    public Map<String, Object> h() {
        Map<String, Object> map = CollectionUtils.map(this.f);
        map.put("first_install", Boolean.valueOf(this.f1412a.aw()));
        map.put("first_install_v2", Boolean.valueOf(!this.f1412a.u()));
        map.put("test_ads", Boolean.valueOf(this.g));
        map.put("muted", Boolean.valueOf(this.f1412a.C().isMuted()));
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dK)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f1412a.o(), map);
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dN)).booleanValue()) {
            map.put("compass_random_token", this.f1412a.p());
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dP)).booleanValue()) {
            map.put("applovin_random_token", this.f1412a.q());
        }
        String name = this.f1412a.D().getName();
        if (StringUtils.isValidString(name)) {
            map.put("user_segment_name", name);
        }
        map.putAll(t());
        return map;
    }

    private Map<String, Object> s() {
        PackageInfo packageInfo;
        Map<String, Object> map = CollectionUtils.map();
        PackageManager packageManager = this.c.getPackageManager();
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        String installerPackageName = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.c.getPackageName(), 0);
            try {
                installerPackageName = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        Object objValueOf = "";
        map.put(TapjoyConstants.TJC_APP_VERSION_NAME, packageInfo != null ? packageInfo.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        map.put("package_name", applicationInfo.packageName);
        map.put("vz", StringUtils.toShortSHA1Hash(applicationInfo.packageName));
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        map.put("installer_name", installerPackageName);
        map.put("tg", com.applovin.impl.sdk.utils.q.a(this.f1412a));
        map.put(TapjoyConstants.TJC_DEBUG, Boolean.valueOf(Utils.isPubInDebugMode(p.y(), this.f1412a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(p.z()));
        map.put("j8", Boolean.valueOf(p.A()));
        Long l = (Long) this.f1412a.a(com.applovin.impl.sdk.c.d.g);
        if (l != null) {
            map.put("ia_v2", l);
        } else {
            this.f1412a.a(com.applovin.impl.sdk.c.d.g, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f1412a.ag().c());
        map.put("api_did", this.f1412a.a(com.applovin.impl.sdk.c.b.ad));
        if (packageInfo != null) {
            objValueOf = Long.valueOf(packageInfo.firstInstallTime);
        }
        map.put("first_install_v3_ms", objValueOf);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        map.put("epv", Integer.valueOf(Utils.getExoPlayerVersionCode()));
        return map;
    }

    private Map<String, Object> t() {
        Map<String, Object> map = CollectionUtils.map();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
        String str = (String) this.f1412a.b(com.applovin.impl.sdk.c.d.q, null, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            map.put("IABTCF_TCString", str);
        }
        String strA = com.applovin.impl.sdk.c.d.r.a();
        if (defaultSharedPreferences.contains(strA)) {
            String str2 = (String) com.applovin.impl.sdk.c.e.a(strA, "", String.class, defaultSharedPreferences);
            Integer num = (Integer) com.applovin.impl.sdk.c.e.a(strA, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
            Long l = (Long) com.applovin.impl.sdk.c.e.a(strA, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
            Boolean bool = (Boolean) com.applovin.impl.sdk.c.e.a(strA, false, Boolean.class, defaultSharedPreferences);
            if (StringUtils.isValidString(str2)) {
                map.put("IABTCF_gdprApplies", str2);
            } else if (num != null && num.intValue() != Integer.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", num);
            } else if (l != null && l.longValue() != Long.MAX_VALUE) {
                map.put("IABTCF_gdprApplies", l);
            } else {
                map.put("IABTCF_gdprApplies", bool);
            }
        }
        return map;
    }

    public Map<String, Object> i() {
        Map<String, Object> map = CollectionUtils.map();
        map.put("sc", this.f1412a.a(com.applovin.impl.sdk.c.b.ai));
        map.put("sc2", this.f1412a.a(com.applovin.impl.sdk.c.b.aj));
        map.put("sc3", this.f1412a.a(com.applovin.impl.sdk.c.b.ak));
        map.put("server_installed_at", this.f1412a.a(com.applovin.impl.sdk.c.b.al));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f1412a.a(com.applovin.impl.sdk.c.d.H), map);
        return map;
    }

    public Map<String, Object> j() {
        if (!this.f1412a.C().isLocationCollectionEnabled() || !((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.ey)).booleanValue()) {
            return null;
        }
        Map<String, Object> map = CollectionUtils.map();
        x xVarAh = this.f1412a.ah();
        boolean zB = xVarAh.b();
        map.put("loc_services_enabled", Boolean.valueOf(zB));
        if (!zB) {
            return map;
        }
        map.put("loc_auth", Boolean.valueOf(xVarAh.a()));
        if (xVarAh.c()) {
            map.put("loc_lat", Utils.formatDoubleValue(xVarAh.d(), ((Integer) this.f1412a.a(com.applovin.impl.sdk.c.b.eA)).intValue()));
            map.put("loc_long", Utils.formatDoubleValue(xVarAh.e(), ((Integer) this.f1412a.a(com.applovin.impl.sdk.c.b.eA)).intValue()));
        }
        return map;
    }

    private boolean u() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.sdk.utils.h.f() && (connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f1412a.L();
                if (y.a()) {
                    this.f1412a.L().b("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    public d.a k() {
        d.a aVarA = com.applovin.impl.sdk.utils.d.a(this.c);
        if (aVarA == null) {
            return new d.a();
        }
        if (((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dI)).booleanValue()) {
            if (aVarA.a() && !((Boolean) this.f1412a.a(com.applovin.impl.sdk.c.b.dH)).booleanValue()) {
                aVarA.a("");
            }
            h.set(aVarA);
        } else {
            aVarA = new d.a();
        }
        boolean z = false;
        if (StringUtils.isValidString(aVarA.b())) {
            List<String> testDeviceAdvertisingIds = this.f1412a.C().getTestDeviceAdvertisingIds();
            if (testDeviceAdvertisingIds != null && testDeviceAdvertisingIds.contains(aVarA.b())) {
                z = true;
            }
            this.g = z;
        } else {
            this.g = false;
        }
        return aVarA;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.sdk.q.1
            @Override // java.lang.Runnable
            public void run() {
                q.h.set(com.applovin.impl.sdk.utils.d.a(context));
            }
        }).start();
    }

    public a l() {
        return j.get();
    }

    public static void b(final Context context) {
        if (Utils.checkClassExistence("com.google.android.gms.appset.AppSet")) {
            new Thread(new Runnable() { // from class: com.applovin.impl.sdk.q.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.applovin.impl.sdk.q.2.1
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                                q.j.set(new a(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                            }
                        });
                    } catch (Throwable unused) {
                        y.f("DataCollector", "Could not collect AppSet ID.");
                    }
                }
            }).start();
        }
    }

    private b v() {
        b bVar = new b();
        Intent intentRegisterReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra > 0 && intExtra2 > 0) {
            bVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        } else {
            bVar.b = -1;
        }
        bVar.f1419a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return bVar;
    }

    private long w() {
        List listAsList = Arrays.asList(StringUtils.emptyIfNull(Settings.Secure.getString(this.c.getContentResolver(), "enabled_accessibility_services")).split(":"));
        long j2 = listAsList.contains("AccessibilityMenuService") ? 256L : 0L;
        if (listAsList.contains("SelectToSpeakService")) {
            j2 |= 512;
        }
        if (listAsList.contains("SoundAmplifierService")) {
            j2 |= 2;
        }
        if (listAsList.contains("SpeechToTextAccessibilityService")) {
            j2 |= 128;
        }
        if (listAsList.contains("SwitchAccessService")) {
            j2 |= 4;
        }
        if ((this.c.getResources().getConfiguration().uiMode & 48) == 32) {
            j2 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j2 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j2 |= 16;
        }
        if (com.applovin.impl.sdk.utils.h.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j2 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j2 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j2 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j2 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j2 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j2 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j2 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j2 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j2 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j2 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j2 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j2 |= 1048576;
        }
        if (a("accessibility_autoclick_enabled")) {
            j2 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j2 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j2 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j2 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j2 |= 33554432;
        }
        return a("rtt_calling_mode") ? j2 | 67108864 : j2;
    }

    private boolean a(String str) {
        try {
            return Settings.Secure.getInt(this.c.getContentResolver(), str) == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    private float x() {
        try {
            return Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!y.a()) {
                return -1.0f;
            }
            this.b.b("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private String y() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (com.applovin.impl.sdk.utils.h.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("3,");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append("7,");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && y.a()) {
            this.b.b("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private String z() {
        if (!com.applovin.impl.sdk.utils.h.f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer A() {
        if (((AudioManager) this.c.getSystemService("audio")) == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (r0.getStreamVolume(3) * ((Float) this.f1412a.a(com.applovin.impl.sdk.c.b.eh)).floatValue()));
        } catch (Throwable th) {
            this.f1412a.L();
            if (y.a()) {
                this.f1412a.L().b("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private double B() {
        double offset = TimeZone.getDefault().getOffset(new Date().getTime());
        Double.isNaN(offset);
        double dRound = Math.round((offset * 10.0d) / 3600000.0d);
        Double.isNaN(dRound);
        return dRound / 10.0d;
    }

    private boolean C() {
        SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private String D() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String E() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (y.a()) {
                    this.b.b("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String F() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (y.a()) {
                    this.b.b("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String G() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (y.a()) {
                    this.b.b("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private boolean H() {
        try {
            if (!I()) {
                if (!J()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean I() {
        String str = Build.TAGS;
        return str != null && str.contains(b("lz}$blpz"));
    }

    private boolean J() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(b(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    private String b(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    public void m() {
        this.f1412a.M().a(new com.applovin.impl.sdk.e.f(this.f1412a, new f.a() { // from class: com.applovin.impl.sdk.q.3
            @Override // com.applovin.impl.sdk.e.f.a
            public void a(d.a aVar) {
                q.h.set(aVar);
            }
        }), o.a.ADVERTISING_INFO_COLLECTION);
        this.f1412a.M().a(new com.applovin.impl.sdk.e.z(this.f1412a, true, new Runnable() { // from class: com.applovin.impl.sdk.q.4
            @Override // java.lang.Runnable
            public void run() {
                q.this.i.set(q.this.A());
            }
        }), o.a.CACHING_OTHER);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1418a;
        public final int b;

        public a(String str, int i) {
            this.f1418a = str;
            this.b = i;
        }
    }
}
