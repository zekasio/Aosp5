package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrs {
    private static final zzgrr zza;
    private static final zzgrr zzb;

    static {
        zzgrr zzgrrVar = null;
        try {
            zzgrrVar = (zzgrr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzgrrVar;
        zzb = new zzgrr();
    }

    static zzgrr zza() {
        return zza;
    }

    static zzgrr zzb() {
        return zzb;
    }
}
