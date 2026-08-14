package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;
    private final zzfhk zze;
    private zzfjc zzf;
    private final Object zzg = new Object();

    public zzfjn(Context context, zzfjo zzfjoVar, zzfhp zzfhpVar, zzfhk zzfhkVar) {
        this.zzb = context;
        this.zzc = zzfjoVar;
        this.zzd = zzfhpVar;
        this.zze = zzfhkVar;
    }

    private final synchronized Class zzd(zzfjd zzfjdVar) throws zzfjm {
        String strZzk = zzfjdVar.zza().zzk();
        HashMap map = zza;
        Class cls = (Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfjdVar.zzc())) {
                throw new zzfjm(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzb = zzfjdVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfjdVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfjm(AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfjm(2026, e2);
        }
    }

    public final zzfhs zza() {
        zzfjc zzfjcVar;
        synchronized (this.zzg) {
            zzfjcVar = this.zzf;
        }
        return zzfjcVar;
    }

    public final zzfjd zzb() {
        synchronized (this.zzg) {
            zzfjc zzfjcVar = this.zzf;
            if (zzfjcVar == null) {
                return null;
            }
            return zzfjcVar.zzf();
        }
    }

    public final boolean zzc(zzfjd zzfjdVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfjc zzfjcVar = new zzfjc(zzd(zzfjdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfjdVar.zze(), null, new Bundle(), 2), zzfjdVar, this.zzc, this.zzd);
                if (!zzfjcVar.zzh()) {
                    throw new zzfjm(4000, "init failed");
                }
                int iZze = zzfjcVar.zze();
                if (iZze != 0) {
                    throw new zzfjm(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfjc zzfjcVar2 = this.zzf;
                    if (zzfjcVar2 != null) {
                        try {
                            zzfjcVar2.zzg();
                        } catch (zzfjm e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfjcVar;
                    } else {
                        this.zzf = zzfjcVar;
                    }
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfjm(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfjm e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
