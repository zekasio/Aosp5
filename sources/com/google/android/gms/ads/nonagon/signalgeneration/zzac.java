package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzdlf;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfeb;
import com.google.android.gms.internal.ads.zzfec;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfnj;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfua;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzac extends zzbxq {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzbzg zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcgd zzf;
    private Context zzg;
    private final zzapw zzh;
    private final zzezt zzi;
    private final zzfuu zzk;
    private final ScheduledExecutorService zzl;
    private zzbsa zzm;
    private final zzc zzq;
    private final zzdpn zzr;
    private final zzfff zzs;
    private zzdpd zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final zzfuu zzH = zzbzn.zze;
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbar.zzgO)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbar.zzgN)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbar.zzgP)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbar.zzgR)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbar.zzgQ);
    private final String zzy = (String) zzba.zzc().zzb(zzbar.zzgS);
    private final String zzC = (String) zzba.zzc().zzb(zzbar.zzgT);

    public zzac(zzcgd zzcgdVar, Context context, zzapw zzapwVar, zzezt zzeztVar, zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, zzdpn zzdpnVar, zzfff zzfffVar, zzbzg zzbzgVar) {
        List listZzY;
        this.zzf = zzcgdVar;
        this.zzg = context;
        this.zzh = zzapwVar;
        this.zzi = zzeztVar;
        this.zzk = zzfuuVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcgdVar.zzm();
        this.zzr = zzdpnVar;
        this.zzs = zzfffVar;
        this.zzA = zzbzgVar;
        if (((Boolean) zzba.zzc().zzb(zzbar.zzgU)).booleanValue()) {
            this.zzD = zzY((String) zzba.zzc().zzb(zzbar.zzgV));
            this.zzE = zzY((String) zzba.zzc().zzb(zzbar.zzgW));
            this.zzF = zzY((String) zzba.zzc().zzb(zzbar.zzgX));
            listZzY = zzY((String) zzba.zzc().zzb(zzbar.zzgY));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            listZzY = zzd;
        }
        this.zzG = listZzY;
    }

    static /* bridge */ /* synthetic */ void zzF(zzac zzacVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzacVar.zzO((Uri) it.next())) {
                zzacVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzG(final zzac zzacVar, final String str, final String str2, final zzdpd zzdpdVar) {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzgz)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzgF)).booleanValue()) {
                zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzJ(str, str2, zzdpdVar);
                    }
                });
            } else {
                zzacVar.zzq.zzd(str, str2, zzdpdVar);
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzX(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzR(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzac.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl):com.google.android.gms.ads.nonagon.signalgeneration.zzh");
    }

    private final zzfut zzS(final String str) {
        final zzdlf[] zzdlfVarArr = new zzdlf[1];
        zzfut zzfutVarZzm = zzfuj.zzm(this.zzi.zza(), new zzftq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzv(zzdlfVarArr, str, (zzdlf) obj);
            }
        }, this.zzk);
        zzfutVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI(zzdlfVarArr);
            }
        }, this.zzk);
        return zzfuj.zze(zzfuj.zzl((zzfua) zzfuj.zzn(zzfua.zzv(zzfutVarZzm), ((Integer) zzba.zzc().zzb(zzbar.zzhe)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfnj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                int i = zzac.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfnj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                int i = zzac.zze;
                zzbza.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzT(List list, final IObjectWrapper iObjectWrapper, zzbrr zzbrrVar, boolean z) {
        zzfut zzfutVarZzb;
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzhd)).booleanValue()) {
            zzbza.zzj("The updating URL feature is not enabled.");
            try {
                zzbrrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzbza.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            zzbza.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                zzfutVarZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzW()) {
                    zzfutVarZzb = zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                        @Override // com.google.android.gms.internal.ads.zzftq
                        public final zzfut zza(Object obj) {
                            zzac zzacVar = this.zza;
                            return zzfuj.zzl(zzacVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfnj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                                @Override // com.google.android.gms.internal.ads.zzfnj
                                public final Object apply(Object obj2) {
                                    return zzac.zzQ(uri, (String) obj2);
                                }
                            }, zzacVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    zzbza.zzi("Asset view map is empty.");
                }
            } else {
                zzbza.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                zzfutVarZzb = zzfuj.zzh(uri);
            }
            arrayList.add(zzfutVarZzb);
        }
        zzfuj.zzq(zzfuj.zzd(arrayList), new zzz(this, zzbrrVar, z), this.zzf.zzA());
    }

    private final void zzU(final List list, final IObjectWrapper iObjectWrapper, zzbrr zzbrrVar, boolean z) {
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzhd)).booleanValue()) {
            try {
                zzbrrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzbza.zzh("", e);
                return;
            }
        }
        zzfut zzfutVarZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzW()) {
            zzfutVarZzb = zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzbza.zzi("Asset view map is empty.");
        }
        zzfuj.zzq(zzfutVarZzb, new zzy(this, zzbrrVar, z), this.zzf.zzA());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzW() {
        Map map;
        zzbsa zzbsaVar = this.zzm;
        return (zzbsaVar == null || (map = zzbsaVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzX(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    private static final List zzY(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfoj.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfen zzr(zzfut zzfutVar, zzbxv zzbxvVar) {
        if (!zzfep.zza() || !((Boolean) zzbcd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfen zzfenVarZzb = ((zzh) zzfuj.zzo(zzfutVar)).zzb();
            zzfenVarZzb.zzd(new ArrayList(Collections.singletonList(zzbxvVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbxvVar.zzd;
            zzfenVarZzb.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzfenVarZzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzX(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String strZzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzX(uri, "ms", strZzh));
            } else {
                zzbza.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzH(WebView webView) {
        CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zzg);
        boolean zAcceptThirdPartyCookies = cookieManagerZzb != null ? cookieManagerZzb.acceptThirdPartyCookies(webView) : false;
        if (((Boolean) zzba.zzc().zzb(zzbar.zziK)).booleanValue()) {
            zzf.zzc(this.zzr, this.zzj, "reg_wv", new Pair("tpc", true != zAcceptThirdPartyCookies ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE));
        }
        if (zAcceptThirdPartyCookies) {
            Context context = this.zzg;
            String str = (String) zzba.zzc().zzb(zzbar.zziM);
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setRequestAgent("paw");
            InterstitialAd.load(context, str, builder.build(), new zzab(this));
        }
    }

    final /* synthetic */ void zzI(zzdlf[] zzdlfVarArr) {
        zzdlf zzdlfVar = zzdlfVarArr[0];
        if (zzdlfVar != null) {
            this.zzi.zzb(zzfuj.zzh(zzdlfVar));
        }
    }

    final /* synthetic */ void zzJ(String str, String str2, zzdpd zzdpdVar) {
        this.zzq.zzd(str, str2, zzdpdVar);
    }

    final boolean zzO(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    final boolean zzP(Uri uri) {
        return zzV(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zze(IObjectWrapper iObjectWrapper, final zzbxv zzbxvVar, zzbxo zzbxoVar) {
        zzfut zzfutVarZzc;
        zzfut zzfutVar;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfec zzfecVarZza = zzfeb.zza(context, 22);
        zzfecVarZza.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjr)).booleanValue()) {
            zzfut zzfutVarZzb = zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzq(zzbxvVar);
                }
            });
            zzfutVar = zzfutVarZzb;
            zzfutVarZzc = zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzbzn.zza);
        } else {
            zzh zzhVarZzR = zzR(this.zzg, zzbxvVar.zza, zzbxvVar.zzb, zzbxvVar.zzc, zzbxvVar.zzd);
            zzfut zzfutVarZzh = zzfuj.zzh(zzhVarZzR);
            zzfutVarZzc = zzhVarZzR.zzc();
            zzfutVar = zzfutVarZzh;
        }
        zzfuj.zzq(zzfutVarZzc, new zzx(this, zzfutVar, zzbxvVar, zzbxoVar, zzfecVarZza, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzf(zzbsa zzbsaVar) {
        this.zzm = zzbsaVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) {
        zzT(list, iObjectWrapper, zzbrrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) {
        zzU(list, iObjectWrapper, zzbrrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbar.zziE)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zzbza.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzba.zzc().zzb(zzbar.zziF)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbar.zziI)).booleanValue()) {
                    zzfuj.zzq(((Boolean) zzba.zzc().zzb(zzbar.zzjr)).booleanValue() ? zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                        @Override // com.google.android.gms.internal.ads.zzftp
                        public final zzfut zza() {
                            return this.zza.zzu();
                        }
                    }, zzbzn.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc(), new zzaa(this), this.zzf.zzA());
                }
            }
            final WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zzbza.zzg("The webView cannot be null.");
                return;
            }
            if (this.zzp.contains(webView)) {
                zzbza.zzi("This webview has already been registered.");
                return;
            }
            this.zzp.add(webView);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
            if (((Boolean) zzba.zzc().zzb(zzbar.zziL)).booleanValue()) {
                this.zzH.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzH(webView);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzhd)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbsa zzbsaVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzbsaVar == null ? null : zzbsaVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) {
        zzT(list, iObjectWrapper, zzbrrVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbxr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbrr zzbrrVar) {
        zzU(list, iObjectWrapper, zzbrrVar, false);
    }

    final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzapx e) {
            zzbza.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzh zzq(zzbxv zzbxvVar) throws Exception {
        return zzR(this.zzg, zzbxvVar.zza, zzbxvVar.zzb, zzbxvVar.zzc, zzbxvVar.zzd);
    }

    final /* synthetic */ zzfut zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    final /* synthetic */ zzfut zzv(zzdlf[] zzdlfVarArr, String str, zzdlf zzdlfVar) throws Exception {
        zzdlfVarArr[0] = zzdlfVar;
        Context context = this.zzg;
        zzbsa zzbsaVar = this.zzm;
        Map map = zzbsaVar.zzb;
        JSONObject jSONObjectZzd = zzbx.zzd(context, map, map, zzbsaVar.zza, null);
        JSONObject jSONObjectZzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbx.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdlfVar.zzd(str, jSONObject);
    }

    final /* synthetic */ zzfut zzw(final ArrayList arrayList) throws Exception {
        return zzfuj.zzl(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfnj() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
