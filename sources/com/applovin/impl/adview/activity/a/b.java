package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public b(e eVar, Activity activity, p pVar) {
        super(eVar, activity, pVar);
    }

    public void a(m mVar, u uVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.c.X(), (this.c.ab() ? 3 : 5) | 48, mVar);
        }
        if (uVar != null) {
            this.d.addView(uVar, this.e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }
}
