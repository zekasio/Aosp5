package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1219a;
    private final y b;
    private final View c;

    public ac(View view, p pVar) {
        this.f1219a = pVar;
        this.b = pVar.L();
        this.c = view;
    }

    public long a(com.applovin.impl.mediation.a.e eVar) {
        long j;
        if (y.a()) {
            this.b.b("ViewabilityTracker", "Checking visibility...");
        }
        Point pointA = com.applovin.impl.sdk.utils.h.a(this.c.getContext());
        if (this.c.isShown()) {
            j = 0;
        } else {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.c.getAlpha() < eVar.N()) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.c.getParent() == null) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getWidth());
        if (iPxToDp < Math.min(eVar.L(), pointA.x)) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getHeight());
        if (iPxToDp2 < eVar.M()) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, pointA.x, pointA.y);
        int[] iArr = {-1, -1};
        this.c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.c.getWidth() + i, iArr[1] + this.c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity activityA = this.f1219a.w().a();
        if (activityA != null && !Utils.isViewInTopActivity(this.c, activityA)) {
            if (y.a()) {
                this.b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (y.a()) {
            this.b.b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
