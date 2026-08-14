package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbr implements zzfvv {
    private final zzgbv zza;
    private final zzgbt zzb;
    private final zzgbp zzc;
    private final zzgbo zzd;

    private zzgbr(zzgbv zzgbvVar, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, int i, byte[] bArr) {
        this.zza = zzgbvVar;
        this.zzb = zzgbtVar;
        this.zzd = zzgboVar;
        this.zzc = zzgbpVar;
    }

    static zzgbr zza(zzgkq zzgkqVar) throws GeneralSecurityException {
        int i;
        zzgbv zzgbvVarZza;
        if (!zzgkqVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzgkqVar.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzgkqVar.zzg().zzD()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzgkn zzgknVarZzc = zzgkqVar.zzf().zzc();
        zzgbt zzgbtVarZzb = zzgbw.zzb(zzgknVarZzc);
        zzgbo zzgboVarZzc = zzgbw.zzc(zzgknVarZzc);
        zzgbp zzgbpVarZza = zzgbw.zza(zzgknVarZzc);
        int iZzg = zzgknVarZzc.zzg();
        int i2 = iZzg - 2;
        if (i2 == 1) {
            i = 32;
        } else if (i2 == 2) {
            i = 65;
        } else if (i2 == 3) {
            i = 97;
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgkh.zza(iZzg)));
            }
            i = 133;
        }
        int iZzg2 = zzgkqVar.zzf().zzc().zzg() - 2;
        if (iZzg2 == 1) {
            zzgbvVarZza = zzgcg.zza(zzgkqVar.zzg().zzE());
        } else {
            if (iZzg2 != 2 && iZzg2 != 3 && iZzg2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            zzgbvVarZza = zzgce.zza(zzgkqVar.zzg().zzE(), zzgkqVar.zzf().zzh().zzE(), zzgcc.zzg(zzgkqVar.zzf().zzc().zzg()));
        }
        return new zzgbr(zzgbvVarZza, zzgbtVarZzb, zzgboVarZzc, zzgbpVarZza, i, null);
    }
}
