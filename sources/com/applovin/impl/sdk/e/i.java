package com.applovin.impl.sdk.e;

import android.app.ActivityManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.d;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f1293a = new AtomicBoolean();
    private final int b;
    private final Object c;
    private a d;

    public interface a {
        void a(JSONObject jSONObject);
    }

    public i(int i, com.applovin.impl.sdk.p pVar, a aVar) {
        super("TaskFetchBasicSettings", pVar, true);
        this.c = new Object();
        this.b = i;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.sdk.utils.h.i() && f1293a.compareAndSet(false, true)) {
            try {
                com.applovin.impl.sdk.p pVar = this.f;
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.p.y());
            } catch (Throwable th) {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "Cannot update security provider", th);
                }
            }
        }
        Map<String, String> mapA = a();
        com.applovin.impl.sdk.network.c cVarA = com.applovin.impl.sdk.network.c.a(this.f).a(c()).c(h()).a(mapA).a(b()).d(((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fh)).booleanValue()).b("POST").a(new JSONObject()).a(((Integer) this.f.a(com.applovin.impl.sdk.c.b.dp)).intValue()).c(((Integer) this.f.a(com.applovin.impl.sdk.c.b.ds)).intValue()).b(((Integer) this.f.a(com.applovin.impl.sdk.c.b.f0do)).intValue()).a();
        this.f.M().a(new b(this.f), o.a.TIMEOUT, ((long) ((Integer) this.f.a(com.applovin.impl.sdk.c.b.f0do)).intValue()) + 250);
        u<JSONObject> uVar = new u<JSONObject>(cVarA, this.f, g()) { // from class: com.applovin.impl.sdk.e.i.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                i.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                com.applovin.impl.sdk.y yVar2 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                i.this.a(jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bd);
        uVar.b(com.applovin.impl.sdk.c.b.be);
        this.f.M().a((com.applovin.impl.sdk.e.a) uVar);
    }

    protected Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f.B());
        }
        Boolean boolA = com.applovin.impl.b.a.b().a(f());
        if (boolA != null) {
            map.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, boolA.toString());
        }
        Boolean boolA2 = com.applovin.impl.b.a.a().a(f());
        if (boolA2 != null) {
            map.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, boolA2.toString());
        }
        Boolean boolA3 = com.applovin.impl.b.a.c().a(f());
        if (boolA3 != null) {
            map.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, boolA3.toString());
        }
        return map;
    }

    protected JSONObject b() {
        Map<String, Object> mapH;
        Map<String, Object> mapB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f.e());
            jSONObject.put("init_count", this.b);
            jSONObject.put("server_installed_at", this.f.a(com.applovin.impl.sdk.c.b.al));
            if (this.f.aw()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f.u()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f.a(com.applovin.impl.sdk.c.b.dU);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String strS = this.f.s();
            if (StringUtils.isValidString(strS)) {
                jSONObject.put("mediation_provider", strS);
            }
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f));
            if (this.f.S() != null) {
                mapH = this.f.S().d();
            } else {
                mapH = this.f.R().h();
            }
            jSONObject.put("package_name", mapH.get("package_name"));
            jSONObject.put(TapjoyConstants.TJC_APP_VERSION_NAME, mapH.get(TapjoyConstants.TJC_APP_VERSION_NAME));
            jSONObject.put("test_ads", mapH.get("test_ads"));
            jSONObject.put(TapjoyConstants.TJC_DEBUG, mapH.get(TapjoyConstants.TJC_DEBUG));
            jSONObject.put("tg", mapH.get("tg"));
            jSONObject.put("target_sdk", mapH.get("target_sdk"));
            List<String> initializationAdUnitIds = this.f.C().getInitializationAdUnitIds();
            if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(initializationAdUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapH.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapH.get("IABTCF_gdprApplies"));
            jSONObject.put("consent_flow_info", this.f.ae().i());
            if (this.f.S() != null) {
                mapB = this.f.S().f();
            } else {
                mapB = this.f.R().b();
            }
            jSONObject.put(TapjoyConstants.TJC_PLATFORM, mapB.get(TapjoyConstants.TJC_PLATFORM));
            jSONObject.put("os", mapB.get("os"));
            jSONObject.put("locale", mapB.get("locale"));
            jSONObject.put("brand", mapB.get("brand"));
            jSONObject.put("brand_name", mapB.get("brand_name"));
            jSONObject.put("hardware", mapB.get("hardware"));
            jSONObject.put("model", mapB.get("model"));
            jSONObject.put("revision", mapB.get("revision"));
            jSONObject.put("is_tablet", mapB.get("is_tablet"));
            jSONObject.put("screen_size_in", mapB.get("screen_size_in"));
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
                jSONObject.put("mtl", this.f.Y().getLastTrimMemoryLevel());
            }
            try {
                com.applovin.impl.sdk.p pVar = this.f;
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.p.y().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map<String, String> allData = this.f.r().getAllData();
            if (!allData.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(allData));
            }
            if (this.f.S() != null) {
                d.a aVarD = this.f.Q().d();
                jSONObject.put("dnt", aVarD.a());
                jSONObject.put("dnt_code", aVarD.c().a());
                Boolean boolA = com.applovin.impl.b.a.a().a(f());
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue() && StringUtils.isValidString(aVarD.b()) && !Boolean.TRUE.equals(boolA)) {
                    jSONObject.put("idfa", aVarD.b());
                }
                s.b bVarA = this.f.Q().a();
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue() && bVarA != null && !Boolean.TRUE.equals(boolA)) {
                    jSONObject.put("idfv", bVarA.a());
                    jSONObject.put("idfv_scope", bVarA.b());
                }
            } else {
                d.a aVarK = this.f.R().k();
                jSONObject.put("dnt", aVarK.a());
                jSONObject.put("dnt_code", aVarK.c().a());
                Boolean boolA2 = com.applovin.impl.b.a.a().a(f());
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dQ)).booleanValue() && StringUtils.isValidString(aVarK.b()) && !Boolean.TRUE.equals(boolA2)) {
                    jSONObject.put("idfa", aVarK.b());
                }
                q.a aVarL = this.f.R().l();
                if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dJ)).booleanValue() && aVarL != null && !Boolean.TRUE.equals(boolA2)) {
                    jSONObject.put("idfv", aVarL.f1418a);
                    jSONObject.put("idfv_scope", aVarL.b);
                }
            }
            String name = this.f.D().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUriString(name));
            }
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dM)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f.p());
            }
            if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.dO)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f.q());
            }
            if (this.f.av().a()) {
                jSONObject.put("test_mode", true);
            }
            String strC = this.f.av().c();
            if (StringUtils.isValidString(strC)) {
                jSONObject.put("test_mode_network", strC);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f.C().getExtraParameters()));
        } catch (JSONException e) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Failed to construct JSON body", e);
            }
        }
        return jSONObject;
    }

    private String c() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f.a(com.applovin.impl.sdk.c.b.bd), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.i.a((String) this.f.a(com.applovin.impl.sdk.c.b.be), "5.0/i", d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.c) {
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(jSONObject);
                this.d = null;
            }
        }
    }

    private class b extends com.applovin.impl.sdk.e.a {
        public b(com.applovin.impl.sdk.p pVar) {
            super("TaskTimeoutFetchBasicSettings", pVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (i.this.c) {
                if (i.this.d != null) {
                    com.applovin.impl.sdk.y yVar = this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        this.h.e(this.g, "Timing out fetch basic settings...");
                    }
                    i.this.a(new JSONObject());
                }
            }
        }
    }
}
