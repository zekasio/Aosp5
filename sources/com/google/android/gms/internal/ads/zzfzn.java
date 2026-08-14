package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzn extends zzfxk {
    private final int zza;
    private final zzfzl zzb;

    /* synthetic */ zzfzn(int i, zzfzl zzfzlVar, zzfzm zzfzmVar) {
        this.zza = i;
        this.zzb = zzfzlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfzn)) {
            return false;
        }
        zzfzn zzfznVar = (zzfzn) obj;
        return zzfznVar.zza == this.zza && zzfznVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfzl zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzfzl.zzc;
    }
}
