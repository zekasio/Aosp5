package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehe extends com.google.android.gms.ads.internal.client.zzbp {
    final zzeyv zza;
    final zzdgr zzb;
    private final Context zzc;
    private final zzcgd zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzehe(zzcgd zzcgdVar, Context context, String str) {
        zzeyv zzeyvVar = new zzeyv();
        this.zza = zzeyvVar;
        this.zzb = new zzdgr();
        this.zzd = zzcgdVar;
        zzeyvVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdgt zzdgtVarZzg = this.zzb.zzg();
        this.zza.zzB(zzdgtVarZzg.zzi());
        this.zza.zzC(zzdgtVarZzg.zzh());
        zzeyv zzeyvVar = this.zza;
        if (zzeyvVar.zzg() == null) {
            zzeyvVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzehf(this.zzc, this.zzd, this.zza, zzdgtVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbev zzbevVar) {
        this.zzb.zza(zzbevVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbey zzbeyVar) {
        this.zzb.zzb(zzbeyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbfe zzbfeVar, zzbfb zzbfbVar) {
        this.zzb.zzc(str, zzbfeVar, zzbfbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbkg zzbkgVar) {
        this.zzb.zzd(zzbkgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbfi zzbfiVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbfiVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbfl zzbflVar) {
        this.zzb.zzf(zzbflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbjx zzbjxVar) {
        this.zza.zzv(zzbjxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbdl zzbdlVar) {
        this.zza.zzA(zzbdlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzQ(zzcfVar);
    }
}
