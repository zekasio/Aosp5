package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgec {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgec() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgec zza(zzgcn zzgcnVar) throws GeneralSecurityException {
        zzgee zzgeeVar = new zzgee(zzgcnVar.zzd(), zzgcnVar.zzc(), null);
        if (this.zzb.containsKey(zzgeeVar)) {
            zzgcn zzgcnVar2 = (zzgcn) this.zzb.get(zzgeeVar);
            if (!zzgcnVar2.equals(zzgcnVar) || !zzgcnVar.equals(zzgcnVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgeeVar.toString()));
            }
        } else {
            this.zzb.put(zzgeeVar, zzgcnVar);
        }
        return this;
    }

    public final zzgec zzb(zzgcr zzgcrVar) throws GeneralSecurityException {
        zzgeg zzgegVar = new zzgeg(zzgcrVar.zzb(), zzgcrVar.zzc(), null);
        if (this.zza.containsKey(zzgegVar)) {
            zzgcr zzgcrVar2 = (zzgcr) this.zza.get(zzgegVar);
            if (!zzgcrVar2.equals(zzgcrVar) || !zzgcrVar.equals(zzgcrVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgegVar.toString()));
            }
        } else {
            this.zza.put(zzgegVar, zzgcrVar);
        }
        return this;
    }

    public final zzgec zzc(zzgdj zzgdjVar) throws GeneralSecurityException {
        zzgee zzgeeVar = new zzgee(zzgdjVar.zzc(), zzgdjVar.zzb(), null);
        if (this.zzd.containsKey(zzgeeVar)) {
            zzgdj zzgdjVar2 = (zzgdj) this.zzd.get(zzgeeVar);
            if (!zzgdjVar2.equals(zzgdjVar) || !zzgdjVar.equals(zzgdjVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgeeVar.toString()));
            }
        } else {
            this.zzd.put(zzgeeVar, zzgdjVar);
        }
        return this;
    }

    public final zzgec zzd(zzgdn zzgdnVar) throws GeneralSecurityException {
        zzgeg zzgegVar = new zzgeg(zzgdnVar.zzb(), zzgdnVar.zzc(), null);
        if (this.zzc.containsKey(zzgegVar)) {
            zzgdn zzgdnVar2 = (zzgdn) this.zzc.get(zzgegVar);
            if (!zzgdnVar2.equals(zzgdnVar) || !zzgdnVar.equals(zzgdnVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgegVar.toString()));
            }
        } else {
            this.zzc.put(zzgegVar, zzgdnVar);
        }
        return this;
    }

    public zzgec(zzgei zzgeiVar) {
        this.zza = new HashMap(zzgeiVar.zza);
        this.zzb = new HashMap(zzgeiVar.zzb);
        this.zzc = new HashMap(zzgeiVar.zzc);
        this.zzd = new HashMap(zzgeiVar.zzd);
    }
}
