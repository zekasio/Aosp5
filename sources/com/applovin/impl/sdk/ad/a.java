package com.applovin.impl.sdk.ad;

import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.model.Advertisement;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1224a;
    private final String b;
    private final String c;
    private final com.applovin.impl.sdk.a.c d;

    public a(JSONObject jSONObject, JSONObject jSONObject2, b bVar, p pVar) {
        super(jSONObject, jSONObject2, bVar, pVar);
        this.f1224a = b();
        this.b = i();
        this.c = aO();
        this.d = new com.applovin.impl.sdk.a.c(this);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, this.f1224a);
            JsonUtils.putString(this.adObject, "stream_url", this.c);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.fullResponseLock) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectDeepCopy, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
            JsonUtils.putString(jSONObject, TJAdUnitConstants.String.HTML, this.f1224a);
            JsonUtils.putString(jSONObject, Advertisement.KEY_VIDEO, this.b);
            JsonUtils.putString(jSONObject, "stream_url", this.c);
        }
        return jSONObjectDeepCopy;
    }

    public String b() {
        String string;
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, TJAdUnitConstants.String.HTML, "");
        }
        return string;
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, TJAdUnitConstants.String.HTML, str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", false);
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.c o() {
        return this.d;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return this.adObject.has("stream_url");
    }

    private String aO() {
        return getStringFromAdObject("stream_url", "");
    }

    public void g() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        String strAO = aO();
        if (StringUtils.isValidString(strAO)) {
            return Uri.parse(strAO);
        }
        String strI = i();
        if (StringUtils.isValidString(strI)) {
            return Uri.parse(strI);
        }
        return null;
    }

    public void a(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, Advertisement.KEY_VIDEO, uri.toString());
        }
    }

    public String i() {
        return getStringFromAdObject(Advertisement.KEY_VIDEO, "");
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return h() != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        String stringFromAdObject = getStringFromAdObject(AnalyticsEvent.Ad.clickUrl, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return j();
    }

    public float l() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public boolean m() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", false);
        }
        return true;
    }

    public i.a n() {
        return a(getIntFromAdObject("expandable_style", i.a.INVISIBLE.a()));
    }
}
