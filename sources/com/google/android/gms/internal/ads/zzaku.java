package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaku {
    public final Object zza;
    public final zzajx zzb;
    public final zzakx zzc;
    public boolean zzd;

    private zzaku(zzakx zzakxVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakxVar;
    }

    private zzaku(Object obj, zzajx zzajxVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajxVar;
        this.zzc = null;
    }

    public static zzaku zza(zzakx zzakxVar) {
        return new zzaku(zzakxVar);
    }

    public static zzaku zzb(Object obj, zzajx zzajxVar) {
        return new zzaku(obj, zzajxVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
