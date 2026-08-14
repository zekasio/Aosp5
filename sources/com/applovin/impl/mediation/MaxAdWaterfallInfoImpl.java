package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.a f928a;
    private final String b;
    private final String c;
    private final List<MaxNetworkResponseInfo> d;
    private final long e;

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, long j, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.t(), aVar.u(), j, list);
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f928a = aVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = j;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f928a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.c;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }
}
