package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
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
public class d extends f {
    private final com.applovin.impl.c.a G;
    private final Set<k> H;

    public d(com.applovin.impl.sdk.ad.e eVar, final Activity activity, Map<String, Object> map, final p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.H = hashSet;
        com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) eVar;
        this.G = aVar;
        if (aVar.aS()) {
            this.B = com.applovin.impl.c.g.a(aVar.aR().a(), activity, pVar);
            this.B.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.d.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Uri uriB = d.this.G.aR().b();
                    if (uriB != null) {
                        y yVar = d.this.c;
                        if (y.a()) {
                            d.this.c.b("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriB);
                        }
                        d.this.a(a.c.INDUSTRY_ICON_CLICK);
                        Utils.openUri(activity, uriB, pVar);
                    }
                }
            });
        }
        hashSet.addAll(aVar.a(a.c.VIDEO, l.f914a));
        a(a.c.IMPRESSION);
        a(a.c.VIDEO, "creativeView");
        aVar.o().d();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(this.F ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.G.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.F ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.G.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.G != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (D()) {
            a(a.c.INDUSTRY_ICON_IMPRESSION);
            this.B.setVisibility(0);
        }
        this.C.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.d.2
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(d.this.E - ((long) (d.this.v.getDuration() - d.this.v.getCurrentPosition())));
                int iB = d.this.B();
                HashSet hashSet = new HashSet();
                for (k kVar : new HashSet(d.this.H)) {
                    if (kVar.a(seconds, iB)) {
                        hashSet.add(kVar);
                        d.this.H.remove(kVar);
                    }
                }
                d.this.a(hashSet);
                if (iB >= 25 && iB < 50) {
                    d.this.G.o().f();
                    return;
                }
                if (iB >= 50 && iB < 75) {
                    d.this.G.o().g();
                } else if (iB >= 75) {
                    d.this.G.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !d.this.F;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.w != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.w, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.x != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.x, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.A != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.A, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.y != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.y, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.z != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.z, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        if (this.g != null && this.g.b()) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.g, FriendlyObstructionPurpose.NOT_VISIBLE, this.g.getIdentifier()));
        }
        this.G.o().a(this.v, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void c(long j) {
        super.c(j);
        this.G.o().a(TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.b));
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void a(PointF pointF, boolean z) {
        a(a.c.VIDEO_CLICK);
        this.G.o().o();
        super.a(pointF, z);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void e() {
        this.C.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c() {
        a(a.c.VIDEO, "skip");
        this.G.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void x() {
        super.x();
        com.applovin.impl.c.a aVar = this.G;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void y() {
        super.y();
        com.applovin.impl.c.a aVar = this.G;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.G.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void z() {
        super.z();
        a(a.c.VIDEO, this.D ? AnalyticsEvent.Ad.mute : AnalyticsEvent.Ad.unmute);
        this.G.o().a(this.D);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void A() {
        C();
        if (m.c(this.G)) {
            if (this.F) {
                return;
            }
            a(a.c.COMPANION, "creativeView");
            this.G.o().i();
            super.A();
            return;
        }
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        h();
    }

    private void C() {
        if (!r() || this.H.isEmpty()) {
            return;
        }
        y yVar = this.c;
        if (y.a()) {
            this.c.d("AppLovinFullscreenActivity", "Firing " + this.H.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a.c cVar) {
        a(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.c.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str, com.applovin.impl.c.f fVar) {
        a(this.G.a(cVar, str), fVar);
    }

    private void a(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.v.getCurrentPosition());
        o oVarAP = this.G.aP();
        Uri uriA = oVarAP != null ? oVarAP.a() : null;
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, uriA, fVar, this.b);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    protected void u() {
        long jAd;
        int iT;
        long millis = 0;
        if (this.G.ad() >= 0 || this.G.ae() >= 0) {
            if (this.G.ad() >= 0) {
                jAd = this.G.ad();
            } else {
                com.applovin.impl.c.a aVar = this.G;
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
                double dAe = this.G.ae();
                Double.isNaN(dAe);
                Double.isNaN(d);
                jAd = (long) (d * (dAe / 100.0d));
            }
            b(jAd);
        }
    }

    private boolean D() {
        return this.B != null && this.G.aS();
    }
}
