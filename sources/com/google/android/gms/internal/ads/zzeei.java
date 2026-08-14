package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeei {
    private final zzezm zza;
    private final zzdna zzb;
    private final zzdpi zzc;
    private final zzfdk zzd;

    public zzeei(zzezm zzezmVar, zzdna zzdnaVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = zzezmVar;
        this.zzb = zzdnaVar;
        this.zzc = zzdpiVar;
        this.zzd = zzfdkVar;
    }

    public final void zza(zzeyf zzeyfVar, zzeyc zzeycVar, int i, @Nullable zzeax zzeaxVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzfdjVarZzb = zzfdj.zzb("adapter_status");
            zzfdjVarZzb.zzg(zzeyfVar);
            zzfdjVarZzb.zzf(zzeycVar);
            zzfdjVarZzb.zza("adapter_l", String.valueOf(j));
            zzfdjVarZzb.zza("sc", Integer.toString(i));
            if (zzeaxVar != null) {
                zzfdjVarZzb.zza("arec", Integer.toString(zzeaxVar.zzb().zza));
                String strZza = this.zza.zza(zzeaxVar.getMessage());
                if (strZza != null) {
                    zzfdjVarZzb.zza("areec", strZza);
                }
            }
            zzdmz zzdmzVarZzb = this.zzb.zzb(zzeycVar.zzu);
            if (zzdmzVarZzb != null) {
                zzfdjVarZzb.zza("ancn", zzdmzVarZzb.zza);
                zzbpq zzbpqVar = zzdmzVarZzb.zzb;
                if (zzbpqVar != null) {
                    zzfdjVarZzb.zza("adapter_v", zzbpqVar.toString());
                }
                zzbpq zzbpqVar2 = zzdmzVarZzb.zzc;
                if (zzbpqVar2 != null) {
                    zzfdjVarZzb.zza("adapter_sv", zzbpqVar2.toString());
                }
            }
            this.zzd.zzb(zzfdjVarZzb);
            return;
        }
        zzdph zzdphVarZza = this.zzc.zza();
        zzdphVarZza.zze(zzeyfVar);
        zzdphVarZza.zzd(zzeycVar);
        zzdphVarZza.zzb("action", "adapter_status");
        zzdphVarZza.zzb("adapter_l", String.valueOf(j));
        zzdphVarZza.zzb("sc", Integer.toString(i));
        if (zzeaxVar != null) {
            zzdphVarZza.zzb("arec", Integer.toString(zzeaxVar.zzb().zza));
            String strZza2 = this.zza.zza(zzeaxVar.getMessage());
            if (strZza2 != null) {
                zzdphVarZza.zzb("areec", strZza2);
            }
        }
        zzdmz zzdmzVarZzb2 = this.zzb.zzb(zzeycVar.zzu);
        if (zzdmzVarZzb2 != null) {
            zzdphVarZza.zzb("ancn", zzdmzVarZzb2.zza);
            zzbpq zzbpqVar3 = zzdmzVarZzb2.zzb;
            if (zzbpqVar3 != null) {
                zzdphVarZza.zzb("adapter_v", zzbpqVar3.toString());
            }
            zzbpq zzbpqVar4 = zzdmzVarZzb2.zzc;
            if (zzbpqVar4 != null) {
                zzdphVarZza.zzb("adapter_sv", zzbpqVar4.toString());
            }
        }
        zzdphVarZza.zzg();
    }
}
