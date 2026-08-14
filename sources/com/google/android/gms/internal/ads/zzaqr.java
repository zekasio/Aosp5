package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqr implements zzfjo {
    private final zzfhr zza;
    private final zzfii zzb;
    private final zzarf zzc;
    private final zzaqq zzd;
    private final zzaqa zze;
    private final zzarh zzf;
    private final zzaqy zzg;
    private final zzaqp zzh;

    zzaqr(zzfhr zzfhrVar, zzfii zzfiiVar, zzarf zzarfVar, zzaqq zzaqqVar, zzaqa zzaqaVar, zzarh zzarhVar, zzaqy zzaqyVar, zzaqp zzaqpVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfiiVar;
        this.zzc = zzarfVar;
        this.zzd = zzaqqVar;
        this.zze = zzaqaVar;
        this.zzf = zzarhVar;
        this.zzg = zzaqyVar;
        this.zzh = zzaqpVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzans zzansVarZzb = this.zzb.zzb();
        map.put("v", this.zza.zzb());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzansVarZzb.zzh());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzaqy zzaqyVar = this.zzg;
        if (zzaqyVar != null) {
            map.put("tcq", Long.valueOf(zzaqyVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zza() {
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(this.zzc.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zzb() {
        Map mapZze = zze();
        zzans zzansVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzd()));
        mapZze.put("did", zzansVarZza.zzg());
        mapZze.put("dst", Integer.valueOf(zzansVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzansVarZza.zzai()));
        zzaqa zzaqaVar = this.zze;
        if (zzaqaVar != null) {
            mapZze.put("nt", Long.valueOf(zzaqaVar.zza()));
        }
        zzarh zzarhVar = this.zzf;
        if (zzarhVar != null) {
            mapZze.put("vs", Long.valueOf(zzarhVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfjo
    public final Map zzc() {
        Map mapZze = zze();
        zzaqp zzaqpVar = this.zzh;
        if (zzaqpVar != null) {
            mapZze.put("vst", zzaqpVar.zza());
        }
        return mapZze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
