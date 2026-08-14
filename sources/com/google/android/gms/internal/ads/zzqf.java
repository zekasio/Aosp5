package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqf implements zzqt {
    private final zzfok zzb;
    private final zzfok zzc;

    public zzqf(int i, boolean z) {
        zzqd zzqdVar = new zzqd(i);
        zzqe zzqeVar = new zzqe(i);
        this.zzb = zzqdVar;
        this.zzc = zzqeVar;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzqh.zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzqh.zzs(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzqh zzc(zzqs zzqsVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zzqh zzqhVar;
        String str = zzqsVar.zza.zza;
        zzqh zzqhVar2 = null;
        try {
            int i = zzew.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzqhVar = new zzqh(mediaCodecCreateByCodecName, zza(((zzqd) this.zzb).zza), zzb(((zzqe) this.zzc).zza), false, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        try {
            Trace.endSection();
            zzqh.zzh(zzqhVar, zzqsVar.zzb, zzqsVar.zzd, null, 0);
            return zzqhVar;
        } catch (Exception e3) {
            e = e3;
            zzqhVar2 = zzqhVar;
            if (zzqhVar2 != null) {
                zzqhVar2.zzl();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }
}
