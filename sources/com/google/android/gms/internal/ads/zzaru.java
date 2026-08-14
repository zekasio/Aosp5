package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaru extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaru(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "YqTS1o+C7XbcWZ1ePdCg6lS0vIYMM7HzMu7AOHCWvWhuNgyk3szL95200diFQtk9", "HoawD5bopn0ma7odT68Aadbw04A5xMOxr41zcgTyqd8=", zzamvVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, null);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi.longValue());
        }
    }
}
