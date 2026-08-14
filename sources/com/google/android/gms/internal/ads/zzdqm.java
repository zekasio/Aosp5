package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqm {
    private final zzbim zza;

    zzdqm(zzbim zzbimVar) {
        this.zza = zzbimVar;
    }

    private final void zzs(zzdql zzdqlVar) throws RemoteException {
        String strZza = zzdql.zza(zzdqlVar);
        zzbza.zzi("Dispatching AFMA event on publisher webview: ".concat(strZza));
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdql("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdClicked";
        this.zza.zzb(zzdql.zza(zzdqlVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdClosed";
        zzs(zzdqlVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdFailedToLoad";
        zzdqlVar.zzd = Integer.valueOf(i);
        zzs(zzdqlVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdLoaded";
        zzs(zzdqlVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdqlVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("interstitial", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdOpened";
        zzs(zzdqlVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("creation", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "nativeObjectCreated";
        zzs(zzdqlVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("creation", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "nativeObjectNotCreated";
        zzs(zzdqlVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdClicked";
        zzs(zzdqlVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onRewardedAdClosed";
        zzs(zzdqlVar);
    }

    public final void zzl(long j, zzbut zzbutVar) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onUserEarnedReward";
        zzdqlVar.zze = zzbutVar.zzf();
        zzdqlVar.zzf = Integer.valueOf(zzbutVar.zze());
        zzs(zzdqlVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onRewardedAdFailedToLoad";
        zzdqlVar.zzd = Integer.valueOf(i);
        zzs(zzdqlVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onRewardedAdFailedToShow";
        zzdqlVar.zzd = Integer.valueOf(i);
        zzs(zzdqlVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onAdImpression";
        zzs(zzdqlVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onRewardedAdLoaded";
        zzs(zzdqlVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdqlVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdql zzdqlVar = new zzdql("rewarded", null);
        zzdqlVar.zza = Long.valueOf(j);
        zzdqlVar.zzc = "onRewardedAdOpened";
        zzs(zzdqlVar);
    }
}
