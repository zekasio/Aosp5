package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfti extends zzfto {
    private static final Logger zza = Logger.getLogger(zzfti.class.getName());

    @CheckForNull
    private zzfqf zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfti(zzfqf zzfqfVar, boolean z, boolean z2) {
        super(zzfqfVar.size());
        zzfqfVar.getClass();
        this.zzb = zzfqfVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzH(int i, Future future) {
        try {
            zzg(i, zzfuj.zzo(future));
        } catch (Error e) {
            e = e;
            zzJ(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzJ(e);
        } catch (ExecutionException e3) {
            zzJ(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
    public final void zzy(@CheckForNull zzfqf zzfqfVar) {
        int iZzB = zzB();
        int i = 0;
        zzfnu.zzi(iZzB >= 0, "Less than 0 remaining futures");
        if (iZzB == 0) {
            if (zzfqfVar != null) {
                zzfsj it = zzfqfVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzH(i, future);
                    }
                    i++;
                }
            }
            zzG();
            zzv();
            zzz(2);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    protected final String zza() {
        zzfqf zzfqfVar = this.zzb;
        return zzfqfVar != null ? "futures=".concat(zzfqfVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    protected final void zzb() {
        zzfqf zzfqfVar = this.zzb;
        zzz(1);
        if ((zzfqfVar != null) && isCancelled()) {
            boolean zZzu = zzu();
            zzfsj it = zzfqfVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzu);
            }
        }
    }

    abstract void zzg(int i, Object obj);

    abstract void zzv();

    final void zzw() {
        zzfqf zzfqfVar = this.zzb;
        zzfqfVar.getClass();
        if (zzfqfVar.isEmpty()) {
            zzv();
            return;
        }
        if (!this.zzc) {
            final zzfqf zzfqfVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(zzfqfVar2);
                }
            };
            zzfsj it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzfut) it.next()).zzc(runnable, zzftx.INSTANCE);
            }
            return;
        }
        zzfsj it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final zzfut zzfutVar = (zzfut) it2.next();
            zzfutVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfutVar, i);
                }
            }, zzftx.INSTANCE);
            i++;
        }
    }

    final /* synthetic */ void zzx(zzfut zzfutVar, int i) {
        try {
            if (zzfutVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzH(i, zzfutVar);
            }
        } finally {
            zzy(null);
        }
    }

    void zzz(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfto
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzm = zzm();
        thZzm.getClass();
        zzL(set, thZzm);
    }

    private final void zzJ(Throwable th) {
        th.getClass();
        if (this.zzc && !zze(th) && zzL(zzD(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }
}
