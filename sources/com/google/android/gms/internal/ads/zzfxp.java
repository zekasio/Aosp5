package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxp extends zzgct {
    final /* synthetic */ zzfxq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfxp(zzfxq zzfxqVar, Class cls) {
        super(cls);
        this.zza = zzfxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghi zzghiVar = (zzghi) zzgrwVar;
        new zzfxt();
        zzghl zzghlVarZzf = zzfxs.zzf(zzghiVar.zze());
        zzgrw zzgrwVarZza = new zzgfo().zza().zza(zzghiVar.zzf());
        zzghe zzgheVarZzc = zzghf.zzc();
        zzgheVarZzc.zza(zzghlVarZzf);
        zzgheVarZzc.zzb((zzgjz) zzgrwVarZza);
        zzgheVarZzc.zzc(0);
        return (zzghf) zzgheVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzghi.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzfxq.zzg(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzfxq.zzg(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", zzfxq.zzg(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzfxq.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghi zzghiVar = (zzghi) zzgrwVar;
        ((zzfxs) new zzfxt().zza()).zzd(zzghiVar.zze());
        new zzgfo().zza().zzd(zzghiVar.zzf());
        zzgog.zza(zzghiVar.zze().zza());
    }
}
