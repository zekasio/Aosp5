package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflz;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmy;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzw {
    private zzfmc zzf;
    private zzcei zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzflp zzd = null;
    private String zzb = null;

    private final zzfme zzl() {
        zzfmd zzfmdVarZzc = zzfme.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfmdVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfmdVarZzc.zza(this.zzb);
        }
        return zzfmdVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcei zzceiVar, Context context) {
        this.zzc = zzceiVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzflpVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfln zzflnVarZzc = zzflo.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzflnVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzflnVarZzc.zza(this.zzb);
        }
        zzflpVar.zzb(zzflnVarZzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put(TJAdUnitConstants.String.MESSAGE, str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzflp zzflpVar;
        if (!this.zze || (zzflpVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzflpVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(String str, Map map) {
        zzcei zzceiVar = this.zzc;
        if (zzceiVar != null) {
            zzceiVar.zzd(str, map);
        }
    }

    final void zzi(zzfmb zzfmbVar) {
        if (!TextUtils.isEmpty(zzfmbVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue()) {
                this.zza = zzfmbVar.zzb();
            }
        }
        switch (zzfmbVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfmbVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzcei zzceiVar, zzflz zzflzVar) {
        if (zzceiVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzceiVar;
        if (!this.zze && !zzk(zzceiVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbar.zzjD)).booleanValue()) {
            this.zzb = zzflzVar.zzg();
        }
        zzm();
        zzflp zzflpVar = this.zzd;
        if (zzflpVar != null) {
            zzflpVar.zzd(zzflzVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfmy.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzflq.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
