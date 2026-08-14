package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzrt implements zzsu {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zztb zzc = new zztb();
    private final zzpt zzd = new zzpt();
    private Looper zze;
    private zzcn zzf;
    private zzno zzg;

    @Override // com.google.android.gms.internal.ads.zzsu
    public /* synthetic */ zzcn zzL() {
        return null;
    }

    protected final zzno zzb() {
        zzno zznoVar = this.zzg;
        zzdl.zzb(zznoVar);
        return zznoVar;
    }

    protected final zzpt zzc(zzss zzssVar) {
        return this.zzd.zza(0, zzssVar);
    }

    protected final zzpt zzd(int i, zzss zzssVar) {
        return this.zzd.zza(0, zzssVar);
    }

    protected final zztb zze(zzss zzssVar) {
        return this.zzc.zza(0, zzssVar, 0L);
    }

    protected final zztb zzf(int i, zzss zzssVar, long j) {
        return this.zzc.zza(0, zzssVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzi(zzst zzstVar) {
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzstVar);
        if (zIsEmpty || !this.zzb.isEmpty()) {
            return;
        }
        zzj();
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzk(zzst zzstVar) {
        this.zze.getClass();
        boolean zIsEmpty = this.zzb.isEmpty();
        this.zzb.add(zzstVar);
        if (zIsEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzm(zzst zzstVar, zzgi zzgiVar, zzno zznoVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        zzdl.zzd(z);
        this.zzg = zznoVar;
        zzcn zzcnVar = this.zzf;
        this.zza.add(zzstVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzstVar);
            zzn(zzgiVar);
        } else if (zzcnVar != null) {
            zzk(zzstVar);
            zzstVar.zza(this, zzcnVar);
        }
    }

    protected abstract void zzn(zzgi zzgiVar);

    protected final void zzo(zzcn zzcnVar) {
        this.zzf = zzcnVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzst) arrayList.get(i)).zza(this, zzcnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzp(zzst zzstVar) {
        this.zza.remove(zzstVar);
        if (!this.zza.isEmpty()) {
            zzi(zzstVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzr(zzpu zzpuVar) {
        this.zzd.zzc(zzpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzs(zztc zztcVar) {
        this.zzc.zzm(zztcVar);
    }

    protected final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public /* synthetic */ boolean zzu() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzg(Handler handler, zzpu zzpuVar) {
        zzpuVar.getClass();
        this.zzd.zzb(handler, zzpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzh(Handler handler, zztc zztcVar) {
        zztcVar.getClass();
        this.zzc.zzb(handler, zztcVar);
    }
}
