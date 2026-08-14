package com.google.ads.consent;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public final class AdProvider {

    @SerializedName("company_id")
    private String id;

    @SerializedName("company_name")
    private String name;

    @SerializedName("policy_url")
    private String privacyPolicyUrlString;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivacyPolicyUrlString() {
        return this.privacyPolicyUrlString;
    }

    public void setPrivacyPolicyUrlString(String privacyPolicyUrlString) {
        this.privacyPolicyUrlString = privacyPolicyUrlString;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return this.id.equals(((AdProvider) o).id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
