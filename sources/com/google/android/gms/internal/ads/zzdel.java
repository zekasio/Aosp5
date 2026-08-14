package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdel implements zzcqp {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgxl zzd;
    private final zzdgt zze;

    zzdel(Map map, Map map2, Map map3, zzgxl zzgxlVar, zzdgt zzdgtVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgxlVar;
        this.zze = zzdgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    public final zzeat zza(int i, String str) {
        zzeat zzeatVarZza;
        zzeat zzeatVar = (zzeat) this.zza.get(str);
        if (zzeatVar != null) {
            return zzeatVar;
        }
        if (i == 1) {
            if (this.zze.zze() == null || (zzeatVarZza = ((zzcqp) this.zzd.zzb()).zza(i, str)) == null) {
                return null;
            }
            return zzcqt.zza(zzeatVarZza);
        }
        if (i != 4) {
            return null;
        }
        zzedi zzediVar = (zzedi) this.zzc.get(str);
        if (zzediVar != null) {
            return new zzeau(zzediVar, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzcqr
                @Override // com.google.android.gms.internal.ads.zzfnj
                public final Object apply(Object obj) {
                    return new zzcqt((List) obj);
                }
            });
        }
        zzeat zzeatVar2 = (zzeat) this.zzb.get(str);
        if (zzeatVar2 == null) {
            return null;
        }
        return zzcqt.zza(zzeatVar2);
    }
}
