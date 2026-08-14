package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdf {
    private static final zzgdf zza = new zzgdf();
    private final AtomicReference zzb = new AtomicReference(new zzgei(new zzgec(), null));

    public static zzgdf zzb() {
        return zza;
    }

    public final zzfvx zza(zzgdz zzgdzVar, zzfxg zzfxgVar) throws GeneralSecurityException {
        if (((zzgei) this.zzb.get()).zzf(zzgdzVar)) {
            return ((zzgei) this.zzb.get()).zza(zzgdzVar, zzfxgVar);
        }
        try {
            return new zzgcw(zzgdzVar, zzfxgVar);
        } catch (GeneralSecurityException e) {
            throw new zzgej("Creating a LegacyProtoKey failed", e);
        }
    }

    public final synchronized void zzc(zzgcn zzgcnVar) throws GeneralSecurityException {
        zzgec zzgecVar = new zzgec((zzgei) this.zzb.get());
        zzgecVar.zza(zzgcnVar);
        this.zzb.set(new zzgei(zzgecVar, null));
    }

    public final synchronized void zzd(zzgcr zzgcrVar) throws GeneralSecurityException {
        zzgec zzgecVar = new zzgec((zzgei) this.zzb.get());
        zzgecVar.zzb(zzgcrVar);
        this.zzb.set(new zzgei(zzgecVar, null));
    }

    public final synchronized void zze(zzgdj zzgdjVar) throws GeneralSecurityException {
        zzgec zzgecVar = new zzgec((zzgei) this.zzb.get());
        zzgecVar.zzc(zzgdjVar);
        this.zzb.set(new zzgei(zzgecVar, null));
    }

    public final synchronized void zzf(zzgdn zzgdnVar) throws GeneralSecurityException {
        zzgec zzgecVar = new zzgec((zzgei) this.zzb.get());
        zzgecVar.zzd(zzgdnVar);
        this.zzb.set(new zzgei(zzgecVar, null));
    }
}
