package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzevl implements zzfnj {
    final /* synthetic */ zzevp zza;

    zzevl(zzevp zzevpVar) {
        this.zza = zzevpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbza.zzh("", (zzdvi) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzevp zzevpVar = this.zza;
        zzevpVar.zzd = new zzevo(null, zzevpVar.zze(), null);
        return this.zza.zzd;
    }
}
