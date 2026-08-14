package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final y logger;
    private final p sdk;

    public AppLovinNativeAdService(p pVar) {
        this.sdk = pVar;
        this.logger = pVar.L();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            y.i(TAG, "Empty ad token");
            k.a(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(strTrim, this.sdk);
        if (cVar.b() == c.a.REGULAR) {
            if (y.a()) {
                this.logger.b(TAG, "Loading next ad for token: " + cVar);
            }
            this.sdk.M().a(new b(cVar, appLovinNativeAdLoadListener, this.sdk), o.a.MAIN);
            return;
        }
        if (cVar.b() == c.a.AD_RESPONSE_JSON) {
            JSONObject jSONObjectD = cVar.d();
            if (jSONObjectD != null) {
                i.f(jSONObjectD, this.sdk);
                i.d(jSONObjectD, this.sdk);
                i.c(jSONObjectD, this.sdk);
                i.e(jSONObjectD, this.sdk);
                if (JsonUtils.getJSONArray(jSONObjectD, "ads", new JSONArray()).length() > 0) {
                    if (y.a()) {
                        this.logger.b(TAG, "Rendering ad for token: " + cVar);
                    }
                    this.sdk.M().a(new d(jSONObjectD, appLovinNativeAdLoadListener, this.sdk), o.a.MAIN);
                    return;
                }
                if (y.a()) {
                    this.logger.e(TAG, "No ad returned from the server for token: " + cVar);
                }
                k.a(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
                return;
            }
            String str2 = "Unable to retrieve ad response JSON from token: " + cVar.a();
            AppLovinError appLovinError = new AppLovinError(-8, str2);
            y.i(TAG, str2);
            k.a(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
        y.i(TAG, "Invalid token type");
        k.a(appLovinNativeAdLoadListener, appLovinError2);
    }
}
