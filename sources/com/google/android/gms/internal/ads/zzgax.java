package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgax {
    public static final String zza;

    @Deprecated
    public static final zzgmh zzb;

    @Deprecated
    public static final zzgmh zzc;

    static {
        new zzgaw();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzgmh.zzc();
        zzc = zzgmh.zzc();
        try {
            zzgaz.zzd();
            if (zzgat.zzb()) {
                return;
            }
            zzfxf.zzo(new zzgaw(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
