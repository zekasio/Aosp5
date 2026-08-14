package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasd extends zzasm {
    private final boolean zzi;

    public zzasd(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "H7DVVU5G/CyEmqoRDTRZzFOOZo/1i5OeCGYpAtE5NN4V5QTkqzRkQ5oAGN3vcrtV", "z+xFAlC1JJ/Cxy2NWKsDbM4NUy8C7neyeQZVK5Q+YiU=", zzamvVar, i, 61);
        this.zzi = zzaqxVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzE(jLongValue);
        }
    }
}
