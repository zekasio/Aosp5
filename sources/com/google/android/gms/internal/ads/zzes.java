package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzes implements zzdv {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzes(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzer zzerVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzerVar);
            }
        }
    }

    private static zzer zzm() {
        zzer zzerVar;
        List list = zza;
        synchronized (list) {
            zzerVar = list.isEmpty() ? new zzer(null) : (zzer) list.remove(list.size() - 1);
        }
        return zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final zzdu zzb(int i) {
        zzer zzerVarZzm = zzm();
        zzerVarZzm.zzb(this.zzb.obtainMessage(i), this);
        return zzerVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final zzdu zzc(int i, Object obj) {
        zzer zzerVarZzm = zzm();
        zzerVarZzm.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzerVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final zzdu zzd(int i, int i2, int i3) {
        zzer zzerVarZzm = zzm();
        zzerVarZzm.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzerVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zzf(int i) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final boolean zzk(zzdu zzduVar) {
        return ((zzer) zzduVar).zzc(this.zzb);
    }
}
