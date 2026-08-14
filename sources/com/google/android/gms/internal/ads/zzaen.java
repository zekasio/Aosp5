package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaen implements zzaep {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaew zzc = new zzaew();
    private zzaeo zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzzv zzzvVar, int i) throws IOException {
        ((zzzk) zzzvVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zza(zzaeo zzaeoVar) {
        this.zzd = zzaeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x017a A[LOOP:0: B:3:0x0005->B:75:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaen.zzc(com.google.android.gms.internal.ads.zzzv):boolean");
    }
}
