package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgch {
    private final zzfvo zza;
    private final zzfvu zzb;

    public zzgch(zzfvo zzfvoVar) {
        this.zza = zzfvoVar;
        this.zzb = null;
    }

    public zzgch(zzfvu zzfvuVar) {
        this.zza = null;
        this.zzb = zzfvuVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfvo zzfvoVar = this.zza;
        return zzfvoVar != null ? zzfvoVar.zzb(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
