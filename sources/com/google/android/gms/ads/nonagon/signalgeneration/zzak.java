package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzctu;
import com.google.android.gms.internal.ads.zzfcu;
import com.google.android.gms.internal.ads.zzfda;
import com.google.android.gms.internal.ads.zzgwy;
import com.google.android.gms.internal.ads.zzgxl;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzak implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzak(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfda) this.zza.zzb()).zzb(zzfcu.GENERATE_SIGNALS, ((zzctu) this.zzc).zzb().zzc()).zzf(((zzan) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS).zza();
    }
}
