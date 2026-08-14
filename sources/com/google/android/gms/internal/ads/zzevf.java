package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevf implements zzevt {
    private final zzfaj zza;
    private final Executor zzb;
    private final zzfuf zzc = new zzevd(this);

    public zzevf(zzfaj zzfajVar, Executor executor) {
        this.zza = zzfajVar;
        this.zzb = executor;
    }

    final /* synthetic */ zzfut zza(zzctw zzctwVar, zzevo zzevoVar) throws Exception {
        zzfat zzfatVar = zzevoVar.zzb;
        zzbtn zzbtnVar = zzevoVar.zza;
        zzfas zzfasVarZzb = zzfatVar != null ? this.zza.zzb(zzfatVar) : null;
        if (zzfatVar == null) {
            return zzfuj.zzh(null);
        }
        if (zzfasVarZzb != null && zzbtnVar != null) {
            zzfuj.zzq(zzctwVar.zzb().zzh(zzbtnVar), this.zzc, this.zzb);
        }
        return zzfuj.zzh(new zzeve(zzfatVar, zzbtnVar, zzfasVarZzb));
    }

    public final zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, final zzctw zzctwVar) {
        return zzfuj.zze(zzfuj.zzm(zzfua.zzv(new zzevp(this.zza, zzctwVar, this.zzb).zzc()), new zzftq() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zza(zzctwVar, (zzevo) obj);
            }
        }, this.zzb), Exception.class, new zzevc(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
