package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgay implements zzfvu {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    public zzgay(zzfxb zzfxbVar) {
        zzggm zzggmVarZza;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzggnVarZzb = zzgdd.zza().zzb();
            zzggs zzggsVarZza = zzgda.zza(zzfxbVar);
            this.zzb = zzggnVarZzb.zza(zzggsVarZza, "daead", "encrypt");
            zzggmVarZza = zzggnVarZzb.zza(zzggsVarZza, "daead", "decrypt");
        } else {
            zzggmVarZza = zzgda.zza;
            this.zzb = zzggmVarZza;
        }
        this.zzc = zzggmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvu) this.zza.zza().zze()).zza(bArr, bArr2));
        this.zza.zza().zza();
        int length = bArr.length;
        return bArrZzb;
    }
}
