package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaah {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaag zzk;
    private final zzbq zzl;

    private zzaah(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzaag zzaagVar, zzbq zzbqVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzaagVar;
        this.zzl = zzbqVar;
    }

    public zzaah(byte[] bArr, int i) {
        zzem zzemVar = new zzem(bArr, bArr.length);
        zzemVar.zzj(i * 8);
        this.zza = zzemVar.zzd(16);
        this.zzb = zzemVar.zzd(16);
        this.zzc = zzemVar.zzd(24);
        this.zzd = zzemVar.zzd(24);
        int iZzd = zzemVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzemVar.zzd(3) + 1;
        int iZzd2 = zzemVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        this.zzj = zzew.zzy(zzemVar.zzd(4), zzemVar.zzd(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        return zzew.zzr((j * ((long) this.zze)) / 1000000, 0L, this.zzj - 1);
    }

    public final zzaf zzc(byte[] bArr, zzbq zzbqVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzbq zzbqVarZzd = zzd(zzbqVar);
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/flac");
        zzadVar.zzL(i);
        zzadVar.zzw(this.zzg);
        zzadVar.zzT(this.zze);
        zzadVar.zzI(Collections.singletonList(bArr));
        zzadVar.zzM(zzbqVarZzd);
        return zzadVar.zzY();
    }

    public final zzbq zzd(zzbq zzbqVar) {
        zzbq zzbqVar2 = this.zzl;
        return zzbqVar2 == null ? zzbqVar : zzbqVar2.zzd(zzbqVar);
    }

    public final zzaah zze(List list) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbq(list)));
    }

    public final zzaah zzf(zzaag zzaagVar) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaagVar, this.zzl);
    }

    public final zzaah zzg(List list) {
        return new zzaah(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzabh.zzb(list)));
    }
}
