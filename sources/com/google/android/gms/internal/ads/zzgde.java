package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgde {
    private static final zzgde zza = new zzgde();
    private final AtomicReference zzb = new AtomicReference(new zzgdx(new zzgdt(), null));

    zzgde() {
    }

    public static zzgde zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zzb(zzfvxVar, cls);
    }

    public final Object zzd(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        return ((zzgdx) this.zzb.get()).zzc(zzfxbVar, cls);
    }

    public final synchronized void zze(zzgdr zzgdrVar) throws GeneralSecurityException {
        zzgdt zzgdtVar = new zzgdt((zzgdx) this.zzb.get());
        zzgdtVar.zza(zzgdrVar);
        this.zzb.set(new zzgdx(zzgdtVar, null));
    }

    public final synchronized void zzf(zzfxc zzfxcVar) throws GeneralSecurityException {
        zzgdt zzgdtVar = new zzgdt((zzgdx) this.zzb.get());
        zzgdtVar.zzb(zzfxcVar);
        this.zzb.set(new zzgdx(zzgdtVar, null));
    }
}
