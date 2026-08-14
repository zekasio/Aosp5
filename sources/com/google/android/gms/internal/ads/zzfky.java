package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfky extends zzfsx {
    Object zza;

    zzfky(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final boolean zzd(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final boolean zze(Throwable th) {
        return super.zze(th);
    }
}
