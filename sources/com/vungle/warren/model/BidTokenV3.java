package com.vungle.warren.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.token.Consent;
import com.vungle.warren.model.token.Device;
import com.vungle.warren.model.token.Request;

/* JADX INFO: loaded from: classes3.dex */
public class BidTokenV3 {

    @SerializedName("consent")
    @Expose
    private Consent consent;

    @SerializedName("device")
    @Expose
    private Device device;

    @SerializedName("request")
    @Expose
    private Request request;

    public BidTokenV3(Device device, Request request, Consent consent) {
        this.device = device;
        this.request = request;
        this.consent = consent;
    }

    public Request getRequest() {
        return this.request;
    }

    public Consent getConsent() {
        return this.consent;
    }

    public Device getDevice() {
        return this.device;
    }
}
