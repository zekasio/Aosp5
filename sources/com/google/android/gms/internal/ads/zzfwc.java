package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwc implements zzfwe {
    final /* synthetic */ zzgcu zza;

    zzfwc(zzgcu zzgcuVar) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwa(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zzb() {
        zzgcu zzgcuVar = this.zza;
        return new zzfwa(zzgcuVar, zzgcuVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Set zze() {
        return this.zza.zzl();
    }
}
