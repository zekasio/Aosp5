package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasa extends zzasm {
    public zzasa(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "1j4REQrMq1PMMKcExjoDOWyg20MvDt1CpdYWmGJKkBHqeSdI3MLMTN450gavv1ax", "+CZi37grxFhhVcffnGl0l4+1UklQkPiKUfCgqjs0HzY=", zzamvVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzco);
        bool.booleanValue();
        zzaqd zzaqdVar = new zzaqd((String) this.zzf.invoke(null, this.zzb.zzb(), bool));
        synchronized (this.zze) {
            this.zze.zzj(zzaqdVar.zza);
            this.zze.zzC(zzaqdVar.zzb);
        }
    }
}
