package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjb implements zzjv {
    private final Object zza;
    private zzcn zzb;

    public zzjb(Object obj, zzcn zzcnVar) {
        this.zza = obj;
        this.zzb = zzcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final zzcn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final Object zzb() {
        return this.zza;
    }
}
