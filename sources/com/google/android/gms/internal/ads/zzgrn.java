package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrn implements zzgru {
    private final zzgru[] zza;

    zzgrn(zzgru... zzgruVarArr) {
        this.zza = zzgruVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgrt zzb(Class cls) {
        zzgru[] zzgruVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgru zzgruVar = zzgruVarArr[i];
            if (zzgruVar.zzc(cls)) {
                return zzgruVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final boolean zzc(Class cls) {
        zzgru[] zzgruVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgruVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
