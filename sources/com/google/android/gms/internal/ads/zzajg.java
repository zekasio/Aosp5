package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajg implements zzajf {
    private final zzzx zza;
    private final zzabb zzb;
    private final zzaji zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzajg(zzzx zzzxVar, zzabb zzabbVar, zzaji zzajiVar, String str, int i) throws zzbu {
        this.zza = zzzxVar;
        this.zzb = zzabbVar;
        this.zzc = zzajiVar;
        int i2 = zzajiVar.zzb * zzajiVar.zze;
        int i3 = zzajiVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzbu.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzajiVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        zzadVar.zzv(i6);
        zzadVar.zzO(i6);
        zzadVar.zzL(iMax);
        zzadVar.zzw(zzajiVar.zzb);
        zzadVar.zzT(zzajiVar.zzc);
        zzadVar.zzN(i);
        this.zzd = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(int i, long j) {
        this.zza.zzN(new zzajl(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final boolean zzc(zzzv zzzvVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = zzaaz.zza(this.zzb, zzzvVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= (long) iZza;
            }
        }
        int i3 = this.zzc.zzd;
        int i4 = this.zzg / i3;
        if (i4 > 0) {
            long jZzw = this.zzf + zzew.zzw(this.zzh, 1000000L, r6.zzc);
            int i5 = i4 * i3;
            int i6 = this.zzg - i5;
            this.zzb.zzs(jZzw, 1, i5, i6, null);
            this.zzh += (long) i4;
            this.zzg = i6;
        }
        return j2 <= 0;
    }
}
