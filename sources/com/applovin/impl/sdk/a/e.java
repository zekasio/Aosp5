package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.y;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes.dex */
public class e extends b {
    public e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.b.ag().d(), this.b.ag().e(), this.f1194a.getOpenMeasurementVerificationScriptResources(), this.f1194a.getOpenMeasurementContentUrl(), this.f1194a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b(this.d, "Failed to create ad session context", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }
}
