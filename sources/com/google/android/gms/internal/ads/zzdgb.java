package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdgb implements zzatf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgd zzb;

    zzdgb(zzdgd zzdgdVar, String str) {
        this.zzb = zzdgdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbA)).booleanValue()) {
            if (zzateVar.zzj) {
                this.zzb.zzy.put(this.zza, true);
                zzdgd zzdgdVar = this.zzb;
                zzdgdVar.zzA(zzdgdVar.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzateVar.zzj) {
                zzdgd zzdgdVar2 = this.zzb;
                if (zzdgdVar2.zzo == null) {
                    return;
                }
                zzdgdVar2.zzy.put(this.zza, true);
                zzdgd zzdgdVar3 = this.zzb;
                zzdgdVar3.zzA(zzdgdVar3.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
