package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzkh {
    private static final zzss zzs = new zzss(new Object());
    public final zzcn zza;
    public final zzss zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzhj zzf;
    public final boolean zzg;
    public final zzur zzh;
    public final zzwl zzi;
    public final List zzj;
    public final zzss zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzby zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;

    public zzkh(zzcn zzcnVar, zzss zzssVar, long j, long j2, int i, zzhj zzhjVar, boolean z, zzur zzurVar, zzwl zzwlVar, List list, zzss zzssVar2, boolean z2, int i2, zzby zzbyVar, long j3, long j4, long j5, boolean z3) {
        this.zza = zzcnVar;
        this.zzb = zzssVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzhjVar;
        this.zzg = z;
        this.zzh = zzurVar;
        this.zzi = zzwlVar;
        this.zzj = list;
        this.zzk = zzssVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzbyVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzo = z3;
    }

    public static zzkh zzg(zzwl zzwlVar) {
        zzcn zzcnVar = zzcn.zza;
        zzss zzssVar = zzs;
        return new zzkh(zzcnVar, zzssVar, -9223372036854775807L, 0L, 1, null, false, zzur.zza, zzwlVar, zzfqk.zzo(), zzssVar, false, 0, zzby.zza, 0L, 0L, 0L, false);
    }

    public static zzss zzh() {
        return zzs;
    }

    public final zzkh zza(zzss zzssVar) {
        return new zzkh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzssVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzb(zzss zzssVar, long j, long j2, long j3, long j4, zzur zzurVar, zzwl zzwlVar, List list) {
        return new zzkh(this.zza, zzssVar, j2, j3, this.zze, this.zzf, this.zzg, zzurVar, zzwlVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j4, j, this.zzo);
    }

    public final zzkh zzc(boolean z, int i) {
        return new zzkh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzd(zzhj zzhjVar) {
        return new zzkh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhjVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zze(int i) {
        return new zzkh(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }

    public final zzkh zzf(zzcn zzcnVar) {
        return new zzkh(zzcnVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzo);
    }
}
