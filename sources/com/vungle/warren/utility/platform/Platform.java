package com.vungle.warren.utility.platform;

import androidx.core.util.Consumer;
import com.vungle.warren.model.AdvertisingInfo;

/* JADX INFO: loaded from: classes3.dex */
public interface Platform {
    public static final String MANUFACTURER_AMAZON = "Amazon";

    AdvertisingInfo getAdvertisingInfo();

    String getAndroidId();

    String getAppSetId();

    boolean getIsBatterySaverEnabled();

    boolean getIsSDCardPresent();

    boolean getIsSideloaded();

    boolean getIsSoundEnabled();

    String getUserAgent();

    void getUserAgentLazy(Consumer<String> consumer);

    double getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    void setAndroidIdFallbackDisabled(boolean z);
}
