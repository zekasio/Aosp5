package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbz extends zzgdy {
    public zzgbz() {
        super(zzgkq.class, zzgkt.class, new zzgbx(zzfvv.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2, int i3, int i4) {
        zzgkm zzgkmVarZza = zzgkn.zza();
        zzgkmVarZza.zzc(i);
        zzgkmVarZza.zzb(i2);
        zzgkmVarZza.zza(i3);
        zzgkn zzgknVar = (zzgkn) zzgkmVarZza.zzal();
        zzgkj zzgkjVarZza = zzgkk.zza();
        zzgkjVarZza.zza(zzgknVar);
        return new zzgcs((zzgkk) zzgkjVarZza.zzal(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgby(this, zzgkk.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgkq.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgkq zzgkqVar = (zzgkq) zzgrwVar;
        if (zzgkqVar.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzgkqVar.zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzgog.zzb(zzgkqVar.zza(), 0);
        zzgcc.zza(zzgkqVar.zzf().zzc());
    }
}
