package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfxf {
    private static final Logger zza = Logger.getLogger(zzfxf.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzfwf());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();

    private zzfxf() {
    }

    @Deprecated
    public static zzfvr zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzfvr zzfvrVar = (zzfvr) zze.get(str.toLowerCase(Locale.US));
        if (zzfvrVar != null) {
            return zzfvrVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(strConcat);
    }

    public static zzfvy zzb(String str) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zzb(str);
    }

    public static synchronized zzgky zzc(zzgld zzgldVar) throws GeneralSecurityException {
        zzfvy zzfvyVarZzb;
        zzfvyVarZzb = zzb(zzgldVar.zzg());
        if (!((Boolean) zzd.get(zzgldVar.zzg())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgldVar.zzg())));
        }
        return zzfvyVarZzb.zza(zzgldVar.zzf());
    }

    public static synchronized zzgrw zzd(zzgld zzgldVar) throws GeneralSecurityException {
        zzfvy zzfvyVarZzb;
        zzfvyVarZzb = zzb(zzgldVar.zzg());
        if (!((Boolean) zzd.get(zzgldVar.zzg())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgldVar.zzg())));
        }
        return zzfvyVarZzb.zzb(zzgldVar.zzf());
    }

    @Nullable
    public static Class zze(Class cls) {
        try {
            return zzgde.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    static Object zzf(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzc(zzfvxVar, cls);
    }

    public static Object zzg(zzgky zzgkyVar, Class cls) throws GeneralSecurityException {
        return zzh(zzgkyVar.zzg(), zzgkyVar.zzf(), cls);
    }

    public static Object zzh(String str, zzgpe zzgpeVar, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zzd(zzgpeVar);
    }

    public static Object zzi(String str, zzgrw zzgrwVar, Class cls) throws GeneralSecurityException {
        return ((zzfwf) zzb.get()).zza(str, cls).zze(zzgrwVar);
    }

    public static Object zzj(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzh(str, zzgpe.zzv(bArr), cls);
    }

    public static Object zzk(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        return zzgde.zza().zzd(zzfxbVar, cls);
    }

    static synchronized Map zzl() {
        return Collections.unmodifiableMap(zzf);
    }

    public static synchronized void zzm(zzgdy zzgdyVar, zzgcu zzgcuVar, boolean z) throws GeneralSecurityException {
        AtomicReference atomicReference = zzb;
        zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
        zzfwfVar.zzc(zzgdyVar, zzgcuVar);
        Map mapZzc = zzgdyVar.zza().zzc();
        String strZzd = zzgdyVar.zzd();
        zzq(strZzd, mapZzc, true);
        String strZzd2 = zzgcuVar.zzd();
        zzq(strZzd2, Collections.emptyMap(), false);
        if (!((zzfwf) atomicReference.get()).zzf(strZzd)) {
            zzc.put(strZzd, new zzfxe(zzgdyVar));
            zzr(zzgdyVar.zzd(), zzgdyVar.zza().zzc());
        }
        ConcurrentMap concurrentMap = zzd;
        concurrentMap.put(strZzd, true);
        concurrentMap.put(strZzd2, false);
        atomicReference.set(zzfwfVar);
    }

    public static synchronized void zzo(zzgcu zzgcuVar, boolean z) throws GeneralSecurityException {
        AtomicReference atomicReference = zzb;
        zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
        zzfwfVar.zze(zzgcuVar);
        Map mapZzc = zzgcuVar.zza().zzc();
        String strZzd = zzgcuVar.zzd();
        zzq(strZzd, mapZzc, true);
        if (!((zzfwf) atomicReference.get()).zzf(strZzd)) {
            zzc.put(strZzd, new zzfxe(zzgcuVar));
            zzr(strZzd, zzgcuVar.zza().zzc());
        }
        zzd.put(strZzd, true);
        atomicReference.set(zzfwfVar);
    }

    public static synchronized void zzp(zzfxc zzfxcVar) throws GeneralSecurityException {
        zzgde.zza().zzf(zzfxcVar);
    }

    private static synchronized void zzq(String str, Map map, boolean z) throws GeneralSecurityException {
        if (z) {
            ConcurrentMap concurrentMap = zzd;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((zzfwf) zzb.get()).zzf(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!zzf.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (zzf.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgrw, java.lang.Object] */
    private static void zzr(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzf.put((String) entry.getKey(), zzfwh.zze(str, ((zzgcs) entry.getValue()).zza.zzax(), ((zzgcs) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzn(zzfvy zzfvyVar, boolean z) throws GeneralSecurityException {
        try {
            if (zzfvyVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = zzb;
            zzfwf zzfwfVar = new zzfwf((zzfwf) atomicReference.get());
            zzfwfVar.zzd(zzfvyVar);
            if (!zzgas.zza(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            String strZzf = zzfvyVar.zzf();
            zzq(strZzf, Collections.emptyMap(), z);
            zzd.put(strZzf, Boolean.valueOf(z));
            atomicReference.set(zzfwfVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
