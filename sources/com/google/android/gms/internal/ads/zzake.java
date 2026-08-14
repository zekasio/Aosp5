package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzake implements Runnable {
    private final zzako zza;
    private final zzaku zzb;
    private final Runnable zzc;

    public zzake(zzako zzakoVar, zzaku zzakuVar, Runnable runnable) {
        this.zza = zzakoVar;
        this.zzb = zzakuVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzaku zzakuVar = this.zzb;
        if (zzakuVar.zzc()) {
            this.zza.zzo(zzakuVar.zza);
        } else {
            this.zza.zzn(zzakuVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
