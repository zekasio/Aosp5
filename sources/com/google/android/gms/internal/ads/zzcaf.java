package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcaf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcan zzb;

    zzcaf(zzcan zzcanVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcanVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcan.zzl(this.zzb, this.zza);
        zzcan zzcanVar = this.zzb;
        if (zzcanVar.zzr != null) {
            zzcanVar.zzr.zzf();
        }
    }
}
