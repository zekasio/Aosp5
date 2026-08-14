package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfr extends zzbdt {
    private final zzdgi zza;
    private IObjectWrapper zzb;

    public zzdfr(zzdgi zzdgiVar) {
        this.zza = zzdgiVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final float zze() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfO)).booleanValue()) {
            return 0.0f;
        }
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                zzbza.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbdx zzbdxVarZzm = this.zza.zzm();
        if (zzbdxVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbdxVarZzm.zzd() == -1 || zzbdxVarZzm.zzc() == -1) ? 0.0f : zzbdxVarZzm.zzd() / zzbdxVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbdxVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final float zzf() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final float zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfP)).booleanValue()) {
            return this.zza.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbdx zzbdxVarZzm = this.zza.zzm();
        if (zzbdxVarZzm == null) {
            return null;
        }
        return zzbdxVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final boolean zzk() throws RemoteException {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfP)).booleanValue() && this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final void zzl(zzbff zzbffVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfP)).booleanValue() && (this.zza.zzj() instanceof zzcfe)) {
            ((zzcfe) this.zza.zzj()).zzv(zzbffVar);
        }
    }
}
