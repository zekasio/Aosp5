package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;
    private static final String zzi = zzew.zzP(0);
    private static final String zzj = zzew.zzP(1);
    private static final String zzk = zzew.zzP(2);
    private static final String zzl = zzew.zzP(3);
    private static final String zzm = zzew.zzP(4);
    private static final String zzn = zzew.zzP(5);
    private static final String zzo = zzew.zzP(6);
    private static final String zzp = zzew.zzP(7);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzb
    };

    public zzc(long j) {
        this(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzc zzcVar = (zzc) obj;
            if (this.zzc == zzcVar.zzc && Arrays.equals(this.zzd, zzcVar.zzd) && Arrays.equals(this.zze, zzcVar.zze) && Arrays.equals(this.zzf, zzcVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzc * 31) - 1) * 961) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze)) * 31) + Arrays.hashCode(this.zzf)) * 961;
    }

    public final int zza(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final zzc zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new zzc(0L, 0, -1, iArrCopyOf, (Uri[]) Arrays.copyOf(this.zzd, 0), jArrCopyOf, 0L, false);
    }

    private zzc(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        zzdl.zzd(iArr.length == uriArr.length);
        this.zzb = 0L;
        this.zzc = i;
        this.zze = iArr;
        this.zzd = uriArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
    }
}
