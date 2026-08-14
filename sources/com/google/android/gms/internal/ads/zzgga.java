package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgga {

    @Deprecated
    public static final zzgmh zza;

    @Deprecated
    public static final zzgmh zzb;

    @Deprecated
    public static final zzgmh zzc;

    static {
        new zzgfo();
        zzgmh zzgmhVarZzc = zzgmh.zzc();
        zza = zzgmhVarZzc;
        zzb = zzgmhVarZzc;
        zzc = zzgmhVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzggf.zze();
        zzgfg.zzd();
        zzgfo.zzh(true);
        if (zzgat.zzb()) {
            return;
        }
        zzges.zzm(true);
    }
}
