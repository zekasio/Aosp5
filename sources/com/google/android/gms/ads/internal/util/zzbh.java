package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzbza;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbh implements zzaks {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final void zza(zzakx zzakxVar) {
        zzbza.zzj("Failed to load URL: " + this.zza + "\n" + zzakxVar.toString());
        this.zzb.zza((Object) null);
    }
}
