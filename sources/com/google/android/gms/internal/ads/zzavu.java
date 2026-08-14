package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavu extends zzbzs {
    final /* synthetic */ zzawa zza;

    zzavu(zzawa zzawaVar) {
        this.zza = zzawaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzs, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzawa.zze(this.zza);
        return super.cancel(z);
    }
}
