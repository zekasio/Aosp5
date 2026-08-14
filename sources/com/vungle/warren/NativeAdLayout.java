package com.vungle.warren;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.NativeAdContract;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAdLayout extends FrameLayout {
    private static final String TAG = "NativeAdLayout";
    private BroadcastReceiver broadcastReceiver;
    private OnItemClickListener clickListener;
    private Context context;
    private boolean destroyed;
    private boolean disableRenderManagement;
    private final AtomicReference<Boolean> isAdVisible;
    private AdContract.AdvertisementPresenter.EventListener listener;
    private NativeAd nativeAd;
    private final AtomicBoolean pendingImpression;
    private final AtomicBoolean pendingStart;
    private NativeAdContract.NativePresenter presenter;
    private PresentationFactory presenterFactory;
    private AdRequest request;
    private boolean started;

    public interface OnItemClickListener {
        void onItemClicked(int i);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewEvent {
        public static final int CTA_CLICK = 1;
        public static final int PRIVACY_CLICK = 2;
    }

    public NativeAdLayout(Context context) {
        super(context);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
    }

    public void finishDisplayingAdInternal(boolean z) {
        Log.d(TAG, "finishDisplayingAdInternal() " + z + " " + hashCode());
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter != null) {
            nativePresenter.detach((z ? 4 : 0) | 2);
        } else {
            PresentationFactory presentationFactory = this.presenterFactory;
            if (presentationFactory != null) {
                presentationFactory.destroy();
                this.presenterFactory = null;
                this.listener.onError(new VungleException(25), this.request.getPlacementId());
            }
        }
        release();
    }

    public void onImpression() {
        Log.d(TAG, "onImpression() " + hashCode());
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter == null) {
            this.pendingImpression.set(true);
        } else {
            nativePresenter.onProgressUpdate(1, 100.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow() " + hashCode());
        if (this.disableRenderManagement) {
            return;
        }
        renderNativeAd();
    }

    public void renderNativeAd() {
        Log.d(TAG, "renderNativeAd() " + hashCode());
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.vungle.warren.NativeAdLayout.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("command");
                if (AdContract.AdvertisementBus.STOP_ALL.equalsIgnoreCase(stringExtra)) {
                    NativeAdLayout.this.finishDisplayingAdInternal(false);
                } else {
                    VungleLogger.warn("NativeAdLayout#onAttachedToWindow", String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
                }
            }
        };
        LocalBroadcastManager.getInstance(this.context).registerReceiver(this.broadcastReceiver, new IntentFilter(AdContract.AdvertisementBus.ACTION));
        start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedFromWindow() " + hashCode());
        if (this.disableRenderManagement) {
            return;
        }
        finishNativeAd();
    }

    public void finishNativeAd() {
        String str = TAG;
        Log.d(str, "finishNativeAd() " + hashCode());
        LocalBroadcastManager.getInstance(this.context).unregisterReceiver(this.broadcastReceiver);
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        } else {
            Log.d(str, "No need to destroy due to haven't played the ad.");
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Log.d(TAG, "onWindowFocusChanged() hasWindowFocus=" + z + " " + hashCode());
        super.onWindowFocusChanged(z);
        setAdVisibility(z);
        if (this.presenter == null || this.started) {
            return;
        }
        start();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        Log.d(TAG, "onVisibilityChanged() visibility=" + i + " " + hashCode());
        setAdVisibility(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Log.d(TAG, "onWindowVisibilityChanged() visibility=" + i + " " + hashCode());
        setAdVisibility(i == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdVisibility(boolean z) {
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter != null) {
            nativePresenter.setAdVisibility(z);
        } else {
            this.isAdVisible.set(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start() {
        Log.d(TAG, "start() " + hashCode());
        if (this.presenter == null) {
            this.pendingStart.set(true);
        } else {
            if (this.started || !hasWindowFocus()) {
                return;
            }
            this.presenter.start();
            this.started = true;
        }
    }

    public void disableLifeCycleManagement(boolean z) {
        this.disableRenderManagement = z;
    }

    public void register(Context context, NativeAd nativeAd, PresentationFactory presentationFactory, AdContract.AdvertisementPresenter.EventListener eventListener, AdConfig adConfig, final AdRequest adRequest) {
        this.presenterFactory = presentationFactory;
        this.listener = eventListener;
        this.request = adRequest;
        this.nativeAd = nativeAd;
        if (this.presenter == null) {
            presentationFactory.getNativeViewPresentation(context, this, adRequest, adConfig, new PresentationFactory.NativeViewCallback() { // from class: com.vungle.warren.NativeAdLayout.2
                @Override // com.vungle.warren.PresentationFactory.NativeViewCallback
                public void onResult(Pair<NativeAdContract.NativeView, NativeAdContract.NativePresenter> pair, VungleException vungleException) {
                    NativeAdLayout.this.presenterFactory = null;
                    if (vungleException != null) {
                        if (NativeAdLayout.this.listener != null) {
                            NativeAdLayout.this.listener.onError(vungleException, adRequest.getPlacementId());
                            return;
                        }
                        return;
                    }
                    NativeAdContract.NativeView nativeView = (NativeAdContract.NativeView) pair.first;
                    NativeAdLayout.this.presenter = (NativeAdContract.NativePresenter) pair.second;
                    NativeAdLayout.this.presenter.setEventListener(NativeAdLayout.this.listener);
                    NativeAdLayout.this.presenter.attach(nativeView, null);
                    if (NativeAdLayout.this.pendingStart.getAndSet(false)) {
                        NativeAdLayout.this.start();
                    }
                    if (NativeAdLayout.this.pendingImpression.getAndSet(false)) {
                        NativeAdLayout.this.presenter.onProgressUpdate(1, 100.0f);
                    }
                    if (NativeAdLayout.this.isAdVisible.get() != null) {
                        NativeAdLayout nativeAdLayout = NativeAdLayout.this;
                        nativeAdLayout.setAdVisibility(((Boolean) nativeAdLayout.isAdVisible.get()).booleanValue());
                    }
                    NativeAdLayout.this.destroyed = false;
                }
            });
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.clickListener = onItemClickListener;
    }

    public void onItemClicked(int i) {
        OnItemClickListener onItemClickListener = this.clickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClicked(i);
        }
    }

    public void release() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        this.presenter = null;
        this.presenterFactory = null;
    }
}
