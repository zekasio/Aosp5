package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggi implements zzgfd {
    private final zzgfk zza;

    public zzggi(zzgfk zzgfkVar) throws GeneralSecurityException {
        if (!zzgas.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgfkVar;
    }
}
