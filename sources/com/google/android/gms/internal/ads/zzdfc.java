package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdfc implements zzbhp {
    private final WeakReference zza;

    /* synthetic */ zzdfc(zzdff zzdffVar, zzdfb zzdfbVar) {
        this.zza = new WeakReference(zzdffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        zzdff zzdffVar = (zzdff) this.zza.get();
        if (zzdffVar == null) {
            return;
        }
        zzdffVar.zzh.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
            zzdffVar.zzi.zzr();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdffVar.zzi.zzs();
        }
    }
}
