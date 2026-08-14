package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedb implements zzeba {
    private final Context zza;
    private final zzddw zzb;
    private final zzbzg zzc;
    private final Executor zzd;

    public zzedb(Context context, zzbzg zzbzgVar, zzddw zzddwVar, Executor executor) {
        this.zza = context;
        this.zzc = zzbzgVar;
        this.zzb = zzddwVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, final zzeaw zzeawVar) throws zzezc, zzeek {
        zzdcw zzdcwVarZze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdcz(new zzdee() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzdee
            public final void zza(boolean z, Context context, zzcvb zzcvbVar) throws zzded {
                this.zza.zzc(zzeawVar, z, context, zzcvbVar);
            }
        }, null));
        zzdcwVarZze.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzd);
        ((zzecq) zzeawVar.zzc).zzc(zzdcwVarZze.zzj());
        return zzdcwVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        ((zzezs) zzeawVar.zzb).zzo(this.zza, zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeycVar.zzt), (zzbnl) zzeawVar.zzc);
    }

    final /* synthetic */ void zzc(zzeaw zzeawVar, boolean z, Context context, zzcvb zzcvbVar) throws zzded {
        try {
            ((zzezs) zzeawVar.zzb).zzv(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaB)).intValue()) {
                ((zzezs) zzeawVar.zzb).zzx();
            } else {
                ((zzezs) zzeawVar.zzb).zzy(context);
            }
        } catch (zzezc e) {
            zzbza.zzi("Cannot show interstitial.");
            throw new zzded(e.getCause());
        }
    }
}
