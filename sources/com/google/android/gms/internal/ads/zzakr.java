package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzakr {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzajy zze;
    private final zzakh zzf;
    private final zzaki[] zzg;
    private zzaka zzh;
    private final List zzi;
    private final List zzj;
    private final zzakf zzk;

    public zzakr(zzajy zzajyVar, zzakh zzakhVar, int i) {
        zzakf zzakfVar = new zzakf(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzajyVar;
        this.zzf = zzakhVar;
        this.zzg = new zzaki[4];
        this.zzk = zzakfVar;
    }

    public final zzako zza(zzako zzakoVar) {
        zzakoVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzakoVar);
        }
        zzakoVar.zzg(this.zza.incrementAndGet());
        zzakoVar.zzm("add-to-queue");
        zzc(zzakoVar, 0);
        this.zzc.add(zzakoVar);
        return zzakoVar;
    }

    final void zzb(zzako zzakoVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzakoVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzakq) it.next()).zza();
            }
        }
        zzc(zzakoVar, 5);
    }

    final void zzc(zzako zzakoVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzakp) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzaka zzakaVar = this.zzh;
        if (zzakaVar != null) {
            zzakaVar.zzb();
        }
        zzaki[] zzakiVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzaki zzakiVar = zzakiVarArr[i];
            if (zzakiVar != null) {
                zzakiVar.zza();
            }
        }
        zzaka zzakaVar2 = new zzaka(this.zzc, this.zzd, this.zze, this.zzk, null);
        this.zzh = zzakaVar2;
        zzakaVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzaki zzakiVar2 = new zzaki(this.zzd, this.zzf, this.zze, this.zzk, null);
            this.zzg[i2] = zzakiVar2;
            zzakiVar2.start();
        }
    }
}
