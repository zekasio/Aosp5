package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcof extends zzaux {
    private final zzcoe zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzeua zzc;
    private boolean zzd = false;

    public zzcof(zzcoe zzcoeVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzeua zzeuaVar) {
        this.zza = zzcoeVar;
        this.zzb = zzbuVar;
        this.zzc = zzeuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgp)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzeua zzeuaVar = this.zzc;
        if (zzeuaVar != null) {
            zzeuaVar.zzo(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzi(IObjectWrapper iObjectWrapper, zzavf zzavfVar) {
        try {
            this.zzc.zzq(zzavfVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzavfVar, this.zzd);
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
