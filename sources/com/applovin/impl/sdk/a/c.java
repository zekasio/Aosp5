package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.y;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public c(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(this.b.ag().d(), webView, this.f1194a.getOpenMeasurementContentUrl(), this.f1194a.getOpenMeasurementCustomReferenceData());
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
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }
}
