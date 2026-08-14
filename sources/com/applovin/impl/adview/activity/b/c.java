package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.ViewGroup;
import com.applovin.impl.adview.j;
import com.applovin.impl.c.a;
import com.applovin.impl.c.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.c.n;
import com.applovin.impl.c.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.vungle.warren.analytics.AnalyticsEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {
    private final com.applovin.impl.c.a I;
    private final Set<k> J;

    public c(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.J = hashSet;
        com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) eVar;
        this.I = aVar;
        hashSet.addAll(aVar.a(a.c.VIDEO, l.f914a));
        a(a.c.IMPRESSION);
        a(a.c.VIDEO, "creativeView");
        aVar.o().d();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(this.G ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.I.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.G ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.I.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.I != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.C.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.c.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(c.this.E - (c.this.w.H() - c.this.w.I()));
                int iF = c.this.F();
                HashSet hashSet = new HashSet();
                for (k kVar : new HashSet(c.this.J)) {
                    if (kVar.a(seconds, iF)) {
                        hashSet.add(kVar);
                        c.this.J.remove(kVar);
                    }
                }
                c.this.a(hashSet);
                if (iF >= 25 && iF < 50) {
                    c.this.I.o().f();
                    return;
                }
                if (iF >= 50 && iF < 75) {
                    c.this.I.o().g();
                } else if (iF >= 75) {
                    c.this.I.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !c.this.G;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.x != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.x, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.y != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.y, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.B != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.B, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.z != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.z, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.A != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.A, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        if (this.g != null && this.g.b()) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.g, FriendlyObstructionPurpose.NOT_VISIBLE, this.g.getIdentifier()));
        }
        this.I.o().a(this.v, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void c(long j) {
        super.c(j);
        this.I.o().a(TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.b));
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void a(PointF pointF, boolean z) {
        a(a.c.VIDEO_CLICK);
        this.I.o().o();
        super.a(pointF, z);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void e() {
        this.C.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c() {
        a(a.c.VIDEO, "skip");
        this.I.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void x() {
        super.x();
        com.applovin.impl.c.a aVar = this.I;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void y() {
        super.y();
        com.applovin.impl.c.a aVar = this.I;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.I.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void z() {
        super.z();
        a(a.c.VIDEO, this.D ? AnalyticsEvent.Ad.mute : AnalyticsEvent.Ad.unmute);
        this.I.o().a(this.D);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void A() {
        G();
        if (m.c(this.I)) {
            if (this.G) {
                return;
            }
            a(a.c.COMPANION, "creativeView");
            this.I.o().i();
            super.A();
            return;
        }
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        h();
    }

    private void G() {
        if (!r() || this.J.isEmpty()) {
            return;
        }
        y yVar = this.c;
        if (y.a()) {
            this.c.d("AppLovinFullscreenActivity", "Firing " + this.J.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.c.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str, com.applovin.impl.c.f fVar) {
        a(this.I.a(cVar, str), fVar);
    }

    private void a(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.w.I());
        o oVarAP = this.I.aP();
        Uri uriA = oVarAP != null ? oVarAP.a() : null;
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, uriA, fVar, this.b);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    protected void u() {
        long jAd;
        int iT;
        long millis = 0;
        if (this.I.ad() >= 0 || this.I.ae() >= 0) {
            if (this.I.ad() >= 0) {
                jAd = this.I.ad();
            } else {
                com.applovin.impl.c.a aVar = this.I;
                n nVarAO = aVar.aO();
                if (nVarAO != null && nVarAO.b() > 0) {
                    millis = TimeUnit.SECONDS.toMillis(nVarAO.b());
                } else if (this.E > 0) {
                    millis = this.E;
                }
                if (aVar.af() && (iT = (int) aVar.t()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iT);
                }
                double d = millis;
                double dAe = this.I.ae();
                Double.isNaN(dAe);
                Double.isNaN(d);
                jAd = (long) (d * (dAe / 100.0d));
            }
            b(jAd);
        }
    }
}
