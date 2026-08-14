package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgri extends zzgrk {
    private zzgri() {
        super(null);
    }

    /* synthetic */ zzgri(zzgrh zzgrhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final List zza(Object obj, long j) {
        zzgqv zzgqvVar = (zzgqv) zzgtq.zzh(obj, j);
        if (zzgqvVar.zzc()) {
            return zzgqvVar;
        }
        int size = zzgqvVar.size();
        zzgqv zzgqvVarZzd = zzgqvVar.zzd(size == 0 ? 10 : size + size);
        zzgtq.zzv(obj, j, zzgqvVarZzd);
        return zzgqvVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final void zzb(Object obj, long j) {
        ((zzgqv) zzgtq.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    final void zzc(Object obj, Object obj2, long j) {
        zzgqv zzgqvVarZzd = (zzgqv) zzgtq.zzh(obj, j);
        zzgqv zzgqvVar = (zzgqv) zzgtq.zzh(obj2, j);
        int size = zzgqvVarZzd.size();
        int size2 = zzgqvVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzgqvVarZzd.zzc()) {
                zzgqvVarZzd = zzgqvVarZzd.zzd(size2 + size);
            }
            zzgqvVarZzd.addAll(zzgqvVar);
        }
        if (size > 0) {
            zzgqvVar = zzgqvVarZzd;
        }
        zzgtq.zzv(obj, j, zzgqvVar);
    }
}
