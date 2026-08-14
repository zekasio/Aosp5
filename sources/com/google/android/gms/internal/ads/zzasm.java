package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzasm implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaqx zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzamv zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzasm(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        this.zzb = zzaqxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzamvVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzapr zzaprVarZzd = this.zzb.zzd();
            if (zzaprVarZzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
                zzaprVarZzd.zzc(this.zzh, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }
}
