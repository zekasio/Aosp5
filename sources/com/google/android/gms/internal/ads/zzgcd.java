package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcd implements zzgbt {
    private final zzgbo zza;
    private final int zzb;

    private zzgcd(zzgbo zzgboVar, int i) {
        this.zza = zzgboVar;
        this.zzb = i;
    }

    static zzgcd zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new zzgcd(new zzgbo("HmacSha512"), 3) : new zzgcd(new zzgbo("HmacSha384"), 2) : new zzgcd(new zzgbo("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair keyPairZzb = zzgne.zzb(zzgne.zzh(this.zzb));
        byte[] bArrZze = zzgne.zze((ECPrivateKey) keyPairZzb.getPrivate(), zzgne.zzg(zzgne.zzh(this.zzb), 1, bArr));
        byte[] bArrZzi = zzgne.zzi(this.zzb, 1, ((ECPublicKey) keyPairZzb.getPublic()).getW());
        byte[] bArrZzb = zzgmv.zzb(bArrZzi, bArr);
        byte[] bArrZzd = zzgcc.zzd(zzb());
        zzgbo zzgboVar = this.zza;
        return new zzgbu(zzgboVar.zzb(null, bArrZze, "eae_prk", bArrZzb, "shared_secret", bArrZzd, zzgboVar.zza()), bArrZzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        return i != 0 ? i != 1 ? zzgcc.zze : zzgcc.zzd : zzgcc.zzc;
    }
}
