package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgcn {
    private final zzgoj zza;
    private final Class zzb;

    /* synthetic */ zzgcn(zzgoj zzgojVar, Class cls, zzgcm zzgcmVar) {
        this.zza = zzgojVar;
        this.zzb = cls;
    }

    public static zzgcn zzb(zzgcl zzgclVar, zzgoj zzgojVar, Class cls) {
        return new zzgck(zzgojVar, cls, zzgclVar);
    }

    public abstract zzfvx zza(zzgeb zzgebVar, @Nullable zzfxg zzfxgVar) throws GeneralSecurityException;

    public final zzgoj zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
