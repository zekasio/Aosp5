package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
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
import com.applovin.exoplayer2.ui.g;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.j;
import com.applovin.impl.c.a;
import com.applovin.impl.c.f;
import com.applovin.impl.c.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.c.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.material.badge.BadgeDrawable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final j countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private final aw mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final com.applovin.impl.c.a vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<k> videoProgressTrackers;
    private final g videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, Context context) {
        int iDpToPx;
        super(appLovinNativeAdImpl, pVar, context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new j(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                    return;
                }
                AppLovinVastMediaView.this.maybeHandleResume();
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                    AppLovinVastMediaView.this.maybeHandlePause();
                }
            }
        };
        com.applovin.impl.c.a vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zF = vastAd.f();
        this.isVideoStream = zF;
        if (zF) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.aS()) {
            this.industryIconImageView = com.applovin.impl.c.g.a(vastAd.aR().a(), context, pVar);
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eR)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eT)).intValue()));
            this.industryIconImageView.setOnClickListener(new a());
            addView(this.industryIconImageView);
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eY)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) pVar.a(com.applovin.impl.sdk.c.b.eX)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            d dVar = new d();
            this.playPauseButtonImageView.setOnClickListener(dVar);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eV)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eU)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(dVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                iDpToPx = 0;
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.eW)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx + i, Math.max(iDpToPx3, iDpToPx) + i, BadgeDrawable.BOTTOM_START));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eZ)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new d());
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) pVar.a(com.applovin.impl.sdk.c.b.fa)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        aw awVarA = new aw.a(getContext()).a();
        this.mediaPlayer = awVarA;
        c cVar = new c();
        awVarA.a((an.b) cVar);
        awVarA.c(0);
        g gVar = new g(getContext());
        this.videoView = gVar;
        gVar.b();
        gVar.setControllerVisibilityListener(cVar);
        gVar.setPlayer(awVarA);
        gVar.setOnTouchListener(new AppLovinTouchToClickListener(pVar, com.applovin.impl.sdk.c.b.ba, getContext(), new b(appLovinNativeAdImpl)));
        addView(gVar);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(gVar);
        hashSet.addAll(vastAd.a(a.c.VIDEO, l.f914a));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnClickListener(null);
        this.viewActivity = null;
        this.mediaPlayer.E();
        this.vastAd.o().e();
        this.countdownManager.b();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.fz)).booleanValue() && j == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.videoWasCompleted || this.mediaPlayer.a()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    private void prepareMediaPlayer() {
        checkCachedAdResources(!this.isVideoStream);
        u uVarA = new u.a(new com.applovin.exoplayer2.k.p(getContext(), ai.a(getContext(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(ab.a(this.vastAd.h()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((com.applovin.exoplayer2.h.p) uVarA);
        this.mediaPlayer.w();
        this.mediaPlayer.a(false);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.aS()) {
                maybeFireTrackers(a.c.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(a.c.IMPRESSION);
            maybeFireTrackers(a.c.VIDEO, "creativeView");
            this.vastAd.o().d();
            this.vastAd.setHasShown(true);
            this.sdk.E().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.sdk.utils.b.a(Utils.getRootView(this));
            this.sdk.w().a(this.lifecycleCallbacksAdapter);
            this.mediaPlayer.a(true);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.2
                @Override // com.applovin.impl.adview.j.a
                public void a() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.H() - AppLovinVastMediaView.this.mediaPlayer.I()));
                    int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
                    HashSet hashSet = new HashSet();
                    for (k kVar : new HashSet(AppLovinVastMediaView.this.videoProgressTrackers)) {
                        if (kVar.a(seconds, videoPercentViewed)) {
                            hashSet.add(kVar);
                            AppLovinVastMediaView.this.videoProgressTrackers.remove(kVar);
                        }
                    }
                    AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
                    if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                        AppLovinVastMediaView.this.vastAd.o().f();
                        return;
                    }
                    if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                        AppLovinVastMediaView.this.vastAd.o().g();
                    } else if (videoPercentViewed >= 75) {
                        AppLovinVastMediaView.this.vastAd.o().h();
                    }
                }

                @Override // com.applovin.impl.adview.j.a
                public boolean b() {
                    return !AppLovinVastMediaView.this.videoWasCompleted;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(a.c.VIDEO, "pause");
            this.vastAd.o().j();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(a.c.VIDEO, "resume");
            this.vastAd.o().k();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                y yVar = this.logger;
                if (y.a()) {
                    this.logger.b(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.mediaPlayer.a(true);
                this.countdownManager.a();
                this.lastVideoPositionFromPauseMillis = -1L;
            } else {
                y yVar2 = this.logger;
                if (y.a()) {
                    this.logger.b(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.a());
                }
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(a.c.VIDEO, "close");
        maybeHandlePause();
        this.sdk.w().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.o().i();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.E().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    private void pauseVideo() {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.I();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        y yVar2 = this.logger;
        if (y.a()) {
            this.logger.b(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    private void checkCachedAdResources(boolean z) {
        List<Uri> listCheckCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.vastAd, this.sdk, getContext());
        if (listCheckCachedResourcesExist.isEmpty()) {
            return;
        }
        y yVar = this.logger;
        if (y.a()) {
            this.logger.e(TAG, "Video failed due to missing resources: " + listCheckCachedResourcesExist);
        }
        finishVideo();
        showMediaImageView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        y yVar = this.logger;
        if (y.a()) {
            this.logger.e(TAG, str);
        }
        maybeFireTrackers(a.c.ERROR, f.MEDIA_FILE_ERROR);
        this.vastAd.o().a(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.Q() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        y yVar = this.logger;
        if (y.a()) {
            this.logger.d(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long jI = this.mediaPlayer.I();
        if (this.videoWasCompleted) {
            return 100;
        }
        if (jI > 0) {
            return (int) ((jI / this.videoDurationMillis) * 100.0f);
        }
        return this.savedVideoPercentViewed;
    }

    private void populatePlayPauseImage(boolean z) {
        if (this.playPauseButtonImageView == null) {
            return;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        Uri uriAC = z ? aVar.aC() : aVar.aD();
        if (uriAC != null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.playPauseButtonImageView.setImageURI(uriAC);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return;
        }
        this.playPauseButtonImageView.setImageResource(z ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        com.applovin.impl.c.a aVar = this.vastAd;
        Uri uriAE = z ? aVar.aE() : aVar.aF();
        if (uriAE != null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            this.muteButtonImageView.setImageURI(uriAE);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return true;
        }
        if (!h.d()) {
            return false;
        }
        AnimatedVectorDrawable animatedVectorDrawableM = Trace$$ExternalSyntheticApiModelOutline0.m((Object) getContext().getDrawable(z ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute));
        if (animatedVectorDrawableM == null) {
            return false;
        }
        this.muteButtonImageView.setImageDrawable(animatedVectorDrawableM);
        animatedVectorDrawableM.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<k> set) {
        maybeFireTrackers(set, f.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(a.c cVar) {
        maybeFireTrackers(cVar, f.UNSPECIFIED);
    }

    private void maybeFireTrackers(a.c cVar, String str) {
        maybeFireTrackers(cVar, str, f.UNSPECIFIED);
    }

    private void maybeFireTrackers(a.c cVar, f fVar) {
        maybeFireTrackers(cVar, "", fVar);
    }

    private void maybeFireTrackers(a.c cVar, String str, f fVar) {
        maybeFireTrackers(this.vastAd.a(cVar, str), fVar);
    }

    private void maybeFireTrackers(Set<k> set, f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.I());
        o oVarAP = this.vastAd.aP();
        Uri uriA = oVarAP != null ? oVarAP.a() : null;
        y yVar = this.logger;
        if (y.a()) {
            this.logger.b(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        m.a(set, seconds, uriA, fVar, this.sdk);
    }

    private class c implements an.b, f.d {
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

        private c() {
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i) {
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Player state changed to state " + i + " and will play when ready: " + AppLovinVastMediaView.this.mediaPlayer.x());
            }
            if (i != 3) {
                if (i == 4) {
                    y yVar2 = AppLovinVastMediaView.this.logger;
                    if (y.a()) {
                        AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Video completed");
                    }
                    AppLovinVastMediaView.this.videoWasCompleted = true;
                    AppLovinVastMediaView.this.finishVideo();
                    if (AppLovinVastMediaView.this.replayIconContainer != null) {
                        r.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.c.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AppLovinVastMediaView.this.mediaPlayer.a(0L);
                            }
                        });
                        return;
                    } else {
                        AppLovinVastMediaView.this.showMediaImageView();
                        return;
                    }
                }
                return;
            }
            AppLovinVastMediaView.this.mediaPlayer.a(!AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.H();
            AppLovinVastMediaView.this.vastAd.o().a(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), Utils.isVideoMutedInitially(AppLovinVastMediaView.this.sdk));
            y yVar3 = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            AppLovinVastMediaView.this.countdownManager.a();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + akVar + ")");
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i) {
            if (i == 0) {
                AppLovinVastMediaView.this.videoView.b();
            }
        }
    }

    private class b implements AppLovinTouchToClickListener.OnClickListener {
        private final AppLovinNativeAdImpl b;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.b = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            Uri uriK;
            AppLovinVastMediaView.this.maybeFireTrackers(a.c.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.o().o();
            if (AppLovinVastMediaView.this.vastAd.E() && (uriK = AppLovinVastMediaView.this.vastAd.k()) != null) {
                y yVar = AppLovinVastMediaView.this.logger;
                if (y.a()) {
                    AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.E().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.a(pointF, false));
                this.b.handleNativeAdClick(uriK, null, AppLovinVastMediaView.this.getContext());
            }
        }
    }

    private class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriB;
            com.applovin.impl.c.g gVarAR = AppLovinVastMediaView.this.vastAd.aR();
            if (gVarAR == null || (uriB = gVarAR.b()) == null) {
                return;
            }
            y yVar = AppLovinVastMediaView.this.logger;
            if (y.a()) {
                AppLovinVastMediaView.this.logger.b(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriB);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(a.c.INDUSTRY_ICON_CLICK);
            Utils.openUri(view.getContext(), uriB, AppLovinVastMediaView.this.sdk);
        }
    }

    private class d implements View.OnClickListener {
        private d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.a()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view == AppLovinVastMediaView.this.muteButtonImageView) {
                boolean z = AppLovinVastMediaView.this.isVideoMuted;
                boolean z2 = !z;
                AppLovinVastMediaView.this.isVideoMuted = z2;
                AppLovinVastMediaView.this.mediaPlayer.a(z ? 1.0f : 0.0f);
                AppLovinVastMediaView.this.populateMuteImage(z2);
                return;
            }
            if (view == AppLovinVastMediaView.this.replayIconContainer) {
                r.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AppLovinVastMediaView.this.videoWasCompleted = false;
                        AppLovinVastMediaView.this.automaticResumeHandled.set(false);
                        AppLovinVastMediaView.this.sdk.w().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
                        AppLovinVastMediaView.this.maybeHandleResume();
                    }
                });
            }
        }
    }
}
