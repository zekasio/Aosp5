package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzecw implements zzdee {
    private final Context zza;
    private final zzbzg zzb;
    private final zzfut zzc;
    private final zzeyc zzd;
    private final zzcei zze;
    private final zzeyx zzf;
    private final zzbhr zzg;
    private final boolean zzh;

    zzecw(Context context, zzbzg zzbzgVar, zzfut zzfutVar, zzeyc zzeycVar, zzcei zzceiVar, zzeyx zzeyxVar, boolean z, zzbhr zzbhrVar) {
        this.zza = context;
        this.zzb = zzbzgVar;
        this.zzc = zzfutVar;
        this.zzd = zzeycVar;
        this.zze = zzceiVar;
        this.zzf = zzeyxVar;
        this.zzg = zzbhrVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zza(boolean z, Context context, zzcvb zzcvbVar) {
        zzdcw zzdcwVar = (zzdcw) zzfuj.zzp(this.zzc);
        this.zze.zzan(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zZzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zZze, zZzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzcvbVar != null) {
            zzcvbVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzddt zzddtVarZzh = zzdcwVar.zzh();
        zzcei zzceiVar = this.zze;
        zzeyc zzeycVar = this.zzd;
        int i = zzeycVar.zzR;
        zzbzg zzbzgVar = this.zzb;
        String str = zzeycVar.zzC;
        zzeyh zzeyhVar = zzeycVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzddtVarZzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzceiVar, i, zzbzgVar, str, zzjVar, zzeyhVar.zzb, zzeyhVar.zza, this.zzf.zzf, zzcvbVar), true);
    }
}
