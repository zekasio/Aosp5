package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzftw extends zzfti {

    @CheckForNull
    private zzftv zza;

    zzftw(zzfqf zzfqfVar, boolean z, Executor executor, Callable callable) {
        super(zzfqfVar, z, false);
        this.zza = new zzftu(this, callable, executor);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzr() {
        zzftv zzftvVar = this.zza;
        if (zzftvVar != null) {
            zzftvVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzv() {
        zzftv zzftvVar = this.zza;
        if (zzftvVar != null) {
            zzftvVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
