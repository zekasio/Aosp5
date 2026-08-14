package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzfto extends zzfsx.zzi {
    private static final zzftk zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfto.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzftk zzftnVar;
        Throwable th;
        zzftm zzftmVar = null;
        try {
            zzftnVar = new zzftl(AtomicReferenceFieldUpdater.newUpdater(zzfto.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfto.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzftnVar = new zzftn(zzftmVar);
            th = e;
        }
        zzbb = zzftnVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfto(int i) {
        this.remaining = i;
    }

    final int zzB() {
        return zzbb.zza(this);
    }

    final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbb.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    final void zzG() {
        this.seenExceptions = null;
    }

    abstract void zzf(Set set);
}
