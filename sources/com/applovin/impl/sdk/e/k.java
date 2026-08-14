package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k extends h {
    private final AppLovinAdLoadListener b;

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", pVar);
    }

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.p pVar) {
        super(dVar, str, pVar);
        this.b = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String b() {
        return com.applovin.impl.sdk.utils.i.h(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected String c() {
        return com.applovin.impl.sdk.utils.i.i(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected a a(JSONObject jSONObject) {
        return new p(jSONObject, this.f1291a, h(), this.b, this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    protected void a(int i, String str) {
        super.a(i, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.b;
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) this.b).failedToReceiveAdV2(new AppLovinError(i, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }
}
