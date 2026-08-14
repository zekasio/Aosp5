package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {
    private final com.applovin.impl.sdk.ad.c b;

    public l(com.applovin.impl.sdk.ad.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", pVar);
        this.b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.b.a());
        map.put("adtoken_prefix", this.b.c());
        return map;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.REGULAR_AD_TOKEN;
    }
}
