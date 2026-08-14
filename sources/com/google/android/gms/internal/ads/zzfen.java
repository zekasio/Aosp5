package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfen implements Runnable {
    private final zzfep zzb;
    private String zzc;
    private String zzd;
    private zzeyn zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    zzfen(zzfep zzfepVar) {
        this.zzb = zzfepVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfen zza(zzfec zzfecVar) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfecVar.zzi();
            list.add(zzfecVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzbzn.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhZ)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfen zzb(String str) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue() && zzfem.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfen zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfen zzd(ArrayList arrayList) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                this.zzh = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                this.zzh = 4;
            } else if (arrayList.contains(TapjoyConstants.TJC_PLUGIN_NATIVE) || arrayList.contains(AdFormat.NATIVE.name())) {
                this.zzh = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                this.zzh = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzh = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.zzh = 6;
            }
        }
        return this;
    }

    public final synchronized zzfen zze(String str) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfen zzf(zzeyn zzeynVar) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zze = zzeynVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfec zzfecVar : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfecVar.zzm(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfecVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfecVar.zzk()) {
                    zzfecVar.zzd(this.zzd);
                }
                zzeyn zzeynVar = this.zze;
                if (zzeynVar != null) {
                    zzfecVar.zzb(zzeynVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfecVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfecVar.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfen zzh(int i) {
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
