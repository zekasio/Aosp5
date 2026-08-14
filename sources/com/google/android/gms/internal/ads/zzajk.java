package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajk {
    public static Pair zza(zzzv zzzvVar) throws IOException {
        zzzvVar.zzj();
        zzajj zzajjVarZzd = zzd(1684108385, zzzvVar, new zzen(8));
        ((zzzk) zzzvVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzzvVar.zzf()), Long.valueOf(zzajjVarZzd.zzb));
    }

    public static zzaji zzb(zzzv zzzvVar) throws IOException {
        byte[] bArr;
        zzen zzenVar = new zzen(16);
        zzajj zzajjVarZzd = zzd(1718449184, zzzvVar, zzenVar);
        zzdl.zzf(zzajjVarZzd.zzb >= 16);
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(zzenVar.zzH(), 0, 16, false);
        zzenVar.zzF(0);
        int iZzi = zzenVar.zzi();
        int iZzi2 = zzenVar.zzi();
        int iZzh = zzenVar.zzh();
        int iZzh2 = zzenVar.zzh();
        int iZzi3 = zzenVar.zzi();
        int iZzi4 = zzenVar.zzi();
        int i = ((int) zzajjVarZzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzzkVar.zzm(bArr, 0, i, false);
        } else {
            bArr = zzew.zzf;
        }
        byte[] bArr2 = bArr;
        zzzkVar.zzo((int) (zzzvVar.zze() - zzzvVar.zzf()), false);
        return new zzaji(iZzi, iZzi2, iZzh, iZzh2, iZzi3, iZzi4, bArr2);
    }

    public static boolean zzc(zzzv zzzvVar) throws IOException {
        zzen zzenVar = new zzen(8);
        int i = zzajj.zza(zzzvVar, zzenVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, 4, false);
        zzenVar.zzF(0);
        int iZze = zzenVar.zze();
        if (iZze == 1463899717) {
            return true;
        }
        zzee.zzb("WavHeaderReader", "Unsupported form type: " + iZze);
        return false;
    }

    private static zzajj zzd(int i, zzzv zzzvVar, zzen zzenVar) throws IOException {
        zzajj zzajjVarZza = zzajj.zza(zzzvVar, zzenVar);
        while (true) {
            int i2 = zzajjVarZza.zza;
            if (i2 == i) {
                return zzajjVarZza;
            }
            zzee.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zzajjVarZza.zzb + 8;
            if (j > 2147483647L) {
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + zzajjVarZza.zza);
            }
            ((zzzk) zzzvVar).zzo((int) j, false);
            zzajjVarZza = zzajj.zza(zzzvVar, zzenVar);
        }
    }
}
