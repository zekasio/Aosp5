package com.vungle.mediation;

import com.vungle.warren.VungleSettings;

/* JADX INFO: loaded from: classes2.dex */
public class VungleNetworkSettings {
    private static final long MEGABYTE = 1048576;
    private static boolean androidIdOptedOut = false;
    private static long minimumSpaceForAd = 53477376;
    private static long minimumSpaceForInit = 52428800;
    private static VungleSettings vungleSettings;
    private static VungleSettingsChangedListener vungleSettingsChangedListener;

    public interface VungleSettingsChangedListener {
        void onVungleSettingsChanged(VungleSettings vungleSettings);
    }

    public static void setMinSpaceForInit(long j) {
        minimumSpaceForInit = j;
        applySettings();
    }

    public static void setMinSpaceForAdLoad(long j) {
        minimumSpaceForAd = j;
        applySettings();
    }

    public static void setAndroidIdOptOut(boolean z) {
        androidIdOptedOut = z;
        applySettings();
    }

    private static void applySettings() {
        VungleSettings vungleSettingsBuild = new VungleSettings.Builder().setMinimumSpaceForInit(minimumSpaceForInit).setMinimumSpaceForAd(minimumSpaceForAd).setAndroidIdOptOut(androidIdOptedOut).disableBannerRefresh().build();
        vungleSettings = vungleSettingsBuild;
        VungleSettingsChangedListener vungleSettingsChangedListener2 = vungleSettingsChangedListener;
        if (vungleSettingsChangedListener2 != null) {
            vungleSettingsChangedListener2.onVungleSettingsChanged(vungleSettingsBuild);
        }
    }

    public static VungleSettings getVungleSettings() {
        if (vungleSettings == null) {
            vungleSettings = new VungleSettings.Builder().disableBannerRefresh().build();
        }
        return vungleSettings;
    }

    public static void setVungleSettingsChangedListener(VungleSettingsChangedListener vungleSettingsChangedListener2) {
        vungleSettingsChangedListener = vungleSettingsChangedListener2;
    }
}
