package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdj implements zzfg {
    private final zzfg zza;
    private final long zzb;
    private final zzfg zzc;
    private long zzd;
    private Uri zze;

    zzcdj(zzfg zzfgVar, int i, zzfg zzfgVar2) {
        this.zza = zzfgVar;
        this.zzb = i;
        this.zzc = zzfgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + ((long) iZza);
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += (long) iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        zzfl zzflVar2;
        this.zze = zzflVar.zza;
        long j = zzflVar.zzf;
        long j2 = this.zzb;
        zzfl zzflVar3 = null;
        if (j >= j2) {
            zzflVar2 = null;
        } else {
            long j3 = zzflVar.zzg;
            zzflVar2 = new zzfl(zzflVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzflVar.zzg;
        if (j4 == -1 || zzflVar.zzf + j4 > this.zzb) {
            long jMax = Math.max(this.zzb, zzflVar.zzf);
            long j5 = zzflVar.zzg;
            zzflVar3 = new zzfl(zzflVar.zza, null, jMax, jMax, j5 != -1 ? Math.min(j5, (zzflVar.zzf + j5) - this.zzb) : -1L, null, 0);
        }
        long jZzb = zzflVar2 != null ? this.zza.zzb(zzflVar2) : 0L;
        long jZzb2 = zzflVar3 != null ? this.zzc.zzb(zzflVar3) : 0L;
        this.zzd = zzflVar.zzf;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        return zzfqn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
    }
}
