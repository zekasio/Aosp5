package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.i;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
class l extends Dialog implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f823a;
    private final com.applovin.impl.sdk.p b;
    private final com.applovin.impl.sdk.y c;
    private final d d;
    private final com.applovin.impl.sdk.ad.a e;
    private RelativeLayout f;
    private i g;

    l(com.applovin.impl.sdk.ad.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.p pVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.b = pVar;
        this.c = pVar.L();
        this.f823a = activity;
        this.d = dVar;
        this.e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f823a.getWindow().getAttributes().flags, this.f823a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.y.a()) {
                this.c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.c.b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f823a);
        this.f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f.setBackgroundColor(-1157627904);
        this.f.addView(this.d);
        if (!this.e.m()) {
            a(this.e.n());
            e();
        }
        setContentView(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.l.1
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.k
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.f823a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                l.this.f.removeView(l.this.d);
                l.super.dismiss();
            }
        });
    }

    private void a(i.a aVar) {
        if (this.g != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        i iVarA = i.a(aVar, this.f823a);
        this.g = iVarA;
        iVarA.setVisibility(8);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                l.this.d();
            }
        });
        this.g.setClickable(false);
        int iA = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cj)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        layoutParams.addRule(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cm)).booleanValue() ? 9 : 11);
        this.g.a(iA);
        int iA2 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cl)).intValue());
        int iA3 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.ck)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f.addView(this.g, layoutParams);
        this.g.bringToFront();
        int iA4 = a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cn)).intValue());
        View view = new View(this.f823a);
        view.setBackgroundColor(0);
        int i = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cm)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (l.this.g.isClickable()) {
                    l.this.g.performClick();
                }
            }
        });
        this.f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void e() {
        this.f823a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (l.this.g == null) {
                        l.this.d();
                    }
                    l.this.g.setVisibility(0);
                    l.this.g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.l.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            l.this.g.setClickable(true);
                        }
                    });
                    l.this.g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y unused = l.this.c;
                    if (com.applovin.impl.sdk.y.a()) {
                        l.this.c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    l.this.d();
                }
            }
        });
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f823a, i);
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.e;
    }

    public d b() {
        return this.d;
    }
}
