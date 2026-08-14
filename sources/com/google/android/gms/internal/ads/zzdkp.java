package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkp extends zzbft {
    private final String zza;
    private final zzdgd zzb;
    private final zzdgi zzc;

    public zzdkp(String str, zzdgd zzdgdVar, zzdgi zzdgiVar) {
        this.zza = str;
        this.zzb = zzdgdVar;
        this.zzc = zzdgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzA() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzC() {
        this.zzb.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzN(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        this.zzb.zzO(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzF(zzbfr zzbfrVar) throws RemoteException {
        this.zzb.zzP(zzbfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzG() {
        return this.zzb.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzH() throws RemoteException {
        return (this.zzc.zzG().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgp)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdp zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdu zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbdx zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzn() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzo() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzp() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzq() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzs() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzt() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final List zzu() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final List zzv() throws RemoteException {
        return zzH() ? this.zzc.zzG() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzw() throws RemoteException {
        this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzB(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }
}
