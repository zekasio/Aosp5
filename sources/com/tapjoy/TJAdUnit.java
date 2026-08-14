package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.n7;
import com.tapjoy.internal.v5;
import com.tapjoy.internal.w1;
import com.tapjoy.internal.y5;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class TJAdUnit implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnInfoListener {
    public static TJVideoListener P;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public v5 H;
    public y5 I;
    public TJAdUnitWebViewListener b;
    public TJAdUnitVideoListener c;
    public TJAdUnitActivity d;
    public TJAdUnitJSBridge e;
    public TJJSBridgeDelegate f;
    public TJWebView g;
    public TJWebView h;
    public VideoView i;
    public MediaPlayer j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ScheduledFuture<?> o;
    public AudioManager p;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public volatile boolean y;
    public boolean z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f1627a = new Handler(Looper.getMainLooper());
    public int q = 0;
    public int A = -1;
    public int B = -1;
    public final Runnable J = new a();
    public final Runnable K = new c();
    public final Runnable L = new d();
    public final Runnable M = new e();
    public WebViewClient N = new g();
    public WebChromeClient O = new h();

    public interface TJAdUnitVideoListener {
        void onVideoCompleted();

        void onVideoError(String str);

        void onVideoStart();
    }

    public interface TJAdUnitWebViewListener {
        void onClick();

        void onClosed();

        void onContentReady();
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int streamVolume = TJAdUnit.this.p.getStreamVolume(3);
            TJAdUnit tJAdUnit = TJAdUnit.this;
            if (tJAdUnit.q != streamVolume) {
                tJAdUnit.q = streamVolume;
                tJAdUnit.e.onVolumeChanged();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1629a;
        public final /* synthetic */ TJPlacementData b;
        public final /* synthetic */ boolean c;

        public b(Context context, TJPlacementData tJPlacementData, boolean z) {
            this.f1629a = context;
            this.b = tJPlacementData;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TJAdUnit.this.a(this.f1629a)) {
                TapjoyLog.i("TJAdUnit", "Loading ad unit content");
                TJAdUnit.this.w = true;
                try {
                    if (TextUtils.isEmpty(this.b.getRedirectURL())) {
                        if (this.b.getBaseURL() == null || this.b.getHttpResponse() == null) {
                            TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                            TJAdUnit.this.w = false;
                        } else {
                            TJAdUnit.this.h.loadDataWithBaseURL(this.b.getBaseURL(), this.b.getHttpResponse(), "text/html", "utf-8", null);
                        }
                    } else if (this.b.isPreloadDisabled()) {
                        TJAdUnit.this.h.postUrl(this.b.getRedirectURL(), null);
                    } else {
                        TJAdUnit.this.h.loadUrl(this.b.getRedirectURL());
                    }
                } catch (Exception unused) {
                    TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error loading ad unit content"));
                    TJAdUnit.this.w = false;
                }
                TJAdUnit tJAdUnit = TJAdUnit.this;
                tJAdUnit.x = tJAdUnit.w && this.c;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TJAdUnit.this.i.getCurrentPosition() == 0) {
                TJAdUnit tJAdUnit = TJAdUnit.this;
                if (tJAdUnit.F) {
                    tJAdUnit.G = true;
                    return;
                } else {
                    tJAdUnit.f1627a.postDelayed(tJAdUnit.K, 200L);
                    return;
                }
            }
            TJAdUnit tJAdUnit2 = TJAdUnit.this;
            if (!tJAdUnit2.m) {
                tJAdUnit2.m = true;
            }
            TJAdUnit tJAdUnit3 = TJAdUnit.this;
            tJAdUnit3.e.onVideoStarted(tJAdUnit3.k);
            TJAdUnit.this.L.run();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            TJAdUnitJSBridge tJAdUnitJSBridge = tJAdUnit.e;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.onVideoProgress(tJAdUnit.i.getCurrentPosition());
            }
            TJAdUnit tJAdUnit2 = TJAdUnit.this;
            tJAdUnit2.f1627a.postDelayed(tJAdUnit2.L, 500L);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJAdUnit.this.e.onVideoError("MEDIA_ERROR_TIMED_OUT");
        }
    }

    public class f implements MediaPlayer.OnSeekCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1633a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public f(int i, int i2, int i3) {
            this.f1633a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            tJAdUnit.f1627a.removeCallbacks(tJAdUnit.M);
            TJAdUnit.this.e.onVideoReady(this.f1633a, this.b, this.c);
        }
    }

    public class g extends WebViewClient {
        public g() {
        }

        public boolean a(String str) {
            if (!TJAdUnit.this.c() || !URLUtil.isValidUrl(str)) {
                TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.showErrorDialog();
                }
                return true;
            }
            if (TJAdUnit.this.a(str)) {
                return false;
            }
            if (TJAdUnit.this.e.allowRedirect) {
                Uri uri = Uri.parse(str);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(DriveFile.MODE_READ_ONLY);
                if (TJAdUnit.this.h.getContext() != null) {
                    try {
                        TJAdUnit.this.h.getContext().startActivity(intent);
                        return true;
                    } catch (Exception e) {
                        StringBuilder sbA = w1.a("Exception in loading URL. ");
                        sbA.append(e.getMessage());
                        TapjoyLog.e("TJAdUnit", sbA.toString());
                    }
                }
            } else if (str.startsWith("javascript:")) {
                try {
                    TJAdUnit.this.h.evaluateJavascript(str.replaceFirst("javascript:", ""), null);
                    return true;
                } catch (Exception e2) {
                    StringBuilder sbA2 = w1.a("Exception in evaluateJavascript. Device not supported. ");
                    sbA2.append(e2.toString());
                    TapjoyLog.e("TJAdUnit", sbA2.toString());
                }
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            TJAdUnitJSBridge tJAdUnitJSBridge;
            TapjoyLog.d("TJAdUnit", "onPageFinished: " + str);
            TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.setProgressSpinnerVisibility(false);
            }
            TJAdUnit.this.z = true;
            TJAdUnit tJAdUnit = TJAdUnit.this;
            if (tJAdUnit.v && (tJAdUnitJSBridge = tJAdUnit.e) != null) {
                tJAdUnitJSBridge.display();
            }
            TJAdUnitJSBridge tJAdUnitJSBridge2 = TJAdUnit.this.e;
            if (tJAdUnitJSBridge2 != null) {
                tJAdUnitJSBridge2.flushMessageQueue();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            TapjoyLog.d("TJAdUnit", "onPageStarted: " + str);
            TJAdUnit tJAdUnit = TJAdUnit.this;
            TJAdUnitJSBridge tJAdUnitJSBridge = tJAdUnit.e;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.allowRedirect = true;
                tJAdUnitJSBridge.customClose = false;
                tJAdUnitJSBridge.closeRequested = false;
                tJAdUnit.a();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            TapjoyLog.d("TJAdUnit", "error:" + str);
            TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.showErrorDialog();
            }
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().a("loadFailure");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "WebView rendering process exited while instantiating a WebViewClient unexpectedly"));
            if (TJAdUnit.this.getSdkBeacon() != null) {
                TJAdUnit.this.getSdkBeacon().a("terminated");
            }
            TJAdUnit tJAdUnit = TJAdUnit.this;
            VideoView videoView = tJAdUnit.i;
            if (videoView != null && (tJAdUnit.m || videoView.getDuration() > 0)) {
                TJAdUnit.this.m = false;
                TJAdUnit.this.l = true;
                TJAdUnit.this.fireOnVideoError("WebView loading while trying to play video.");
            }
            TJWebView tJWebView = TJAdUnit.this.g;
            if (tJWebView != null) {
                ViewGroup viewGroup = (ViewGroup) tJWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(TJAdUnit.this.g);
                }
                TJAdUnit.this.g.removeAllViews();
                TJAdUnit.this.g.destroy();
                TJAdUnit.this.g = null;
            }
            TJWebView tJWebView2 = TJAdUnit.this.h;
            if (tJWebView2 != null) {
                ViewGroup viewGroup2 = (ViewGroup) tJWebView2.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(TJAdUnit.this.h);
                }
                TJAdUnit.this.h.removeAllViews();
                TJAdUnit.this.h.destroy();
                TJAdUnit.this.h = null;
            }
            TJAdUnitJSBridge tJAdUnitJSBridge = TJAdUnit.this.e;
            if (tJAdUnitJSBridge != null) {
                tJAdUnitJSBridge.cleanUpJSBridge();
                TJAdUnit.this.e = null;
            }
            TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            TapjoyCachedAssetData cachedDataForURL;
            WebResourceResponse webResourceResponse;
            if (TapjoyCache.getInstance() != null && (cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(str)) != null) {
                try {
                    webResourceResponse = new WebResourceResponse(cachedDataForURL.getMimeType(), "UTF-8", new FileInputStream(cachedDataForURL.getLocalFilePath()));
                } catch (Exception unused) {
                    webResourceResponse = null;
                }
                if (webResourceResponse != null) {
                    TapjoyLog.d("TJAdUnit", "Reading request for " + str + " from cache -- localPath: " + cachedDataForURL.getLocalFilePath());
                    return webResourceResponse;
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl().toString());
        }
    }

    public class h extends WebChromeClient {
        public h() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            TJAdUnitJSBridge tJAdUnitJSBridge = tJAdUnit.e;
            if (tJAdUnitJSBridge == null || !tJAdUnitJSBridge.closeRequested) {
                return true;
            }
            String[] strArr = {"Uncaught", "uncaught", "Error", "error", "not defined"};
            if (tJAdUnit.d == null) {
                return true;
            }
            for (int i = 0; i < 5; i++) {
                if (consoleMessage.message().contains(strArr[i])) {
                    TJAdUnit.this.d.e();
                    return true;
                }
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            TapjoyLog.d("TJAdUnit", str2);
            return false;
        }
    }

    public class i extends TJJSBridgeDelegate {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f1637a;
            public final /* synthetic */ TJTaskHandler b;

            public a(String str, TJTaskHandler tJTaskHandler) {
                this.f1637a = str;
                this.b = tJTaskHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    TapjoyLog.d("TJAdUnit", "setBackgroundColor: " + this.f1637a);
                    TJAdUnit.this.g.setBackgroundColor(Color.parseColor(this.f1637a));
                    this.b.onComplete(true);
                } catch (Exception unused) {
                    StringBuilder sbA = w1.a("Error setting background color. backgroundWebView: ");
                    sbA.append(TJAdUnit.this.g);
                    sbA.append(", hexColor: ");
                    sbA.append(this.f1637a);
                    TapjoyLog.d("TJAdUnit", sbA.toString());
                    this.b.onComplete(false);
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f1638a;
            public final /* synthetic */ TJTaskHandler b;

            public b(String str, TJTaskHandler tJTaskHandler) {
                this.f1638a = str;
                this.b = tJTaskHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    TapjoyLog.d("TJAdUnit", "setBackgroundContent: " + this.f1638a);
                    TJAdUnit.this.g.loadDataWithBaseURL(null, this.f1638a, "text/html", "utf-8", null);
                    this.b.onComplete(true);
                } catch (Exception unused) {
                    StringBuilder sbA = w1.a("Error setting background content. backgroundWebView: ");
                    sbA.append(TJAdUnit.this.g);
                    sbA.append(", content: ");
                    sbA.append(this.f1638a);
                    TapjoyLog.d("TJAdUnit", sbA.toString());
                    this.b.onComplete(false);
                }
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f1639a;
            public final /* synthetic */ TJTaskHandler b;

            public c(String str, TJTaskHandler tJTaskHandler) {
                this.f1639a = str;
                this.b = tJTaskHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TJAdUnit.this.i == null) {
                    this.b.onComplete(false);
                    return;
                }
                StringBuilder sbA = w1.a("loadVideoUrl: ");
                sbA.append(this.f1639a);
                TapjoyLog.i("TJAdUnit", sbA.toString());
                TJAdUnit.this.i.setVideoPath(this.f1639a);
                TJAdUnit.this.i.setVisibility(0);
                TJAdUnit.this.i.seekTo(0);
                this.b.onComplete(true);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1640a;
            public final /* synthetic */ TJTaskHandler b;

            public d(boolean z, TJTaskHandler tJTaskHandler) {
                this.f1640a = z;
                this.b = tJTaskHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJAdUnit.this.i.setVisibility(this.f1640a ? 0 : 4);
                TJAdUnit.this.i.stopPlayback();
                TJAdUnit.this.m = false;
                TJAdUnit.this.l = false;
                TJAdUnit.this.k = 0;
                this.b.onComplete(true);
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f1641a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;

            public e(float f, float f2, float f3, float f4) {
                this.f1641a = f;
                this.b = f2;
                this.c = f3;
                this.d = f4;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJAdUnit.this.d.a(this.f1641a, this.b, this.c, this.d);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1642a;

            public f(boolean z) {
                this.f1642a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.setCloseButtonVisibility(this.f1642a);
                } else {
                    TapjoyLog.d("TJAdUnit", "Cannot setCloseButtonVisible -- TJAdUnitActivity is null");
                }
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1643a;

            public g(boolean z) {
                this.f1643a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
                if (tJAdUnitActivity != null) {
                    tJAdUnitActivity.setCloseButtonClickable(this.f1643a);
                } else {
                    TapjoyLog.d("TJAdUnit", "Cannot setCloseButtonClickable -- TJAdUnitActivity is null");
                }
            }
        }

        public /* synthetic */ i(a aVar) {
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void attachVolumeListener(boolean z, int i) {
            TJAdUnit tJAdUnit;
            TJAdUnitActivity tJAdUnitActivity;
            TapjoyLog.d("TJAdUnit", "attachVolumeListener: isAttached=" + z + "; interval=" + i);
            TJAdUnit.this.a();
            if (z && (tJAdUnitActivity = (tJAdUnit = TJAdUnit.this).d) != null) {
                tJAdUnit.p = (AudioManager) tJAdUnitActivity.getSystemService("audio");
                TJAdUnit tJAdUnit2 = TJAdUnit.this;
                tJAdUnit2.q = tJAdUnit2.p.getStreamVolume(3);
                TJAdUnit tJAdUnit3 = TJAdUnit.this;
                tJAdUnit3.r = tJAdUnit3.p.getStreamMaxVolume(3);
                TJAdUnit tJAdUnit4 = TJAdUnit.this;
                long j = i;
                tJAdUnit4.o = n7.f1865a.scheduleWithFixedDelay(tJAdUnit4.J, j, j, TimeUnit.MILLISECONDS);
            }
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void clearVideo(TJTaskHandler<Boolean> tJTaskHandler, boolean z) {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            if (tJAdUnit.i == null) {
                tJTaskHandler.onComplete(false);
            } else {
                tJAdUnit.d();
                TapjoyUtil.runOnMainThread(new d(z, tJTaskHandler));
            }
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean dismiss() {
            TJAdUnit.this.d.finish();
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean fireContentReady() {
            TJAdUnit.this.fireContentReady();
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void fireOnClick() {
            TJAdUnit.this.fireOnClick();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void fireOnVideoComplete() {
            TJAdUnit.this.fireOnVideoComplete();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void fireOnVideoError(String str) {
            TJAdUnit.this.fireOnVideoError(str);
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void fireOnVideoStart() {
            TJAdUnit.this.fireOnVideoStart();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public String getBeaconId() {
            return TJAdUnit.this.getTjBeacon().f1949a;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Context getContext() {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            TJAdUnitActivity tJAdUnitActivity = tJAdUnit.d;
            if (tJAdUnitActivity != null) {
                return tJAdUnitActivity;
            }
            TJWebView tJWebView = tJAdUnit.h;
            if (tJWebView != null) {
                return tJWebView.getContext();
            }
            return null;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Map<String, Object> getOrientation() {
            String screenOrientationString = TJAdUnit.this.getScreenOrientationString();
            HashMap map = new HashMap();
            map.put(TJAdUnitConstants.String.ORIENTATION, screenOrientationString);
            map.put(TJAdUnitConstants.String.WIDTH, Integer.valueOf(TJAdUnit.this.getScreenWidth()));
            map.put(TJAdUnitConstants.String.HEIGHT, Integer.valueOf(TJAdUnit.this.getScreenHeight()));
            map.put(TJAdUnitConstants.String.ROTATION, Integer.valueOf(TJAdUnit.this.E));
            return map;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public VideoView getVideoView() {
            return TJAdUnit.this.i;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public Map<String, Object> getVolumeArgs() {
            String str = String.format(Locale.ENGLISH, "%.2f", Float.valueOf(TJAdUnit.this.getVolume()));
            boolean zIsMuted = TJAdUnit.this.isMuted();
            TapjoyLog.d("TJAdUnit", "getVolumeArgs: volume=" + str + "; isMuted=" + zIsMuted);
            HashMap map = new HashMap();
            map.put(TJAdUnitConstants.String.CURRENT_VOLUME, str);
            map.put(TJAdUnitConstants.String.IS_MUTED, Boolean.valueOf(zIsMuted));
            return map;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public WebView getWebView() {
            return TJAdUnit.this.h;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean isMuted() {
            return TJAdUnit.this.isMuted();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void loadVideoUrl(String str, TJTaskHandler<Boolean> tJTaskHandler) {
            TapjoyUtil.runOnMainThread(new c(str, tJTaskHandler));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void muteVideo(boolean z) {
            TJAdUnit.this.a(z);
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean pauseVideo() {
            TJAdUnit.this.d();
            VideoView videoView = TJAdUnit.this.i;
            if (videoView == null || !videoView.isPlaying()) {
                return false;
            }
            if (y5.e) {
                TJAdUnit.this.getTjBeacon().a("pause", (Map<String, String>) null);
            }
            TJAdUnit.this.i.pause();
            TJAdUnit tJAdUnit = TJAdUnit.this;
            tJAdUnit.k = tJAdUnit.i.getCurrentPosition();
            TapjoyLog.i("TJAdUnit", "Video paused at: " + TJAdUnit.this.k);
            TJAdUnit tJAdUnit2 = TJAdUnit.this;
            tJAdUnit2.e.onVideoPaused(tJAdUnit2.k);
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean playVideo() {
            TapjoyLog.i("TJAdUnit", "playVideo");
            VideoView videoView = TJAdUnit.this.i;
            if (videoView == null) {
                return false;
            }
            if (y5.e && !videoView.isPlaying() && TJAdUnit.this.i.getCurrentPosition() != 0) {
                TJAdUnit.this.getTjBeacon().a("resume", (Map<String, String>) null);
            }
            TJAdUnit.this.i.start();
            TJAdUnit.this.n = false;
            TJAdUnit tJAdUnit = TJAdUnit.this;
            tJAdUnit.f1627a.postDelayed(tJAdUnit.K, 200L);
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setBackgroundColor(String str, TJTaskHandler<Boolean> tJTaskHandler) {
            TapjoyUtil.runOnMainThread(new a(str, tJTaskHandler));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setBackgroundContent(String str, TJTaskHandler<Boolean> tJTaskHandler) {
            TapjoyUtil.runOnMainThread(new b(str, tJTaskHandler));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setCloseButtonClickable(boolean z) {
            TapjoyUtil.runOnMainThread(new g(z));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setCloseButtonVisible(boolean z) {
            TapjoyUtil.runOnMainThread(new f(z));
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean setOrientation(int i) {
            TJAdUnit.this.setOrientation(i);
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean setVideoMargins(float f2, float f3, float f4, float f5) {
            if (TJAdUnit.this.d == null) {
                return false;
            }
            TapjoyUtil.runOnMainThread(new e(f2, f3, f4, f5));
            return true;
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void setupSdkBeacons(v5 v5Var) {
            TJAdUnit tJAdUnit = TJAdUnit.this;
            tJAdUnit.H = v5Var;
            v5 v5Var2 = tJAdUnit.H;
            if (v5Var2 == null || !tJAdUnit.v) {
                return;
            }
            v5Var2.a();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public void shouldClose(boolean z) {
            TJAdUnitActivity tJAdUnitActivity;
            if (!z || (tJAdUnitActivity = TJAdUnit.this.d) == null) {
                return;
            }
            tJAdUnitActivity.finish();
        }

        @Override // com.tapjoy.TJJSBridgeDelegate
        public boolean unsetOrientation() {
            TJAdUnitActivity tJAdUnitActivity = TJAdUnit.this.d;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.setRequestedOrientation(-1);
            }
            TJAdUnit tJAdUnit = TJAdUnit.this;
            tJAdUnit.A = -1;
            tJAdUnit.u = false;
            return true;
        }
    }

    public final boolean a(int i2) {
        return i2 == 0 || i2 == 8 || i2 == 6 || i2 == 11;
    }

    public final boolean b(int i2) {
        return i2 == 1 || i2 == 9 || i2 == 7 || i2 == 12;
    }

    public void closeRequested(boolean z) {
        this.e.closeRequested(Boolean.valueOf(z));
    }

    public void destroy() {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.e;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.destroy();
        }
        d();
        TJWebView tJWebView = this.g;
        if (tJWebView != null) {
            tJWebView.destroy();
            this.g = null;
        }
        TJWebView tJWebView2 = this.h;
        if (tJWebView2 != null) {
            tJWebView2.destroy();
            this.h = null;
        }
        this.F = false;
        this.y = false;
        this.v = false;
        setAdUnitActivity(null);
        a();
        this.j = null;
        this.i = null;
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.b;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClosed();
        }
        resetContentLoadState();
    }

    public void fireContentReady() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.b;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onContentReady();
        }
    }

    public void fireOnClick() {
        TJAdUnitWebViewListener tJAdUnitWebViewListener = this.b;
        if (tJAdUnitWebViewListener != null) {
            tJAdUnitWebViewListener.onClick();
        }
    }

    public void fireOnVideoComplete() {
        TapjoyLog.v("TJAdUnit", "Firing onVideoComplete");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoComplete();
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.c;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoCompleted();
        }
    }

    public void fireOnVideoError(String str) {
        TapjoyLog.e("TJAdUnit", "Firing onVideoError with error: " + str);
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoError(3);
        }
        TJAdUnitVideoListener tJAdUnitVideoListener = this.c;
        if (tJAdUnitVideoListener != null) {
            tJAdUnitVideoListener.onVideoError(str);
        }
    }

    public void fireOnVideoStart() {
        TapjoyLog.v("TJAdUnit", "Firing onVideoStart");
        if (getPublisherVideoListener() != null) {
            getPublisherVideoListener().onVideoStart();
        }
        if (this.c != null) {
            this.I.a(TJAdUnitConstants.String.VIDEO_START, (Map<String, String>) null);
            this.c.onVideoStart();
        }
    }

    public TJWebView getBackgroundWebView() {
        return this.g;
    }

    public boolean getCloseRequested() {
        return this.e.closeRequested;
    }

    public int getLockedOrientation() {
        return this.A;
    }

    public TJVideoListener getPublisherVideoListener() {
        return P;
    }

    public int getScreenHeight() {
        return this.D;
    }

    public String getScreenOrientationString() {
        return a(b()) ? TJAdUnitConstants.String.LANDSCAPE : TJAdUnitConstants.String.PORTRAIT;
    }

    public int getScreenWidth() {
        return this.C;
    }

    public v5 getSdkBeacon() {
        return this.H;
    }

    public int getTargetOrientation() {
        return this.B;
    }

    public y5 getTjBeacon() {
        return this.I;
    }

    public int getVideoSeekTime() {
        return this.k;
    }

    public VideoView getVideoView() {
        return this.i;
    }

    public float getVolume() {
        return this.q / this.r;
    }

    public TJWebView getWebView() {
        return this.h;
    }

    public boolean hasCalledLoad() {
        return this.w;
    }

    public void invokeBridgeCallback(String str, Object... objArr) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.e;
        if (tJAdUnitJSBridge == null || str == null) {
            return;
        }
        tJAdUnitJSBridge.invokeJSCallback(str, objArr);
    }

    public boolean isLockedOrientation() {
        return this.u;
    }

    public boolean isMuted() {
        return this.t;
    }

    public boolean isPrerendered() {
        return this.x;
    }

    public boolean isVideoComplete() {
        return this.n;
    }

    public void load(TJPlacementData tJPlacementData, boolean z, Context context) {
        this.w = false;
        TapjoyUtil.runOnMainThread(new b(context, tJPlacementData, z));
    }

    public void notifyOrientationChanged() {
        if (this.e != null) {
            this.e.notifyOrientationChanged(getScreenOrientationString(), this.C, this.D);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        TJAdUnitJSBridge tJAdUnitJSBridge;
        TapjoyLog.i("TJAdUnit", "video -- onCompletion");
        d();
        this.n = true;
        if (!this.l && (tJAdUnitJSBridge = this.e) != null) {
            tJAdUnitJSBridge.onVideoCompletion();
        }
        this.l = false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str;
        TapjoyLog.e("TJAdUnit", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating the VideoView: " + i2 + " - " + i3));
        this.l = true;
        d();
        String strConcat = (i2 != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED").concat(" -- ");
        if (i3 == -1010) {
            str = strConcat + "MEDIA_ERROR_UNSUPPORTED";
        } else if (i3 == -1007) {
            str = strConcat + "MEDIA_ERROR_MALFORMED";
        } else if (i3 == -1004) {
            str = strConcat + "MEDIA_ERROR_IO";
        } else if (i3 != -110) {
            str = strConcat + "MEDIA_ERROR_EXTRA_UNKNOWN";
        } else {
            str = strConcat + "MEDIA_ERROR_TIMED_OUT";
        }
        this.e.onVideoError(str);
        return i2 == 1 || i3 == -1004;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str;
        if (i2 == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i2 != 801) {
            switch (i2) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        this.e.onVideoInfo(str);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        TapjoyLog.i("TJAdUnit", "video -- onPrepared");
        int duration = this.i.getDuration();
        int measuredWidth = this.i.getMeasuredWidth();
        int measuredHeight = this.i.getMeasuredHeight();
        this.j = mediaPlayer;
        boolean z = this.s;
        if (z) {
            a(z);
        }
        if (this.k > 0 && this.i.getCurrentPosition() != this.k) {
            this.j.setOnSeekCompleteListener(new f(duration, measuredWidth, measuredHeight));
        } else if (this.e != null) {
            this.f1627a.removeCallbacks(this.M);
            this.e.onVideoReady(duration, measuredWidth, measuredHeight);
        }
        this.j.setOnInfoListener(this);
    }

    public void pause() {
        this.F = true;
        TJAdUnitJSBridge tJAdUnitJSBridge = this.e;
        if (tJAdUnitJSBridge != null) {
            tJAdUnitJSBridge.setEnabled(false);
        }
        this.f.pauseVideo();
    }

    public boolean preload(TJPlacementData tJPlacementData, Context context) {
        if (this.w || !tJPlacementData.isPrerenderingRequested() || !TJPlacementManager.canPreRenderPlacement() || TapjoyConnectCore.isViewOpen()) {
            fireContentReady();
            return false;
        }
        StringBuilder sbA = w1.a("Pre-rendering ad unit for placement: ");
        sbA.append(tJPlacementData.getPlacementName());
        TapjoyLog.i("TJAdUnit", sbA.toString());
        TJPlacementManager.incrementPlacementPreRenderCount();
        load(tJPlacementData, true, context);
        return true;
    }

    public void resetContentLoadState() {
        this.w = false;
        this.z = false;
        this.x = false;
        this.A = -1;
        this.B = -1;
        this.u = false;
        this.s = false;
    }

    public void resume(TJAdUnitSaveStateData tJAdUnitSaveStateData) {
        TJAdUnitJSBridge tJAdUnitJSBridge = this.e;
        if (tJAdUnitJSBridge == null) {
            TJAdUnitActivity tJAdUnitActivity = this.d;
            if (tJAdUnitActivity != null) {
                tJAdUnitActivity.finish();
                TapjoyLog.w("TJAdUnit", "Failed to resume TJAdUnit. TJAdUnitBridge is null.");
                return;
            }
            return;
        }
        if (tJAdUnitJSBridge.didLaunchOtherActivity) {
            StringBuilder sbA = w1.a("onResume bridge.didLaunchOtherActivity callbackID: ");
            sbA.append(this.e.otherActivityCallbackID);
            TapjoyLog.d("TJAdUnit", sbA.toString());
            TJAdUnitJSBridge tJAdUnitJSBridge2 = this.e;
            tJAdUnitJSBridge2.invokeJSCallback(tJAdUnitJSBridge2.otherActivityCallbackID, Boolean.TRUE);
            this.e.didLaunchOtherActivity = false;
        }
        this.F = false;
        this.e.setEnabled(true);
        if (tJAdUnitSaveStateData != null) {
            int i2 = tJAdUnitSaveStateData.seekTime;
            this.k = i2;
            this.i.seekTo(i2);
            if (this.j != null) {
                this.s = tJAdUnitSaveStateData.isVideoMuted;
            }
        }
        if (this.G) {
            this.G = false;
            this.f1627a.postDelayed(this.K, 200L);
        }
    }

    public void setAdUnitActivity(TJAdUnitActivity tJAdUnitActivity) {
        this.d = tJAdUnitActivity;
    }

    public boolean setOrientation(int i2) {
        this.B = i2;
        TJAdUnitActivity tJAdUnitActivity = this.d;
        if (tJAdUnitActivity != null) {
            int iB = b();
            int i3 = this.A;
            if (i3 != -1) {
                iB = i3;
            }
            if ((a(iB) && a(i2)) || (b(iB) && b(i2))) {
                i2 = iB;
            }
            tJAdUnitActivity.setRequestedOrientation(i2);
            this.A = i2;
            this.u = true;
        }
        return true;
    }

    public void setSdkBeacon() {
        this.I = new y5();
    }

    public void setVideoListener(TJAdUnitVideoListener tJAdUnitVideoListener) {
        this.c = tJAdUnitVideoListener;
    }

    public void setVisible(boolean z) {
        TJAdUnitJSBridge tJAdUnitJSBridge;
        this.e.notifyOrientationChanged(getScreenOrientationString(), this.C, this.D);
        this.v = z;
        if (z && this.z && (tJAdUnitJSBridge = this.e) != null) {
            tJAdUnitJSBridge.display();
        }
    }

    public void setWebViewListener(TJAdUnitWebViewListener tJAdUnitWebViewListener) {
        this.b = tJAdUnitWebViewListener;
    }

    public final boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            if (this.h.getContext() == null || (activeNetworkInfo = ((ConnectivityManager) this.h.getContext().getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e2) {
            StringBuilder sbA = w1.a("Exception getting NetworkInfo: ");
            sbA.append(e2.getLocalizedMessage());
            TapjoyLog.d("TJAdUnit", sbA.toString());
        }
        return false;
    }

    public void d() {
        this.f1627a.removeCallbacks(this.K);
        this.f1627a.removeCallbacks(this.L);
        this.f1627a.removeCallbacks(this.M);
    }

    public void e() {
        this.f1627a.postDelayed(this.M, 5000L);
    }

    public boolean a(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() && !this.y && context != null) {
            TapjoyLog.d("TJAdUnit", "Constructing ad unit");
            this.y = true;
            try {
                TJWebView tJWebView = new TJWebView(context);
                this.g = tJWebView;
                tJWebView.loadDataWithBaseURL(null, "<!DOCTYPE html><html><head><title>Tapjoy Background Webview</title></head></html>", "text/html", "utf-8", null);
                TJWebView tJWebView2 = new TJWebView(context);
                this.h = tJWebView2;
                tJWebView2.setWebViewClient(this.N);
                this.h.setWebChromeClient(this.O);
                VideoView videoView = new VideoView(context);
                this.i = videoView;
                videoView.setOnCompletionListener(this);
                this.i.setOnErrorListener(this);
                this.i.setOnPreparedListener(this);
                this.i.setVisibility(4);
                i iVar = new i(null);
                this.f = iVar;
                this.e = new TJAdUnitJSBridge(iVar);
                if (context instanceof TJAdUnitActivity) {
                    setAdUnitActivity((TJAdUnitActivity) context);
                }
            } catch (Exception e2) {
                TapjoyLog.w("TJAdUnit", e2.getMessage());
                return false;
            }
        }
        return this.y;
    }

    public final int b() {
        Activity activityA = this.d;
        if (activityA == null && (activityA = com.tapjoy.internal.b.e.a()) == null) {
            activityA = com.tapjoy.internal.b.a();
        }
        if (activityA == null) {
            return -1;
        }
        int rotation = activityA.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activityA.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.C = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.D = i2;
        if (((rotation == 0 || rotation == 2) && i2 > this.C) || ((rotation == 1 || rotation == 3) && this.C > i2)) {
            if (rotation == 1) {
                this.E = 270;
                return 0;
            }
            if (rotation == 2) {
                this.E = 180;
                return 9;
            }
            if (rotation != 3) {
                this.E = 0;
                return 1;
            }
            this.E = 90;
            return 8;
        }
        if (rotation == 0) {
            this.E = 270;
        } else {
            if (rotation == 1) {
                this.E = 0;
                return 1;
            }
            if (rotation == 2) {
                this.E = 90;
                return 8;
            }
            if (rotation != 3) {
                TapjoyLog.w("TJAdUnit", "Unknown screen orientation. Defaulting to landscape.");
                this.E = 0;
            } else {
                this.E = 180;
                return 9;
            }
        }
        return 0;
    }

    public final void a() {
        TapjoyLog.d("TJAdUnit", "detachVolumeListener");
        ScheduledFuture<?> scheduledFuture = this.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.o = null;
        }
        this.p = null;
    }

    public void a(boolean z) {
        MediaPlayer mediaPlayer = this.j;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
            if (this.t != z) {
                this.t = z;
                this.e.onVolumeChanged();
                return;
            }
            return;
        }
        this.s = z;
    }

    public final boolean a(String str) {
        try {
            String host = new URL(TapjoyConnectCore.getHostURL()).getHost();
            return (host != null && str.contains(host)) || str.contains(TapjoyConnectCore.getRedirectDomain()) || str.contains(TapjoyUtil.getRedirectDomain(TapjoyConnectCore.getPlacementURL()));
        } catch (MalformedURLException unused) {
            return false;
        }
    }
}
