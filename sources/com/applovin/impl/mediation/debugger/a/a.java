package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f1017a;
    private final InterfaceC0064a b;
    private DTBAdRequest c;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0064a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public a(b bVar, MaxAdFormat maxAdFormat, InterfaceC0064a interfaceC0064a) {
        this((List<?>) Arrays.asList(bVar.a()), maxAdFormat, interfaceC0064a);
    }

    public a(List<?> list, MaxAdFormat maxAdFormat, InterfaceC0064a interfaceC0064a) {
        this.f1017a = maxAdFormat;
        this.b = interfaceC0064a;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.c;
        if (dTBAdRequest == null) {
            this.b.onAdLoadFailed(null, this.f1017a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.b.onAdResponseLoaded(dTBAdResponse, this.f1017a);
    }

    public void onFailure(AdError adError) {
        this.b.onAdLoadFailed(adError, this.f1017a);
    }
}
