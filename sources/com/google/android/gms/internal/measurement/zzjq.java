package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjq {
    private final Object zza;
    private final int zzb;

    zzjq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return this.zza == zzjqVar.zza && this.zzb == zzjqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
