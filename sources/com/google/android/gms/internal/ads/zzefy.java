package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzefy extends zzbnk {
    private final zzcum zza;
    private final zzdca zzb;
    private final zzcvg zzc;
    private final zzcvv zzd;
    private final zzcwa zze;
    private final zzczi zzf;
    private final zzcwu zzg;
    private final zzdcs zzh;
    private final zzcze zzi;
    private final zzcvb zzj;

    public zzefy(zzcum zzcumVar, zzdca zzdcaVar, zzcvg zzcvgVar, zzcvv zzcvvVar, zzcwa zzcwaVar, zzczi zzcziVar, zzcwu zzcwuVar, zzdcs zzdcsVar, zzcze zzczeVar, zzcvb zzcvbVar) {
        this.zza = zzcumVar;
        this.zzb = zzdcaVar;
        this.zzc = zzcvgVar;
        this.zzd = zzcvvVar;
        this.zze = zzcwaVar;
        this.zzf = zzcziVar;
        this.zzg = zzcwuVar;
        this.zzh = zzdcsVar;
        this.zzi = zzczeVar;
        this.zzj = zzcvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzf() {
        this.zzg.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzezx.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzo() {
        this.zze.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzq(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzr(zzber zzberVar, String str) {
    }

    public void zzs(zzbup zzbupVar) {
    }

    public void zzt(zzbut zzbutVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
