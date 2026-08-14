package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgby extends zzgct {
    final /* synthetic */ zzgbz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgby(zzgbz zzgbzVar, Class cls) {
        super(cls);
        this.zza = zzgbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        byte[] bArrZzc;
        zzgkk zzgkkVar = (zzgkk) zzgrwVar;
        int iZzg = zzgkkVar.zze().zzg() - 2;
        if (iZzg == 1) {
            bArrZzb = zzgoh.zzb();
            bArrZzc = zzgoh.zzc(bArrZzb);
        } else {
            if (iZzg != 2 && iZzg != 3 && iZzg != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int iZzg2 = zzgcc.zzg(zzgkkVar.zze().zzg());
            KeyPair keyPairZzb = zzgne.zzb(zzgne.zzh(iZzg2));
            bArrZzc = zzgne.zzi(iZzg2, 1, ((ECPublicKey) keyPairZzb.getPublic()).getW());
            bArrZzb = ((ECPrivateKey) keyPairZzb.getPrivate()).getS().toByteArray();
        }
        zzgks zzgksVarZzd = zzgkt.zzd();
        zzgksVarZzd.zzc(0);
        zzgksVarZzd.zza(zzgkkVar.zze());
        zzgksVarZzd.zzb(zzgpe.zzv(bArrZzc));
        zzgkt zzgktVar = (zzgkt) zzgksVarZzd.zzal();
        zzgkp zzgkpVarZzc = zzgkq.zzc();
        zzgkpVarZzc.zzc(0);
        zzgkpVarZzc.zzb(zzgktVar);
        zzgkpVarZzc.zza(zzgpe.zzv(bArrZzb));
        return (zzgkq) zzgkpVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgkk.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() {
        HashMap map = new HashMap();
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(3, 3, 3, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(3, 3, 3, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(3, 3, 4, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(3, 3, 4, 3));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgbz.zzg(3, 3, 5, 1));
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgbz.zzg(3, 3, 5, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(4, 3, 3, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(4, 3, 3, 3));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(4, 3, 4, 1));
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(4, 3, 4, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzgbz.zzg(5, 4, 3, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzgbz.zzg(5, 4, 3, 3));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzgbz.zzg(5, 4, 4, 1));
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzgbz.zzg(5, 4, 4, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzgbz.zzg(6, 5, 3, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzgbz.zzg(6, 5, 3, 3));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzgbz.zzg(6, 5, 4, 1));
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzgbz.zzg(6, 5, 4, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgcc.zza(((zzgkk) zzgrwVar).zze());
    }
}
