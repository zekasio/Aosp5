package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqp {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzqp() {
    }

    private final long zzd(long j) {
        return this.zza + Math.max(0L, ((this.zzb - 529) * 1000000) / j);
    }

    public final long zza(zzaf zzafVar) {
        return zzd(zzafVar.zzA);
    }

    public final long zzb(zzaf zzafVar, zzgr zzgrVar) {
        if (this.zzb == 0) {
            this.zza = zzgrVar.zzd;
        }
        if (this.zzc) {
            return zzgrVar.zzd;
        }
        ByteBuffer byteBuffer = zzgrVar.zzb;
        byteBuffer.getClass();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
        }
        int iZzc = zzaao.zzc(i);
        if (iZzc != -1) {
            long jZzd = zzd(zzafVar.zzA);
            this.zzb += (long) iZzc;
            return jZzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzgrVar.zzd;
        zzee.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzgrVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
