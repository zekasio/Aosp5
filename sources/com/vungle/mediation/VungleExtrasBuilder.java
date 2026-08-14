package com.vungle.mediation;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.warren.AdConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class VungleExtrasBuilder {
    static final String EXTRA_ALL_PLACEMENTS = "allPlacements";
    private static final String EXTRA_ORDINAL_VIEW_COUNT = "ordinalViewCount";
    private static final String EXTRA_ORIENTATION = "adOrientation";
    static final String EXTRA_PLAY_PLACEMENT = "playPlacement";
    private static final String EXTRA_START_MUTED = "startMuted";
    public static final String EXTRA_USER_ID = "userId";
    static final String UUID_KEY = "uniqueVungleRequestKey";
    private final Bundle mBundle;

    public VungleExtrasBuilder(String[] strArr) {
        Bundle bundle = new Bundle();
        this.mBundle = bundle;
        bundle.putStringArray(EXTRA_ALL_PLACEMENTS, strArr);
    }

    public VungleExtrasBuilder setPlayingPlacement(String str) {
        this.mBundle.putString(EXTRA_PLAY_PLACEMENT, str);
        return this;
    }

    @Deprecated
    public VungleExtrasBuilder setSoundEnabled(boolean z) {
        return setStartMuted(!z);
    }

    public VungleExtrasBuilder setStartMuted(boolean z) {
        this.mBundle.putBoolean(EXTRA_START_MUTED, z);
        return this;
    }

    public VungleExtrasBuilder setUserId(String str) {
        this.mBundle.putString(EXTRA_USER_ID, str);
        return this;
    }

    public VungleExtrasBuilder setOrdinalViewCount(int i) {
        this.mBundle.putInt(EXTRA_ORDINAL_VIEW_COUNT, i);
        return this;
    }

    public VungleExtrasBuilder setAdOrientation(int i) {
        this.mBundle.putInt(EXTRA_ORIENTATION, i);
        return this;
    }

    public VungleExtrasBuilder setBannerUniqueRequestID(String str) {
        this.mBundle.putString(UUID_KEY, str);
        return this;
    }

    public Bundle build() {
        if (TextUtils.isEmpty(this.mBundle.getString(UUID_KEY, null))) {
            this.mBundle.putString(UUID_KEY, UUID.randomUUID().toString());
        }
        return this.mBundle;
    }

    public static AdConfig adConfigWithNetworkExtras(Bundle bundle, boolean z) {
        AdConfig adConfig = new AdConfig();
        adConfig.setMuted(z);
        if (bundle != null) {
            adConfig.setMuted(bundle.getBoolean(EXTRA_START_MUTED, z));
            adConfig.setOrdinal(bundle.getInt(EXTRA_ORDINAL_VIEW_COUNT, 0));
            adConfig.setAdOrientation(bundle.getInt(EXTRA_ORIENTATION, 2));
        }
        return adConfig;
    }

    public static AdConfig adConfigWithNetworkExtras(Bundle bundle, NativeAdOptions nativeAdOptions, boolean z) {
        AdConfig adConfigAdConfigWithNetworkExtras = adConfigWithNetworkExtras(bundle, z);
        int i = 1;
        int adChoicesPlacement = nativeAdOptions != null ? nativeAdOptions.getAdChoicesPlacement() : 1;
        if (adChoicesPlacement == 0) {
            i = 0;
        } else if (adChoicesPlacement == 2) {
            i = 3;
        } else if (adChoicesPlacement == 3) {
            i = 2;
        }
        adConfigAdConfigWithNetworkExtras.setAdOptionsPosition(i);
        return adConfigAdConfigWithNetworkExtras;
    }
}
