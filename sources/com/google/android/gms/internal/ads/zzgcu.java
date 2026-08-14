package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgcu {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgcu(Class cls, zzgds... zzgdsVarArr) {
        this.zza = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgds zzgdsVar = zzgdsVarArr[i];
            if (map.containsKey(zzgdsVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgdsVar.zzb().getCanonicalName())));
            }
            map.put(zzgdsVar.zzb(), zzgdsVar);
        }
        this.zzc = zzgdsVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(map);
    }

    public zzgct zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgkx zzb();

    public abstract zzgrw zzc(zzgpe zzgpeVar) throws zzgqy;

    public abstract String zzd();

    public abstract void zze(zzgrw zzgrwVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgrw zzgrwVar, Class cls) throws GeneralSecurityException {
        zzgds zzgdsVar = (zzgds) this.zzb.get(cls);
        if (zzgdsVar != null) {
            return zzgdsVar.zza(zzgrwVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
