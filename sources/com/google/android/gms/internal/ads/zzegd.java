package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegd implements zzeat {
    private final Context zza;
    private final zzcph zzb;
    private final zzbbp zzc;
    private final zzfuu zzd;
    private final zzfda zze;

    public zzegd(Context context, zzcph zzcphVar, zzfda zzfdaVar, zzfuu zzfuuVar, zzbbp zzbbpVar) {
        this.zza = context;
        this.zzb = zzcphVar;
        this.zze = zzfdaVar;
        this.zzd = zzfuuVar;
        this.zzc = zzbbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzcol zzcolVarZza = this.zzb.zza(new zzcrb(zzeyoVar, zzeycVar, null), new zzegb(this, new View(this.zza), null, new zzcqk() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // com.google.android.gms.internal.ads.zzcqk
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzeyd) zzeycVar.zzv.get(0)));
        zzegc zzegcVarZzk = zzcolVarZza.zzk();
        zzeyh zzeyhVar = zzeycVar.zzt;
        final zzbbk zzbbkVar = new zzbbk(zzegcVarZzk, zzeyhVar.zzb, zzeyhVar.zza);
        zzfda zzfdaVar = this.zze;
        return zzfck.zzd(new zzfce() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // com.google.android.gms.internal.ads.zzfce
            public final void zza() throws Exception {
                this.zza.zzc(zzbbkVar);
            }
        }, this.zzd, zzfcu.CUSTOM_RENDER_SYN, zzfdaVar).zzb(zzfcu.CUSTOM_RENDER_ACK).zzd(zzfuj.zzh(zzcolVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar;
        return (this.zzc == null || (zzeyhVar = zzeycVar.zzt) == null || zzeyhVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbbk zzbbkVar) throws Exception {
        this.zzc.zze(zzbbkVar);
    }
}
