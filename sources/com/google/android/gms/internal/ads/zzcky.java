package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcky implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcky(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        zzbmu zzbmuVar = new zzbmu();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbcm.zza.zze()).booleanValue() ? new zzbmt(zzbmuVar, str) : new zzbzf(str);
    }
}
