package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwz implements zzgwy, zzgws {
    private static final zzgwz zza = new zzgwz(null);
    private final Object zzb;

    private zzgwz(Object obj) {
        this.zzb = obj;
    }

    public static zzgwy zza(Object obj) {
        zzgxg.zza(obj, "instance cannot be null");
        return new zzgwz(obj);
    }

    public static zzgwy zzc(Object obj) {
        return obj == null ? zza : new zzgwz(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final Object zzb() {
        return this.zzb;
    }
}
