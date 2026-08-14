package com.google.android.gms.internal.ads;

import cz.msebera.android.httpclient.HttpStatus;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaje implements zzajf {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzzx zzc;
    private final zzabb zzd;
    private final zzaji zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaje(zzzx zzzxVar, zzabb zzabbVar, zzaji zzajiVar) throws zzbu {
        this.zzc = zzzxVar;
        this.zzd = zzabbVar;
        this.zze = zzajiVar;
        int iMax = Math.max(1, zzajiVar.zzc / 10);
        this.zzi = iMax;
        zzen zzenVar = new zzen(zzajiVar.zzf);
        zzenVar.zzi();
        int iZzi = zzenVar.zzi();
        this.zzf = iZzi;
        int i = zzajiVar.zzb;
        int i2 = (((zzajiVar.zzd - (i * 4)) * 8) / (zzajiVar.zze * i)) + 1;
        if (iZzi != i2) {
            throw zzbu.zza("Expected frames per block: " + i2 + "; got: " + iZzi, null);
        }
        int iZze = zzew.zze(iMax, iZzi);
        this.zzg = new byte[zzajiVar.zzd * iZze];
        this.zzh = new zzen(iZze * (iZzi + iZzi) * i);
        int i3 = ((zzajiVar.zzc * zzajiVar.zzd) * 8) / iZzi;
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/raw");
        zzadVar.zzv(i3);
        zzadVar.zzO(i3);
        zzadVar.zzL((iMax + iMax) * i);
        zzadVar.zzw(zzajiVar.zzb);
        zzadVar.zzT(zzajiVar.zzc);
        zzadVar.zzN(2);
        this.zzj = zzadVar.zzY();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long jZzw = this.zzl + zzew.zzw(this.zzn, 1000000L, this.zze.zzc);
        int iZze = zze(i);
        this.zzd.zzs(jZzw, 1, iZze, this.zzm - iZze, null);
        this.zzn += (long) i;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(int i, long j) {
        this.zzc.zzN(new zzajl(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzajf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaje.zzc(com.google.android.gms.internal.ads.zzzv, long):boolean");
    }
}
