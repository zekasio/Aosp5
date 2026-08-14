package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqb implements zzcwc, zzatf {
    private final zzeyc zza;
    private final zzcvg zzb;
    private final zzcwl zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcqb(zzeyc zzeycVar, zzcvg zzcvgVar, zzcwl zzcwlVar) {
        this.zza = zzeycVar;
        this.zzb = zzcvgVar;
        this.zzc = zzcwlVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        if (this.zza.zzf == 1 && zzateVar.zzj) {
            zza();
        }
        if (zzateVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
