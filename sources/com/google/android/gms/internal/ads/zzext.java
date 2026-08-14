package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzext extends zzbuv {
    private final zzexp zza;
    private final zzexf zzb;
    private final String zzc;
    private final zzeyp zzd;
    private final Context zze;
    private final zzbzg zzf;
    private final zzapw zzg;
    private zzdlu zzh;
    private boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaA)).booleanValue();

    public zzext(String str, zzexp zzexpVar, Context context, zzexf zzexfVar, zzeyp zzeypVar, zzbzg zzbzgVar, zzapw zzapwVar) {
        this.zzc = str;
        this.zza = zzexpVar;
        this.zzb = zzexfVar;
        this.zzd = zzeypVar;
        this.zze = context;
        this.zzf = zzbzgVar;
        this.zzg = zzapwVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjx)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzbvdVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zze) && zzlVar.zzs == null) {
            zzbza.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zza(zzezx.zzd(4, null, null));
            return;
        }
        if (this.zzh != null) {
            return;
        }
        zzexh zzexhVar = new zzexh(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzexhVar, new zzexs(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdlu zzdluVar = this.zzh;
        return zzdluVar != null ? zzdluVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdlu zzdluVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgp)).booleanValue() && (zzdluVar = this.zzh) != null) {
            return zzdluVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final zzbut zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdlu zzdluVar = this.zzh;
        if (zzdluVar != null) {
            return zzdluVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized String zze() throws RemoteException {
        zzdlu zzdluVar = this.zzh;
        if (zzdluVar == null || zzdluVar.zzl() == null) {
            return null;
        }
        return zzdluVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        zzu(zzlVar, zzbvdVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvd zzbvdVar) throws RemoteException {
        zzu(zzlVar, zzbvdVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzi = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzexr(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzk(zzbuz zzbuzVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzbuzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzl(zzbvk zzbvkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzeyp zzeypVar = this.zzd;
        zzeypVar.zza = zzbvkVar.zza;
        zzeypVar.zzb = zzbvkVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzh == null) {
            zzbza.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzezx.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcn)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzh.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdlu zzdluVar = this.zzh;
        return (zzdluVar == null || zzdluVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzbve zzbveVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbveVar);
    }
}
