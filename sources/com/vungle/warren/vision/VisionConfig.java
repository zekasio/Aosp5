package com.vungle.warren.vision;

import com.google.gson.annotations.SerializedName;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes3.dex */
public class VisionConfig {

    @SerializedName("aggregation_filters")
    public String[] aggregationFilters;

    @SerializedName("aggregation_time_windows")
    public int[] aggregationTimeWindows;

    @SerializedName("enabled")
    public boolean enabled;

    @SerializedName("view_limit")
    public Limits viewLimit;

    public static class Limits {

        @SerializedName("device")
        public int device;

        @SerializedName(TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE)
        public int mobile;

        @SerializedName(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI)
        public int wifi;
    }
}
