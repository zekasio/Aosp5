package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f1223a;
    private d b;
    private f c;
    protected final b source;

    public abstract JSONObject getOriginalFullResponse();

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, b bVar, p pVar) {
        super(jSONObject, jSONObject2, pVar);
        this.f1223a = new Bundle();
        this.source = bVar;
    }

    public String getRawFullResponse() {
        String string;
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    public boolean hasVideoUrl() {
        this.sdk.L();
        if (!y.a()) {
            return false;
        }
        this.sdk.L().e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", false);
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", false);
    }

    public Bundle getMAXAdValues() {
        return this.f1223a;
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f1223a);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().e()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", false);
        }
        return hasVideoUrl();
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject(Utils.KEY_AD_VALUES, new JSONObject()), str, str2);
    }

    public d getAdZone() {
        d dVar = this.b;
        if (dVar != null) {
            if (dVar.c() != null && this.b.d() != null) {
                return this.b;
            }
            if (getSize() == null && getType() == null) {
                return this.b;
            }
        }
        d dVarA = d.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null));
        this.b = dVarA;
        return dVarA;
    }

    public b getSource() {
        return this.source;
    }

    public f getDummyAd() {
        return this.c;
    }

    public void setDummyAd(f fVar) {
        this.c = fVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdB;
        if ((obj instanceof f) && (appLovinAdB = ((f) obj).b()) != null) {
            obj = appLovinAdB;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", source=" + getSource() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
