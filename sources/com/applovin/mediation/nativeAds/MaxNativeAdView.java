package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import com.vungle.warren.AdLoader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1530a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final FrameLayout f;
    private final ViewGroup g;
    private final FrameLayout h;
    private final ViewGroup i;
    private final ViewGroup j;
    private final FrameLayout k;
    private final Button l;
    private b m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        if (maxNativeAdViewBinder.mainView != null) {
            this.f1530a = maxNativeAdViewBinder.mainView;
        } else {
            if (z) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f1530a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f1530a);
        this.b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.i = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.j = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.k = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.l = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    public void render(d dVar, a.InterfaceC0058a interfaceC0058a, p pVar) {
        recycle();
        if (!dVar.I().get() || !dVar.H().get()) {
            this.m = new b(dVar, this, interfaceC0058a, pVar);
        }
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (dVar.F() && nativeAd.isContainerClickable()) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        if (StringUtils.isValidString(dVar.E())) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.m;
        if (bVar != null) {
            bVar.a();
            this.m = null;
        }
        View view = this.f1530a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f1530a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f1530a);
    }

    public b getAdViewTracker() {
        return this.m;
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            if ("vertical_media_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_media_banner_view;
            }
            return R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return R.layout.max_native_ad_vertical_leader_view;
            }
            return R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.b == null) {
            y.h("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.b.setText(maxNativeAd.getTitle());
        } else {
            this.b.setVisibility(8);
        }
        if (this.c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(4);
            }
        }
        if (this.l != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.l.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            if (icon == null || this.e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f.removeAllViews();
                    this.f.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                this.e.setImageURI(icon.getUri());
            } else {
                this.f.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.h.addView(optionsView);
            this.h.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.k != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.k.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.k.setVisibility(8);
            }
        }
        if (this.i != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.i.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.i.addView(appLovinStarRatingView);
            } else {
                this.i.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, AdLoader.RETRY_DELAY);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.l;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.e;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.e.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    this.e.setImageURI(icon.getUri());
                } else {
                    this.e.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.j.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.g.addView(optionsView);
                this.g.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.i;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.i.addView(appLovinStarRatingView);
            }
        }
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        p pVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                        pVar.L();
                        if (y.a()) {
                            pVar.L().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                        }
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    public View getMainView() {
        return this.f1530a;
    }

    public TextView getTitleTextView() {
        return this.b;
    }

    public TextView getAdvertiserTextView() {
        return this.c;
    }

    public TextView getBodyTextView() {
        return this.d;
    }

    public ImageView getIconImageView() {
        return this.e;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.g;
        return viewGroup != null ? viewGroup : this.h;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.h;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.i;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.j;
        return viewGroup != null ? viewGroup : this.k;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.k;
    }

    public Button getCallToActionButton() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.m;
        if (bVar != null) {
            bVar.b();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        y.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        Button button = this.l;
        if (button != null) {
            arrayList.add(button);
        }
        return arrayList;
    }
}
