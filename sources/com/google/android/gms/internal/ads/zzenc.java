package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzenc implements zzepm {
    public final zzeyb zza;

    public zzenc(zzeyb zzeybVar) {
        this.zza = zzeybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzeyb zzeybVar = this.zza;
        if (zzeybVar != null) {
            bundle.putBoolean("render_in_browser", zzeybVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
