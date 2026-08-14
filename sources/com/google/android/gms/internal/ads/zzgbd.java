package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbd extends zzgds {
    zzgbd(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjp zzgjpVar = (zzgjp) zzgrwVar;
        zzgjj zzgjjVarZzc = zzgjpVar.zzc();
        zzgjs zzgjsVarZzf = zzgjjVarZzc.zzf();
        int iZzc = zzgbk.zzc(zzgjsVarZzf.zzg());
        byte[] bArrZzE = zzgjpVar.zzh().zzE();
        byte[] bArrZzE2 = zzgjpVar.zzi().zzE();
        ECParameterSpec eCParameterSpecZzh = zzgne.zzh(iZzc);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrZzE), new BigInteger(1, bArrZzE2));
        zzgcj.zzb(eCPoint, eCParameterSpecZzh.getCurve());
        return new zzgna((ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecZzh)), zzgjsVarZzf.zze().zzE(), zzgbk.zzb(zzgjsVarZzf.zzh()), zzgbk.zzd(zzgjjVarZzc.zzi()), new zzgbl(zzgjjVarZzc.zza().zze()));
    }
}
