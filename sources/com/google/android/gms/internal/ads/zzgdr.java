package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgdr {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgdr(Class cls, Class cls2, zzgdq zzgdqVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgdr zzb(zzgdp zzgdpVar, Class cls, Class cls2) {
        return new zzgdo(cls, cls2, zzgdpVar);
    }

    public abstract Object zza(zzfvx zzfvxVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
