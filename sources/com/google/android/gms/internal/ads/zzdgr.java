package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgr {
    zzbey zza;
    zzbev zzb;
    zzbfl zzc;
    zzbfi zzd;
    zzbkg zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdgr zza(zzbev zzbevVar) {
        this.zzb = zzbevVar;
        return this;
    }

    public final zzdgr zzb(zzbey zzbeyVar) {
        this.zza = zzbeyVar;
        return this;
    }

    public final zzdgr zzc(String str, zzbfe zzbfeVar, zzbfb zzbfbVar) {
        this.zzf.put(str, zzbfeVar);
        if (zzbfbVar != null) {
            this.zzg.put(str, zzbfbVar);
        }
        return this;
    }

    public final zzdgr zzd(zzbkg zzbkgVar) {
        this.zze = zzbkgVar;
        return this;
    }

    public final zzdgr zze(zzbfi zzbfiVar) {
        this.zzd = zzbfiVar;
        return this;
    }

    public final zzdgr zzf(zzbfl zzbflVar) {
        this.zzc = zzbflVar;
        return this;
    }

    public final zzdgt zzg() {
        return new zzdgt(this);
    }
}
