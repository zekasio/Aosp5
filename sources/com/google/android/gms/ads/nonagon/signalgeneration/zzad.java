package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzgwy;
import com.google.android.gms.internal.ads.zzgxg;
import com.google.android.gms.internal.ads.zzgxl;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzad implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    public zzad(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3, zzgxl zzgxlVar4, zzgxl zzgxlVar5, zzgxl zzgxlVar6, zzgxl zzgxlVar7, zzgxl zzgxlVar8, zzgxl zzgxlVar9) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
        this.zzd = zzgxlVar4;
        this.zze = zzgxlVar5;
        this.zzf = zzgxlVar6;
        this.zzg = zzgxlVar7;
        this.zzh = zzgxlVar8;
        this.zzi = zzgxlVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgd zzcgdVar = (zzcgd) this.zza.zzb();
        Context contextZza = ((zzcgj) this.zzb).zza();
        zzapw zzapwVar = (zzapw) this.zzc.zzb();
        zzezt zzeztVar = (zzezt) this.zzd.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        return new zzac(zzcgdVar, contextZza, zzapwVar, zzeztVar, zzfuuVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdpn) this.zzg.zzb(), (zzfff) this.zzh.zzb(), ((zzcgu) this.zzi).zza());
    }
}
