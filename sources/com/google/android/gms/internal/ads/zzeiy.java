package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiy implements zzeir {
    private final zzeyv zza;
    private final zzcgd zzb;
    private final Context zzc;
    private final zzeio zzd;
    private final zzfep zze;
    private zzcra zzf;

    public zzeiy(zzcgd zzcgdVar, Context context, zzeio zzeioVar, zzeyv zzeyvVar) {
        this.zzb = zzcgdVar;
        this.zzc = context;
        this.zzd = zzeioVar;
        this.zza = zzeyvVar;
        this.zze = zzcgdVar.zzy();
        zzeyvVar.zzu(zzeioVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zza() {
        zzcra zzcraVar = this.zzf;
        return zzcraVar != null && zzcraVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeir
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeip zzeipVar, zzeiq zzeiqVar) throws RemoteException {
        zzfen zzfenVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzbza.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeit
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeiu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzezr.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzj().zzm(true);
        }
        int i = ((zzeis) zzeipVar).zza;
        zzeyv zzeyvVar = this.zza;
        zzeyvVar.zzE(zzlVar);
        zzeyvVar.zzz(i);
        zzeyx zzeyxVarZzG = zzeyvVar.zzG();
        zzfec zzfecVarZzb = zzfeb.zzb(this.zzc, zzfem.zzf(zzeyxVarZzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzeyxVarZzG.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzi(zzcbVar);
        }
        zzder zzderVarZzg = this.zzb.zzg();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zzc);
        zzctxVar.zzh(zzeyxVarZzG);
        zzderVarZzg.zzf(zzctxVar.zzi());
        zzczz zzczzVar = new zzczz();
        zzczzVar.zzk(this.zzd.zzd(), this.zzb.zzA());
        zzderVarZzg.zze(zzczzVar.zzn());
        zzderVarZzg.zzd(this.zzd.zzc());
        zzderVarZzg.zzc(new zzcoh(null));
        zzdes zzdesVarZzg = zzderVarZzg.zzg();
        if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
            zzfen zzfenVarZzf = zzdesVarZzg.zzf();
            zzfenVarZzf.zzh(8);
            zzfenVarZzf.zzb(zzlVar.zzp);
            zzfenVar = zzfenVarZzf;
        } else {
            zzfenVar = null;
        }
        this.zzb.zzw().zzc(1);
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        ScheduledExecutorService scheduledExecutorServiceZzB = this.zzb.zzB();
        zzcrt zzcrtVarZza = zzdesVarZzg.zza();
        zzcra zzcraVar = new zzcra(zzfuuVar, scheduledExecutorServiceZzB, zzcrtVarZza.zzi(zzcrtVarZza.zzj()));
        this.zzf = zzcraVar;
        zzcraVar.zze(new zzeix(this, zzeiqVar, zzfenVar, zzfecVarZzb, zzdesVarZzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzezx.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzezx.zzd(6, null, null));
    }
}
