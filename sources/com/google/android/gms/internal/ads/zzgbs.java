package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbs implements zzfvw {
    private static final byte[] zza = new byte[0];
    private final zzgkt zzb;
    private final zzgbt zzc;
    private final zzgbp zzd;
    private final zzgbo zze;

    private zzgbs(zzgkt zzgktVar, zzgbt zzgbtVar, zzgbo zzgboVar, zzgbp zzgbpVar, byte[] bArr) {
        this.zzb = zzgktVar;
        this.zzc = zzgbtVar;
        this.zze = zzgboVar;
        this.zzd = zzgbpVar;
    }

    static zzgbs zzb(zzgkt zzgktVar) throws GeneralSecurityException {
        if (zzgktVar.zzh().zzD()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzgkn zzgknVarZzc = zzgktVar.zzc();
        return new zzgbs(zzgktVar, zzgbw.zzb(zzgknVarZzc), zzgbw.zzc(zzgknVarZzc), zzgbw.zza(zzgknVarZzc), null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgkt zzgktVar = this.zzb;
        zzgbt zzgbtVar = this.zzc;
        zzgbo zzgboVar = this.zze;
        zzgbp zzgbpVar = this.zzd;
        zzgbu zzgbuVarZza = zzgbtVar.zza(zzgktVar.zzh().zzE());
        zzgbq zzgbqVarZzc = zzgbq.zzc(zzgbuVarZza.zza(), zzgbuVarZza.zzb(), zzgbtVar, zzgboVar, zzgbpVar, bArr3);
        return zzgmv.zzb(zzgbqVarZzc.zza(), zzgbqVarZzc.zzb(bArr, zza));
    }
}
