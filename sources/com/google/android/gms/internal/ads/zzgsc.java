package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsc {
    private static final zzgsb zza;
    private static final zzgsb zzb;

    static {
        zzgsb zzgsbVar = null;
        try {
            zzgsbVar = (zzgsb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzgsbVar;
        zzb = new zzgsb();
    }

    static zzgsb zza() {
        return zza;
    }

    static zzgsb zzb() {
        return zzb;
    }
}
