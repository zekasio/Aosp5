package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfwh {
    private final zzgld zza;

    private zzfwh(zzgld zzgldVar) {
        this.zza = zzgldVar;
    }

    public static zzfwh zze(String str, byte[] bArr, int i) {
        zzglc zzglcVarZza = zzgld.zza();
        zzglcVarZza.zzb(str);
        zzglcVarZza.zzc(zzgpe.zzv(bArr));
        int i2 = i - 1;
        zzglcVarZza.zza(i2 != 0 ? i2 != 1 ? zzgme.RAW : zzgme.LEGACY : zzgme.TINK);
        return new zzfwh((zzgld) zzglcVarZza.zzal());
    }

    final zzgld zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzg();
    }

    public final byte[] zzc() {
        return this.zza.zzf().zzE();
    }

    public final int zzd() {
        zzgme zzgmeVarZze = this.zza.zze();
        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
        int iOrdinal = zzgmeVarZze.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
