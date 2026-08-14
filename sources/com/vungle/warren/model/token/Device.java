package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;

/* JADX INFO: loaded from: classes3.dex */
public class Device {

    @SerializedName("amazon")
    @Expose
    private AndroidInfo amazon;

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    @SerializedName(TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE)
    @Expose
    private AndroidInfo f1963android;

    @SerializedName("battery_saver_enabled")
    @Expose
    private Boolean batterySaverEnabled;

    @SerializedName("extension")
    @Expose
    private Extension extension;

    @SerializedName(VungleApiClient.IFA)
    @Expose
    private String ifa;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("time_zone")
    @Expose
    private String timezone;

    @SerializedName("volume_level")
    @Expose
    private Double volumeLevel;

    public Device(Boolean bool, String str, String str2, Double d, String str3, AndroidInfo androidInfo, AndroidInfo androidInfo2, Extension extension) {
        this.batterySaverEnabled = bool;
        this.language = str;
        this.timezone = str2;
        this.volumeLevel = d;
        this.ifa = str3;
        this.amazon = androidInfo;
        this.f1963android = androidInfo2;
        this.extension = extension;
    }
}
