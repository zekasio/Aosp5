package com.applovin.impl.adview.activity.b;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private double A;
    private double B;
    private final AtomicBoolean C;
    private final AtomicBoolean D;
    private boolean E;
    private long F;
    private long G;
    private final com.applovin.impl.adview.activity.a.d v;
    private final m w;
    private final ImageView x;
    private final com.applovin.impl.adview.a y;
    private final boolean z;

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    public g(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.v = new com.applovin.impl.adview.activity.a.d(this.f738a, this.e, this.b);
        boolean zF = this.f738a.f();
        this.z = zF;
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.E = Utils.isVideoMutedInitially(this.b);
        this.F = -2L;
        this.G = 0L;
        a aVar = new a();
        if (eVar.r() >= 0) {
            m mVar = new m(eVar.x(), activity);
            this.w = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(aVar);
        } else {
            this.w = null;
        }
        if (a(this.E, pVar)) {
            ImageView imageView = new ImageView(activity);
            this.x = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(aVar);
            d(this.E);
        } else {
            this.x = null;
        }
        if (zF) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue(), R.attr.progressBarStyleLarge);
            this.y = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            return;
        }
        this.y = null;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.v.a(this.x, this.w, this.h, this.y, this.g, this.f, viewGroup);
        this.f.getController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        this.f.renderAd(this.f738a);
        if (this.w != null) {
            this.b.M().a(new z(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.A();
                }
            }), o.a.MAIN, this.f738a.s(), true);
        }
        this.b.M().a(new z(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                if (g.this.h != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(g.this.h, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                if (g.this.g != null && g.this.g.b()) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(g.this.g, FriendlyObstructionPurpose.NOT_VISIBLE, g.this.g.getIdentifier()));
                }
                g.this.f738a.o().a(g.this.f, arrayList);
            }
        }), o.a.MAIN, 500L);
        super.b(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.D.compareAndSet(false, true)) {
            a(this.w, this.f738a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.F = -1L;
                    g.this.G = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public void x() {
        this.F = SystemClock.elapsedRealtime() - this.G;
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.F + "ms");
        }
        this.d.f();
        this.m++;
        if (this.f738a.y()) {
            h();
        } else {
            y();
        }
    }

    public void y() {
        if (this.C.compareAndSet(false, true)) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            b("javascript:al_showPostitial();");
            m mVar = this.w;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.x;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.y;
            if (aVar != null) {
                aVar.b();
            }
            if (this.h != null) {
                if (this.f738a.t() >= 0) {
                    a(this.h, this.f738a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.k = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.h.setVisibility(0);
                }
            }
            this.f.getController().n();
            v();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void w() {
        super.w();
        this.v.a(this.i);
        this.k = SystemClock.elapsedRealtime();
        this.A = 100.0d;
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d) {
        b("javascript:al_setVideoMuted(" + this.E + ");");
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.b();
        }
        if (this.w != null) {
            A();
        }
        this.f.getController().m();
        this.B = d;
        u();
        if (this.f738a.am()) {
            this.t.a(this.f738a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.g
    public void g_() {
        y();
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d) {
        this.A = d;
    }

    @Override // com.applovin.impl.adview.g
    public void h_() {
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.y;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return t() && !r();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        return this.A >= ((double) this.f738a.Q());
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        x();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        super.a((int) this.A, this.z, r(), this.F);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void u() {
        long jAd;
        long millis;
        if (this.f738a.ad() >= 0 || this.f738a.ae() >= 0) {
            if (this.f738a.ad() >= 0) {
                jAd = this.f738a.ad();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f738a;
                long millis2 = this.B > 0.0d ? TimeUnit.SECONDS.toMillis((long) this.B) : 0L;
                if (aVar.af()) {
                    int iL = (int) ((com.applovin.impl.sdk.ad.a) this.f738a).l();
                    if (iL > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iL);
                    } else {
                        int iT = (int) aVar.t();
                        if (iT > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iT);
                        }
                    }
                    millis2 += millis;
                }
                double d = millis2;
                double dAe = this.f738a.ae();
                Double.isNaN(dAe);
                Double.isNaN(d);
                jAd = (long) (d * (dAe / 100.0d));
            }
            b(jAd);
        }
    }

    private static boolean a(boolean z, p pVar) {
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cF)).booleanValue()) {
            return false;
        }
        if (!((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cG)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cI)).booleanValue();
    }

    private void d(boolean z) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawableM = Trace$$ExternalSyntheticApiModelOutline0.m((Object) this.e.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute));
            if (animatedVectorDrawableM != null) {
                this.x.setScaleType(ImageView.ScaleType.FIT_XY);
                this.x.setImageDrawable(animatedVectorDrawableM);
                animatedVectorDrawableM.start();
                return;
            }
        }
        Uri uriAE = z ? this.f738a.aE() : this.f738a.aF();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.x.setImageURI(uriAE);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    protected void z() {
        this.E = !this.E;
        b("javascript:al_setVideoMuted(" + this.E + ");");
        d(this.E);
        a(this.E, 0L);
    }

    private class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != g.this.w) {
                if (view == g.this.x) {
                    g.this.z();
                    return;
                }
                y yVar = g.this.c;
                if (y.a()) {
                    g.this.c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            if (g.this.s()) {
                g.this.p();
                g.this.t.b();
            } else {
                g.this.x();
            }
        }
    }
}
