package com.applovin.impl.sdk.ad;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);

    private final int g;

    public int a() {
        return this.g;
    }

    b(int i) {
        this.g = i;
    }

    public static b a(int i) {
        if (i == 1) {
            return APPLOVIN_PRIMARY_ZONE;
        }
        if (i == 2) {
            return APPLOVIN_CUSTOM_ZONE;
        }
        if (i == 3) {
            return APPLOVIN_MULTIZONE;
        }
        if (i == 4) {
            return REGULAR_AD_TOKEN;
        }
        if (i == 5) {
            return DECODED_AD_TOKEN_JSON;
        }
        return UNKNOWN;
    }
}
