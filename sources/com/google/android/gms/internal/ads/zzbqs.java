package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqs extends zzbfq {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbqs(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
