package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflw extends zzfmi {
    final /* synthetic */ zzflx zza;
    private final zzfmc zzb;

    zzflw(zzflx zzflxVar, zzfmc zzfmcVar) {
        this.zza = zzflxVar;
        this.zzb = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfma zzfmaVarZzc = zzfmb.zzc();
        zzfmaVarZzc.zzb(i);
        if (string != null) {
            zzfmaVarZzc.zza(string);
        }
        this.zzb.zza(zzfmaVarZzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
