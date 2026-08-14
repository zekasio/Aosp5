package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegi implements zzeat {
    private final zzbbp zza;
    private final zzfuu zzb;
    private final zzfda zzc;
    private final zzegr zzd;

    public zzegi(zzfda zzfdaVar, zzfuu zzfuuVar, zzbbp zzbbpVar, zzegr zzegrVar, byte[] bArr) {
        this.zzc = zzfdaVar;
        this.zzb = zzfuuVar;
        this.zza = zzbbpVar;
        this.zzd = zzegrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzbzs zzbzsVar = new zzbzs();
        zzegn zzegnVar = new zzegn();
        zzegnVar.zzd(new zzegh(this, zzbzsVar, zzeyoVar, zzeycVar, zzegnVar));
        zzeyh zzeyhVar = zzeycVar.zzt;
        final zzbbk zzbbkVar = new zzbbk(zzegnVar, zzeyhVar.zzb, zzeyhVar.zza);
        zzfda zzfdaVar = this.zzc;
        return zzfck.zzd(new zzfce() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzfce
            public final void zza() throws Exception {
                this.zza.zzc(zzbbkVar);
            }
        }, this.zzb, zzfcu.CUSTOM_RENDER_SYN, zzfdaVar).zzb(zzfcu.CUSTOM_RENDER_ACK).zzd(zzbzsVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar;
        return (this.zza == null || (zzeyhVar = zzeycVar.zzt) == null || zzeyhVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbbk zzbbkVar) throws Exception {
        this.zza.zze(zzbbkVar);
    }
}
