package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeuy implements zzfbe {
    public final zzevs zza;
    public final zzevu zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfat zzg;

    public zzeuy(zzevs zzevsVar, zzevu zzevuVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfat zzfatVar) {
        this.zza = zzevsVar;
        this.zzb = zzevuVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final zzfat zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final Executor zzb() {
        return this.zze;
    }
}
