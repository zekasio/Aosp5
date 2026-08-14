package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfwx {

    @Nullable
    private final Object zza;

    @Nullable
    private final Object zzb;
    private final byte[] zzc;
    private final zzgme zzd;
    private final int zze;
    private final String zzf;
    private final zzfvx zzg;
    private final int zzh;

    zzfwx(@Nullable Object obj, @Nullable Object obj2, byte[] bArr, int i, zzgme zzgmeVar, int i2, String str, zzfvx zzfvxVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzgmeVar;
        this.zze = i2;
        this.zzf = str;
        this.zzg = zzfvxVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfvx zzb() {
        return this.zzg;
    }

    public final zzgme zzc() {
        return this.zzd;
    }

    @Nullable
    public final Object zzd() {
        return this.zza;
    }

    @Nullable
    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
