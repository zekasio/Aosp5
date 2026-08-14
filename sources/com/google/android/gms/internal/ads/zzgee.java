package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgee {
    private final Class zza;
    private final zzgoj zzb;

    /* synthetic */ zzgee(Class cls, zzgoj zzgojVar, zzged zzgedVar) {
        this.zza = cls;
        this.zzb = zzgojVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgee)) {
            return false;
        }
        zzgee zzgeeVar = (zzgee) obj;
        return zzgeeVar.zza.equals(this.zza) && zzgeeVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }
}
