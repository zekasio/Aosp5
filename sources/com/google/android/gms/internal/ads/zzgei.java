package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgei {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgei(zzgec zzgecVar, zzgeh zzgehVar) {
        this.zza = new HashMap(zzgecVar.zza);
        this.zzb = new HashMap(zzgecVar.zzb);
        this.zzc = new HashMap(zzgecVar.zzc);
        this.zzd = new HashMap(zzgecVar.zzd);
    }

    public final zzfvx zza(zzgeb zzgebVar, @Nullable zzfxg zzfxgVar) throws GeneralSecurityException {
        zzgee zzgeeVar = new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null);
        if (this.zzb.containsKey(zzgeeVar)) {
            return ((zzgcn) this.zzb.get(zzgeeVar)).zza(zzgebVar, zzfxgVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + zzgeeVar.toString() + " available");
    }

    public final boolean zzf(zzgeb zzgebVar) {
        return this.zzb.containsKey(new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null));
    }
}
