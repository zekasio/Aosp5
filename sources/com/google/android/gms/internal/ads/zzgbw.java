package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbw {
    static zzgbp zza(zzgkn zzgknVar) throws GeneralSecurityException {
        if (zzgknVar.zze() == 3) {
            return new zzgbm(16);
        }
        if (zzgknVar.zze() == 4) {
            return new zzgbm(32);
        }
        if (zzgknVar.zze() == 5) {
            return new zzgbn();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzgbt zzb(zzgkn zzgknVar) throws GeneralSecurityException {
        if (zzgknVar.zzg() == 3) {
            return new zzgcf(new zzgbo("HmacSha256"));
        }
        if (zzgknVar.zzg() == 4) {
            return zzgcd.zzc(1);
        }
        if (zzgknVar.zzg() == 5) {
            return zzgcd.zzc(2);
        }
        if (zzgknVar.zzg() == 6) {
            return zzgcd.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static zzgbo zzc(zzgkn zzgknVar) {
        if (zzgknVar.zzf() == 3) {
            return new zzgbo("HmacSha256");
        }
        if (zzgknVar.zzf() == 4) {
            return new zzgbo("HmacSha384");
        }
        if (zzgknVar.zzf() == 5) {
            return new zzgbo("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
