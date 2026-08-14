package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzbu extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbu(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbu zza(String str, Throwable th) {
        return new zzbu(str, th, true, 1);
    }

    public static zzbu zzb(String str, Throwable th) {
        return new zzbu(str, th, true, 0);
    }

    public static zzbu zzc(String str) {
        return new zzbu(str, null, false, 1);
    }
}
