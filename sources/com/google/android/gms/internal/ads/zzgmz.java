package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgmz implements zzfvv {
    private final ECPrivateKey zza;
    private final zzgnb zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzgmy zze;

    public zzgmz(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzgmy zzgmyVar) throws GeneralSecurityException {
        this.zza = eCPrivateKey;
        this.zzb = new zzgnb(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzgmyVar;
    }
}
