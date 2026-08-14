package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxh {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzglq zza(zzgll zzgllVar) {
        zzgln zzglnVarZza = zzglq.zza();
        zzglnVarZza.zzb(zzgllVar.zzc());
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            zzglo zzgloVarZza = zzglp.zza();
            zzgloVarZza.zzc(zzglkVar.zzc().zzg());
            zzgloVarZza.zzd(zzglkVar.zzk());
            zzgloVarZza.zzb(zzglkVar.zzf());
            zzgloVarZza.zza(zzglkVar.zza());
            zzglnVarZza.zza((zzglp) zzgloVarZza.zzal());
        }
        return (zzglq) zzglnVarZza.zzal();
    }

    public static void zzb(zzgll zzgllVar) throws GeneralSecurityException {
        int iZzc = zzgllVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            if (zzglkVar.zzk() == 3) {
                if (!zzglkVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zzf() == zzgme.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zza() == iZzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzglkVar.zzc().zzc() == zzgkx.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
