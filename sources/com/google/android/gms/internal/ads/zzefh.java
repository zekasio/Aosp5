package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefh implements zzeat {
    private final Context zza;
    private final zzdmq zzb;
    private final zzdlz zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final zzbzg zzf;
    private final zzbhr zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzie)).booleanValue();

    public zzefh(Context context, zzbzg zzbzgVar, zzeyx zzeyxVar, Executor executor, zzdlz zzdlzVar, zzdmq zzdmqVar, zzbhr zzbhrVar) {
        this.zza = context;
        this.zzd = zzeyxVar;
        this.zzc = zzdlzVar;
        this.zze = executor;
        this.zzf = zzbzgVar;
        this.zzb = zzdmqVar;
        this.zzg = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        final zzdmu zzdmuVar = new zzdmu();
        zzfut zzfutVarZzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc(zzeycVar, zzeyoVar, zzdmuVar, obj);
            }
        }, this.zze);
        zzfutVarZzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefb
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
        final zzcei zzceiVarZza = this.zzb.zza(this.zzd.zze, zzeycVar, zzeyoVar.zzb.zzb);
        zzceiVarZza.zzZ(zzeycVar.zzX);
        zzdmuVar.zza(this.zza, (View) zzceiVarZza);
        zzbzs zzbzsVar = new zzbzs();
        final zzdlv zzdlvVarZze = this.zzc.zze(new zzcrb(zzeyoVar, zzeycVar, null), new zzdlw(new zzefg(this.zza, this.zzb, this.zzd, this.zzf, zzeycVar, zzbzsVar, zzceiVarZza, this.zzg, this.zzh), zzceiVarZza));
        zzbzsVar.zzd(zzdlvVarZze);
        zzbif.zzb(zzceiVarZza, zzdlvVarZze.zzg());
        zzdlvVarZze.zzc().zzm(new zzcvi() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzcvi
            public final void zzl() {
                zzcei zzceiVar = zzceiVarZza;
                if (zzceiVar.zzN() != null) {
                    zzceiVar.zzN().zzq();
                }
            }
        }, zzbzn.zzf);
        zzdlvVarZze.zzl().zzi(zzceiVarZza, true, this.zzh ? this.zzg : null);
        zzdlvVarZze.zzl();
        zzeyh zzeyhVar = zzeycVar.zzt;
        return zzfuj.zzl(zzdmp.zzj(zzceiVarZza, zzeyhVar.zzb, zzeyhVar.zza), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzefd
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj2) {
                zzcei zzceiVar = zzceiVarZza;
                zzeyc zzeycVar2 = zzeycVar;
                zzdlv zzdlvVar = zzdlvVarZze;
                if (zzeycVar2.zzN) {
                    zzceiVar.zzae();
                }
                zzceiVar.zzY();
                zzceiVar.onPause();
                return zzdlvVar.zzk();
            }
        }, this.zze);
    }
}
