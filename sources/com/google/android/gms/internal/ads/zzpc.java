package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpc extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzpf zza;
    final /* synthetic */ zzpd zzb;

    zzpc(zzpd zzpdVar, zzpf zzpfVar) {
        this.zzb = zzpdVar;
        this.zza = zzpfVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzpf zzpfVar = this.zzb.zza;
            if (zzpfVar.zzq == null || !zzpfVar.zzP) {
                return;
            }
            zzpfVar.zzq.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzpf zzpfVar = this.zzb.zza;
            if (zzpfVar.zzq == null || !zzpfVar.zzP) {
                return;
            }
            zzpfVar.zzq.zzb();
        }
    }
}
