package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbf {
    private final zzfaj zza;
    private final zzfbd zzb;
    private final zzfaf zzc;
    private zzfbl zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfbf(zzfaj zzfajVar, zzfaf zzfafVar, zzfbd zzfbdVar) {
        this.zza = zzfajVar;
        this.zzc = zzfafVar;
        this.zzb = zzfbdVar;
        zzfafVar.zzb(new zzfba(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfR)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfbe zzfbeVar = (zzfbe) this.zzd.pollFirst();
                if (zzfbeVar == null || (zzfbeVar.zza() != null && this.zza.zze(zzfbeVar.zza()))) {
                    zzfbl zzfblVar = new zzfbl(this.zza, this.zzb, zzfbeVar);
                    this.zze = zzfblVar;
                    zzfblVar.zzd(new zzfbb(this, zzfbeVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfut zza(zzfbe zzfbeVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfbeVar);
    }

    public final synchronized void zze(zzfbe zzfbeVar) {
        this.zzd.add(zzfbeVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
