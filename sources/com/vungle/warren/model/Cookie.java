package com.vungle.warren.model;

import com.vungle.warren.VungleLogger;
import cz.msebera.android.httpclient.cookie.SM;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Cookie {
    public static final String APP_ID = "appId";
    public static final String APP_SET_ID = "appSetId";
    public static final String APP_SET_ID_COOKIE = "appSetIdCookie";
    public static final String CACHE_BUST_COOKIE = "cacheBustSettings";
    public static final String CCPA_CONSENT_STATUS = "ccpa_status";
    public static final String CCPA_COOKIE = "ccpaIsImportantToVungle";
    public static final String CONFIG_COOKIE = "configSettings";
    public static final String CONFIG_EXTENSION = "config_extension";
    public static final String CONSENT_COOKIE = "consentIsImportantToVungle";
    public static final String CONSENT_STATUS_OPTED_IN = "opted_in";
    public static final String CONSENT_STATUS_OPTED_OUT = "opted_out";
    public static final String COPPA_COOKIE = "coppa_cookie";
    public static final String COPPA_DISABLE_AD_ID = "disable_ad_id";
    public static final String COPPA_KEY = "coppa";
    public static final String COPPA_STATUS_KEY = "is_coppa";
    public static final String INCENTIVIZED_TEXT_COOKIE = "incentivizedTextSetByPub";
    public static final String IS_PLAY_SERVICE_AVAILABLE = "isPlaySvcAvailable";
    public static final String LAST_CACHE_BUST = "last_cache_bust";
    public static final String USER_AGENT_ID_COOKIE = "userAgent";
    String identifier;
    Map<String, String> strings = new ConcurrentHashMap();
    Map<String, Boolean> booleans = new ConcurrentHashMap();
    Map<String, Integer> integers = new ConcurrentHashMap();
    Map<String, Long> longs = new ConcurrentHashMap();

    public Cookie(String str) {
        this.identifier = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void putValue(String str, T t) {
        if (t == 0) {
            VungleLogger.critical(true, SM.COOKIE, "putValue", String.format("Value for key \"%s\" should not be null", str));
            return;
        }
        if (t instanceof String) {
            this.strings.put(str, (String) t);
            return;
        }
        if (t instanceof Boolean) {
            this.booleans.put(str, (Boolean) t);
            return;
        }
        if (t instanceof Integer) {
            this.integers.put(str, (Integer) t);
        } else if (t instanceof Long) {
            this.longs.put(str, (Long) t);
        } else {
            VungleLogger.critical(true, SM.COOKIE, "putValue", "Value type is not supported!");
        }
    }

    public Integer getInt(String str) {
        return this.integers.get(str);
    }

    public String getString(String str) {
        return this.strings.get(str);
    }

    public Boolean getBoolean(String str) {
        return Boolean.valueOf(this.booleans.get(str) != null && this.booleans.get(str).booleanValue());
    }

    public Boolean getBooleanOrNull(String str) {
        return this.booleans.get(str);
    }

    public Long getLong(String str) {
        return Long.valueOf(this.longs.get(str) != null ? this.longs.get(str).longValue() : 0L);
    }

    public String getId() {
        return this.identifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        Map<String, String> map = this.strings;
        if (map == null ? cookie.strings != null : !map.equals(cookie.strings)) {
            return false;
        }
        Map<String, Boolean> map2 = this.booleans;
        if (map2 == null ? cookie.booleans != null : !map2.equals(cookie.booleans)) {
            return false;
        }
        Map<String, Integer> map3 = this.integers;
        if (map3 == null ? cookie.integers != null : !map3.equals(cookie.integers)) {
            return false;
        }
        Map<String, Long> map4 = this.longs;
        if (map4 == null ? cookie.longs != null : !map4.equals(cookie.longs)) {
            return false;
        }
        String str = this.identifier;
        String str2 = cookie.identifier;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Map<String, String> map = this.strings;
        int iHashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Boolean> map2 = this.booleans;
        int iHashCode2 = (iHashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Integer> map3 = this.integers;
        int iHashCode3 = (iHashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Long> map4 = this.longs;
        int iHashCode4 = (iHashCode3 + (map4 != null ? map4.hashCode() : 0)) * 31;
        String str = this.identifier;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
