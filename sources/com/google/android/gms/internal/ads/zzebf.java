package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebf implements zzeat {
    private final zzcny zza;
    private final Context zzb;
    private final zzdmq zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzie)).booleanValue();

    public zzebf(zzcny zzcnyVar, Context context, Executor executor, zzdmq zzdmqVar, zzeyx zzeyxVar, zzbzg zzbzgVar, zzbhr zzbhrVar) {
        this.zzb = context;
        this.zza = zzcnyVar;
        this.zze = executor;
        this.zzc = zzdmqVar;
        this.zzd = zzeyxVar;
        this.zzf = zzbzgVar;
        this.zzg = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        final zzdmu zzdmuVar = new zzdmu();
        zzfut zzfutVarZzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzebd
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(zzeycVar, zzeyoVar, zzdmuVar, obj);
            }
        }, this.zze);
        zzfutVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // java.lang.Runnable
            public final void run() {
                zzdmuVar.zzb();
            }
        }, this.zze);
        return zzfutVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar = zzeycVar.zzt;
        return (zzeyhVar == null || zzeyhVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfut zzc(final zzeyc zzeycVar, zzeyo zzeyoVar, zzdmu zzdmuVar, Object obj) throws Exception {
        final zzcei zzceiVarZza = this.zzc.zza(this.zzd.zze, zzeycVar, zzeyoVar.zzb.zzb);
        zzceiVarZza.zzZ(zzeycVar.zzX);
        zzdmuVar.zza(this.zzb, (View) zzceiVarZza);
        zzbzs zzbzsVar = new zzbzs();
        final zzcnv zzcnvVarZza = this.zza.zza(new zzcrb(zzeyoVar, zzeycVar, null), new zzdcz(new zzebh(this.zzf, zzbzsVar, zzeycVar, zzceiVarZza, this.zzd, this.zzh, this.zzg), zzceiVarZza), new zzcnw(zzeycVar.zzab));
        zzcnvVarZza.zzh().zzi(zzceiVarZza, false, this.zzh ? this.zzg : null);
        zzbzsVar.zzd(zzcnvVarZza);
        zzcnvVarZza.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzebb
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzceiVarZza;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zzcnvVarZza.zzh();
        zzeyh zzeyhVar = zzeycVar.zzt;
        return zzfuj.zzl(zzdmp.zzj(zzceiVarZza, zzeyhVar.zzb, zzeyhVar.zza), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzebc
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                zzcei zzceiVar = zzceiVarZza;
                zzeyc zzeycVar2 = zzeycVar;
                zzcnv zzcnvVar = zzcnvVarZza;
                if (zzeycVar2.zzN) {
                    zzceiVar.zzae();
                }
                zzceiVar.zzY();
                zzceiVar.onPause();
                return zzcnvVar.zza();
            }
        }, this.zze);
    }
}
