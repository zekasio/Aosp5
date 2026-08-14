package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzph implements zzos {
    protected zzph(zzpg zzpgVar) {
    }

    protected static int zza(int i, int i2, int i3) {
        return zzfsr.zza(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    protected static int zzb(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return GamesStatusCodes.STATUS_REAL_TIME_CONNECTION_FAILED;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
