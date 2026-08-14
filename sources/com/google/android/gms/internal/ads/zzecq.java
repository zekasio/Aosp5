package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecq extends zzbnk implements zzcvy {
    private zzbnl zza;
    private zzcvx zzb;

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final synchronized void zza(zzcvx zzcvxVar) {
        this.zzb = zzcvxVar;
    }

    public final synchronized void zzc(zzbnl zzbnlVar) {
        this.zza = zzbnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zze() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzf() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzg(int i) throws RemoteException {
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzi(int i, String str) throws RemoteException {
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzj(int i) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzl(String str) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzm() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzn() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzo() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzo();
        }
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzp() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzr(zzber zzberVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzs(zzbup zzbupVar) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzs(zzbupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzt(zzbut zzbutVar) throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzt(zzbutVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzu() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzv() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzw() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzx() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final synchronized void zzy() throws RemoteException {
        zzbnl zzbnlVar = this.zza;
        if (zzbnlVar != null) {
            zzbnlVar.zzy();
        }
    }
}
