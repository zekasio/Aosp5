package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgdz implements zzgeb {
    private final String zza;
    private final zzgoj zzb;
    private final zzgpe zzc;
    private final zzgkx zzd;
    private final zzgme zze;

    @Nullable
    private final Integer zzf;

    private zzgdz(String str, zzgpe zzgpeVar, zzgkx zzgkxVar, zzgme zzgmeVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgek.zzb(str);
        this.zzc = zzgpeVar;
        this.zzd = zzgkxVar;
        this.zze = zzgmeVar;
        this.zzf = num;
    }

    public static zzgdz zza(String str, zzgpe zzgpeVar, zzgkx zzgkxVar, zzgme zzgmeVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgmeVar == zzgme.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgdz(str, zzgpeVar, zzgkxVar, zzgmeVar, num);
    }

    public final zzgkx zzb() {
        return this.zzd;
    }

    public final zzgme zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final zzgoj zzd() {
        return this.zzb;
    }

    public final zzgpe zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
