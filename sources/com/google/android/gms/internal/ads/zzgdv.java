package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdv {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgdv(Class cls, Class cls2, zzgdu zzgduVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdv)) {
            return false;
        }
        zzgdv zzgdvVar = (zzgdv) obj;
        return zzgdvVar.zza.equals(this.zza) && zzgdvVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }
}
