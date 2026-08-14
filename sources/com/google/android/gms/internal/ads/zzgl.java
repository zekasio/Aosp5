package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgl {
    private int zza;

    public final void zza(int i) {
        this.zza |= Integer.MIN_VALUE;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    protected final boolean zzd(int i) {
        return (this.zza & i) == i;
    }

    public final boolean zze() {
        return zzd(DriveFile.MODE_READ_ONLY);
    }

    public final boolean zzf() {
        return zzd(Integer.MIN_VALUE);
    }

    public final boolean zzg() {
        return zzd(4);
    }

    public final boolean zzh() {
        return zzd(1);
    }
}
