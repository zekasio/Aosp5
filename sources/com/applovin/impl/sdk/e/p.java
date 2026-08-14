package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import com.tapjoy.TapjoyAuctionFlags;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p extends a implements com.applovin.impl.sdk.ad.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f1307a;
    private final com.applovin.impl.sdk.ad.d b;
    private final com.applovin.impl.sdk.ad.b c;
    private final AppLovinAdLoadListener d;

    public p(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessAdResponse", pVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f1307a = jSONObject;
        this.b = dVar;
        this.c = bVar;
        this.d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f1307a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.d(this.g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.b.a(), this.b.b(), this.f1307a, this.f);
        failedToReceiveAdV2(AppLovinError.NO_FILL);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, TapjoyAuctionFlags.AUCTION_TYPE, AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Starting task for AppLovin ad...");
            }
            this.f.M().a((a) new s(jSONObject, this.f1307a, this.c, this, this.f));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Starting task for VAST ad...");
            }
            this.f.M().a((a) r.a(jSONObject, this.f1307a, this.c, this, this.f));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            com.applovin.impl.sdk.y yVar3 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Starting task for JS tag ad...");
            }
            this.f.M().a((a) new q(jSONObject, this.f1307a, this.c, this, this.f));
            return;
        }
        com.applovin.impl.sdk.y yVar4 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.e(this.g, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.d;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.sdk.ad.i
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.d;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }
}
