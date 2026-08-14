package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmn implements zzcur {
    private final zzeyf zza;
    private final zzeyo zzb;
    private final zzffb zzc;
    private final zzfff zzd;

    public zzcmn(zzeyo zzeyoVar, zzfff zzfffVar, zzffb zzffbVar) {
        this.zzb = zzeyoVar;
        this.zzd = zzfffVar;
        this.zzc = zzffbVar;
        this.zza = zzeyoVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, this.zza.zza));
    }
}
