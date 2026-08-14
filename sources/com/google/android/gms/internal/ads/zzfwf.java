package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwf {
    private static final Logger zza = Logger.getLogger(zzfwf.class.getName());
    private final ConcurrentMap zzb;

    zzfwf() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzfwe zzg(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfwe) this.zzb.get(str);
    }

    private final synchronized void zzh(zzfwe zzfweVar, boolean z) throws GeneralSecurityException {
        String strZzf = zzfweVar.zzb().zzf();
        zzfwe zzfweVar2 = (zzfwe) this.zzb.get(strZzf);
        if (zzfweVar2 != null && !zzfweVar2.zzc().equals(zzfweVar.zzc())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzf));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzf, zzfweVar2.zzc().getName(), zzfweVar.zzc().getName()));
        }
        if (z) {
            this.zzb.put(strZzf, zzfweVar);
        } else {
            this.zzb.putIfAbsent(strZzf, zzfweVar);
        }
    }

    final zzfvy zza(String str, Class cls) throws GeneralSecurityException {
        zzfwe zzfweVarZzg = zzg(str);
        if (zzfweVarZzg.zze().contains(cls)) {
            return zzfweVarZzg.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzfweVarZzg.zzc());
        Set<Class> setZze = zzfweVarZzg.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setZze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    final zzfvy zzb(String str) throws GeneralSecurityException {
        return zzg(str).zzb();
    }

    final synchronized void zzc(zzgdy zzgdyVar, zzgcu zzgcuVar) throws GeneralSecurityException {
        Class clsZzd;
        if (!zzgas.zza(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgdyVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzgas.zza(zzgcuVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgcuVar.getClass()) + " as it is not FIPS compatible.");
        }
        String strZzd = zzgdyVar.zzd();
        String strZzd2 = zzgcuVar.zzd();
        if (this.zzb.containsKey(strZzd) && ((zzfwe) this.zzb.get(strZzd)).zzd() != null && (clsZzd = ((zzfwe) this.zzb.get(strZzd)).zzd()) != null && !clsZzd.getName().equals(zzgcuVar.getClass().getName())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strZzd + " with inconsistent public key type " + strZzd2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgdyVar.getClass().getName(), clsZzd.getName(), zzgcuVar.getClass().getName()));
        }
        zzh(new zzfwd(zzgdyVar, zzgcuVar), true);
        zzh(new zzfwc(zzgcuVar), false);
    }

    final synchronized void zzd(zzfvy zzfvyVar) throws GeneralSecurityException {
        if (!zzgas.zza(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        zzh(new zzfwb(zzfvyVar), false);
    }

    final synchronized void zze(zzgcu zzgcuVar) throws GeneralSecurityException {
        if (!zzgas.zza(zzgcuVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgcuVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzh(new zzfwc(zzgcuVar), false);
    }

    final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    zzfwf(zzfwf zzfwfVar) {
        this.zzb = new ConcurrentHashMap(zzfwfVar.zzb);
    }
}
