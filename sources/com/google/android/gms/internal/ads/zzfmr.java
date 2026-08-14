package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmr extends zzfml {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfmu zzb;

    zzfmr(zzfmu zzfmuVar, IBinder iBinder) {
        this.zzb = zzfmuVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        this.zzb.zza.zzn = zzfmg.zzb(this.zza);
        zzfmv.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        Iterator it = this.zzb.zza.zze.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzb.zza.zze.clear();
    }
}
