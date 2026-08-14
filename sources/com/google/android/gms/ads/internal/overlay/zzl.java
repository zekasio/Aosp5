package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcft;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzcvb;
import com.google.android.gms.internal.ads.zzdcc;
import com.google.android.gms.internal.ads.zzean;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzl extends zzbrb implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcei zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zZze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z3) && !zZze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzb(zzbar.zzaY)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(iObjectWrapper, view);
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzB(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcei zzceiVar = this.zzc.zzd;
        zzcfv zzcfvVarZzN = zzceiVar != null ? zzceiVar.zzN() : null;
        boolean z2 = zzcfvVarZzN != null && zzcfvVarZzN.zzK();
        this.zzm = false;
        if (z2) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z;
            } else if (i == 7) {
                z = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z;
            }
        }
        zzbza.zze("Delay onShow to next orientation change: " + z);
        zzy(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        zzbza.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                Activity activity = this.zzb;
                zzcei zzceiVar2 = this.zzc.zzd;
                zzcfx zzcfxVarZzO = zzceiVar2 != null ? zzceiVar2.zzO() : null;
                zzcei zzceiVar3 = this.zzc.zzd;
                String strZzS = zzceiVar3 != null ? zzceiVar3.zzS() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzbzg zzbzgVar = adOverlayInfoParcel.zzm;
                zzcei zzceiVar4 = adOverlayInfoParcel.zzd;
                zzcei zzceiVarZza = zzceu.zza(activity, zzcfxVarZzO, strZzS, true, z2, null, null, zzbzgVar, null, null, zzceiVar4 != null ? zzceiVar4.zzj() : null, zzawe.zza(), null, null);
                this.zzd = zzceiVarZza;
                zzcfv zzcfvVarZzN2 = zzceiVarZza.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbgi zzbgiVar = adOverlayInfoParcel2.zzp;
                zzbgk zzbgkVar = adOverlayInfoParcel2.zze;
                zzz zzzVar = adOverlayInfoParcel2.zzi;
                zzcei zzceiVar5 = adOverlayInfoParcel2.zzd;
                zzcfvVarZzN2.zzM(null, zzbgiVar, null, zzbgkVar, zzzVar, true, null, zzceiVar5 != null ? zzceiVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzA(new zzcft() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.google.android.gms.internal.ads.zzcft
                    public final void zza(boolean z3) {
                        zzcei zzceiVar6 = this.zza.zzd;
                        if (zzceiVar6 != null) {
                            zzceiVar6.zzX();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzcei zzceiVar6 = this.zzc.zzd;
                if (zzceiVar6 != null) {
                    zzceiVar6.zzar(this);
                }
            } catch (Exception e) {
                zzbza.zzh("Error obtaining webview.", e);
                throw new zzf("Could not obtain webview for the overlay.", e);
            }
        } else {
            zzcei zzceiVar7 = this.zzc.zzd;
            this.zzd = zzceiVar7;
            zzceiVar7.zzak(this.zzb);
        }
        this.zzd.zzaf(this);
        zzcei zzceiVar8 = this.zzc.zzd;
        if (zzceiVar8 != null) {
            zzH(zzceiVar8.zzQ(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.zzaj();
            }
            this.zzl.addView(this.zzd.zzF(), -1, -1);
        }
        if (!z && !this.zzm) {
            zze();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk == 5) {
            zzean.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzu(z2);
        if (this.zzd.zzaw()) {
            zzw(z2, true);
        }
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzs.zza.post(this.zzp);
            }
        }
    }

    protected final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            zzceiVar.zzW(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzax()) {
                    if (((Boolean) zzba.zzc().zzb(zzbar.zzer)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzby();
                    }
                    this.zzp = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzp, ((Long) zzba.zzc().zzb(zzbar.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbar.zzif)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzaC = this.zzd.zzaC();
        if (!zZzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zZzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    final void zzc() {
        zzcei zzceiVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcei zzceiVar2 = this.zzd;
        if (zzceiVar2 != null) {
            this.zzl.removeView(zzceiVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(viewZzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzceiVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzceiVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzX();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzi() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public void zzk(Bundle bundle) {
        this.zzb.requestWindowFeature(1);
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzf("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzm.zzc > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzu) {
                    zzcvb zzcvbVar = this.zzc.zzx;
                    if (zzcvbVar != null) {
                        zzcvbVar.zze();
                    }
                    zzo zzoVar = this.zzc.zzc;
                    if (zzoVar != null) {
                        zzoVar.zzb();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdcc zzdccVar = this.zzc.zzy;
                    if (zzdccVar != null) {
                        zzdccVar.zzr();
                    }
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzw);
            this.zzl = zzgVar;
            zzgVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzq().zzk(this.zzb);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                zzB(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzh(adOverlayInfoParcel4.zzd);
                zzB(false);
            } else if (i == 3) {
                zzB(true);
            } else {
                if (i != 5) {
                    throw new zzf("Could not determine ad overlay type.");
                }
                zzB(false);
            }
        } catch (zzf e) {
            zzbza.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzl() {
        zzcei zzceiVar = this.zzd;
        if (zzceiVar != null) {
            try {
                this.zzl.removeView(zzceiVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbF();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue()) {
            return;
        }
        zzcei zzceiVar = this.zzd;
        if (zzceiVar == null || zzceiVar.zzaz()) {
            zzbza.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzr() {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue()) {
            zzcei zzceiVar = this.zzd;
            if (zzceiVar == null || zzceiVar.zzaz()) {
                zzbza.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzs() {
        if (((Boolean) zzba.zzc().zzb(zzbar.zzet)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int iIntValue = ((Integer) zzba.zzc().zzb(zzbar.zzev)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zzb(zzbar.zzaU)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : iIntValue;
        zzqVar.zzb = true != z2 ? iIntValue : 0;
        zzqVar.zzc = iIntValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zzb(zzbar.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zzb(zzbar.zzaT)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbqf(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbar.zzfA)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbar.zzfB)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zzb(zzbar.zzfC)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzba.zzc().zzb(zzbar.zzfD)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }
}
