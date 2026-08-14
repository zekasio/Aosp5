package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzags {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzen zzg = new zzen(255);

    zzags() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzzv zzzvVar, boolean z) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzzy.zzc(zzzvVar, this.zzg.zzH(), 0, 27, z) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z) {
                    return false;
                }
                throw zzbu.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int iZzk = this.zzg.zzk();
            this.zzc = iZzk;
            this.zzd = iZzk + 27;
            this.zzg.zzC(iZzk);
            if (zzzy.zzc(zzzvVar, this.zzg.zzH(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzk();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r12 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r11.zzf() >= r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r11.zzc(1) != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r11, long r12) throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r11.zzf()
            long r2 = r11.zze()
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.internal.ads.zzdl.zzd(r0)
            com.google.android.gms.internal.ads.zzen r0 = r10.zzg
            r1 = 4
            r0.zzC(r1)
        L1a:
            r2 = -1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r6 = r11.zzf()
            r8 = 4
            long r6 = r6 + r8
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto L55
        L2c:
            com.google.android.gms.internal.ads.zzen r0 = r10.zzg
            byte[] r0 = r0.zzH()
            boolean r0 = com.google.android.gms.internal.ads.zzzy.zzc(r11, r0, r5, r1, r4)
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.zzen r0 = r10.zzg
            r0.zzF(r5)
            com.google.android.gms.internal.ads.zzen r0 = r10.zzg
            long r2 = r0.zzs()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L51
            r0 = r11
            com.google.android.gms.internal.ads.zzzk r0 = (com.google.android.gms.internal.ads.zzzk) r0
            r0.zzo(r4, r5)
            goto L1a
        L51:
            r11.zzj()
            return r4
        L55:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L61
            long r0 = r11.zzf()
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 >= 0) goto L68
        L61:
            int r0 = r11.zzc(r4)
            r1 = -1
            if (r0 != r1) goto L55
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzags.zzc(com.google.android.gms.internal.ads.zzzv, long):boolean");
    }
}
