package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfya extends zzgcu {
    zzfya() {
        super(zzghu.class, new zzfxy(zzfvo.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzg(int i, int i2, int i3) {
        zzghw zzghwVarZzc = zzghx.zzc();
        zzghwVarZzc.zza(i);
        zzghz zzghzVarZzc = zzgia.zzc();
        zzghzVarZzc.zza(16);
        zzghwVarZzc.zzb((zzgia) zzghzVarZzc.zzal());
        return new zzgcs((zzghx) zzghwVarZzc.zzal(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfxz(this, zzghx.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzghu.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghu zzghuVar = (zzghu) zzgrwVar;
        zzgog.zzb(zzghuVar.zza(), 0);
        zzgog.zza(zzghuVar.zzg().zzd());
        if (zzghuVar.zzf().zza() != 12 && zzghuVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
