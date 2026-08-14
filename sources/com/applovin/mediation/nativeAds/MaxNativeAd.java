package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public boolean isContainerClickable() {
        return false;
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f1527a;
        this.title = builder.b;
        this.advertiser = builder.c;
        this.body = builder.d;
        this.callToAction = builder.e;
        this.icon = builder.f;
        this.iconView = builder.g;
        this.optionsView = builder.h;
        this.mediaView = builder.i;
        this.mainImage = builder.j;
        this.mediaContentAspectRatio = builder.k;
        Double d = builder.l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f1527a;
        private String b;
        private String c;
        private String d;
        private String e;
        private MaxNativeAdImage f;
        private View g;
        private View h;
        private View i;
        private MaxNativeAdImage j;
        private float k;
        private Double l;

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f1527a = maxAdFormat;
            return this;
        }

        public Builder setTitle(String str) {
            this.b = str;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.g = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.h = view;
            return this;
        }

        public Builder setMediaView(View view) {
            this.i = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.k = f;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.l = d;
            return this;
        }

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }
    }

    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f1528a;
        private Uri b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f1528a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.b = uri;
        }

        public Drawable getDrawable() {
            return this.f1528a;
        }

        public Uri getUri() {
            return this.b;
        }
    }
}
