package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwb implements zzfwe {
    final /* synthetic */ zzfvy zza;

    zzfwb(zzfvy zzfvyVar) {
        this.zza = zzfvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zza(Class cls) throws GeneralSecurityException {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zzb() {
        return this.zza;
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
        return Collections.singleton(this.zza.zzc());
    }
}
