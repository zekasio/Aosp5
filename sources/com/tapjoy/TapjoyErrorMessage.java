package com.tapjoy;

import com.tapjoy.internal.w1;

/* JADX INFO: loaded from: classes2.dex */
public class TapjoyErrorMessage {
    public static final String ASSET_ERROR = "asset error";
    public static final String NETWORK_ERROR = "network error";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ErrorType f1727a;
    public String b;

    public enum ErrorType {
        INTERNAL_ERROR,
        SDK_ERROR,
        SERVER_ERROR,
        INTEGRATION_ERROR,
        NETWORK_ERROR
    }

    public TapjoyErrorMessage(ErrorType errorType, String str) {
        this.f1727a = errorType;
        this.b = str;
    }

    public ErrorType getType() {
        return this.f1727a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbA = w1.a("Type=");
        sbA.append(this.f1727a.toString());
        sb.append(sbA.toString());
        sb.append(";Message=" + this.b);
        return sb.toString();
    }
}
