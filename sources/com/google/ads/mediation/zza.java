package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends UnifiedNativeAdMapper {
    private final UnifiedNativeAd zza;

    public zza(UnifiedNativeAd unifiedNativeAd) {
        this.zza = unifiedNativeAd;
        setHeadline(unifiedNativeAd.getHeadline());
        setImages(unifiedNativeAd.getImages());
        setBody(unifiedNativeAd.getBody());
        setIcon(unifiedNativeAd.getIcon());
        setCallToAction(unifiedNativeAd.getCallToAction());
        setAdvertiser(unifiedNativeAd.getAdvertiser());
        setStarRating(unifiedNativeAd.getStarRating());
        setStore(unifiedNativeAd.getStore());
        setPrice(unifiedNativeAd.getPrice());
        zzd(unifiedNativeAd.zza());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(unifiedNativeAd.getVideoController());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof zzg) {
            throw null;
        }
        if (((com.google.android.gms.ads.formats.zze) com.google.android.gms.ads.formats.zze.zza.get(view)) != null) {
            throw null;
        }
    }
}
