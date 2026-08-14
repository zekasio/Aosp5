package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfu extends zzggc {
    private final int zza;
    private final int zzb;
    private final zzgfs zzc;
    private final zzgfr zzd;

    /* synthetic */ zzgfu(int i, int i2, zzgfs zzgfsVar, zzgfr zzgfrVar, zzgft zzgftVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgfsVar;
        this.zzd = zzgfrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfuVar = (zzgfu) obj;
        return zzgfuVar.zza == this.zza && zzgfuVar.zzb() == zzb() && zzgfuVar.zzc == this.zzc && zzgfuVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgfs zzgfsVar = this.zzc;
        if (zzgfsVar == zzgfs.zzd) {
            return this.zzb;
        }
        if (zzgfsVar == zzgfs.zza || zzgfsVar == zzgfs.zzb || zzgfsVar == zzgfs.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgfs zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgfs.zzd;
    }
}
