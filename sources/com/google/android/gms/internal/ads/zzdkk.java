package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkk extends zzben {
    private final String zza;
    private final zzdgd zzb;
    private final zzdgi zzc;

    public zzdkk(String str, zzdgd zzdgdVar, zzdgi zzdgiVar) {
        this.zza = str;
        this.zzb = zzdgdVar;
        this.zzc = zzdgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final com.google.android.gms.ads.internal.client.zzdq zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final zzbdp zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final zzbdx zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzh() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzi() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzj() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzk() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final List zzm() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
