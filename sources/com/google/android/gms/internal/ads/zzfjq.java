package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjq {
    final /* synthetic */ zzfjr zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfjq(zzfjr zzfjrVar, byte[] bArr, zzfjp zzfjpVar) {
        this.zza = zzfjrVar;
        this.zzb = bArr;
    }

    public final zzfjq zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfjq zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfjr zzfjrVar = this.zza;
            if (zzfjrVar.zzb) {
                zzfjrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
