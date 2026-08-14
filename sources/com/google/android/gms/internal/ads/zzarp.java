package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarp extends zzasm {
    private final long zzi;

    public zzarp(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, long j, int i, int i2) {
        super(zzaqxVar, "xTgGP9w4lMQ/WjLtAFn2v1JjPdma/PcJXQX8pyq+xajYX2HDrjKBZ5k/anX+M/Bo", "vRn7geI+WCeFJoZ7qQQ1ZFwlsU3+f9F9Kf66GT9NZts=", zzamvVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zzf.invoke(null, null)).longValue();
        synchronized (this.zze) {
            this.zze.zzt(jLongValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzT(jLongValue - j);
                this.zze.zzU(this.zzi);
            }
        }
    }
}
