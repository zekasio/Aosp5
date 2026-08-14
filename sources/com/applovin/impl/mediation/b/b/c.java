package com.applovin.impl.mediation.b.b;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.mediation.b.a;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {
    private final AppLovinNativeAdLoadListener i;
    private final a.C0059a j;
    private String k;
    private String l;
    private String m;
    private String n;

    public c(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, pVar);
        this.j = com.applovin.impl.mediation.b.a.a();
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = null;
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f984a, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            y yVar = this.h;
            if (y.a()) {
                this.h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        if (jSONArray2.length() == 0) {
            y yVar2 = this.h;
            if (y.a()) {
                this.h.d("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.k = JsonUtils.getString(jSONObject2, "id", "");
        y yVar3 = this.h;
        if (y.a()) {
            this.h.b("TaskProcessTaboolaAd", "Processing Taboola ad (" + this.k + ") for placement: " + string + "...");
        }
        this.l = JsonUtils.getString(jSONObject2, TapjoyAuctionFlags.AUCTION_TYPE, "");
        this.m = JsonUtils.getString(jSONObject2, "origin", "");
        this.n = JsonUtils.getString(jSONObject2, "discloser", null);
        this.j.a("Taboola_2.0");
        this.j.b(JsonUtils.getString(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.NAME, ""));
        this.j.c(JsonUtils.getString(jSONObject2, "branding", ""));
        this.j.d(JsonUtils.getString(jSONObject2, "description", ""));
        this.j.f(JsonUtils.getString(jSONObject2, "url", null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (jSONObjectOptJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.j.e(JsonUtils.getString(jSONObjectOptJSONObject, "url", null));
            this.j.a(JsonUtils.getInt(jSONObjectOptJSONObject, TJAdUnitConstants.String.WIDTH, 0));
            this.j.b(JsonUtils.getInt(jSONObjectOptJSONObject, TJAdUnitConstants.String.HEIGHT, 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(this.f984a, "user", (JSONObject) null), "beacons", null);
        this.j.a(a(jSONObject3, jSONArray4));
        this.j.a(a(jSONArray4, jSONArray5));
        this.j.b(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject jSONObjectA = a(a());
        y yVar4 = this.h;
        if (y.a()) {
            this.h.b("TaskProcessTaboolaAd", "Starting render task for Taboola ad: " + string + "...");
        }
        this.d.M().a(new com.applovin.impl.sdk.nativeAd.d(jSONObjectA, this.i, this.d), o.a.MAIN);
    }

    @Override // com.applovin.impl.mediation.b.d
    protected JSONObject a() {
        JSONObject jSONObjectA = a(this.j.a());
        JsonUtils.putString(jSONObjectA, "cache_prefix", "taboola_");
        JsonUtils.putString(jSONObjectA, TapjoyAuctionFlags.AUCTION_TYPE, "taboola");
        JsonUtils.putString(jSONObjectA, "privacy_url", this.n);
        return jSONObjectA;
    }

    private List<String> a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", null);
        if (StringUtils.isValidString(string)) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b("TaskProcessTaboolaAd", "Processed impression URL: " + string);
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, TJAdUnitConstants.String.VISIBLE, null);
        if (StringUtils.isValidString(string2)) {
            y yVar2 = this.h;
            if (y.a()) {
                this.h.b("TaskProcessTaboolaAd", "Processed impression URL: " + string2);
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                String strA = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(strA)) {
                    strA = a(objectAtIndex, TJAdUnitConstants.String.VISIBLE, "pixel");
                }
                if (!TextUtils.isEmpty(strA)) {
                    y yVar3 = this.h;
                    if (y.a()) {
                        this.h.b("TaskProcessTaboolaAd", "Processed impression URL: " + strA);
                    }
                    arrayList.add(strA);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i2, null), (String) null, "pixel");
                if (!TextUtils.isEmpty(strA2)) {
                    y yVar4 = this.h;
                    if (y.a()) {
                        this.h.b("TaskProcessTaboolaAd", "Processed impression URL: " + strA2);
                    }
                    arrayList.add(strA2);
                }
            }
        }
        return arrayList;
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, TJAdUnitConstants.String.CLICK, null);
        if (StringUtils.isValidString(string)) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b("TaskProcessTaboolaAd", "Processed click tracking URL: " + string);
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i, null), TJAdUnitConstants.String.CLICK, "pixel");
                if (!TextUtils.isEmpty(strA)) {
                    y yVar2 = this.h;
                    if (y.a()) {
                        this.h.b("TaskProcessTaboolaAd", "Processed click tracking URL: " + strA);
                    }
                    jSONArray2.put(strA);
                }
            }
        }
        return jSONArray2;
    }

    private List<String> a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strA = a(JsonUtils.getObjectAtIndex(jSONArray, i, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(Uri.decode(strA));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String strA2 = a(JsonUtils.getObjectAtIndex(jSONArray2, i2, null), (String) null, "script");
                if (!TextUtils.isEmpty(strA2)) {
                    arrayList.add(Uri.decode(strA2));
                }
            }
        }
        return arrayList;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", "");
        String string2 = JsonUtils.getString(jSONObject, TapjoyAuctionFlags.AUCTION_TYPE, "");
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, "value", null);
        }
        return null;
    }
}
