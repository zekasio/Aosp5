package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqb {
    private static final zzgpz zza = new zzgqa();
    private static final zzgpz zzb;

    static {
        zzgpz zzgpzVar = null;
        try {
            zzgpzVar = (zzgpz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzgpzVar;
    }

    static zzgpz zza() {
        zzgpz zzgpzVar = zzb;
        if (zzgpzVar != null) {
            return zzgpzVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgpz zzb() {
        return zza;
    }
}
