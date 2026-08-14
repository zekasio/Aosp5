package com.google.ads.consent;

import com.google.gson.annotations.SerializedName;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.8";

    @SerializedName("consent_source")
    private String consentSource;

    @SerializedName("providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();

    @SerializedName("consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();

    @SerializedName("pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();

    @SerializedName("tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = false;

    @SerializedName("consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;

    @SerializedName("is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;

    @SerializedName("has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;

    @SerializedName(ClientCookie.VERSION_ATTR)
    private final String sdkVersionString = SDK_VERSION;

    @SerializedName("plat")
    private final String sdkPlatformString = "android";

    @SerializedName("raw_response")
    private String rawResponse = "";

    ConsentData() {
    }

    boolean isTaggedForUnderAgeOfConsent() {
        return this.underAgeOfConsent.booleanValue();
    }

    void tagForUnderAgeOfConsent(boolean underAgeOfConsent) {
        this.underAgeOfConsent = Boolean.valueOf(underAgeOfConsent);
    }

    HashSet<AdProvider> getAdProviders() {
        return this.adProviders;
    }

    void setAdProviders(HashSet<AdProvider> adProviders) {
        this.adProviders = adProviders;
    }

    ConsentStatus getConsentStatus() {
        return this.consentStatus;
    }

    void setConsentStatus(ConsentStatus consentStatus) {
        this.consentStatus = consentStatus;
    }

    HashSet<String> getPublisherIds() {
        return this.publisherIds;
    }

    void setPublisherIds(HashSet<String> publisherIds) {
        this.publisherIds = publisherIds;
    }

    boolean isRequestLocationInEeaOrUnknown() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    void setRequestLocationInEeaOrUnknown(boolean eeaRequestLocationOrUnknown) {
        this.isRequestLocationInEeaOrUnknown = eeaRequestLocationOrUnknown;
    }

    HashSet<AdProvider> getConsentedAdProviders() {
        return this.consentedAdProviders;
    }

    void setConsentedAdProviders(HashSet<AdProvider> consentedAdProviders) {
        this.consentedAdProviders = consentedAdProviders;
    }

    boolean hasNonPersonalizedPublisherId() {
        return this.hasNonPersonalizedPublisherId;
    }

    void setHasNonPersonalizedPublisherId(boolean hasNonPersonalizedPublisherId) {
        this.hasNonPersonalizedPublisherId = hasNonPersonalizedPublisherId;
    }

    public String getSDKVersionString() {
        return this.sdkVersionString;
    }

    public String getSDKPlatformString() {
        return this.sdkPlatformString;
    }

    public String getConsentSource() {
        return this.consentSource;
    }

    public void setConsentSource(String consentSource) {
        this.consentSource = consentSource;
    }

    String getRawResponse() {
        return this.rawResponse;
    }

    void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }
}
