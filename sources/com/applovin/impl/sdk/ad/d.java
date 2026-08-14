package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, d> f1228a = CollectionUtils.map();
    private static final Object b = new Object();
    private JSONObject c;
    private final String d;
    private AppLovinAdSize e;
    private AppLovinAdType f;

    public static d a(String str) {
        return a(null, null, str);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str);
        synchronized (b) {
            String str2 = dVar.d;
            Map<String, d> map = f1228a;
            if (map.containsKey(str2)) {
                dVar = map.get(str2);
            } else {
                map.put(str2, dVar);
            }
        }
        return dVar;
    }

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.e = appLovinAdSize;
        this.f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            this.d = str.trim().toLowerCase(Locale.ENGLISH);
            return;
        }
        this.d = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (b) {
                d dVar = f1228a.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (dVar != null) {
                    dVar.e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public String a() {
        return this.d;
    }

    public MaxAdFormat b() {
        AppLovinAdSize appLovinAdSizeC = c();
        if (appLovinAdSizeC == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeC == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeC == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeC == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (appLovinAdSizeC == AppLovinAdSize.INTERSTITIAL) {
            if (d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (d() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
        if (appLovinAdSizeC == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        return null;
    }

    public AppLovinAdSize c() {
        if (this.e == null && JsonUtils.valueExists(this.c, "ad_size")) {
            this.e = AppLovinAdSize.fromString(JsonUtils.getString(this.c, "ad_size", null));
        }
        return this.e;
    }

    public AppLovinAdType d() {
        if (this.f == null && JsonUtils.valueExists(this.c, "ad_type")) {
            this.f = AppLovinAdType.fromString(JsonUtils.getString(this.c, "ad_type", null));
        }
        return this.f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k(), l(), m());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d g() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static d h() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static d i() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static d j() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public static d k() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static d l() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static d m() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public String toString() {
        return "AdZone{id=" + this.d + ", zoneObject=" + this.c + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.d.equalsIgnoreCase(((d) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }
}
