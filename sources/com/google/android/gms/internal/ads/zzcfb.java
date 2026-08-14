package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzfkr;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import cz.msebera.android.httpclient.client.config.CookieSpecs;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
final class zzcfb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcei {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbdk zzC;
    private zzbdi zzD;
    private zzaus zzE;
    private int zzF;
    private int zzG;
    private zzbbg zzH;
    private final zzbbg zzI;
    private zzbbg zzJ;
    private final zzbbh zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzci zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzawe zzV;
    private final zzcfw zzb;
    private final zzapw zzc;
    private final zzbbt zzd;
    private final zzbzg zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzeyc zzj;
    private zzeyf zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcep zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcfx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcfe zzz;

    protected zzcfb(zzcfw zzcfwVar, zzcfx zzcfxVar, String str, boolean z, boolean z2, zzapw zzapwVar, zzbbt zzbbtVar, zzbzg zzbzgVar, zzbbj zzbbjVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzawe zzaweVar, zzeyc zzeycVar, zzeyf zzeyfVar) {
        zzeyf zzeyfVar2;
        super(zzcfwVar);
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcfwVar;
        this.zzq = zzcfxVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzapwVar;
        this.zzd = zzbbtVar;
        this.zze = zzbzgVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = displayMetricsZzq;
        this.zzi = displayMetricsZzq.density;
        this.zzV = zzaweVar;
        this.zzj = zzeycVar;
        this.zzk = zzeyfVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzci(zzcfwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzbza.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjK)).booleanValue()) {
                settings.setMixedContentMode(1);
            } else {
                settings.setMixedContentMode(2);
            }
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcfwVar, zzbzgVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfkr zzfkrVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcfi(this, new zzcfh(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbbh zzbbhVar = new zzbbh(new zzbbj(true, "make_wv", this.zzr));
        this.zzK = zzbbhVar;
        zzbbhVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() && (zzeyfVar2 = this.zzk) != null && zzeyfVar2.zzb != null) {
            zzbbhVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbbhVar.zza();
        zzbbg zzbbgVarZzf = zzbbj.zzf();
        this.zzI = zzbbgVarZzf;
        zzbbhVar.zzb("native:view_create", zzbbgVarZzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcfwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzeyc zzeycVar = this.zzj;
        if (zzeycVar != null && zzeycVar.zzan) {
            zzbza.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzbza.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzbza.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzbza.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbbb.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzccu) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbbh zzbbhVar = this.zzK;
        if (zzbbhVar == null) {
            return;
        }
        zzbbj zzbbjVarZza = zzbbhVar.zza();
        zzbaz zzbazVarZzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzbazVarZzf != null) {
            zzbazVarZzf.zzf(zzbbjVarZza);
        }
    }

    private final synchronized void zzbb() {
        Boolean boolZzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = boolZzk;
        if (boolZzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjg)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzbza.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
            zzbza.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null && zzcepVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcep zzcepVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcepVar = this.zzn) != null && zzcepVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzbza.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL == null || !zZzaR) {
            return;
        }
        zzlVarZzL.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzbza.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzbza.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzapw zzapwVar = this.zzc;
            if (zzapwVar != null) {
                zzapwVar.zzd(motionEvent);
            }
            zzbbt zzbbtVar = this.zzd;
            if (zzbbtVar != null) {
                zzbbtVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbdk zzbdkVar = this.zzC;
                if (zzbdkVar != null) {
                    zzbdkVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcei
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcep) {
            this.zzn = (zzcep) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzbza.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzC(zzcfe zzcfeVar) {
        if (this.zzz != null) {
            zzbza.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcfeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcdz
    public final zzeyc zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfq
    public final zzapw zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized zzaus zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized zzbdk zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final /* synthetic */ zzcfv zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfp
    public final synchronized zzcfx zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcff
    public final zzeyf zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized IObjectWrapper zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final zzfut zzR() {
        zzbbt zzbbtVar = this.zzd;
        return zzbbtVar == null ? zzfuj.zzh(null) : zzbbtVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzT(zzeyc zzeycVar, zzeyf zzeyfVar) {
        this.zzj = zzeycVar;
        this.zzk = zzeyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfa(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzV() {
        zzaY();
        HashMap map = new HashMap(1);
        map.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzW(int i) {
        if (i == 0) {
            zzbbb.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzX() {
        if (this.zzH == null) {
            zzbbb.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbbg zzbbgVarZzf = zzbbj.zzf();
            this.zzH = zzbbgVarZzf;
            this.zzK.zzb("native:view_show", zzbbgVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put(ClientCookie.VERSION_ATTR, this.zze.zza);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaE(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar, String str, String str2, int i) {
        this.zzn.zzu(zzbrVar, zzeafVar, zzdpiVar, zzfdkVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaG(boolean z, int i, String str, boolean z2) {
        this.zzn.zzx(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zzaH(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzy(z, i, str, str2, z2);
    }

    public final zzcep zzaJ() {
        return this.zzn;
    }

    final synchronized Boolean zzaK() {
        return this.zzw;
    }

    protected final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaO(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaP("javascript:".concat(str));
            return;
        }
        if (zzaK() == null) {
            zzbb();
        }
        if (zzaK().booleanValue()) {
            zzaN(str, null);
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    protected final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i;
        int iZzw;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int iZzw2 = zzbyt.zzw(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int iZzw3 = zzbyt.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZza = this.zzb.zza();
        if (activityZza == null || activityZza.getWindow() == null) {
            i = iZzw2;
            iZzw = iZzw3;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] iArrZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activityZza);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int iZzw4 = zzbyt.zzw(this.zzh, iArrZzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            iZzw = zzbyt.zzw(this.zzh, iArrZzN[1]);
            i = iZzw4;
        }
        int i2 = this.zzQ;
        if (i2 == iZzw2 && this.zzP == iZzw3 && this.zzR == i && this.zzS == iZzw) {
            return false;
        }
        boolean z = (i2 == iZzw2 && this.zzP == iZzw3) ? false : true;
        this.zzQ = iZzw2;
        this.zzP = iZzw3;
        this.zzR = i;
        this.zzS = iZzw;
        new zzbqf(this, "").zzi(iZzw2, iZzw3, i, iZzw, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (zzaz()) {
            zzbza.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzN);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ClientCookie.VERSION_ATTR, str5);
            jSONObject.put(TapjoyConstants.TJC_SDK_PLACEMENT, "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            zzbza.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        super.loadDataWithBaseURL(str, zzcfo.zza(str2, str4), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbbg zzbbgVarZzf = zzbbj.zzf();
            this.zzJ = zzbbgVarZzf;
            this.zzK.zzb("native:view_load", zzbbgVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzad(String str, zzbhp zzbhpVar) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzz(str, zzbhpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzag(zzcfx zzcfxVar) {
        this.zzq = zzcfxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzah(zzaus zzausVar) {
        this.zzE = zzausVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzam(zzbdi zzbdiVar) {
        this.zzD = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzan(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzO)).booleanValue() || !this.zzq.zzi()) {
                new zzbqf(this, "").zzk(true != z ? CookieSpecs.DEFAULT : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzao(zzbdk zzbdkVar) {
        this.zzC = zzbdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzap(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzcei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzat(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            com.google.android.gms.ads.internal.overlay.zzl r0 = r1.zzo     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.zzz(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfb.zzat(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzau(String str, zzbhp zzbhpVar) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzH(str, zzbhpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final void zzav(String str, Predicate predicate) {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzcey
            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zza(zzaxt zzaxtVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcfb.zza;
                zzazy zzazyVarZza = zzazz.zza();
                if (zzazyVarZza.zzc() != z2) {
                    zzazyVarZza.zza(z2);
                }
                zzazyVarZza.zzb(i2);
                zzaxtVar.zzj((zzazz) zzazyVarZza.zzal());
            }
        });
        this.zzV.zzc(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcei
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzbl() {
        zzeyf zzeyfVar = this.zzk;
        if (zzeyfVar == null) {
            return null;
        }
        return zzeyfVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        synchronized (this) {
            this.zzA = zzateVar.zzj;
        }
        zzaV(zzateVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        zzbza.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaO(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcbj
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzbbg zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final zzbbh zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcfr, com.google.android.gms.internal.ads.zzcbj
    public final zzbzg zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzcay zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized zzccu zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzccu) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized zzcfe zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzcep zzcepVar = this.zzn;
        if (zzcepVar != null) {
            zzcepVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcei, com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzt(String str, zzccu zzccuVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzccuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzv(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zzw() {
        zzbdi zzbdiVar = this.zzD;
        if (zzbdiVar != null) {
            final zzdkg zzdkgVar = (zzdkg) zzbdiVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdkgVar.zzd();
                    } catch (RemoteException e) {
                        zzbza.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
