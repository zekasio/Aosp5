package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmo {
    private final zzblr zza;
    private zzfut zzb;

    zzbmo(zzblr zzblrVar) {
        this.zza = zzblrVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzbzs zzbzsVar = new zzbzs();
            this.zzb = zzbzsVar;
            this.zza.zzb(null).zzi(new zzbzw() { // from class: com.google.android.gms.internal.ads.zzbmm
                @Override // com.google.android.gms.internal.ads.zzbzw
                public final void zza(Object obj) {
                    zzbzsVar.zzd((zzbls) obj);
                }
            }, new zzbzu() { // from class: com.google.android.gms.internal.ads.zzbmn
                @Override // com.google.android.gms.internal.ads.zzbzu
                public final void zza() {
                    zzbzsVar.zze(new zzblu("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbmr zza(String str, zzbly zzblyVar, zzblx zzblxVar) {
        zzd();
        return new zzbmr(this.zzb, "google.afma.activeView.handleUpdate", zzblyVar, zzblxVar);
    }

    public final void zzb(final String str, final zzbhp zzbhpVar) {
        zzd();
        this.zzb = zzfuj.zzm(this.zzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzbmk
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                zzbls zzblsVar = (zzbls) obj;
                zzblsVar.zzq(str, zzbhpVar);
                return zzfuj.zzh(zzblsVar);
            }
        }, zzbzn.zzf);
    }

    public final void zzc(final String str, final zzbhp zzbhpVar) {
        this.zzb = zzfuj.zzl(this.zzb, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbml
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzbls zzblsVar = (zzbls) obj;
                zzblsVar.zzr(str, zzbhpVar);
                return zzblsVar;
            }
        }, zzbzn.zzf);
    }
}
