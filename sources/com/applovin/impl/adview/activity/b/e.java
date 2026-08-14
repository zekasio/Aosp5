package com.applovin.impl.adview.activity.b;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.f;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.loopj.android.http.AsyncHttpClient;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected v A;
    protected final ProgressBar B;
    protected final j C;
    protected boolean D;
    protected long E;
    protected int F;
    protected boolean G;
    protected boolean H;
    private final com.applovin.impl.adview.activity.a.c I;
    private final a J;
    private final Handler K;
    private final boolean L;
    private long M;
    private final AtomicBoolean N;
    private final AtomicBoolean O;
    private long P;
    private long Q;
    protected final com.applovin.exoplayer2.ui.g v;
    protected final aw w;
    protected final com.applovin.impl.adview.a x;
    protected final m y;
    protected final ImageView z;

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.I = new com.applovin.impl.adview.activity.a.c(this.f738a, this.e, this.b);
        a aVar = new a();
        this.J = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.K = handler;
        j jVar = new j(handler, this.b);
        this.C = jVar;
        boolean zF = this.f738a.f();
        this.L = zF;
        this.D = Utils.isVideoMutedInitially(this.b);
        this.M = -1L;
        this.N = new AtomicBoolean();
        this.O = new AtomicBoolean();
        this.P = -2L;
        this.Q = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        c cVar = new c();
        if (eVar.r() >= 0) {
            m mVar = new m(eVar.x(), activity);
            this.y = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(cVar);
        } else {
            this.y = null;
        }
        if (a(this.D, pVar)) {
            ImageView imageView = new ImageView(activity);
            this.z = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            d(this.D);
        } else {
            this.z = null;
        }
        String strC = eVar.C();
        if (StringUtils.isValidString(strC)) {
            w wVar = new w(pVar);
            wVar.a(new WeakReference<>(aVar));
            v vVar = new v(wVar, activity);
            this.A = vVar;
            vVar.a(strC);
        } else {
            this.A = null;
        }
        if (zF) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue(), R.attr.progressBarStyleLarge);
            this.x = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.x = null;
        }
        if (eVar.O()) {
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            this.B = progressBar;
            progressBar.setMax(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            progressBar.setPadding(0, 0, 0, 0);
            if (h.d()) {
                progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
            }
            jVar.a("PROGRESS_BAR", ((Long) pVar.a(com.applovin.impl.sdk.c.b.cN)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                @Override // com.applovin.impl.adview.j.a
                public void a() {
                    if (e.this.G) {
                        e.this.B.setVisibility(8);
                    } else {
                        e.this.B.setProgress((int) ((e.this.w.I() / e.this.E) * 10000.0f));
                    }
                }

                @Override // com.applovin.impl.adview.j.a
                public boolean b() {
                    return !e.this.G;
                }
            });
        } else {
            this.B = null;
        }
        aw awVarA = new aw.a(activity).a();
        this.w = awVarA;
        b bVar = new b();
        awVarA.a((an.b) bVar);
        awVarA.c(0);
        com.applovin.exoplayer2.ui.g gVar = new com.applovin.exoplayer2.ui.g(activity);
        this.v = gVar;
        gVar.b();
        gVar.setControllerVisibilityListener(bVar);
        gVar.setPlayer(awVarA);
        gVar.setOnTouchListener(new AppLovinTouchToClickListener(pVar, com.applovin.impl.sdk.c.b.aZ, activity, bVar));
        B();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.I.a(this.z, this.y, this.A, this.x, this.B, this.v, this.f, this.g, null, viewGroup);
        if (this.g != null) {
            this.g.a();
        }
        this.w.a(true);
        if (this.f738a.am()) {
            this.t.a(this.f738a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(250L);
                }
            });
        }
        if (this.L) {
            x();
        }
        this.f.renderAd(this.f738a);
        this.d.b(this.L ? 1L : 0L);
        if (this.y != null) {
            this.b.M().a(new z(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.C();
                }
            }), o.a.MAIN, this.f738a.s(), true);
        }
        super.b(this.D);
    }

    protected void c(long j) {
        this.E = j;
    }

    protected void B() {
        a(!this.L);
        u uVarA = new u.a(new com.applovin.exoplayer2.k.p(this.e, ai.a((Context) this.e, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(ab.a(this.f738a.h()));
        this.w.a(!this.D ? 1 : 0);
        this.w.a((com.applovin.exoplayer2.h.p) uVarA);
        this.w.w();
        this.w.a(false);
    }

    protected void C() {
        if (this.O.compareAndSet(false, true)) {
            a(this.y, this.f738a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // java.lang.Runnable
                public void run() {
                    e.this.P = -1L;
                    e.this.Q = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z) {
        super.c(z);
        if (z) {
            a(0L);
        } else {
            if (this.G) {
                return;
            }
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.C.b();
        this.K.removeCallbacksAndMessages(null);
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void k() {
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.fR)).booleanValue()) {
            s.a(this.A);
            this.A = null;
        }
        this.w.E();
        if (this.L) {
            AppLovinCommunicator.getInstance(this.e).unsubscribe(this, "video_caching_failed");
        }
        super.k();
    }

    protected void a(PointF pointF, boolean z) {
        Context contextY;
        if (this.f738a.E()) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriK = this.f738a.k();
            if (uriK != null) {
                if (this.f != null) {
                    contextY = this.f.getContext();
                } else {
                    p pVar = this.b;
                    contextY = p.y();
                }
                this.b.E().trackAndLaunchVideoClick(this.f738a, uriK, pointF, z, this, contextY);
                k.a(this.q, this.f738a);
                this.d.b();
                this.n++;
                return;
            }
            return;
        }
        G();
    }

    private void G() {
        v vVar;
        t tVarD = this.f738a.D();
        if (tVarD == null || !tVarD.e() || this.G || (vVar = this.A) == null) {
            return;
        }
        final boolean z = vVar.getVisibility() == 4;
        final long jF = tVarD.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    r.a(e.this.A, jF, (Runnable) null);
                } else {
                    r.b(e.this.A, jF, null);
                }
            }
        });
    }

    public void c() {
        this.P = SystemClock.elapsedRealtime() - this.Q;
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.P + "ms");
        }
        this.d.f();
        this.m++;
        if (this.f738a.y()) {
            h();
        } else {
            A();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.w.a()) {
            this.M = this.w.I();
            this.w.a(false);
            this.C.c();
            y yVar2 = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Paused video at position " + this.M + "ms");
                return;
            }
            return;
        }
        y yVar3 = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Nothing to pause");
        }
    }

    protected void D() {
        this.F = F();
        this.w.a(false);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                e.this.E();
            }
        }, j);
    }

    protected void E() {
        if (this.G) {
            y yVar = this.c;
            if (y.a()) {
                this.c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.b.Y().isApplicationPaused()) {
            y yVar2 = this.c;
            if (y.a()) {
                this.c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j = this.M;
        if (j >= 0) {
            y yVar3 = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.w);
            }
            this.w.a(true);
            this.C.a();
            this.M = -1L;
            if (this.w.a()) {
                return;
            }
            x();
            return;
        }
        y yVar4 = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.w.a());
        }
    }

    protected void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.x != null) {
                    e.this.x.a();
                }
            }
        });
    }

    protected void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.x != null) {
                    e.this.x.b();
                }
            }
        });
    }

    protected void c(String str) {
        y yVar = this.c;
        if (y.a()) {
            this.c.e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f738a);
        }
        if (this.N.compareAndSet(false, true)) {
            if (this.r instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) this.r).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        return this.f738a != null && F() >= this.f738a.Q();
    }

    protected int F() {
        aw awVar = this.w;
        if (awVar == null) {
            return 0;
        }
        long jI = awVar.I();
        if (this.H) {
            return 100;
        }
        if (jI > 0) {
            return (int) ((jI / this.E) * 100.0f);
        }
        return this.F;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return t() && !r();
    }

    public void A() {
        D();
        this.I.a(this.h, this.g, this.f);
        a("javascript:al_onPoststitialShow(" + this.m + "," + this.n + ");", this.f738a.S());
        if (this.h != null) {
            if (this.f738a.t() >= 0) {
                a(this.h, this.f738a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.h.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.h != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.h, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        if (this.g != null && this.g.b()) {
            arrayList.add(new com.applovin.impl.sdk.a.d(this.g, FriendlyObstructionPurpose.NOT_VISIBLE, this.g.getIdentifier()));
        }
        this.f738a.o().a(this.f, arrayList);
        v();
        this.G = true;
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

    protected void d(boolean z) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawableM = Trace$$ExternalSyntheticApiModelOutline0.m((Object) this.e.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute));
            if (animatedVectorDrawableM != null) {
                this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                this.z.setImageDrawable(animatedVectorDrawableM);
                animatedVectorDrawableM.start();
                return;
            }
        }
        Uri uriAE = z ? this.f738a.aE() : this.f738a.aF();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.z.setImageURI(uriAE);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    protected void z() {
        boolean z = this.D;
        this.D = !z;
        this.w.a(z ? 1.0f : 0.0f);
        d(this.D);
        a(this.D, 0L);
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
        c();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        super.a(F(), this.L, r(), this.P);
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
                long j = this.E;
                long j2 = j > 0 ? j : 0L;
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
                    j2 += millis;
                }
                double d = j2;
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
        this.I.a(this.A);
        this.I.a((View) this.y);
        if (!t() || this.G) {
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.I.a(this.i);
        this.k = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.fz)).booleanValue() && j == this.f738a.getAdIdNumber() && this.L) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.H || this.w.a()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    private class b implements an.b, f.d, AppLovinTouchToClickListener.OnClickListener {
        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ab abVar, int i) {
            an.b.CC.$default$a(this, abVar, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ac acVar) {
            an.b.CC.$default$a(this, acVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(am amVar) {
            an.b.CC.$default$a(this, amVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.a aVar) {
            an.b.CC.$default$a(this, aVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.b.CC.$default$a(this, eVar, eVar2, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.b.CC.$default$a(this, anVar, cVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ba baVar, int i) {
            an.b.CC.$default$a(this, baVar, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
            an.b.CC.$default$a(this, adVar, hVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(ak akVar) {
            an.b.CC.$default$b(this, akVar);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b(boolean z, int i) {
            an.b.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void b_(boolean z) {
            an.b.CC.$default$b_(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(int i) {
            an.b.CC.$default$c(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(int i) {
            an.b.CC.$default$d(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void d(boolean z) {
            an.b.CC.$default$d(this, z);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e(this, i);
        }

        @Override // com.applovin.exoplayer2.an.b
        public /* synthetic */ void e(boolean z) {
            an.b.CC.$default$e(this, z);
        }

        private b() {
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i) {
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + e.this.w.x());
            }
            if (i == 2) {
                e.this.x();
                e.this.d.g();
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    y yVar2 = e.this.c;
                    if (y.a()) {
                        e.this.c.b("AppLovinFullscreenActivity", "Video completed");
                    }
                    e.this.H = true;
                    if (!e.this.l) {
                        e.this.A();
                        return;
                    } else {
                        if (e.this.t()) {
                            e.this.H();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            e.this.w.a(!e.this.D ? 1 : 0);
            e eVar = e.this;
            eVar.c(eVar.w.H());
            e.this.u();
            y yVar3 = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + e.this.w);
            }
            e.this.C.a();
            if (e.this.y != null) {
                e.this.C();
            }
            e.this.y();
            if (e.this.t.c()) {
                e.this.e();
            }
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            e.this.c("Video view error (" + akVar + ")");
            e.this.h();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF, false);
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i) {
            if (i == 0) {
                e.this.v.b();
            }
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == e.this.y) {
                if (e.this.s()) {
                    e.this.e();
                    e.this.p();
                    e.this.t.b();
                    return;
                }
                e.this.c();
                return;
            }
            if (view == e.this.z) {
                e.this.z();
                return;
            }
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    private class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            e.this.a(vVar.getAndClearLastClickLocation(), false);
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            e.this.h();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            e.this.c();
        }

        @Override // com.applovin.impl.adview.w.a
        public void d(v vVar) {
            y yVar = e.this.c;
            if (y.a()) {
                e.this.c.b("AppLovinFullscreenActivity", "Attempting to install app from video button...");
            }
            e.this.a(vVar.getAndClearLastClickLocation(), true);
        }
    }
}
