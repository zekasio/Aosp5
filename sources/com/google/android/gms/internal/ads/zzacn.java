package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacn implements zzzx {
    private final long zzb;
    private final zzzx zzc;

    public zzacn(long j, zzzx zzzxVar) {
        this.zzb = j;
        this.zzc = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final void zzN(zzaax zzaaxVar) {
        this.zzc.zzN(new zzacm(this, zzaaxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzzx
    public final zzabb zzv(int i, int i2) {
        return this.zzc.zzv(i, i2);
    }
}
