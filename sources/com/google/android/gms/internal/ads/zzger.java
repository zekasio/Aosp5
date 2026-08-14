package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzger extends zzgct {
    zzger(zzges zzgesVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzggz zzggzVar = (zzggz) zzgrwVar;
        zzggv zzggvVarZzc = zzggw.zzc();
        zzggvVarZzc.zzc(0);
        zzggvVarZzc.zza(zzgpe.zzv(zzgoe.zza(zzggzVar.zza())));
        zzggvVarZzc.zzb(zzggzVar.zzf());
        return (zzggw) zzggvVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzggz.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzggy zzggyVarZzc = zzggz.zzc();
        zzggyVarZzc.zza(32);
        zzghb zzghbVarZzc = zzghc.zzc();
        zzghbVarZzc.zza(16);
        zzggyVarZzc.zzb((zzghc) zzghbVarZzc.zzal());
        map.put("AES_CMAC", new zzgcs((zzggz) zzggyVarZzc.zzal(), 1));
        zzggy zzggyVarZzc2 = zzggz.zzc();
        zzggyVarZzc2.zza(32);
        zzghb zzghbVarZzc2 = zzghc.zzc();
        zzghbVarZzc2.zza(16);
        zzggyVarZzc2.zzb((zzghc) zzghbVarZzc2.zzal());
        map.put("AES256_CMAC", new zzgcs((zzggz) zzggyVarZzc2.zzal(), 1));
        zzggy zzggyVarZzc3 = zzggz.zzc();
        zzggyVarZzc3.zza(32);
        zzghb zzghbVarZzc3 = zzghc.zzc();
        zzghbVarZzc3.zza(16);
        zzggyVarZzc3.zzb((zzghc) zzghbVarZzc3.zzal());
        map.put("AES256_CMAC_RAW", new zzgcs((zzggz) zzggyVarZzc3.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzggz zzggzVar = (zzggz) zzgrwVar;
        zzges.zzn(zzggzVar.zzf());
        zzges.zzo(zzggzVar.zza());
    }
}
