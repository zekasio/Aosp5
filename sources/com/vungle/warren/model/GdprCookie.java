package com.vungle.warren.model;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.TimeoutProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class GdprCookie {
    public static String CONSENT_MESSAGE_VERSION = "consent_message_version";
    public static String CONSENT_SOURCE = "consent_source";
    public static String CONSENT_STATUS = "consent_status";
    public static String NO_INTERACTION = "no_interaction";
    public static String TIMESTAMP = "timestamp";
    public static String UNKNOWN = "unknown";
    private final Cookie cookie;
    private final Repository repository;

    public GdprCookie(Repository repository, TimeoutProvider timeoutProvider) {
        this.repository = repository;
        Cookie cookie = (Cookie) repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        this.cookie = cookie == null ? createDefaultCookie() : cookie;
    }

    public String getConsentStatus() {
        Cookie cookie = this.cookie;
        return cookie != null ? cookie.getString(CONSENT_STATUS) : "unknown";
    }

    public String getSource() {
        Cookie cookie = this.cookie;
        return cookie != null ? cookie.getString(CONSENT_SOURCE) : NO_INTERACTION;
    }

    public Long getTimeStamp() {
        Cookie cookie = this.cookie;
        return Long.valueOf(cookie != null ? cookie.getLong(TIMESTAMP).longValue() : 0L);
    }

    public String getMessageVersion() {
        Cookie cookie = this.cookie;
        return cookie != null ? cookie.getString(CONSENT_MESSAGE_VERSION) : "";
    }

    private Cookie createDefaultCookie() {
        Cookie cookie = new Cookie(Cookie.CONSENT_COOKIE);
        cookie.putValue(CONSENT_MESSAGE_VERSION, "");
        cookie.putValue(CONSENT_STATUS, UNKNOWN);
        cookie.putValue(CONSENT_SOURCE, NO_INTERACTION);
        cookie.putValue(TIMESTAMP, 0L);
        return cookie;
    }

    public void save(JsonObject jsonObject) throws DatabaseHelper.DBException {
        boolean z = JsonUtil.hasNonNull(jsonObject, "is_country_data_protected") && jsonObject.get("is_country_data_protected").getAsBoolean();
        String asString = JsonUtil.hasNonNull(jsonObject, "consent_title") ? jsonObject.get("consent_title").getAsString() : "";
        String asString2 = JsonUtil.hasNonNull(jsonObject, "consent_message") ? jsonObject.get("consent_message").getAsString() : "";
        String asString3 = JsonUtil.hasNonNull(jsonObject, "consent_message_version") ? jsonObject.get("consent_message_version").getAsString() : "";
        String asString4 = JsonUtil.hasNonNull(jsonObject, "button_accept") ? jsonObject.get("button_accept").getAsString() : "";
        String asString5 = JsonUtil.hasNonNull(jsonObject, "button_deny") ? jsonObject.get("button_deny").getAsString() : "";
        this.cookie.putValue("is_country_data_protected", Boolean.valueOf(z));
        Cookie cookie = this.cookie;
        if (TextUtils.isEmpty(asString)) {
            asString = "Targeted Ads";
        }
        cookie.putValue("consent_title", asString);
        Cookie cookie2 = this.cookie;
        if (TextUtils.isEmpty(asString2)) {
            asString2 = "To receive more relevant ad content based on your interactions with our ads, click \"I Consent\" below. Either way, you will see the same amount of ads.";
        }
        cookie2.putValue("consent_message", asString2);
        if (!"publisher".equalsIgnoreCase(this.cookie.getString(CONSENT_SOURCE))) {
            this.cookie.putValue(CONSENT_MESSAGE_VERSION, TextUtils.isEmpty(asString3) ? "" : asString3);
        }
        Cookie cookie3 = this.cookie;
        if (TextUtils.isEmpty(asString4)) {
            asString4 = "I Consent";
        }
        cookie3.putValue("button_accept", asString4);
        Cookie cookie4 = this.cookie;
        if (TextUtils.isEmpty(asString5)) {
            asString5 = "I Do Not Consent";
        }
        cookie4.putValue("button_deny", asString5);
        this.repository.save(this.cookie);
    }
}
