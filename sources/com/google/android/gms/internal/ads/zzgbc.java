package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbc extends zzgdy {
    private static final byte[] zza = new byte[0];

    zzgbc() {
        super(zzgjm.class, zzgjp.class, new zzgba(zzfvv.class));
    }

    static /* bridge */ /* synthetic */ zzgcs zzh(int i, int i2, int i3, zzfwh zzfwhVar, byte[] bArr, int i4) {
        zzgjf zzgjfVarZza = zzgjg.zza();
        zzgjr zzgjrVarZza = zzgjs.zza();
        zzgjrVarZza.zzb(4);
        zzgjrVarZza.zzc(5);
        zzgjrVarZza.zza(zzgpe.zzv(bArr));
        zzgjs zzgjsVar = (zzgjs) zzgjrVarZza.zzal();
        zzglc zzglcVarZza = zzgld.zza();
        zzglcVarZza.zzb(zzfwhVar.zzb());
        zzglcVarZza.zzc(zzgpe.zzv(zzfwhVar.zzc()));
        int iZzd = zzfwhVar.zzd() - 1;
        zzglcVarZza.zza(iZzd != 0 ? iZzd != 1 ? iZzd != 2 ? zzgme.CRUNCHY : zzgme.RAW : zzgme.LEGACY : zzgme.TINK);
        zzgld zzgldVar = (zzgld) zzglcVarZza.zzal();
        zzgjc zzgjcVarZza = zzgjd.zza();
        zzgjcVarZza.zza(zzgldVar);
        zzgjd zzgjdVar = (zzgjd) zzgjcVarZza.zzal();
        zzgji zzgjiVarZzc = zzgjj.zzc();
        zzgjiVarZzc.zzb(zzgjsVar);
        zzgjiVarZzc.zza(zzgjdVar);
        zzgjiVarZzc.zzc(i3);
        zzgjfVarZza.zza((zzgjj) zzgjiVarZzc.zzal());
        return new zzgcs((zzgjg) zzgjfVarZza.zzal(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgbb(this, zzgjg.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgjm.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjm zzgjmVar = (zzgjm) zzgrwVar;
        if (zzgjmVar.zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgog.zzb(zzgjmVar.zza(), 0);
        zzgbk.zza(zzgjmVar.zzf().zzc());
    }
}
