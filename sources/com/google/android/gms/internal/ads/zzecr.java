package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecr extends zzbun implements zzcvy {
    private zzbuo zza;
    private zzcvx zzb;
    private zzdcn zzc;

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final synchronized void zza(zzcvx zzcvxVar) {
        this.zzb = zzcvxVar;
    }

    public final synchronized void zzc(zzbuo zzbuoVar) {
        this.zza = zzbuoVar;
    }

    public final synchronized void zzd(zzdcn zzdcnVar) {
        this.zzc = zzdcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            zzbuoVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcvx zzcvxVar = this.zzb;
        if (zzcvxVar != null) {
            zzcvxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdcn zzdcnVar = this.zzc;
        if (zzdcnVar != null) {
            zzbza.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzefl) zzdcnVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdcn zzdcnVar = this.zzc;
        if (zzdcnVar != null) {
            Executor executor = ((zzefl) zzdcnVar).zzd.zzb;
            final zzeyo zzeyoVar = ((zzefl) zzdcnVar).zza;
            final zzeyc zzeycVar = ((zzefl) zzdcnVar).zzb;
            final zzeaw zzeawVar = ((zzefl) zzdcnVar).zzc;
            final zzefl zzeflVar = (zzefl) zzdcnVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // java.lang.Runnable
                public final void run() {
                    zzefl zzeflVar2 = zzeflVar;
                    zzeyo zzeyoVar2 = zzeyoVar;
                    zzeyc zzeycVar2 = zzeycVar;
                    zzeaw zzeawVar2 = zzeawVar;
                    zzefn zzefnVar = zzeflVar2.zzd;
                    zzefn.zze(zzeyoVar2, zzeycVar2, zzeawVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbup zzbupVar) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zzd.zza(zzbupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbuo zzbuoVar = this.zza;
        if (zzbuoVar != null) {
            ((zzefm) zzbuoVar).zzd.zzc();
        }
    }
}
