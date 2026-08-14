package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.c;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f1515a;
    private View b;
    private int c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, c.a(context), appLovinSdk, context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f1515a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f1515a.setListener(maxAdViewAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f1515a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f1515a.setRevenueListener(maxAdRevenueListener);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f1515a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f1515a.setRequestListener(maxAdRequestListener);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f1515a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f1515a.setAdReviewListener(maxAdReviewListener);
    }

    public void loadAd() {
        this.f1515a.logApiCall("loadAd()");
        this.f1515a.loadAd();
    }

    public void startAutoRefresh() {
        this.f1515a.logApiCall("startAutoRefresh()");
        this.f1515a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f1515a.logApiCall("stopAutoRefresh()");
        this.f1515a.stopAutoRefresh();
    }

    public void setPlacement(String str) {
        this.f1515a.logApiCall("setPlacement(placement=" + str + ")");
        this.f1515a.setPlacement(str);
    }

    public String getPlacement() {
        this.f1515a.logApiCall("getPlacement()");
        return this.f1515a.getPlacement();
    }

    public String getAdUnitId() {
        return this.f1515a.getAdUnitId();
    }

    public MaxAdFormat getAdFormat() {
        return this.f1515a.getAdFormat();
    }

    public void destroy() {
        this.f1515a.destroy();
    }

    public void setExtraParameter(String str, String str2) {
        this.f1515a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f1515a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f1515a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f1515a.setLocalExtraParameter(str, obj);
    }

    public void setCustomData(String str) {
        this.f1515a.logApiCall("setCustomData(value=" + str + ")");
        this.f1515a.setCustomData(str);
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i);
        String strA = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = c.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (isInEditMode()) {
            a(context);
        } else {
            a(strA, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(context), context);
        }
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.b = view;
        view.setBackgroundColor(0);
        addView(this.b);
        this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.c = getVisibility();
        this.f1515a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.b, appLovinSdk.coreSdk, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f1515a.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl = this.f1515a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i);
        }
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f1515a.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f1515a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode()) {
            return;
        }
        this.f1515a.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f1515a != null && r.a(this.c, i)) {
            this.f1515a.onWindowVisibilityChanged(i);
        }
        this.c = i;
    }
}
