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
public final class zzexz extends zzbuf {
    private final zzexp zza;
    private final zzexf zzb;
    private final zzeyp zzc;
    private zzdlu zzd;
    private boolean zze = false;

    public zzexz(zzexp zzexpVar, zzexf zzexfVar, zzeyp zzeypVar) {
        this.zza = zzexpVar;
        this.zzb = zzexfVar;
        this.zzc = zzeypVar;
    }

    private final synchronized boolean zzy() {
        zzdlu zzdluVar = this.zzd;
        if (zzdluVar != null) {
            if (!zzdluVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdlu zzdluVar = this.zzd;
        return zzdluVar != null ? zzdluVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        zzdlu zzdluVar = this.zzd;
        if (zzdluVar == null) {
            return null;
        }
        return zzdluVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized String zzd() throws RemoteException {
        zzdlu zzdluVar = this.zzd;
        if (zzdluVar == null || zzdluVar.zzl() == null) {
            return null;
        }
        return zzdluVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzbug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbuk r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzbaj r1 = com.google.android.gms.internal.ads.zzbar.zzeV     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L2b
            if (r0 != 0) goto L19
            goto L2b
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L21 java.lang.Throwable -> L63
            if (r0 == 0) goto L2b
            monitor-exit(r4)
            return
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzbyj r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Throwable -> L63
            r2.zzu(r0, r1)     // Catch: java.lang.Throwable -> L63
        L2b:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzeX     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzbap r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L45
            monitor-exit(r4)
            return
        L45:
            com.google.android.gms.internal.ads.zzexh r0 = new com.google.android.gms.internal.ads.zzexh     // Catch: java.lang.Throwable -> L63
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r4.zzd = r1     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzexp r1 = r4.zza     // Catch: java.lang.Throwable -> L63
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzexp r1 = r4.zza     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.ads.internal.client.zzl r2 = r5.zza     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.internal.ads.zzexx r3 = new com.google.android.gms.internal.ads.zzexx     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r4)
            return
        L63:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L63
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexz.zzg(com.google.android.gms.internal.ads.zzbuk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzexy(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzo(zzbuj zzbujVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof Activity) {
                    activity = (Activity) objUnwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final boolean zzt() {
        zzdlu zzdluVar = this.zzd;
        return zzdluVar != null && zzdluVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzu(zzbue zzbueVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzg(zzbueVar);
    }
}
