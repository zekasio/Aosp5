package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends k {
    private final List<String> b;

    public j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super(com.applovin.impl.sdk.ad.d.a(a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", pVar);
        this.b = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    @Override // com.applovin.impl.sdk.e.h
    protected Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(1);
        List<String> list = this.b;
        map.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return map;
    }

    @Override // com.applovin.impl.sdk.e.h
    protected com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.APPLOVIN_MULTIZONE;
    }
}
