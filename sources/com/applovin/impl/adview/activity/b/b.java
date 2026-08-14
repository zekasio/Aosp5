package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
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
public class b extends a {
    private final com.applovin.impl.adview.activity.a.b v;
    private com.applovin.impl.sdk.utils.f w;
    private long x;
    private final AtomicBoolean y;

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j) {
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return false;
    }

    public b(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.v = new com.applovin.impl.adview.activity.a.b(this.f738a, this.e, this.b);
        this.y = new AtomicBoolean();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.v.a(this.h, this.g, this.f, viewGroup);
        a(false);
        if (this.g != null) {
            this.g.a();
        }
        this.f.renderAd(this.f738a);
        a("javascript:al_onPoststitialShow();", this.f738a.S());
        if (t()) {
            long jC = c();
            this.x = jC;
            if (jC > 0) {
                y yVar = this.c;
                if (y.a()) {
                    this.c.b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.x + "ms...");
                }
                this.w = com.applovin.impl.sdk.utils.f.a(this.x, this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        y yVar2 = b.this.c;
                        if (y.a()) {
                            b.this.c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        b.this.y.set(true);
                    }
                });
            }
        }
        if (this.h != null) {
            if (this.f738a.t() >= 0) {
                a(this.h, this.f738a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.h.setVisibility(0);
            }
        }
        u();
        this.b.M().a(new z(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                if (b.this.h != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(b.this.h, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                if (b.this.g != null && b.this.g.b()) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(b.this.g, FriendlyObstructionPurpose.NOT_VISIBLE, b.this.g.getIdentifier()));
                }
                b.this.f738a.o().a(b.this.f, arrayList);
            }
        }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        v();
        super.b(Utils.isVideoMutedInitially(this.b));
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        com.applovin.impl.sdk.utils.f fVar = this.w;
        if (fVar != null) {
            fVar.a();
            this.w = null;
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        if (t()) {
            return this.y.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        com.applovin.impl.sdk.utils.f fVar;
        boolean zR = r();
        int iMin = 100;
        if (t()) {
            if (!zR && (fVar = this.w) != null) {
                double dB = this.x - fVar.b();
                double d = this.x;
                Double.isNaN(dB);
                Double.isNaN(d);
                iMin = (int) Math.min(100.0d, (dB / d) * 100.0d);
            }
            y yVar = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        super.a(iMin, false, zR, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void u() {
        long jAd;
        long millis = 0;
        if (this.f738a.ad() >= 0 || this.f738a.ae() >= 0) {
            if (this.f738a.ad() >= 0) {
                jAd = this.f738a.ad();
            } else {
                if (this.f738a.af()) {
                    int iL = (int) ((com.applovin.impl.sdk.ad.a) this.f738a).l();
                    if (iL > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iL);
                    } else {
                        int iT = (int) this.f738a.t();
                        if (iT > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iT);
                        }
                    }
                }
                double d = millis;
                double dAe = this.f738a.ae();
                Double.isNaN(dAe);
                Double.isNaN(d);
                jAd = (long) (d * (dAe / 100.0d));
            }
            b(jAd);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void w() {
        super.w();
        this.v.a(this.i);
        this.k = SystemClock.elapsedRealtime();
        this.y.set(true);
    }

    private long c() {
        if (!(this.f738a instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fL = ((com.applovin.impl.sdk.ad.a) this.f738a).l();
        if (fL <= 0.0f) {
            fL = this.f738a.t();
        }
        double dSecondsToMillisLong = Utils.secondsToMillisLong(fL);
        double dR = this.f738a.R();
        Double.isNaN(dR);
        Double.isNaN(dSecondsToMillisLong);
        return (long) (dSecondsToMillisLong * (dR / 100.0d));
    }
}
