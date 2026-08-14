package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaae {
    public static zzaag zzb(zzen zzenVar) {
        zzenVar.zzG(1);
        int iZzm = zzenVar.zzm();
        long jZzc = zzenVar.zzc();
        long j = iZzm;
        int i = iZzm / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jZzr = zzenVar.zzr();
            if (jZzr == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzr;
            jArrCopyOf2[i2] = zzenVar.zzr();
            zzenVar.zzG(2);
            i2++;
        }
        zzenVar.zzG((int) ((jZzc + j) - ((long) zzenVar.zzc())));
        return new zzaag(jArrCopyOf, jArrCopyOf2);
    }

    public static zzbq zza(zzzv zzzvVar, boolean z) throws Throwable {
        zzbq zzbqVarZza = new zzaal().zza(zzzvVar, z ? null : zzado.zza);
        if (zzbqVarZza == null || zzbqVarZza.zza() == 0) {
            return null;
        }
        return zzbqVarZza;
    }
}
