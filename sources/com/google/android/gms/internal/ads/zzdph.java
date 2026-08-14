package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdph {
    final /* synthetic */ zzdpi zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdph(zzdpi zzdpiVar) {
        this.zza = zzdpiVar;
    }

    static /* bridge */ /* synthetic */ zzdph zza(zzdph zzdphVar) {
        zzdphVar.zzb.putAll(zzdphVar.zza.zzc);
        return zzdphVar;
    }

    public final zzdph zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdph zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdph zzd(zzeyc zzeycVar) {
        this.zzb.put("aai", zzeycVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgC)).booleanValue()) {
            zzc("rid", zzeycVar.zzao);
        }
        return this;
    }

    public final zzdph zze(zzeyf zzeyfVar) {
        this.zzb.put("gqi", zzeyfVar.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
