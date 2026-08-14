package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzfwa implements zzfvy {
    private final zzgcu zza;
    private final Class zzb;

    public zzfwa(zzgcu zzgcuVar, Class cls) {
        if (!zzgcuVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgcuVar.toString(), cls.getName()));
        }
        this.zza = zzgcuVar;
        this.zzb = cls;
    }

    private final zzfvz zzg() {
        return new zzfvz(this.zza.zza());
    }

    private final Object zzh(zzgrw zzgrwVar) throws GeneralSecurityException {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zze(zzgrwVar);
        return this.zza.zzk(zzgrwVar, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final zzgky zza(zzgpe zzgpeVar) throws GeneralSecurityException {
        try {
            zzgrw zzgrwVarZza = zzg().zza(zzgpeVar);
            zzgkv zzgkvVarZza = zzgky.zza();
            zzgkvVarZza.zzb(this.zza.zzd());
            zzgkvVarZza.zzc(zzgrwVarZza.zzau());
            zzgkvVarZza.zza(this.zza.zzb());
            return (zzgky) zzgkvVarZza.zzal();
        } catch (zzgqy e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final zzgrw zzb(zzgpe zzgpeVar) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgpeVar);
        } catch (zzgqy e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final Object zzd(zzgpe zzgpeVar) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzc(zzgpeVar));
        } catch (zzgqy e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final Object zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(this.zza.zzj().getName());
        if (this.zza.zzj().isInstance(zzgrwVar)) {
            return zzh(zzgrwVar);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final String zzf() {
        return this.zza.zzd();
    }
}
