package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzevm implements zzfnj {
    final /* synthetic */ zzevp zza;

    zzevm(zzevp zzevpVar) {
        this.zza = zzevpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbtn zzbtnVar = (zzbtn) obj;
        this.zza.zzd = new zzevo(zzbtnVar, new zzfav(zzbtnVar.zzj), null);
        return this.zza.zzd;
    }
}
