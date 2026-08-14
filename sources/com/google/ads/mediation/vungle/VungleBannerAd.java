package com.google.ads.mediation.vungle;

import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.vungle.mediation.VungleBannerAdapter;
import com.vungle.warren.VungleBanner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class VungleBannerAd {
    private final WeakReference<VungleBannerAdapter> adapter;
    private final String placementId;
    private VungleBanner vungleBanner;

    public VungleBannerAd(String str, VungleBannerAdapter vungleBannerAdapter) {
        this.placementId = str;
        this.adapter = new WeakReference<>(vungleBannerAdapter);
    }

    public VungleBannerAdapter getAdapter() {
        return this.adapter.get();
    }

    public void setVungleBanner(VungleBanner vungleBanner) {
        this.vungleBanner = vungleBanner;
    }

    public VungleBanner getVungleBanner() {
        return this.vungleBanner;
    }

    public void attach() {
        RelativeLayout adLayout;
        VungleBanner vungleBanner;
        VungleBannerAdapter vungleBannerAdapter = this.adapter.get();
        if (vungleBannerAdapter == null || (adLayout = vungleBannerAdapter.getAdLayout()) == null || (vungleBanner = this.vungleBanner) == null || vungleBanner.getParent() != null) {
            return;
        }
        adLayout.addView(this.vungleBanner);
    }

    public void detach() {
        VungleBanner vungleBanner = this.vungleBanner;
        if (vungleBanner == null || vungleBanner.getParent() == null) {
            return;
        }
        ((ViewGroup) this.vungleBanner.getParent()).removeView(this.vungleBanner);
    }

    public void destroyAd() {
        if (this.vungleBanner != null) {
            Log.d(VungleMediationAdapter.TAG, "Vungle banner adapter cleanUp: destroyAd # " + this.vungleBanner.hashCode());
            this.vungleBanner.destroyAd();
            this.vungleBanner = null;
        }
    }
}
