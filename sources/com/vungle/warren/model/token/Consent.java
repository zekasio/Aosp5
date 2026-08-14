package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.Cookie;

/* JADX INFO: loaded from: classes3.dex */
public class Consent {

    @SerializedName("ccpa")
    @Expose
    private Ccpa ccpa;

    @SerializedName(Cookie.COPPA_KEY)
    @Expose
    private Coppa coppa;

    @SerializedName("gdpr")
    @Expose
    private Gdpr gdpr;

    public Ccpa getCcpa() {
        return this.ccpa;
    }

    public Gdpr getGdpr() {
        return this.gdpr;
    }

    public Coppa getCoppa() {
        return this.coppa;
    }

    public Consent(Ccpa ccpa, Gdpr gdpr, Coppa coppa) {
        this.ccpa = ccpa;
        this.gdpr = gdpr;
        this.coppa = coppa;
    }
}
