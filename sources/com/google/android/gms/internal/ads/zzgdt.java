package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdt {
    private final Map zza;
    private final Map zzb;

    public zzgdt() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgdt zza(zzgdr zzgdrVar) throws GeneralSecurityException {
        zzgdv zzgdvVar = new zzgdv(zzgdrVar.zzc(), zzgdrVar.zzd(), null);
        if (this.zza.containsKey(zzgdvVar)) {
            zzgdr zzgdrVar2 = (zzgdr) this.zza.get(zzgdvVar);
            if (!zzgdrVar2.equals(zzgdrVar) || !zzgdrVar.equals(zzgdrVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgdvVar.toString()));
            }
        } else {
            this.zza.put(zzgdvVar, zzgdrVar);
        }
        return this;
    }

    public final zzgdt zzb(zzfxc zzfxcVar) throws GeneralSecurityException {
        if (zzfxcVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Map map = this.zzb;
        Class clsZzb = zzfxcVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzfxc zzfxcVar2 = (zzfxc) this.zzb.get(clsZzb);
            if (!zzfxcVar2.equals(zzfxcVar) || !zzfxcVar.equals(zzfxcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzfxcVar);
        }
        return this;
    }

    public zzgdt(zzgdx zzgdxVar) {
        this.zza = new HashMap(zzgdxVar.zza);
        this.zzb = new HashMap(zzgdxVar.zzb);
    }
}
