package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgww implements zzgwy {
    private zzgxl zza;

    public static void zza(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        zzgww zzgwwVar = (zzgww) zzgxlVar;
        if (zzgwwVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgwwVar.zza = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final Object zzb() {
        zzgxl zzgxlVar = this.zza;
        if (zzgxlVar != null) {
            return zzgxlVar.zzb();
        }
        throw new IllegalStateException();
    }
}
