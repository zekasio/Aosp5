package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.applovin.impl.adview.activity.a.a
    public /* bridge */ /* synthetic */ void a(m mVar) {
        super.a(mVar);
    }

    public c(e eVar, Activity activity, p pVar) {
        super(eVar, activity, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.ImageView r20, com.applovin.impl.adview.m r21, final com.applovin.impl.adview.v r22, com.applovin.impl.adview.a r23, android.widget.ProgressBar r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, com.applovin.impl.adview.u r27, android.widget.ImageView r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.a.c.a(android.widget.ImageView, com.applovin.impl.adview.m, com.applovin.impl.adview.v, com.applovin.impl.adview.a, android.widget.ProgressBar, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.u, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public void a(m mVar, u uVar, View view) {
        if (view != null) {
            view.setVisibility(0);
        }
        com.applovin.impl.sdk.utils.c.a(this.d, view);
        if (mVar != null) {
            a(this.c.X(), (this.c.ab() ? 3 : 5) | 48, mVar);
        }
        if (uVar != null) {
            this.d.addView(uVar, this.e);
        }
    }
}
