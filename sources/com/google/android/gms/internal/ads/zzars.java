package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzars extends zzasm {
    private final zzaqy zzi;

    public zzars(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, zzaqy zzaqyVar) {
        super(zzaqxVar, "WiBvNElQIWLcD1MAWzkQBcjrDQoEuYCN1R/XT/Sg3LhVQ2iulZRZfofRQLig8S+e", "bmivrcLZaHzijOhh62Orf3BoYYHHdZV06MDdRRTWkIM=", zzamvVar, i, 85);
        this.zzi = zzaqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zzf.invoke(null, Long.valueOf(this.zzi.zzd()), Long.valueOf(this.zzi.zzh()), Long.valueOf(this.zzi.zzb()), Long.valueOf(this.zzi.zzf()));
        synchronized (this.zze) {
            this.zze.zzv(jArr[0]);
            this.zze.zzu(jArr[1]);
        }
    }
}
