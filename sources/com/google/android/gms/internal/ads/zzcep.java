package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.ads.AdSize;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import cz.msebera.android.httpclient.HttpHost;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class zzcep extends WebViewClient implements zzcfv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzbwb zza;
    private final zzcei zzc;
    private final zzawe zzd;
    private final HashMap zze;
    private final Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcft zzi;
    private zzcfu zzj;
    private zzbgi zzk;
    private zzbgk zzl;
    private zzdcc zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzz zzs;
    private zzbqe zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbpz zzv;
    private zzfff zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcep(zzcei zzceiVar, zzawe zzaweVar, boolean z) {
        zzbqe zzbqeVar = new zzbqe(zzceiVar, zzceiVar.zzE(), new zzbab(zzceiVar.getContext()));
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzd = zzaweVar;
        this.zzc = zzceiVar;
        this.zzp = z;
        this.zzt = zzbqeVar;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfh)).split(",")));
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        return com.google.android.gms.ads.internal.util.zzs.zzM(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzO(java.lang.String r11, java.util.Map r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcep.zzO(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbhp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbwb zzbwbVar, final int i) {
        if (!zzbwbVar.zzi() || i <= 0) {
            return;
        }
        zzbwbVar.zzg(view);
        if (zzbwbVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(view, zzbwbVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzS(boolean z, zzcei zzceiVar) {
        return (!z || zzceiVar.zzO().zzi() || zzceiVar.zzS().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzx = true;
            zzcfu zzcfuVar = this.zzj;
            if (zzcfuVar != null) {
                zzcfuVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 87:
            case 88:
            case 89:
            case AdSize.LARGE_AD_HEIGHT /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbwb zzbwbVar = this.zza;
                        if (zzbwbVar != null) {
                            zzbwbVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdcc zzdccVar = this.zzm;
                    if (zzdccVar != null) {
                        zzdccVar.zzr();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzbza.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzapw zzapwVarZzI = this.zzc.zzI();
                    if (zzapwVarZzI != null && zzapwVarZzI.zzf(uriZza)) {
                        Context context = this.zzc.getContext();
                        zzcei zzceiVar = this.zzc;
                        uriZza = zzapwVarZzI.zza(uriZza, context, (View) zzceiVar, zzceiVar.zzi());
                    }
                } catch (zzapx unused) {
                    zzbza.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzu.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzA(zzcft zzcftVar) {
        this.zzi = zzcftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzB(int i, int i2) {
        zzbpz zzbpzVar = this.zzv;
        if (zzbpzVar != null) {
            zzbpzVar.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzG(zzcfu zzcfuVar) {
        this.zzj = zzcfuVar;
    }

    public final void zzH(String str, zzbhp zzbhpVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbhpVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbhp> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbhp zzbhpVar : list) {
                if (predicate.apply(zzbhpVar)) {
                    arrayList.add(zzbhpVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbgi zzbgiVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbgk zzbgkVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbhr zzbhrVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbqg zzbqgVar, zzbwb zzbwbVar, final zzeaf zzeafVar, final zzfff zzfffVar, zzdpi zzdpiVar, zzfdk zzfdkVar, zzbih zzbihVar, final zzdcc zzdccVar, zzbig zzbigVar, zzbia zzbiaVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbwbVar, null) : zzbVar;
        this.zzv = new zzbpz(this.zzc, zzbqgVar);
        this.zza = zzbwbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaL)).booleanValue()) {
            zzz("/adMetadata", new zzbgh(zzbgiVar));
        }
        if (zzbgkVar != null) {
            zzz("/appEvent", new zzbgj(zzbgkVar));
        }
        zzz("/backButton", zzbho.zzj);
        zzz("/refresh", zzbho.zzk);
        zzz("/canOpenApp", zzbho.zzb);
        zzz("/canOpenURLs", zzbho.zza);
        zzz("/canOpenIntents", zzbho.zzc);
        zzz("/close", zzbho.zzd);
        zzz("/customClose", zzbho.zze);
        zzz("/instrument", zzbho.zzn);
        zzz("/delayPageLoaded", zzbho.zzp);
        zzz("/delayPageClosed", zzbho.zzq);
        zzz("/getLocationInfo", zzbho.zzr);
        zzz("/log", zzbho.zzg);
        zzz("/mraid", new zzbhv(zzbVar2, this.zzv, zzbqgVar));
        zzbqe zzbqeVar = this.zzt;
        if (zzbqeVar != null) {
            zzz("/mraidLoaded", zzbqeVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbhz(zzbVar2, this.zzv, zzeafVar, zzdpiVar, zzfdkVar));
        zzz("/precache", new zzccv());
        zzz("/touch", zzbho.zzi);
        zzz("/video", zzbho.zzl);
        zzz("/videoMeta", zzbho.zzm);
        if (zzeafVar == null || zzfffVar == null) {
            zzz("/click", zzbho.zza(zzdccVar));
            zzz("/httpTrack", zzbho.zzf);
        } else {
            zzz("/click", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzeze
                @Override // com.google.android.gms.internal.ads.zzbhp
                public final void zza(Object obj, Map map) {
                    zzdcc zzdccVar2 = zzdccVar;
                    zzfff zzfffVar2 = zzfffVar;
                    zzeaf zzeafVar2 = zzeafVar;
                    zzcei zzceiVar = (zzcei) obj;
                    zzbho.zzd(map, zzdccVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbza.zzj("URL missing from click GMSG.");
                    } else {
                        zzfuj.zzq(zzbho.zzb(zzceiVar, str), new zzezf(zzceiVar, zzfffVar2, zzeafVar2), zzbzn.zza);
                    }
                }
            });
            zzz("/httpTrack", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzezd
                @Override // com.google.android.gms.internal.ads.zzbhp
                public final void zza(Object obj, Map map) {
                    zzfff zzfffVar2 = zzfffVar;
                    zzeaf zzeafVar2 = zzeafVar;
                    zzcdz zzcdzVar = (zzcdz) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzbza.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcdzVar.zzD().zzaj) {
                        zzeafVar2.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcff) zzcdzVar).zzP().zzb, str, 2));
                    } else {
                        zzfffVar2.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbhu(this.zzc.getContext()));
        }
        if (zzbhrVar != null) {
            zzz("/setInterstitialProperties", new zzbhq(zzbhrVar, null));
        }
        if (zzbihVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbihVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziy)).booleanValue() && zzbigVar != null) {
            zzz("/shareSheet", zzbigVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue() && zzbiaVar != null) {
            zzz("/inspectorOutOfContextTest", zzbiaVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjE)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbho.zzu);
            zzz("/presentPlayStoreOverlay", zzbho.zzv);
            zzz("/expandPlayStoreOverlay", zzbho.zzw);
            zzz("/collapsePlayStoreOverlay", zzbho.zzx);
            zzz("/closePlayStoreOverlay", zzbho.zzy);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcL)).booleanValue()) {
                zzz("/setPAIDPersonalizationEnabled", zzbho.zzA);
                zzz("/resetPAID", zzbho.zzz);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbgiVar;
        this.zzl = zzbgkVar;
        this.zzs = zzzVar;
        this.zzu = zzbVar3;
        this.zzm = zzdccVar;
        this.zzn = z;
        this.zzw = zzfffVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    protected final WebResourceResponse zzc(String str, Map map) {
        zzavn zzavnVarZzb;
        try {
            if (((Boolean) zzbcm.zza.zze()).booleanValue() && this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.zzw.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String strZzc = zzbxh.zzc(str, this.zzc.getContext(), this.zzA);
            if (!strZzc.equals(str)) {
                return zzO(strZzc, map);
            }
            zzavq zzavqVarZza = zzavq.zza(Uri.parse(str));
            if (zzavqVarZza != null && (zzavnVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(zzavqVarZza)) != null && zzavnVarZzb.zze()) {
                return new WebResourceResponse("", "", zzavnVarZzb.zzc());
            }
            if (zzbyz.zzl() && ((Boolean) zzbcg.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() && this.zzc.zzm() != null) {
                zzbbb.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcft zzcftVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcftVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbwb zzbwbVar = this.zza;
        if (zzbwbVar != null) {
            zzbwbVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbpz zzbpzVar = this.zzv;
            if (zzbpzVar != null) {
                zzbpzVar.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    public final void zzi(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzj(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgo)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = strSubstring;
                    int i = zzcep.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfg)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfi)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfuj.zzq(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcen(this, list, path, uri), zzbzn.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzs.zzL(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzk() {
        zzawe zzaweVar = this.zzd;
        if (zzaweVar != null) {
            zzaweVar.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzm() {
        this.zzz--;
        zzg();
    }

    final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzlVarZzL = this.zzc.zzL();
        if (zzlVarZzL != null) {
            zzlVarZzL.zzx();
        }
    }

    final /* synthetic */ void zzo(View view, zzbwb zzbwbVar, int i) {
        zzR(view, zzbwbVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzp(int i, int i2, boolean z) {
        zzbqe zzbqeVar = this.zzt;
        if (zzbqeVar != null) {
            zzbqeVar.zzb(i, i2);
        }
        zzbpz zzbpzVar = this.zzv;
        if (zzbpzVar != null) {
            zzbpzVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfv
    public final void zzq() {
        zzbwb zzbwbVar = this.zza;
        if (zzbwbVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzR(webViewZzG, zzbwbVar, 10);
                return;
            }
            zzQ();
            zzcem zzcemVar = new zzcem(this, zzbwbVar);
            this.zzC = zzcemVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcemVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzr() {
        zzdcc zzdccVar = this.zzm;
        if (zzdccVar != null) {
            zzdccVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcc
    public final void zzs() {
        zzdcc zzdccVar = this.zzm;
        if (zzdccVar != null) {
            zzdccVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzS = zzS(zZzaA, this.zzc);
        boolean z2 = true;
        if (!zZzS && z) {
            z2 = false;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zZzS ? null : this.zzg, zZzaA ? null : this.zzh, this.zzs, this.zzc.zzn(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzu(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeaf zzeafVar, zzdpi zzdpiVar, zzfdk zzfdkVar, String str, String str2, int i) {
        zzcei zzceiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzceiVar, zzceiVar.zzn(), zzbrVar, zzeafVar, zzdpiVar, zzfdkVar, str, str2, 14));
    }

    public final void zzv(boolean z, int i, boolean z2) {
        boolean zZzS = zzS(this.zzc.zzaA(), this.zzc);
        boolean z3 = true;
        if (!zZzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzS ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcei zzceiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzceiVar, z, i, zzceiVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbpz zzbpzVar = this.zzv;
        boolean zZze = zzbpzVar != null ? zzbpzVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZze);
        zzbwb zzbwbVar = this.zza;
        if (zzbwbVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbwbVar.zzh(str);
        }
    }

    public final void zzx(boolean z, int i, String str, boolean z2) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzS = zzS(zZzaA, this.zzc);
        boolean z3 = true;
        if (!zZzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzS ? null : this.zzg;
        zzceo zzceoVar = zZzaA ? null : new zzceo(this.zzc, this.zzh);
        zzbgi zzbgiVar = this.zzk;
        zzbgk zzbgkVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcei zzceiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzceoVar, zzbgiVar, zzbgkVar, zzzVar, zzceiVar, z, i, str, zzceiVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        boolean zZzaA = this.zzc.zzaA();
        boolean zZzS = zzS(zZzaA, this.zzc);
        boolean z3 = true;
        if (!zZzS && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzS ? null : this.zzg;
        zzceo zzceoVar = zZzaA ? null : new zzceo(this.zzc, this.zzh);
        zzbgi zzbgiVar = this.zzk;
        zzbgk zzbgkVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcei zzceiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzceoVar, zzbgiVar, zzbgkVar, zzzVar, zzceiVar, z, i, str, str2, zzceiVar.zzn(), z3 ? null : this.zzm));
    }

    public final void zzz(String str, zzbhp zzbhpVar) {
        synchronized (this.zzf) {
            List copyOnWriteArrayList = (List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbhpVar);
        }
    }
}
