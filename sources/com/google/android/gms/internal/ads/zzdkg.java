package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkg extends zzbjz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbdi {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdgd zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdkg(zzdgd zzdgdVar, zzdgi zzdgiVar) {
        this.zza = zzdgiVar.zzf();
        this.zzb = zzdgiVar.zzj();
        this.zzc = zzdgdVar;
        if (zzdgiVar.zzr() != null) {
            zzdgiVar.zzr().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdgd zzdgdVar = this.zzc;
        if (zzdgdVar == null || (view = this.zza) == null) {
            return;
        }
        zzdgdVar.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdgd.zzW(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbkd zzbkdVar, int i) {
        try {
            zzbkdVar.zze(i);
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzbza.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final zzbdu zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbza.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgd zzdgdVar = this.zzc;
        if (zzdgdVar == null || zzdgdVar.zzc() == null) {
            return null;
        }
        return zzdgdVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdgd zzdgdVar = this.zzc;
        if (zzdgdVar != null) {
            zzdgdVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdkf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbka
    public final void zzf(IObjectWrapper iObjectWrapper, zzbkd zzbkdVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbza.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbkdVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzbza.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbkdVar, 0);
            return;
        }
        if (this.zze) {
            zzbza.zzg("Instream ad should not be used again.");
            zzi(zzbkdVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zzb(this.zza, this);
        zzg();
        try {
            zzbkdVar.zzf();
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
