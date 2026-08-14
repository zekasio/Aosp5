package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboi extends zzbnk {
    private final Adapter zza;
    private final zzbuo zzb;

    zzboi(Adapter adapter, zzbuo zzbuoVar) {
        this.zza = adapter;
        this.zzb = zzbuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzf() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzg(int i) throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzo() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzp() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzr(zzber zzberVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzs(zzbup zzbupVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzt(zzbut zzbutVar) throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzm(ObjectWrapper.wrap(this.zza), new zzbup(zzbutVar.zzf(), zzbutVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzu() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzy() throws RemoteException {
        zzbuo zzbuoVar = this.zzb;
        if (zzbuoVar != null) {
            zzbuoVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
