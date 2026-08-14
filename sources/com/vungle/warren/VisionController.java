package com.vungle.warren;

import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.VisionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.NetworkProvider;
import com.vungle.warren.vision.VisionConfig;

/* JADX INFO: loaded from: classes3.dex */
class VisionController {
    static final String ADVERTISER_DETAILS = "advertiser_details";
    static final String AGGREGATE = "aggregate";
    static final String CAMPAIGN_DETAILS = "campaign_details";
    static final String CREATIVE_DETAILS = "creative_details";
    static final String DATA_SCIENCE_CACHE = "data_science_cache";
    static final String FILTER_ID = "_id";
    static final String LAST_TIME_VIEWED = "last_time_viewed";
    static final String LAST_VIEWED_ADVERTISER_ID = "last_viewed_advertiser_id";
    static final String LAST_VIEWED_CAMPAIGN_ID = "last_viewed_campaign_id";
    static final String LAST_VIEWED_CREATIVE_ID = "last_viewed_creative_id";
    static final String TOTAL_VIEW_COUNT = "total_view_count";
    static final String VIEW_COUNT = "view_count";
    static final String VISION = "vision";
    static final String VISION_COOKIE = "visionCookie";
    static final String WINDOW = "window";
    private VisionConfig config = new VisionConfig();
    private final NetworkProvider networkProvider;
    private final Repository repository;

    VisionController(Repository repository, NetworkProvider networkProvider) {
        this.repository = repository;
        this.networkProvider = networkProvider;
    }

    private String getDataScienceCache() {
        Cookie cookie = (Cookie) this.repository.load(VISION_COOKIE, Cookie.class).get();
        if (cookie == null) {
            return null;
        }
        return cookie.getString(DATA_SCIENCE_CACHE);
    }

    void setDataScienceCache(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(VISION_COOKIE);
        if (str != null) {
            cookie.putValue(DATA_SCIENCE_CACHE, str);
        }
        this.repository.save(cookie);
    }

    void setConfig(VisionConfig visionConfig) throws DatabaseHelper.DBException {
        this.config = visionConfig;
        if (visionConfig.enabled) {
            this.repository.trimVisionData(visionConfig.viewLimit != null ? visionConfig.viewLimit.device : 0);
        }
    }

    void reportData(String str, String str2, String str3) throws DatabaseHelper.DBException {
        this.repository.save(new VisionData(System.currentTimeMillis(), str, str2, str3));
        this.repository.trimVisionData(this.config.viewLimit != null ? this.config.viewLimit.device : 0);
    }

    void clearData() throws DatabaseHelper.DBException {
        this.repository.trimVisionData(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.JsonObject getPayload() {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VisionController.getPayload():com.google.gson.JsonObject");
    }

    String getFilterName(String str) {
        str.hashCode();
        switch (str) {
            case "campaign_details":
                return "campaign";
            case "creative_details":
                return VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE;
            case "advertiser_details":
                return VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER;
            default:
                return null;
        }
    }

    VisionConfig getVisionConfig() {
        return this.config;
    }

    boolean isEnabled() {
        return this.config.enabled;
    }
}
