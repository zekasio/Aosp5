package com.applovin.mediation.hybridAds;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends Activity implements a.InterfaceC0084a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected p f1522a;
    protected a b;
    protected c c = new c(null);
    private MaxAdapterListener d;

    protected void a(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
        this.f1522a = pVar;
        this.d = maxAdapterListener;
        this.c = cVar.q();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(this.c.a());
        p pVar = this.f1522a;
        com.applovin.impl.sdk.utils.b.a(pVar != null ? ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cS)).booleanValue() : true, this);
        a aVar = new a(this.c, this);
        this.b = aVar;
        aVar.setListener(this);
        this.b.setVisibility(4);
        viewGroup.addView(this.b);
        r.a(this.b, this.c.f());
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener == null) {
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
        }
    }

    @Override // com.applovin.mediation.hybridAds.a.InterfaceC0084a
    public void a(a aVar) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }
}
