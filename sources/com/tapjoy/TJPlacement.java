package com.tapjoy;

import android.content.Context;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.a;
import com.tapjoy.internal.e6;
import com.tapjoy.internal.y5;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class TJPlacement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TJCorePlacement f1693a;
    public TJPlacementListener b;
    public TJPlacementListener c;
    public TJPlacementVideoListener d;
    public String e;
    public String pushId;

    @Deprecated
    public TJPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        TJCorePlacement tJCorePlacementA = TJPlacementManager.a(str);
        tJCorePlacementA = tJCorePlacementA == null ? TJPlacementManager.a(str, "", "", false, false) : tJCorePlacementA;
        tJCorePlacementA.setContext(context);
        a(tJCorePlacementA, tJPlacementListener);
    }

    public static void dismissContent() {
        TJPlacementManager.dismissContentShowing("true".equals(TapjoyConnectCore.getConnectFlagValue("TJC_OPTION_DISMISS_CONTENT_ALL")));
    }

    public final void a(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        this.f1693a = tJCorePlacement;
        this.e = UUID.randomUUID().toString();
        this.b = tJPlacementListener;
        this.c = tJPlacementListener != null ? (TJPlacementListener) a.a(tJPlacementListener, (Class<TJPlacementListener>) TJPlacementListener.class) : null;
        FiveRocksIntegration.addPlacementCallback(getName(), this);
    }

    public String getGUID() {
        return this.e;
    }

    public TJPlacementListener getListener() {
        return this.b;
    }

    public String getName() {
        return this.f1693a.getPlacementData() != null ? this.f1693a.getPlacementData().getPlacementName() : "";
    }

    public TJPlacementVideoListener getVideoListener() {
        return this.d;
    }

    public boolean isContentAvailable() {
        return this.f1693a.isContentAvailable();
    }

    public boolean isContentReady() {
        return this.f1693a.isContentReady();
    }

    public boolean isLimited() {
        return this.f1693a.isLimited();
    }

    public void requestContent() {
        String name = getName();
        TapjoyLog.i("TJPlacement", "requestContent() called for placement " + name);
        e6 e6Var = e6.h;
        if (e6Var != null && TextUtils.isEmpty(e6Var.b)) {
            TapjoyLog.w("TJPlacement", "[INFO] Your application calls requestContent without having previously called setUserConsent. You can review Tapjoy supported consent API here - https://dev.tapjoy.com/sdk-integration/#sdk11122_gdpr_release.");
        }
        if (!(!isLimited() ? TapjoyConnectCore.isConnected() : TapjoyConnectCore.isLimitedConnected())) {
            this.f1693a.a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, new TJError(0, "SDK not connected -- connect must be called first with a successful callback"));
            return;
        }
        if (this.f1693a.getContext() == null) {
            this.f1693a.a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, new TJError(0, "Context is null -- TJPlacement requires a valid Context."));
        } else if (TextUtils.isEmpty(name)) {
            this.f1693a.a(this, TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, new TJError(0, "Invalid placement name -- TJPlacement requires a valid placement name."));
        } else {
            this.f1693a.g.setSdkBeacon();
            this.f1693a.c(this);
        }
    }

    public void setAdapterVersion(String str) {
        this.f1693a.d(str);
    }

    public void setAuctionData(HashMap<String, String> map) {
        if (map == null || map.isEmpty()) {
            TapjoyLog.d("TJPlacement", "auctionData can not be null or empty");
        } else {
            this.f1693a.a(map);
        }
    }

    public void setMediationId(String str) {
        this.f1693a.e(str);
    }

    public void setMediationName(String str) {
        TapjoyLog.d("TJPlacement", "setMediationName=" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TJCorePlacement tJCorePlacement = this.f1693a;
        Context context = tJCorePlacement != null ? tJCorePlacement.getContext() : null;
        TJCorePlacement tJCorePlacementA = TJPlacementManager.a(getName(), str, "", false, isLimited());
        this.f1693a = tJCorePlacementA;
        tJCorePlacementA.f(str);
        if (context != null) {
            this.f1693a.setContext(context);
        }
    }

    public void setVideoListener(TJPlacementVideoListener tJPlacementVideoListener) {
        this.d = tJPlacementVideoListener;
    }

    public void showContent() {
        TapjoyLog.i("TJPlacement", "showContent() called for placement " + getName());
        if (y5.e) {
            HashMap map = new HashMap();
            map.put("contentReady", String.valueOf(isContentReady()));
            this.f1693a.getAdUnit().getTjBeacon().a(TJAdUnitConstants.String.BEACON_SHOW_PATH, map);
        }
        if (this.f1693a.isContentAvailable()) {
            this.f1693a.d(this);
        } else {
            TapjoyLog.e("TJPlacement", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "No placement content available. Can not show content for non-200 placement."));
        }
    }

    public TJPlacement(TJCorePlacement tJCorePlacement, TJPlacementListener tJPlacementListener) {
        a(tJCorePlacement, tJPlacementListener);
    }

    public TJPlacementListener a() {
        return this.c;
    }
}
