package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzash extends zzasm {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzash(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "n4163G8iyqIKefOY/uIEeKjctFj1OQ1ggOIXf5yF8QdKTrTHzFKlCjSxQhxSHW08", "ML9A2VCkghGr4j9IIk2plgQeFzpoPp+ogmQdRJzLv80=", zzamvVar, i, 33);
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
            this.zze.zzV(zzi.longValue());
        }
    }
}
