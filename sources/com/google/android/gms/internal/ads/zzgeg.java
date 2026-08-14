package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgeg {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgeg(Class cls, Class cls2, zzgef zzgefVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgeg)) {
            return false;
        }
        zzgeg zzgegVar = (zzgeg) obj;
        return zzgegVar.zza.equals(this.zza) && zzgegVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }
}
