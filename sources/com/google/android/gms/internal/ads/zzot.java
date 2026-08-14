package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzot {
    private zzov zzc;
    private zznq zzb = zznq.zza;
    final zzos zza = zzos.zza;

    public final zzot zzb(zznq zznqVar) {
        this.zzb = zznqVar;
        return this;
    }

    public final zzot zzc(zzde[] zzdeVarArr) {
        this.zzc = new zzov(zzdeVarArr);
        return this;
    }

    public final zzpf zzd() {
        if (this.zzc == null) {
            this.zzc = new zzov(new zzde[0]);
        }
        return new zzpf(this, null);
    }
}
