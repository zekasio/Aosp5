package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1524a;

    public d(p pVar) {
        this.f1524a = pVar;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        Utils.assertMainThread();
        if (activity == null) {
            activity = this.f1524a.w().a();
        }
        if (cVar.getNativeAd() != null) {
            this.f1524a.L();
            if (y.a()) {
                this.f1524a.L().b("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f1524a.w().a(new b(cVar, this.f1524a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (cVar.r() != null) {
            this.f1524a.L();
            if (y.a()) {
                this.f1524a.L().b("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f1524a.w().a(new a(cVar, this.f1524a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }

    private static class b extends com.applovin.impl.sdk.utils.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f1526a;
        private final p b;
        private final MaxAdapterListener c;

        public b(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
            this.f1526a = cVar;
            this.b = pVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                com.applovin.impl.mediation.a.c cVar = this.f1526a;
                ((MaxHybridNativeAdActivity) activity).a(cVar, cVar.getNativeAd(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f1526a.A().get()) {
                this.b.w().b(this);
            }
        }
    }

    private static class a extends com.applovin.impl.sdk.utils.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f1525a;
        private final p b;
        private final MaxAdapterListener c;

        public a(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
            this.f1525a = cVar;
            this.b = pVar;
            this.c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                com.applovin.impl.mediation.a.c cVar = this.f1525a;
                ((MaxHybridMRecAdActivity) activity).a(cVar, cVar.r(), this.b, this.c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f1525a.A().get()) {
                this.b.w().b(this);
            }
        }
    }
}
