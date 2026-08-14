package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f726a;

    public a(Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.f726a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void setColor(int i) {
        this.f726a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }
}
