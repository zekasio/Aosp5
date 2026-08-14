package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzevp {
    private final zzfaj zza;
    private final zzctw zzb;
    private final Executor zzc;
    private zzevo zzd;

    public zzevp(zzfaj zzfajVar, zzctw zzctwVar, Executor executor) {
        this.zza = zzfajVar;
        this.zzb = zzctwVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfat zze() {
        zzeyx zzeyxVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzeyxVarZzg.zzd, zzeyxVarZzg.zzf, zzeyxVarZzg.zzj);
    }

    public final zzfut zzc() {
        zzfut zzfutVarZze;
        zzevo zzevoVar = this.zzd;
        if (zzevoVar != null) {
            return zzfuj.zzh(zzevoVar);
        }
        if (((Boolean) zzbcr.zza.zze()).booleanValue()) {
            zzfutVarZze = zzfuj.zze(zzfuj.zzl(zzfua.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzevm(this), this.zzc), zzdvi.class, new zzevl(this), this.zzc);
        } else {
            zzevo zzevoVar2 = new zzevo(null, zze(), null);
            this.zzd = zzevoVar2;
            zzfutVarZze = zzfuj.zzh(zzevoVar2);
        }
        return zzfuj.zzl(zzfutVarZze, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return (zzevo) obj;
            }
        }, this.zzc);
    }
}
