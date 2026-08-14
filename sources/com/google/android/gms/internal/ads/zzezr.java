package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezr {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzbza.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        zzbza.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzbyt.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzbza.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, str);
    }
}
