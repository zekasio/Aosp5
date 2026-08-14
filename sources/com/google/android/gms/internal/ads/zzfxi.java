package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxi {
    public static final String zza;
    public static final String zzb;

    @Deprecated
    public static final zzgmh zzc;

    @Deprecated
    public static final zzgmh zzd;

    @Deprecated
    public static final zzgmh zze;

    static {
        new zzfxq();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzfyr();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfzi();
        new zzfya();
        new zzfzy();
        new zzgac();
        new zzfzv();
        new zzgaf();
        zzgmh zzgmhVarZzc = zzgmh.zzc();
        zzc = zzgmhVarZzc;
        zzd = zzgmhVarZzc;
        zze = zzgmhVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxn.zze();
        zzgga.zza();
        zzfxf.zzo(new zzfxq(), true);
        zzfxf.zzo(new zzfyr(), true);
        zzfzb.zza();
        if (zzgat.zzb()) {
            return;
        }
        zzfxf.zzo(new zzfya(), true);
        zzfyk.zza();
        zzfzi.zzg(true);
        zzfxf.zzo(new zzfzv(), true);
        zzfxf.zzo(new zzfzy(), true);
        zzfxf.zzo(new zzgac(), true);
        zzfxf.zzo(new zzgaf(), true);
    }
}
