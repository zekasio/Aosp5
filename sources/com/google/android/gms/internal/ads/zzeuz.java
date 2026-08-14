package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuz implements zzevt {
    private final zzevt zza;
    private final zzevt zzb;
    private final zzfbf zzc;
    private final String zzd;
    private zzctw zze;
    private final Executor zzf;

    public zzeuz(zzevt zzevtVar, zzevt zzevtVar2, zzfbf zzfbfVar, String str, Executor executor) {
        this.zza = zzevtVar;
        this.zzb = zzevtVar2;
        this.zzc = zzfbfVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfut zzg(zzfas zzfasVar, zzevu zzevuVar) {
        zzctw zzctwVar = zzfasVar.zza;
        this.zze = zzctwVar;
        if (zzfasVar.zzc != null) {
            if (zzctwVar.zzf() != null) {
                zzfasVar.zzc.zzo().zzbG(zzfasVar.zza.zzf());
            }
            return zzfuj.zzh(zzfasVar.zzc);
        }
        zzctwVar.zzb().zzl(zzfasVar.zzb);
        return ((zzevj) this.zza).zzb(zzevuVar, null, zzfasVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zze;
    }

    final /* synthetic */ zzfut zzb(zzevu zzevuVar, zzeuy zzeuyVar, zzevs zzevsVar, zzctw zzctwVar, zzeve zzeveVar) throws Exception {
        if (zzeveVar != null) {
            zzeuy zzeuyVar2 = new zzeuy(zzeuyVar.zza, zzeuyVar.zzb, zzeuyVar.zzc, zzeuyVar.zzd, zzeuyVar.zze, zzeuyVar.zzf, zzeveVar.zza);
            if (zzeveVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeuyVar2);
                return zzg(zzeveVar.zzc, zzevuVar);
            }
            zzfut zzfutVarZza = this.zzc.zza(zzeuyVar2);
            if (zzfutVarZza != null) {
                this.zze = null;
                return zzfuj.zzm(zzfutVarZza, new zzftq() { // from class: com.google.android.gms.internal.ads.zzeuv
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        return this.zza.zze((zzfbc) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeuyVar2);
            zzevuVar = new zzevu(zzevuVar.zzb, zzeveVar.zzb);
        }
        zzfut zzfutVarZzb = ((zzevj) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar);
        this.zze = zzctwVar;
        return zzfutVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzf(zzevuVar, zzevsVar, null);
    }

    final /* synthetic */ zzfut zze(zzfbc zzfbcVar) throws Exception {
        zzfbe zzfbeVar;
        if (zzfbcVar == null || zzfbcVar.zza == null || (zzfbeVar = zzfbcVar.zzb) == null) {
            throw new zzdtf(1, "Empty prefetch");
        }
        zzawt zzawtVarZza = zzawz.zza();
        zzawr zzawrVarZza = zzaws.zza();
        zzawrVarZza.zzd(2);
        zzawrVarZza.zzb(zzaww.zzd());
        zzawtVarZza.zza(zzawrVarZza);
        zzfbcVar.zza.zza.zzb().zzc().zzi((zzawz) zzawtVarZza.zzal());
        return zzg(zzfbcVar.zza, ((zzeuy) zzfbeVar).zzb);
    }

    public final synchronized zzfut zzf(final zzevu zzevuVar, final zzevs zzevsVar, zzctw zzctwVar) {
        zzctv zzctvVarZza = zzevsVar.zza(zzevuVar.zzb);
        zzctvVarZza.zza(new zzeva(this.zzd));
        final zzctw zzctwVar2 = (zzctw) zzctvVarZza.zzh();
        zzctwVar2.zzg();
        zzctwVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzctwVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzeyx zzeyxVarZzg = zzctwVar2.zzg();
            final zzeuy zzeuyVar = new zzeuy(zzevsVar, zzevuVar, zzeyxVarZzg.zzd, zzeyxVarZzg.zzf, this.zzf, zzeyxVarZzg.zzj, null);
            return zzfuj.zzm(zzfua.zzv(((zzevf) this.zzb).zzb(zzevuVar, zzevsVar, zzctwVar2)), new zzftq() { // from class: com.google.android.gms.internal.ads.zzeuw
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return this.zza.zzb(zzevuVar, zzeuyVar, zzevsVar, zzctwVar2, (zzeve) obj);
                }
            }, this.zzf);
        }
        this.zze = zzctwVar2;
        return ((zzevj) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar2);
    }
}
