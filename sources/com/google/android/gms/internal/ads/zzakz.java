package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakz {
    public static final boolean zza = zzala.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzakz() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzala.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzaky(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = ((zzaky) this.zzb.get(r1.size() - 1)).zzc - ((zzaky) this.zzb.get(0)).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((zzaky) this.zzb.get(0)).zzc;
        zzala.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzaky zzakyVar : this.zzb) {
            long j3 = zzakyVar.zzc;
            zzala.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzakyVar.zzb), zzakyVar.zza);
            j2 = j3;
        }
    }
}
