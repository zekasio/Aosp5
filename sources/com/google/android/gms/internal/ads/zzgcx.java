package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcx extends zzfwu {
    private final zzgea zza;

    public zzgcx(zzgea zzgeaVar) {
        this.zza = zzgeaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcx)) {
            return false;
        }
        zzgea zzgeaVar = ((zzgcx) obj).zza;
        return this.zza.zzb().zze().equals(zzgeaVar.zzb().zze()) && this.zza.zzb().zzg().equals(zzgeaVar.zzb().zzg()) && this.zza.zzb().zzf().equals(zzgeaVar.zzb().zzf());
    }

    public final int hashCode() {
        zzgea zzgeaVar = this.zza;
        return Arrays.hashCode(new Object[]{zzgeaVar.zzb(), zzgeaVar.zzd()});
    }

    public final String toString() {
        String strZzg = this.zza.zzb().zzg();
        zzgme zzgmeVarZze = this.zza.zzb().zze();
        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
        int iOrdinal = zzgmeVarZze.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzg, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    public final zzgea zza() {
        return this.zza;
    }
}
