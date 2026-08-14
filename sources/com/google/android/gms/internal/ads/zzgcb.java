package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcb extends zzgcu {
    public zzgcb() {
        super(zzgkt.class, new zzgca(zzfvw.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgkt.zzg(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgkt zzgktVar = (zzgkt) zzgrwVar;
        zzgog.zzb(zzgktVar.zza(), 0);
        if (!zzgktVar.zzl()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzgcc.zza(zzgktVar.zzc());
    }
}
