package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {
    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public d(e eVar, Activity activity, p pVar) {
        super(eVar, activity, pVar);
    }

    public void a(ImageView imageView, m mVar, m mVar2, com.applovin.impl.adview.a aVar, u uVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.c.X(), (this.c.ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            a(this.c.X(), (this.c.ab() ? 3 : 5) | 48, mVar2);
        }
        if (imageView != null) {
            int iDpToPx = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f733a.a(com.applovin.impl.sdk.c.b.cK)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) this.f733a.a(com.applovin.impl.sdk.c.b.cM)).intValue());
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.f733a.a(com.applovin.impl.sdk.c.b.cL)).intValue());
            layoutParams.setMargins(iDpToPx2, iDpToPx2, iDpToPx2, iDpToPx2);
            this.d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.d.addView(aVar, this.e);
        }
        if (uVar != null) {
            this.d.addView(uVar, new ViewGroup.LayoutParams(-1, -1));
        }
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        } else {
            this.b.setContentView(this.d);
        }
    }
}
