package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzwr zzwrVar) {
        zzc(zzwrVar);
        this.zza.add(new zzwp(handler, zzwrVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        for (final zzwp zzwpVar : this.zza) {
            if (!zzwpVar.zzc) {
                zzwpVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzwp zzwpVar2 = zzwpVar;
                        zzwpVar2.zzb.zzY(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzwr zzwrVar) {
        for (zzwp zzwpVar : this.zza) {
            if (zzwpVar.zzb == zzwrVar) {
                zzwpVar.zzc();
                this.zza.remove(zzwpVar);
            }
        }
    }
}
