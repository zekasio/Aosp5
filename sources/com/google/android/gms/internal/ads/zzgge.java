package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgge implements zzfws {
    private final zzfxb zza;
    private final zzggm zzb;
    private final zzggm zzc;

    /* synthetic */ zzgge(zzfxb zzfxbVar, zzggd zzggdVar) {
        zzggm zzggmVarZza;
        this.zza = zzfxbVar;
        if (zzfxbVar.zzf()) {
            zzggn zzggnVarZzb = zzgdd.zza().zzb();
            zzggs zzggsVarZza = zzgda.zza(zzfxbVar);
            this.zzb = zzggnVarZzb.zza(zzggsVarZza, "mac", "compute");
            zzggmVarZza = zzggnVarZzb.zza(zzggsVarZza, "mac", "verify");
        } else {
            zzggmVarZza = zzgda.zza;
            this.zzb = zzggmVarZza;
        }
        this.zzc = zzggmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzfwx zzfwxVar : this.zza.zze(bArrCopyOf)) {
            try {
                ((zzfws) zzfwxVar.zze()).zza(bArrCopyOfRange, zzfwxVar.zzc().equals(zzgme.LEGACY) ? zzgmv.zzb(bArr2, zzggf.zzb) : bArr2);
                zzfwxVar.zza();
                return;
            } catch (GeneralSecurityException e) {
                zzggf.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (zzfwx zzfwxVar2 : this.zza.zze(zzfvt.zza)) {
            try {
                ((zzfws) zzfwxVar2.zze()).zza(bArr, bArr2);
                zzfwxVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzc().equals(zzgme.LEGACY)) {
            bArr = zzgmv.zzb(bArr, zzggf.zzb);
        }
        byte[] bArrZzb = zzgmv.zzb(this.zza.zza().zzg(), ((zzfws) this.zza.zza().zze()).zzb(bArr));
        this.zza.zza().zza();
        return bArrZzb;
    }
}
