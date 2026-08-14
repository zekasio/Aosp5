package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgx implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgz zza;
    private final Handler zzb;

    public zzgx(zzgz zzgzVar, Handler handler) {
        this.zza = zzgzVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgw
            @Override // java.lang.Runnable
            public final void run() {
                zzgx zzgxVar = this.zza;
                zzgz.zzc(zzgxVar.zza, i);
            }
        });
    }
}
