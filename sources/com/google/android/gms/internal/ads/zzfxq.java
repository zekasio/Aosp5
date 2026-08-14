package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxq extends zzgcu {
    zzfxq() {
        super(zzghf.class, new zzfxo(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzghn zzghnVarZzc = zzgho.zzc();
        zzghq zzghqVarZzc = zzghr.zzc();
        zzghqVarZzc.zza(16);
        zzghnVarZzc.zzb((zzghr) zzghqVarZzc.zzal());
        zzghnVarZzc.zza(i);
        zzgho zzghoVar = (zzgho) zzghnVarZzc.zzal();
        zzgkb zzgkbVarZzc = zzgkc.zzc();
        zzgke zzgkeVarZzc = zzgkf.zzc();
        zzgkeVarZzc.zzb(5);
        zzgkeVarZzc.zza(i4);
        zzgkbVarZzc.zzb((zzgkf) zzgkeVarZzc.zzal());
        zzgkbVarZzc.zza(32);
        zzgkc zzgkcVar = (zzgkc) zzgkbVarZzc.zzal();
        zzghh zzghhVarZza = zzghi.zza();
        zzghhVarZza.zza(zzghoVar);
        zzghhVarZza.zzb(zzgkcVar);
        return new zzgcs((zzghi) zzghhVarZza.zzal(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfxp(this, zzghi.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzghf.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghf zzghfVar = (zzghf) zzgrwVar;
        zzgog.zzb(zzghfVar.zza(), 0);
        new zzfxt();
        zzfxt.zzh(zzghfVar.zzf());
        new zzgfo();
        zzgfo.zzm(zzghfVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final int zzf() {
        return 2;
    }
}
