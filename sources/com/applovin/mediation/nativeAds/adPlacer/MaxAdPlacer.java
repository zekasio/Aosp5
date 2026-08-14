package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.nativeAds.a.a;
import com.applovin.impl.mediation.nativeAds.a.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacer implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f1535a;
    private MaxNativeAdViewBinder b;
    private final a c;
    private final b d;
    private Listener e;
    protected final y logger;
    protected final p sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f1535a = AppLovinSdkUtils.Size.ZERO;
        p pVar = appLovinSdk.coreSdk;
        this.sdk = pVar;
        y yVarL = pVar.L();
        this.logger = yVarL;
        this.c = new a(maxAdPlacerSettings);
        this.d = new b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        if (y.a()) {
            yVarL.b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    public void destroy() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.d.a();
    }

    public void setAdSize(int i, int i2) {
        this.f1535a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.b = maxNativeAdViewBinder;
    }

    public void setListener(Listener listener) {
        this.e = listener;
    }

    public void loadAds() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Loading ads");
        }
        this.d.c();
    }

    public void clearAds() {
        a(this.c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.1
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing all cached ads");
                }
                MaxAdPlacer.this.c.c();
                MaxAdPlacer.this.d.e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> collectionD = this.c.d(i);
        if (!collectionD.isEmpty()) {
            a(collectionD, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxAdPlacer.this.logger;
                    if (y.a()) {
                        MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing trailing ads after position " + i);
                    }
                    MaxAdPlacer.this.c.a(collectionD);
                }
            });
        }
        return collectionD;
    }

    public boolean isAdPosition(int i) {
        return this.c.a(i);
    }

    public boolean isFilledPosition(int i) {
        return this.c.b(i);
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.c.c(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        double d;
        if (isFilledPosition(i)) {
            boolean z = this.f1535a != AppLovinSdkUtils.Size.ZERO;
            int iMin = Math.min(z ? this.f1535a.getWidth() : 360, i2);
            d dVar = (d) this.c.c(i);
            if ("small_template_1".equalsIgnoreCase(dVar.E())) {
                return new AppLovinSdkUtils.Size(iMin, z ? this.f1535a.getHeight() : 120);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(dVar.E())) {
                if (z) {
                    double width = this.f1535a.getWidth();
                    double height = this.f1535a.getHeight();
                    Double.isNaN(width);
                    Double.isNaN(height);
                    d = width / height;
                } else {
                    d = 1.2d;
                }
                double d2 = iMin;
                Double.isNaN(d2);
                return new AppLovinSdkUtils.Size(iMin, (int) (d2 / d));
            }
            if (z) {
                return this.f1535a;
            }
            if (dVar.D() != null) {
                View mainView = dVar.D().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public void renderAd(int i, ViewGroup viewGroup) {
        MaxAd maxAdC = this.c.c(i);
        if (maxAdC == null) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "An ad is not available for position: " + i);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewD = ((d) maxAdC).D();
        if (maxNativeAdViewD != null) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "Using pre-rendered ad at position: " + i);
            }
        } else if (this.b != null) {
            maxNativeAdViewD = new MaxNativeAdView(this.b, viewGroup.getContext());
            if (this.d.a(maxNativeAdViewD, maxAdC)) {
                if (y.a()) {
                    this.logger.b("MaxAdPlacer", "Rendered ad at position: " + i);
                }
            } else if (y.a()) {
                this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i);
            }
        } else {
            if (y.a()) {
                this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                return;
            }
            return;
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewD.getParent() != null) {
            ((ViewGroup) maxNativeAdViewD.getParent()).removeView(maxNativeAdViewD);
        }
        viewGroup.addView(maxNativeAdViewD, -1, -1);
    }

    public void updateFillablePositions(int i, int i2) {
        this.c.a(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        a();
    }

    public int getAdjustedCount(int i) {
        return this.c.e(i);
    }

    public int getAdjustedPosition(int i) {
        return this.c.f(i);
    }

    public int getOriginalPosition(int i) {
        return this.c.g(i);
    }

    public void insertItem(int i) {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.c.h(i);
    }

    public void removeItem(final int i) {
        List listEmptyList;
        if (isFilledPosition(i)) {
            listEmptyList = Collections.singletonList(Integer.valueOf(i));
        } else {
            listEmptyList = Collections.emptyList();
        }
        a(listEmptyList, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.3
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Removing item at position: " + i);
                }
                MaxAdPlacer.this.c.i(i);
            }
        });
    }

    public void moveItem(int i, int i2) {
        this.c.b(i, i2);
    }

    private void a() {
        int iA;
        while (this.d.b() && (iA = this.c.a()) != -1) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "Placing ad at position: " + iA);
            }
            this.c.a(this.d.d(), iA);
            Listener listener = this.e;
            if (listener != null) {
                listener.onAdLoaded(iA);
            }
        }
    }

    private void a(Collection<Integer> collection, Runnable runnable) {
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            this.d.a(this.c.c(it.next().intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.e != null) {
            Iterator<Integer> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.e.onAdRemoved(it2.next().intValue());
            }
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoaded() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (y.a()) {
            this.logger.e("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }
}
