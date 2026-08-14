package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzks extends zzm implements zzhu {
    private final zzjc zzb;
    private final zzdo zzc;

    zzks(zzht zzhtVar) {
        zzdo zzdoVar = new zzdo(zzdm.zza);
        this.zzc = zzdoVar;
        try {
            this.zzb = new zzjc(zzhtVar, this);
            zzdoVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzA() {
        this.zzc.zzb();
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final int zzB() {
        this.zzc.zzb();
        this.zzb.zzB();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzC(zzle zzleVar) {
        this.zzc.zzb();
        this.zzb.zzC(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzD(zzle zzleVar) {
        this.zzc.zzb();
        this.zzb.zzD(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zzE(zzsu zzsuVar) {
        this.zzc.zzb();
        this.zzb.zzE(zzsuVar);
    }

    public final zzhj zzF() {
        this.zzc.zzb();
        return this.zzb.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        this.zzc.zzb();
        this.zzb.zza(i, j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzh() {
        this.zzc.zzb();
        return this.zzb.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final int zzk() {
        this.zzc.zzb();
        this.zzb.zzk();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zzp() {
        this.zzc.zzb();
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcn zzq() {
        this.zzc.zzb();
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcy zzr() {
        this.zzc.zzb();
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzs() {
        this.zzc.zzb();
        this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzt() {
        this.zzc.zzb();
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzu(boolean z) {
        this.zzc.zzb();
        this.zzb.zzu(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzv(Surface surface) {
        this.zzc.zzb();
        this.zzb.zzv(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzw(float f) {
        this.zzc.zzb();
        this.zzb.zzw(f);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzx() {
        this.zzc.zzb();
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzy() {
        this.zzc.zzb();
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzz() {
        this.zzc.zzb();
        this.zzb.zzz();
        return false;
    }
}
