package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarn extends zzasm {
    public zzarn(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "pzDMLx6PDOtUoiq4sHYJQM6a/7OSGXuSt3rWDXG0BK02rgL9BLEjiNa6eKy3zt3D", "O5il9ZZjBEgIiHjallNs+C68w5c7XQAr0WIqU8TcTvI=", zzamvVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            this.zze.zzm(iArr[0]);
            this.zze.zzl(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzk(i);
            }
        }
    }
}
