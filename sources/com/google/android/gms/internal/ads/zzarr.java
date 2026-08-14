package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarr implements Callable {
    private final zzaqx zza;
    private final zzamv zzb;

    public zzarr(zzaqx zzaqxVar, zzamv zzamvVar) {
        this.zza = zzaqxVar;
        this.zzb = zzamvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzans zzansVarZzc = this.zza.zzc();
        if (zzansVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzamv zzamvVar = this.zzb;
                byte[] bArrZzax = zzansVarZzc.zzax();
                zzamvVar.zzak(bArrZzax, 0, bArrZzax.length, zzgpy.zza());
            }
            return null;
        } catch (zzgqy | NullPointerException unused) {
            return null;
        }
    }
}
