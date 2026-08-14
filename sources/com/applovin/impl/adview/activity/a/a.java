package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f733a;
    final Activity b;
    final e c;
    final ViewGroup d;
    final FrameLayout.LayoutParams e;

    a(e eVar, Activity activity, p pVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.e = layoutParams;
        this.c = eVar;
        this.f733a = pVar;
        this.b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.d.removeView(view);
    }

    public void a(m mVar) {
        if (mVar == null || mVar.getParent() != null) {
            return;
        }
        a(this.c.X(), (this.c.ab() ? 3 : 5) | 48, mVar);
    }

    void a(e.c cVar, int i, m mVar) {
        mVar.a(cVar.f1232a, cVar.e, cVar.d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        layoutParams.setMargins(cVar.c, cVar.b, cVar.c, 0);
        layoutParams.gravity = i;
        this.d.addView(mVar, layoutParams);
    }
}
