package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaro extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaro(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "IGEgHKB/MIXVrIwjsdJywrnrloRmyYIq/vBgAhtfd4dogeVW5FuA76GSnZhGb7Ph", "q1ESzGxy3mMibo5bvVHy9HD4wURWKxH/5T27mG6V0M4=", zzamvVar, i, 44);
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
            this.zze.zzo(zzi.longValue());
        }
    }
}
