package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxm implements zzfvo {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    /* synthetic */ zzfxm(zzfxb zzfxbVar, zzfxl zzfxlVar) {
        zzggm zzggmVarZza;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzggnVarZzb = zzgdd.zza().zzb();
            zzggs zzggsVarZza = zzgda.zza(zzfxbVar);
            this.zzb = zzggnVarZzb.zza(zzggsVarZza, "aead", "encrypt");
            zzggmVarZza = zzggnVarZzb.zza(zzggsVarZza, "aead", "decrypt");
        } else {
            zzggmVarZza = zzgda.zza;
            this.zzb = zzggmVarZza;
        }
        this.zzc = zzggmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwxVar : this.zza.zze(bArrCopyOf)) {
                try {
                    byte[] bArrZza = ((zzfvo) zzfwxVar.zze()).zza(bArrCopyOfRange, bArr2);
                    zzfwxVar.zza();
                    int length2 = bArrCopyOfRange.length;
                    return bArrZza;
                } catch (GeneralSecurityException e) {
                    zzfxn.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzfwx zzfwxVar2 : this.zza.zze(zzfvt.zza)) {
            try {
                byte[] bArrZza2 = ((zzfvo) zzfwxVar2.zze()).zza(bArr, bArr2);
                zzfwxVar2.zza();
                int length3 = bArr.length;
                return bArrZza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfvo) this.zza.zza().zze()).zzb(bArr, bArr2));
        this.zza.zza().zza();
        int length = bArr.length;
        return bArrZzb;
    }
}
