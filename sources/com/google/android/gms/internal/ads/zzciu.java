package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzciu {
    private zzcgg zza;
    private zzckh zzb;
    private zzfde zzc;
    private zzcku zzd;
    private zzezy zze;

    private zzciu() {
    }

    /* synthetic */ zzciu(zzcit zzcitVar) {
    }

    public final zzcgd zza() {
        zzgxg.zzc(this.zza, zzcgg.class);
        zzgxg.zzc(this.zzb, zzckh.class);
        if (this.zzc == null) {
            this.zzc = new zzfde();
        }
        if (this.zzd == null) {
            this.zzd = new zzcku();
        }
        if (this.zze == null) {
            this.zze = new zzezy();
        }
        return new zzchy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzciu zzb(zzcgg zzcggVar) {
        this.zza = zzcggVar;
        return this;
    }

    public final zzciu zzc(zzckh zzckhVar) {
        this.zzb = zzckhVar;
        return this;
    }
}
