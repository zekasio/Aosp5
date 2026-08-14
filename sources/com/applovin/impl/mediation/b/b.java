package com.applovin.impl.mediation.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Cookie;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static JSONObject d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f978a;
    protected final String b;
    protected final SharedPreferences c = PreferenceManager.getDefaultSharedPreferences(p.y());

    protected b(String str, p pVar) {
        this.b = str;
        this.f978a = pVar;
    }

    public com.applovin.impl.sdk.network.c a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map<String, String> map, boolean z, p pVar) {
        Map<String, Object> mapA;
        pVar.L();
        if (y.a()) {
            pVar.L().b(this.b, "Creating OpenRTB request with " + str2);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context contextY = p.y();
        if (pVar.S() != null) {
            mapA = pVar.S().b();
        } else {
            mapA = pVar.R().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.b));
        JsonUtils.putJSONObjectIfValid(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, a(customParameters, aVar.c, contextY));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.d, mapA, pVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", a(aVar.e));
        JsonUtils.putJSONObjectIfValid(jSONObject, FirebaseAnalytics.Param.SOURCE, b(aVar.f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.g, contextY));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(mapA));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f979a);
        return com.applovin.impl.sdk.network.c.a(pVar).a(str).b("POST").b(map).a(jSONObject).a(new JSONObject()).c(false).d(z).a();
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putDouble(jSONObject2, "bidfloor", bundle.getDouble("bidfloor", 0.0d));
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt(TJAdUnitConstants.String.WIDTH, maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, "h", bundle.getInt(TJAdUnitConstants.String.HEIGHT, maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, "banner", jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject jSONObjectA = a(context);
        JsonUtils.putString(jSONObjectA, ClientCookie.DOMAIN_ATTR, bundle.getString(ClientCookie.DOMAIN_ATTR, ""));
        JsonUtils.putString(jSONObjectA, "storeurl", bundle.getString("storeurl", ""));
        JsonUtils.putJSONObjectIfValid(jSONObjectA, "ext", jSONObject);
        return jSONObjectA;
    }

    private JSONObject a(JSONObject jSONObject, Map<String, Object> map, p pVar) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ua", String.valueOf(map.get("ua")));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, VungleApiClient.IFA, String.valueOf(map.get("idfa")));
        JsonUtils.putString(jSONObject2, "make", String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, "model", String.valueOf(map.get("model")));
        JsonUtils.putString(jSONObject2, "os", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        JsonUtils.putString(jSONObject2, "osv", String.valueOf(map.get("os")));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, "connectiontype", i.g(pVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, "h", ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Boolean boolA = com.applovin.impl.b.a.a().a(context);
        if (boolA != null) {
            JsonUtils.putBoolean(jSONObject2, Cookie.COPPA_KEY, boolA.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, "h", ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    protected JSONObject a() {
        Map<String, Object> mapH;
        JSONObject jSONObject = new JSONObject();
        if (this.f978a.S() != null) {
            mapH = this.f978a.S().d();
        } else {
            mapH = this.f978a.R().h();
        }
        JsonUtils.putObject(jSONObject, "gdpr", mapH.get("IABTCF_gdprApplies"));
        Boolean boolA = com.applovin.impl.b.a.c().a(p.y());
        if (boolA != null) {
            JsonUtils.putString(jSONObject, "us_privacy", boolA.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    protected JSONObject b() {
        String strValueOf;
        JSONObject jSONObject = new JSONObject();
        Boolean boolC = c();
        if (boolC != null && boolC.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", com.applovin.impl.b.a.b().a(p.y()).booleanValue());
            if (this.f978a.S() != null) {
                strValueOf = this.f978a.Q().C().a();
            } else {
                strValueOf = String.valueOf(this.f978a.R().h().get("IABTCF_TCString"));
            }
            JsonUtils.putString(jSONObject, "consent", strValueOf);
        }
        return jSONObject;
    }

    private static JSONObject a(Context context) {
        PackageInfo packageInfo;
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME, packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, TJAdUnitConstants.String.BUNDLE, applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : "");
        d = jSONObject2;
        return jSONObject2;
    }

    protected Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(p.y());
        String strA = com.applovin.impl.sdk.c.d.r.a();
        if (!defaultSharedPreferences.contains(strA)) {
            return null;
        }
        String str = (String) e.a(strA, "", String.class, defaultSharedPreferences);
        if (StringUtils.isValidString(str)) {
            if (!str.equals(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE) && !str.equalsIgnoreCase("true")) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        Integer num = (Integer) e.a(strA, Integer.MAX_VALUE, Integer.class, defaultSharedPreferences);
        if (num != null && num.intValue() != Integer.MAX_VALUE) {
            return Boolean.valueOf(num.intValue() > 0);
        }
        Long l = (Long) e.a(strA, Long.MAX_VALUE, Long.class, defaultSharedPreferences);
        if (l == null || l.longValue() == Long.MAX_VALUE) {
            return (Boolean) e.a(strA, false, Boolean.class, defaultSharedPreferences);
        }
        return Boolean.valueOf(l.longValue() > 0);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f979a;
        private final JSONObject b;
        private final JSONObject c;
        private final JSONObject d;
        private final JSONObject e;
        private final JSONObject f;
        private final JSONObject g;

        /* JADX INFO: renamed from: com.applovin.impl.mediation.b.b$a$a, reason: collision with other inner class name */
        public static class C0060a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private JSONObject f980a;
            private JSONObject b;
            private JSONObject c;
            private JSONObject d;
            private JSONObject e;
            private JSONObject f;
            private JSONObject g;

            C0060a() {
            }

            public C0060a a(JSONObject jSONObject) {
                this.f980a = jSONObject;
                return this;
            }

            public a a() {
                return new a(this.f980a, this.b, this.c, this.d, this.e, this.f, this.g);
            }

            public C0060a b(JSONObject jSONObject) {
                this.b = jSONObject;
                return this;
            }

            public C0060a c(JSONObject jSONObject) {
                this.e = jSONObject;
                return this;
            }

            public C0060a d(JSONObject jSONObject) {
                this.g = jSONObject;
                return this;
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.f980a + ", impExtObject=" + this.b + ", appExtObject=" + this.c + ", deviceExtObject=" + this.d + ", userExtObject=" + this.e + ", sourceExtObject=" + this.f + ", regsExtObject=" + this.g + ")";
            }
        }

        a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f979a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
            this.e = jSONObject5;
            this.f = jSONObject6;
            this.g = jSONObject7;
        }

        public static C0060a a() {
            return new C0060a();
        }
    }
}
