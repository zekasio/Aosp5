package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgav extends zzgct {
    final /* synthetic */ zzgaw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgav(zzgaw zzgawVar, Class cls) {
        super(cls);
        this.zza = zzgawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgio zzgioVarZzc = zzgip.zzc();
        zzgioVarZzc.zza(zzgpe.zzv(zzgoe.zza(((zzgis) zzgrwVar).zza())));
        zzgioVarZzc.zzb(0);
        return (zzgip) zzgioVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgis.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzgir zzgirVarZzc = zzgis.zzc();
        zzgirVarZzc.zza(64);
        map.put("AES256_SIV", new zzgcs((zzgis) zzgirVarZzc.zzal(), 1));
        zzgir zzgirVarZzc2 = zzgis.zzc();
        zzgirVarZzc2.zza(64);
        map.put("AES256_SIV_RAW", new zzgcs((zzgis) zzgirVarZzc2.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgis zzgisVar = (zzgis) zzgrwVar;
        if (zzgisVar.zza() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzgisVar.zza() + ". Valid keys must have 64 bytes.");
    }
}
