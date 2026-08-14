package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzys {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzyr zza(byte[] bArr) throws zzbu {
        return zzb(new zzem(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzyr zzb(com.google.android.gms.internal.ads.zzem r11, boolean r12) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzys.zzb(com.google.android.gms.internal.ads.zzem, boolean):com.google.android.gms.internal.ads.zzyr");
    }

    private static int zzc(zzem zzemVar) {
        int iZzd = zzemVar.zzd(5);
        return iZzd == 31 ? zzemVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzem zzemVar) throws zzbu {
        int iZzd = zzemVar.zzd(4);
        if (iZzd == 15) {
            if (zzemVar.zza() >= 24) {
                return zzemVar.zzd(24);
            }
            throw zzbu.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzbu.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
