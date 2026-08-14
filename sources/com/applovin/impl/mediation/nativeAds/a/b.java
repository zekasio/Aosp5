package com.applovin.impl.mediation.nativeAds.a;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.f;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1161a;
    private final MaxNativeAdLoader b;
    private final Queue<MaxAd> c = new LinkedList();
    private boolean d = false;
    private final Object e = new Object();
    private a f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public b(String str, int i, Context context, a aVar) {
        this.f1161a = i;
        this.f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, f.a.NATIVE_AD_PLACER);
    }

    public void a() {
        this.f = null;
        e();
        this.b.destroy();
    }

    public boolean b() {
        boolean z;
        synchronized (this.e) {
            z = !this.c.isEmpty();
        }
        return z;
    }

    public void c() {
        synchronized (this.e) {
            if (!this.d && this.c.size() < this.f1161a) {
                this.d = true;
                this.b.loadAd();
            }
        }
    }

    public MaxAd d() {
        MaxAd maxAdRemove;
        synchronized (this.e) {
            maxAdRemove = null;
            while (!this.c.isEmpty() && (maxAdRemove == null || maxAdRemove.getNativeAd().isExpired())) {
                maxAdRemove = this.c.remove();
            }
            c();
        }
        return maxAdRemove;
    }

    public void a(MaxAd maxAd) {
        this.b.destroy(maxAd);
    }

    public void e() {
        synchronized (this.e) {
            Iterator<MaxAd> it = this.c.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            this.c.clear();
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.b.render(maxNativeAdView, maxAd);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.e) {
            this.c.add(maxAd);
            this.d = false;
            c();
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }
}
