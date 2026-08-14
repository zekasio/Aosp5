package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzh {
    public static void zza(long j, zzen zzenVar, zzabb[] zzabbVarArr) {
        int iZze;
        while (true) {
            if (zzenVar.zza() <= 1) {
                return;
            }
            int iZzc = zzc(zzenVar);
            int iZzc2 = zzc(zzenVar);
            int iZzc3 = zzenVar.zzc() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzenVar.zza()) {
                zzee.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc3 = zzenVar.zzd();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzk = zzenVar.zzk();
                int iZzo = zzenVar.zzo();
                if (iZzo == 49) {
                    iZze = zzenVar.zze();
                    iZzo = 49;
                } else {
                    iZze = 0;
                }
                int iZzk2 = zzenVar.zzk();
                if (iZzo == 47) {
                    zzenVar.zzG(1);
                    iZzo = 47;
                }
                boolean z = iZzk == 181 && (iZzo == 49 || iZzo == 47) && iZzk2 == 3;
                if (iZzo == 49) {
                    z &= iZze == 1195456820;
                }
                if (z) {
                    zzb(j, zzenVar, zzabbVarArr);
                }
            }
            zzenVar.zzF(iZzc3);
        }
    }

    public static void zzb(long j, zzen zzenVar, zzabb[] zzabbVarArr) {
        int iZzk = zzenVar.zzk();
        if ((iZzk & 64) != 0) {
            int i = iZzk & 31;
            zzenVar.zzG(1);
            int iZzc = zzenVar.zzc();
            for (zzabb zzabbVar : zzabbVarArr) {
                int i2 = i * 3;
                zzenVar.zzF(iZzc);
                zzabbVar.zzq(zzenVar, i2);
                if (j != -9223372036854775807L) {
                    zzabbVar.zzs(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzen zzenVar) {
        int i = 0;
        while (zzenVar.zza() != 0) {
            int iZzk = zzenVar.zzk();
            i += iZzk;
            if (iZzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
