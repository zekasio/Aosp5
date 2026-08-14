package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqr extends zzbfk {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbqr(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zze(zzbfu zzbfuVar) {
        this.zza.onNativeAdLoaded(new zzbqk(zzbfuVar));
    }
}
