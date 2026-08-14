package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgti extends zzgtg {
    zzgti() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ int zza(Object obj) {
        return ((zzgth) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ int zzb(Object obj) {
        return ((zzgth) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgqm zzgqmVar = (zzgqm) obj;
        zzgth zzgthVar = zzgqmVar.zzc;
        if (zzgthVar != zzgth.zzc()) {
            return zzgthVar;
        }
        zzgth zzgthVarZzf = zzgth.zzf();
        zzgqmVar.zzc = zzgthVarZzf;
        return zzgthVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzgqm) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzgth.zzc().equals(obj2)) {
            return obj;
        }
        if (zzgth.zzc().equals(obj)) {
            return zzgth.zze((zzgth) obj, (zzgth) obj2);
        }
        ((zzgth) obj).zzd((zzgth) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ Object zzf() {
        return zzgth.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgth) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgth) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgth) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgth) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgpe zzgpeVar) {
        ((zzgth) obj).zzj((i << 3) | 2, zzgpeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgth) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final void zzm(Object obj) {
        ((zzgqm) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgqm) obj).zzc = (zzgth) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgqm) obj).zzc = (zzgth) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final boolean zzq(zzgsh zzgshVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtg
    final /* synthetic */ void zzr(Object obj, zzgpu zzgpuVar) throws IOException {
        ((zzgth) obj).zzk(zzgpuVar);
    }
}
