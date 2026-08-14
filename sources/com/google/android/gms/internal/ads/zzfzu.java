package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzu extends zzgct {
    final /* synthetic */ zzfzv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzu(zzfzv zzfzvVar, Class cls) {
        super(cls);
        this.zza = zzfzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgiu zzgiuVarZzc = zzgiv.zzc();
        zzgiuVarZzc.zzb(0);
        zzgiuVarZzc.zza(zzgpe.zzv(zzgoe.zza(32)));
        return (zzgiv) zzgiuVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgiy.zzd(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", new zzgcs(zzgiy.zzc(), 1));
        map.put("CHACHA20_POLY1305_RAW", new zzgcs(zzgiy.zzc(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
    }
}
