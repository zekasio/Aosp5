package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends h {
    private final AppLovinNativeAdLoadListener b;

    public c(com.applovin.impl.sdk.ad.d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super(dVar, str, pVar);
        this.b = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String b() {
        return i.j(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String c() {
        return i.k(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected com.applovin.impl.sdk.e.a a(JSONObject jSONObject) {
        return new d(jSONObject, this.b, this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected void a(int i, String str) {
        super.a(i, str);
        this.b.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
