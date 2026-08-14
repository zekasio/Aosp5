package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebv implements zzeat {
    private final zzcph zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzfnj zzf;

    public zzebv(zzcph zzcphVar, Context context, Executor executor, zzdmq zzdmqVar, zzeyx zzeyxVar, zzfnj zzfnjVar) {
        this.zzb = context;
        this.zza = zzcphVar;
        this.zze = executor;
        this.zzc = zzdmqVar;
        this.zzd = zzeyxVar;
        this.zzf = zzfnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        return zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(zzeyoVar, zzeycVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar = zzeycVar.zzt;
        return (zzeyhVar == null || zzeyhVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfut zzc(zzeyo zzeyoVar, zzeyc zzeycVar, Object obj) throws Exception {
        View zzdmtVar;
        com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzezb.zza(this.zzb, zzeycVar.zzv);
        final zzcei zzceiVarZza = this.zzc.zza(zzqVarZza, zzeycVar, zzeyoVar.zzb.zzb);
        zzceiVarZza.zzZ(zzeycVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && zzeycVar.zzah) {
            zzdmtVar = zzcpy.zza(this.zzb, (View) zzceiVarZza, zzeycVar);
        } else {
            zzdmtVar = new zzdmt(this.zzb, (View) zzceiVarZza, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzeycVar));
        }
        final zzcol zzcolVarZza = this.zza.zza(new zzcrb(zzeyoVar, zzeycVar, null), new zzcor(zzdmtVar, zzceiVarZza, new zzcqk() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzcqk
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzceiVarZza.zzq();
            }
        }, zzezb.zzb(zzqVarZza)));
        zzcolVarZza.zzh().zzi(zzceiVarZza, false, null);
        zzcolVarZza.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzceiVarZza;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zzcolVarZza.zzh();
        zzeyh zzeyhVar = zzeycVar.zzt;
        zzfut zzfutVarZzj = zzdmp.zzj(zzceiVarZza, zzeyhVar.zzb, zzeyhVar.zza);
        if (zzeycVar.zzN) {
            zzfutVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // java.lang.Runnable
                public final void run() {
                    zzceiVarZza.zzae();
                }
            }, this.zze);
        }
        zzfutVarZzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzceiVarZza);
            }
        }, this.zze);
        return zzfuj.zzl(zzfutVarZzj, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                return zzcolVarZza.zza();
            }
        }, zzbzn.zzf);
    }

    final /* synthetic */ void zzd(zzcei zzceiVar) {
        zzceiVar.zzY();
        zzcfe zzcfeVarZzq = zzceiVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzcfeVarZzq == null) {
            return;
        }
        zzcfeVarZzq.zzs(zzflVar);
    }
}
