package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxz extends zzgct {
    final /* synthetic */ zzfya zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfxz(zzfya zzfyaVar, Class cls) {
        super(cls);
        this.zza = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghx zzghxVar = (zzghx) zzgrwVar;
        zzght zzghtVarZzc = zzghu.zzc();
        zzghtVarZzc.zza(zzgpe.zzv(zzgoe.zza(zzghxVar.zza())));
        zzghtVarZzc.zzb(zzghxVar.zzf());
        zzghtVarZzc.zzc(0);
        return (zzghu) zzghtVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzghx.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzfya.zzg(16, 16, 1));
        map.put("AES128_EAX_RAW", zzfya.zzg(16, 16, 3));
        map.put("AES256_EAX", zzfya.zzg(32, 16, 1));
        map.put("AES256_EAX_RAW", zzfya.zzg(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzghx zzghxVar = (zzghx) zzgrwVar;
        zzgog.zza(zzghxVar.zza());
        if (zzghxVar.zzf().zza() != 12 && zzghxVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
