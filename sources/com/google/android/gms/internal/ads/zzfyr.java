package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyr extends zzgcu {
    zzfyr() {
        super(zzgid.class, new zzfyp(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2) {
        zzgif zzgifVarZzc = zzgig.zzc();
        zzgifVarZzc.zza(i);
        return new zzgcs((zzgig) zzgifVarZzc.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfyq(this, zzgig.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgid.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgid zzgidVar = (zzgid) zzgrwVar;
        zzgog.zzb(zzgidVar.zza(), 0);
        zzgog.zza(zzgidVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final int zzf() {
        return 2;
    }
}
