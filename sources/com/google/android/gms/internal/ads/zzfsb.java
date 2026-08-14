package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfsb extends zzfrs implements Serializable {
    final zzfrs zza;

    zzfsb(zzfrs zzfrsVar) {
        this.zza = zzfrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsb) {
            return this.zza.equals(((zzfsb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        zzfrs zzfrsVar = this.zza;
        Objects.toString(zzfrsVar);
        return zzfrsVar.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final zzfrs zza() {
        return this.zza;
    }
}
