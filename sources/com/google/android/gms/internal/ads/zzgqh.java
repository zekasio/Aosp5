package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqh implements zzgru {
    private static final zzgqh zza = new zzgqh();

    private zzgqh() {
    }

    public static zzgqh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgrt zzb(Class cls) {
        if (!zzgqm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzgrt) zzgqm.zzaC(cls.asSubclass(zzgqm.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final boolean zzc(Class cls) {
        return zzgqm.class.isAssignableFrom(cls);
    }
}
