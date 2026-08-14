package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbba {
    public static final void zza(zzbaz zzbazVar, zzbax zzbaxVar) {
        if (zzbaxVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbaxVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbazVar.zzd(zzbaxVar.zza(), zzbaxVar.zzb(), zzbaxVar.zzc(), zzbaxVar.zzd());
    }
}
