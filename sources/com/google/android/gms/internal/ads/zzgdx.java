package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdx {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgdx(zzgdt zzgdtVar, zzgdw zzgdwVar) {
        this.zza = new HashMap(zzgdtVar.zza);
        this.zzb = new HashMap(zzgdtVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzfxc) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object zzb(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        zzgdv zzgdvVar = new zzgdv(zzfvxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgdvVar)) {
            return ((zzgdr) this.zza.get(zzgdvVar)).zza(zzfvxVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + zzgdvVar.toString() + " available");
    }

    public final Object zzc(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzfxc zzfxcVar = (zzfxc) this.zzb.get(cls);
        if (zzfxbVar.zzc().equals(zzfxcVar.zza()) && zzfxcVar.zza().equals(zzfxbVar.zzc())) {
            return zzfxcVar.zzc(zzfxbVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
