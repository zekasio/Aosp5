package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzh extends zzgct {
    final /* synthetic */ zzfzi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzh(zzfzi zzfziVar, Class cls) {
        super(cls);
        this.zza = zzfziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgii zzgiiVarZzc = zzgij.zzc();
        zzgiiVarZzc.zza(zzgpe.zzv(zzgoe.zza(((zzgim) zzgrwVar).zza())));
        zzgiiVarZzc.zzb(0);
        return (zzgij) zzgiiVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgim.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", zzfzi.zzh(16, 1));
        map.put("AES128_GCM_SIV_RAW", zzfzi.zzh(16, 3));
        map.put("AES256_GCM_SIV", zzfzi.zzh(32, 1));
        map.put("AES256_GCM_SIV_RAW", zzfzi.zzh(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgog.zza(((zzgim) zzgrwVar).zza());
    }
}
