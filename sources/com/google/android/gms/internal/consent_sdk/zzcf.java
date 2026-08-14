package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcf<T> implements zzch<T> {
    private zzcl<T> zza;

    public static <T> void zza(zzcl<T> zzclVar, zzcl<T> zzclVar2) {
        zzcf zzcfVar = (zzcf) zzclVar;
        if (zzcfVar.zza != null) {
            throw new IllegalStateException();
        }
        zzcfVar.zza = zzclVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final T zzb() {
        zzcl<T> zzclVar = this.zza;
        if (zzclVar != null) {
            return zzclVar.zzb();
        }
        throw new IllegalStateException();
    }
}
