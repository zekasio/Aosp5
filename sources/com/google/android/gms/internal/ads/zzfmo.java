package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmo extends zzfml {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfml zzb;
    final /* synthetic */ zzfmv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfmo(zzfmv zzfmvVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfml zzfmlVar) {
        super(taskCompletionSource);
        this.zzc = zzfmvVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfmv.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfmv.zzp(this.zzc, this.zzb);
        }
    }
}
