package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasg extends zzasm {
    private final zzarf zzi;
    private long zzj;

    public zzasg(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, zzarf zzarfVar) {
        super(zzaqxVar, "5go+5dJzPwtL428hPcvMvoz2IsnUZf/hKfz19p3YdYFOxVa6hNCHvBHHDAKylvFa", "8BESx6lpu/rT8vpssHW7TVG8DbeYQulEHs4g7WxmlH0=", zzamvVar, i, 53);
        this.zzi = zzarfVar;
        if (zzarfVar != null) {
            this.zzj = zzarfVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
