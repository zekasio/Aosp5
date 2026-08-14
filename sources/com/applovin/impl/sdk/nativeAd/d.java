package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f1363a;
    private final AppLovinNativeAdLoadListener b;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskProcessNativeAdResponse", pVar);
        this.f1363a = jSONObject;
        this.b = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f1363a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Processing ad...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f1363a, this.b, this.f));
            return;
        }
        y yVar2 = this.h;
        if (y.a()) {
            this.h.d(this.g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f1363a, this.f);
        this.b.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
