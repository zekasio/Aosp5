package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkr implements zzbhp {
    private final zzbfb zza;
    private final zzdlf zzb;
    private final zzgws zzc;

    public zzdkr(zzdgt zzdgtVar, zzdgi zzdgiVar, zzdlf zzdlfVar, zzgws zzgwsVar) {
        this.zza = zzdgtVar.zzc(zzdgiVar.zzz());
        this.zzb = zzdlfVar;
        this.zzc = zzgwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzber) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zzbza.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
