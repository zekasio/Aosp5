package com.applovin.impl.adview.activity.b;

import android.R;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.tracing.Trace$$ExternalSyntheticApiModelOutline0;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
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
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.loopj.android.http.AsyncHttpClient;
import com.vungle.warren.AdLoader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    protected final ProgressBar A;
    protected ImageView B;
    protected final j C;
    protected boolean D;
    protected long E;
    protected boolean F;
    private final com.applovin.impl.adview.activity.a.c G;
    private MediaPlayer H;
    private final b I;
    private final a J;
    private final Handler K;
    private final boolean L;
    private int M;
    private int N;
    private boolean O;
    private final AtomicBoolean P;
    private final AtomicBoolean Q;
    private long R;
    private long S;
    protected final AppLovinVideoView v;
    protected final com.applovin.impl.adview.a w;
    protected final m x;
    protected final ImageView y;
    protected v z;

    public f(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.G = new com.applovin.impl.adview.activity.a.c(this.f738a, this.e, this.b);
        this.B = null;
        b bVar = new b();
        this.I = bVar;
        a aVar = new a();
        this.J = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.K = handler;
        j jVar = new j(handler, this.b);
        this.C = jVar;
        boolean zF = this.f738a.f();
        this.L = zF;
        this.D = Utils.isVideoMutedInitially(this.b);
        this.N = -1;
        this.P = new AtomicBoolean();
        this.Q = new AtomicBoolean();
        this.R = -2L;
        this.S = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.v = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(bVar);
        appLovinVideoView.setOnCompletionListener(bVar);
        appLovinVideoView.setOnErrorListener(bVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(pVar, com.applovin.impl.sdk.c.b.aZ, activity, bVar));
        c cVar = new c();
        if (eVar.r() >= 0) {
            m mVar = new m(eVar.x(), activity);
            this.x = mVar;
            mVar.setVisibility(8);
            mVar.setOnClickListener(cVar);
        } else {
            this.x = null;
        }
        if (a(this.D, pVar)) {
            ImageView imageView = new ImageView(activity);
            this.y = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            e(this.D);
        } else {
            this.y = null;
        }
        String strC = eVar.C();
        if (StringUtils.isValidString(strC)) {
            w wVar = new w(pVar);
            wVar.a(new WeakReference<>(aVar));
            v vVar = new v(wVar, activity);
            this.z = vVar;
            vVar.a(strC);
        } else {
            this.z = null;
        }
        if (zF) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cQ)).intValue(), R.attr.progressBarStyleLarge);
            this.w = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.w = null;
        }
        if (eVar.O()) {
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            this.A = progressBar;
            progressBar.setMax(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
            progressBar.setPadding(0, 0, 0, 0);
            if (h.d()) {
                progressBar.setProgressTintList(ColorStateList.valueOf(eVar.P()));
            }
            jVar.a("PROGRESS_BAR", ((Long) pVar.a(com.applovin.impl.sdk.c.b.cN)).longValue(), new j.a() { // from class: com.applovin.impl.adview.activity.b.f.1
                @Override // com.applovin.impl.adview.j.a
                public void a() {
                    if (f.this.F) {
                        f.this.A.setVisibility(8);
                    } else {
                        f.this.A.setProgress((int) ((f.this.v.getCurrentPosition() / f.this.E) * 10000.0f));
                    }
                }

                @Override // com.applovin.impl.adview.j.a
                public boolean b() {
                    return !f.this.F;
                }
            });
            return;
        }
        this.A = null;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        String str;
        this.G.a(this.y, this.x, this.z, this.w, this.A, this.v, this.f, this.g, this.B, viewGroup);
        if (h.g() && (str = this.b.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.AUDIO_FOCUS_REQUEST)) != null) {
            this.v.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.L);
        this.v.setVideoURI(this.f738a.h());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (this.f738a.am()) {
            this.t.a(this.f738a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(250L);
                }
            });
        }
        if (this.g != null) {
            this.g.a();
        }
        this.v.start();
        if (this.L) {
            x();
        }
        this.f.renderAd(this.f738a);
        this.d.b(this.L ? 1L : 0L);
        if (this.x != null) {
            this.b.M().a(new z(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                @Override // java.lang.Runnable
                public void run() {
                    f.this.C();
                }
            }), o.a.MAIN, this.f738a.s(), true);
        }
        super.b(this.D);
    }

    protected void c(long j) {
        this.E = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.Q.compareAndSet(false, true)) {
            a(this.x, this.f738a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.5
                @Override // java.lang.Runnable
                public void run() {
                    f.this.R = -1L;
                    f.this.S = SystemClock.elapsedRealtime();
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
            if (this.F) {
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
        y yVar = this.c;
        if (y.a()) {
            this.c.c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.fR)).booleanValue()) {
                s.a(this.z);
                this.z = null;
            }
            if (this.L) {
                AppLovinCommunicator.getInstance(this.e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.v;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.v.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.H;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.k();
    }

    protected void a(PointF pointF, boolean z) {
        if (this.f738a.E()) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriK = this.f738a.k();
            if (uriK != null) {
                this.b.E().trackAndLaunchVideoClick(this.f738a, uriK, pointF, z, this, this.f != null ? this.f.getContext() : p.y());
                k.a(this.q, this.f738a);
                this.d.b();
                this.n++;
                return;
            }
            return;
        }
        D();
    }

    private void D() {
        v vVar;
        t tVarD = this.f738a.D();
        if (tVarD == null || !tVarD.e() || this.F || (vVar = this.z) == null) {
            return;
        }
        final boolean z = vVar.getVisibility() == 4;
        final long jF = tVarD.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    r.a(f.this.z, jF, (Runnable) null);
                } else {
                    r.b(f.this.z, jF, null);
                }
            }
        });
    }

    public void c() {
        this.R = SystemClock.elapsedRealtime() - this.S;
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.R + "ms");
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
        this.N = this.v.getCurrentPosition();
        this.v.pause();
        this.C.c();
        y yVar2 = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Paused video at position " + this.N + "ms");
        }
    }

    private void d(boolean z) {
        this.M = B();
        if (z) {
            this.v.pause();
        } else {
            this.v.stopPlayback();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
            @Override // java.lang.Runnable
            public void run() {
                f.this.E();
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.F) {
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
        if (this.N >= 0) {
            y yVar3 = this.c;
            if (y.a()) {
                this.c.b("AppLovinFullscreenActivity", "Resuming video at position " + this.N + "ms for MediaPlayer: " + this.H);
            }
            this.v.seekTo(this.N);
            this.v.start();
            this.C.a();
            this.N = -1;
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    if (f.this.w != null) {
                        f.this.w.a();
                        f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                f.this.w.b();
                            }
                        }, AdLoader.RETRY_DELAY);
                    }
                }
            }, 250L);
            return;
        }
        y yVar4 = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Invalid last video position");
        }
    }

    protected void x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.w != null) {
                    f.this.w.a();
                }
            }
        });
    }

    protected void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.w != null) {
                    f.this.w.b();
                }
            }
        });
    }

    protected void c(String str) {
        y yVar = this.c;
        if (y.a()) {
            this.c.e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f738a);
        }
        if (this.P.compareAndSet(false, true)) {
            if (this.r instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) this.r).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        return B() >= this.f738a.Q();
    }

    protected int B() {
        long currentPosition = this.v.getCurrentPosition();
        if (this.O) {
            return 100;
        }
        if (currentPosition > 0) {
            return (int) ((currentPosition / this.E) * 100.0f);
        }
        return this.M;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return t() && !r();
    }

    public void A() {
        y yVar = this.c;
        if (y.a()) {
            this.c.b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        d(this.f738a.aL());
        this.G.a(this.h, this.g, this.f);
        a("javascript:al_onPoststitialShow(" + this.m + "," + this.n + ");", this.f738a.S());
        if (this.h != null) {
            if (this.f738a.t() >= 0) {
                a(this.h, this.f738a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.k = SystemClock.elapsedRealtime();
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
        this.F = true;
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

    private void e(boolean z) {
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawableM = Trace$$ExternalSyntheticApiModelOutline0.m((Object) this.e.getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute));
            if (animatedVectorDrawableM != null) {
                this.y.setScaleType(ImageView.ScaleType.FIT_XY);
                this.y.setImageDrawable(animatedVectorDrawableM);
                animatedVectorDrawableM.start();
                return;
            }
        }
        Uri uriAE = z ? this.f738a.aE() : this.f738a.aF();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.y.setImageURI(uriAE);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    protected void z() {
        MediaPlayer mediaPlayer = this.H;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f = this.D ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            boolean z = !this.D;
            this.D = z;
            e(z);
            a(this.D, 0L);
        } catch (Throwable unused) {
        }
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
        super.a(B(), this.L, r(), this.R);
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
        this.G.a(this.z);
        this.G.a((View) this.x);
        if (!t() || this.F) {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.G.a(this.i);
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
                if ((string == null && i >= 200 && i < 300) || this.O || this.v.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    private class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.H = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.I);
            mediaPlayer.setOnErrorListener(f.this.I);
            float f = !f.this.D ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            f.this.c(mediaPlayer.getDuration());
            f.this.u();
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + f.this.H);
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                f.this.x();
                f.this.d.g();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                f.this.y();
                return false;
            }
            f.this.C.a();
            if (f.this.x != null) {
                f.this.C();
            }
            f.this.y();
            if (!f.this.t.c()) {
                return false;
            }
            f.this.e();
            return false;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            f.this.c("Video view error (" + i + "," + i2 + ")");
            f.this.v.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "Video completed");
            }
            f.this.O = true;
            if (!f.this.l) {
                f.this.A();
            } else if (f.this.t()) {
                f.this.F();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF, false);
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == f.this.x) {
                if (f.this.s()) {
                    f.this.e();
                    f.this.p();
                    f.this.t.b();
                    return;
                }
                f.this.c();
                return;
            }
            if (view == f.this.y) {
                f.this.z();
                return;
            }
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    private class a implements w.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.w.a
        public void a(v vVar) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            f.this.a(vVar.getAndClearLastClickLocation(), false);
        }

        @Override // com.applovin.impl.adview.w.a
        public void b(v vVar) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            f.this.h();
        }

        @Override // com.applovin.impl.adview.w.a
        public void c(v vVar) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            f.this.c();
        }

        @Override // com.applovin.impl.adview.w.a
        public void d(v vVar) {
            y yVar = f.this.c;
            if (y.a()) {
                f.this.c.b("AppLovinFullscreenActivity", "Attempting to install app from video button...");
            }
            f.this.a(vVar.getAndClearLastClickLocation(), true);
        }
    }
}
