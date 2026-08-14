package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehf extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzeim zza;

    public zzehf(Context context, zzcgd zzcgdVar, zzeyv zzeyvVar, zzdgt zzdgtVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzeio zzeioVar = new zzeio(zzdgtVar, zzcgdVar.zzx());
        zzeioVar.zze(zzbhVar);
        this.zza = new zzeim(new zzeiy(zzcgdVar, context, zzeioVar, zzeyvVar), zzeyvVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zza.zzd(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
