package com.applovin.mediation.hybridAds;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

/* JADX INFO: loaded from: classes.dex */
public class MaxHybridMRecAdActivity extends b {
    private com.applovin.impl.mediation.a.c d;
    private View e;

    protected void a(com.applovin.impl.mediation.a.c cVar, View view, p pVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, pVar, maxAdapterListener);
        this.d = cVar;
        this.e = view;
    }

    @Override // com.applovin.mediation.hybridAds.b, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.e == null) {
            com.applovin.impl.mediation.a.c cVar = this.d;
            if (cVar == null) {
                throw new IllegalStateException("Mediated hybrid ad is null");
            }
            String networkName = cVar.getNetworkName();
            String str = "Null hybrid MREC ad from network (" + networkName + ")";
            if ("APPLOVIN_EXCHANGE".equalsIgnoreCase(networkName)) {
                str = str + " and DSP (" + this.d.getDspName() + ")";
            }
            if (((Boolean) this.f1522a.a(com.applovin.impl.sdk.c.a.Z)).booleanValue()) {
                throw new IllegalStateException(str);
            }
            this.f1522a.L();
            if (y.a()) {
                this.f1522a.L().e("MaxHybridMRecAdActivity", "Finishing hybrid ad activity: " + str);
            }
            finish();
            return;
        }
        ((ViewGroup) findViewById(R.id.content)).addView(this.e);
        this.b.bringToFront();
    }
}
