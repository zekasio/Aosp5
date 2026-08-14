package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AppLovinAdImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinAd f1234a;
    private final d b;

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public f(d dVar, p pVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, pVar);
        this.b = dVar;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.b;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd appLovinAdB = b();
        if (appLovinAdB != null) {
            return appLovinAdB.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.b.e()) {
            return null;
        }
        return this.b.a();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd appLovinAdB = b();
        return appLovinAdB != null && appLovinAdB.isVideoAd();
    }

    public AppLovinAd a() {
        return this.f1234a;
    }

    public void a(AppLovinAd appLovinAd) {
        this.f1234a = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f1234a;
        return appLovinAd != null ? appLovinAd : c();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd appLovinAdB = b();
        if (appLovinAdB instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdB).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd appLovinAdB = b();
        if (appLovinAdB instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdB).getOriginalFullResponse();
        }
        return null;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.U().c(this.b);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + d() + "'}";
    }

    private String d() {
        d adZone = getAdZone();
        if (adZone == null || adZone.e()) {
            return null;
        }
        return adZone.a();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd appLovinAdB = b();
        if (appLovinAdB != null) {
            return appLovinAdB.equals(obj);
        }
        return super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd appLovinAdB = b();
        if (appLovinAdB != null) {
            return appLovinAdB.hashCode();
        }
        return super.hashCode();
    }
}
