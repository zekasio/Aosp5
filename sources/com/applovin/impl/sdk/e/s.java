package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f1315a;
    private final JSONObject b;
    private final AppLovinAdLoadListener c;
    private final com.applovin.impl.sdk.ad.b d;

    public s(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskRenderAppLovinAd", pVar);
        this.f1315a = jSONObject;
        this.b = jSONObject2;
        this.d = bVar;
        this.c = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f1315a, this.b, this.d, this.f);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f1315a, "gs_load_immediately", false).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f1315a, "vs_load_immediately", true).booleanValue();
        d dVar = new d(aVar, this.f, this.c);
        dVar.b(zBooleanValue2);
        dVar.c(zBooleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.bw)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            } else if (aVar.getSize() == AppLovinAdSize.NATIVE && aVar.getType() == AppLovinAdType.NATIVE) {
                aVar2 = o.a.CACHING_NATIVE;
            }
        }
        this.f.M().a(dVar, aVar2);
    }
}
