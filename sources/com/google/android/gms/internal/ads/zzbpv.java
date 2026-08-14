package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpv implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbpx zza;

    zzbpv(zzbpx zzbpxVar) {
        this.zza = zzbpxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intentZzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzs.zzQ(this.zza.zzb, intentZzb);
    }
}
