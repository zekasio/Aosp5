package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {
    private final com.applovin.impl.sdk.ad.c b;

    public b(com.applovin.impl.sdk.ad.c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, pVar);
        this.b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.b.a());
        map.put("adtoken_prefix", this.b.c());
        return map;
    }
}
