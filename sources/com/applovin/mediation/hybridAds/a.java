package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.r;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0084a f1521a;

    /* JADX INFO: renamed from: com.applovin.mediation.hybridAds.a$a, reason: collision with other inner class name */
    interface InterfaceC0084a {
        void a(a aVar);
    }

    public void setListener(InterfaceC0084a interfaceC0084a) {
        this.f1521a = interfaceC0084a;
    }

    public a(c cVar, Context context) {
        super(context);
        setOnClickListener(this);
        r rVar = new r(context);
        int iDpToPx = AppLovinSdkUtils.dpToPx(context, cVar.d());
        rVar.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 17));
        rVar.a(iDpToPx);
        addView(rVar);
        int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, cVar.d() + (cVar.e() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, BadgeDrawable.TOP_END);
        int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, cVar.b());
        int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, cVar.c());
        layoutParams.setMargins(iDpToPx4, iDpToPx3, iDpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1521a.a(this);
    }
}
