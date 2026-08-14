package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlc implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzceu zzb;
    private final Context zzc;
    private final zzdpi zzd;
    private final zzfdk zze;
    private final zzeaf zzf;
    private final Executor zzg;
    private final zzapw zzh;
    private final zzbzg zzi;
    private final zzfff zzj;

    public zzdlc(Context context, Executor executor, zzapw zzapwVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.zza zzaVar, zzceu zzceuVar, zzeaf zzeafVar, zzfff zzfffVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzapwVar;
        this.zzi = zzbzgVar;
        this.zza = zzaVar;
        this.zzb = zzceuVar;
        this.zzf = zzeafVar;
        this.zzj = zzfffVar;
        this.zzd = zzdpiVar;
        this.zze = zzfdkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlf zzdlfVar = new zzdlf(this);
        zzdlfVar.zzh();
        return zzdlfVar;
    }
}
