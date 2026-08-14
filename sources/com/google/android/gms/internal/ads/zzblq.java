package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblq extends zzbzz {
    private final com.google.android.gms.ads.internal.util.zzbb zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzblq(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zzb = zzbbVar;
    }

    public final zzbll zza() {
        zzbll zzbllVar = new zzbll(this);
        synchronized (this.zza) {
            zzi(new zzblm(this, zzbllVar), new zzbln(this, zzbllVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbllVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    protected final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzblp(this), new zzbzv());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    protected final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
