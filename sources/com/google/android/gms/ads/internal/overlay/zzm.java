package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.ads.zzdcc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, AdActivity.CLASS_NAME);
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.zzd);
            intent.putExtra("shouldCallOnOverlayOpened", z);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!PlatformVersion.isAtLeastLollipop()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(DriveFile.MODE_READ_ONLY);
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(context, intent);
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
        zzdcc zzdccVar = adOverlayInfoParcel.zzy;
        if (zzdccVar != null) {
            zzdccVar.zzr();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
