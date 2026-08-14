package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzeex extends zzefy {
    private final zzdcl zza;

    public zzeex(zzcum zzcumVar, zzdca zzdcaVar, zzcvg zzcvgVar, zzcvv zzcvvVar, zzcwa zzcwaVar, zzcvb zzcvbVar, zzczi zzcziVar, zzdcs zzdcsVar, zzcwu zzcwuVar, zzdcl zzdclVar, zzcze zzczeVar) {
        super(zzcumVar, zzdcaVar, zzcvgVar, zzcvvVar, zzcwaVar, zzcziVar, zzcwuVar, zzdcsVar, zzczeVar, zzcvbVar);
        this.zza = zzdclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefy, com.google.android.gms.internal.ads.zzbnl
    public final void zzs(zzbup zzbupVar) {
        this.zza.zza(zzbupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefy, com.google.android.gms.internal.ads.zzbnl
    public final void zzt(zzbut zzbutVar) throws RemoteException {
        this.zza.zza(new zzbup(zzbutVar.zzf(), zzbutVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzefy, com.google.android.gms.internal.ads.zzbnl
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzefy, com.google.android.gms.internal.ads.zzbnl
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzefy, com.google.android.gms.internal.ads.zzbnl
    public final void zzy() {
        this.zza.zzc();
    }
}
