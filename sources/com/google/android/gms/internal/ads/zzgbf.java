package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbf {

    @Deprecated
    public static final zzgmh zza;

    @Deprecated
    public static final zzgmh zzb;

    @Deprecated
    public static final zzgmh zzc;

    static {
        new zzgbe();
        new zzgbc();
        zza = zzgmh.zzc();
        zzb = zzgmh.zzc();
        zzc = zzgmh.zzc();
        try {
            zzgbh.zzd();
            zzgbj.zzd();
            zzfxi.zza();
            if (zzgat.zzb()) {
                return;
            }
            zzfxf.zzm(new zzgbc(), new zzgbe(), true);
            zzfxf.zzm(new zzgbz(), new zzgcb(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
