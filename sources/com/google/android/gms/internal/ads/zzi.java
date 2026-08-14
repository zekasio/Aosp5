package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzi {
    public final AudioAttributes zza;

    /* synthetic */ zzi(zzk zzkVar, zzh zzhVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (zzew.zza >= 29) {
            zzf.zza(usage, 1);
        }
        if (zzew.zza >= 32) {
            zzg.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
