package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzli {
    private static final zzlh zza;
    private static final zzlh zzb;

    static {
        zzlh zzlhVar = null;
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzlhVar;
        zzb = new zzlh();
    }

    static zzlh zza() {
        return zza;
    }

    static zzlh zzb() {
        return zzb;
    }
}
