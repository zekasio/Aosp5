package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f929a;
    private Map<String, Object> b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private String h;
    private boolean i;
    private String j;
    private String k;
    private long l;
    private MaxAdFormat m;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((com.applovin.impl.mediation.a.f) aVar);
        maxAdapterParametersImplA.j = aVar.s();
        maxAdapterParametersImplA.k = aVar.l();
        maxAdapterParametersImplA.l = aVar.n();
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.h hVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(hVar);
        maxAdapterParametersImplA.f929a = str;
        maxAdapterParametersImplA.m = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f929a = fVar.getAdUnitId();
        maxAdapterParametersImpl.e = fVar.ab();
        maxAdapterParametersImpl.f = fVar.ac();
        maxAdapterParametersImpl.g = fVar.ad();
        maxAdapterParametersImpl.h = fVar.ae();
        maxAdapterParametersImpl.b = fVar.ag();
        maxAdapterParametersImpl.c = fVar.ah();
        maxAdapterParametersImpl.d = fVar.ai();
        maxAdapterParametersImpl.i = fVar.aa();
        return maxAdapterParametersImpl;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f929a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.m;
    }
}
