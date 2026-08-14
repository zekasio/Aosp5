package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbb extends zzgct {
    final /* synthetic */ zzgbc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbb(zzgbc zzgbcVar, Class cls) {
        super(cls);
        this.zza = zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjg zzgjgVar = (zzgjg) zzgrwVar;
        KeyPair keyPairZzb = zzgne.zzb(zzgne.zzh(zzgbk.zzc(zzgjgVar.zze().zzf().zzg())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzb.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzb.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzgjo zzgjoVarZzd = zzgjp.zzd();
        zzgjoVarZzd.zzb(0);
        zzgjoVarZzd.zza(zzgjgVar.zze());
        zzgjoVarZzd.zzc(zzgpe.zzv(w.getAffineX().toByteArray()));
        zzgjoVarZzd.zzd(zzgpe.zzv(w.getAffineY().toByteArray()));
        zzgjp zzgjpVar = (zzgjp) zzgjoVarZzd.zzal();
        zzgjl zzgjlVarZzc = zzgjm.zzc();
        zzgjlVarZzc.zzc(0);
        zzgjlVarZzc.zzb(zzgjpVar);
        zzgjlVarZzc.zza(zzgpe.zzv(eCPrivateKey.getS().toByteArray()));
        return (zzgjm) zzgjlVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgjg.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_GCM"), zzgbc.zza, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 1));
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 3));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 1));
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgbk.zza(((zzgjg) zzgrwVar).zze());
    }
}
