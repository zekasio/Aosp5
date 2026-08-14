package com.vungle.warren;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.utility.AdMarkupDecoder;
import com.vungle.warren.utility.RefreshHandler;
import com.vungle.warren.utility.ViewUtility;
import com.vungle.warren.utility.WeakLoadAdCallback;
import com.vungle.warren.utility.WeakRunnable;

/* JADX INFO: loaded from: classes3.dex */
public class VungleBanner extends RelativeLayout {
    private static final String TAG = "VungleBanner";
    private VungleBannerView bannerAd;
    private BannerAdConfig bannerAdConfig;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private boolean destroyed;
    private boolean disableRenderManagement;
    private LoadAdCallback loadAdCallback;
    private String placementId;
    private PlayAdCallback playAdCallback;
    private Runnable refreshAdRunnable;
    private RefreshHandler refreshHandler;
    private boolean renderAdRequested;
    private boolean renderWhenAvailable;

    protected VungleBanner(Context context, String str, String str2, int i, BannerAdConfig bannerAdConfig, PlayAdCallback playAdCallback) {
        super(context);
        this.refreshAdRunnable = new Runnable() { // from class: com.vungle.warren.VungleBanner.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d(VungleBanner.TAG, "Refresh Timeout Reached");
                VungleBanner.this.renderWhenAvailable = true;
                VungleBanner.this.loadAdInternal();
            }
        };
        this.loadAdCallback = new LoadAdCallback() { // from class: com.vungle.warren.VungleBanner.2
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str3) {
                Log.d(VungleBanner.TAG, "Ad Loaded : " + str3);
                if (VungleBanner.this.renderWhenAvailable && VungleBanner.this.canRender()) {
                    VungleBanner.this.renderWhenAvailable = false;
                    VungleBanner.this.finishAdInternal(false);
                    VungleBannerView bannerViewInternal = Vungle.getBannerViewInternal(VungleBanner.this.placementId, null, new AdConfig(VungleBanner.this.bannerAdConfig), VungleBanner.this.playAdCallback);
                    if (bannerViewInternal != null) {
                        VungleBanner.this.bannerAd = bannerViewInternal;
                        VungleBanner.this.renderAd();
                    } else {
                        onError(VungleBanner.this.placementId, new VungleException(10));
                        VungleLogger.error("VungleBanner#loadAdCallback; onAdLoad", "VungleBannerView is null");
                    }
                }
            }

            @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
            public void onError(String str3, VungleException vungleException) {
                Log.d(VungleBanner.TAG, "Ad Load Error : " + str3 + " Message : " + vungleException.getLocalizedMessage());
                if (VungleBanner.this.getVisibility() == 0 && VungleBanner.this.canRender()) {
                    VungleBanner.this.refreshHandler.start();
                }
            }
        };
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = TAG;
        VungleLogger.verbose(true, str3, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Creating banner ad, id = %1$s, at: %2$d", str, Long.valueOf(jCurrentTimeMillis)));
        this.placementId = str;
        this.bannerAdConfig = bannerAdConfig;
        AdConfig.AdSize adSize = bannerAdConfig.getAdSize();
        this.playAdCallback = playAdCallback;
        this.calculatedPixelHeight = ViewUtility.dpToPixels(context, adSize.getHeight());
        this.calculatedPixelWidth = ViewUtility.dpToPixels(context, adSize.getWidth());
        SessionTracker.getInstance().trackAdConfig(bannerAdConfig);
        this.bannerAd = Vungle.getBannerViewInternal(str, AdMarkupDecoder.decode(str2), new AdConfig(bannerAdConfig), this.playAdCallback);
        this.refreshHandler = new RefreshHandler(new WeakRunnable(this.refreshAdRunnable), ((long) i) * 1000);
        VungleLogger.verbose(true, str3, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Banner ad created, id = %1$s, elapsed time: %2$dms", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Log.d(TAG, "Banner onWindowVisibilityChanged: " + i);
        setAdVisibility(i == 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "Banner onAttachedToWindow");
        if (this.disableRenderManagement) {
            return;
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.disableRenderManagement) {
            Log.d(TAG, "Banner onDetachedFromWindow: render management disabled, do nothing");
        } else {
            finishAdInternal(true);
        }
    }

    public void renderAd() {
        this.renderAdRequested = true;
        if (getVisibility() != 0) {
            return;
        }
        VungleBannerView vungleBannerView = this.bannerAd;
        if (vungleBannerView == null) {
            if (canRender()) {
                this.renderWhenAvailable = true;
                loadAdInternal();
                return;
            }
            return;
        }
        View viewRenderBannerView = vungleBannerView.renderBannerView();
        if (viewRenderBannerView.getParent() != this) {
            addView(viewRenderBannerView, this.calculatedPixelWidth, this.calculatedPixelHeight);
            Log.d(TAG, "Add VungleBannerView to Parent");
        }
        Log.d(TAG, "Rendering new ad for: " + this.placementId);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
        this.refreshHandler.start();
    }

    public void finishAd() {
        finishAdInternal(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishAdInternal(boolean z) {
        synchronized (this) {
            this.refreshHandler.clean();
            VungleBannerView vungleBannerView = this.bannerAd;
            if (vungleBannerView != null) {
                vungleBannerView.finishDisplayingAdInternal(z);
                this.bannerAd = null;
                try {
                    removeAllViews();
                } catch (Exception e) {
                    Log.d(TAG, "Removing webview error: " + e.getLocalizedMessage());
                }
            }
        }
    }

    public void destroyAd() {
        finishAdInternal(true);
        this.destroyed = true;
        this.playAdCallback = null;
    }

    public void setAdVisibility(boolean z) {
        if (z && canRender()) {
            this.refreshHandler.start();
        } else {
            this.refreshHandler.pause();
        }
        VungleBannerView vungleBannerView = this.bannerAd;
        if (vungleBannerView != null) {
            vungleBannerView.setAdVisibility(z);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        setAdVisibility(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canRender() {
        return !this.destroyed && (!this.disableRenderManagement || this.renderAdRequested);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        setAdVisibility(i == 0);
    }

    protected void loadAdInternal() {
        Log.d(TAG, "Loading Ad");
        Banners.loadBanner(this.placementId, this.bannerAdConfig, new WeakLoadAdCallback(this.loadAdCallback));
    }

    public void disableLifeCycleManagement(boolean z) {
        this.disableRenderManagement = z;
    }
}
