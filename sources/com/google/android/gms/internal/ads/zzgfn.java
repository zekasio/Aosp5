package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgfn extends zzgct {
    final /* synthetic */ zzgfo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgfn(zzgfo zzgfoVar, Class cls) {
        super(cls);
        this.zza = zzgfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgkc zzgkcVar = (zzgkc) zzgrwVar;
        zzgjy zzgjyVarZzc = zzgjz.zzc();
        zzgjyVarZzc.zzc(0);
        zzgjyVarZzc.zzb(zzgkcVar.zzg());
        zzgjyVarZzc.zza(zzgpe.zzv(zzgoe.zza(zzgkcVar.zza())));
        return (zzgjz) zzgjyVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgkc.zzf(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzgfo.zzn(32, 16, 5, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgfo.zzn(32, 16, 5, 3));
        map.put("HMAC_SHA256_256BITTAG", zzgfo.zzn(32, 32, 5, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgfo.zzn(32, 32, 5, 3));
        map.put("HMAC_SHA512_128BITTAG", zzgfo.zzn(64, 16, 6, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgfo.zzn(64, 16, 6, 3));
        map.put("HMAC_SHA512_256BITTAG", zzgfo.zzn(64, 32, 6, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgfo.zzn(64, 32, 6, 3));
        map.put("HMAC_SHA512_512BITTAG", zzgfo.zzn(64, 64, 6, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgfo.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgkc zzgkcVar = (zzgkc) zzgrwVar;
        if (zzgkcVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgfo.zzo(zzgkcVar.zzg());
    }
}
