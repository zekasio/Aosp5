package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcf implements zzgbt {
    private final zzgbo zza;

    zzgcf(zzgbo zzgboVar) {
        this.zza = zzgboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrZzb = zzgoh.zzb();
        byte[] bArrZza = zzgoh.zza(bArrZzb, bArr);
        byte[] bArrZzc = zzgoh.zzc(bArrZzb);
        byte[] bArrZzb2 = zzgmv.zzb(bArrZzc, bArr);
        byte[] bArrZzd = zzgcc.zzd(zzgcc.zzb);
        zzgbo zzgboVar = this.zza;
        return new zzgbu(zzgboVar.zzb(null, bArrZza, "eae_prk", bArrZzb2, "shared_secret", bArrZzd, zzgboVar.zza()), bArrZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzgcc.zzf)) {
            return zzgcc.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
