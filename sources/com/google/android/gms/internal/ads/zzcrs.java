package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcrs implements zzfuf {
    final /* synthetic */ zzcrt zza;

    zzcrs(zzcrt zzcrtVar) {
        this.zza = zzcrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zza.zzf.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzf.zzh(true);
    }
}
