package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface NativeCustomTemplateAd {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface DisplayOpenMeasurement {
        void setView(View view);

        boolean start();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomTemplateId();

    DisplayOpenMeasurement getDisplayOpenMeasurement();

    NativeAd.Image getImage(String str);

    CharSequence getText(String str);

    VideoController getVideoController();

    MediaView getVideoMediaView();

    void performClick(String str);

    void recordImpression();
}
