package com.tapjoy;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.y5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TJAdUnitActivity extends TJActivity {
    public static TJAdUnitActivity l;
    public TJAdUnit g;
    public TJPlacementData h;
    public final Handler f = new Handler(Looper.getMainLooper());
    public TJAdUnitSaveStateData i = new TJAdUnitSaveStateData();
    public boolean j = false;
    public boolean k = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TJAdUnitActivity.this.g.getCloseRequested()) {
                TapjoyLog.d("TJAdUnitActivity", "Did not receive callback from content. Closing ad.");
                TJAdUnitActivity.this.finish();
            }
        }
    }

    public final void a(boolean z) {
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit == null) {
            finish();
        } else if (!tJAdUnit.getCloseRequested()) {
            TapjoyLog.d("TJAdUnitActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
            this.g.closeRequested(z);
            this.f.postDelayed(new a(), 1000L);
        }
        if (this.h != null) {
            TJMemoryDataStorage.getInstance().remove(this.h.getPlacementName());
        }
    }

    @Override // com.tapjoy.TJActivity
    public void e() {
        a(false);
    }

    public final void f() {
        l = null;
        this.j = true;
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit != null) {
            tJAdUnit.destroy();
        }
        TJPlacementData tJPlacementData = this.h;
        if (tJPlacementData != null) {
            if (tJPlacementData.getContentViewId() != null) {
                TapjoyConnectCore.viewDidClose(this.h.getContentViewId());
            }
            TJCorePlacement tJCorePlacementA = TJPlacementManager.a(this.h.getKey());
            if (tJCorePlacementA != null) {
                if (y5.e) {
                    HashMap map = new HashMap();
                    map.put("sdkCloseBtn", String.valueOf(this.k));
                    this.g.getTjBeacon().a("dismiss", map);
                }
                tJCorePlacementA.d();
            }
        }
    }

    @Override // com.tapjoy.TJActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit != null) {
            tJAdUnit.notifyOrientationChanged();
        }
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TapjoyLog.d("TJAdUnitActivity", "TJAdUnitActivity onCreate: " + bundle);
        super.onCreate(bundle);
        l = this;
        if (bundle != null) {
            TJAdUnitSaveStateData tJAdUnitSaveStateData = (TJAdUnitSaveStateData) bundle.getSerializable("ad_unit_bundle");
            this.i = tJAdUnitSaveStateData;
            if (tJAdUnitSaveStateData != null && tJAdUnitSaveStateData.isVideoComplete) {
                TapjoyLog.d("TJAdUnitActivity", "finishing TJAdUnitActivity");
                finish();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_NAME) : null;
        TJPlacementData tJPlacementData = string != null ? (TJPlacementData) TJMemoryDataStorage.getInstance().get(string) : null;
        this.h = tJPlacementData;
        if (tJPlacementData == null) {
            TapjoyLog.e("TJAdUnitActivity", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to launch AdUnit Activity"));
            finish();
            return;
        }
        if (tJPlacementData.getContentViewId() != null) {
            TapjoyConnectCore.viewWillOpen(this.h.getContentViewId(), 1);
        }
        if (TJPlacementManager.a(this.h.getKey()) != null) {
            this.g = TJPlacementManager.a(this.h.getKey()).getAdUnit();
        } else {
            this.g = new TJAdUnit();
        }
        if (!this.g.hasCalledLoad()) {
            TapjoyLog.d("TJAdUnitActivity", "No content loaded for ad unit -- loading now");
            this.g.load(this.h, false, this);
        }
        this.g.setAdUnitActivity(this);
        try {
            TJAdUnit tJAdUnit = this.g;
            tJAdUnit.setOrientation(tJAdUnit.getTargetOrientation());
            TJWebView backgroundWebView = this.g.getBackgroundWebView();
            backgroundWebView.setLayoutParams(this.b);
            if (backgroundWebView.getParent() != null) {
                ((ViewGroup) backgroundWebView.getParent()).removeView(backgroundWebView);
            }
            TJWebView webView = this.g.getWebView();
            webView.setLayoutParams(this.b);
            if (webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            VideoView videoView = this.g.getVideoView();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (videoView.getParent() != null) {
                ((ViewGroup) videoView.getParent()).removeView(videoView);
            }
            this.f1623a.addView(backgroundWebView);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setGravity(17);
            linearLayout.addView(videoView, new LinearLayout.LayoutParams(-1, -1));
            this.f1623a.addView(linearLayout, layoutParams);
            this.f1623a.addView(webView);
            if (this.h.hasProgressSpinner()) {
                setProgressSpinnerVisibility(true);
            } else {
                setProgressSpinnerVisibility(false);
            }
            this.f1623a.addView(this.d);
            this.f1623a.addView(this.c);
            setContentView(this.f1623a);
            this.g.setVisible(true);
        } catch (Exception e) {
            TapjoyLog.e("TJAdUnitActivity", e.getMessage());
        }
        TJCorePlacement tJCorePlacementA = TJPlacementManager.a(this.h.getKey());
        if (tJCorePlacementA != null) {
            tJCorePlacementA.f();
            if (this.g.getSdkBeacon() != null) {
                this.g.getSdkBeacon().a();
            }
        }
        this.g.e();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        TJPlacementData tJPlacementData = this.h;
        if ((tJPlacementData == null || tJPlacementData.shouldHandleDismissOnPause()) && this.j) {
            return;
        }
        f();
    }

    @Override // android.app.Activity
    public void onPause() {
        TJPlacementData tJPlacementData;
        super.onPause();
        TapjoyLog.d("TJAdUnitActivity", "onPause");
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit != null) {
            tJAdUnit.pause();
        } else {
            finish();
        }
        if (isFinishing() && (tJPlacementData = this.h) != null && tJPlacementData.shouldHandleDismissOnPause()) {
            TapjoyLog.d("TJAdUnitActivity", "is Finishing");
            f();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        TapjoyLog.d("TJAdUnitActivity", "onResume");
        super.onResume();
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit != null) {
            if (tJAdUnit.isLockedOrientation()) {
                setRequestedOrientation(this.g.getLockedOrientation());
            }
            this.g.resume(this.i);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TapjoyLog.d("TJAdUnitActivity", "onSaveInstanceState");
        TJAdUnit tJAdUnit = this.g;
        if (tJAdUnit != null) {
            this.i.seekTime = tJAdUnit.getVideoSeekTime();
            this.i.isVideoComplete = this.g.isVideoComplete();
            this.i.isVideoMuted = this.g.isMuted();
            bundle.putSerializable("ad_unit_bundle", this.i);
        }
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        TapjoyLog.d("TJAdUnitActivity", "onStart");
    }

    @Override // com.tapjoy.TJActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        TapjoyLog.d("TJAdUnitActivity", "onStop");
    }

    public void setSdkCloseButtonClicked(boolean z) {
        this.k = z;
    }

    public void a(float f, float f2, float f3, float f4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, f2, displayMetrics);
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, f3, displayMetrics);
        int iApplyDimension4 = (int) TypedValue.applyDimension(1, f4, displayMetrics);
        ViewGroup viewGroup = (ViewGroup) this.g.getVideoView().getParent();
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).setMargins(iApplyDimension, iApplyDimension2, iApplyDimension3, iApplyDimension4);
        viewGroup.requestLayout();
    }
}
