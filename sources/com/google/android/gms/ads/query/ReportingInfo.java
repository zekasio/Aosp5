package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ReportingInfo {
    private final zzbrz zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static final class Builder {
        private final zzbry zza;

        public Builder(View view) {
            zzbry zzbryVar = new zzbry();
            this.zza = zzbryVar;
            zzbryVar.zzb(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbrz(builder.zza);
    }

    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
