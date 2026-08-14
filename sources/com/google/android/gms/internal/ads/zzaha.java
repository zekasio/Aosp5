package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzaha extends zzagy {
    private zzagz zza;
    private int zzb;
    private boolean zzc;
    private zzabg zzd;
    private zzabe zze;

    zzaha() {
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final long zza(zzen zzenVar) {
        if ((zzenVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzenVar.zzH()[0];
        zzagz zzagzVar = this.zza;
        zzdl.zzb(zzagzVar);
        int i = !zzagzVar.zzd[(b >> 1) & (255 >>> (8 - zzagzVar.zze))].zza ? zzagzVar.zza.zze : zzagzVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzenVar.zzb() < zzenVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd() + 4);
            zzenVar.zzD(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzenVar.zzE(zzenVar.zzd() + 4);
        }
        long j = i2;
        byte[] bArrZzH = zzenVar.zzH();
        bArrZzH[zzenVar.zzd() - 4] = (byte) (j & 255);
        bArrZzH[zzenVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzH[zzenVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzH[zzenVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzabg zzabgVar = this.zzd;
        this.zzb = zzabgVar != null ? zzabgVar.zze : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    @Override // com.google.android.gms.internal.ads.zzagy
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean zzc(com.google.android.gms.internal.ads.zzen r26, long r27, com.google.android.gms.internal.ads.zzagv r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaha.zzc(com.google.android.gms.internal.ads.zzen, long, com.google.android.gms.internal.ads.zzagv):boolean");
    }
}
